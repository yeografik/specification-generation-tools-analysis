package examples;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
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
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
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
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
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
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
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
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
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
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
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
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
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
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.remove((java.lang.Integer) 5);
        maxBag0.remove((java.lang.Integer) 0);
        maxBag0.remove((java.lang.Integer) (-1));
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
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
        java.lang.Class<?> wildcardClass21 = maxBag18.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
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
        maxBag29.remove((java.lang.Integer) 2);
        maxBag29.remove((java.lang.Integer) (-1));
        maxBag29.remove((java.lang.Integer) (-5));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-2), (-6) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.MaxBag maxBag5 = new examples.MaxBag(intList3);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
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
        maxBag39.remove((java.lang.Integer) (-10));
        maxBag39.add((java.lang.Integer) (-100));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
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
        java.lang.Class<?> wildcardClass24 = maxBag23.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        maxBag22.clear();
        maxBag22.add((java.lang.Integer) 3);
        maxBag22.clear();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 100);
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.add((java.lang.Integer) 8);
        maxBag0.add((java.lang.Integer) (-7));
        maxBag0.remove((java.lang.Integer) 5);
        maxBag0.remove((java.lang.Integer) 2);
        maxBag0.clear();
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
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
        maxBag37.add((java.lang.Integer) 5);
        java.lang.Class<?> wildcardClass40 = maxBag37.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.remove((java.lang.Integer) 5);
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-1));
        maxBag0.remove((java.lang.Integer) (-7));
        maxBag0.add((java.lang.Integer) 1);
        maxBag0.remove((java.lang.Integer) 5);
        maxBag0.remove((java.lang.Integer) 0);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.add((java.lang.Integer) 100);
        maxBag0.add((java.lang.Integer) (-1));
        maxBag0.remove((java.lang.Integer) 5);
        maxBag0.remove((java.lang.Integer) 3);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        maxBag22.add((java.lang.Integer) (-7));
        maxBag22.remove((java.lang.Integer) 100);
        maxBag22.add((java.lang.Integer) 7);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.remove((java.lang.Integer) 1);
        maxBag21.clear();
        maxBag21.clear();
        maxBag21.clear();
        maxBag21.remove((java.lang.Integer) (-4));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.clear();
        maxBag21.clear();
        maxBag21.add((java.lang.Integer) 0);
        maxBag21.remove((java.lang.Integer) (-7));
        maxBag21.add((java.lang.Integer) 6);
        maxBag21.add((java.lang.Integer) 8);
        maxBag21.remove((java.lang.Integer) 6);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }
}

