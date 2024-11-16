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
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-7), 0, (-1), 4, (-1), (-5), (-1) };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag11 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag12 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList8);
        maxBag20.clear();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList18);
        maxBag30.remove((java.lang.Integer) 9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 3, 7, (-8), 8, (-4), (-1), 3, 1, 100, (-10), (-5), 7, 10, 1, 1, 1, 1, 100, 10, (-6), (-2), (-100), 3, (-5), 8, (-100), (-6), (-1) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList29);
        maxBag38.add((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass41 = maxBag38.getClass();
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag39 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag40 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag41 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag42 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag43 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag44 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag45 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag46 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag47 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag48 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag49 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag50 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag51 = new examples.MaxBag(intList27);
        maxBag51.remove((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        maxBag29.clear();
        maxBag29.remove((java.lang.Integer) 0);
        maxBag29.remove((java.lang.Integer) 0);
        maxBag29.clear();
        maxBag29.clear();
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.remove((java.lang.Integer) 1);
        maxBag21.clear();
        maxBag21.remove((java.lang.Integer) 9);
        maxBag21.remove((java.lang.Integer) 8);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 0, (-5), 3, (-2), (-1), (-2), 5, 0, 10, 2 };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList12);
        java.lang.Class<?> wildcardClass15 = maxBag14.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 100);
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.add((java.lang.Integer) 8);
        maxBag0.add((java.lang.Integer) (-7));
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag39 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag40 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag41 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag42 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag43 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag44 = new examples.MaxBag(intList18);
        maxBag44.add((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        maxBag20.add((java.lang.Integer) 100);
        maxBag20.clear();
        maxBag20.remove((java.lang.Integer) 5);
        maxBag20.add((java.lang.Integer) (-9));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.remove((java.lang.Integer) (-4));
        maxBag0.add((java.lang.Integer) (-9));
        maxBag0.add((java.lang.Integer) 2);
        java.lang.Class<?> wildcardClass12 = maxBag0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        maxBag28.remove((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 5, 3, (-5), (-8), 0, (-5), (-5), (-3), 4, 6, (-1), 10, (-1), 10, 8, 7, 1, (-3), (-100), 0, 10, 5, 0, 100, 2, (-10), (-2), (-5) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList29);
        maxBag37.clear();
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.remove((java.lang.Integer) 5);
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.add((java.lang.Integer) (-1));
        maxBag0.remove((java.lang.Integer) (-6));
        maxBag0.add((java.lang.Integer) 2);
        maxBag0.add((java.lang.Integer) (-8));
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        maxBag22.clear();
        maxBag22.remove((java.lang.Integer) 8);
        maxBag22.clear();
        maxBag22.clear();
        maxBag22.add((java.lang.Integer) (-2));
        java.lang.Class<?> wildcardClass30 = maxBag22.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        maxBag22.add((java.lang.Integer) (-8));
        maxBag22.add((java.lang.Integer) 1);
        maxBag22.remove((java.lang.Integer) (-7));
        maxBag22.clear();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList11);
        maxBag25.remove((java.lang.Integer) 1);
        maxBag25.remove((java.lang.Integer) 100);
        maxBag25.remove((java.lang.Integer) 5);
        maxBag25.add((java.lang.Integer) 8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.clear();
        maxBag21.clear();
        maxBag21.add((java.lang.Integer) 0);
        maxBag21.remove((java.lang.Integer) (-7));
        maxBag21.clear();
        maxBag21.remove((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 3, 7, (-8), 8, (-4), (-1), 3, 1, 100, (-10), (-5), 7, 10, 1, 1, 1, 1, 100, 10, (-6), (-2), (-100), 3, (-5), 8, (-100), (-6), (-1) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag39 = new examples.MaxBag(intList29);
        maxBag39.remove((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.remove((java.lang.Integer) (-4));
        maxBag0.add((java.lang.Integer) (-9));
        maxBag0.add((java.lang.Integer) 2);
        maxBag0.remove((java.lang.Integer) 7);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        java.lang.Class<?> wildcardClass4 = maxBag0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, (-10), 100, 0, 0, (-2) };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        examples.MaxBag maxBag9 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag11 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag12 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList7);
        maxBag14.remove((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.add((java.lang.Integer) 100);
        maxBag0.remove((java.lang.Integer) (-4));
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-6), 5, 100, (-10), 100, (-8), 5, (-5), 2, 8, 3, 6, 5, (-8), 0, (-2), (-7) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList18);
        maxBag30.add((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        maxBag31.add((java.lang.Integer) 4);
        maxBag31.remove((java.lang.Integer) 3);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList18);
        maxBag32.clear();
        maxBag32.remove((java.lang.Integer) (-1));
        maxBag32.clear();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, (-8), 10, (-7), 8, (-5), 4, 9, (-8), 0, (-100), (-7), (-2) };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList14);
        java.lang.Class<?> wildcardClass26 = maxBag25.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.remove((java.lang.Integer) 1);
        maxBag21.clear();
        maxBag21.add((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-8), 100, 10, (-8) };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.MaxBag maxBag7 = new examples.MaxBag(intList5);
        java.lang.Class<?> wildcardClass8 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-2), 10, (-5), 4, (-6), 4, (-100), 7, 4, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        maxBag18.add((java.lang.Integer) 2);
        java.lang.Class<?> wildcardClass21 = maxBag18.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { (-8), 10, 4, 1, 8, 0, 1, 5, 3, 3, (-3) };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList12);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList12);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList12);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList12);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList12);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList12);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList12);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList12);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList12);
        java.lang.Class<?> wildcardClass23 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        maxBag33.remove((java.lang.Integer) 0);
        maxBag33.remove((java.lang.Integer) (-6));
        maxBag33.clear();
        maxBag33.remove((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        maxBag22.add((java.lang.Integer) (-8));
        maxBag22.add((java.lang.Integer) 4);
        maxBag22.clear();
        maxBag22.clear();
        maxBag22.remove((java.lang.Integer) 2);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-1), (-100), 100, 100, 100, (-3), 7, 2, 0, (-7), 6, (-5), (-10), (-100), (-10), (-4), 10, (-6), 8, 2, 9, (-1), 10 };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList24);
        maxBag37.add((java.lang.Integer) 7);
        maxBag37.add((java.lang.Integer) (-8));
        maxBag37.add((java.lang.Integer) (-10));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.remove((java.lang.Integer) 5);
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.add((java.lang.Integer) (-1));
        maxBag0.remove((java.lang.Integer) (-6));
        maxBag0.add((java.lang.Integer) (-100));
        maxBag0.add((java.lang.Integer) 8);
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-1));
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList11);
        maxBag28.remove((java.lang.Integer) (-7));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag39 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag40 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag41 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag42 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag43 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag44 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag45 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag46 = new examples.MaxBag(intList27);
        maxBag46.remove((java.lang.Integer) (-2));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { (-5), (-5), (-9), 100, 10, (-4), (-5), 0, (-6), (-6), 2, (-5), 1, 9, (-8), 100, 8, 100, (-8), 10, (-9), (-4), 2, (-100), 100 };
        java.util.ArrayList<java.lang.Integer> intList26 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList26);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList26);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList26);
        maxBag31.remove((java.lang.Integer) 7);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4, 100, 0, (-5), 5, (-8), (-2) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        maxBag23.add((java.lang.Integer) 8);
        maxBag23.add((java.lang.Integer) (-4));
        maxBag23.remove((java.lang.Integer) (-3));
        maxBag23.remove((java.lang.Integer) 6);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        maxBag32.remove((java.lang.Integer) 3);
        maxBag32.add((java.lang.Integer) (-10));
        maxBag32.add((java.lang.Integer) 7);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag39 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag40 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag41 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag42 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag43 = new examples.MaxBag(intList27);
        maxBag43.remove((java.lang.Integer) (-10));
        maxBag43.add((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList27);
        maxBag37.remove((java.lang.Integer) 4);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, (-10), 100, 0, 0, (-2) };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        examples.MaxBag maxBag9 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag11 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag12 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList7);
        java.lang.Class<?> wildcardClass18 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4, 100, 0, (-5), 5, (-8), (-2) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList18);
        maxBag29.add((java.lang.Integer) 0);
        maxBag29.clear();
        maxBag29.remove((java.lang.Integer) 7);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-6), 5, 100, (-10), 100, (-8), 5, (-5), 2, 8, 3, 6, 5, (-8), 0, (-2), (-7) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        maxBag28.remove((java.lang.Integer) (-5));
        maxBag28.remove((java.lang.Integer) 0);
        maxBag28.clear();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-1), (-100), 100, 100, 100, (-3), 7, 2, 0, (-7), 6, (-5), (-10), (-100), (-10), (-4), 10, (-6), 8, 2, 9, (-1), 10 };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag39 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag40 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag41 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag42 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag43 = new examples.MaxBag(intList24);
        java.lang.Class<?> wildcardClass44 = intList24.getClass();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        maxBag25.add((java.lang.Integer) 100);
        maxBag25.clear();
        maxBag25.remove((java.lang.Integer) 8);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.clear();
        maxBag21.add((java.lang.Integer) (-1));
        maxBag21.clear();
        maxBag21.add((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass28 = maxBag21.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag39 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag40 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag41 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag42 = new examples.MaxBag(intList18);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        maxBag13.clear();
        maxBag13.add((java.lang.Integer) 0);
        maxBag13.remove((java.lang.Integer) 0);
        maxBag13.clear();
        maxBag13.remove((java.lang.Integer) 8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        maxBag24.add((java.lang.Integer) 7);
        maxBag24.clear();
        maxBag24.clear();
        java.lang.Class<?> wildcardClass29 = maxBag24.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList18);
        maxBag29.add((java.lang.Integer) 1);
        maxBag29.add((java.lang.Integer) 100);
        maxBag29.remove((java.lang.Integer) 1);
        maxBag29.add((java.lang.Integer) 9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.add((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 5, 3, (-5), (-8), 0, (-5), (-5), (-3), 4, 6, (-1), 10, (-1), 10, 8, 7, 1, (-3), (-100), 0, 10, 5, 0, 100, 2, (-10), (-2), (-5) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList29);
        maxBag35.remove((java.lang.Integer) (-8));
        maxBag35.add((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass40 = maxBag35.getClass();
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.add((java.lang.Integer) (-1));
        maxBag0.remove((java.lang.Integer) (-100));
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 2);
        maxBag0.remove((java.lang.Integer) 1);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, (-10), 100, 0, 0, (-2) };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        examples.MaxBag maxBag9 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag11 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag12 = new examples.MaxBag(intList7);
        maxBag12.clear();
        maxBag12.clear();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 5, 3, (-5), (-8), 0, (-5), (-5), (-3), 4, 6, (-1), 10, (-1), 10, 8, 7, 1, (-3), (-100), 0, 10, 5, 0, 100, 2, (-10), (-2), (-5) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList29);
        maxBag31.add((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.clear();
        maxBag21.clear();
        maxBag21.add((java.lang.Integer) 0);
        maxBag21.remove((java.lang.Integer) (-7));
        maxBag21.add((java.lang.Integer) 0);
        maxBag21.add((java.lang.Integer) 6);
        maxBag21.add((java.lang.Integer) (-4));
        maxBag21.add((java.lang.Integer) (-2));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-2), 10, (-5), 4, (-6), 4, (-100), 7, 4, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        maxBag14.add((java.lang.Integer) 9);
        maxBag14.add((java.lang.Integer) 4);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-6), (-3), 10, (-3), 5, (-4), 7, 10, 3, 10, (-100), 1, (-7), (-6), 100, 1, 7, (-7), (-1), 10, 10, (-3), (-8), (-2), 3, 10 };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList27);
        maxBag34.add((java.lang.Integer) (-9));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-7), 0, (-1), 4, (-1), (-5), (-1) };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag11 = new examples.MaxBag(intList8);
        maxBag11.add((java.lang.Integer) (-1));
        maxBag11.clear();
        maxBag11.clear();
        maxBag11.remove((java.lang.Integer) (-4));
        maxBag11.add((java.lang.Integer) (-10));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-7), 0, (-1), 4, (-1), (-5), (-1) };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag11 = new examples.MaxBag(intList8);
        maxBag11.remove((java.lang.Integer) 4);
        maxBag11.clear();
        maxBag11.remove((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        maxBag22.clear();
        maxBag22.remove((java.lang.Integer) 8);
        maxBag22.add((java.lang.Integer) (-2));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        maxBag20.remove((java.lang.Integer) 8);
        maxBag20.remove((java.lang.Integer) (-7));
        maxBag20.add((java.lang.Integer) 1);
        maxBag20.add((java.lang.Integer) (-4));
        maxBag20.remove((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4, 100, 0, (-5), 5, (-8), (-2) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.clear();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-7), 0, (-1), 4, (-1), (-5), (-1) };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag11 = new examples.MaxBag(intList8);
        maxBag11.remove((java.lang.Integer) 3);
        maxBag11.clear();
        maxBag11.clear();
        maxBag11.remove((java.lang.Integer) (-8));
        maxBag11.remove((java.lang.Integer) (-2));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList11);
        maxBag25.remove((java.lang.Integer) 4);
        maxBag25.remove((java.lang.Integer) (-3));
        maxBag25.add((java.lang.Integer) 100);
        maxBag25.clear();
        maxBag25.clear();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList18);
        maxBag35.add((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        maxBag22.add((java.lang.Integer) (-8));
        maxBag22.add((java.lang.Integer) 4);
        maxBag22.clear();
        maxBag22.remove((java.lang.Integer) 7);
        maxBag22.add((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass32 = maxBag22.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 0, (-10), (-4), 10, 10, 0, 4, 4, 9 };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        examples.MaxBag maxBag12 = new examples.MaxBag(intList10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList10);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList10);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList10);
        maxBag15.clear();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-2), 10, (-5), 4, (-6), 4, (-100), 7, 4, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        maxBag14.add((java.lang.Integer) 9);
        maxBag14.add((java.lang.Integer) (-2));
        maxBag14.add((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 0, (-10), (-4), 10, 10, 0, 4, 4, 9 };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        examples.MaxBag maxBag12 = new examples.MaxBag(intList10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList10);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList10);
        java.lang.Class<?> wildcardClass15 = maxBag14.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, (-8), 10, (-7), 8, (-5), 4, 9, (-8), 0, (-100), (-7), (-2) };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList14);
        java.lang.Class<?> wildcardClass21 = maxBag20.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-1), (-100), 100, 100, 100, (-3), 7, 2, 0, (-7), 6, (-5), (-10), (-100), (-10), (-4), 10, (-6), 8, 2, 9, (-1), 10 };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList24);
        maxBag26.add((java.lang.Integer) (-5));
        maxBag26.remove((java.lang.Integer) (-2));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList18);
        java.lang.Class<?> wildcardClass34 = intList18.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        maxBag18.remove((java.lang.Integer) 8);
        maxBag18.clear();
        maxBag18.clear();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 10);
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 7);
        maxBag0.add((java.lang.Integer) 10);
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 0);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.remove((java.lang.Integer) 3);
        maxBag21.remove((java.lang.Integer) 8);
        maxBag21.clear();
        maxBag21.remove((java.lang.Integer) (-2));
        maxBag21.add((java.lang.Integer) 5);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4, 100, 0, (-5), 5, (-8), (-2) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        maxBag20.clear();
        maxBag20.clear();
        maxBag20.add((java.lang.Integer) 1);
        maxBag20.add((java.lang.Integer) 6);
        maxBag20.add((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        maxBag33.remove((java.lang.Integer) 0);
        maxBag33.add((java.lang.Integer) (-100));
        maxBag33.remove((java.lang.Integer) (-5));
        maxBag33.remove((java.lang.Integer) 1);
        maxBag33.clear();
        java.lang.Class<?> wildcardClass43 = maxBag33.getClass();
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-7), 0, (-1), 4, (-1), (-5), (-1) };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag11 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag12 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList8);
        maxBag18.remove((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        maxBag20.remove((java.lang.Integer) 8);
        maxBag20.add((java.lang.Integer) 4);
        maxBag20.remove((java.lang.Integer) 1);
        maxBag20.remove((java.lang.Integer) (-2));
        java.lang.Class<?> wildcardClass29 = maxBag20.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        maxBag25.add((java.lang.Integer) 100);
        maxBag25.remove((java.lang.Integer) (-1));
        maxBag25.add((java.lang.Integer) (-100));
        maxBag25.clear();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        maxBag16.add((java.lang.Integer) 9);
        maxBag16.add((java.lang.Integer) 2);
        maxBag16.clear();
        maxBag16.remove((java.lang.Integer) (-10));
        maxBag16.add((java.lang.Integer) 4);
        maxBag16.remove((java.lang.Integer) (-10));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-2), 10, (-5), 4, (-6), 4, (-100), 7, 4, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        maxBag13.add((java.lang.Integer) 5);
        maxBag13.remove((java.lang.Integer) (-10));
        maxBag13.add((java.lang.Integer) 5);
        maxBag13.clear();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList11);
        maxBag19.clear();
        maxBag19.remove((java.lang.Integer) 100);
        maxBag19.remove((java.lang.Integer) (-10));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4, 100, 0, (-5), 5, (-8), (-2) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.remove((java.lang.Integer) 8);
        maxBag21.add((java.lang.Integer) 7);
        maxBag21.remove((java.lang.Integer) (-100));
        maxBag21.clear();
        java.lang.Class<?> wildcardClass29 = maxBag21.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.add((java.lang.Integer) 100);
        maxBag0.add((java.lang.Integer) 2);
        maxBag0.remove((java.lang.Integer) 5);
        maxBag0.remove((java.lang.Integer) (-7));
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 100);
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-9));
        maxBag0.add((java.lang.Integer) (-100));
        maxBag0.remove((java.lang.Integer) (-1));
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList18);
        maxBag30.clear();
        maxBag30.clear();
        maxBag30.remove((java.lang.Integer) 100);
        maxBag30.remove((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 5);
        maxBag0.add((java.lang.Integer) 100);
        maxBag0.remove((java.lang.Integer) (-10));
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 8, 100, (-100), 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.MaxBag maxBag7 = new examples.MaxBag(intList5);
        maxBag7.add((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag39 = new examples.MaxBag(intList27);
        maxBag39.clear();
        maxBag39.add((java.lang.Integer) 7);
        java.lang.Class<?> wildcardClass43 = maxBag39.getClass();
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList11);
        maxBag19.add((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag39 = new examples.MaxBag(intList27);
        maxBag39.clear();
        maxBag39.add((java.lang.Integer) 7);
        maxBag39.add((java.lang.Integer) 5);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        maxBag32.remove((java.lang.Integer) 3);
        maxBag32.remove((java.lang.Integer) 1);
        maxBag32.remove((java.lang.Integer) 1);
        maxBag32.remove((java.lang.Integer) 10);
        maxBag32.add((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass43 = maxBag32.getClass();
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        maxBag24.remove((java.lang.Integer) 8);
        maxBag24.add((java.lang.Integer) 10);
        maxBag24.remove((java.lang.Integer) 100);
        maxBag24.add((java.lang.Integer) (-10));
        maxBag24.remove((java.lang.Integer) (-10));
        maxBag24.clear();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.remove((java.lang.Integer) 5);
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.add((java.lang.Integer) (-1));
        maxBag0.remove((java.lang.Integer) (-6));
        maxBag0.add((java.lang.Integer) 2);
        maxBag0.remove((java.lang.Integer) (-2));
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        maxBag30.remove((java.lang.Integer) 0);
        maxBag30.clear();
        maxBag30.add((java.lang.Integer) (-9));
        maxBag30.remove((java.lang.Integer) 1);
        maxBag30.remove((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass40 = maxBag30.getClass();
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 100);
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.add((java.lang.Integer) 8);
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 2);
        maxBag0.add((java.lang.Integer) 10);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        maxBag20.remove((java.lang.Integer) 8);
        maxBag20.add((java.lang.Integer) (-10));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 5, 3, (-5), (-8), 0, (-5), (-5), (-3), 4, 6, (-1), 10, (-1), 10, 8, 7, 1, (-3), (-100), 0, 10, 5, 0, 100, 2, (-10), (-2), (-5) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList29);
        maxBag35.add((java.lang.Integer) (-5));
        maxBag35.remove((java.lang.Integer) (-1));
        maxBag35.add((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        maxBag29.clear();
        maxBag29.clear();
        maxBag29.remove((java.lang.Integer) 2);
        maxBag29.remove((java.lang.Integer) 1);
        maxBag29.clear();
        maxBag29.clear();
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList11);
        maxBag25.remove((java.lang.Integer) (-10));
        maxBag25.clear();
        java.lang.Class<?> wildcardClass29 = maxBag25.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        maxBag24.clear();
        maxBag24.add((java.lang.Integer) 0);
        maxBag24.clear();
        maxBag24.add((java.lang.Integer) 3);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-8), 100, 10, (-8) };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.MaxBag maxBag7 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag8 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag9 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag11 = new examples.MaxBag(intList5);
        maxBag11.add((java.lang.Integer) 1);
        maxBag11.add((java.lang.Integer) (-10));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        maxBag22.add((java.lang.Integer) (-3));
        java.lang.Class<?> wildcardClass25 = maxBag22.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        maxBag25.remove((java.lang.Integer) 0);
        maxBag25.remove((java.lang.Integer) (-3));
        maxBag25.add((java.lang.Integer) (-10));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-1), (-100), 100, 100, 100, (-3), 7, 2, 0, (-7), 6, (-5), (-10), (-100), (-10), (-4), 10, (-6), 8, 2, 9, (-1), 10 };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList24);
        maxBag33.add((java.lang.Integer) 3);
        maxBag33.remove((java.lang.Integer) (-8));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 100);
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-9));
        maxBag0.add((java.lang.Integer) 100);
        maxBag0.add((java.lang.Integer) (-4));
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 6, (-6), 6, 5, 10, 3, 2, (-9), (-6), (-6), (-4), (-9), 8, 0, 1, (-5), (-100), 100, 4, 10, 10, (-9), 10, 0, 5, 2, 8 };
        java.util.ArrayList<java.lang.Integer> intList28 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList28);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList28);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList28);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList28);
        maxBag33.remove((java.lang.Integer) 3);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4, 100, 0, (-5), 5, (-8), (-2) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        maxBag24.remove((java.lang.Integer) (-10));
        maxBag24.remove((java.lang.Integer) 7);
        maxBag24.add((java.lang.Integer) 10);
        maxBag24.clear();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList18);
        maxBag38.add((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        maxBag14.remove((java.lang.Integer) 100);
        maxBag14.add((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass19 = maxBag14.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        maxBag33.remove((java.lang.Integer) 0);
        maxBag33.add((java.lang.Integer) 3);
        maxBag33.add((java.lang.Integer) (-9));
        maxBag33.remove((java.lang.Integer) 100);
        maxBag33.remove((java.lang.Integer) (-2));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.add((java.lang.Integer) (-1));
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-1), (-100), 100, 100, 100, (-3), 7, 2, 0, (-7), 6, (-5), (-10), (-100), (-10), (-4), 10, (-6), 8, 2, 9, (-1), 10 };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag39 = new examples.MaxBag(intList24);
        maxBag39.add((java.lang.Integer) (-2));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        maxBag33.remove((java.lang.Integer) (-4));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        maxBag24.remove((java.lang.Integer) 8);
        maxBag24.add((java.lang.Integer) 10);
        maxBag24.remove((java.lang.Integer) 100);
        maxBag24.remove((java.lang.Integer) 3);
        maxBag24.remove((java.lang.Integer) (-6));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-2), 10, (-5), 4, (-6), 4, (-100), 7, 4, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList11);
        java.lang.Class<?> wildcardClass28 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-6), 5, 100, (-10), 100, (-8), 5, (-5), 2, 8, 3, 6, 5, (-8), 0, (-2), (-7) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        java.lang.Class<?> wildcardClass24 = intList18.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-2), 10, (-5), 4, (-6), 4, (-100), 7, 4, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        maxBag13.clear();
        maxBag13.add((java.lang.Integer) 4);
        maxBag13.add((java.lang.Integer) 8);
        maxBag13.remove((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.add((java.lang.Integer) (-10));
        maxBag21.remove((java.lang.Integer) 1);
        maxBag21.clear();
        maxBag21.add((java.lang.Integer) 6);
        maxBag21.add((java.lang.Integer) 0);
        maxBag21.remove((java.lang.Integer) 8);
        maxBag21.add((java.lang.Integer) (-6));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-1), (-100), 100, 100, 100, (-3), 7, 2, 0, (-7), 6, (-5), (-10), (-100), (-10), (-4), 10, (-6), 8, 2, 9, (-1), 10 };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList24);
        maxBag26.add((java.lang.Integer) (-5));
        maxBag26.remove((java.lang.Integer) (-10));
        maxBag26.add((java.lang.Integer) 7);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-6), 5, 100, (-10), 100, (-8), 5, (-5), 2, 8, 3, 6, 5, (-8), 0, (-2), (-7) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        maxBag23.add((java.lang.Integer) 4);
        maxBag23.clear();
        maxBag23.remove((java.lang.Integer) 1);
        maxBag23.add((java.lang.Integer) 7);
        maxBag23.add((java.lang.Integer) (-6));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        maxBag25.remove((java.lang.Integer) 0);
        maxBag25.clear();
        java.lang.Class<?> wildcardClass29 = maxBag25.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4, 100, 0, (-5), 5, (-8), (-2) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        maxBag24.remove((java.lang.Integer) (-10));
        maxBag24.remove((java.lang.Integer) 7);
        maxBag24.add((java.lang.Integer) (-10));
        maxBag24.add((java.lang.Integer) (-7));
        maxBag24.clear();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4, 100, 0, (-5), 5, (-8), (-2) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList18);
        maxBag32.clear();
        maxBag32.remove((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        maxBag22.add((java.lang.Integer) (-8));
        maxBag22.add((java.lang.Integer) 1);
        maxBag22.clear();
        maxBag22.remove((java.lang.Integer) 10);
        maxBag22.add((java.lang.Integer) (-100));
        maxBag22.add((java.lang.Integer) (-2));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        maxBag29.clear();
        maxBag29.remove((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass33 = maxBag29.getClass();
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 3, 7, (-8), 8, (-4), (-1), 3, 1, 100, (-10), (-5), 7, 10, 1, 1, 1, 1, 100, 10, (-6), (-2), (-100), 3, (-5), 8, (-100), (-6), (-1) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList29);
        java.lang.Class<?> wildcardClass34 = maxBag33.getClass();
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.clear();
        maxBag21.remove((java.lang.Integer) (-2));
        java.lang.Class<?> wildcardClass25 = maxBag21.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4, 100, 0, (-5), 5, (-8), (-2) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        maxBag27.clear();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-7), 0, (-1), 4, (-1), (-5), (-1) };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag11 = new examples.MaxBag(intList8);
        maxBag11.add((java.lang.Integer) (-1));
        maxBag11.clear();
        maxBag11.clear();
        maxBag11.remove((java.lang.Integer) 7);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4, 100, 0, (-5), 5, (-8), (-2) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        maxBag28.remove((java.lang.Integer) (-1));
        maxBag28.add((java.lang.Integer) 2);
        maxBag28.remove((java.lang.Integer) 4);
        java.lang.Class<?> wildcardClass35 = maxBag28.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 0, (-10), (-4), 10, 10, 0, 4, 4, 9 };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        examples.MaxBag maxBag12 = new examples.MaxBag(intList10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList10);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList10);
        maxBag14.remove((java.lang.Integer) 8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-2), 10, (-5), 4, (-6), 4, (-100), 7, 4, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        maxBag13.add((java.lang.Integer) 5);
        maxBag13.remove((java.lang.Integer) (-10));
        maxBag13.remove((java.lang.Integer) (-7));
        maxBag13.remove((java.lang.Integer) (-2));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 0);
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-3));
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 5, 3, (-5), (-8), 0, (-5), (-5), (-3), 4, 6, (-1), 10, (-1), 10, 8, 7, 1, (-3), (-100), 0, 10, 5, 0, 100, 2, (-10), (-2), (-5) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList29);
        maxBag35.remove((java.lang.Integer) (-8));
        maxBag35.remove((java.lang.Integer) 3);
        maxBag35.clear();
        maxBag35.remove((java.lang.Integer) (-5));
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { (-5), (-5), (-9), 100, 10, (-4), (-5), 0, (-6), (-6), 2, (-5), 1, 9, (-8), 100, 8, 100, (-8), 10, (-9), (-4), 2, (-100), 100 };
        java.util.ArrayList<java.lang.Integer> intList26 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList26);
        maxBag28.clear();
        maxBag28.remove((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass32 = maxBag28.getClass();
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        maxBag25.add((java.lang.Integer) 100);
        maxBag25.clear();
        maxBag25.clear();
        maxBag25.remove((java.lang.Integer) 9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-6), 5, 100, (-10), 100, (-8), 5, (-5), 2, 8, 3, 6, 5, (-8), 0, (-2), (-7) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList18);
        java.lang.Class<?> wildcardClass36 = intList18.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-8), 100, 10, (-8) };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.MaxBag maxBag7 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag8 = new examples.MaxBag(intList5);
        maxBag8.add((java.lang.Integer) 9);
        maxBag8.clear();
        maxBag8.add((java.lang.Integer) 5);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        maxBag20.remove((java.lang.Integer) 8);
        maxBag20.add((java.lang.Integer) 4);
        maxBag20.remove((java.lang.Integer) 10);
        maxBag20.remove((java.lang.Integer) (-7));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        maxBag16.add((java.lang.Integer) 9);
        maxBag16.add((java.lang.Integer) 2);
        maxBag16.clear();
        java.lang.Class<?> wildcardClass22 = maxBag16.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        maxBag16.add((java.lang.Integer) 9);
        maxBag16.add((java.lang.Integer) 2);
        maxBag16.add((java.lang.Integer) 1);
        maxBag16.add((java.lang.Integer) 0);
        maxBag16.add((java.lang.Integer) 4);
        maxBag16.clear();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-1), (-100), 100, 100, 100, (-3), 7, 2, 0, (-7), 6, (-5), (-10), (-100), (-10), (-4), 10, (-6), 8, 2, 9, (-1), 10 };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag39 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag40 = new examples.MaxBag(intList24);
        maxBag40.add((java.lang.Integer) (-4));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        maxBag25.add((java.lang.Integer) 100);
        maxBag25.add((java.lang.Integer) 8);
        maxBag25.add((java.lang.Integer) 10);
        maxBag25.remove((java.lang.Integer) (-3));
        maxBag25.remove((java.lang.Integer) (-7));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-1), (-100), 100, 100, 100, (-3), 7, 2, 0, (-7), 6, (-5), (-10), (-100), (-10), (-4), 10, (-6), 8, 2, 9, (-1), 10 };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList24);
        maxBag26.clear();
        maxBag26.remove((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass30 = maxBag26.getClass();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 100);
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.add((java.lang.Integer) 8);
        maxBag0.add((java.lang.Integer) (-7));
        maxBag0.remove((java.lang.Integer) 5);
        maxBag0.add((java.lang.Integer) (-1));
        maxBag0.add((java.lang.Integer) 2);
        maxBag0.remove((java.lang.Integer) 1);
        maxBag0.remove((java.lang.Integer) (-3));
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.add((java.lang.Integer) (-7));
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-1));
        maxBag0.add((java.lang.Integer) (-7));
        maxBag0.add((java.lang.Integer) (-2));
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        maxBag22.add((java.lang.Integer) (-8));
        maxBag22.add((java.lang.Integer) 4);
        maxBag22.clear();
        maxBag22.add((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-6), (-3), 10, (-3), 5, (-4), 7, 10, 3, 10, (-100), 1, (-7), (-6), 100, 1, 7, (-7), (-1), 10, 10, (-3), (-8), (-2), 3, 10 };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList27);
        java.lang.Class<?> wildcardClass36 = maxBag35.getClass();
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.remove((java.lang.Integer) 3);
        maxBag21.remove((java.lang.Integer) 8);
        maxBag21.clear();
        maxBag21.remove((java.lang.Integer) (-2));
        maxBag21.add((java.lang.Integer) 7);
        maxBag21.add((java.lang.Integer) 3);
        maxBag21.clear();
        maxBag21.clear();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList11);
        maxBag24.remove((java.lang.Integer) (-6));
        maxBag24.remove((java.lang.Integer) (-1));
        maxBag24.remove((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-2), 10, (-5), 4, (-6), 4, (-100), 7, 4, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        maxBag18.remove((java.lang.Integer) 10);
        maxBag18.clear();
        maxBag18.add((java.lang.Integer) 0);
        maxBag18.remove((java.lang.Integer) (-2));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag39 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag40 = new examples.MaxBag(intList27);
        maxBag40.add((java.lang.Integer) 0);
        maxBag40.add((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass45 = maxBag40.getClass();
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList27);
        maxBag36.remove((java.lang.Integer) (-6));
        java.lang.Class<?> wildcardClass39 = maxBag36.getClass();
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-7), 0, (-1), 4, (-1), (-5), (-1) };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag11 = new examples.MaxBag(intList8);
        maxBag11.clear();
        maxBag11.add((java.lang.Integer) (-1));
        maxBag11.add((java.lang.Integer) (-5));
        maxBag11.clear();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 6, (-6), 6, 5, 10, 3, 2, (-9), (-6), (-6), (-4), (-9), 8, 0, 1, (-5), (-100), 100, 4, 10, 10, (-9), 10, 0, 5, 2, 8 };
        java.util.ArrayList<java.lang.Integer> intList28 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList28);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList28);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList28);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList28);
        java.lang.Class<?> wildcardClass34 = maxBag33.getClass();
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        maxBag25.add((java.lang.Integer) 100);
        maxBag25.remove((java.lang.Integer) (-1));
        maxBag25.clear();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 3, 100, (-4), 2, (-1), (-1), (-5), 100 };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        examples.MaxBag maxBag11 = new examples.MaxBag(intList9);
        examples.MaxBag maxBag12 = new examples.MaxBag(intList9);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList9);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.remove((java.lang.Integer) 3);
        maxBag21.remove((java.lang.Integer) 8);
        maxBag21.clear();
        maxBag21.add((java.lang.Integer) (-3));
        maxBag21.add((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.add((java.lang.Integer) (-1));
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-2));
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-2), 10, (-5), 4, (-6), 4, (-100), 7, 4, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList11);
        java.lang.Class<?> wildcardClass24 = maxBag23.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-3));
        maxBag0.add((java.lang.Integer) 6);
        maxBag0.add((java.lang.Integer) 5);
        maxBag0.remove((java.lang.Integer) 100);
        maxBag0.clear();
        maxBag0.clear();
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.remove((java.lang.Integer) 1);
        maxBag21.add((java.lang.Integer) (-1));
        maxBag21.add((java.lang.Integer) (-5));
        java.lang.Class<?> wildcardClass28 = maxBag21.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList27);
        maxBag34.remove((java.lang.Integer) 2);
        maxBag34.remove((java.lang.Integer) (-9));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList11);
        java.lang.Class<?> wildcardClass34 = maxBag33.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.add((java.lang.Integer) (-1));
        maxBag0.remove((java.lang.Integer) (-100));
        maxBag0.remove((java.lang.Integer) (-4));
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-6));
        java.lang.Class<?> wildcardClass12 = maxBag0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-2), 10, (-5), 4, (-6), 4, (-100), 7, 4, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        java.lang.Class<?> wildcardClass14 = maxBag13.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4, 100, 0, (-5), 5, (-8), (-2) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList18);
        maxBag29.add((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass32 = maxBag29.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 100);
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.add((java.lang.Integer) 8);
        maxBag0.add((java.lang.Integer) (-7));
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 4);
        maxBag0.remove((java.lang.Integer) (-10));
        maxBag0.add((java.lang.Integer) (-1));
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 5, 3, (-5), (-8), 0, (-5), (-5), (-3), 4, 6, (-1), 10, (-1), 10, 8, 7, 1, (-3), (-100), 0, 10, 5, 0, 100, 2, (-10), (-2), (-5) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag39 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag40 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag41 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag42 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag43 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag44 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag45 = new examples.MaxBag(intList29);
        java.lang.Class<?> wildcardClass46 = intList29.getClass();
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-2), 10, (-5), 4, (-6), 4, (-100), 7, 4, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList11);
        java.lang.Class<?> wildcardClass20 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-1), (-100), 100, 100, 100, (-3), 7, 2, 0, (-7), 6, (-5), (-10), (-100), (-10), (-4), 10, (-6), 8, 2, 9, (-1), 10 };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList24);
        maxBag36.clear();
        maxBag36.clear();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4, 100, 0, (-5), 5, (-8), (-2) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList18);
        maxBag30.add((java.lang.Integer) (-7));
        maxBag30.remove((java.lang.Integer) 4);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4, 100, 0, (-5), 5, (-8), (-2) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        maxBag28.add((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        maxBag15.add((java.lang.Integer) (-8));
        maxBag15.remove((java.lang.Integer) (-6));
        maxBag15.remove((java.lang.Integer) 6);
        maxBag15.remove((java.lang.Integer) (-5));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-3));
        maxBag0.remove((java.lang.Integer) 5);
        maxBag0.clear();
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-8), 100, 10, (-8) };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.MaxBag maxBag7 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag8 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag9 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag11 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag12 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList5);
        maxBag14.add((java.lang.Integer) 8);
        maxBag14.remove((java.lang.Integer) (-10));
        java.lang.Class<?> wildcardClass19 = maxBag14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 100);
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.add((java.lang.Integer) 8);
        maxBag0.add((java.lang.Integer) (-7));
        maxBag0.remove((java.lang.Integer) 5);
        maxBag0.add((java.lang.Integer) (-1));
        maxBag0.add((java.lang.Integer) 2);
        maxBag0.remove((java.lang.Integer) 1);
        maxBag0.add((java.lang.Integer) 1);
        maxBag0.clear();
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList27);
        java.lang.Class<?> wildcardClass38 = intList27.getClass();
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        maxBag30.add((java.lang.Integer) 9);
        maxBag30.clear();
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 100);
        maxBag0.add((java.lang.Integer) (-4));
        maxBag0.add((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass9 = maxBag0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        maxBag14.remove((java.lang.Integer) 100);
        maxBag14.add((java.lang.Integer) 100);
        maxBag14.clear();
        maxBag14.remove((java.lang.Integer) (-2));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-6), 5, 100, (-10), 100, (-8), 5, (-5), 2, 8, 3, 6, 5, (-8), 0, (-2), (-7) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.add((java.lang.Integer) 8);
        maxBag21.add((java.lang.Integer) (-10));
        maxBag21.clear();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-2), 10, (-5), 4, (-6), 4, (-100), 7, 4, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        maxBag13.add((java.lang.Integer) 5);
        maxBag13.add((java.lang.Integer) 1);
        maxBag13.add((java.lang.Integer) (-8));
        maxBag13.add((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, (-10), 100, 0, 0, (-2) };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        examples.MaxBag maxBag9 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag11 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag12 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList7);
        maxBag24.clear();
        maxBag24.add((java.lang.Integer) 2);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        maxBag15.add((java.lang.Integer) (-8));
        maxBag15.add((java.lang.Integer) 8);
        maxBag15.remove((java.lang.Integer) (-100));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-6), (-3), 10, (-3), 5, (-4), 7, 10, 3, 10, (-100), 1, (-7), (-6), 100, 1, 7, (-7), (-1), 10, 10, (-3), (-8), (-2), 3, 10 };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag39 = new examples.MaxBag(intList27);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 5, 3, (-5), (-8), 0, (-5), (-5), (-3), 4, 6, (-1), 10, (-1), 10, 8, 7, 1, (-3), (-100), 0, 10, 5, 0, 100, 2, (-10), (-2), (-5) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList29);
        maxBag31.add((java.lang.Integer) 9);
        maxBag31.add((java.lang.Integer) 0);
        maxBag31.add((java.lang.Integer) (-10));
        maxBag31.clear();
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        maxBag33.remove((java.lang.Integer) 0);
        maxBag33.add((java.lang.Integer) 3);
        maxBag33.remove((java.lang.Integer) (-5));
        maxBag33.remove((java.lang.Integer) 7);
        maxBag33.clear();
        maxBag33.clear();
        maxBag33.remove((java.lang.Integer) (-100));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, (-8), 10, (-7), 8, (-5), 4, 9, (-8), 0, (-100), (-7), (-2) };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList14);
        maxBag18.remove((java.lang.Integer) (-4));
        maxBag18.add((java.lang.Integer) 5);
        maxBag18.remove((java.lang.Integer) 1);
        maxBag18.clear();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag39 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag40 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag41 = new examples.MaxBag(intList18);
        java.lang.Class<?> wildcardClass42 = maxBag41.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        maxBag25.add((java.lang.Integer) 100);
        maxBag25.add((java.lang.Integer) 8);
        maxBag25.remove((java.lang.Integer) (-8));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4, 100, 0, (-5), 5, (-8), (-2) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        maxBag20.clear();
        maxBag20.add((java.lang.Integer) 0);
        maxBag20.remove((java.lang.Integer) 7);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.add((java.lang.Integer) (-8));
        maxBag21.remove((java.lang.Integer) (-10));
        maxBag21.remove((java.lang.Integer) 0);
        maxBag21.clear();
        maxBag21.remove((java.lang.Integer) (-2));
        maxBag21.add((java.lang.Integer) 5);
        maxBag21.clear();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        maxBag29.clear();
        maxBag29.remove((java.lang.Integer) 0);
        maxBag29.remove((java.lang.Integer) 0);
        maxBag29.remove((java.lang.Integer) (-5));
        maxBag29.add((java.lang.Integer) (-8));
        java.lang.Class<?> wildcardClass39 = maxBag29.getClass();
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-2), 10, (-5), 4, (-6), 4, (-100), 7, 4, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        maxBag13.add((java.lang.Integer) 5);
        maxBag13.clear();
        maxBag13.clear();
        maxBag13.remove((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-2), 10, (-5), 4, (-6), 4, (-100), 7, 4, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList11);
        maxBag22.remove((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-2), 10, (-5), 4, (-6), 4, (-100), 7, 4, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        maxBag14.add((java.lang.Integer) 9);
        maxBag14.add((java.lang.Integer) (-2));
        maxBag14.remove((java.lang.Integer) (-9));
        maxBag14.remove((java.lang.Integer) 0);
        maxBag14.clear();
        maxBag14.clear();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-8), 100, 10, (-8) };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.MaxBag maxBag7 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag8 = new examples.MaxBag(intList5);
        maxBag8.add((java.lang.Integer) 9);
        maxBag8.clear();
        maxBag8.remove((java.lang.Integer) (-4));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        maxBag16.add((java.lang.Integer) 9);
        maxBag16.add((java.lang.Integer) 2);
        maxBag16.add((java.lang.Integer) 1);
        maxBag16.clear();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4, 100, 0, (-5), 5, (-8), (-2) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag39 = new examples.MaxBag(intList18);
        java.lang.Class<?> wildcardClass40 = intList18.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-2), 10, (-5), 4, (-6), 4, (-100), 7, 4, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        maxBag14.add((java.lang.Integer) 9);
        maxBag14.add((java.lang.Integer) (-2));
        maxBag14.remove((java.lang.Integer) (-9));
        maxBag14.remove((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass23 = maxBag14.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4, 100, 0, (-5), 5, (-8), (-2) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        maxBag24.remove((java.lang.Integer) (-8));
        maxBag24.clear();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-7), 0, (-1), 4, (-1), (-5), (-1) };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag11 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag12 = new examples.MaxBag(intList8);
        maxBag12.clear();
        maxBag12.remove((java.lang.Integer) 8);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-3));
        maxBag0.add((java.lang.Integer) 6);
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 6);
        maxBag0.remove((java.lang.Integer) (-7));
        maxBag0.add((java.lang.Integer) (-2));
        java.lang.Class<?> wildcardClass15 = maxBag0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.add((java.lang.Integer) (-10));
        maxBag21.add((java.lang.Integer) 10);
        maxBag21.remove((java.lang.Integer) (-10));
        maxBag21.clear();
        maxBag21.clear();
        maxBag21.clear();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-2), 10, (-5), 4, (-6), 4, (-100), 7, 4, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        maxBag14.add((java.lang.Integer) 9);
        maxBag14.add((java.lang.Integer) (-4));
        maxBag14.clear();
        maxBag14.remove((java.lang.Integer) 9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4, 100, 0, (-5), 5, (-8), (-2) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList18);
        maxBag37.clear();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-6), 5, 100, (-10), 100, (-8), 5, (-5), 2, 8, 3, 6, 5, (-8), 0, (-2), (-7) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList18);
        maxBag29.remove((java.lang.Integer) (-3));
        java.lang.Class<?> wildcardClass32 = maxBag29.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-1), (-100), 100, 100, 100, (-3), 7, 2, 0, (-7), 6, (-5), (-10), (-100), (-10), (-4), 10, (-6), 8, 2, 9, (-1), 10 };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList24);
        maxBag26.clear();
        java.lang.Class<?> wildcardClass28 = maxBag26.getClass();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        maxBag22.add((java.lang.Integer) (-8));
        maxBag22.add((java.lang.Integer) 4);
        maxBag22.clear();
        maxBag22.remove((java.lang.Integer) 7);
        maxBag22.remove((java.lang.Integer) (-9));
        maxBag22.add((java.lang.Integer) (-5));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        maxBag22.add((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass25 = maxBag22.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        maxBag27.add((java.lang.Integer) 9);
        maxBag27.remove((java.lang.Integer) (-100));
        maxBag27.clear();
        java.lang.Class<?> wildcardClass33 = maxBag27.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-2), 10, (-5), 4, (-6), 4, (-100), 7, 4, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        maxBag13.add((java.lang.Integer) 5);
        maxBag13.add((java.lang.Integer) 1);
        maxBag13.add((java.lang.Integer) (-8));
        maxBag13.add((java.lang.Integer) (-3));
        maxBag13.remove((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass24 = maxBag13.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-2), 10, (-5), 4, (-6), 4, (-100), 7, 4, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        maxBag13.clear();
        maxBag13.add((java.lang.Integer) (-3));
        maxBag13.add((java.lang.Integer) 9);
        maxBag13.remove((java.lang.Integer) 7);
        maxBag13.remove((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        maxBag20.add((java.lang.Integer) 100);
        maxBag20.clear();
        maxBag20.clear();
        java.lang.Class<?> wildcardClass25 = maxBag20.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        maxBag13.add((java.lang.Integer) 2);
        maxBag13.remove((java.lang.Integer) (-10));
        maxBag13.clear();
        maxBag13.add((java.lang.Integer) 8);
        maxBag13.remove((java.lang.Integer) 8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 5);
        maxBag0.add((java.lang.Integer) 100);
        maxBag0.clear();
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList11);
        maxBag20.add((java.lang.Integer) 9);
        maxBag20.clear();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-2), 10, (-5), 4, (-6), 4, (-100), 7, 4, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        maxBag16.add((java.lang.Integer) 7);
        maxBag16.add((java.lang.Integer) 2);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, (-8), 10, (-7), 8, (-5), 4, 9, (-8), 0, (-100), (-7), (-2) };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList14);
        java.lang.Class<?> wildcardClass24 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-2), 10, (-5), 4, (-6), 4, (-100), 7, 4, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        maxBag14.add((java.lang.Integer) 9);
        maxBag14.clear();
        maxBag14.remove((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-7), 0, (-1), 4, (-1), (-5), (-1) };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag11 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag12 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList8);
        java.lang.Class<?> wildcardClass19 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 3, 7, (-8), 8, (-4), (-1), 3, 1, 100, (-10), (-5), 7, 10, 1, 1, 1, 1, 100, 10, (-6), (-2), (-100), 3, (-5), 8, (-100), (-6), (-1) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList29);
        maxBag32.remove((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-7), 0, (-1), 4, (-1), (-5), (-1) };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag11 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag12 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList8);
        maxBag18.clear();
        maxBag18.remove((java.lang.Integer) 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        maxBag33.remove((java.lang.Integer) 0);
        maxBag33.add((java.lang.Integer) (-9));
        maxBag33.remove((java.lang.Integer) 9);
        maxBag33.add((java.lang.Integer) 3);
        maxBag33.clear();
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-1), (-100), 100, 100, 100, (-3), 7, 2, 0, (-7), 6, (-5), (-10), (-100), (-10), (-4), 10, (-6), 8, 2, 9, (-1), 10 };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList24);
        java.lang.Class<?> wildcardClass36 = maxBag35.getClass();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList18);
        maxBag31.add((java.lang.Integer) (-2));
        java.lang.Class<?> wildcardClass34 = maxBag31.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.add((java.lang.Integer) (-10));
        maxBag21.add((java.lang.Integer) (-100));
        maxBag21.add((java.lang.Integer) (-6));
        maxBag21.add((java.lang.Integer) 2);
        maxBag21.remove((java.lang.Integer) 2);
        maxBag21.clear();
        maxBag21.remove((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        maxBag32.remove((java.lang.Integer) 3);
        maxBag32.remove((java.lang.Integer) 1);
        maxBag32.clear();
        maxBag32.remove((java.lang.Integer) 0);
        maxBag32.clear();
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 100);
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-2));
        maxBag0.remove((java.lang.Integer) (-3));
        maxBag0.add((java.lang.Integer) (-6));
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.add((java.lang.Integer) (-1));
        maxBag0.remove((java.lang.Integer) (-100));
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 2);
        maxBag0.add((java.lang.Integer) 100);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-2), 10, (-5), 4, (-6), 4, (-100), 7, 4, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        maxBag13.clear();
        maxBag13.add((java.lang.Integer) 4);
        maxBag13.clear();
        maxBag13.clear();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        maxBag13.clear();
        maxBag13.add((java.lang.Integer) 0);
        maxBag13.remove((java.lang.Integer) 0);
        maxBag13.clear();
        maxBag13.remove((java.lang.Integer) (-100));
        java.lang.Class<?> wildcardClass22 = maxBag13.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-6), (-3), 10, (-3), 5, (-4), 7, 10, 3, 10, (-100), 1, (-7), (-6), 100, 1, 7, (-7), (-1), 10, 10, (-3), (-8), (-2), 3, 10 };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        java.lang.Class<?> wildcardClass32 = maxBag31.getClass();
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList11);
        maxBag25.remove((java.lang.Integer) (-10));
        maxBag25.clear();
        maxBag25.add((java.lang.Integer) 7);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        maxBag20.add((java.lang.Integer) 100);
        maxBag20.remove((java.lang.Integer) (-6));
        maxBag20.add((java.lang.Integer) 2);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-8), 100, 10, (-8) };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.MaxBag maxBag7 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag8 = new examples.MaxBag(intList5);
        maxBag8.add((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-6), 5, 100, (-10), 100, (-8), 5, (-5), 2, 8, 3, 6, 5, (-8), 0, (-2), (-7) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        maxBag24.clear();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.add((java.lang.Integer) (-1));
        maxBag0.remove((java.lang.Integer) (-100));
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 2);
        maxBag0.clear();
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        maxBag24.clear();
        maxBag24.remove((java.lang.Integer) 7);
        maxBag24.remove((java.lang.Integer) (-3));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-7), 0, (-1), 4, (-1), (-5), (-1) };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag11 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag12 = new examples.MaxBag(intList8);
        maxBag12.add((java.lang.Integer) 10);
        maxBag12.remove((java.lang.Integer) (-4));
        maxBag12.remove((java.lang.Integer) 6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        maxBag29.add((java.lang.Integer) 9);
        maxBag29.add((java.lang.Integer) 5);
        maxBag29.clear();
        maxBag29.remove((java.lang.Integer) (-8));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        maxBag20.clear();
        maxBag20.clear();
        maxBag20.clear();
        maxBag20.clear();
        java.lang.Class<?> wildcardClass25 = maxBag20.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.remove((java.lang.Integer) 8);
        maxBag21.add((java.lang.Integer) 3);
        maxBag21.add((java.lang.Integer) 10);
        maxBag21.add((java.lang.Integer) 9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        maxBag29.clear();
        maxBag29.remove((java.lang.Integer) 0);
        maxBag29.remove((java.lang.Integer) 0);
        maxBag29.remove((java.lang.Integer) (-5));
        maxBag29.add((java.lang.Integer) 7);
        maxBag29.remove((java.lang.Integer) (-2));
        java.lang.Class<?> wildcardClass41 = maxBag29.getClass();
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList11);
        maxBag24.remove((java.lang.Integer) (-6));
        maxBag24.add((java.lang.Integer) 4);
        maxBag24.clear();
        java.lang.Class<?> wildcardClass30 = maxBag24.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 0, (-5), 3, (-2), (-1), (-2), 5, 0, 10, 2 };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList12);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList12);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList12);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList12);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList12);
        maxBag18.remove((java.lang.Integer) (-7));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-2), 10, (-5), 4, (-6), 4, (-100), 7, 4, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList11);
        maxBag19.add((java.lang.Integer) (-10));
        maxBag19.clear();
        maxBag19.add((java.lang.Integer) 9);
        maxBag19.add((java.lang.Integer) 0);
        maxBag19.add((java.lang.Integer) 9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4, 100, 0, (-5), 5, (-8), (-2) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        maxBag20.clear();
        maxBag20.remove((java.lang.Integer) (-5));
        maxBag20.clear();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        maxBag29.clear();
        maxBag29.remove((java.lang.Integer) 0);
        maxBag29.remove((java.lang.Integer) 0);
        maxBag29.add((java.lang.Integer) 100);
        maxBag29.add((java.lang.Integer) (-7));
        maxBag29.remove((java.lang.Integer) 1);
        maxBag29.add((java.lang.Integer) (-3));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 5, 3, (-5), (-8), 0, (-5), (-5), (-3), 4, 6, (-1), 10, (-1), 10, 8, 7, 1, (-3), (-100), 0, 10, 5, 0, 100, 2, (-10), (-2), (-5) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag39 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag40 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag41 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag42 = new examples.MaxBag(intList29);
        maxBag42.remove((java.lang.Integer) 5);
        maxBag42.add((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        maxBag24.clear();
        maxBag24.add((java.lang.Integer) 0);
        maxBag24.add((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.add((java.lang.Integer) (-7));
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass8 = maxBag0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-7), 0, (-1), 4, (-1), (-5), (-1) };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag11 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag12 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList8);
        java.lang.Class<?> wildcardClass26 = maxBag25.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        maxBag20.add((java.lang.Integer) 4);
        maxBag20.remove((java.lang.Integer) 6);
        maxBag20.remove((java.lang.Integer) (-1));
        maxBag20.add((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 0, (-10), (-4), 10, 10, 0, 4, 4, 9 };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        examples.MaxBag maxBag12 = new examples.MaxBag(intList10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList10);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList10);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList10);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList10);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList10);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList10);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList10);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList10);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4, 100, 0, (-5), 5, (-8), (-2) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList18);
        maxBag33.remove((java.lang.Integer) (-7));
        java.lang.Class<?> wildcardClass36 = maxBag33.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-2), 10, (-5), 4, (-6), 4, (-100), 7, 4, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        maxBag14.add((java.lang.Integer) 9);
        maxBag14.add((java.lang.Integer) (-2));
        maxBag14.remove((java.lang.Integer) (-9));
        maxBag14.remove((java.lang.Integer) 0);
        maxBag14.add((java.lang.Integer) 6);
        maxBag14.remove((java.lang.Integer) (-7));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-7), 0, (-1), 4, (-1), (-5), (-1) };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag11 = new examples.MaxBag(intList8);
        java.lang.Class<?> wildcardClass12 = maxBag11.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        maxBag13.add((java.lang.Integer) 2);
        maxBag13.remove((java.lang.Integer) (-10));
        maxBag13.clear();
        maxBag13.remove((java.lang.Integer) (-10));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.remove((java.lang.Integer) 5);
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.add((java.lang.Integer) (-1));
        maxBag0.remove((java.lang.Integer) (-6));
        maxBag0.add((java.lang.Integer) 2);
        maxBag0.remove((java.lang.Integer) 2);
        maxBag0.remove((java.lang.Integer) (-7));
        maxBag0.clear();
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 100);
        maxBag0.add((java.lang.Integer) 5);
        maxBag0.remove((java.lang.Integer) 7);
        maxBag0.add((java.lang.Integer) (-100));
        maxBag0.add((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass13 = maxBag0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.remove((java.lang.Integer) 3);
        maxBag21.remove((java.lang.Integer) 8);
        maxBag21.remove((java.lang.Integer) (-5));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        maxBag24.clear();
        maxBag24.clear();
        maxBag24.remove((java.lang.Integer) (-7));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-7), 0, (-1), 4, (-1), (-5), (-1) };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag11 = new examples.MaxBag(intList8);
        maxBag11.remove((java.lang.Integer) 4);
        maxBag11.add((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-6), 5, 100, (-10), 100, (-8), 5, (-5), 2, 8, 3, 6, 5, (-8), 0, (-2), (-7) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        maxBag22.add((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { (-5), (-5), (-9), 100, 10, (-4), (-5), 0, (-6), (-6), 2, (-5), 1, 9, (-8), 100, 8, 100, (-8), 10, (-9), (-4), 2, (-100), 100 };
        java.util.ArrayList<java.lang.Integer> intList26 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList26);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList26);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList26);
        java.lang.Class<?> wildcardClass32 = maxBag31.getClass();
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag39 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag40 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag41 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag42 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag43 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag44 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag45 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag46 = new examples.MaxBag(intList27);
        java.lang.Class<?> wildcardClass47 = maxBag46.getClass();
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag39 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag40 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag41 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag42 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag43 = new examples.MaxBag(intList27);
        maxBag43.remove((java.lang.Integer) (-10));
        java.lang.Class<?> wildcardClass46 = maxBag43.getClass();
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-3));
        maxBag0.add((java.lang.Integer) 6);
        maxBag0.add((java.lang.Integer) 5);
        maxBag0.add((java.lang.Integer) (-1));
        maxBag0.remove((java.lang.Integer) (-8));
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4, 100, 0, (-5), 5, (-8), (-2) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList18);
        maxBag32.add((java.lang.Integer) 2);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-6), 5, 100, (-10), 100, (-8), 5, (-5), 2, 8, 3, 6, 5, (-8), 0, (-2), (-7) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        maxBag25.clear();
        maxBag25.remove((java.lang.Integer) 100);
        maxBag25.remove((java.lang.Integer) (-3));
        maxBag25.remove((java.lang.Integer) 1);
        maxBag25.remove((java.lang.Integer) 4);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-7), 0, (-1), 4, (-1), (-5), (-1) };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag11 = new examples.MaxBag(intList8);
        maxBag11.add((java.lang.Integer) (-1));
        maxBag11.clear();
        maxBag11.clear();
        maxBag11.remove((java.lang.Integer) (-4));
        maxBag11.add((java.lang.Integer) 3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        maxBag33.remove((java.lang.Integer) 0);
        maxBag33.remove((java.lang.Integer) (-1));
        maxBag33.remove((java.lang.Integer) 7);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-3));
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.remove((java.lang.Integer) 1);
        maxBag0.add((java.lang.Integer) (-3));
        maxBag0.remove((java.lang.Integer) 1);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, (-10), 100, 0, 0, (-2) };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        examples.MaxBag maxBag9 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag11 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag12 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList7);
        maxBag19.remove((java.lang.Integer) (-3));
        maxBag19.remove((java.lang.Integer) (-7));
        maxBag19.remove((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        maxBag18.clear();
        maxBag18.add((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, (-8), 10, (-7), 8, (-5), 4, 9, (-8), 0, (-100), (-7), (-2) };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList14);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        maxBag27.add((java.lang.Integer) 0);
        maxBag27.remove((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass32 = maxBag27.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList11);
        maxBag25.remove((java.lang.Integer) (-10));
        maxBag25.clear();
        maxBag25.remove((java.lang.Integer) (-10));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.clear();
        maxBag21.clear();
        maxBag21.remove((java.lang.Integer) 3);
        maxBag21.clear();
        maxBag21.remove((java.lang.Integer) (-5));
        maxBag21.remove((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass31 = maxBag21.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-8), 100, 10, (-8) };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.MaxBag maxBag7 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag8 = new examples.MaxBag(intList5);
        maxBag8.add((java.lang.Integer) 9);
        maxBag8.add((java.lang.Integer) 6);
        maxBag8.add((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag39 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag40 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag41 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag42 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag43 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag44 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag45 = new examples.MaxBag(intList27);
        java.lang.Class<?> wildcardClass46 = intList27.getClass();
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag39 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag40 = new examples.MaxBag(intList27);
        maxBag40.clear();
        maxBag40.remove((java.lang.Integer) (-5));
        maxBag40.add((java.lang.Integer) (-5));
        maxBag40.add((java.lang.Integer) (-5));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.clear();
        maxBag21.clear();
        maxBag21.add((java.lang.Integer) 8);
        maxBag21.add((java.lang.Integer) 0);
        maxBag21.clear();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        maxBag13.clear();
        maxBag13.add((java.lang.Integer) 0);
        maxBag13.remove((java.lang.Integer) 0);
        maxBag13.clear();
        maxBag13.remove((java.lang.Integer) (-100));
        maxBag13.add((java.lang.Integer) (-9));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-2), 10, (-5), 4, (-6), 4, (-100), 7, 4, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        maxBag13.clear();
        maxBag13.clear();
        maxBag13.clear();
        maxBag13.clear();
        java.lang.Class<?> wildcardClass18 = maxBag13.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        maxBag16.clear();
        maxBag16.add((java.lang.Integer) 1);
        maxBag16.add((java.lang.Integer) (-10));
        maxBag16.remove((java.lang.Integer) (-1));
        maxBag16.remove((java.lang.Integer) (-5));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag39 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag40 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag41 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag42 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag43 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag44 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag45 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag46 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag47 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag48 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag49 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag50 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag51 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag52 = new examples.MaxBag(intList27);
        maxBag52.clear();
        maxBag52.remove((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4, 100, 0, (-5), 5, (-8), (-2) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        maxBag20.clear();
        maxBag20.add((java.lang.Integer) (-2));
        java.lang.Class<?> wildcardClass24 = maxBag20.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-6), (-3), 10, (-3), 5, (-4), 7, 10, 3, 10, (-100), 1, (-7), (-6), 100, 1, 7, (-7), (-1), 10, 10, (-3), (-8), (-2), 3, 10 };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList27);
        maxBag35.remove((java.lang.Integer) 0);
        maxBag35.remove((java.lang.Integer) 1);
        maxBag35.add((java.lang.Integer) (-6));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        maxBag29.clear();
        maxBag29.remove((java.lang.Integer) 0);
        maxBag29.remove((java.lang.Integer) 0);
        maxBag29.clear();
        maxBag29.remove((java.lang.Integer) 0);
        maxBag29.clear();
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 6, (-6), 6, 5, 10, 3, 2, (-9), (-6), (-6), (-4), (-9), 8, 0, 1, (-5), (-100), 100, 4, 10, 10, (-9), 10, 0, 5, 2, 8 };
        java.util.ArrayList<java.lang.Integer> intList28 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList28);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList28);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList28);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList28);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList28);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList28);
        java.lang.Class<?> wildcardClass36 = intList28.getClass();
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        maxBag16.add((java.lang.Integer) 9);
        maxBag16.add((java.lang.Integer) 2);
        maxBag16.clear();
        maxBag16.remove((java.lang.Integer) (-9));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4, 100, 0, (-5), 5, (-8), (-2) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        maxBag23.remove((java.lang.Integer) (-9));
        maxBag23.add((java.lang.Integer) 0);
        maxBag23.add((java.lang.Integer) (-1));
        maxBag23.remove((java.lang.Integer) 3);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-6), (-3), 10, (-3), 5, (-4), 7, 10, 3, 10, (-100), 1, (-7), (-6), 100, 1, 7, (-7), (-1), 10, 10, (-3), (-8), (-2), 3, 10 };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        maxBag30.remove((java.lang.Integer) 0);
        maxBag30.remove((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag39 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag40 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag41 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag42 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag43 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag44 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag45 = new examples.MaxBag(intList18);
        maxBag45.remove((java.lang.Integer) (-10));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        maxBag29.add((java.lang.Integer) 9);
        maxBag29.add((java.lang.Integer) 5);
        maxBag29.add((java.lang.Integer) (-3));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 0, (-5), 3, (-2), (-1), (-2), 5, 0, 10, 2 };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList12);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList12);
        java.lang.Class<?> wildcardClass16 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-2), 10, (-5), 4, (-6), 4, (-100), 7, 4, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        maxBag13.clear();
        maxBag13.add((java.lang.Integer) (-3));
        maxBag13.add((java.lang.Integer) 9);
        maxBag13.remove((java.lang.Integer) 7);
        maxBag13.add((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass23 = maxBag13.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList27);
        maxBag35.clear();
        java.lang.Class<?> wildcardClass37 = maxBag35.getClass();
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.remove((java.lang.Integer) 3);
        maxBag21.remove((java.lang.Integer) 8);
        maxBag21.add((java.lang.Integer) 2);
        maxBag21.add((java.lang.Integer) 9);
        java.lang.Class<?> wildcardClass30 = maxBag21.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-8), 100, 10, (-8) };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.MaxBag maxBag7 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag8 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag9 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag11 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag12 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList5);
        maxBag16.remove((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-6), 5, 100, (-10), 100, (-8), 5, (-5), 2, 8, 3, 6, 5, (-8), 0, (-2), (-7) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList18);
        maxBag30.clear();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-2));
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-2), 10, (-5), 4, (-6), 4, (-100), 7, 4, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        maxBag13.clear();
        maxBag13.add((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-2), 10, (-5), 4, (-6), 4, (-100), 7, 4, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList11);
        java.lang.Class<?> wildcardClass22 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        maxBag18.add((java.lang.Integer) (-3));
        maxBag18.add((java.lang.Integer) 3);
        maxBag18.remove((java.lang.Integer) 0);
        maxBag18.remove((java.lang.Integer) 9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100, 10, 8, 2, (-4), 6, 10, 4, 3, 5, 4, 100, (-9), (-5), (-9), 4, (-100), 9, (-8), 4, (-9) };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList22);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList22);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList22);
        java.lang.Class<?> wildcardClass27 = maxBag26.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.add((java.lang.Integer) (-8));
        maxBag21.remove((java.lang.Integer) (-10));
        maxBag21.remove((java.lang.Integer) (-3));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 100);
        maxBag0.add((java.lang.Integer) 5);
        maxBag0.remove((java.lang.Integer) 7);
        maxBag0.add((java.lang.Integer) (-100));
        java.lang.Class<?> wildcardClass11 = maxBag0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        maxBag24.remove((java.lang.Integer) 8);
        maxBag24.add((java.lang.Integer) 10);
        maxBag24.remove((java.lang.Integer) 100);
        maxBag24.add((java.lang.Integer) (-10));
        maxBag24.clear();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-2), 10, (-5), 4, (-6), 4, (-100), 7, 4, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList11);
        java.lang.Class<?> wildcardClass28 = maxBag27.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 5, 3, (-5), (-8), 0, (-5), (-5), (-3), 4, 6, (-1), 10, (-1), 10, 8, 7, 1, (-3), (-100), 0, 10, 5, 0, 100, 2, (-10), (-2), (-5) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList29);
        maxBag35.remove((java.lang.Integer) (-8));
        maxBag35.add((java.lang.Integer) 10);
        maxBag35.clear();
        maxBag35.clear();
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { (-8), 100, 3, 100, 100, (-10) };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        examples.MaxBag maxBag9 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList7);
        java.lang.Class<?> wildcardClass11 = maxBag10.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.remove((java.lang.Integer) 1);
        maxBag21.clear();
        maxBag21.remove((java.lang.Integer) (-1));
        maxBag21.remove((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 6, (-6), 6, 5, 10, 3, 2, (-9), (-6), (-6), (-4), (-9), 8, 0, 1, (-5), (-100), 100, 4, 10, 10, (-9), 10, 0, 5, 2, 8 };
        java.util.ArrayList<java.lang.Integer> intList28 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList28);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList28);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList28);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList28);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList28);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList28);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList28);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList28);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-1), (-100), 100, 100, 100, (-3), 7, 2, 0, (-7), 6, (-5), (-10), (-100), (-10), (-4), 10, (-6), 8, 2, 9, (-1), 10 };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList24);
        maxBag38.add((java.lang.Integer) (-5));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-7), 0, (-1), 4, (-1), (-5), (-1) };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag11 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag12 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList8);
        java.lang.Class<?> wildcardClass18 = maxBag17.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        maxBag18.add((java.lang.Integer) (-3));
        maxBag18.remove((java.lang.Integer) 4);
        maxBag18.clear();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-6), (-3), 10, (-3), 5, (-4), 7, 10, 3, 10, (-100), 1, (-7), (-6), 100, 1, 7, (-7), (-1), 10, 10, (-3), (-8), (-2), 3, 10 };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        maxBag30.clear();
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.remove((java.lang.Integer) 5);
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-1));
        maxBag0.remove((java.lang.Integer) (-7));
        maxBag0.add((java.lang.Integer) 1);
        maxBag0.remove((java.lang.Integer) 5);
        maxBag0.remove((java.lang.Integer) 10);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-2), 10, (-5), 4, (-6), 4, (-100), 7, 4, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList11);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        maxBag22.clear();
        maxBag22.clear();
        java.lang.Class<?> wildcardClass25 = maxBag22.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList18);
        maxBag32.clear();
        maxBag32.clear();
        maxBag32.add((java.lang.Integer) (-4));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList27);
        maxBag34.clear();
        maxBag34.add((java.lang.Integer) 10);
        maxBag34.add((java.lang.Integer) (-8));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        maxBag13.add((java.lang.Integer) 2);
        maxBag13.remove((java.lang.Integer) 0);
        maxBag13.add((java.lang.Integer) 1);
        maxBag13.remove((java.lang.Integer) 9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-7), 0, (-1), 4, (-1), (-5), (-1) };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag11 = new examples.MaxBag(intList8);
        maxBag11.add((java.lang.Integer) (-1));
        maxBag11.clear();
        maxBag11.clear();
        maxBag11.remove((java.lang.Integer) (-4));
        maxBag11.add((java.lang.Integer) (-3));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        maxBag18.clear();
        maxBag18.add((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        maxBag13.add((java.lang.Integer) 2);
        maxBag13.remove((java.lang.Integer) (-10));
        maxBag13.add((java.lang.Integer) 4);
        java.lang.Class<?> wildcardClass20 = maxBag13.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag39 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag40 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag41 = new examples.MaxBag(intList27);
        maxBag41.clear();
        maxBag41.clear();
        maxBag41.add((java.lang.Integer) (-9));
        maxBag41.remove((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.remove((java.lang.Integer) 3);
        maxBag21.remove((java.lang.Integer) 8);
        maxBag21.add((java.lang.Integer) 2);
        maxBag21.add((java.lang.Integer) (-9));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-6), 5, 100, (-10), 100, (-8), 5, (-5), 2, 8, 3, 6, 5, (-8), 0, (-2), (-7) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        maxBag23.add((java.lang.Integer) 4);
        java.lang.Class<?> wildcardClass26 = maxBag23.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4, 100, 0, (-5), 5, (-8), (-2) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList18);
        maxBag33.remove((java.lang.Integer) (-7));
        maxBag33.add((java.lang.Integer) 9);
        maxBag33.add((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4, 100, 0, (-5), 5, (-8), (-2) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.remove((java.lang.Integer) 8);
        maxBag21.add((java.lang.Integer) 7);
        maxBag21.remove((java.lang.Integer) (-100));
        maxBag21.add((java.lang.Integer) (-9));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { (-5), (-5), (-9), 100, 10, (-4), (-5), 0, (-6), (-6), 2, (-5), 1, 9, (-8), 100, 8, 100, (-8), 10, (-9), (-4), 2, (-100), 100 };
        java.util.ArrayList<java.lang.Integer> intList26 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList26);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList26);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList26);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList26);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList26);
        maxBag33.add((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-4), 3, (-8), (-10), (-8), (-3), 2, (-2), 1, 5, 10, 10, (-7), (-1), (-8), (-5), 8, (-4), 10, 0, 7, 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList24);
        maxBag26.add((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 5, 3, (-5), (-8), 0, (-5), (-5), (-3), 4, 6, (-1), 10, (-1), 10, 8, 7, 1, (-3), (-100), 0, 10, 5, 0, 100, 2, (-10), (-2), (-5) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList29);
        maxBag37.remove((java.lang.Integer) (-6));
        maxBag37.add((java.lang.Integer) (-100));
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        maxBag29.clear();
        maxBag29.clear();
        maxBag29.clear();
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-7), 0, (-1), 4, (-1), (-5), (-1) };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag11 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag12 = new examples.MaxBag(intList8);
        maxBag12.add((java.lang.Integer) 100);
        maxBag12.clear();
        java.lang.Class<?> wildcardClass16 = maxBag12.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-2), 10, (-5), 4, (-6), 4, (-100), 7, 4, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList11);
        java.lang.Class<?> wildcardClass22 = maxBag21.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.clear();
        maxBag21.clear();
        maxBag21.add((java.lang.Integer) 0);
        maxBag21.clear();
        maxBag21.add((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4, 100, 0, (-5), 5, (-8), (-2) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList18);
        maxBag30.clear();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        maxBag14.remove((java.lang.Integer) 100);
        maxBag14.add((java.lang.Integer) 100);
        maxBag14.clear();
        maxBag14.clear();
        maxBag14.clear();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 6, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.MaxBag maxBag5 = new examples.MaxBag(intList3);
        examples.MaxBag maxBag6 = new examples.MaxBag(intList3);
        examples.MaxBag maxBag7 = new examples.MaxBag(intList3);
        examples.MaxBag maxBag8 = new examples.MaxBag(intList3);
        examples.MaxBag maxBag9 = new examples.MaxBag(intList3);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4, 100, 0, (-5), 5, (-8), (-2) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        maxBag20.clear();
        maxBag20.remove((java.lang.Integer) 0);
        maxBag20.add((java.lang.Integer) 4);
        java.lang.Class<?> wildcardClass26 = maxBag20.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        maxBag18.remove((java.lang.Integer) (-3));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 5, 3, (-5), (-8), 0, (-5), (-5), (-3), 4, 6, (-1), 10, (-1), 10, 8, 7, 1, (-3), (-100), 0, 10, 5, 0, 100, 2, (-10), (-2), (-5) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList29);
        maxBag35.add((java.lang.Integer) (-6));
        maxBag35.add((java.lang.Integer) (-10));
        java.lang.Class<?> wildcardClass40 = maxBag35.getClass();
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        maxBag22.add((java.lang.Integer) (-3));
        maxBag22.remove((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass27 = maxBag22.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 100);
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.add((java.lang.Integer) (-5));
        maxBag0.clear();
        maxBag0.clear();
        java.lang.Class<?> wildcardClass11 = maxBag0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 5);
        maxBag0.add((java.lang.Integer) (-4));
        maxBag0.remove((java.lang.Integer) 8);
        java.lang.Class<?> wildcardClass10 = maxBag0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 4 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        examples.MaxBag maxBag4 = new examples.MaxBag(intList2);
        examples.MaxBag maxBag5 = new examples.MaxBag(intList2);
        examples.MaxBag maxBag6 = new examples.MaxBag(intList2);
        examples.MaxBag maxBag7 = new examples.MaxBag(intList2);
        examples.MaxBag maxBag8 = new examples.MaxBag(intList2);
        examples.MaxBag maxBag9 = new examples.MaxBag(intList2);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, (-8), 10, (-7), 8, (-5), 4, 9, (-8), 0, (-100), (-7), (-2) };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList14);
        maxBag26.remove((java.lang.Integer) (-6));
        maxBag26.clear();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4, 100, 0, (-5), 5, (-8), (-2) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        maxBag24.remove((java.lang.Integer) (-10));
        maxBag24.remove((java.lang.Integer) 7);
        maxBag24.remove((java.lang.Integer) (-10));
        java.lang.Class<?> wildcardClass31 = maxBag24.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 5, 3, (-5), (-8), 0, (-5), (-5), (-3), 4, 6, (-1), 10, (-1), 10, 8, 7, 1, (-3), (-100), 0, 10, 5, 0, 100, 2, (-10), (-2), (-5) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList29);
        maxBag31.add((java.lang.Integer) 9);
        maxBag31.remove((java.lang.Integer) 0);
        maxBag31.remove((java.lang.Integer) 3);
        maxBag31.clear();
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-3));
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.remove((java.lang.Integer) 1);
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-2));
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-1), (-100), 100, 100, 100, (-3), 7, 2, 0, (-7), 6, (-5), (-10), (-100), (-10), (-4), 10, (-6), 8, 2, 9, (-1), 10 };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList24);
        maxBag36.remove((java.lang.Integer) (-4));
        maxBag36.clear();
        maxBag36.add((java.lang.Integer) 7);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-6), 5, 100, (-10), 100, (-8), 5, (-5), 2, 8, 3, 6, 5, (-8), 0, (-2), (-7) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        maxBag23.add((java.lang.Integer) 4);
        maxBag23.clear();
        maxBag23.remove((java.lang.Integer) 1);
        maxBag23.add((java.lang.Integer) 7);
        maxBag23.add((java.lang.Integer) (-2));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 1, 100, 7, 4, (-1), (-9), 9, (-8), (-7), (-7), 3, (-5), (-6), (-5), 6, 9, 100, 3, 1 };
        java.util.ArrayList<java.lang.Integer> intList20 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList20);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList20);
        maxBag23.add((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        maxBag13.add((java.lang.Integer) 2);
        maxBag13.remove((java.lang.Integer) (-10));
        maxBag13.clear();
        maxBag13.add((java.lang.Integer) 8);
        maxBag13.remove((java.lang.Integer) (-3));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-6), 5, 100, (-10), 100, (-8), 5, (-5), 2, 8, 3, 6, 5, (-8), 0, (-2), (-7) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag39 = new examples.MaxBag(intList18);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-3));
        maxBag0.add((java.lang.Integer) 6);
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 6);
        maxBag0.remove((java.lang.Integer) (-7));
        maxBag0.remove((java.lang.Integer) 5);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 0, (-5), 3, (-2), (-1), (-2), 5, 0, 10, 2 };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList12);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList12);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList12);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList12);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList12);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList12);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-6), 5, 100, (-10), 100, (-8), 5, (-5), 2, 8, 3, 6, 5, (-8), 0, (-2), (-7) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        maxBag27.clear();
        maxBag27.add((java.lang.Integer) 4);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-1), (-100), 100, 100, 100, (-3), 7, 2, 0, (-7), 6, (-5), (-10), (-100), (-10), (-4), 10, (-6), 8, 2, 9, (-1), 10 };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList24);
        maxBag30.clear();
        maxBag30.clear();
        maxBag30.remove((java.lang.Integer) (-10));
        maxBag30.add((java.lang.Integer) (-3));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        maxBag32.add((java.lang.Integer) (-3));
        maxBag32.clear();
        maxBag32.clear();
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.add((java.lang.Integer) 6);
        maxBag21.add((java.lang.Integer) 10);
        maxBag21.remove((java.lang.Integer) 10);
        maxBag21.remove((java.lang.Integer) 7);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, (-10), 100, 0, 0, (-2) };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        examples.MaxBag maxBag9 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag11 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag12 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList7);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, (-10), 100, 0, 0, (-2) };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        examples.MaxBag maxBag9 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList7);
        maxBag10.add((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass13 = maxBag10.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        maxBag33.remove((java.lang.Integer) 0);
        maxBag33.remove((java.lang.Integer) (-1));
        maxBag33.clear();
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.add((java.lang.Integer) (-1));
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-5));
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        maxBag24.remove((java.lang.Integer) 5);
        maxBag24.remove((java.lang.Integer) 10);
        maxBag24.add((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 0, (-10), (-4), 10, 10, 0, 4, 4, 9 };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        examples.MaxBag maxBag12 = new examples.MaxBag(intList10);
        java.lang.Class<?> wildcardClass13 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList11);
        maxBag25.remove((java.lang.Integer) (-10));
        maxBag25.clear();
        maxBag25.clear();
        java.lang.Class<?> wildcardClass30 = maxBag25.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-8), 100, 10, (-8) };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.MaxBag maxBag7 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag8 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag9 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag11 = new examples.MaxBag(intList5);
        maxBag11.clear();
        maxBag11.remove((java.lang.Integer) (-2));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 3, 7, (-8), 8, (-4), (-1), 3, 1, 100, (-10), (-5), 7, 10, 1, 1, 1, 1, 100, 10, (-6), (-2), (-100), 3, (-5), 8, (-100), (-6), (-1) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag39 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag40 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag41 = new examples.MaxBag(intList29);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 3, 7, (-8), 8, (-4), (-1), 3, 1, 100, (-10), (-5), 7, 10, 1, 1, 1, 1, 100, 10, (-6), (-2), (-100), 3, (-5), 8, (-100), (-6), (-1) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList29);
        maxBag32.remove((java.lang.Integer) (-2));
        maxBag32.clear();
        maxBag32.remove((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-7), 0, (-1), 4, (-1), (-5), (-1) };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag11 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag12 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList8);
        maxBag19.remove((java.lang.Integer) 4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 100);
        maxBag0.add((java.lang.Integer) 5);
        maxBag0.remove((java.lang.Integer) 100);
        maxBag0.clear();
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 5, 3, (-5), (-8), 0, (-5), (-5), (-3), 4, 6, (-1), 10, (-1), 10, 8, 7, 1, (-3), (-100), 0, 10, 5, 0, 100, 2, (-10), (-2), (-5) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList29);
        maxBag31.add((java.lang.Integer) 9);
        maxBag31.add((java.lang.Integer) 0);
        maxBag31.add((java.lang.Integer) (-10));
        maxBag31.add((java.lang.Integer) (-100));
        maxBag31.clear();
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4, 100, 0, (-5), 5, (-8), (-2) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList18);
        maxBag29.add((java.lang.Integer) 0);
        maxBag29.add((java.lang.Integer) (-7));
        maxBag29.remove((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-6), 5, 100, (-10), 100, (-8), 5, (-5), 2, 8, 3, 6, 5, (-8), 0, (-2), (-7) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList18);
        maxBag36.remove((java.lang.Integer) (-2));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-3));
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.remove((java.lang.Integer) 1);
        maxBag0.remove((java.lang.Integer) 3);
        maxBag0.remove((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass14 = maxBag0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, (-10), 100, 0, 0, (-2) };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        examples.MaxBag maxBag9 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList7);
        java.lang.Class<?> wildcardClass11 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        maxBag32.remove((java.lang.Integer) 3);
        maxBag32.remove((java.lang.Integer) 1);
        maxBag32.remove((java.lang.Integer) 1);
        maxBag32.remove((java.lang.Integer) 10);
        maxBag32.clear();
        java.lang.Class<?> wildcardClass42 = maxBag32.getClass();
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-2), 10, (-5), 4, (-6), 4, (-100), 7, 4, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        maxBag13.add((java.lang.Integer) 5);
        maxBag13.clear();
        maxBag13.add((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        maxBag24.remove((java.lang.Integer) 8);
        maxBag24.add((java.lang.Integer) 10);
        maxBag24.remove((java.lang.Integer) 100);
        maxBag24.remove((java.lang.Integer) 3);
        maxBag24.remove((java.lang.Integer) (-100));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 5, 3, (-5), (-8), 0, (-5), (-5), (-3), 4, 6, (-1), 10, (-1), 10, 8, 7, 1, (-3), (-100), 0, 10, 5, 0, 100, 2, (-10), (-2), (-5) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList29);
        maxBag38.clear();
        maxBag38.add((java.lang.Integer) (-7));
        maxBag38.clear();
        maxBag38.add((java.lang.Integer) 5);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4, 100, 0, (-5), 5, (-8), (-2) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        maxBag23.clear();
        maxBag23.add((java.lang.Integer) (-6));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.add((java.lang.Integer) 6);
        maxBag21.add((java.lang.Integer) 0);
        maxBag21.clear();
        maxBag21.add((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { (-5) };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        examples.MaxBag maxBag4 = new examples.MaxBag(intList2);
        examples.MaxBag maxBag5 = new examples.MaxBag(intList2);
        examples.MaxBag maxBag6 = new examples.MaxBag(intList2);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-7), 0, (-1), 4, (-1), (-5), (-1) };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag11 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag12 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList8);
        maxBag29.clear();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 100);
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.add((java.lang.Integer) 100);
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-10));
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList11);
        maxBag19.add((java.lang.Integer) (-1));
        maxBag19.remove((java.lang.Integer) 0);
        maxBag19.remove((java.lang.Integer) 2);
        maxBag19.clear();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList27);
        maxBag34.remove((java.lang.Integer) 2);
        maxBag34.remove((java.lang.Integer) 6);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        maxBag22.add((java.lang.Integer) 4);
        maxBag22.remove((java.lang.Integer) (-3));
        maxBag22.clear();
        maxBag22.clear();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.remove((java.lang.Integer) 5);
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.add((java.lang.Integer) (-1));
        maxBag0.add((java.lang.Integer) 3);
        maxBag0.add((java.lang.Integer) 1);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-2), 10, (-5), 4, (-6), 4, (-100), 7, 4, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        maxBag18.remove((java.lang.Integer) 10);
        maxBag18.clear();
        maxBag18.clear();
        java.lang.Class<?> wildcardClass23 = maxBag18.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 0, (-10), (-4), 10, 10, 0, 4, 4, 9 };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        examples.MaxBag maxBag12 = new examples.MaxBag(intList10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList10);
        maxBag13.clear();
        maxBag13.remove((java.lang.Integer) 7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-2), 10, (-5), 4, (-6), 4, (-100), 7, 4, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList11);
        maxBag21.clear();
        maxBag21.add((java.lang.Integer) 7);
        maxBag21.remove((java.lang.Integer) 9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList18);
        maxBag32.clear();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 100);
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.add((java.lang.Integer) 8);
        maxBag0.add((java.lang.Integer) (-7));
        maxBag0.remove((java.lang.Integer) 5);
        maxBag0.add((java.lang.Integer) (-1));
        maxBag0.clear();
        maxBag0.clear();
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-6), 5, 100, (-10), 100, (-8), 5, (-5), 2, 8, 3, 6, 5, (-8), 0, (-2), (-7) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList18);
        java.lang.Class<?> wildcardClass31 = maxBag30.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 100);
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.add((java.lang.Integer) 100);
        maxBag0.add((java.lang.Integer) 10);
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-10));
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.add((java.lang.Integer) (-2));
        maxBag0.remove((java.lang.Integer) (-9));
        maxBag0.remove((java.lang.Integer) (-1));
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList11);
        maxBag20.add((java.lang.Integer) 9);
        maxBag20.add((java.lang.Integer) (-8));
        maxBag20.remove((java.lang.Integer) (-10));
        maxBag20.add((java.lang.Integer) 6);
        maxBag20.clear();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        maxBag25.remove((java.lang.Integer) 0);
        maxBag25.clear();
        maxBag25.remove((java.lang.Integer) 7);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.remove((java.lang.Integer) 8);
        maxBag21.add((java.lang.Integer) 3);
        maxBag21.clear();
        maxBag21.add((java.lang.Integer) 2);
        maxBag21.remove((java.lang.Integer) (-10));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 3, 7, (-8), 8, (-4), (-1), 3, 1, 100, (-10), (-5), 7, 10, 1, 1, 1, 1, 100, 10, (-6), (-2), (-100), 3, (-5), 8, (-100), (-6), (-1) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList29);
        maxBag34.remove((java.lang.Integer) (-8));
        maxBag34.remove((java.lang.Integer) (-5));
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 5, 3, (-5), (-8), 0, (-5), (-5), (-3), 4, 6, (-1), 10, (-1), 10, 8, 7, 1, (-3), (-100), 0, 10, 5, 0, 100, 2, (-10), (-2), (-5) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag39 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag40 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag41 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag42 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag43 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag44 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag45 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag46 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag47 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag48 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag49 = new examples.MaxBag(intList29);
        java.lang.Class<?> wildcardClass50 = maxBag49.getClass();
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-2), 10, (-5), 4, (-6), 4, (-100), 7, 4, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList11);
        maxBag32.remove((java.lang.Integer) (-2));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4, 100, 0, (-5), 5, (-8), (-2) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        maxBag24.remove((java.lang.Integer) (-7));
        maxBag24.remove((java.lang.Integer) (-4));
        maxBag24.clear();
        maxBag24.clear();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-6), (-3), 10, (-3), 5, (-4), 7, 10, 3, 10, (-100), 1, (-7), (-6), 100, 1, 7, (-7), (-1), 10, 10, (-3), (-8), (-2), 3, 10 };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList27);
        maxBag34.remove((java.lang.Integer) 10);
        maxBag34.add((java.lang.Integer) 8);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        maxBag18.remove((java.lang.Integer) 8);
        maxBag18.remove((java.lang.Integer) (-5));
        maxBag18.add((java.lang.Integer) (-7));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-8), 100, 10, (-8) };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.MaxBag maxBag7 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag8 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag9 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag11 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag12 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList5);
        maxBag18.remove((java.lang.Integer) (-100));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag39 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag40 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag41 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag42 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag43 = new examples.MaxBag(intList27);
        maxBag43.remove((java.lang.Integer) (-10));
        maxBag43.remove((java.lang.Integer) 5);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 3, 7, (-8), 8, (-4), (-1), 3, 1, 100, (-10), (-5), 7, 10, 1, 1, 1, 1, 100, 10, (-6), (-2), (-100), 3, (-5), 8, (-100), (-6), (-1) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList29);
        maxBag33.clear();
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList11);
        maxBag20.add((java.lang.Integer) 9);
        maxBag20.add((java.lang.Integer) (-8));
        maxBag20.remove((java.lang.Integer) (-10));
        maxBag20.add((java.lang.Integer) 2);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList18);
        maxBag29.add((java.lang.Integer) 1);
        maxBag29.remove((java.lang.Integer) 3);
        maxBag29.clear();
        maxBag29.add((java.lang.Integer) (-10));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 1, 100, 7, 4, (-1), (-9), 9, (-8), (-7), (-7), 3, (-5), (-6), (-5), 6, 9, 100, 3, 1 };
        java.util.ArrayList<java.lang.Integer> intList20 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList20);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList20);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList20);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        maxBag25.remove((java.lang.Integer) 0);
        maxBag25.clear();
        maxBag25.clear();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-7), 0, (-1), 4, (-1), (-5), (-1) };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag11 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag12 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList8);
        maxBag21.remove((java.lang.Integer) (-3));
        maxBag21.clear();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        maxBag14.clear();
        maxBag14.remove((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        maxBag14.remove((java.lang.Integer) 100);
        maxBag14.add((java.lang.Integer) 100);
        maxBag14.clear();
        maxBag14.remove((java.lang.Integer) 9);
        maxBag14.remove((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, (-8), 10, (-7), 8, (-5), 4, 9, (-8), 0, (-100), (-7), (-2) };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList14);
        maxBag20.add((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 4 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        examples.MaxBag maxBag4 = new examples.MaxBag(intList2);
        examples.MaxBag maxBag5 = new examples.MaxBag(intList2);
        examples.MaxBag maxBag6 = new examples.MaxBag(intList2);
        examples.MaxBag maxBag7 = new examples.MaxBag(intList2);
        maxBag7.remove((java.lang.Integer) (-8));
        maxBag7.remove((java.lang.Integer) (-4));
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag39 = new examples.MaxBag(intList27);
        maxBag39.clear();
        maxBag39.clear();
        maxBag39.remove((java.lang.Integer) 7);
        maxBag39.add((java.lang.Integer) 3);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        maxBag20.remove((java.lang.Integer) 8);
        maxBag20.add((java.lang.Integer) 4);
        maxBag20.remove((java.lang.Integer) 9);
        maxBag20.remove((java.lang.Integer) 10);
        maxBag20.remove((java.lang.Integer) 6);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { (-5), (-5), (-9), 100, 10, (-4), (-5), 0, (-6), (-6), 2, (-5), 1, 9, (-8), 100, 8, 100, (-8), 10, (-9), (-4), 2, (-100), 100 };
        java.util.ArrayList<java.lang.Integer> intList26 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList26);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList26);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList26);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList26);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList26);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList26);
        maxBag34.clear();
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        maxBag16.clear();
        maxBag16.clear();
        maxBag16.add((java.lang.Integer) 0);
        maxBag16.add((java.lang.Integer) 6);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 3, (-3), 9, (-1), 7, 0, 8, 2, (-9), 7, 0, 1, (-9), 6, (-2), (-1), 10, (-5), (-3), 2, (-9), (-5), (-8), 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList26 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList26);
        maxBag28.add((java.lang.Integer) 8);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4, 100, 0, (-5), 5, (-8), (-2) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList18);
        maxBag30.add((java.lang.Integer) (-2));
        maxBag30.clear();
        maxBag30.remove((java.lang.Integer) (-8));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList27);
        maxBag37.remove((java.lang.Integer) (-2));
        maxBag37.remove((java.lang.Integer) 8);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        maxBag29.clear();
        maxBag29.clear();
        maxBag29.remove((java.lang.Integer) 2);
        maxBag29.remove((java.lang.Integer) 1);
        maxBag29.remove((java.lang.Integer) 4);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.add((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass8 = maxBag0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.remove((java.lang.Integer) 5);
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.add((java.lang.Integer) (-1));
        maxBag0.remove((java.lang.Integer) (-6));
        maxBag0.add((java.lang.Integer) 2);
        maxBag0.remove((java.lang.Integer) 2);
        maxBag0.remove((java.lang.Integer) (-7));
        maxBag0.add((java.lang.Integer) (-100));
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { (-1), 10, (-10), (-10), 2, 100, (-6), (-8), (-4), 10, (-8), 5, 5, 5, 100, (-10), (-6), 7, (-7), (-4), (-3), 0, 4, (-6), 3, 1, (-9) };
        java.util.ArrayList<java.lang.Integer> intList28 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList28);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        java.lang.Class<?> wildcardClass19 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        maxBag22.clear();
        maxBag22.add((java.lang.Integer) 3);
        maxBag22.add((java.lang.Integer) 5);
        maxBag22.add((java.lang.Integer) 4);
        maxBag22.remove((java.lang.Integer) 8);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.remove((java.lang.Integer) 3);
        maxBag21.remove((java.lang.Integer) 8);
        maxBag21.clear();
        maxBag21.remove((java.lang.Integer) (-2));
        maxBag21.add((java.lang.Integer) 7);
        maxBag21.add((java.lang.Integer) (-5));
        maxBag21.remove((java.lang.Integer) 3);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, (-8), 10, (-7), 8, (-5), 4, 9, (-8), 0, (-100), (-7), (-2) };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList14);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList14);
        maxBag20.clear();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, (-10), 100, 0, 0, (-2) };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        examples.MaxBag maxBag9 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList7);
        maxBag10.remove((java.lang.Integer) (-3));
        maxBag10.clear();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        maxBag14.remove((java.lang.Integer) 100);
        maxBag14.add((java.lang.Integer) 100);
        maxBag14.clear();
        maxBag14.remove((java.lang.Integer) 7);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 4 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        examples.MaxBag maxBag4 = new examples.MaxBag(intList2);
        examples.MaxBag maxBag5 = new examples.MaxBag(intList2);
        examples.MaxBag maxBag6 = new examples.MaxBag(intList2);
        maxBag6.clear();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 5, 3, (-5), (-8), 0, (-5), (-5), (-3), 4, 6, (-1), 10, (-1), 10, 8, 7, 1, (-3), (-100), 0, 10, 5, 0, 100, 2, (-10), (-2), (-5) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList29);
        maxBag35.add((java.lang.Integer) (-5));
        maxBag35.add((java.lang.Integer) (-1));
        maxBag35.clear();
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList27);
        maxBag34.remove((java.lang.Integer) 2);
        maxBag34.remove((java.lang.Integer) 0);
        maxBag34.remove((java.lang.Integer) (-7));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.clear();
        maxBag21.remove((java.lang.Integer) (-2));
        maxBag21.clear();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList11);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-2), 10, (-5), 4, (-6), 4, (-100), 7, 4, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        maxBag13.clear();
        java.lang.Class<?> wildcardClass15 = maxBag13.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        maxBag25.add((java.lang.Integer) 100);
        maxBag25.add((java.lang.Integer) 0);
        maxBag25.add((java.lang.Integer) (-8));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 3, 7, (-8), 8, (-4), (-1), 3, 1, 100, (-10), (-5), 7, 10, 1, 1, 1, 1, 100, 10, (-6), (-2), (-100), 3, (-5), 8, (-100), (-6), (-1) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList29);
        maxBag34.remove((java.lang.Integer) (-8));
        maxBag34.clear();
        maxBag34.add((java.lang.Integer) 2);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.clear();
        maxBag21.add((java.lang.Integer) (-1));
        maxBag21.clear();
        maxBag21.add((java.lang.Integer) 0);
        maxBag21.clear();
        maxBag21.remove((java.lang.Integer) 7);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.clear();
        maxBag0.clear();
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-1), (-100), 100, 100, 100, (-3), 7, 2, 0, (-7), 6, (-5), (-10), (-100), (-10), (-4), 10, (-6), 8, 2, 9, (-1), 10 };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList24);
        maxBag33.clear();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        maxBag15.add((java.lang.Integer) (-6));
        maxBag15.add((java.lang.Integer) (-3));
        maxBag15.remove((java.lang.Integer) (-3));
        maxBag15.clear();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        maxBag32.remove((java.lang.Integer) 3);
        maxBag32.add((java.lang.Integer) (-10));
        maxBag32.clear();
        maxBag32.clear();
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4, 100, 0, (-5), 5, (-8), (-2) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        maxBag20.clear();
        maxBag20.clear();
        maxBag20.add((java.lang.Integer) 1);
        maxBag20.add((java.lang.Integer) 6);
        maxBag20.remove((java.lang.Integer) 2);
        maxBag20.add((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { (-8), 10, 4, 1, 8, 0, 1, 5, 3, 3, (-3) };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList12);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList12);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList12);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList12);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList12);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList12);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList12);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList12);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList12);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList12);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList12);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList12);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList12);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        maxBag22.add((java.lang.Integer) (-8));
        maxBag22.add((java.lang.Integer) 4);
        maxBag22.add((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-7), 0, (-1), 4, (-1), (-5), (-1) };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag11 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag12 = new examples.MaxBag(intList8);
        maxBag12.remove((java.lang.Integer) 3);
        maxBag12.add((java.lang.Integer) 9);
        maxBag12.add((java.lang.Integer) 100);
        maxBag12.clear();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList11);
        maxBag20.add((java.lang.Integer) 9);
        maxBag20.add((java.lang.Integer) (-8));
        maxBag20.remove((java.lang.Integer) (-10));
        maxBag20.remove((java.lang.Integer) (-2));
        maxBag20.add((java.lang.Integer) (-100));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        maxBag25.remove((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        maxBag22.add((java.lang.Integer) (-8));
        maxBag22.add((java.lang.Integer) 4);
        maxBag22.clear();
        maxBag22.remove((java.lang.Integer) 7);
        maxBag22.remove((java.lang.Integer) (-9));
        maxBag22.remove((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 8, 100, (-100), 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.MaxBag maxBag7 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag8 = new examples.MaxBag(intList5);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-2), 10, (-5), 4, (-6), 4, (-100), 7, 4, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        maxBag13.clear();
        maxBag13.remove((java.lang.Integer) 1);
        maxBag13.add((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        maxBag22.add((java.lang.Integer) (-8));
        maxBag22.add((java.lang.Integer) 1);
        maxBag22.add((java.lang.Integer) (-3));
        maxBag22.remove((java.lang.Integer) (-1));
        maxBag22.remove((java.lang.Integer) (-10));
        maxBag22.clear();
        java.lang.Class<?> wildcardClass34 = maxBag22.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { (-2), 10, (-5), 4, (-6), 4, (-100), 7, 4, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        maxBag14.add((java.lang.Integer) 9);
        maxBag14.add((java.lang.Integer) (-2));
        maxBag14.remove((java.lang.Integer) (-9));
        maxBag14.remove((java.lang.Integer) 0);
        maxBag14.add((java.lang.Integer) 6);
        maxBag14.remove((java.lang.Integer) (-6));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 10);
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 7);
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.remove((java.lang.Integer) 10);
        maxBag0.add((java.lang.Integer) (-2));
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-1), (-100), 100, 100, 100, (-3), 7, 2, 0, (-7), 6, (-5), (-10), (-100), (-10), (-4), 10, (-6), 8, 2, 9, (-1), 10 };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList24);
        java.lang.Class<?> wildcardClass39 = maxBag38.getClass();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-7), 0, (-1), 4, (-1), (-5), (-1) };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag11 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag12 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList8);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList8);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag39 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag40 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag41 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag42 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag43 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag44 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag45 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag46 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag47 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag48 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag49 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag50 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag51 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag52 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag53 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag54 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag55 = new examples.MaxBag(intList27);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        maxBag33.remove((java.lang.Integer) 0);
        maxBag33.add((java.lang.Integer) (-9));
        maxBag33.remove((java.lang.Integer) 4);
        maxBag33.remove((java.lang.Integer) (-10));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        maxBag29.clear();
        maxBag29.clear();
        maxBag29.remove((java.lang.Integer) 0);
        maxBag29.clear();
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        maxBag18.remove((java.lang.Integer) 8);
        maxBag18.add((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-1), (-100), 100, 100, 100, (-3), 7, 2, 0, (-7), 6, (-5), (-10), (-100), (-10), (-4), 10, (-6), 8, 2, 9, (-1), 10 };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag39 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag40 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag41 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag42 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag43 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag44 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag45 = new examples.MaxBag(intList24);
        maxBag45.clear();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        java.lang.Class<?> wildcardClass24 = intList18.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.remove((java.lang.Integer) 5);
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.add((java.lang.Integer) (-1));
        maxBag0.remove((java.lang.Integer) (-6));
        maxBag0.add((java.lang.Integer) (-100));
        java.lang.Class<?> wildcardClass13 = maxBag0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList18);
        maxBag34.clear();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 5, 3, (-5), (-8), 0, (-5), (-5), (-3), 4, 6, (-1), 10, (-1), 10, 8, 7, 1, (-3), (-100), 0, 10, 5, 0, 100, 2, (-10), (-2), (-5) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList29);
        maxBag33.add((java.lang.Integer) 5);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag39 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag40 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag41 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag42 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag43 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag44 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag45 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag46 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag47 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag48 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag49 = new examples.MaxBag(intList18);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.remove((java.lang.Integer) 5);
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.remove((java.lang.Integer) 5);
        maxBag0.remove((java.lang.Integer) 5);
        maxBag0.clear();
        maxBag0.clear();
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100, 10, 8, 2, (-4), 6, 10, 4, 3, 5, 4, 100, (-9), (-5), (-9), 4, (-100), 9, (-8), 4, (-9) };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList22);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList22);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList22);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList22);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag17 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag18 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag19 = new examples.MaxBag(intList11);
        maxBag19.add((java.lang.Integer) (-1));
        maxBag19.remove((java.lang.Integer) 0);
        maxBag19.add((java.lang.Integer) 0);
        maxBag19.remove((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-6), 5, 100, (-10), 100, (-8), 5, (-5), 2, 8, 3, 6, 5, (-8), 0, (-2), (-7) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList18);
        maxBag37.add((java.lang.Integer) 4);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4, 100, 0, (-5), 5, (-8), (-2) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList18);
        maxBag27.remove((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        maxBag31.remove((java.lang.Integer) (-8));
        maxBag31.add((java.lang.Integer) (-10));
        maxBag31.clear();
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, (-10), 100, 0, 0, (-2) };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        examples.MaxBag maxBag9 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList7);
        examples.MaxBag maxBag11 = new examples.MaxBag(intList7);
        maxBag11.remove((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-1), (-100), 100, 100, 100, (-3), 7, 2, 0, (-7), 6, (-5), (-10), (-100), (-10), (-4), 10, (-6), 8, 2, 9, (-1), 10 };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag27 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag28 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag39 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag40 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag41 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag42 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag43 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag44 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag45 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag46 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag47 = new examples.MaxBag(intList24);
        examples.MaxBag maxBag48 = new examples.MaxBag(intList24);
        java.lang.Class<?> wildcardClass49 = maxBag48.getClass();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        maxBag13.add((java.lang.Integer) 2);
        maxBag13.add((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 5, 3, (-5), (-8), 0, (-5), (-5), (-3), 4, 6, (-1), 10, (-1), 10, 8, 7, 1, (-3), (-100), 0, 10, 5, 0, 100, 2, (-10), (-2), (-5) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList29);
        maxBag38.clear();
        maxBag38.add((java.lang.Integer) (-7));
        maxBag38.add((java.lang.Integer) (-3));
        maxBag38.remove((java.lang.Integer) (-3));
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 5, 3, (-5), (-8), 0, (-5), (-5), (-3), 4, 6, (-1), 10, (-1), 10, 8, 7, 1, (-3), (-100), 0, 10, 5, 0, 100, 2, (-10), (-2), (-5) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag36 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag37 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag38 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag39 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag40 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag41 = new examples.MaxBag(intList29);
        java.lang.Class<?> wildcardClass42 = maxBag41.getClass();
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-8), 100, 10, (-8) };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.MaxBag maxBag7 = new examples.MaxBag(intList5);
        examples.MaxBag maxBag8 = new examples.MaxBag(intList5);
        maxBag8.add((java.lang.Integer) 4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-6), 5, 100, (-10), 100, (-8), 5, (-5), 2, 8, 3, 6, 5, (-8), 0, (-2), (-7) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.add((java.lang.Integer) 9);
        maxBag21.remove((java.lang.Integer) (-6));
        maxBag21.clear();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.remove((java.lang.Integer) 5);
        maxBag0.remove((java.lang.Integer) 0);
        maxBag0.remove((java.lang.Integer) (-1));
    }
}

