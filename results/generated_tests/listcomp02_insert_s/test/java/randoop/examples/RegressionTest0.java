package examples;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        java.lang.Class<?> wildcardClass3 = r2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        examples.S s2 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean4 = s2.equals((java.lang.Object) (-8));
        boolean boolean6 = s2.equals((java.lang.Object) (-5.4d));
        java.lang.Class<?> wildcardClass7 = s2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        examples.R r2 = new examples.R((java.lang.Integer) (-9), "hi!");
        java.lang.Class<?> wildcardClass3 = r2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_17.insert_r(r20);
        java.lang.Class<?> wildcardClass22 = r20.getClass();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) (-100));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        examples.R r2 = new examples.R((java.lang.Integer) 1, "hi!");
        java.lang.String str3 = r2.getB();
        boolean boolean5 = r2.equals((java.lang.Object) 2L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean22 = r20.equals((java.lang.Object) 6);
        examples.R r25 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r28 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean30 = r28.equals((java.lang.Object) 6);
        examples.R r33 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r36 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray37 = new examples.R[] { r36 };
        java.util.ArrayList<examples.R> rList38 = new java.util.ArrayList<examples.R>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList38, rArray37);
        examples.S s42 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean44 = s42.equals((java.lang.Object) (-8));
        examples.S s47 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray48 = new examples.S[] { s42, s47 };
        java.util.ArrayList<examples.S> sList49 = new java.util.ArrayList<examples.S>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList49, sArray48);
        examples.ListComp02 listComp02_51 = new examples.ListComp02(rList38, sList49);
        examples.R r54 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_51.insert_r(r54);
        java.lang.String str56 = r54.getB();
        examples.R r59 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean61 = r59.equals((java.lang.Object) 6);
        examples.R[] rArray62 = new examples.R[] { r20, r25, r28, r33, r54, r59 };
        java.util.ArrayList<examples.R> rList63 = new java.util.ArrayList<examples.R>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList63, rArray62);
        examples.R r67 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray68 = new examples.R[] { r67 };
        java.util.ArrayList<examples.R> rList69 = new java.util.ArrayList<examples.R>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList69, rArray68);
        examples.S s73 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean75 = s73.equals((java.lang.Object) (-8));
        examples.S s78 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray79 = new examples.S[] { s73, s78 };
        java.util.ArrayList<examples.S> sList80 = new java.util.ArrayList<examples.S>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList80, sArray79);
        examples.ListComp02 listComp02_82 = new examples.ListComp02(rList69, sList80);
        examples.ListComp02 listComp02_83 = new examples.ListComp02(rList63, sList80);
        examples.ListComp02 listComp02_84 = new examples.ListComp02(rList4, sList80);
        examples.R r87 = new examples.R((java.lang.Integer) (-10), "");
        listComp02_84.insert_r(r87);
        examples.R r91 = new examples.R((java.lang.Integer) 100, "hi!");
        listComp02_84.insert_r(r91);
        java.lang.Class<?> wildcardClass93 = r91.getClass();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(rArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(sArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(rArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(rArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(sArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean22 = r20.equals((java.lang.Object) 6);
        examples.R r25 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r28 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean30 = r28.equals((java.lang.Object) 6);
        examples.R r33 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r36 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray37 = new examples.R[] { r36 };
        java.util.ArrayList<examples.R> rList38 = new java.util.ArrayList<examples.R>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList38, rArray37);
        examples.S s42 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean44 = s42.equals((java.lang.Object) (-8));
        examples.S s47 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray48 = new examples.S[] { s42, s47 };
        java.util.ArrayList<examples.S> sList49 = new java.util.ArrayList<examples.S>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList49, sArray48);
        examples.ListComp02 listComp02_51 = new examples.ListComp02(rList38, sList49);
        examples.R r54 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_51.insert_r(r54);
        java.lang.String str56 = r54.getB();
        examples.R r59 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean61 = r59.equals((java.lang.Object) 6);
        examples.R[] rArray62 = new examples.R[] { r20, r25, r28, r33, r54, r59 };
        java.util.ArrayList<examples.R> rList63 = new java.util.ArrayList<examples.R>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList63, rArray62);
        examples.R r67 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray68 = new examples.R[] { r67 };
        java.util.ArrayList<examples.R> rList69 = new java.util.ArrayList<examples.R>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList69, rArray68);
        examples.S s73 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean75 = s73.equals((java.lang.Object) (-8));
        examples.S s78 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray79 = new examples.S[] { s73, s78 };
        java.util.ArrayList<examples.S> sList80 = new java.util.ArrayList<examples.S>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList80, sArray79);
        examples.ListComp02 listComp02_82 = new examples.ListComp02(rList69, sList80);
        examples.ListComp02 listComp02_83 = new examples.ListComp02(rList63, sList80);
        examples.ListComp02 listComp02_84 = new examples.ListComp02(rList4, sList80);
        examples.R r87 = new examples.R((java.lang.Integer) (-10), "");
        listComp02_84.insert_r(r87);
        java.lang.Class<?> wildcardClass89 = listComp02_84.getClass();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(rArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(sArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(rArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(rArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(sArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean4 = r2.equals((java.lang.Object) 6);
        java.lang.Object obj5 = null;
        boolean boolean6 = r2.equals(obj5);
        examples.R r9 = new examples.R((java.lang.Integer) 1, "hi!");
        java.lang.String str10 = r9.getB();
        boolean boolean11 = r2.equals((java.lang.Object) r9);
        boolean boolean13 = r2.equals((java.lang.Object) (-8));
        java.lang.Class<?> wildcardClass14 = r2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean4 = r2.equals((java.lang.Object) 6);
        java.lang.Object obj5 = null;
        boolean boolean6 = r2.equals(obj5);
        boolean boolean8 = r2.equals((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass9 = r2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean4 = r2.equals((java.lang.Object) 6);
        examples.R r7 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r10 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean12 = r10.equals((java.lang.Object) 6);
        examples.R r15 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r18 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray19 = new examples.R[] { r18 };
        java.util.ArrayList<examples.R> rList20 = new java.util.ArrayList<examples.R>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList20, rArray19);
        examples.S s24 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean26 = s24.equals((java.lang.Object) (-8));
        examples.S s29 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray30 = new examples.S[] { s24, s29 };
        java.util.ArrayList<examples.S> sList31 = new java.util.ArrayList<examples.S>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList31, sArray30);
        examples.ListComp02 listComp02_33 = new examples.ListComp02(rList20, sList31);
        examples.R r36 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_33.insert_r(r36);
        java.lang.String str38 = r36.getB();
        examples.R r41 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean43 = r41.equals((java.lang.Object) 6);
        examples.R[] rArray44 = new examples.R[] { r2, r7, r10, r15, r36, r41 };
        java.util.ArrayList<examples.R> rList45 = new java.util.ArrayList<examples.R>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList45, rArray44);
        examples.R r49 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray50 = new examples.R[] { r49 };
        java.util.ArrayList<examples.R> rList51 = new java.util.ArrayList<examples.R>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList51, rArray50);
        examples.S s55 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean57 = s55.equals((java.lang.Object) (-8));
        examples.S s60 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray61 = new examples.S[] { s55, s60 };
        java.util.ArrayList<examples.S> sList62 = new java.util.ArrayList<examples.S>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList62, sArray61);
        examples.ListComp02 listComp02_64 = new examples.ListComp02(rList51, sList62);
        examples.ListComp02 listComp02_65 = new examples.ListComp02(rList45, sList62);
        java.lang.Class<?> wildcardClass66 = rList45.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(rArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(sArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(rArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(rArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(sArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        examples.R r2 = new examples.R((java.lang.Integer) 100, "hi!");
        java.lang.String str3 = r2.getB();
        java.lang.Class<?> wildcardClass4 = r2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        examples.S s2 = new examples.S("", (java.lang.Integer) 1);
        boolean boolean4 = s2.equals((java.lang.Object) (-10));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        examples.R r2 = new examples.R((java.lang.Integer) 1, "hi!");
        examples.R r5 = new examples.R((java.lang.Integer) (-6), "");
        boolean boolean6 = r2.equals((java.lang.Object) (-6));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.R r8 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean10 = r8.equals((java.lang.Object) 6);
        examples.R r13 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r16 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean18 = r16.equals((java.lang.Object) 6);
        examples.R r21 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r24 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray25 = new examples.R[] { r24 };
        java.util.ArrayList<examples.R> rList26 = new java.util.ArrayList<examples.R>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList26, rArray25);
        examples.S s30 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean32 = s30.equals((java.lang.Object) (-8));
        examples.S s35 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray36 = new examples.S[] { s30, s35 };
        java.util.ArrayList<examples.S> sList37 = new java.util.ArrayList<examples.S>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList37, sArray36);
        examples.ListComp02 listComp02_39 = new examples.ListComp02(rList26, sList37);
        examples.R r42 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_39.insert_r(r42);
        java.lang.String str44 = r42.getB();
        examples.R r47 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean49 = r47.equals((java.lang.Object) 6);
        examples.R[] rArray50 = new examples.R[] { r8, r13, r16, r21, r42, r47 };
        java.util.ArrayList<examples.R> rList51 = new java.util.ArrayList<examples.R>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList51, rArray50);
        examples.R r55 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray56 = new examples.R[] { r55 };
        java.util.ArrayList<examples.R> rList57 = new java.util.ArrayList<examples.R>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList57, rArray56);
        examples.S s61 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean63 = s61.equals((java.lang.Object) (-8));
        examples.S s66 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray67 = new examples.S[] { s61, s66 };
        java.util.ArrayList<examples.S> sList68 = new java.util.ArrayList<examples.S>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList68, sArray67);
        examples.ListComp02 listComp02_70 = new examples.ListComp02(rList57, sList68);
        examples.ListComp02 listComp02_71 = new examples.ListComp02(rList51, sList68);
        examples.ListComp02 listComp02_72 = new examples.ListComp02(rList4, sList68);
        examples.R r75 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray76 = new examples.R[] { r75 };
        java.util.ArrayList<examples.R> rList77 = new java.util.ArrayList<examples.R>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList77, rArray76);
        examples.S s81 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean83 = s81.equals((java.lang.Object) (-8));
        examples.S s86 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray87 = new examples.S[] { s81, s86 };
        java.util.ArrayList<examples.S> sList88 = new java.util.ArrayList<examples.S>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList88, sArray87);
        examples.ListComp02 listComp02_90 = new examples.ListComp02(rList77, sList88);
        examples.R r93 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_90.insert_r(r93);
        listComp02_72.insert_r(r93);
        java.lang.String str96 = r93.getB();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(sArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(rArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(rArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(sArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(rArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(sArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "hi!" + "'", str96, "hi!");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        examples.S s2 = new examples.S("", (java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass3 = s2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean4 = r2.equals((java.lang.Object) 6);
        java.lang.Object obj5 = null;
        boolean boolean6 = r2.equals(obj5);
        examples.R r9 = new examples.R((java.lang.Integer) 1, "hi!");
        java.lang.String str10 = r9.getB();
        boolean boolean11 = r2.equals((java.lang.Object) r9);
        java.lang.Class<?> wildcardClass12 = r9.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        examples.R r2 = new examples.R((java.lang.Integer) (-6), "");
        examples.R r5 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray6 = new examples.R[] { r5 };
        java.util.ArrayList<examples.R> rList7 = new java.util.ArrayList<examples.R>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList7, rArray6);
        examples.S s11 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean13 = s11.equals((java.lang.Object) (-8));
        examples.S s16 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray17 = new examples.S[] { s11, s16 };
        java.util.ArrayList<examples.S> sList18 = new java.util.ArrayList<examples.S>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList18, sArray17);
        examples.ListComp02 listComp02_20 = new examples.ListComp02(rList7, sList18);
        examples.S s23 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str24 = s23.getB();
        java.lang.String str25 = s23.getB();
        listComp02_20.insert_s(s23);
        boolean boolean27 = r2.equals((java.lang.Object) listComp02_20);
        java.lang.String str28 = r2.getB();
        org.junit.Assert.assertNotNull(rArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(sArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean4 = r2.equals((java.lang.Object) 6);
        examples.R r7 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r10 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean12 = r10.equals((java.lang.Object) 6);
        examples.R r15 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r18 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray19 = new examples.R[] { r18 };
        java.util.ArrayList<examples.R> rList20 = new java.util.ArrayList<examples.R>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList20, rArray19);
        examples.S s24 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean26 = s24.equals((java.lang.Object) (-8));
        examples.S s29 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray30 = new examples.S[] { s24, s29 };
        java.util.ArrayList<examples.S> sList31 = new java.util.ArrayList<examples.S>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList31, sArray30);
        examples.ListComp02 listComp02_33 = new examples.ListComp02(rList20, sList31);
        examples.R r36 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_33.insert_r(r36);
        java.lang.String str38 = r36.getB();
        examples.R r41 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean43 = r41.equals((java.lang.Object) 6);
        examples.R[] rArray44 = new examples.R[] { r2, r7, r10, r15, r36, r41 };
        java.util.ArrayList<examples.R> rList45 = new java.util.ArrayList<examples.R>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList45, rArray44);
        examples.R r49 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray50 = new examples.R[] { r49 };
        java.util.ArrayList<examples.R> rList51 = new java.util.ArrayList<examples.R>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList51, rArray50);
        examples.S s55 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean57 = s55.equals((java.lang.Object) (-8));
        examples.S s60 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray61 = new examples.S[] { s55, s60 };
        java.util.ArrayList<examples.S> sList62 = new java.util.ArrayList<examples.S>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList62, sArray61);
        examples.ListComp02 listComp02_64 = new examples.ListComp02(rList51, sList62);
        examples.ListComp02 listComp02_65 = new examples.ListComp02(rList45, sList62);
        listComp02_65.clear();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(rArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(sArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(rArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(rArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(sArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        examples.S s2 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str3 = s2.getB();
        boolean boolean5 = s2.equals((java.lang.Object) 10.0d);
        java.lang.String str6 = s2.getB();
        examples.R r9 = new examples.R((java.lang.Integer) 0, "");
        boolean boolean10 = s2.equals((java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        examples.R r2 = new examples.R((java.lang.Integer) (-7), "");
        boolean boolean4 = r2.equals((java.lang.Object) 4.8d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) (-4));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        examples.R r2 = new examples.R((java.lang.Integer) 2, "");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        examples.S s2 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str3 = s2.getB();
        examples.S s6 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str7 = s6.getB();
        boolean boolean9 = s6.equals((java.lang.Object) 10.0d);
        boolean boolean11 = s6.equals((java.lang.Object) (-2.1d));
        boolean boolean12 = s2.equals((java.lang.Object) boolean11);
        java.lang.String str13 = s2.getB();
        java.lang.String str14 = s2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean22 = r20.equals((java.lang.Object) 6);
        examples.R r25 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r28 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean30 = r28.equals((java.lang.Object) 6);
        examples.R r33 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r36 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray37 = new examples.R[] { r36 };
        java.util.ArrayList<examples.R> rList38 = new java.util.ArrayList<examples.R>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList38, rArray37);
        examples.S s42 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean44 = s42.equals((java.lang.Object) (-8));
        examples.S s47 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray48 = new examples.S[] { s42, s47 };
        java.util.ArrayList<examples.S> sList49 = new java.util.ArrayList<examples.S>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList49, sArray48);
        examples.ListComp02 listComp02_51 = new examples.ListComp02(rList38, sList49);
        examples.R r54 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_51.insert_r(r54);
        java.lang.String str56 = r54.getB();
        examples.R r59 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean61 = r59.equals((java.lang.Object) 6);
        examples.R[] rArray62 = new examples.R[] { r20, r25, r28, r33, r54, r59 };
        java.util.ArrayList<examples.R> rList63 = new java.util.ArrayList<examples.R>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList63, rArray62);
        examples.R r67 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray68 = new examples.R[] { r67 };
        java.util.ArrayList<examples.R> rList69 = new java.util.ArrayList<examples.R>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList69, rArray68);
        examples.S s73 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean75 = s73.equals((java.lang.Object) (-8));
        examples.S s78 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray79 = new examples.S[] { s73, s78 };
        java.util.ArrayList<examples.S> sList80 = new java.util.ArrayList<examples.S>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList80, sArray79);
        examples.ListComp02 listComp02_82 = new examples.ListComp02(rList69, sList80);
        examples.ListComp02 listComp02_83 = new examples.ListComp02(rList63, sList80);
        examples.ListComp02 listComp02_84 = new examples.ListComp02(rList4, sList80);
        examples.R r87 = new examples.R((java.lang.Integer) (-10), "");
        listComp02_84.insert_r(r87);
        java.lang.String str89 = r87.getB();
        java.lang.String str90 = r87.getB();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(rArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(sArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(rArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(rArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(sArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean4 = r2.equals((java.lang.Object) 6);
        examples.R r7 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r10 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean12 = r10.equals((java.lang.Object) 6);
        examples.R r15 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r18 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray19 = new examples.R[] { r18 };
        java.util.ArrayList<examples.R> rList20 = new java.util.ArrayList<examples.R>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList20, rArray19);
        examples.S s24 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean26 = s24.equals((java.lang.Object) (-8));
        examples.S s29 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray30 = new examples.S[] { s24, s29 };
        java.util.ArrayList<examples.S> sList31 = new java.util.ArrayList<examples.S>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList31, sArray30);
        examples.ListComp02 listComp02_33 = new examples.ListComp02(rList20, sList31);
        examples.R r36 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_33.insert_r(r36);
        java.lang.String str38 = r36.getB();
        examples.R r41 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean43 = r41.equals((java.lang.Object) 6);
        examples.R[] rArray44 = new examples.R[] { r2, r7, r10, r15, r36, r41 };
        java.util.ArrayList<examples.R> rList45 = new java.util.ArrayList<examples.R>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList45, rArray44);
        examples.R r49 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray50 = new examples.R[] { r49 };
        java.util.ArrayList<examples.R> rList51 = new java.util.ArrayList<examples.R>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList51, rArray50);
        examples.S s55 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean57 = s55.equals((java.lang.Object) (-8));
        examples.S s60 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray61 = new examples.S[] { s55, s60 };
        java.util.ArrayList<examples.S> sList62 = new java.util.ArrayList<examples.S>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList62, sArray61);
        examples.ListComp02 listComp02_64 = new examples.ListComp02(rList51, sList62);
        examples.ListComp02 listComp02_65 = new examples.ListComp02(rList45, sList62);
        examples.S s68 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str69 = s68.getB();
        boolean boolean71 = s68.equals((java.lang.Object) 10.0d);
        listComp02_65.insert_s(s68);
        java.lang.Class<?> wildcardClass73 = listComp02_65.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(rArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(sArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(rArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(rArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(sArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        examples.S s2 = new examples.S("", (java.lang.Integer) 6);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        examples.R r2 = new examples.R((java.lang.Integer) (-6), "");
        java.lang.String str3 = r2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        examples.S s2 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str3 = s2.getB();
        boolean boolean5 = s2.equals((java.lang.Object) 10.0d);
        java.lang.String str6 = s2.getB();
        java.lang.Class<?> wildcardClass7 = s2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        examples.R r2 = new examples.R((java.lang.Integer) 100, "");
        java.lang.String str3 = r2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean22 = r20.equals((java.lang.Object) 6);
        examples.R r25 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r28 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean30 = r28.equals((java.lang.Object) 6);
        examples.R r33 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r36 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray37 = new examples.R[] { r36 };
        java.util.ArrayList<examples.R> rList38 = new java.util.ArrayList<examples.R>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList38, rArray37);
        examples.S s42 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean44 = s42.equals((java.lang.Object) (-8));
        examples.S s47 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray48 = new examples.S[] { s42, s47 };
        java.util.ArrayList<examples.S> sList49 = new java.util.ArrayList<examples.S>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList49, sArray48);
        examples.ListComp02 listComp02_51 = new examples.ListComp02(rList38, sList49);
        examples.R r54 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_51.insert_r(r54);
        java.lang.String str56 = r54.getB();
        examples.R r59 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean61 = r59.equals((java.lang.Object) 6);
        examples.R[] rArray62 = new examples.R[] { r20, r25, r28, r33, r54, r59 };
        java.util.ArrayList<examples.R> rList63 = new java.util.ArrayList<examples.R>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList63, rArray62);
        examples.R r67 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray68 = new examples.R[] { r67 };
        java.util.ArrayList<examples.R> rList69 = new java.util.ArrayList<examples.R>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList69, rArray68);
        examples.S s73 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean75 = s73.equals((java.lang.Object) (-8));
        examples.S s78 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray79 = new examples.S[] { s73, s78 };
        java.util.ArrayList<examples.S> sList80 = new java.util.ArrayList<examples.S>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList80, sArray79);
        examples.ListComp02 listComp02_82 = new examples.ListComp02(rList69, sList80);
        examples.ListComp02 listComp02_83 = new examples.ListComp02(rList63, sList80);
        examples.ListComp02 listComp02_84 = new examples.ListComp02(rList4, sList80);
        java.lang.Class<?> wildcardClass85 = sList80.getClass();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(rArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(sArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(rArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(rArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(sArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        examples.R r2 = new examples.R((java.lang.Integer) (-6), "");
        examples.R r5 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray6 = new examples.R[] { r5 };
        java.util.ArrayList<examples.R> rList7 = new java.util.ArrayList<examples.R>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList7, rArray6);
        examples.S s11 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean13 = s11.equals((java.lang.Object) (-8));
        examples.S s16 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray17 = new examples.S[] { s11, s16 };
        java.util.ArrayList<examples.S> sList18 = new java.util.ArrayList<examples.S>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList18, sArray17);
        examples.ListComp02 listComp02_20 = new examples.ListComp02(rList7, sList18);
        examples.R r23 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_20.insert_r(r23);
        boolean boolean25 = r2.equals((java.lang.Object) listComp02_20);
        examples.S s28 = new examples.S("", (java.lang.Integer) 9);
        listComp02_20.insert_s(s28);
        java.lang.Class<?> wildcardClass30 = s28.getClass();
        org.junit.Assert.assertNotNull(rArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(sArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        examples.S s2 = new examples.S("", (java.lang.Integer) (-1));
        boolean boolean4 = s2.equals((java.lang.Object) 8L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        java.lang.Object obj3 = null;
        boolean boolean4 = r2.equals(obj3);
        examples.R r7 = new examples.R((java.lang.Integer) 100, "hi!");
        java.lang.String str8 = r7.getB();
        boolean boolean9 = r2.equals((java.lang.Object) r7);
        java.lang.Class<?> wildcardClass10 = r7.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) 7);
        java.lang.Object obj3 = null;
        boolean boolean4 = s2.equals(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        examples.S s2 = new examples.S("", (java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass3 = s2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_17.insert_r(r20);
        listComp02_17.clear();
        examples.S s25 = new examples.S("", (java.lang.Integer) (-8));
        listComp02_17.insert_s(s25);
        boolean boolean28 = s25.equals((java.lang.Object) 7L);
        java.lang.String str29 = s25.getB();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        listComp02_17.clear();
        java.lang.Class<?> wildcardClass19 = listComp02_17.getClass();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray21 = new examples.R[] { r20 };
        java.util.ArrayList<examples.R> rList22 = new java.util.ArrayList<examples.R>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList22, rArray21);
        examples.S s26 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean28 = s26.equals((java.lang.Object) (-8));
        examples.S s31 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray32 = new examples.S[] { s26, s31 };
        java.util.ArrayList<examples.S> sList33 = new java.util.ArrayList<examples.S>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList33, sArray32);
        examples.ListComp02 listComp02_35 = new examples.ListComp02(rList22, sList33);
        examples.ListComp02 listComp02_36 = new examples.ListComp02(rList4, sList33);
        examples.R r39 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray40 = new examples.R[] { r39 };
        java.util.ArrayList<examples.R> rList41 = new java.util.ArrayList<examples.R>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList41, rArray40);
        examples.S s45 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean47 = s45.equals((java.lang.Object) (-8));
        examples.S s50 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray51 = new examples.S[] { s45, s50 };
        java.util.ArrayList<examples.S> sList52 = new java.util.ArrayList<examples.S>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList52, sArray51);
        examples.ListComp02 listComp02_54 = new examples.ListComp02(rList41, sList52);
        examples.R r57 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray58 = new examples.R[] { r57 };
        java.util.ArrayList<examples.R> rList59 = new java.util.ArrayList<examples.R>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList59, rArray58);
        examples.S s63 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean65 = s63.equals((java.lang.Object) (-8));
        examples.S s68 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray69 = new examples.S[] { s63, s68 };
        java.util.ArrayList<examples.S> sList70 = new java.util.ArrayList<examples.S>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList70, sArray69);
        examples.ListComp02 listComp02_72 = new examples.ListComp02(rList59, sList70);
        examples.ListComp02 listComp02_73 = new examples.ListComp02(rList41, sList70);
        examples.ListComp02 listComp02_74 = new examples.ListComp02(rList4, sList70);
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(rArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(sArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(rArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(sArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(rArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(sArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        examples.S s2 = new examples.S("", (java.lang.Integer) (-5));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray21 = new examples.R[] { r20 };
        java.util.ArrayList<examples.R> rList22 = new java.util.ArrayList<examples.R>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList22, rArray21);
        examples.S s26 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean28 = s26.equals((java.lang.Object) (-8));
        examples.S s31 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray32 = new examples.S[] { s26, s31 };
        java.util.ArrayList<examples.S> sList33 = new java.util.ArrayList<examples.S>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList33, sArray32);
        examples.ListComp02 listComp02_35 = new examples.ListComp02(rList22, sList33);
        examples.ListComp02 listComp02_36 = new examples.ListComp02(rList4, sList33);
        java.lang.Class<?> wildcardClass37 = sList33.getClass();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(rArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(sArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        examples.S s2 = new examples.S("", (java.lang.Integer) 2);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_17.insert_r(r20);
        java.lang.String str22 = r20.getB();
        examples.S s25 = new examples.S("hi!", (java.lang.Integer) 10);
        boolean boolean26 = r20.equals((java.lang.Object) 10);
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_17.insert_r(r20);
        java.lang.String str22 = r20.getB();
        java.lang.Object obj23 = null;
        boolean boolean24 = r20.equals(obj23);
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.util.ArrayList<examples.R> rList0 = null;
        examples.R r3 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray4 = new examples.R[] { r3 };
        java.util.ArrayList<examples.R> rList5 = new java.util.ArrayList<examples.R>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList5, rArray4);
        examples.S s9 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean11 = s9.equals((java.lang.Object) (-8));
        examples.S s14 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray15 = new examples.S[] { s9, s14 };
        java.util.ArrayList<examples.S> sList16 = new java.util.ArrayList<examples.S>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList16, sArray15);
        examples.ListComp02 listComp02_18 = new examples.ListComp02(rList5, sList16);
        examples.R r21 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray22 = new examples.R[] { r21 };
        java.util.ArrayList<examples.R> rList23 = new java.util.ArrayList<examples.R>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList23, rArray22);
        examples.S s27 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean29 = s27.equals((java.lang.Object) (-8));
        examples.S s32 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray33 = new examples.S[] { s27, s32 };
        java.util.ArrayList<examples.S> sList34 = new java.util.ArrayList<examples.S>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList34, sArray33);
        examples.ListComp02 listComp02_36 = new examples.ListComp02(rList23, sList34);
        examples.ListComp02 listComp02_37 = new examples.ListComp02(rList5, sList34);
        examples.ListComp02 listComp02_38 = new examples.ListComp02(rList0, sList34);
        examples.R r41 = new examples.R((java.lang.Integer) (-2), "");
        // The following exception was thrown during execution in test generation
        try {
            listComp02_38.insert_r(r41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(sArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(rArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(sArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean4 = r2.equals((java.lang.Object) 6);
        examples.R r7 = new examples.R((java.lang.Integer) (-6), "");
        examples.R r10 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray11 = new examples.R[] { r10 };
        java.util.ArrayList<examples.R> rList12 = new java.util.ArrayList<examples.R>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList12, rArray11);
        examples.S s16 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean18 = s16.equals((java.lang.Object) (-8));
        examples.S s21 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray22 = new examples.S[] { s16, s21 };
        java.util.ArrayList<examples.S> sList23 = new java.util.ArrayList<examples.S>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList23, sArray22);
        examples.ListComp02 listComp02_25 = new examples.ListComp02(rList12, sList23);
        examples.R r28 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_25.insert_r(r28);
        boolean boolean30 = r7.equals((java.lang.Object) listComp02_25);
        boolean boolean31 = r2.equals((java.lang.Object) r7);
        java.lang.Class<?> wildcardClass32 = r2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(sArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        examples.R r2 = new examples.R((java.lang.Integer) (-6), "");
        examples.R r5 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray6 = new examples.R[] { r5 };
        java.util.ArrayList<examples.R> rList7 = new java.util.ArrayList<examples.R>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList7, rArray6);
        examples.S s11 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean13 = s11.equals((java.lang.Object) (-8));
        examples.S s16 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray17 = new examples.S[] { s11, s16 };
        java.util.ArrayList<examples.S> sList18 = new java.util.ArrayList<examples.S>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList18, sArray17);
        examples.ListComp02 listComp02_20 = new examples.ListComp02(rList7, sList18);
        examples.S s23 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str24 = s23.getB();
        java.lang.String str25 = s23.getB();
        listComp02_20.insert_s(s23);
        boolean boolean27 = r2.equals((java.lang.Object) listComp02_20);
        java.lang.Class<?> wildcardClass28 = r2.getClass();
        org.junit.Assert.assertNotNull(rArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(sArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        examples.S s2 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean4 = s2.equals((java.lang.Object) (-8));
        java.lang.Class<?> wildcardClass5 = s2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        examples.S s2 = new examples.S("", (java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass3 = s2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        examples.R r2 = new examples.R((java.lang.Integer) 100, "");
        examples.R r5 = new examples.R((java.lang.Integer) (-2), "");
        boolean boolean6 = r2.equals((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean4 = r2.equals((java.lang.Object) 6);
        examples.R r7 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r10 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean12 = r10.equals((java.lang.Object) 6);
        examples.R r15 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r18 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray19 = new examples.R[] { r18 };
        java.util.ArrayList<examples.R> rList20 = new java.util.ArrayList<examples.R>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList20, rArray19);
        examples.S s24 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean26 = s24.equals((java.lang.Object) (-8));
        examples.S s29 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray30 = new examples.S[] { s24, s29 };
        java.util.ArrayList<examples.S> sList31 = new java.util.ArrayList<examples.S>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList31, sArray30);
        examples.ListComp02 listComp02_33 = new examples.ListComp02(rList20, sList31);
        examples.R r36 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_33.insert_r(r36);
        java.lang.String str38 = r36.getB();
        examples.R r41 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean43 = r41.equals((java.lang.Object) 6);
        examples.R[] rArray44 = new examples.R[] { r2, r7, r10, r15, r36, r41 };
        java.util.ArrayList<examples.R> rList45 = new java.util.ArrayList<examples.R>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList45, rArray44);
        examples.R r49 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray50 = new examples.R[] { r49 };
        java.util.ArrayList<examples.R> rList51 = new java.util.ArrayList<examples.R>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList51, rArray50);
        examples.S s55 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean57 = s55.equals((java.lang.Object) (-8));
        examples.S s60 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray61 = new examples.S[] { s55, s60 };
        java.util.ArrayList<examples.S> sList62 = new java.util.ArrayList<examples.S>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList62, sArray61);
        examples.ListComp02 listComp02_64 = new examples.ListComp02(rList51, sList62);
        examples.ListComp02 listComp02_65 = new examples.ListComp02(rList45, sList62);
        examples.S s68 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str69 = s68.getB();
        boolean boolean71 = s68.equals((java.lang.Object) 10.0d);
        listComp02_65.insert_s(s68);
        boolean boolean74 = s68.equals((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass75 = s68.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(rArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(sArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(rArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(rArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(sArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) 2);
        java.lang.String str3 = s2.getB();
        boolean boolean5 = s2.equals((java.lang.Object) (-7L));
        java.lang.Class<?> wildcardClass6 = s2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) (-6));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.S s20 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str21 = s20.getB();
        java.lang.String str22 = s20.getB();
        listComp02_17.insert_s(s20);
        java.lang.Class<?> wildcardClass24 = listComp02_17.getClass();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean4 = r2.equals((java.lang.Object) 6);
        examples.R r7 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r10 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean12 = r10.equals((java.lang.Object) 6);
        examples.R r15 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r18 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray19 = new examples.R[] { r18 };
        java.util.ArrayList<examples.R> rList20 = new java.util.ArrayList<examples.R>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList20, rArray19);
        examples.S s24 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean26 = s24.equals((java.lang.Object) (-8));
        examples.S s29 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray30 = new examples.S[] { s24, s29 };
        java.util.ArrayList<examples.S> sList31 = new java.util.ArrayList<examples.S>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList31, sArray30);
        examples.ListComp02 listComp02_33 = new examples.ListComp02(rList20, sList31);
        examples.R r36 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_33.insert_r(r36);
        java.lang.String str38 = r36.getB();
        examples.R r41 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean43 = r41.equals((java.lang.Object) 6);
        examples.R[] rArray44 = new examples.R[] { r2, r7, r10, r15, r36, r41 };
        java.util.ArrayList<examples.R> rList45 = new java.util.ArrayList<examples.R>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList45, rArray44);
        examples.R r49 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray50 = new examples.R[] { r49 };
        java.util.ArrayList<examples.R> rList51 = new java.util.ArrayList<examples.R>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList51, rArray50);
        examples.S s55 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean57 = s55.equals((java.lang.Object) (-8));
        examples.S s60 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray61 = new examples.S[] { s55, s60 };
        java.util.ArrayList<examples.S> sList62 = new java.util.ArrayList<examples.S>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList62, sArray61);
        examples.ListComp02 listComp02_64 = new examples.ListComp02(rList51, sList62);
        examples.ListComp02 listComp02_65 = new examples.ListComp02(rList45, sList62);
        examples.R r68 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray69 = new examples.R[] { r68 };
        java.util.ArrayList<examples.R> rList70 = new java.util.ArrayList<examples.R>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList70, rArray69);
        examples.S s74 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean76 = s74.equals((java.lang.Object) (-8));
        examples.S s79 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray80 = new examples.S[] { s74, s79 };
        java.util.ArrayList<examples.S> sList81 = new java.util.ArrayList<examples.S>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList81, sArray80);
        examples.ListComp02 listComp02_83 = new examples.ListComp02(rList70, sList81);
        examples.R r86 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_83.insert_r(r86);
        java.lang.String str88 = r86.getB();
        boolean boolean90 = r86.equals((java.lang.Object) (short) 100);
        listComp02_65.insert_r(r86);
        examples.S s94 = new examples.S("", (java.lang.Integer) 1);
        boolean boolean95 = r86.equals((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(rArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(sArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(rArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(rArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(sArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(rArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(sArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!" + "'", str88, "hi!");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) 7);
        examples.S s5 = new examples.S("", (java.lang.Integer) (-2));
        boolean boolean6 = s2.equals((java.lang.Object) s5);
        java.lang.Class<?> wildcardClass7 = s5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        examples.ListComp02 listComp02_0 = new examples.ListComp02();
        java.lang.Class<?> wildcardClass1 = listComp02_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        examples.R r2 = new examples.R((java.lang.Integer) 1, "");
        java.lang.String str3 = r2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        examples.S s2 = new examples.S("", (java.lang.Integer) 8);
        java.lang.String str3 = s2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean4 = r2.equals((java.lang.Object) 6);
        java.lang.Object obj5 = null;
        boolean boolean6 = r2.equals(obj5);
        examples.R r9 = new examples.R((java.lang.Integer) 1, "hi!");
        java.lang.String str10 = r9.getB();
        boolean boolean11 = r2.equals((java.lang.Object) r9);
        java.lang.String str12 = r2.getB();
        examples.R r15 = new examples.R((java.lang.Integer) (-6), "");
        examples.R r18 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray19 = new examples.R[] { r18 };
        java.util.ArrayList<examples.R> rList20 = new java.util.ArrayList<examples.R>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList20, rArray19);
        examples.S s24 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean26 = s24.equals((java.lang.Object) (-8));
        examples.S s29 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray30 = new examples.S[] { s24, s29 };
        java.util.ArrayList<examples.S> sList31 = new java.util.ArrayList<examples.S>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList31, sArray30);
        examples.ListComp02 listComp02_33 = new examples.ListComp02(rList20, sList31);
        examples.S s36 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str37 = s36.getB();
        java.lang.String str38 = s36.getB();
        listComp02_33.insert_s(s36);
        boolean boolean40 = r15.equals((java.lang.Object) listComp02_33);
        boolean boolean41 = r2.equals((java.lang.Object) listComp02_33);
        java.lang.Class<?> wildcardClass42 = r2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(rArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(sArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        examples.S s2 = new examples.S("", (java.lang.Integer) (-7));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean4 = r2.equals((java.lang.Object) 6);
        examples.R r7 = new examples.R((java.lang.Integer) (-6), "");
        examples.R r10 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray11 = new examples.R[] { r10 };
        java.util.ArrayList<examples.R> rList12 = new java.util.ArrayList<examples.R>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList12, rArray11);
        examples.S s16 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean18 = s16.equals((java.lang.Object) (-8));
        examples.S s21 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray22 = new examples.S[] { s16, s21 };
        java.util.ArrayList<examples.S> sList23 = new java.util.ArrayList<examples.S>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList23, sArray22);
        examples.ListComp02 listComp02_25 = new examples.ListComp02(rList12, sList23);
        examples.R r28 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_25.insert_r(r28);
        boolean boolean30 = r7.equals((java.lang.Object) listComp02_25);
        boolean boolean31 = r2.equals((java.lang.Object) r7);
        java.lang.String str32 = r7.getB();
        java.lang.String str33 = r7.getB();
        java.lang.Class<?> wildcardClass34 = r7.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(sArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        examples.R r2 = new examples.R((java.lang.Integer) 7, "hi!");
        java.lang.String str3 = r2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray21 = new examples.R[] { r20 };
        java.util.ArrayList<examples.R> rList22 = new java.util.ArrayList<examples.R>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList22, rArray21);
        examples.S s26 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean28 = s26.equals((java.lang.Object) (-8));
        examples.S s31 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray32 = new examples.S[] { s26, s31 };
        java.util.ArrayList<examples.S> sList33 = new java.util.ArrayList<examples.S>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList33, sArray32);
        examples.ListComp02 listComp02_35 = new examples.ListComp02(rList22, sList33);
        examples.ListComp02 listComp02_36 = new examples.ListComp02(rList4, sList33);
        java.lang.Class<?> wildcardClass37 = rList4.getClass();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(rArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(sArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        examples.R r2 = new examples.R((java.lang.Integer) 6, "");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        examples.R r2 = new examples.R((java.lang.Integer) 5, "");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        java.lang.String str3 = r2.getB();
        java.lang.String str4 = r2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean4 = r2.equals((java.lang.Object) 6);
        examples.R r7 = new examples.R((java.lang.Integer) (-6), "");
        examples.R r10 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray11 = new examples.R[] { r10 };
        java.util.ArrayList<examples.R> rList12 = new java.util.ArrayList<examples.R>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList12, rArray11);
        examples.S s16 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean18 = s16.equals((java.lang.Object) (-8));
        examples.S s21 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray22 = new examples.S[] { s16, s21 };
        java.util.ArrayList<examples.S> sList23 = new java.util.ArrayList<examples.S>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList23, sArray22);
        examples.ListComp02 listComp02_25 = new examples.ListComp02(rList12, sList23);
        examples.R r28 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_25.insert_r(r28);
        boolean boolean30 = r7.equals((java.lang.Object) listComp02_25);
        boolean boolean31 = r2.equals((java.lang.Object) r7);
        boolean boolean33 = r7.equals((java.lang.Object) 9);
        java.lang.String str34 = r7.getB();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(sArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) (-7));
        java.lang.Object obj3 = null;
        boolean boolean4 = s2.equals(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        examples.R r2 = new examples.R((java.lang.Integer) 7, "");
        java.lang.String str3 = r2.getB();
        java.lang.Class<?> wildcardClass4 = r2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray21 = new examples.R[] { r20 };
        java.util.ArrayList<examples.R> rList22 = new java.util.ArrayList<examples.R>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList22, rArray21);
        examples.S s26 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean28 = s26.equals((java.lang.Object) (-8));
        examples.S s31 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray32 = new examples.S[] { s26, s31 };
        java.util.ArrayList<examples.S> sList33 = new java.util.ArrayList<examples.S>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList33, sArray32);
        examples.ListComp02 listComp02_35 = new examples.ListComp02(rList22, sList33);
        examples.ListComp02 listComp02_36 = new examples.ListComp02(rList4, sList33);
        examples.R r39 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray40 = new examples.R[] { r39 };
        java.util.ArrayList<examples.R> rList41 = new java.util.ArrayList<examples.R>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList41, rArray40);
        examples.S s45 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean47 = s45.equals((java.lang.Object) (-8));
        examples.S s50 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray51 = new examples.S[] { s45, s50 };
        java.util.ArrayList<examples.S> sList52 = new java.util.ArrayList<examples.S>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList52, sArray51);
        examples.ListComp02 listComp02_54 = new examples.ListComp02(rList41, sList52);
        examples.ListComp02 listComp02_55 = new examples.ListComp02(rList4, sList52);
        examples.S s58 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str59 = s58.getB();
        boolean boolean61 = s58.equals((java.lang.Object) 10.0d);
        java.lang.String str62 = s58.getB();
        boolean boolean64 = s58.equals((java.lang.Object) 9.6d);
        listComp02_55.insert_s(s58);
        java.lang.String str66 = s58.getB();
        java.lang.Class<?> wildcardClass67 = s58.getClass();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(rArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(sArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(rArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(sArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        examples.S s2 = new examples.S("", (java.lang.Integer) (-100));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) (-1));
        java.lang.String str3 = s2.getB();
        java.lang.Class<?> wildcardClass4 = s2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean4 = r2.equals((java.lang.Object) 6);
        java.lang.Object obj5 = null;
        boolean boolean6 = r2.equals(obj5);
        examples.R r9 = new examples.R((java.lang.Integer) 1, "hi!");
        java.lang.String str10 = r9.getB();
        boolean boolean11 = r2.equals((java.lang.Object) r9);
        examples.R r14 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean16 = r14.equals((java.lang.Object) 6);
        examples.R r19 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r22 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean24 = r22.equals((java.lang.Object) 6);
        examples.R r27 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r30 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray31 = new examples.R[] { r30 };
        java.util.ArrayList<examples.R> rList32 = new java.util.ArrayList<examples.R>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList32, rArray31);
        examples.S s36 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean38 = s36.equals((java.lang.Object) (-8));
        examples.S s41 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray42 = new examples.S[] { s36, s41 };
        java.util.ArrayList<examples.S> sList43 = new java.util.ArrayList<examples.S>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList43, sArray42);
        examples.ListComp02 listComp02_45 = new examples.ListComp02(rList32, sList43);
        examples.R r48 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_45.insert_r(r48);
        java.lang.String str50 = r48.getB();
        examples.R r53 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean55 = r53.equals((java.lang.Object) 6);
        examples.R[] rArray56 = new examples.R[] { r14, r19, r22, r27, r48, r53 };
        java.util.ArrayList<examples.R> rList57 = new java.util.ArrayList<examples.R>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList57, rArray56);
        examples.R r61 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray62 = new examples.R[] { r61 };
        java.util.ArrayList<examples.R> rList63 = new java.util.ArrayList<examples.R>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList63, rArray62);
        examples.S s67 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean69 = s67.equals((java.lang.Object) (-8));
        examples.S s72 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray73 = new examples.S[] { s67, s72 };
        java.util.ArrayList<examples.S> sList74 = new java.util.ArrayList<examples.S>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList74, sArray73);
        examples.ListComp02 listComp02_76 = new examples.ListComp02(rList63, sList74);
        examples.ListComp02 listComp02_77 = new examples.ListComp02(rList57, sList74);
        examples.S s80 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str81 = s80.getB();
        boolean boolean83 = s80.equals((java.lang.Object) 10.0d);
        listComp02_77.insert_s(s80);
        boolean boolean85 = r9.equals((java.lang.Object) listComp02_77);
        java.lang.String str86 = r9.getB();
        java.lang.String str87 = r9.getB();
        java.lang.String str88 = r9.getB();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(rArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(sArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(rArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(rArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(sArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!" + "'", str87, "hi!");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!" + "'", str88, "hi!");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean22 = r20.equals((java.lang.Object) 6);
        examples.R r25 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r28 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean30 = r28.equals((java.lang.Object) 6);
        examples.R r33 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r36 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray37 = new examples.R[] { r36 };
        java.util.ArrayList<examples.R> rList38 = new java.util.ArrayList<examples.R>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList38, rArray37);
        examples.S s42 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean44 = s42.equals((java.lang.Object) (-8));
        examples.S s47 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray48 = new examples.S[] { s42, s47 };
        java.util.ArrayList<examples.S> sList49 = new java.util.ArrayList<examples.S>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList49, sArray48);
        examples.ListComp02 listComp02_51 = new examples.ListComp02(rList38, sList49);
        examples.R r54 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_51.insert_r(r54);
        java.lang.String str56 = r54.getB();
        examples.R r59 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean61 = r59.equals((java.lang.Object) 6);
        examples.R[] rArray62 = new examples.R[] { r20, r25, r28, r33, r54, r59 };
        java.util.ArrayList<examples.R> rList63 = new java.util.ArrayList<examples.R>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList63, rArray62);
        examples.R r67 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray68 = new examples.R[] { r67 };
        java.util.ArrayList<examples.R> rList69 = new java.util.ArrayList<examples.R>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList69, rArray68);
        examples.S s73 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean75 = s73.equals((java.lang.Object) (-8));
        examples.S s78 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray79 = new examples.S[] { s73, s78 };
        java.util.ArrayList<examples.S> sList80 = new java.util.ArrayList<examples.S>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList80, sArray79);
        examples.ListComp02 listComp02_82 = new examples.ListComp02(rList69, sList80);
        examples.ListComp02 listComp02_83 = new examples.ListComp02(rList63, sList80);
        examples.ListComp02 listComp02_84 = new examples.ListComp02(rList4, sList80);
        examples.R r87 = new examples.R((java.lang.Integer) (-10), "");
        listComp02_84.insert_r(r87);
        examples.R r91 = new examples.R((java.lang.Integer) 100, "hi!");
        listComp02_84.insert_r(r91);
        listComp02_84.clear();
        examples.R r96 = new examples.R((java.lang.Integer) 1, "");
        listComp02_84.insert_r(r96);
        examples.S s98 = null;
        listComp02_84.insert_s(s98);
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(rArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(sArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(rArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(rArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(sArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        examples.R r2 = new examples.R((java.lang.Integer) 10, "");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        examples.R r2 = new examples.R((java.lang.Integer) 0, "");
        boolean boolean4 = r2.equals((java.lang.Object) (-10L));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) 8);
        java.lang.Class<?> wildcardClass3 = s2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean4 = r2.equals((java.lang.Object) 6);
        java.lang.Object obj5 = null;
        boolean boolean6 = r2.equals(obj5);
        examples.R r9 = new examples.R((java.lang.Integer) 1, "hi!");
        java.lang.String str10 = r9.getB();
        boolean boolean11 = r2.equals((java.lang.Object) r9);
        examples.R r14 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean16 = r14.equals((java.lang.Object) 6);
        examples.R r19 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r22 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean24 = r22.equals((java.lang.Object) 6);
        examples.R r27 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r30 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray31 = new examples.R[] { r30 };
        java.util.ArrayList<examples.R> rList32 = new java.util.ArrayList<examples.R>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList32, rArray31);
        examples.S s36 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean38 = s36.equals((java.lang.Object) (-8));
        examples.S s41 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray42 = new examples.S[] { s36, s41 };
        java.util.ArrayList<examples.S> sList43 = new java.util.ArrayList<examples.S>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList43, sArray42);
        examples.ListComp02 listComp02_45 = new examples.ListComp02(rList32, sList43);
        examples.R r48 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_45.insert_r(r48);
        java.lang.String str50 = r48.getB();
        examples.R r53 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean55 = r53.equals((java.lang.Object) 6);
        examples.R[] rArray56 = new examples.R[] { r14, r19, r22, r27, r48, r53 };
        java.util.ArrayList<examples.R> rList57 = new java.util.ArrayList<examples.R>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList57, rArray56);
        examples.R r61 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray62 = new examples.R[] { r61 };
        java.util.ArrayList<examples.R> rList63 = new java.util.ArrayList<examples.R>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList63, rArray62);
        examples.S s67 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean69 = s67.equals((java.lang.Object) (-8));
        examples.S s72 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray73 = new examples.S[] { s67, s72 };
        java.util.ArrayList<examples.S> sList74 = new java.util.ArrayList<examples.S>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList74, sArray73);
        examples.ListComp02 listComp02_76 = new examples.ListComp02(rList63, sList74);
        examples.ListComp02 listComp02_77 = new examples.ListComp02(rList57, sList74);
        examples.S s80 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str81 = s80.getB();
        boolean boolean83 = s80.equals((java.lang.Object) 10.0d);
        listComp02_77.insert_s(s80);
        boolean boolean85 = r9.equals((java.lang.Object) listComp02_77);
        listComp02_77.clear();
        examples.S s87 = null;
        listComp02_77.insert_s(s87);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(rArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(sArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(rArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(rArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(sArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_17.insert_r(r20);
        examples.R r22 = null;
        listComp02_17.insert_r(r22);
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray21 = new examples.R[] { r20 };
        java.util.ArrayList<examples.R> rList22 = new java.util.ArrayList<examples.R>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList22, rArray21);
        examples.S s26 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean28 = s26.equals((java.lang.Object) (-8));
        examples.S s31 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray32 = new examples.S[] { s26, s31 };
        java.util.ArrayList<examples.S> sList33 = new java.util.ArrayList<examples.S>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList33, sArray32);
        examples.ListComp02 listComp02_35 = new examples.ListComp02(rList22, sList33);
        examples.ListComp02 listComp02_36 = new examples.ListComp02(rList4, sList33);
        examples.S s39 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str40 = s39.getB();
        boolean boolean42 = s39.equals((java.lang.Object) 10.0d);
        java.lang.String str43 = s39.getB();
        listComp02_36.insert_s(s39);
        listComp02_36.clear();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(rArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(sArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) 3);
        java.lang.Class<?> wildcardClass3 = s2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        examples.R r2 = new examples.R((java.lang.Integer) 200, "");
        java.lang.String str3 = r2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean4 = r2.equals((java.lang.Object) 6);
        examples.R r7 = new examples.R((java.lang.Integer) (-6), "");
        examples.R r10 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray11 = new examples.R[] { r10 };
        java.util.ArrayList<examples.R> rList12 = new java.util.ArrayList<examples.R>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList12, rArray11);
        examples.S s16 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean18 = s16.equals((java.lang.Object) (-8));
        examples.S s21 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray22 = new examples.S[] { s16, s21 };
        java.util.ArrayList<examples.S> sList23 = new java.util.ArrayList<examples.S>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList23, sArray22);
        examples.ListComp02 listComp02_25 = new examples.ListComp02(rList12, sList23);
        examples.R r28 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_25.insert_r(r28);
        boolean boolean30 = r7.equals((java.lang.Object) listComp02_25);
        boolean boolean31 = r2.equals((java.lang.Object) r7);
        java.lang.String str32 = r7.getB();
        java.lang.Class<?> wildcardClass33 = r7.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(sArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) 5);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) 200);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) 4);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) (-2));
        java.lang.Class<?> wildcardClass3 = s2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        examples.R r2 = new examples.R((java.lang.Integer) 8, "hi!");
        boolean boolean4 = r2.equals((java.lang.Object) 2.7d);
        java.lang.Class<?> wildcardClass5 = r2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        examples.R r2 = new examples.R((java.lang.Integer) (-6), "");
        examples.R r5 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray6 = new examples.R[] { r5 };
        java.util.ArrayList<examples.R> rList7 = new java.util.ArrayList<examples.R>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList7, rArray6);
        examples.S s11 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean13 = s11.equals((java.lang.Object) (-8));
        examples.S s16 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray17 = new examples.S[] { s11, s16 };
        java.util.ArrayList<examples.S> sList18 = new java.util.ArrayList<examples.S>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList18, sArray17);
        examples.ListComp02 listComp02_20 = new examples.ListComp02(rList7, sList18);
        examples.S s23 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str24 = s23.getB();
        java.lang.String str25 = s23.getB();
        listComp02_20.insert_s(s23);
        boolean boolean27 = r2.equals((java.lang.Object) listComp02_20);
        examples.R r30 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray31 = new examples.R[] { r30 };
        java.util.ArrayList<examples.R> rList32 = new java.util.ArrayList<examples.R>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList32, rArray31);
        examples.S s36 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean38 = s36.equals((java.lang.Object) (-8));
        examples.S s41 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray42 = new examples.S[] { s36, s41 };
        java.util.ArrayList<examples.S> sList43 = new java.util.ArrayList<examples.S>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList43, sArray42);
        examples.ListComp02 listComp02_45 = new examples.ListComp02(rList32, sList43);
        examples.S s48 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str49 = s48.getB();
        java.lang.String str50 = s48.getB();
        listComp02_45.insert_s(s48);
        examples.S s54 = new examples.S("hi!", (java.lang.Integer) 1);
        java.lang.String str55 = s54.getB();
        boolean boolean56 = s48.equals((java.lang.Object) s54);
        listComp02_20.insert_s(s54);
        examples.S s60 = new examples.S("hi!", (java.lang.Integer) 100);
        boolean boolean61 = s54.equals((java.lang.Object) s60);
        java.lang.String str62 = s54.getB();
        org.junit.Assert.assertNotNull(rArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(sArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(rArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(sArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.R r8 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean10 = r8.equals((java.lang.Object) 6);
        examples.R r13 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r16 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean18 = r16.equals((java.lang.Object) 6);
        examples.R r21 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r24 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray25 = new examples.R[] { r24 };
        java.util.ArrayList<examples.R> rList26 = new java.util.ArrayList<examples.R>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList26, rArray25);
        examples.S s30 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean32 = s30.equals((java.lang.Object) (-8));
        examples.S s35 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray36 = new examples.S[] { s30, s35 };
        java.util.ArrayList<examples.S> sList37 = new java.util.ArrayList<examples.S>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList37, sArray36);
        examples.ListComp02 listComp02_39 = new examples.ListComp02(rList26, sList37);
        examples.R r42 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_39.insert_r(r42);
        java.lang.String str44 = r42.getB();
        examples.R r47 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean49 = r47.equals((java.lang.Object) 6);
        examples.R[] rArray50 = new examples.R[] { r8, r13, r16, r21, r42, r47 };
        java.util.ArrayList<examples.R> rList51 = new java.util.ArrayList<examples.R>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList51, rArray50);
        examples.R r55 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray56 = new examples.R[] { r55 };
        java.util.ArrayList<examples.R> rList57 = new java.util.ArrayList<examples.R>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList57, rArray56);
        examples.S s61 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean63 = s61.equals((java.lang.Object) (-8));
        examples.S s66 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray67 = new examples.S[] { s61, s66 };
        java.util.ArrayList<examples.S> sList68 = new java.util.ArrayList<examples.S>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList68, sArray67);
        examples.ListComp02 listComp02_70 = new examples.ListComp02(rList57, sList68);
        examples.ListComp02 listComp02_71 = new examples.ListComp02(rList51, sList68);
        examples.ListComp02 listComp02_72 = new examples.ListComp02(rList4, sList68);
        listComp02_72.clear();
        examples.R r76 = new examples.R((java.lang.Integer) (-1), "");
        boolean boolean78 = r76.equals((java.lang.Object) (byte) 1);
        listComp02_72.insert_r(r76);
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(sArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(rArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(rArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(sArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        examples.R r2 = new examples.R((java.lang.Integer) 3, "");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean4 = r2.equals((java.lang.Object) 6);
        java.lang.Object obj5 = null;
        boolean boolean6 = r2.equals(obj5);
        examples.R r9 = new examples.R((java.lang.Integer) 1, "hi!");
        java.lang.String str10 = r9.getB();
        boolean boolean11 = r2.equals((java.lang.Object) r9);
        java.lang.String str12 = r9.getB();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean4 = r2.equals((java.lang.Object) 6);
        java.lang.Object obj5 = null;
        boolean boolean6 = r2.equals(obj5);
        examples.R r9 = new examples.R((java.lang.Integer) 1, "hi!");
        java.lang.String str10 = r9.getB();
        boolean boolean11 = r2.equals((java.lang.Object) r9);
        examples.R r14 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean16 = r14.equals((java.lang.Object) 6);
        examples.R r19 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r22 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean24 = r22.equals((java.lang.Object) 6);
        examples.R r27 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r30 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray31 = new examples.R[] { r30 };
        java.util.ArrayList<examples.R> rList32 = new java.util.ArrayList<examples.R>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList32, rArray31);
        examples.S s36 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean38 = s36.equals((java.lang.Object) (-8));
        examples.S s41 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray42 = new examples.S[] { s36, s41 };
        java.util.ArrayList<examples.S> sList43 = new java.util.ArrayList<examples.S>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList43, sArray42);
        examples.ListComp02 listComp02_45 = new examples.ListComp02(rList32, sList43);
        examples.R r48 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_45.insert_r(r48);
        java.lang.String str50 = r48.getB();
        examples.R r53 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean55 = r53.equals((java.lang.Object) 6);
        examples.R[] rArray56 = new examples.R[] { r14, r19, r22, r27, r48, r53 };
        java.util.ArrayList<examples.R> rList57 = new java.util.ArrayList<examples.R>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList57, rArray56);
        examples.R r61 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray62 = new examples.R[] { r61 };
        java.util.ArrayList<examples.R> rList63 = new java.util.ArrayList<examples.R>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList63, rArray62);
        examples.S s67 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean69 = s67.equals((java.lang.Object) (-8));
        examples.S s72 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray73 = new examples.S[] { s67, s72 };
        java.util.ArrayList<examples.S> sList74 = new java.util.ArrayList<examples.S>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList74, sArray73);
        examples.ListComp02 listComp02_76 = new examples.ListComp02(rList63, sList74);
        examples.ListComp02 listComp02_77 = new examples.ListComp02(rList57, sList74);
        examples.S s80 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str81 = s80.getB();
        boolean boolean83 = s80.equals((java.lang.Object) 10.0d);
        listComp02_77.insert_s(s80);
        boolean boolean85 = r9.equals((java.lang.Object) listComp02_77);
        listComp02_77.clear();
        listComp02_77.clear();
        listComp02_77.clear();
        java.lang.Class<?> wildcardClass89 = listComp02_77.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(rArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(sArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(rArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(rArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(sArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) 8);
        java.lang.String str3 = s2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_17.insert_r(r20);
        examples.S s24 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str25 = s24.getB();
        examples.S s28 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str29 = s28.getB();
        boolean boolean31 = s28.equals((java.lang.Object) 10.0d);
        boolean boolean33 = s28.equals((java.lang.Object) (-2.1d));
        boolean boolean34 = s24.equals((java.lang.Object) boolean33);
        java.lang.String str35 = s24.getB();
        listComp02_17.insert_s(s24);
        java.lang.Class<?> wildcardClass37 = listComp02_17.getClass();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray21 = new examples.R[] { r20 };
        java.util.ArrayList<examples.R> rList22 = new java.util.ArrayList<examples.R>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList22, rArray21);
        examples.S s26 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean28 = s26.equals((java.lang.Object) (-8));
        examples.S s31 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray32 = new examples.S[] { s26, s31 };
        java.util.ArrayList<examples.S> sList33 = new java.util.ArrayList<examples.S>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList33, sArray32);
        examples.ListComp02 listComp02_35 = new examples.ListComp02(rList22, sList33);
        examples.ListComp02 listComp02_36 = new examples.ListComp02(rList4, sList33);
        examples.R r39 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray40 = new examples.R[] { r39 };
        java.util.ArrayList<examples.R> rList41 = new java.util.ArrayList<examples.R>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList41, rArray40);
        examples.S s45 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean47 = s45.equals((java.lang.Object) (-8));
        examples.S s50 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray51 = new examples.S[] { s45, s50 };
        java.util.ArrayList<examples.S> sList52 = new java.util.ArrayList<examples.S>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList52, sArray51);
        examples.ListComp02 listComp02_54 = new examples.ListComp02(rList41, sList52);
        examples.ListComp02 listComp02_55 = new examples.ListComp02(rList4, sList52);
        examples.S s58 = new examples.S("", (java.lang.Integer) 0);
        listComp02_55.insert_s(s58);
        listComp02_55.clear();
        java.lang.Class<?> wildcardClass61 = listComp02_55.getClass();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(rArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(sArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(rArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(sArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        examples.R r2 = new examples.R((java.lang.Integer) 5, "hi!");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean4 = r2.equals((java.lang.Object) 6);
        examples.R r7 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r10 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean12 = r10.equals((java.lang.Object) 6);
        examples.R r15 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r18 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray19 = new examples.R[] { r18 };
        java.util.ArrayList<examples.R> rList20 = new java.util.ArrayList<examples.R>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList20, rArray19);
        examples.S s24 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean26 = s24.equals((java.lang.Object) (-8));
        examples.S s29 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray30 = new examples.S[] { s24, s29 };
        java.util.ArrayList<examples.S> sList31 = new java.util.ArrayList<examples.S>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList31, sArray30);
        examples.ListComp02 listComp02_33 = new examples.ListComp02(rList20, sList31);
        examples.R r36 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_33.insert_r(r36);
        java.lang.String str38 = r36.getB();
        examples.R r41 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean43 = r41.equals((java.lang.Object) 6);
        examples.R[] rArray44 = new examples.R[] { r2, r7, r10, r15, r36, r41 };
        java.util.ArrayList<examples.R> rList45 = new java.util.ArrayList<examples.R>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList45, rArray44);
        examples.R r49 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray50 = new examples.R[] { r49 };
        java.util.ArrayList<examples.R> rList51 = new java.util.ArrayList<examples.R>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList51, rArray50);
        examples.S s55 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean57 = s55.equals((java.lang.Object) (-8));
        examples.S s60 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray61 = new examples.S[] { s55, s60 };
        java.util.ArrayList<examples.S> sList62 = new java.util.ArrayList<examples.S>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList62, sArray61);
        examples.ListComp02 listComp02_64 = new examples.ListComp02(rList51, sList62);
        examples.ListComp02 listComp02_65 = new examples.ListComp02(rList45, sList62);
        examples.S s68 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str69 = s68.getB();
        boolean boolean71 = s68.equals((java.lang.Object) 10.0d);
        listComp02_65.insert_s(s68);
        boolean boolean74 = s68.equals((java.lang.Object) 0.0f);
        java.lang.String str75 = s68.getB();
        boolean boolean77 = s68.equals((java.lang.Object) 9.6d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(rArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(sArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(rArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(rArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(sArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        examples.R r2 = new examples.R((java.lang.Integer) 200, "hi!");
        java.lang.Class<?> wildcardClass3 = r2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) (-1));
        java.lang.String str3 = s2.getB();
        java.lang.String str4 = s2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) 32);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        examples.R r2 = new examples.R((java.lang.Integer) (-7), "hi!");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        examples.R r2 = new examples.R((java.lang.Integer) (-5), "hi!");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        examples.R r2 = new examples.R((java.lang.Integer) (-6), "");
        examples.S s5 = new examples.S("", (java.lang.Integer) 5);
        boolean boolean6 = r2.equals((java.lang.Object) 5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        examples.S s2 = new examples.S("", (java.lang.Integer) (-2));
        java.lang.String str3 = s2.getB();
        java.lang.String str4 = s2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        examples.S s2 = new examples.S("", (java.lang.Integer) 3);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) 7);
        examples.S s5 = new examples.S("", (java.lang.Integer) (-2));
        boolean boolean6 = s2.equals((java.lang.Object) s5);
        examples.R r9 = new examples.R((java.lang.Integer) 1, "");
        examples.R r12 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray13 = new examples.R[] { r12 };
        java.util.ArrayList<examples.R> rList14 = new java.util.ArrayList<examples.R>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList14, rArray13);
        examples.S s18 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean20 = s18.equals((java.lang.Object) (-8));
        examples.S s23 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray24 = new examples.S[] { s18, s23 };
        java.util.ArrayList<examples.S> sList25 = new java.util.ArrayList<examples.S>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList25, sArray24);
        examples.ListComp02 listComp02_27 = new examples.ListComp02(rList14, sList25);
        examples.R r30 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray31 = new examples.R[] { r30 };
        java.util.ArrayList<examples.R> rList32 = new java.util.ArrayList<examples.R>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList32, rArray31);
        examples.S s36 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean38 = s36.equals((java.lang.Object) (-8));
        examples.S s41 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray42 = new examples.S[] { s36, s41 };
        java.util.ArrayList<examples.S> sList43 = new java.util.ArrayList<examples.S>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList43, sArray42);
        examples.ListComp02 listComp02_45 = new examples.ListComp02(rList32, sList43);
        examples.ListComp02 listComp02_46 = new examples.ListComp02(rList14, sList43);
        boolean boolean47 = r9.equals((java.lang.Object) sList43);
        boolean boolean48 = s2.equals((java.lang.Object) boolean47);
        java.lang.Class<?> wildcardClass49 = s2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(sArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(rArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(sArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) 7);
        examples.R r5 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray6 = new examples.R[] { r5 };
        java.util.ArrayList<examples.R> rList7 = new java.util.ArrayList<examples.R>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList7, rArray6);
        examples.S s11 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean13 = s11.equals((java.lang.Object) (-8));
        examples.S s16 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray17 = new examples.S[] { s11, s16 };
        java.util.ArrayList<examples.S> sList18 = new java.util.ArrayList<examples.S>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList18, sArray17);
        examples.ListComp02 listComp02_20 = new examples.ListComp02(rList7, sList18);
        examples.S s23 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str24 = s23.getB();
        java.lang.String str25 = s23.getB();
        listComp02_20.insert_s(s23);
        examples.R r29 = new examples.R((java.lang.Integer) (-2), "");
        listComp02_20.insert_r(r29);
        boolean boolean31 = s2.equals((java.lang.Object) listComp02_20);
        examples.S s34 = new examples.S("hi!", (java.lang.Integer) 2);
        java.lang.String str35 = s34.getB();
        boolean boolean36 = s2.equals((java.lang.Object) s34);
        java.lang.String str37 = s34.getB();
        org.junit.Assert.assertNotNull(rArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(sArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        examples.R r2 = new examples.R((java.lang.Integer) 9, "");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        examples.R r2 = new examples.R((java.lang.Integer) 7, "");
        java.lang.String str3 = r2.getB();
        examples.S s6 = new examples.S("hi!", (java.lang.Integer) 7);
        examples.S s9 = new examples.S("", (java.lang.Integer) (-2));
        boolean boolean10 = s6.equals((java.lang.Object) s9);
        boolean boolean11 = r2.equals((java.lang.Object) s6);
        examples.R r14 = new examples.R((java.lang.Integer) (-6), "");
        boolean boolean15 = r2.equals((java.lang.Object) "");
        java.lang.String str16 = r2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        examples.R r2 = new examples.R((java.lang.Integer) (-6), "");
        examples.R r5 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray6 = new examples.R[] { r5 };
        java.util.ArrayList<examples.R> rList7 = new java.util.ArrayList<examples.R>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList7, rArray6);
        examples.S s11 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean13 = s11.equals((java.lang.Object) (-8));
        examples.S s16 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray17 = new examples.S[] { s11, s16 };
        java.util.ArrayList<examples.S> sList18 = new java.util.ArrayList<examples.S>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList18, sArray17);
        examples.ListComp02 listComp02_20 = new examples.ListComp02(rList7, sList18);
        examples.R r23 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_20.insert_r(r23);
        boolean boolean25 = r2.equals((java.lang.Object) listComp02_20);
        java.lang.String str26 = r2.getB();
        java.lang.String str27 = r2.getB();
        org.junit.Assert.assertNotNull(rArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(sArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean4 = r2.equals((java.lang.Object) 6);
        examples.R r7 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r10 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean12 = r10.equals((java.lang.Object) 6);
        examples.R r15 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r18 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray19 = new examples.R[] { r18 };
        java.util.ArrayList<examples.R> rList20 = new java.util.ArrayList<examples.R>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList20, rArray19);
        examples.S s24 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean26 = s24.equals((java.lang.Object) (-8));
        examples.S s29 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray30 = new examples.S[] { s24, s29 };
        java.util.ArrayList<examples.S> sList31 = new java.util.ArrayList<examples.S>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList31, sArray30);
        examples.ListComp02 listComp02_33 = new examples.ListComp02(rList20, sList31);
        examples.R r36 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_33.insert_r(r36);
        java.lang.String str38 = r36.getB();
        examples.R r41 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean43 = r41.equals((java.lang.Object) 6);
        examples.R[] rArray44 = new examples.R[] { r2, r7, r10, r15, r36, r41 };
        java.util.ArrayList<examples.R> rList45 = new java.util.ArrayList<examples.R>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList45, rArray44);
        examples.R r49 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray50 = new examples.R[] { r49 };
        java.util.ArrayList<examples.R> rList51 = new java.util.ArrayList<examples.R>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList51, rArray50);
        examples.S s55 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean57 = s55.equals((java.lang.Object) (-8));
        examples.S s60 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray61 = new examples.S[] { s55, s60 };
        java.util.ArrayList<examples.S> sList62 = new java.util.ArrayList<examples.S>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList62, sArray61);
        examples.ListComp02 listComp02_64 = new examples.ListComp02(rList51, sList62);
        examples.ListComp02 listComp02_65 = new examples.ListComp02(rList45, sList62);
        examples.R r68 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray69 = new examples.R[] { r68 };
        java.util.ArrayList<examples.R> rList70 = new java.util.ArrayList<examples.R>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList70, rArray69);
        examples.S s74 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean76 = s74.equals((java.lang.Object) (-8));
        examples.S s79 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray80 = new examples.S[] { s74, s79 };
        java.util.ArrayList<examples.S> sList81 = new java.util.ArrayList<examples.S>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList81, sArray80);
        examples.ListComp02 listComp02_83 = new examples.ListComp02(rList70, sList81);
        examples.R r86 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_83.insert_r(r86);
        java.lang.String str88 = r86.getB();
        boolean boolean90 = r86.equals((java.lang.Object) (short) 100);
        listComp02_65.insert_r(r86);
        java.lang.String str92 = r86.getB();
        boolean boolean94 = r86.equals((java.lang.Object) 10685);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(rArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(sArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(rArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(rArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(sArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(rArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(sArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!" + "'", str88, "hi!");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "hi!" + "'", str92, "hi!");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) 9);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        examples.S s2 = new examples.S("", (java.lang.Integer) (-4));
        java.lang.String str3 = s2.getB();
        java.lang.Class<?> wildcardClass4 = s2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        examples.S s2 = new examples.S("", (java.lang.Integer) (-4));
        boolean boolean4 = s2.equals((java.lang.Object) 'a');
        java.lang.String str5 = s2.getB();
        java.lang.String str6 = s2.getB();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        examples.R r2 = new examples.R((java.lang.Integer) 32, "");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_17.insert_r(r20);
        java.lang.String str22 = r20.getB();
        java.lang.String str23 = r20.getB();
        java.lang.String str24 = r20.getB();
        java.lang.Class<?> wildcardClass25 = r20.getClass();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.R r8 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean10 = r8.equals((java.lang.Object) 6);
        examples.R r13 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r16 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean18 = r16.equals((java.lang.Object) 6);
        examples.R r21 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r24 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray25 = new examples.R[] { r24 };
        java.util.ArrayList<examples.R> rList26 = new java.util.ArrayList<examples.R>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList26, rArray25);
        examples.S s30 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean32 = s30.equals((java.lang.Object) (-8));
        examples.S s35 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray36 = new examples.S[] { s30, s35 };
        java.util.ArrayList<examples.S> sList37 = new java.util.ArrayList<examples.S>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList37, sArray36);
        examples.ListComp02 listComp02_39 = new examples.ListComp02(rList26, sList37);
        examples.R r42 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_39.insert_r(r42);
        java.lang.String str44 = r42.getB();
        examples.R r47 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean49 = r47.equals((java.lang.Object) 6);
        examples.R[] rArray50 = new examples.R[] { r8, r13, r16, r21, r42, r47 };
        java.util.ArrayList<examples.R> rList51 = new java.util.ArrayList<examples.R>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList51, rArray50);
        examples.R r55 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray56 = new examples.R[] { r55 };
        java.util.ArrayList<examples.R> rList57 = new java.util.ArrayList<examples.R>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList57, rArray56);
        examples.S s61 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean63 = s61.equals((java.lang.Object) (-8));
        examples.S s66 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray67 = new examples.S[] { s61, s66 };
        java.util.ArrayList<examples.S> sList68 = new java.util.ArrayList<examples.S>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList68, sArray67);
        examples.ListComp02 listComp02_70 = new examples.ListComp02(rList57, sList68);
        examples.ListComp02 listComp02_71 = new examples.ListComp02(rList51, sList68);
        examples.ListComp02 listComp02_72 = new examples.ListComp02(rList4, sList68);
        examples.R r75 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray76 = new examples.R[] { r75 };
        java.util.ArrayList<examples.R> rList77 = new java.util.ArrayList<examples.R>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList77, rArray76);
        examples.S s81 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean83 = s81.equals((java.lang.Object) (-8));
        examples.S s86 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray87 = new examples.S[] { s81, s86 };
        java.util.ArrayList<examples.S> sList88 = new java.util.ArrayList<examples.S>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList88, sArray87);
        examples.ListComp02 listComp02_90 = new examples.ListComp02(rList77, sList88);
        examples.R r93 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_90.insert_r(r93);
        listComp02_72.insert_r(r93);
        listComp02_72.clear();
        listComp02_72.clear();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(sArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(rArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(rArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(sArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(rArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(sArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.S s20 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str21 = s20.getB();
        java.lang.String str22 = s20.getB();
        listComp02_17.insert_s(s20);
        examples.R r26 = new examples.R((java.lang.Integer) (-2), "");
        listComp02_17.insert_r(r26);
        examples.R r28 = null;
        listComp02_17.insert_r(r28);
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        examples.ListComp02 listComp02_0 = new examples.ListComp02();
        examples.R r3 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray4 = new examples.R[] { r3 };
        java.util.ArrayList<examples.R> rList5 = new java.util.ArrayList<examples.R>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList5, rArray4);
        examples.S s9 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean11 = s9.equals((java.lang.Object) (-8));
        examples.S s14 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray15 = new examples.S[] { s9, s14 };
        java.util.ArrayList<examples.S> sList16 = new java.util.ArrayList<examples.S>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList16, sArray15);
        examples.ListComp02 listComp02_18 = new examples.ListComp02(rList5, sList16);
        examples.R r21 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean23 = r21.equals((java.lang.Object) 6);
        examples.R r26 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r29 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean31 = r29.equals((java.lang.Object) 6);
        examples.R r34 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r37 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray38 = new examples.R[] { r37 };
        java.util.ArrayList<examples.R> rList39 = new java.util.ArrayList<examples.R>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList39, rArray38);
        examples.S s43 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean45 = s43.equals((java.lang.Object) (-8));
        examples.S s48 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray49 = new examples.S[] { s43, s48 };
        java.util.ArrayList<examples.S> sList50 = new java.util.ArrayList<examples.S>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList50, sArray49);
        examples.ListComp02 listComp02_52 = new examples.ListComp02(rList39, sList50);
        examples.R r55 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_52.insert_r(r55);
        java.lang.String str57 = r55.getB();
        examples.R r60 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean62 = r60.equals((java.lang.Object) 6);
        examples.R[] rArray63 = new examples.R[] { r21, r26, r29, r34, r55, r60 };
        java.util.ArrayList<examples.R> rList64 = new java.util.ArrayList<examples.R>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList64, rArray63);
        examples.R r68 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray69 = new examples.R[] { r68 };
        java.util.ArrayList<examples.R> rList70 = new java.util.ArrayList<examples.R>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList70, rArray69);
        examples.S s74 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean76 = s74.equals((java.lang.Object) (-8));
        examples.S s79 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray80 = new examples.S[] { s74, s79 };
        java.util.ArrayList<examples.S> sList81 = new java.util.ArrayList<examples.S>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList81, sArray80);
        examples.ListComp02 listComp02_83 = new examples.ListComp02(rList70, sList81);
        examples.ListComp02 listComp02_84 = new examples.ListComp02(rList64, sList81);
        examples.ListComp02 listComp02_85 = new examples.ListComp02(rList5, sList81);
        examples.R r88 = new examples.R((java.lang.Integer) (-10), "");
        listComp02_85.insert_r(r88);
        examples.R r92 = new examples.R((java.lang.Integer) 100, "hi!");
        listComp02_85.insert_r(r92);
        listComp02_0.insert_r(r92);
        org.junit.Assert.assertNotNull(rArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(sArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(rArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(sArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(rArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(rArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(sArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        examples.R r2 = new examples.R((java.lang.Integer) 8, "hi!");
        boolean boolean4 = r2.equals((java.lang.Object) 2.7d);
        java.lang.String str5 = r2.getB();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        java.lang.Object obj3 = null;
        boolean boolean4 = r2.equals(obj3);
        examples.R r7 = new examples.R((java.lang.Integer) 100, "hi!");
        java.lang.String str8 = r7.getB();
        boolean boolean9 = r2.equals((java.lang.Object) r7);
        examples.R r12 = new examples.R((java.lang.Integer) (-6), "");
        examples.R r15 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray16 = new examples.R[] { r15 };
        java.util.ArrayList<examples.R> rList17 = new java.util.ArrayList<examples.R>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList17, rArray16);
        examples.S s21 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean23 = s21.equals((java.lang.Object) (-8));
        examples.S s26 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray27 = new examples.S[] { s21, s26 };
        java.util.ArrayList<examples.S> sList28 = new java.util.ArrayList<examples.S>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList28, sArray27);
        examples.ListComp02 listComp02_30 = new examples.ListComp02(rList17, sList28);
        examples.R r33 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_30.insert_r(r33);
        boolean boolean35 = r12.equals((java.lang.Object) listComp02_30);
        examples.S s38 = new examples.S("", (java.lang.Integer) 9);
        listComp02_30.insert_s(s38);
        listComp02_30.clear();
        java.lang.Class<?> wildcardClass41 = listComp02_30.getClass();
        boolean boolean42 = r2.equals((java.lang.Object) listComp02_30);
        examples.R r45 = new examples.R((java.lang.Integer) 20000, "");
        boolean boolean46 = r2.equals((java.lang.Object) r45);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(rArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(sArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        examples.R r2 = new examples.R((java.lang.Integer) 100, "");
        java.lang.Class<?> wildcardClass3 = r2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_17.insert_r(r20);
        java.lang.Object obj22 = null;
        boolean boolean23 = r20.equals(obj22);
        java.lang.String str24 = r20.getB();
        examples.S s27 = new examples.S("hi!", (java.lang.Integer) 7);
        boolean boolean29 = s27.equals((java.lang.Object) (-5L));
        java.lang.Class<?> wildcardClass30 = s27.getClass();
        boolean boolean31 = r20.equals((java.lang.Object) s27);
        java.lang.String str32 = r20.getB();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) 20000);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        examples.R r2 = new examples.R((java.lang.Integer) (-8), "hi!");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) 10685);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_17.insert_r(r20);
        listComp02_17.clear();
        examples.S s25 = new examples.S("hi!", (java.lang.Integer) 6);
        listComp02_17.insert_s(s25);
        listComp02_17.clear();
        examples.S s30 = new examples.S("hi!", (java.lang.Integer) 7);
        examples.S s33 = new examples.S("", (java.lang.Integer) (-2));
        boolean boolean34 = s30.equals((java.lang.Object) s33);
        listComp02_17.insert_s(s30);
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) (-9));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) (-5));
        java.lang.String str3 = s2.getB();
        examples.S s6 = new examples.S("", (java.lang.Integer) 0);
        examples.R r9 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean11 = r9.equals((java.lang.Object) 6);
        java.lang.Object obj12 = null;
        boolean boolean13 = r9.equals(obj12);
        examples.R r16 = new examples.R((java.lang.Integer) 1, "hi!");
        java.lang.String str17 = r16.getB();
        boolean boolean18 = r9.equals((java.lang.Object) r16);
        java.lang.String str19 = r9.getB();
        examples.R r22 = new examples.R((java.lang.Integer) (-6), "");
        examples.R r25 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray26 = new examples.R[] { r25 };
        java.util.ArrayList<examples.R> rList27 = new java.util.ArrayList<examples.R>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList27, rArray26);
        examples.S s31 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean33 = s31.equals((java.lang.Object) (-8));
        examples.S s36 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray37 = new examples.S[] { s31, s36 };
        java.util.ArrayList<examples.S> sList38 = new java.util.ArrayList<examples.S>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList38, sArray37);
        examples.ListComp02 listComp02_40 = new examples.ListComp02(rList27, sList38);
        examples.S s43 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str44 = s43.getB();
        java.lang.String str45 = s43.getB();
        listComp02_40.insert_s(s43);
        boolean boolean47 = r22.equals((java.lang.Object) listComp02_40);
        boolean boolean48 = r9.equals((java.lang.Object) listComp02_40);
        boolean boolean49 = s6.equals((java.lang.Object) r9);
        boolean boolean50 = s2.equals((java.lang.Object) s6);
        java.lang.String str51 = s6.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(rArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(sArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        examples.R r2 = new examples.R((java.lang.Integer) (-2), "hi!");
        examples.S s5 = new examples.S("", (java.lang.Integer) 5);
        boolean boolean6 = r2.equals((java.lang.Object) "");
        java.lang.Class<?> wildcardClass7 = r2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        examples.S s2 = new examples.S("", (java.lang.Integer) 10);
        boolean boolean4 = s2.equals((java.lang.Object) 9.6d);
        java.lang.String str5 = s2.getB();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean4 = r2.equals((java.lang.Object) 6);
        java.lang.Object obj5 = null;
        boolean boolean6 = r2.equals(obj5);
        java.lang.Object obj7 = null;
        boolean boolean8 = r2.equals(obj7);
        java.lang.Class<?> wildcardClass9 = r2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.util.ArrayList<examples.R> rList0 = null;
        java.util.ArrayList<examples.S> sList1 = null;
        examples.ListComp02 listComp02_2 = new examples.ListComp02(rList0, sList1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int3 = listComp02_2.q();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) (-9800));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        examples.R r2 = new examples.R((java.lang.Integer) 10, "hi!");
        java.lang.Object obj3 = null;
        boolean boolean4 = r2.equals(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        listComp02_17.clear();
        examples.S s21 = new examples.S("hi!", (java.lang.Integer) (-2));
        listComp02_17.insert_s(s21);
        listComp02_17.clear();
        java.lang.Class<?> wildcardClass24 = listComp02_17.getClass();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.R r8 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean10 = r8.equals((java.lang.Object) 6);
        examples.R r13 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r16 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean18 = r16.equals((java.lang.Object) 6);
        examples.R r21 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r24 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray25 = new examples.R[] { r24 };
        java.util.ArrayList<examples.R> rList26 = new java.util.ArrayList<examples.R>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList26, rArray25);
        examples.S s30 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean32 = s30.equals((java.lang.Object) (-8));
        examples.S s35 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray36 = new examples.S[] { s30, s35 };
        java.util.ArrayList<examples.S> sList37 = new java.util.ArrayList<examples.S>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList37, sArray36);
        examples.ListComp02 listComp02_39 = new examples.ListComp02(rList26, sList37);
        examples.R r42 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_39.insert_r(r42);
        java.lang.String str44 = r42.getB();
        examples.R r47 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean49 = r47.equals((java.lang.Object) 6);
        examples.R[] rArray50 = new examples.R[] { r8, r13, r16, r21, r42, r47 };
        java.util.ArrayList<examples.R> rList51 = new java.util.ArrayList<examples.R>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList51, rArray50);
        examples.R r55 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray56 = new examples.R[] { r55 };
        java.util.ArrayList<examples.R> rList57 = new java.util.ArrayList<examples.R>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList57, rArray56);
        examples.S s61 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean63 = s61.equals((java.lang.Object) (-8));
        examples.S s66 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray67 = new examples.S[] { s61, s66 };
        java.util.ArrayList<examples.S> sList68 = new java.util.ArrayList<examples.S>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList68, sArray67);
        examples.ListComp02 listComp02_70 = new examples.ListComp02(rList57, sList68);
        examples.ListComp02 listComp02_71 = new examples.ListComp02(rList51, sList68);
        examples.ListComp02 listComp02_72 = new examples.ListComp02(rList4, sList68);
        examples.S s75 = new examples.S("hi!", (java.lang.Integer) 100);
        listComp02_72.insert_s(s75);
        java.lang.Class<?> wildcardClass77 = listComp02_72.getClass();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(sArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(rArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(rArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(sArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        examples.S s2 = new examples.S("", (java.lang.Integer) (-9800));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        examples.R r2 = new examples.R((java.lang.Integer) (-40), "");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean4 = r2.equals((java.lang.Object) 6);
        java.lang.Object obj5 = null;
        boolean boolean6 = r2.equals(obj5);
        examples.R r9 = new examples.R((java.lang.Integer) 1, "hi!");
        java.lang.String str10 = r9.getB();
        boolean boolean11 = r2.equals((java.lang.Object) r9);
        examples.R r14 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean16 = r14.equals((java.lang.Object) 6);
        examples.R r19 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r22 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean24 = r22.equals((java.lang.Object) 6);
        examples.R r27 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r30 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray31 = new examples.R[] { r30 };
        java.util.ArrayList<examples.R> rList32 = new java.util.ArrayList<examples.R>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList32, rArray31);
        examples.S s36 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean38 = s36.equals((java.lang.Object) (-8));
        examples.S s41 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray42 = new examples.S[] { s36, s41 };
        java.util.ArrayList<examples.S> sList43 = new java.util.ArrayList<examples.S>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList43, sArray42);
        examples.ListComp02 listComp02_45 = new examples.ListComp02(rList32, sList43);
        examples.R r48 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_45.insert_r(r48);
        java.lang.String str50 = r48.getB();
        examples.R r53 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean55 = r53.equals((java.lang.Object) 6);
        examples.R[] rArray56 = new examples.R[] { r14, r19, r22, r27, r48, r53 };
        java.util.ArrayList<examples.R> rList57 = new java.util.ArrayList<examples.R>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList57, rArray56);
        examples.R r61 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray62 = new examples.R[] { r61 };
        java.util.ArrayList<examples.R> rList63 = new java.util.ArrayList<examples.R>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList63, rArray62);
        examples.S s67 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean69 = s67.equals((java.lang.Object) (-8));
        examples.S s72 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray73 = new examples.S[] { s67, s72 };
        java.util.ArrayList<examples.S> sList74 = new java.util.ArrayList<examples.S>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList74, sArray73);
        examples.ListComp02 listComp02_76 = new examples.ListComp02(rList63, sList74);
        examples.ListComp02 listComp02_77 = new examples.ListComp02(rList57, sList74);
        examples.S s80 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str81 = s80.getB();
        boolean boolean83 = s80.equals((java.lang.Object) 10.0d);
        listComp02_77.insert_s(s80);
        boolean boolean85 = r9.equals((java.lang.Object) listComp02_77);
        examples.R r88 = new examples.R((java.lang.Integer) 0, "hi!");
        java.lang.String str89 = r88.getB();
        java.lang.String str90 = r88.getB();
        listComp02_77.insert_r(r88);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(rArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(sArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(rArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(rArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(sArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "hi!" + "'", str89, "hi!");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "hi!" + "'", str90, "hi!");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) (-10692));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) 7);
        examples.R r5 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray6 = new examples.R[] { r5 };
        java.util.ArrayList<examples.R> rList7 = new java.util.ArrayList<examples.R>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList7, rArray6);
        examples.S s11 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean13 = s11.equals((java.lang.Object) (-8));
        examples.S s16 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray17 = new examples.S[] { s11, s16 };
        java.util.ArrayList<examples.S> sList18 = new java.util.ArrayList<examples.S>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList18, sArray17);
        examples.ListComp02 listComp02_20 = new examples.ListComp02(rList7, sList18);
        examples.R r23 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_20.insert_r(r23);
        listComp02_20.clear();
        listComp02_20.clear();
        boolean boolean27 = s2.equals((java.lang.Object) listComp02_20);
        examples.S s30 = new examples.S("hi!", (java.lang.Integer) (-5));
        listComp02_20.insert_s(s30);
        listComp02_20.clear();
        org.junit.Assert.assertNotNull(rArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(sArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        examples.R r2 = new examples.R((java.lang.Integer) 32, "hi!");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean4 = r2.equals((java.lang.Object) 6);
        java.lang.Object obj5 = null;
        boolean boolean6 = r2.equals(obj5);
        examples.R r9 = new examples.R((java.lang.Integer) 1, "hi!");
        java.lang.String str10 = r9.getB();
        boolean boolean11 = r2.equals((java.lang.Object) r9);
        examples.R r14 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean16 = r14.equals((java.lang.Object) 6);
        examples.R r19 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r22 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean24 = r22.equals((java.lang.Object) 6);
        examples.R r27 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r30 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray31 = new examples.R[] { r30 };
        java.util.ArrayList<examples.R> rList32 = new java.util.ArrayList<examples.R>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList32, rArray31);
        examples.S s36 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean38 = s36.equals((java.lang.Object) (-8));
        examples.S s41 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray42 = new examples.S[] { s36, s41 };
        java.util.ArrayList<examples.S> sList43 = new java.util.ArrayList<examples.S>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList43, sArray42);
        examples.ListComp02 listComp02_45 = new examples.ListComp02(rList32, sList43);
        examples.R r48 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_45.insert_r(r48);
        java.lang.String str50 = r48.getB();
        examples.R r53 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean55 = r53.equals((java.lang.Object) 6);
        examples.R[] rArray56 = new examples.R[] { r14, r19, r22, r27, r48, r53 };
        java.util.ArrayList<examples.R> rList57 = new java.util.ArrayList<examples.R>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList57, rArray56);
        examples.R r61 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray62 = new examples.R[] { r61 };
        java.util.ArrayList<examples.R> rList63 = new java.util.ArrayList<examples.R>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList63, rArray62);
        examples.S s67 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean69 = s67.equals((java.lang.Object) (-8));
        examples.S s72 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray73 = new examples.S[] { s67, s72 };
        java.util.ArrayList<examples.S> sList74 = new java.util.ArrayList<examples.S>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList74, sArray73);
        examples.ListComp02 listComp02_76 = new examples.ListComp02(rList63, sList74);
        examples.ListComp02 listComp02_77 = new examples.ListComp02(rList57, sList74);
        examples.S s80 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str81 = s80.getB();
        boolean boolean83 = s80.equals((java.lang.Object) 10.0d);
        listComp02_77.insert_s(s80);
        boolean boolean85 = r9.equals((java.lang.Object) listComp02_77);
        java.lang.Class<?> wildcardClass86 = listComp02_77.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(rArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(sArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(rArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(rArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(sArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        java.lang.Object obj3 = null;
        boolean boolean4 = r2.equals(obj3);
        examples.R r7 = new examples.R((java.lang.Integer) 100, "hi!");
        java.lang.String str8 = r7.getB();
        boolean boolean9 = r2.equals((java.lang.Object) r7);
        examples.R r12 = new examples.R((java.lang.Integer) (-1), "hi!");
        java.lang.String str13 = r12.getB();
        boolean boolean14 = r7.equals((java.lang.Object) r12);
        boolean boolean16 = r7.equals((java.lang.Object) (-10.5d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        examples.S s2 = new examples.S("", (java.lang.Integer) (-9900));
        java.lang.Class<?> wildcardClass3 = s2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray21 = new examples.R[] { r20 };
        java.util.ArrayList<examples.R> rList22 = new java.util.ArrayList<examples.R>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList22, rArray21);
        examples.S s26 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean28 = s26.equals((java.lang.Object) (-8));
        examples.S s31 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray32 = new examples.S[] { s26, s31 };
        java.util.ArrayList<examples.S> sList33 = new java.util.ArrayList<examples.S>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList33, sArray32);
        examples.ListComp02 listComp02_35 = new examples.ListComp02(rList22, sList33);
        examples.ListComp02 listComp02_36 = new examples.ListComp02(rList4, sList33);
        examples.R r39 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray40 = new examples.R[] { r39 };
        java.util.ArrayList<examples.R> rList41 = new java.util.ArrayList<examples.R>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList41, rArray40);
        examples.S s45 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean47 = s45.equals((java.lang.Object) (-8));
        examples.S s50 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray51 = new examples.S[] { s45, s50 };
        java.util.ArrayList<examples.S> sList52 = new java.util.ArrayList<examples.S>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList52, sArray51);
        examples.ListComp02 listComp02_54 = new examples.ListComp02(rList41, sList52);
        examples.ListComp02 listComp02_55 = new examples.ListComp02(rList4, sList52);
        examples.S s58 = new examples.S("", (java.lang.Integer) 0);
        listComp02_55.insert_s(s58);
        listComp02_55.clear();
        examples.S s63 = new examples.S("", (java.lang.Integer) (-3));
        examples.S s66 = new examples.S("hi!", (java.lang.Integer) (-8));
        boolean boolean68 = s66.equals((java.lang.Object) (-2));
        java.lang.String str69 = s66.getB();
        boolean boolean70 = s63.equals((java.lang.Object) str69);
        listComp02_55.insert_s(s63);
        boolean boolean73 = s63.equals((java.lang.Object) 6.9d);
        java.lang.String str74 = s63.getB();
        java.lang.String str75 = s63.getB();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(rArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(sArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(rArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(sArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        examples.R r2 = new examples.R((java.lang.Integer) (-9800), "hi!");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        examples.R r2 = new examples.R((java.lang.Integer) (-6), "hi!");
        java.lang.String str3 = r2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        examples.S s2 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str3 = s2.getB();
        boolean boolean5 = s2.equals((java.lang.Object) 10.0d);
        java.lang.String str6 = s2.getB();
        examples.S s9 = new examples.S("", (java.lang.Integer) (-1));
        boolean boolean10 = s2.equals((java.lang.Object) "");
        java.lang.Class<?> wildcardClass11 = s2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean4 = r2.equals((java.lang.Object) 6);
        examples.R r7 = new examples.R((java.lang.Integer) (-6), "");
        examples.R r10 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray11 = new examples.R[] { r10 };
        java.util.ArrayList<examples.R> rList12 = new java.util.ArrayList<examples.R>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList12, rArray11);
        examples.S s16 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean18 = s16.equals((java.lang.Object) (-8));
        examples.S s21 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray22 = new examples.S[] { s16, s21 };
        java.util.ArrayList<examples.S> sList23 = new java.util.ArrayList<examples.S>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList23, sArray22);
        examples.ListComp02 listComp02_25 = new examples.ListComp02(rList12, sList23);
        examples.R r28 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_25.insert_r(r28);
        boolean boolean30 = r7.equals((java.lang.Object) listComp02_25);
        boolean boolean31 = r2.equals((java.lang.Object) r7);
        examples.R r34 = new examples.R((java.lang.Integer) (-1), "hi!");
        java.lang.Object obj35 = null;
        boolean boolean36 = r34.equals(obj35);
        java.lang.Class<?> wildcardClass37 = r34.getClass();
        boolean boolean38 = r2.equals((java.lang.Object) r34);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(sArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        examples.S s2 = new examples.S("", (java.lang.Integer) (-3));
        java.lang.Class<?> wildcardClass3 = s2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.R r8 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean10 = r8.equals((java.lang.Object) 6);
        examples.R r13 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r16 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean18 = r16.equals((java.lang.Object) 6);
        examples.R r21 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r24 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray25 = new examples.R[] { r24 };
        java.util.ArrayList<examples.R> rList26 = new java.util.ArrayList<examples.R>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList26, rArray25);
        examples.S s30 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean32 = s30.equals((java.lang.Object) (-8));
        examples.S s35 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray36 = new examples.S[] { s30, s35 };
        java.util.ArrayList<examples.S> sList37 = new java.util.ArrayList<examples.S>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList37, sArray36);
        examples.ListComp02 listComp02_39 = new examples.ListComp02(rList26, sList37);
        examples.R r42 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_39.insert_r(r42);
        java.lang.String str44 = r42.getB();
        examples.R r47 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean49 = r47.equals((java.lang.Object) 6);
        examples.R[] rArray50 = new examples.R[] { r8, r13, r16, r21, r42, r47 };
        java.util.ArrayList<examples.R> rList51 = new java.util.ArrayList<examples.R>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList51, rArray50);
        examples.R r55 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray56 = new examples.R[] { r55 };
        java.util.ArrayList<examples.R> rList57 = new java.util.ArrayList<examples.R>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList57, rArray56);
        examples.S s61 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean63 = s61.equals((java.lang.Object) (-8));
        examples.S s66 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray67 = new examples.S[] { s61, s66 };
        java.util.ArrayList<examples.S> sList68 = new java.util.ArrayList<examples.S>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList68, sArray67);
        examples.ListComp02 listComp02_70 = new examples.ListComp02(rList57, sList68);
        examples.ListComp02 listComp02_71 = new examples.ListComp02(rList51, sList68);
        examples.ListComp02 listComp02_72 = new examples.ListComp02(rList4, sList68);
        examples.S s75 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean77 = s75.equals((java.lang.Object) (-8));
        listComp02_72.insert_s(s75);
        listComp02_72.clear();
        examples.S s80 = null;
        listComp02_72.insert_s(s80);
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(sArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(rArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(rArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(sArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        examples.R r2 = new examples.R((java.lang.Integer) (-10692), "");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        examples.R r2 = new examples.R((java.lang.Integer) 7, "");
        java.lang.String str3 = r2.getB();
        examples.S s6 = new examples.S("hi!", (java.lang.Integer) 7);
        examples.S s9 = new examples.S("", (java.lang.Integer) (-2));
        boolean boolean10 = s6.equals((java.lang.Object) s9);
        boolean boolean11 = r2.equals((java.lang.Object) s6);
        examples.R r14 = new examples.R((java.lang.Integer) (-6), "");
        boolean boolean15 = r2.equals((java.lang.Object) "");
        java.lang.Class<?> wildcardClass16 = r2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray21 = new examples.R[] { r20 };
        java.util.ArrayList<examples.R> rList22 = new java.util.ArrayList<examples.R>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList22, rArray21);
        examples.S s26 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean28 = s26.equals((java.lang.Object) (-8));
        examples.S s31 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray32 = new examples.S[] { s26, s31 };
        java.util.ArrayList<examples.S> sList33 = new java.util.ArrayList<examples.S>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList33, sArray32);
        examples.ListComp02 listComp02_35 = new examples.ListComp02(rList22, sList33);
        examples.ListComp02 listComp02_36 = new examples.ListComp02(rList4, sList33);
        java.util.ArrayList<examples.S> sList37 = null;
        examples.ListComp02 listComp02_38 = new examples.ListComp02(rList4, sList37);
        examples.R r41 = new examples.R((java.lang.Integer) 1, "");
        examples.R r44 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray45 = new examples.R[] { r44 };
        java.util.ArrayList<examples.R> rList46 = new java.util.ArrayList<examples.R>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList46, rArray45);
        examples.S s50 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean52 = s50.equals((java.lang.Object) (-8));
        examples.S s55 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray56 = new examples.S[] { s50, s55 };
        java.util.ArrayList<examples.S> sList57 = new java.util.ArrayList<examples.S>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList57, sArray56);
        examples.ListComp02 listComp02_59 = new examples.ListComp02(rList46, sList57);
        examples.R r62 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray63 = new examples.R[] { r62 };
        java.util.ArrayList<examples.R> rList64 = new java.util.ArrayList<examples.R>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList64, rArray63);
        examples.S s68 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean70 = s68.equals((java.lang.Object) (-8));
        examples.S s73 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray74 = new examples.S[] { s68, s73 };
        java.util.ArrayList<examples.S> sList75 = new java.util.ArrayList<examples.S>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList75, sArray74);
        examples.ListComp02 listComp02_77 = new examples.ListComp02(rList64, sList75);
        examples.ListComp02 listComp02_78 = new examples.ListComp02(rList46, sList75);
        boolean boolean79 = r41.equals((java.lang.Object) sList75);
        examples.ListComp02 listComp02_80 = new examples.ListComp02(rList4, sList75);
        examples.S s83 = new examples.S("", (java.lang.Integer) 4);
        java.lang.String str84 = s83.getB();
        listComp02_80.insert_s(s83);
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(rArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(sArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(rArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(sArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(rArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(sArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        listComp02_17.clear();
        examples.S s21 = new examples.S("hi!", (java.lang.Integer) (-2));
        listComp02_17.insert_s(s21);
        java.lang.Class<?> wildcardClass23 = listComp02_17.getClass();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean4 = r2.equals((java.lang.Object) 6);
        java.lang.Object obj5 = null;
        boolean boolean6 = r2.equals(obj5);
        examples.R r9 = new examples.R((java.lang.Integer) 1, "hi!");
        java.lang.String str10 = r9.getB();
        boolean boolean11 = r2.equals((java.lang.Object) r9);
        boolean boolean13 = r2.equals((java.lang.Object) (-8));
        java.lang.String str14 = r2.getB();
        java.lang.Class<?> wildcardClass15 = r2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        examples.S s2 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str3 = s2.getB();
        java.lang.String str4 = s2.getB();
        java.lang.String str5 = s2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) 7);
        boolean boolean4 = s2.equals((java.lang.Object) ' ');
        java.lang.String str5 = s2.getB();
        java.lang.String str6 = s2.getB();
        examples.R r9 = new examples.R((java.lang.Integer) (-6), "");
        examples.R r12 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray13 = new examples.R[] { r12 };
        java.util.ArrayList<examples.R> rList14 = new java.util.ArrayList<examples.R>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList14, rArray13);
        examples.S s18 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean20 = s18.equals((java.lang.Object) (-8));
        examples.S s23 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray24 = new examples.S[] { s18, s23 };
        java.util.ArrayList<examples.S> sList25 = new java.util.ArrayList<examples.S>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList25, sArray24);
        examples.ListComp02 listComp02_27 = new examples.ListComp02(rList14, sList25);
        examples.S s30 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str31 = s30.getB();
        java.lang.String str32 = s30.getB();
        listComp02_27.insert_s(s30);
        boolean boolean34 = r9.equals((java.lang.Object) listComp02_27);
        listComp02_27.clear();
        examples.S s38 = new examples.S("hi!", (java.lang.Integer) 2);
        listComp02_27.insert_s(s38);
        boolean boolean40 = s2.equals((java.lang.Object) listComp02_27);
        java.lang.String str41 = s2.getB();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(rArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(sArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        examples.R r2 = new examples.R((java.lang.Integer) 8, "");
        java.lang.String str3 = r2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        examples.S s2 = new examples.S("", (java.lang.Integer) (-10));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        listComp02_17.clear();
        examples.S s21 = new examples.S("hi!", (java.lang.Integer) (-2));
        listComp02_17.insert_s(s21);
        examples.R r25 = new examples.R((java.lang.Integer) (-8), "");
        listComp02_17.insert_r(r25);
        examples.R r29 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray30 = new examples.R[] { r29 };
        java.util.ArrayList<examples.R> rList31 = new java.util.ArrayList<examples.R>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList31, rArray30);
        examples.S s35 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean37 = s35.equals((java.lang.Object) (-8));
        examples.S s40 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray41 = new examples.S[] { s35, s40 };
        java.util.ArrayList<examples.S> sList42 = new java.util.ArrayList<examples.S>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList42, sArray41);
        examples.ListComp02 listComp02_44 = new examples.ListComp02(rList31, sList42);
        examples.R r47 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray48 = new examples.R[] { r47 };
        java.util.ArrayList<examples.R> rList49 = new java.util.ArrayList<examples.R>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList49, rArray48);
        examples.S s53 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean55 = s53.equals((java.lang.Object) (-8));
        examples.S s58 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray59 = new examples.S[] { s53, s58 };
        java.util.ArrayList<examples.S> sList60 = new java.util.ArrayList<examples.S>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList60, sArray59);
        examples.ListComp02 listComp02_62 = new examples.ListComp02(rList49, sList60);
        examples.ListComp02 listComp02_63 = new examples.ListComp02(rList31, sList60);
        boolean boolean64 = r25.equals((java.lang.Object) listComp02_63);
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(rArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(sArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(rArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(sArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.util.ArrayList<examples.R> rList0 = null;
        examples.R r3 = new examples.R((java.lang.Integer) (-6), "");
        java.util.ArrayList<examples.R> rList4 = null;
        examples.R r7 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray8 = new examples.R[] { r7 };
        java.util.ArrayList<examples.R> rList9 = new java.util.ArrayList<examples.R>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList9, rArray8);
        examples.R r13 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean15 = r13.equals((java.lang.Object) 6);
        examples.R r18 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r21 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean23 = r21.equals((java.lang.Object) 6);
        examples.R r26 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r29 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray30 = new examples.R[] { r29 };
        java.util.ArrayList<examples.R> rList31 = new java.util.ArrayList<examples.R>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList31, rArray30);
        examples.S s35 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean37 = s35.equals((java.lang.Object) (-8));
        examples.S s40 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray41 = new examples.S[] { s35, s40 };
        java.util.ArrayList<examples.S> sList42 = new java.util.ArrayList<examples.S>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList42, sArray41);
        examples.ListComp02 listComp02_44 = new examples.ListComp02(rList31, sList42);
        examples.R r47 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_44.insert_r(r47);
        java.lang.String str49 = r47.getB();
        examples.R r52 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean54 = r52.equals((java.lang.Object) 6);
        examples.R[] rArray55 = new examples.R[] { r13, r18, r21, r26, r47, r52 };
        java.util.ArrayList<examples.R> rList56 = new java.util.ArrayList<examples.R>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList56, rArray55);
        examples.R r60 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray61 = new examples.R[] { r60 };
        java.util.ArrayList<examples.R> rList62 = new java.util.ArrayList<examples.R>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList62, rArray61);
        examples.S s66 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean68 = s66.equals((java.lang.Object) (-8));
        examples.S s71 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray72 = new examples.S[] { s66, s71 };
        java.util.ArrayList<examples.S> sList73 = new java.util.ArrayList<examples.S>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList73, sArray72);
        examples.ListComp02 listComp02_75 = new examples.ListComp02(rList62, sList73);
        examples.ListComp02 listComp02_76 = new examples.ListComp02(rList56, sList73);
        examples.ListComp02 listComp02_77 = new examples.ListComp02(rList9, sList73);
        examples.ListComp02 listComp02_78 = new examples.ListComp02(rList4, sList73);
        boolean boolean79 = r3.equals((java.lang.Object) sList73);
        examples.ListComp02 listComp02_80 = new examples.ListComp02(rList0, sList73);
        org.junit.Assert.assertNotNull(rArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(rArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(sArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(rArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(rArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(sArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray21 = new examples.R[] { r20 };
        java.util.ArrayList<examples.R> rList22 = new java.util.ArrayList<examples.R>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList22, rArray21);
        examples.S s26 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean28 = s26.equals((java.lang.Object) (-8));
        examples.S s31 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray32 = new examples.S[] { s26, s31 };
        java.util.ArrayList<examples.S> sList33 = new java.util.ArrayList<examples.S>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList33, sArray32);
        examples.ListComp02 listComp02_35 = new examples.ListComp02(rList22, sList33);
        examples.ListComp02 listComp02_36 = new examples.ListComp02(rList4, sList33);
        examples.R r39 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray40 = new examples.R[] { r39 };
        java.util.ArrayList<examples.R> rList41 = new java.util.ArrayList<examples.R>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList41, rArray40);
        examples.S s45 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean47 = s45.equals((java.lang.Object) (-8));
        examples.S s50 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray51 = new examples.S[] { s45, s50 };
        java.util.ArrayList<examples.S> sList52 = new java.util.ArrayList<examples.S>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList52, sArray51);
        examples.ListComp02 listComp02_54 = new examples.ListComp02(rList41, sList52);
        examples.R r57 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray58 = new examples.R[] { r57 };
        java.util.ArrayList<examples.R> rList59 = new java.util.ArrayList<examples.R>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList59, rArray58);
        examples.S s63 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean65 = s63.equals((java.lang.Object) (-8));
        examples.S s68 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray69 = new examples.S[] { s63, s68 };
        java.util.ArrayList<examples.S> sList70 = new java.util.ArrayList<examples.S>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList70, sArray69);
        examples.ListComp02 listComp02_72 = new examples.ListComp02(rList59, sList70);
        examples.ListComp02 listComp02_73 = new examples.ListComp02(rList41, sList70);
        examples.R r76 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray77 = new examples.R[] { r76 };
        java.util.ArrayList<examples.R> rList78 = new java.util.ArrayList<examples.R>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList78, rArray77);
        examples.S s82 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean84 = s82.equals((java.lang.Object) (-8));
        examples.S s87 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray88 = new examples.S[] { s82, s87 };
        java.util.ArrayList<examples.S> sList89 = new java.util.ArrayList<examples.S>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList89, sArray88);
        examples.ListComp02 listComp02_91 = new examples.ListComp02(rList78, sList89);
        examples.ListComp02 listComp02_92 = new examples.ListComp02(rList41, sList89);
        examples.ListComp02 listComp02_93 = new examples.ListComp02(rList4, sList89);
        java.lang.Class<?> wildcardClass94 = sList89.getClass();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(rArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(sArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(rArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(sArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(rArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(sArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(rArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(sArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray21 = new examples.R[] { r20 };
        java.util.ArrayList<examples.R> rList22 = new java.util.ArrayList<examples.R>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList22, rArray21);
        examples.S s26 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean28 = s26.equals((java.lang.Object) (-8));
        examples.S s31 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray32 = new examples.S[] { s26, s31 };
        java.util.ArrayList<examples.S> sList33 = new java.util.ArrayList<examples.S>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList33, sArray32);
        examples.ListComp02 listComp02_35 = new examples.ListComp02(rList22, sList33);
        examples.ListComp02 listComp02_36 = new examples.ListComp02(rList4, sList33);
        examples.R r39 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray40 = new examples.R[] { r39 };
        java.util.ArrayList<examples.R> rList41 = new java.util.ArrayList<examples.R>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList41, rArray40);
        examples.S s45 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean47 = s45.equals((java.lang.Object) (-8));
        examples.S s50 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray51 = new examples.S[] { s45, s50 };
        java.util.ArrayList<examples.S> sList52 = new java.util.ArrayList<examples.S>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList52, sArray51);
        examples.ListComp02 listComp02_54 = new examples.ListComp02(rList41, sList52);
        examples.ListComp02 listComp02_55 = new examples.ListComp02(rList4, sList52);
        examples.R r58 = new examples.R((java.lang.Integer) 1, "");
        examples.R r61 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray62 = new examples.R[] { r61 };
        java.util.ArrayList<examples.R> rList63 = new java.util.ArrayList<examples.R>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList63, rArray62);
        examples.S s67 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean69 = s67.equals((java.lang.Object) (-8));
        examples.S s72 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray73 = new examples.S[] { s67, s72 };
        java.util.ArrayList<examples.S> sList74 = new java.util.ArrayList<examples.S>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList74, sArray73);
        examples.ListComp02 listComp02_76 = new examples.ListComp02(rList63, sList74);
        examples.R r79 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray80 = new examples.R[] { r79 };
        java.util.ArrayList<examples.R> rList81 = new java.util.ArrayList<examples.R>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList81, rArray80);
        examples.S s85 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean87 = s85.equals((java.lang.Object) (-8));
        examples.S s90 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray91 = new examples.S[] { s85, s90 };
        java.util.ArrayList<examples.S> sList92 = new java.util.ArrayList<examples.S>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList92, sArray91);
        examples.ListComp02 listComp02_94 = new examples.ListComp02(rList81, sList92);
        examples.ListComp02 listComp02_95 = new examples.ListComp02(rList63, sList92);
        boolean boolean96 = r58.equals((java.lang.Object) sList92);
        examples.ListComp02 listComp02_97 = new examples.ListComp02(rList4, sList92);
        java.util.ArrayList<examples.S> sList98 = null;
        examples.ListComp02 listComp02_99 = new examples.ListComp02(rList4, sList98);
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(rArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(sArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(rArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(sArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(rArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(sArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(rArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(sArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        examples.R r2 = new examples.R((java.lang.Integer) 20000, "");
        java.lang.String str3 = r2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) 7);
        examples.R r5 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray6 = new examples.R[] { r5 };
        java.util.ArrayList<examples.R> rList7 = new java.util.ArrayList<examples.R>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList7, rArray6);
        examples.S s11 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean13 = s11.equals((java.lang.Object) (-8));
        examples.S s16 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray17 = new examples.S[] { s11, s16 };
        java.util.ArrayList<examples.S> sList18 = new java.util.ArrayList<examples.S>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList18, sArray17);
        examples.ListComp02 listComp02_20 = new examples.ListComp02(rList7, sList18);
        examples.S s23 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str24 = s23.getB();
        java.lang.String str25 = s23.getB();
        listComp02_20.insert_s(s23);
        examples.R r29 = new examples.R((java.lang.Integer) (-2), "");
        listComp02_20.insert_r(r29);
        boolean boolean31 = s2.equals((java.lang.Object) listComp02_20);
        examples.S s34 = new examples.S("hi!", (java.lang.Integer) 2);
        java.lang.String str35 = s34.getB();
        boolean boolean36 = s2.equals((java.lang.Object) s34);
        java.lang.String str37 = s2.getB();
        examples.S s40 = new examples.S("hi!", (java.lang.Integer) (-8));
        boolean boolean41 = s2.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(rArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(sArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean4 = r2.equals((java.lang.Object) 6);
        examples.R r7 = new examples.R((java.lang.Integer) (-6), "");
        examples.R r10 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray11 = new examples.R[] { r10 };
        java.util.ArrayList<examples.R> rList12 = new java.util.ArrayList<examples.R>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList12, rArray11);
        examples.S s16 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean18 = s16.equals((java.lang.Object) (-8));
        examples.S s21 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray22 = new examples.S[] { s16, s21 };
        java.util.ArrayList<examples.S> sList23 = new java.util.ArrayList<examples.S>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList23, sArray22);
        examples.ListComp02 listComp02_25 = new examples.ListComp02(rList12, sList23);
        examples.R r28 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_25.insert_r(r28);
        boolean boolean30 = r7.equals((java.lang.Object) listComp02_25);
        boolean boolean31 = r2.equals((java.lang.Object) r7);
        java.lang.String str32 = r7.getB();
        java.lang.String str33 = r7.getB();
        java.lang.String str34 = r7.getB();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(sArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray21 = new examples.R[] { r20 };
        java.util.ArrayList<examples.R> rList22 = new java.util.ArrayList<examples.R>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList22, rArray21);
        examples.S s26 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean28 = s26.equals((java.lang.Object) (-8));
        examples.S s31 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray32 = new examples.S[] { s26, s31 };
        java.util.ArrayList<examples.S> sList33 = new java.util.ArrayList<examples.S>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList33, sArray32);
        examples.ListComp02 listComp02_35 = new examples.ListComp02(rList22, sList33);
        examples.ListComp02 listComp02_36 = new examples.ListComp02(rList4, sList33);
        examples.R r39 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray40 = new examples.R[] { r39 };
        java.util.ArrayList<examples.R> rList41 = new java.util.ArrayList<examples.R>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList41, rArray40);
        examples.S s45 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean47 = s45.equals((java.lang.Object) (-8));
        examples.S s50 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray51 = new examples.S[] { s45, s50 };
        java.util.ArrayList<examples.S> sList52 = new java.util.ArrayList<examples.S>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList52, sArray51);
        examples.ListComp02 listComp02_54 = new examples.ListComp02(rList41, sList52);
        examples.ListComp02 listComp02_55 = new examples.ListComp02(rList4, sList52);
        examples.S s58 = new examples.S("", (java.lang.Integer) 0);
        listComp02_55.insert_s(s58);
        java.lang.String str60 = s58.getB();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(rArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(sArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(rArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(sArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean22 = r20.equals((java.lang.Object) 6);
        examples.R r25 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r28 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean30 = r28.equals((java.lang.Object) 6);
        examples.R r33 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r36 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray37 = new examples.R[] { r36 };
        java.util.ArrayList<examples.R> rList38 = new java.util.ArrayList<examples.R>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList38, rArray37);
        examples.S s42 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean44 = s42.equals((java.lang.Object) (-8));
        examples.S s47 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray48 = new examples.S[] { s42, s47 };
        java.util.ArrayList<examples.S> sList49 = new java.util.ArrayList<examples.S>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList49, sArray48);
        examples.ListComp02 listComp02_51 = new examples.ListComp02(rList38, sList49);
        examples.R r54 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_51.insert_r(r54);
        java.lang.String str56 = r54.getB();
        examples.R r59 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean61 = r59.equals((java.lang.Object) 6);
        examples.R[] rArray62 = new examples.R[] { r20, r25, r28, r33, r54, r59 };
        java.util.ArrayList<examples.R> rList63 = new java.util.ArrayList<examples.R>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList63, rArray62);
        examples.R r67 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray68 = new examples.R[] { r67 };
        java.util.ArrayList<examples.R> rList69 = new java.util.ArrayList<examples.R>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList69, rArray68);
        examples.S s73 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean75 = s73.equals((java.lang.Object) (-8));
        examples.S s78 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray79 = new examples.S[] { s73, s78 };
        java.util.ArrayList<examples.S> sList80 = new java.util.ArrayList<examples.S>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList80, sArray79);
        examples.ListComp02 listComp02_82 = new examples.ListComp02(rList69, sList80);
        examples.ListComp02 listComp02_83 = new examples.ListComp02(rList63, sList80);
        examples.ListComp02 listComp02_84 = new examples.ListComp02(rList4, sList80);
        examples.R r87 = new examples.R((java.lang.Integer) (-10), "");
        listComp02_84.insert_r(r87);
        listComp02_84.clear();
        java.lang.Class<?> wildcardClass90 = listComp02_84.getClass();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(rArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(sArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(rArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(rArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(sArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray21 = new examples.R[] { r20 };
        java.util.ArrayList<examples.R> rList22 = new java.util.ArrayList<examples.R>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList22, rArray21);
        examples.S s26 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean28 = s26.equals((java.lang.Object) (-8));
        examples.S s31 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray32 = new examples.S[] { s26, s31 };
        java.util.ArrayList<examples.S> sList33 = new java.util.ArrayList<examples.S>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList33, sArray32);
        examples.ListComp02 listComp02_35 = new examples.ListComp02(rList22, sList33);
        examples.ListComp02 listComp02_36 = new examples.ListComp02(rList4, sList33);
        examples.R r39 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray40 = new examples.R[] { r39 };
        java.util.ArrayList<examples.R> rList41 = new java.util.ArrayList<examples.R>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList41, rArray40);
        examples.S s45 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean47 = s45.equals((java.lang.Object) (-8));
        examples.S s50 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray51 = new examples.S[] { s45, s50 };
        java.util.ArrayList<examples.S> sList52 = new java.util.ArrayList<examples.S>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList52, sArray51);
        examples.ListComp02 listComp02_54 = new examples.ListComp02(rList41, sList52);
        examples.ListComp02 listComp02_55 = new examples.ListComp02(rList4, sList52);
        examples.S s58 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str59 = s58.getB();
        boolean boolean61 = s58.equals((java.lang.Object) 10.0d);
        java.lang.String str62 = s58.getB();
        boolean boolean64 = s58.equals((java.lang.Object) 9.6d);
        listComp02_55.insert_s(s58);
        java.lang.Object obj66 = null;
        boolean boolean67 = s58.equals(obj66);
        java.lang.String str68 = s58.getB();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(rArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(sArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(rArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(sArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.util.ArrayList<examples.R> rList0 = null;
        examples.R r3 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean5 = r3.equals((java.lang.Object) 6);
        examples.R r8 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r11 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean13 = r11.equals((java.lang.Object) 6);
        examples.R r16 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r19 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray20 = new examples.R[] { r19 };
        java.util.ArrayList<examples.R> rList21 = new java.util.ArrayList<examples.R>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList21, rArray20);
        examples.S s25 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean27 = s25.equals((java.lang.Object) (-8));
        examples.S s30 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray31 = new examples.S[] { s25, s30 };
        java.util.ArrayList<examples.S> sList32 = new java.util.ArrayList<examples.S>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList32, sArray31);
        examples.ListComp02 listComp02_34 = new examples.ListComp02(rList21, sList32);
        examples.R r37 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_34.insert_r(r37);
        java.lang.String str39 = r37.getB();
        examples.R r42 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean44 = r42.equals((java.lang.Object) 6);
        examples.R[] rArray45 = new examples.R[] { r3, r8, r11, r16, r37, r42 };
        java.util.ArrayList<examples.R> rList46 = new java.util.ArrayList<examples.R>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList46, rArray45);
        examples.R r50 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray51 = new examples.R[] { r50 };
        java.util.ArrayList<examples.R> rList52 = new java.util.ArrayList<examples.R>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList52, rArray51);
        examples.S s56 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean58 = s56.equals((java.lang.Object) (-8));
        examples.S s61 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray62 = new examples.S[] { s56, s61 };
        java.util.ArrayList<examples.S> sList63 = new java.util.ArrayList<examples.S>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList63, sArray62);
        examples.ListComp02 listComp02_65 = new examples.ListComp02(rList52, sList63);
        examples.ListComp02 listComp02_66 = new examples.ListComp02(rList46, sList63);
        examples.ListComp02 listComp02_67 = new examples.ListComp02(rList0, sList63);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(rArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(sArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(rArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(rArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(sArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        examples.R r2 = new examples.R((java.lang.Integer) 9, "hi!");
        java.lang.Class<?> wildcardClass3 = r2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_17.insert_r(r20);
        java.lang.Object obj22 = null;
        boolean boolean23 = r20.equals(obj22);
        java.lang.String str24 = r20.getB();
        examples.S s27 = new examples.S("hi!", (java.lang.Integer) (-8));
        boolean boolean28 = r20.equals((java.lang.Object) (-8));
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) (-10));
        examples.R r5 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray6 = new examples.R[] { r5 };
        java.util.ArrayList<examples.R> rList7 = new java.util.ArrayList<examples.R>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList7, rArray6);
        examples.S s11 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean13 = s11.equals((java.lang.Object) (-8));
        examples.S s16 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray17 = new examples.S[] { s11, s16 };
        java.util.ArrayList<examples.S> sList18 = new java.util.ArrayList<examples.S>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList18, sArray17);
        examples.ListComp02 listComp02_20 = new examples.ListComp02(rList7, sList18);
        examples.R r23 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray24 = new examples.R[] { r23 };
        java.util.ArrayList<examples.R> rList25 = new java.util.ArrayList<examples.R>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList25, rArray24);
        examples.S s29 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean31 = s29.equals((java.lang.Object) (-8));
        examples.S s34 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray35 = new examples.S[] { s29, s34 };
        java.util.ArrayList<examples.S> sList36 = new java.util.ArrayList<examples.S>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList36, sArray35);
        examples.ListComp02 listComp02_38 = new examples.ListComp02(rList25, sList36);
        examples.R r41 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray42 = new examples.R[] { r41 };
        java.util.ArrayList<examples.R> rList43 = new java.util.ArrayList<examples.R>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList43, rArray42);
        examples.S s47 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean49 = s47.equals((java.lang.Object) (-8));
        examples.S s52 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray53 = new examples.S[] { s47, s52 };
        java.util.ArrayList<examples.S> sList54 = new java.util.ArrayList<examples.S>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList54, sArray53);
        examples.ListComp02 listComp02_56 = new examples.ListComp02(rList43, sList54);
        examples.ListComp02 listComp02_57 = new examples.ListComp02(rList25, sList54);
        examples.R r60 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray61 = new examples.R[] { r60 };
        java.util.ArrayList<examples.R> rList62 = new java.util.ArrayList<examples.R>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList62, rArray61);
        examples.S s66 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean68 = s66.equals((java.lang.Object) (-8));
        examples.S s71 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray72 = new examples.S[] { s66, s71 };
        java.util.ArrayList<examples.S> sList73 = new java.util.ArrayList<examples.S>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList73, sArray72);
        examples.ListComp02 listComp02_75 = new examples.ListComp02(rList62, sList73);
        examples.ListComp02 listComp02_76 = new examples.ListComp02(rList25, sList73);
        examples.ListComp02 listComp02_77 = new examples.ListComp02(rList7, sList73);
        examples.S s80 = new examples.S("hi!", (java.lang.Integer) 7);
        examples.S s83 = new examples.S("", (java.lang.Integer) (-2));
        boolean boolean84 = s80.equals((java.lang.Object) s83);
        listComp02_77.insert_s(s80);
        boolean boolean86 = s2.equals((java.lang.Object) listComp02_77);
        java.lang.Class<?> wildcardClass87 = s2.getClass();
        org.junit.Assert.assertNotNull(rArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(sArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(rArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(sArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(rArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(sArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(rArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(sArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        examples.R r2 = new examples.R((java.lang.Integer) (-6), "");
        examples.R r5 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray6 = new examples.R[] { r5 };
        java.util.ArrayList<examples.R> rList7 = new java.util.ArrayList<examples.R>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList7, rArray6);
        examples.S s11 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean13 = s11.equals((java.lang.Object) (-8));
        examples.S s16 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray17 = new examples.S[] { s11, s16 };
        java.util.ArrayList<examples.S> sList18 = new java.util.ArrayList<examples.S>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList18, sArray17);
        examples.ListComp02 listComp02_20 = new examples.ListComp02(rList7, sList18);
        examples.R r23 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_20.insert_r(r23);
        boolean boolean25 = r2.equals((java.lang.Object) listComp02_20);
        java.lang.String str26 = r2.getB();
        java.lang.Class<?> wildcardClass27 = r2.getClass();
        org.junit.Assert.assertNotNull(rArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(sArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray21 = new examples.R[] { r20 };
        java.util.ArrayList<examples.R> rList22 = new java.util.ArrayList<examples.R>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList22, rArray21);
        examples.S s26 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean28 = s26.equals((java.lang.Object) (-8));
        examples.S s31 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray32 = new examples.S[] { s26, s31 };
        java.util.ArrayList<examples.S> sList33 = new java.util.ArrayList<examples.S>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList33, sArray32);
        examples.ListComp02 listComp02_35 = new examples.ListComp02(rList22, sList33);
        examples.R r38 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray39 = new examples.R[] { r38 };
        java.util.ArrayList<examples.R> rList40 = new java.util.ArrayList<examples.R>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList40, rArray39);
        examples.S s44 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean46 = s44.equals((java.lang.Object) (-8));
        examples.S s49 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray50 = new examples.S[] { s44, s49 };
        java.util.ArrayList<examples.S> sList51 = new java.util.ArrayList<examples.S>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList51, sArray50);
        examples.ListComp02 listComp02_53 = new examples.ListComp02(rList40, sList51);
        examples.ListComp02 listComp02_54 = new examples.ListComp02(rList22, sList51);
        examples.R r57 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray58 = new examples.R[] { r57 };
        java.util.ArrayList<examples.R> rList59 = new java.util.ArrayList<examples.R>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList59, rArray58);
        examples.S s63 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean65 = s63.equals((java.lang.Object) (-8));
        examples.S s68 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray69 = new examples.S[] { s63, s68 };
        java.util.ArrayList<examples.S> sList70 = new java.util.ArrayList<examples.S>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList70, sArray69);
        examples.ListComp02 listComp02_72 = new examples.ListComp02(rList59, sList70);
        examples.ListComp02 listComp02_73 = new examples.ListComp02(rList22, sList70);
        examples.ListComp02 listComp02_74 = new examples.ListComp02(rList4, sList70);
        examples.R r77 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray78 = new examples.R[] { r77 };
        java.util.ArrayList<examples.R> rList79 = new java.util.ArrayList<examples.R>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList79, rArray78);
        examples.S s83 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean85 = s83.equals((java.lang.Object) (-8));
        examples.S s88 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray89 = new examples.S[] { s83, s88 };
        java.util.ArrayList<examples.S> sList90 = new java.util.ArrayList<examples.S>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList90, sArray89);
        examples.ListComp02 listComp02_92 = new examples.ListComp02(rList79, sList90);
        examples.ListComp02 listComp02_93 = new examples.ListComp02(rList4, sList90);
        listComp02_93.clear();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(rArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(sArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(rArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(sArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(rArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(sArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(rArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(sArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        examples.S s2 = new examples.S("", (java.lang.Integer) (-3));
        java.lang.String str3 = s2.getB();
        java.lang.String str4 = s2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        examples.S s2 = new examples.S("", (java.lang.Integer) (-10692));
        java.lang.String str3 = s2.getB();
        java.lang.Class<?> wildcardClass4 = s2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.util.ArrayList<examples.R> rList0 = null;
        examples.R r3 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray4 = new examples.R[] { r3 };
        java.util.ArrayList<examples.R> rList5 = new java.util.ArrayList<examples.R>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList5, rArray4);
        examples.R r9 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean11 = r9.equals((java.lang.Object) 6);
        examples.R r14 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r17 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean19 = r17.equals((java.lang.Object) 6);
        examples.R r22 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r25 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray26 = new examples.R[] { r25 };
        java.util.ArrayList<examples.R> rList27 = new java.util.ArrayList<examples.R>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList27, rArray26);
        examples.S s31 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean33 = s31.equals((java.lang.Object) (-8));
        examples.S s36 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray37 = new examples.S[] { s31, s36 };
        java.util.ArrayList<examples.S> sList38 = new java.util.ArrayList<examples.S>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList38, sArray37);
        examples.ListComp02 listComp02_40 = new examples.ListComp02(rList27, sList38);
        examples.R r43 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_40.insert_r(r43);
        java.lang.String str45 = r43.getB();
        examples.R r48 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean50 = r48.equals((java.lang.Object) 6);
        examples.R[] rArray51 = new examples.R[] { r9, r14, r17, r22, r43, r48 };
        java.util.ArrayList<examples.R> rList52 = new java.util.ArrayList<examples.R>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList52, rArray51);
        examples.R r56 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray57 = new examples.R[] { r56 };
        java.util.ArrayList<examples.R> rList58 = new java.util.ArrayList<examples.R>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList58, rArray57);
        examples.S s62 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean64 = s62.equals((java.lang.Object) (-8));
        examples.S s67 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray68 = new examples.S[] { s62, s67 };
        java.util.ArrayList<examples.S> sList69 = new java.util.ArrayList<examples.S>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList69, sArray68);
        examples.ListComp02 listComp02_71 = new examples.ListComp02(rList58, sList69);
        examples.ListComp02 listComp02_72 = new examples.ListComp02(rList52, sList69);
        examples.ListComp02 listComp02_73 = new examples.ListComp02(rList5, sList69);
        examples.ListComp02 listComp02_74 = new examples.ListComp02(rList0, sList69);
        listComp02_74.clear();
        java.lang.Class<?> wildcardClass76 = listComp02_74.getClass();
        org.junit.Assert.assertNotNull(rArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(rArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(sArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(rArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(rArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(sArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean4 = r2.equals((java.lang.Object) 6);
        java.lang.Object obj5 = null;
        boolean boolean6 = r2.equals(obj5);
        examples.R r9 = new examples.R((java.lang.Integer) 1, "hi!");
        java.lang.String str10 = r9.getB();
        boolean boolean11 = r2.equals((java.lang.Object) r9);
        java.lang.String str12 = r2.getB();
        examples.R r15 = new examples.R((java.lang.Integer) (-6), "");
        examples.R r18 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray19 = new examples.R[] { r18 };
        java.util.ArrayList<examples.R> rList20 = new java.util.ArrayList<examples.R>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList20, rArray19);
        examples.S s24 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean26 = s24.equals((java.lang.Object) (-8));
        examples.S s29 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray30 = new examples.S[] { s24, s29 };
        java.util.ArrayList<examples.S> sList31 = new java.util.ArrayList<examples.S>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList31, sArray30);
        examples.ListComp02 listComp02_33 = new examples.ListComp02(rList20, sList31);
        examples.S s36 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str37 = s36.getB();
        java.lang.String str38 = s36.getB();
        listComp02_33.insert_s(s36);
        boolean boolean40 = r15.equals((java.lang.Object) listComp02_33);
        boolean boolean41 = r2.equals((java.lang.Object) listComp02_33);
        listComp02_33.clear();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(rArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(sArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        examples.S s2 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str3 = s2.getB();
        boolean boolean5 = s2.equals((java.lang.Object) 10.0d);
        java.lang.String str6 = s2.getB();
        java.lang.String str7 = s2.getB();
        examples.R r10 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray11 = new examples.R[] { r10 };
        java.util.ArrayList<examples.R> rList12 = new java.util.ArrayList<examples.R>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList12, rArray11);
        examples.S s16 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean18 = s16.equals((java.lang.Object) (-8));
        examples.S s21 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray22 = new examples.S[] { s16, s21 };
        java.util.ArrayList<examples.S> sList23 = new java.util.ArrayList<examples.S>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList23, sArray22);
        examples.ListComp02 listComp02_25 = new examples.ListComp02(rList12, sList23);
        examples.R r28 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_25.insert_r(r28);
        examples.S s32 = new examples.S("hi!", (java.lang.Integer) (-3));
        java.lang.String str33 = s32.getB();
        listComp02_25.insert_s(s32);
        boolean boolean35 = s2.equals((java.lang.Object) s32);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(rArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(sArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        examples.S s2 = new examples.S("", (java.lang.Integer) (-12));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        examples.R r2 = new examples.R((java.lang.Integer) (-12), "");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) (-9900));
        java.lang.String str3 = s2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        examples.R r2 = new examples.R((java.lang.Integer) 6, "hi!");
        java.lang.String str3 = r2.getB();
        java.lang.String str4 = r2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray21 = new examples.R[] { r20 };
        java.util.ArrayList<examples.R> rList22 = new java.util.ArrayList<examples.R>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList22, rArray21);
        examples.S s26 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean28 = s26.equals((java.lang.Object) (-8));
        examples.S s31 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray32 = new examples.S[] { s26, s31 };
        java.util.ArrayList<examples.S> sList33 = new java.util.ArrayList<examples.S>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList33, sArray32);
        examples.ListComp02 listComp02_35 = new examples.ListComp02(rList22, sList33);
        examples.ListComp02 listComp02_36 = new examples.ListComp02(rList4, sList33);
        java.util.ArrayList<examples.S> sList37 = null;
        examples.ListComp02 listComp02_38 = new examples.ListComp02(rList4, sList37);
        examples.R r41 = new examples.R((java.lang.Integer) 1, "");
        examples.R r44 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray45 = new examples.R[] { r44 };
        java.util.ArrayList<examples.R> rList46 = new java.util.ArrayList<examples.R>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList46, rArray45);
        examples.S s50 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean52 = s50.equals((java.lang.Object) (-8));
        examples.S s55 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray56 = new examples.S[] { s50, s55 };
        java.util.ArrayList<examples.S> sList57 = new java.util.ArrayList<examples.S>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList57, sArray56);
        examples.ListComp02 listComp02_59 = new examples.ListComp02(rList46, sList57);
        examples.R r62 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray63 = new examples.R[] { r62 };
        java.util.ArrayList<examples.R> rList64 = new java.util.ArrayList<examples.R>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList64, rArray63);
        examples.S s68 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean70 = s68.equals((java.lang.Object) (-8));
        examples.S s73 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray74 = new examples.S[] { s68, s73 };
        java.util.ArrayList<examples.S> sList75 = new java.util.ArrayList<examples.S>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList75, sArray74);
        examples.ListComp02 listComp02_77 = new examples.ListComp02(rList64, sList75);
        examples.ListComp02 listComp02_78 = new examples.ListComp02(rList46, sList75);
        boolean boolean79 = r41.equals((java.lang.Object) sList75);
        examples.ListComp02 listComp02_80 = new examples.ListComp02(rList4, sList75);
        examples.R r83 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray84 = new examples.R[] { r83 };
        java.util.ArrayList<examples.R> rList85 = new java.util.ArrayList<examples.R>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList85, rArray84);
        examples.S s89 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean91 = s89.equals((java.lang.Object) (-8));
        examples.S s94 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray95 = new examples.S[] { s89, s94 };
        java.util.ArrayList<examples.S> sList96 = new java.util.ArrayList<examples.S>();
        boolean boolean97 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList96, sArray95);
        examples.ListComp02 listComp02_98 = new examples.ListComp02(rList85, sList96);
        examples.ListComp02 listComp02_99 = new examples.ListComp02(rList4, sList96);
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(rArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(sArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(rArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(sArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(rArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(sArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(rArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(sArray95);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean22 = r20.equals((java.lang.Object) 6);
        examples.R r25 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r28 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean30 = r28.equals((java.lang.Object) 6);
        examples.R r33 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r36 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray37 = new examples.R[] { r36 };
        java.util.ArrayList<examples.R> rList38 = new java.util.ArrayList<examples.R>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList38, rArray37);
        examples.S s42 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean44 = s42.equals((java.lang.Object) (-8));
        examples.S s47 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray48 = new examples.S[] { s42, s47 };
        java.util.ArrayList<examples.S> sList49 = new java.util.ArrayList<examples.S>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList49, sArray48);
        examples.ListComp02 listComp02_51 = new examples.ListComp02(rList38, sList49);
        examples.R r54 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_51.insert_r(r54);
        java.lang.String str56 = r54.getB();
        examples.R r59 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean61 = r59.equals((java.lang.Object) 6);
        examples.R[] rArray62 = new examples.R[] { r20, r25, r28, r33, r54, r59 };
        java.util.ArrayList<examples.R> rList63 = new java.util.ArrayList<examples.R>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList63, rArray62);
        examples.R r67 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray68 = new examples.R[] { r67 };
        java.util.ArrayList<examples.R> rList69 = new java.util.ArrayList<examples.R>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList69, rArray68);
        examples.S s73 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean75 = s73.equals((java.lang.Object) (-8));
        examples.S s78 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray79 = new examples.S[] { s73, s78 };
        java.util.ArrayList<examples.S> sList80 = new java.util.ArrayList<examples.S>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList80, sArray79);
        examples.ListComp02 listComp02_82 = new examples.ListComp02(rList69, sList80);
        examples.ListComp02 listComp02_83 = new examples.ListComp02(rList63, sList80);
        examples.ListComp02 listComp02_84 = new examples.ListComp02(rList4, sList80);
        examples.R r87 = new examples.R((java.lang.Integer) (-10), "");
        listComp02_84.insert_r(r87);
        examples.R r91 = new examples.R((java.lang.Integer) 100, "hi!");
        listComp02_84.insert_r(r91);
        listComp02_84.clear();
        examples.R r96 = new examples.R((java.lang.Integer) 1, "");
        listComp02_84.insert_r(r96);
        java.lang.String str98 = r96.getB();
        java.lang.String str99 = r96.getB();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(rArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(sArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(rArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(rArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(sArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "" + "'", str98, "");
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "" + "'", str99, "");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) 7);
        examples.R r5 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray6 = new examples.R[] { r5 };
        java.util.ArrayList<examples.R> rList7 = new java.util.ArrayList<examples.R>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList7, rArray6);
        examples.S s11 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean13 = s11.equals((java.lang.Object) (-8));
        examples.S s16 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray17 = new examples.S[] { s11, s16 };
        java.util.ArrayList<examples.S> sList18 = new java.util.ArrayList<examples.S>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList18, sArray17);
        examples.ListComp02 listComp02_20 = new examples.ListComp02(rList7, sList18);
        examples.S s23 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str24 = s23.getB();
        java.lang.String str25 = s23.getB();
        listComp02_20.insert_s(s23);
        examples.R r29 = new examples.R((java.lang.Integer) (-2), "");
        listComp02_20.insert_r(r29);
        boolean boolean31 = s2.equals((java.lang.Object) listComp02_20);
        examples.S s34 = new examples.S("hi!", (java.lang.Integer) 2);
        java.lang.String str35 = s34.getB();
        boolean boolean36 = s2.equals((java.lang.Object) s34);
        examples.S s39 = new examples.S("hi!", (java.lang.Integer) 7);
        boolean boolean41 = s39.equals((java.lang.Object) ' ');
        java.lang.String str42 = s39.getB();
        java.lang.String str43 = s39.getB();
        java.lang.String str44 = s39.getB();
        java.lang.Class<?> wildcardClass45 = s39.getClass();
        boolean boolean46 = s34.equals((java.lang.Object) wildcardClass45);
        org.junit.Assert.assertNotNull(rArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(sArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        java.lang.Object obj3 = null;
        boolean boolean4 = r2.equals(obj3);
        examples.R r7 = new examples.R((java.lang.Integer) 100, "hi!");
        java.lang.String str8 = r7.getB();
        boolean boolean9 = r2.equals((java.lang.Object) r7);
        examples.R r12 = new examples.R((java.lang.Integer) (-6), "");
        examples.R r15 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray16 = new examples.R[] { r15 };
        java.util.ArrayList<examples.R> rList17 = new java.util.ArrayList<examples.R>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList17, rArray16);
        examples.S s21 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean23 = s21.equals((java.lang.Object) (-8));
        examples.S s26 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray27 = new examples.S[] { s21, s26 };
        java.util.ArrayList<examples.S> sList28 = new java.util.ArrayList<examples.S>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList28, sArray27);
        examples.ListComp02 listComp02_30 = new examples.ListComp02(rList17, sList28);
        examples.R r33 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_30.insert_r(r33);
        boolean boolean35 = r12.equals((java.lang.Object) listComp02_30);
        examples.S s38 = new examples.S("", (java.lang.Integer) 9);
        listComp02_30.insert_s(s38);
        listComp02_30.clear();
        java.lang.Class<?> wildcardClass41 = listComp02_30.getClass();
        boolean boolean42 = r2.equals((java.lang.Object) listComp02_30);
        java.lang.String str43 = r2.getB();
        java.lang.String str44 = r2.getB();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(rArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(sArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) 1);
        examples.R r5 = new examples.R((java.lang.Integer) 0, "");
        boolean boolean6 = s2.equals((java.lang.Object) 0);
        java.lang.String str7 = s2.getB();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        examples.S s2 = new examples.S("", (java.lang.Integer) (-6));
        java.lang.String str3 = s2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean4 = r2.equals((java.lang.Object) 6);
        examples.R r7 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r10 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean12 = r10.equals((java.lang.Object) 6);
        examples.R r15 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r18 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray19 = new examples.R[] { r18 };
        java.util.ArrayList<examples.R> rList20 = new java.util.ArrayList<examples.R>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList20, rArray19);
        examples.S s24 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean26 = s24.equals((java.lang.Object) (-8));
        examples.S s29 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray30 = new examples.S[] { s24, s29 };
        java.util.ArrayList<examples.S> sList31 = new java.util.ArrayList<examples.S>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList31, sArray30);
        examples.ListComp02 listComp02_33 = new examples.ListComp02(rList20, sList31);
        examples.R r36 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_33.insert_r(r36);
        java.lang.String str38 = r36.getB();
        examples.R r41 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean43 = r41.equals((java.lang.Object) 6);
        examples.R[] rArray44 = new examples.R[] { r2, r7, r10, r15, r36, r41 };
        java.util.ArrayList<examples.R> rList45 = new java.util.ArrayList<examples.R>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList45, rArray44);
        examples.R r49 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray50 = new examples.R[] { r49 };
        java.util.ArrayList<examples.R> rList51 = new java.util.ArrayList<examples.R>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList51, rArray50);
        examples.S s55 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean57 = s55.equals((java.lang.Object) (-8));
        examples.S s60 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray61 = new examples.S[] { s55, s60 };
        java.util.ArrayList<examples.S> sList62 = new java.util.ArrayList<examples.S>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList62, sArray61);
        examples.ListComp02 listComp02_64 = new examples.ListComp02(rList51, sList62);
        examples.ListComp02 listComp02_65 = new examples.ListComp02(rList45, sList62);
        examples.R r68 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray69 = new examples.R[] { r68 };
        java.util.ArrayList<examples.R> rList70 = new java.util.ArrayList<examples.R>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList70, rArray69);
        examples.S s74 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean76 = s74.equals((java.lang.Object) (-8));
        examples.S s79 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray80 = new examples.S[] { s74, s79 };
        java.util.ArrayList<examples.S> sList81 = new java.util.ArrayList<examples.S>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList81, sArray80);
        examples.ListComp02 listComp02_83 = new examples.ListComp02(rList70, sList81);
        examples.ListComp02 listComp02_84 = new examples.ListComp02(rList45, sList81);
        listComp02_84.clear();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(rArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(sArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(rArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(rArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(sArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(rArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(sArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        listComp02_17.clear();
        examples.S s21 = new examples.S("hi!", (java.lang.Integer) (-2));
        listComp02_17.insert_s(s21);
        examples.R r25 = new examples.R((java.lang.Integer) (-8), "");
        listComp02_17.insert_r(r25);
        listComp02_17.clear();
        java.lang.Class<?> wildcardClass28 = listComp02_17.getClass();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        examples.S s2 = new examples.S("", (java.lang.Integer) 600);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        examples.S s2 = new examples.S("", (java.lang.Integer) (-3));
        examples.R r5 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean7 = r5.equals((java.lang.Object) 6);
        examples.R r10 = new examples.R((java.lang.Integer) (-6), "");
        examples.R r13 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray14 = new examples.R[] { r13 };
        java.util.ArrayList<examples.R> rList15 = new java.util.ArrayList<examples.R>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList15, rArray14);
        examples.S s19 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean21 = s19.equals((java.lang.Object) (-8));
        examples.S s24 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray25 = new examples.S[] { s19, s24 };
        java.util.ArrayList<examples.S> sList26 = new java.util.ArrayList<examples.S>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList26, sArray25);
        examples.ListComp02 listComp02_28 = new examples.ListComp02(rList15, sList26);
        examples.R r31 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_28.insert_r(r31);
        boolean boolean33 = r10.equals((java.lang.Object) listComp02_28);
        boolean boolean34 = r5.equals((java.lang.Object) r10);
        boolean boolean35 = s2.equals((java.lang.Object) r5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(rArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(sArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean4 = r2.equals((java.lang.Object) 6);
        examples.R r7 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r10 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean12 = r10.equals((java.lang.Object) 6);
        examples.R r15 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r18 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray19 = new examples.R[] { r18 };
        java.util.ArrayList<examples.R> rList20 = new java.util.ArrayList<examples.R>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList20, rArray19);
        examples.S s24 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean26 = s24.equals((java.lang.Object) (-8));
        examples.S s29 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray30 = new examples.S[] { s24, s29 };
        java.util.ArrayList<examples.S> sList31 = new java.util.ArrayList<examples.S>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList31, sArray30);
        examples.ListComp02 listComp02_33 = new examples.ListComp02(rList20, sList31);
        examples.R r36 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_33.insert_r(r36);
        java.lang.String str38 = r36.getB();
        examples.R r41 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean43 = r41.equals((java.lang.Object) 6);
        examples.R[] rArray44 = new examples.R[] { r2, r7, r10, r15, r36, r41 };
        java.util.ArrayList<examples.R> rList45 = new java.util.ArrayList<examples.R>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList45, rArray44);
        examples.R r49 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray50 = new examples.R[] { r49 };
        java.util.ArrayList<examples.R> rList51 = new java.util.ArrayList<examples.R>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList51, rArray50);
        examples.S s55 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean57 = s55.equals((java.lang.Object) (-8));
        examples.S s60 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray61 = new examples.S[] { s55, s60 };
        java.util.ArrayList<examples.S> sList62 = new java.util.ArrayList<examples.S>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList62, sArray61);
        examples.ListComp02 listComp02_64 = new examples.ListComp02(rList51, sList62);
        examples.ListComp02 listComp02_65 = new examples.ListComp02(rList45, sList62);
        examples.S s68 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str69 = s68.getB();
        boolean boolean71 = s68.equals((java.lang.Object) 10.0d);
        listComp02_65.insert_s(s68);
        java.lang.Class<?> wildcardClass73 = s68.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(rArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(sArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(rArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(rArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(sArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        java.lang.Object obj3 = null;
        boolean boolean4 = r2.equals(obj3);
        examples.R r7 = new examples.R((java.lang.Integer) 100, "hi!");
        java.lang.String str8 = r7.getB();
        boolean boolean9 = r2.equals((java.lang.Object) r7);
        examples.R r12 = new examples.R((java.lang.Integer) (-1), "hi!");
        java.lang.String str13 = r12.getB();
        boolean boolean14 = r7.equals((java.lang.Object) r12);
        java.lang.String str15 = r12.getB();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean4 = r2.equals((java.lang.Object) 6);
        java.lang.Object obj5 = null;
        boolean boolean6 = r2.equals(obj5);
        boolean boolean8 = r2.equals((java.lang.Object) 'a');
        java.lang.String str9 = r2.getB();
        examples.R r12 = new examples.R((java.lang.Integer) (-6), "");
        examples.R r15 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray16 = new examples.R[] { r15 };
        java.util.ArrayList<examples.R> rList17 = new java.util.ArrayList<examples.R>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList17, rArray16);
        examples.S s21 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean23 = s21.equals((java.lang.Object) (-8));
        examples.S s26 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray27 = new examples.S[] { s21, s26 };
        java.util.ArrayList<examples.S> sList28 = new java.util.ArrayList<examples.S>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList28, sArray27);
        examples.ListComp02 listComp02_30 = new examples.ListComp02(rList17, sList28);
        examples.R r33 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_30.insert_r(r33);
        boolean boolean35 = r12.equals((java.lang.Object) listComp02_30);
        examples.S s38 = new examples.S("", (java.lang.Integer) 9);
        listComp02_30.insert_s(s38);
        boolean boolean40 = r2.equals((java.lang.Object) listComp02_30);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(rArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(sArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.R r8 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean10 = r8.equals((java.lang.Object) 6);
        examples.R r13 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r16 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean18 = r16.equals((java.lang.Object) 6);
        examples.R r21 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r24 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray25 = new examples.R[] { r24 };
        java.util.ArrayList<examples.R> rList26 = new java.util.ArrayList<examples.R>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList26, rArray25);
        examples.S s30 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean32 = s30.equals((java.lang.Object) (-8));
        examples.S s35 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray36 = new examples.S[] { s30, s35 };
        java.util.ArrayList<examples.S> sList37 = new java.util.ArrayList<examples.S>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList37, sArray36);
        examples.ListComp02 listComp02_39 = new examples.ListComp02(rList26, sList37);
        examples.R r42 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_39.insert_r(r42);
        java.lang.String str44 = r42.getB();
        examples.R r47 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean49 = r47.equals((java.lang.Object) 6);
        examples.R[] rArray50 = new examples.R[] { r8, r13, r16, r21, r42, r47 };
        java.util.ArrayList<examples.R> rList51 = new java.util.ArrayList<examples.R>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList51, rArray50);
        examples.R r55 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray56 = new examples.R[] { r55 };
        java.util.ArrayList<examples.R> rList57 = new java.util.ArrayList<examples.R>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList57, rArray56);
        examples.S s61 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean63 = s61.equals((java.lang.Object) (-8));
        examples.S s66 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray67 = new examples.S[] { s61, s66 };
        java.util.ArrayList<examples.S> sList68 = new java.util.ArrayList<examples.S>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList68, sArray67);
        examples.ListComp02 listComp02_70 = new examples.ListComp02(rList57, sList68);
        examples.ListComp02 listComp02_71 = new examples.ListComp02(rList51, sList68);
        examples.ListComp02 listComp02_72 = new examples.ListComp02(rList4, sList68);
        listComp02_72.clear();
        listComp02_72.clear();
        examples.S s77 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean79 = s77.equals((java.lang.Object) (-8));
        java.lang.String str80 = s77.getB();
        listComp02_72.insert_s(s77);
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(sArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(rArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(rArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(sArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        examples.R r2 = new examples.R((java.lang.Integer) 600, "");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        examples.S s2 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str3 = s2.getB();
        boolean boolean5 = s2.equals((java.lang.Object) 10.0d);
        boolean boolean7 = s2.equals((java.lang.Object) (-2.1d));
        java.lang.Class<?> wildcardClass8 = s2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        examples.R r2 = new examples.R((java.lang.Integer) 10692, "hi!");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        java.util.ArrayList<examples.R> rList0 = null;
        examples.R r3 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray4 = new examples.R[] { r3 };
        java.util.ArrayList<examples.R> rList5 = new java.util.ArrayList<examples.R>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList5, rArray4);
        examples.S s9 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean11 = s9.equals((java.lang.Object) (-8));
        examples.S s14 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray15 = new examples.S[] { s9, s14 };
        java.util.ArrayList<examples.S> sList16 = new java.util.ArrayList<examples.S>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList16, sArray15);
        examples.ListComp02 listComp02_18 = new examples.ListComp02(rList5, sList16);
        examples.R r21 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray22 = new examples.R[] { r21 };
        java.util.ArrayList<examples.R> rList23 = new java.util.ArrayList<examples.R>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList23, rArray22);
        examples.S s27 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean29 = s27.equals((java.lang.Object) (-8));
        examples.S s32 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray33 = new examples.S[] { s27, s32 };
        java.util.ArrayList<examples.S> sList34 = new java.util.ArrayList<examples.S>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList34, sArray33);
        examples.ListComp02 listComp02_36 = new examples.ListComp02(rList23, sList34);
        examples.ListComp02 listComp02_37 = new examples.ListComp02(rList5, sList34);
        examples.ListComp02 listComp02_38 = new examples.ListComp02(rList0, sList34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int39 = listComp02_38.q();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(sArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(rArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(sArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        examples.R r2 = new examples.R((java.lang.Integer) 7, "");
        java.lang.String str3 = r2.getB();
        examples.S s6 = new examples.S("hi!", (java.lang.Integer) 7);
        examples.S s9 = new examples.S("", (java.lang.Integer) (-2));
        boolean boolean10 = s6.equals((java.lang.Object) s9);
        boolean boolean11 = r2.equals((java.lang.Object) s6);
        java.lang.String str12 = r2.getB();
        java.lang.Class<?> wildcardClass13 = r2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean22 = r20.equals((java.lang.Object) 6);
        examples.R r25 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r28 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean30 = r28.equals((java.lang.Object) 6);
        examples.R r33 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r36 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray37 = new examples.R[] { r36 };
        java.util.ArrayList<examples.R> rList38 = new java.util.ArrayList<examples.R>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList38, rArray37);
        examples.S s42 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean44 = s42.equals((java.lang.Object) (-8));
        examples.S s47 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray48 = new examples.S[] { s42, s47 };
        java.util.ArrayList<examples.S> sList49 = new java.util.ArrayList<examples.S>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList49, sArray48);
        examples.ListComp02 listComp02_51 = new examples.ListComp02(rList38, sList49);
        examples.R r54 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_51.insert_r(r54);
        java.lang.String str56 = r54.getB();
        examples.R r59 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean61 = r59.equals((java.lang.Object) 6);
        examples.R[] rArray62 = new examples.R[] { r20, r25, r28, r33, r54, r59 };
        java.util.ArrayList<examples.R> rList63 = new java.util.ArrayList<examples.R>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList63, rArray62);
        examples.R r67 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray68 = new examples.R[] { r67 };
        java.util.ArrayList<examples.R> rList69 = new java.util.ArrayList<examples.R>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList69, rArray68);
        examples.S s73 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean75 = s73.equals((java.lang.Object) (-8));
        examples.S s78 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray79 = new examples.S[] { s73, s78 };
        java.util.ArrayList<examples.S> sList80 = new java.util.ArrayList<examples.S>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList80, sArray79);
        examples.ListComp02 listComp02_82 = new examples.ListComp02(rList69, sList80);
        examples.ListComp02 listComp02_83 = new examples.ListComp02(rList63, sList80);
        examples.ListComp02 listComp02_84 = new examples.ListComp02(rList4, sList80);
        java.util.ArrayList<examples.S> sList85 = null;
        examples.ListComp02 listComp02_86 = new examples.ListComp02(rList4, sList85);
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(rArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(sArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(rArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(rArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(sArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_17.insert_r(r20);
        listComp02_17.clear();
        listComp02_17.clear();
        examples.S s26 = new examples.S("", (java.lang.Integer) 0);
        listComp02_17.insert_s(s26);
        listComp02_17.clear();
        java.lang.Class<?> wildcardClass29 = listComp02_17.getClass();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        examples.R r2 = new examples.R((java.lang.Integer) (-12), "hi!");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.R r8 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean10 = r8.equals((java.lang.Object) 6);
        examples.R r13 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r16 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean18 = r16.equals((java.lang.Object) 6);
        examples.R r21 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r24 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray25 = new examples.R[] { r24 };
        java.util.ArrayList<examples.R> rList26 = new java.util.ArrayList<examples.R>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList26, rArray25);
        examples.S s30 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean32 = s30.equals((java.lang.Object) (-8));
        examples.S s35 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray36 = new examples.S[] { s30, s35 };
        java.util.ArrayList<examples.S> sList37 = new java.util.ArrayList<examples.S>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList37, sArray36);
        examples.ListComp02 listComp02_39 = new examples.ListComp02(rList26, sList37);
        examples.R r42 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_39.insert_r(r42);
        java.lang.String str44 = r42.getB();
        examples.R r47 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean49 = r47.equals((java.lang.Object) 6);
        examples.R[] rArray50 = new examples.R[] { r8, r13, r16, r21, r42, r47 };
        java.util.ArrayList<examples.R> rList51 = new java.util.ArrayList<examples.R>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList51, rArray50);
        examples.R r55 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray56 = new examples.R[] { r55 };
        java.util.ArrayList<examples.R> rList57 = new java.util.ArrayList<examples.R>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList57, rArray56);
        examples.S s61 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean63 = s61.equals((java.lang.Object) (-8));
        examples.S s66 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray67 = new examples.S[] { s61, s66 };
        java.util.ArrayList<examples.S> sList68 = new java.util.ArrayList<examples.S>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList68, sArray67);
        examples.ListComp02 listComp02_70 = new examples.ListComp02(rList57, sList68);
        examples.ListComp02 listComp02_71 = new examples.ListComp02(rList51, sList68);
        examples.ListComp02 listComp02_72 = new examples.ListComp02(rList4, sList68);
        listComp02_72.clear();
        examples.R r76 = new examples.R((java.lang.Integer) 10685, "");
        java.lang.String str77 = r76.getB();
        java.lang.String str78 = r76.getB();
        listComp02_72.insert_r(r76);
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(sArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(rArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(rArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(sArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) 7);
        examples.S s5 = new examples.S("", (java.lang.Integer) (-2));
        boolean boolean6 = s2.equals((java.lang.Object) s5);
        java.lang.String str7 = s2.getB();
        java.lang.String str8 = s2.getB();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_17.insert_r(r20);
        java.lang.String str22 = r20.getB();
        examples.R r25 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean27 = r25.equals((java.lang.Object) 6);
        boolean boolean28 = r20.equals((java.lang.Object) 6);
        java.lang.String str29 = r20.getB();
        java.lang.Class<?> wildcardClass30 = r20.getClass();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray21 = new examples.R[] { r20 };
        java.util.ArrayList<examples.R> rList22 = new java.util.ArrayList<examples.R>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList22, rArray21);
        examples.S s26 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean28 = s26.equals((java.lang.Object) (-8));
        examples.S s31 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray32 = new examples.S[] { s26, s31 };
        java.util.ArrayList<examples.S> sList33 = new java.util.ArrayList<examples.S>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList33, sArray32);
        examples.ListComp02 listComp02_35 = new examples.ListComp02(rList22, sList33);
        examples.R r38 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray39 = new examples.R[] { r38 };
        java.util.ArrayList<examples.R> rList40 = new java.util.ArrayList<examples.R>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList40, rArray39);
        examples.S s44 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean46 = s44.equals((java.lang.Object) (-8));
        examples.S s49 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray50 = new examples.S[] { s44, s49 };
        java.util.ArrayList<examples.S> sList51 = new java.util.ArrayList<examples.S>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList51, sArray50);
        examples.ListComp02 listComp02_53 = new examples.ListComp02(rList40, sList51);
        examples.ListComp02 listComp02_54 = new examples.ListComp02(rList22, sList51);
        java.util.ArrayList<examples.S> sList55 = null;
        examples.ListComp02 listComp02_56 = new examples.ListComp02(rList22, sList55);
        examples.R r59 = new examples.R((java.lang.Integer) 1, "");
        examples.R r62 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray63 = new examples.R[] { r62 };
        java.util.ArrayList<examples.R> rList64 = new java.util.ArrayList<examples.R>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList64, rArray63);
        examples.S s68 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean70 = s68.equals((java.lang.Object) (-8));
        examples.S s73 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray74 = new examples.S[] { s68, s73 };
        java.util.ArrayList<examples.S> sList75 = new java.util.ArrayList<examples.S>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList75, sArray74);
        examples.ListComp02 listComp02_77 = new examples.ListComp02(rList64, sList75);
        examples.R r80 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray81 = new examples.R[] { r80 };
        java.util.ArrayList<examples.R> rList82 = new java.util.ArrayList<examples.R>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList82, rArray81);
        examples.S s86 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean88 = s86.equals((java.lang.Object) (-8));
        examples.S s91 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray92 = new examples.S[] { s86, s91 };
        java.util.ArrayList<examples.S> sList93 = new java.util.ArrayList<examples.S>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList93, sArray92);
        examples.ListComp02 listComp02_95 = new examples.ListComp02(rList82, sList93);
        examples.ListComp02 listComp02_96 = new examples.ListComp02(rList64, sList93);
        boolean boolean97 = r59.equals((java.lang.Object) sList93);
        examples.ListComp02 listComp02_98 = new examples.ListComp02(rList22, sList93);
        examples.ListComp02 listComp02_99 = new examples.ListComp02(rList4, sList93);
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(rArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(sArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(rArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(sArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(rArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(sArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(rArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(sArray92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean22 = r20.equals((java.lang.Object) 6);
        examples.R r25 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r28 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean30 = r28.equals((java.lang.Object) 6);
        examples.R r33 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r36 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray37 = new examples.R[] { r36 };
        java.util.ArrayList<examples.R> rList38 = new java.util.ArrayList<examples.R>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList38, rArray37);
        examples.S s42 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean44 = s42.equals((java.lang.Object) (-8));
        examples.S s47 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray48 = new examples.S[] { s42, s47 };
        java.util.ArrayList<examples.S> sList49 = new java.util.ArrayList<examples.S>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList49, sArray48);
        examples.ListComp02 listComp02_51 = new examples.ListComp02(rList38, sList49);
        examples.R r54 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_51.insert_r(r54);
        java.lang.String str56 = r54.getB();
        examples.R r59 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean61 = r59.equals((java.lang.Object) 6);
        examples.R[] rArray62 = new examples.R[] { r20, r25, r28, r33, r54, r59 };
        java.util.ArrayList<examples.R> rList63 = new java.util.ArrayList<examples.R>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList63, rArray62);
        examples.R r67 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray68 = new examples.R[] { r67 };
        java.util.ArrayList<examples.R> rList69 = new java.util.ArrayList<examples.R>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList69, rArray68);
        examples.S s73 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean75 = s73.equals((java.lang.Object) (-8));
        examples.S s78 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray79 = new examples.S[] { s73, s78 };
        java.util.ArrayList<examples.S> sList80 = new java.util.ArrayList<examples.S>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList80, sArray79);
        examples.ListComp02 listComp02_82 = new examples.ListComp02(rList69, sList80);
        examples.ListComp02 listComp02_83 = new examples.ListComp02(rList63, sList80);
        examples.ListComp02 listComp02_84 = new examples.ListComp02(rList4, sList80);
        examples.R r87 = new examples.R((java.lang.Integer) (-10), "");
        listComp02_84.insert_r(r87);
        examples.R r91 = new examples.R((java.lang.Integer) 100, "hi!");
        listComp02_84.insert_r(r91);
        listComp02_84.clear();
        java.lang.Class<?> wildcardClass94 = listComp02_84.getClass();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(rArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(sArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(rArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(rArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(sArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) 10);
        java.lang.String str3 = s2.getB();
        java.lang.String str4 = s2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        java.lang.Object obj3 = null;
        boolean boolean4 = r2.equals(obj3);
        examples.R r7 = new examples.R((java.lang.Integer) 100, "hi!");
        java.lang.String str8 = r7.getB();
        boolean boolean9 = r2.equals((java.lang.Object) r7);
        examples.S s12 = new examples.S("", (java.lang.Integer) 1);
        boolean boolean13 = r2.equals((java.lang.Object) s12);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) 100);
        examples.S s5 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean7 = s5.equals((java.lang.Object) (-8));
        java.lang.String str8 = s5.getB();
        boolean boolean9 = s2.equals((java.lang.Object) s5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        examples.R r2 = new examples.R((java.lang.Integer) 10692, "");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        examples.S s2 = new examples.S("", (java.lang.Integer) (-16));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        examples.R r2 = new examples.R((java.lang.Integer) (-2), "");
        java.lang.Class<?> wildcardClass3 = r2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        examples.S s2 = new examples.S("", (java.lang.Integer) 100);
        java.lang.String str3 = s2.getB();
        java.lang.String str4 = s2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.util.ArrayList<examples.R> rList0 = null;
        examples.R r3 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray4 = new examples.R[] { r3 };
        java.util.ArrayList<examples.R> rList5 = new java.util.ArrayList<examples.R>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList5, rArray4);
        examples.R r9 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean11 = r9.equals((java.lang.Object) 6);
        examples.R r14 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r17 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean19 = r17.equals((java.lang.Object) 6);
        examples.R r22 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r25 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray26 = new examples.R[] { r25 };
        java.util.ArrayList<examples.R> rList27 = new java.util.ArrayList<examples.R>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList27, rArray26);
        examples.S s31 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean33 = s31.equals((java.lang.Object) (-8));
        examples.S s36 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray37 = new examples.S[] { s31, s36 };
        java.util.ArrayList<examples.S> sList38 = new java.util.ArrayList<examples.S>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList38, sArray37);
        examples.ListComp02 listComp02_40 = new examples.ListComp02(rList27, sList38);
        examples.R r43 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_40.insert_r(r43);
        java.lang.String str45 = r43.getB();
        examples.R r48 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean50 = r48.equals((java.lang.Object) 6);
        examples.R[] rArray51 = new examples.R[] { r9, r14, r17, r22, r43, r48 };
        java.util.ArrayList<examples.R> rList52 = new java.util.ArrayList<examples.R>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList52, rArray51);
        examples.R r56 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray57 = new examples.R[] { r56 };
        java.util.ArrayList<examples.R> rList58 = new java.util.ArrayList<examples.R>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList58, rArray57);
        examples.S s62 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean64 = s62.equals((java.lang.Object) (-8));
        examples.S s67 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray68 = new examples.S[] { s62, s67 };
        java.util.ArrayList<examples.S> sList69 = new java.util.ArrayList<examples.S>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList69, sArray68);
        examples.ListComp02 listComp02_71 = new examples.ListComp02(rList58, sList69);
        examples.ListComp02 listComp02_72 = new examples.ListComp02(rList52, sList69);
        examples.ListComp02 listComp02_73 = new examples.ListComp02(rList5, sList69);
        examples.ListComp02 listComp02_74 = new examples.ListComp02(rList0, sList69);
        listComp02_74.clear();
        listComp02_74.clear();
        java.lang.Class<?> wildcardClass77 = listComp02_74.getClass();
        org.junit.Assert.assertNotNull(rArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(rArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(sArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(rArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(rArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(sArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean4 = r2.equals((java.lang.Object) 6);
        java.lang.Object obj5 = null;
        boolean boolean6 = r2.equals(obj5);
        examples.R r9 = new examples.R((java.lang.Integer) 1, "hi!");
        java.lang.String str10 = r9.getB();
        boolean boolean11 = r2.equals((java.lang.Object) r9);
        boolean boolean13 = r2.equals((java.lang.Object) (-8));
        examples.R r16 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray17 = new examples.R[] { r16 };
        java.util.ArrayList<examples.R> rList18 = new java.util.ArrayList<examples.R>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList18, rArray17);
        examples.S s22 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean24 = s22.equals((java.lang.Object) (-8));
        examples.S s27 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray28 = new examples.S[] { s22, s27 };
        java.util.ArrayList<examples.S> sList29 = new java.util.ArrayList<examples.S>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList29, sArray28);
        examples.ListComp02 listComp02_31 = new examples.ListComp02(rList18, sList29);
        examples.S s34 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str35 = s34.getB();
        java.lang.String str36 = s34.getB();
        listComp02_31.insert_s(s34);
        boolean boolean38 = r2.equals((java.lang.Object) listComp02_31);
        listComp02_31.clear();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(rArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(sArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        examples.R r2 = new examples.R((java.lang.Integer) (-3), "hi!");
        java.lang.String str3 = r2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        examples.S s2 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str3 = s2.getB();
        java.lang.Object obj4 = null;
        boolean boolean5 = s2.equals(obj4);
        java.lang.String str6 = s2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) 10);
        examples.R r5 = new examples.R((java.lang.Integer) (-9), "hi!");
        boolean boolean6 = s2.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        examples.R r2 = new examples.R((java.lang.Integer) (-9), "");
        java.lang.String str3 = r2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        examples.S s2 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str3 = s2.getB();
        java.lang.Object obj4 = null;
        boolean boolean5 = s2.equals(obj4);
        boolean boolean7 = s2.equals((java.lang.Object) (-4L));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean4 = r2.equals((java.lang.Object) 6);
        java.lang.Object obj5 = null;
        boolean boolean6 = r2.equals(obj5);
        examples.R r9 = new examples.R((java.lang.Integer) 1, "hi!");
        java.lang.String str10 = r9.getB();
        boolean boolean11 = r2.equals((java.lang.Object) r9);
        java.lang.String str12 = r2.getB();
        java.lang.String str13 = r2.getB();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_17.insert_r(r20);
        listComp02_17.clear();
        listComp02_17.clear();
        listComp02_17.clear();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        listComp02_17.clear();
        examples.S s21 = new examples.S("hi!", (java.lang.Integer) (-2));
        listComp02_17.insert_s(s21);
        examples.R r25 = new examples.R((java.lang.Integer) 8, "hi!");
        listComp02_17.insert_r(r25);
        listComp02_17.clear();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        java.lang.Object obj3 = null;
        boolean boolean4 = r2.equals(obj3);
        examples.R r7 = new examples.R((java.lang.Integer) 100, "hi!");
        java.lang.String str8 = r7.getB();
        boolean boolean9 = r2.equals((java.lang.Object) r7);
        java.lang.String str10 = r7.getB();
        examples.R r13 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray14 = new examples.R[] { r13 };
        java.util.ArrayList<examples.R> rList15 = new java.util.ArrayList<examples.R>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList15, rArray14);
        examples.S s19 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean21 = s19.equals((java.lang.Object) (-8));
        examples.S s24 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray25 = new examples.S[] { s19, s24 };
        java.util.ArrayList<examples.S> sList26 = new java.util.ArrayList<examples.S>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList26, sArray25);
        examples.ListComp02 listComp02_28 = new examples.ListComp02(rList15, sList26);
        examples.R r31 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray32 = new examples.R[] { r31 };
        java.util.ArrayList<examples.R> rList33 = new java.util.ArrayList<examples.R>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList33, rArray32);
        examples.S s37 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean39 = s37.equals((java.lang.Object) (-8));
        examples.S s42 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray43 = new examples.S[] { s37, s42 };
        java.util.ArrayList<examples.S> sList44 = new java.util.ArrayList<examples.S>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList44, sArray43);
        examples.ListComp02 listComp02_46 = new examples.ListComp02(rList33, sList44);
        examples.ListComp02 listComp02_47 = new examples.ListComp02(rList15, sList44);
        examples.R r50 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray51 = new examples.R[] { r50 };
        java.util.ArrayList<examples.R> rList52 = new java.util.ArrayList<examples.R>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList52, rArray51);
        examples.S s56 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean58 = s56.equals((java.lang.Object) (-8));
        examples.S s61 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray62 = new examples.S[] { s56, s61 };
        java.util.ArrayList<examples.S> sList63 = new java.util.ArrayList<examples.S>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList63, sArray62);
        examples.ListComp02 listComp02_65 = new examples.ListComp02(rList52, sList63);
        examples.ListComp02 listComp02_66 = new examples.ListComp02(rList15, sList63);
        examples.S s69 = new examples.S("", (java.lang.Integer) 0);
        listComp02_66.insert_s(s69);
        listComp02_66.clear();
        examples.S s74 = new examples.S("", (java.lang.Integer) (-3));
        examples.S s77 = new examples.S("hi!", (java.lang.Integer) (-8));
        boolean boolean79 = s77.equals((java.lang.Object) (-2));
        java.lang.String str80 = s77.getB();
        boolean boolean81 = s74.equals((java.lang.Object) str80);
        listComp02_66.insert_s(s74);
        boolean boolean84 = s74.equals((java.lang.Object) 6.9d);
        boolean boolean85 = r7.equals((java.lang.Object) boolean84);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(rArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(sArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(rArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(sArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(rArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(sArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray21 = new examples.R[] { r20 };
        java.util.ArrayList<examples.R> rList22 = new java.util.ArrayList<examples.R>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList22, rArray21);
        examples.S s26 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean28 = s26.equals((java.lang.Object) (-8));
        examples.S s31 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray32 = new examples.S[] { s26, s31 };
        java.util.ArrayList<examples.S> sList33 = new java.util.ArrayList<examples.S>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList33, sArray32);
        examples.ListComp02 listComp02_35 = new examples.ListComp02(rList22, sList33);
        examples.ListComp02 listComp02_36 = new examples.ListComp02(rList4, sList33);
        java.util.ArrayList<examples.S> sList37 = null;
        examples.ListComp02 listComp02_38 = new examples.ListComp02(rList4, sList37);
        java.util.ArrayList<examples.S> sList39 = null;
        examples.ListComp02 listComp02_40 = new examples.ListComp02(rList4, sList39);
        examples.R r43 = new examples.R((java.lang.Integer) 1, "");
        examples.R r46 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray47 = new examples.R[] { r46 };
        java.util.ArrayList<examples.R> rList48 = new java.util.ArrayList<examples.R>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList48, rArray47);
        examples.S s52 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean54 = s52.equals((java.lang.Object) (-8));
        examples.S s57 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray58 = new examples.S[] { s52, s57 };
        java.util.ArrayList<examples.S> sList59 = new java.util.ArrayList<examples.S>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList59, sArray58);
        examples.ListComp02 listComp02_61 = new examples.ListComp02(rList48, sList59);
        examples.R r64 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray65 = new examples.R[] { r64 };
        java.util.ArrayList<examples.R> rList66 = new java.util.ArrayList<examples.R>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList66, rArray65);
        examples.S s70 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean72 = s70.equals((java.lang.Object) (-8));
        examples.S s75 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray76 = new examples.S[] { s70, s75 };
        java.util.ArrayList<examples.S> sList77 = new java.util.ArrayList<examples.S>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList77, sArray76);
        examples.ListComp02 listComp02_79 = new examples.ListComp02(rList66, sList77);
        examples.ListComp02 listComp02_80 = new examples.ListComp02(rList48, sList77);
        boolean boolean81 = r43.equals((java.lang.Object) sList77);
        examples.ListComp02 listComp02_82 = new examples.ListComp02(rList4, sList77);
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(rArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(sArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(rArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(sArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(rArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(sArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray21 = new examples.R[] { r20 };
        java.util.ArrayList<examples.R> rList22 = new java.util.ArrayList<examples.R>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList22, rArray21);
        examples.S s26 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean28 = s26.equals((java.lang.Object) (-8));
        examples.S s31 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray32 = new examples.S[] { s26, s31 };
        java.util.ArrayList<examples.S> sList33 = new java.util.ArrayList<examples.S>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList33, sArray32);
        examples.ListComp02 listComp02_35 = new examples.ListComp02(rList22, sList33);
        examples.R r38 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray39 = new examples.R[] { r38 };
        java.util.ArrayList<examples.R> rList40 = new java.util.ArrayList<examples.R>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList40, rArray39);
        examples.S s44 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean46 = s44.equals((java.lang.Object) (-8));
        examples.S s49 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray50 = new examples.S[] { s44, s49 };
        java.util.ArrayList<examples.S> sList51 = new java.util.ArrayList<examples.S>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList51, sArray50);
        examples.ListComp02 listComp02_53 = new examples.ListComp02(rList40, sList51);
        examples.ListComp02 listComp02_54 = new examples.ListComp02(rList22, sList51);
        examples.R r57 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray58 = new examples.R[] { r57 };
        java.util.ArrayList<examples.R> rList59 = new java.util.ArrayList<examples.R>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList59, rArray58);
        examples.S s63 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean65 = s63.equals((java.lang.Object) (-8));
        examples.S s68 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray69 = new examples.S[] { s63, s68 };
        java.util.ArrayList<examples.S> sList70 = new java.util.ArrayList<examples.S>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList70, sArray69);
        examples.ListComp02 listComp02_72 = new examples.ListComp02(rList59, sList70);
        examples.ListComp02 listComp02_73 = new examples.ListComp02(rList22, sList70);
        examples.ListComp02 listComp02_74 = new examples.ListComp02(rList4, sList70);
        listComp02_74.clear();
        listComp02_74.clear();
        examples.S s79 = new examples.S("", (java.lang.Integer) 10);
        boolean boolean81 = s79.equals((java.lang.Object) 9.6d);
        listComp02_74.insert_s(s79);
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(rArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(sArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(rArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(sArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(rArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(sArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.R r8 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean10 = r8.equals((java.lang.Object) 6);
        examples.R r13 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r16 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean18 = r16.equals((java.lang.Object) 6);
        examples.R r21 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r24 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray25 = new examples.R[] { r24 };
        java.util.ArrayList<examples.R> rList26 = new java.util.ArrayList<examples.R>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList26, rArray25);
        examples.S s30 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean32 = s30.equals((java.lang.Object) (-8));
        examples.S s35 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray36 = new examples.S[] { s30, s35 };
        java.util.ArrayList<examples.S> sList37 = new java.util.ArrayList<examples.S>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList37, sArray36);
        examples.ListComp02 listComp02_39 = new examples.ListComp02(rList26, sList37);
        examples.R r42 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_39.insert_r(r42);
        java.lang.String str44 = r42.getB();
        examples.R r47 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean49 = r47.equals((java.lang.Object) 6);
        examples.R[] rArray50 = new examples.R[] { r8, r13, r16, r21, r42, r47 };
        java.util.ArrayList<examples.R> rList51 = new java.util.ArrayList<examples.R>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList51, rArray50);
        examples.R r55 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray56 = new examples.R[] { r55 };
        java.util.ArrayList<examples.R> rList57 = new java.util.ArrayList<examples.R>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList57, rArray56);
        examples.S s61 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean63 = s61.equals((java.lang.Object) (-8));
        examples.S s66 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray67 = new examples.S[] { s61, s66 };
        java.util.ArrayList<examples.S> sList68 = new java.util.ArrayList<examples.S>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList68, sArray67);
        examples.ListComp02 listComp02_70 = new examples.ListComp02(rList57, sList68);
        examples.ListComp02 listComp02_71 = new examples.ListComp02(rList51, sList68);
        examples.ListComp02 listComp02_72 = new examples.ListComp02(rList4, sList68);
        examples.S s75 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean77 = s75.equals((java.lang.Object) (-8));
        listComp02_72.insert_s(s75);
        examples.S s81 = new examples.S("hi!", (java.lang.Integer) (-10));
        listComp02_72.insert_s(s81);
        boolean boolean84 = s81.equals((java.lang.Object) (-6));
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(sArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(rArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(rArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(sArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        examples.R r2 = new examples.R((java.lang.Integer) 2, "hi!");
        examples.R r5 = new examples.R((java.lang.Integer) (-1), "hi!");
        java.lang.Object obj6 = null;
        boolean boolean7 = r5.equals(obj6);
        java.lang.Class<?> wildcardClass8 = r5.getClass();
        boolean boolean9 = r2.equals((java.lang.Object) r5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        java.util.ArrayList<examples.R> rList18 = null;
        examples.R r21 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray22 = new examples.R[] { r21 };
        java.util.ArrayList<examples.R> rList23 = new java.util.ArrayList<examples.R>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList23, rArray22);
        examples.R r27 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean29 = r27.equals((java.lang.Object) 6);
        examples.R r32 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r35 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean37 = r35.equals((java.lang.Object) 6);
        examples.R r40 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r43 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray44 = new examples.R[] { r43 };
        java.util.ArrayList<examples.R> rList45 = new java.util.ArrayList<examples.R>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList45, rArray44);
        examples.S s49 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean51 = s49.equals((java.lang.Object) (-8));
        examples.S s54 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray55 = new examples.S[] { s49, s54 };
        java.util.ArrayList<examples.S> sList56 = new java.util.ArrayList<examples.S>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList56, sArray55);
        examples.ListComp02 listComp02_58 = new examples.ListComp02(rList45, sList56);
        examples.R r61 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_58.insert_r(r61);
        java.lang.String str63 = r61.getB();
        examples.R r66 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean68 = r66.equals((java.lang.Object) 6);
        examples.R[] rArray69 = new examples.R[] { r27, r32, r35, r40, r61, r66 };
        java.util.ArrayList<examples.R> rList70 = new java.util.ArrayList<examples.R>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList70, rArray69);
        examples.R r74 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray75 = new examples.R[] { r74 };
        java.util.ArrayList<examples.R> rList76 = new java.util.ArrayList<examples.R>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList76, rArray75);
        examples.S s80 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean82 = s80.equals((java.lang.Object) (-8));
        examples.S s85 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray86 = new examples.S[] { s80, s85 };
        java.util.ArrayList<examples.S> sList87 = new java.util.ArrayList<examples.S>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList87, sArray86);
        examples.ListComp02 listComp02_89 = new examples.ListComp02(rList76, sList87);
        examples.ListComp02 listComp02_90 = new examples.ListComp02(rList70, sList87);
        examples.ListComp02 listComp02_91 = new examples.ListComp02(rList23, sList87);
        examples.ListComp02 listComp02_92 = new examples.ListComp02(rList18, sList87);
        examples.ListComp02 listComp02_93 = new examples.ListComp02(rList4, sList87);
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(rArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(rArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(sArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(rArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(rArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(sArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.R r8 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean10 = r8.equals((java.lang.Object) 6);
        examples.R r13 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r16 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean18 = r16.equals((java.lang.Object) 6);
        examples.R r21 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r24 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray25 = new examples.R[] { r24 };
        java.util.ArrayList<examples.R> rList26 = new java.util.ArrayList<examples.R>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList26, rArray25);
        examples.S s30 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean32 = s30.equals((java.lang.Object) (-8));
        examples.S s35 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray36 = new examples.S[] { s30, s35 };
        java.util.ArrayList<examples.S> sList37 = new java.util.ArrayList<examples.S>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList37, sArray36);
        examples.ListComp02 listComp02_39 = new examples.ListComp02(rList26, sList37);
        examples.R r42 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_39.insert_r(r42);
        java.lang.String str44 = r42.getB();
        examples.R r47 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean49 = r47.equals((java.lang.Object) 6);
        examples.R[] rArray50 = new examples.R[] { r8, r13, r16, r21, r42, r47 };
        java.util.ArrayList<examples.R> rList51 = new java.util.ArrayList<examples.R>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList51, rArray50);
        examples.R r55 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray56 = new examples.R[] { r55 };
        java.util.ArrayList<examples.R> rList57 = new java.util.ArrayList<examples.R>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList57, rArray56);
        examples.S s61 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean63 = s61.equals((java.lang.Object) (-8));
        examples.S s66 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray67 = new examples.S[] { s61, s66 };
        java.util.ArrayList<examples.S> sList68 = new java.util.ArrayList<examples.S>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList68, sArray67);
        examples.ListComp02 listComp02_70 = new examples.ListComp02(rList57, sList68);
        examples.ListComp02 listComp02_71 = new examples.ListComp02(rList51, sList68);
        examples.ListComp02 listComp02_72 = new examples.ListComp02(rList4, sList68);
        java.util.ArrayList<examples.S> sList73 = null;
        examples.ListComp02 listComp02_74 = new examples.ListComp02(rList4, sList73);
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(sArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(rArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(rArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(sArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.util.ArrayList<examples.R> rList0 = null;
        examples.R r3 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray4 = new examples.R[] { r3 };
        java.util.ArrayList<examples.R> rList5 = new java.util.ArrayList<examples.R>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList5, rArray4);
        examples.S s9 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean11 = s9.equals((java.lang.Object) (-8));
        examples.S s14 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray15 = new examples.S[] { s9, s14 };
        java.util.ArrayList<examples.S> sList16 = new java.util.ArrayList<examples.S>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList16, sArray15);
        examples.ListComp02 listComp02_18 = new examples.ListComp02(rList5, sList16);
        examples.R r21 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray22 = new examples.R[] { r21 };
        java.util.ArrayList<examples.R> rList23 = new java.util.ArrayList<examples.R>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList23, rArray22);
        examples.S s27 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean29 = s27.equals((java.lang.Object) (-8));
        examples.S s32 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray33 = new examples.S[] { s27, s32 };
        java.util.ArrayList<examples.S> sList34 = new java.util.ArrayList<examples.S>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList34, sArray33);
        examples.ListComp02 listComp02_36 = new examples.ListComp02(rList23, sList34);
        examples.ListComp02 listComp02_37 = new examples.ListComp02(rList5, sList34);
        java.util.ArrayList<examples.S> sList38 = null;
        examples.ListComp02 listComp02_39 = new examples.ListComp02(rList5, sList38);
        java.util.ArrayList<examples.R> rList40 = null;
        examples.R r43 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray44 = new examples.R[] { r43 };
        java.util.ArrayList<examples.R> rList45 = new java.util.ArrayList<examples.R>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList45, rArray44);
        examples.S s49 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean51 = s49.equals((java.lang.Object) (-8));
        examples.S s54 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray55 = new examples.S[] { s49, s54 };
        java.util.ArrayList<examples.S> sList56 = new java.util.ArrayList<examples.S>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList56, sArray55);
        examples.ListComp02 listComp02_58 = new examples.ListComp02(rList45, sList56);
        examples.R r61 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray62 = new examples.R[] { r61 };
        java.util.ArrayList<examples.R> rList63 = new java.util.ArrayList<examples.R>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList63, rArray62);
        examples.S s67 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean69 = s67.equals((java.lang.Object) (-8));
        examples.S s72 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray73 = new examples.S[] { s67, s72 };
        java.util.ArrayList<examples.S> sList74 = new java.util.ArrayList<examples.S>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList74, sArray73);
        examples.ListComp02 listComp02_76 = new examples.ListComp02(rList63, sList74);
        examples.ListComp02 listComp02_77 = new examples.ListComp02(rList45, sList74);
        examples.ListComp02 listComp02_78 = new examples.ListComp02(rList40, sList74);
        examples.ListComp02 listComp02_79 = new examples.ListComp02(rList5, sList74);
        examples.ListComp02 listComp02_80 = new examples.ListComp02(rList0, sList74);
        org.junit.Assert.assertNotNull(rArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(sArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(rArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(sArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(rArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(sArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(rArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(sArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_17.insert_r(r20);
        examples.S s24 = new examples.S("hi!", (java.lang.Integer) (-3));
        java.lang.String str25 = s24.getB();
        listComp02_17.insert_s(s24);
        listComp02_17.clear();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean4 = r2.equals((java.lang.Object) 6);
        examples.R r7 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r10 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean12 = r10.equals((java.lang.Object) 6);
        examples.R r15 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r18 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray19 = new examples.R[] { r18 };
        java.util.ArrayList<examples.R> rList20 = new java.util.ArrayList<examples.R>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList20, rArray19);
        examples.S s24 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean26 = s24.equals((java.lang.Object) (-8));
        examples.S s29 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray30 = new examples.S[] { s24, s29 };
        java.util.ArrayList<examples.S> sList31 = new java.util.ArrayList<examples.S>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList31, sArray30);
        examples.ListComp02 listComp02_33 = new examples.ListComp02(rList20, sList31);
        examples.R r36 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_33.insert_r(r36);
        java.lang.String str38 = r36.getB();
        examples.R r41 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean43 = r41.equals((java.lang.Object) 6);
        examples.R[] rArray44 = new examples.R[] { r2, r7, r10, r15, r36, r41 };
        java.util.ArrayList<examples.R> rList45 = new java.util.ArrayList<examples.R>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList45, rArray44);
        examples.R r49 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray50 = new examples.R[] { r49 };
        java.util.ArrayList<examples.R> rList51 = new java.util.ArrayList<examples.R>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList51, rArray50);
        examples.S s55 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean57 = s55.equals((java.lang.Object) (-8));
        examples.S s60 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray61 = new examples.S[] { s55, s60 };
        java.util.ArrayList<examples.S> sList62 = new java.util.ArrayList<examples.S>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList62, sArray61);
        examples.ListComp02 listComp02_64 = new examples.ListComp02(rList51, sList62);
        examples.ListComp02 listComp02_65 = new examples.ListComp02(rList45, sList62);
        java.lang.Class<?> wildcardClass66 = sList62.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(rArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(sArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(rArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(rArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(sArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        examples.S s2 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str3 = s2.getB();
        boolean boolean5 = s2.equals((java.lang.Object) 10.0d);
        boolean boolean7 = s2.equals((java.lang.Object) (-2.1d));
        java.lang.String str8 = s2.getB();
        java.lang.Class<?> wildcardClass9 = s2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.R r8 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean10 = r8.equals((java.lang.Object) 6);
        examples.R r13 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r16 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean18 = r16.equals((java.lang.Object) 6);
        examples.R r21 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r24 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray25 = new examples.R[] { r24 };
        java.util.ArrayList<examples.R> rList26 = new java.util.ArrayList<examples.R>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList26, rArray25);
        examples.S s30 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean32 = s30.equals((java.lang.Object) (-8));
        examples.S s35 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray36 = new examples.S[] { s30, s35 };
        java.util.ArrayList<examples.S> sList37 = new java.util.ArrayList<examples.S>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList37, sArray36);
        examples.ListComp02 listComp02_39 = new examples.ListComp02(rList26, sList37);
        examples.R r42 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_39.insert_r(r42);
        java.lang.String str44 = r42.getB();
        examples.R r47 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean49 = r47.equals((java.lang.Object) 6);
        examples.R[] rArray50 = new examples.R[] { r8, r13, r16, r21, r42, r47 };
        java.util.ArrayList<examples.R> rList51 = new java.util.ArrayList<examples.R>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList51, rArray50);
        examples.R r55 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray56 = new examples.R[] { r55 };
        java.util.ArrayList<examples.R> rList57 = new java.util.ArrayList<examples.R>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList57, rArray56);
        examples.S s61 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean63 = s61.equals((java.lang.Object) (-8));
        examples.S s66 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray67 = new examples.S[] { s61, s66 };
        java.util.ArrayList<examples.S> sList68 = new java.util.ArrayList<examples.S>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList68, sArray67);
        examples.ListComp02 listComp02_70 = new examples.ListComp02(rList57, sList68);
        examples.ListComp02 listComp02_71 = new examples.ListComp02(rList51, sList68);
        examples.ListComp02 listComp02_72 = new examples.ListComp02(rList4, sList68);
        examples.R r75 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray76 = new examples.R[] { r75 };
        java.util.ArrayList<examples.R> rList77 = new java.util.ArrayList<examples.R>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList77, rArray76);
        examples.S s81 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean83 = s81.equals((java.lang.Object) (-8));
        examples.S s86 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray87 = new examples.S[] { s81, s86 };
        java.util.ArrayList<examples.S> sList88 = new java.util.ArrayList<examples.S>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList88, sArray87);
        examples.ListComp02 listComp02_90 = new examples.ListComp02(rList77, sList88);
        examples.ListComp02 listComp02_91 = new examples.ListComp02(rList4, sList88);
        java.util.ArrayList<examples.S> sList92 = null;
        examples.ListComp02 listComp02_93 = new examples.ListComp02(rList4, sList92);
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(sArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(rArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(rArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(sArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(rArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(sArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_17.insert_r(r20);
        listComp02_17.clear();
        examples.S s25 = new examples.S("", (java.lang.Integer) (-8));
        listComp02_17.insert_s(s25);
        java.lang.Class<?> wildcardClass27 = s25.getClass();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) (-2));
        java.lang.Object obj3 = null;
        boolean boolean4 = s2.equals(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        examples.R r2 = new examples.R((java.lang.Integer) (-3), "");
        java.lang.String str3 = r2.getB();
        java.lang.String str4 = r2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray21 = new examples.R[] { r20 };
        java.util.ArrayList<examples.R> rList22 = new java.util.ArrayList<examples.R>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList22, rArray21);
        examples.S s26 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean28 = s26.equals((java.lang.Object) (-8));
        examples.S s31 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray32 = new examples.S[] { s26, s31 };
        java.util.ArrayList<examples.S> sList33 = new java.util.ArrayList<examples.S>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList33, sArray32);
        examples.ListComp02 listComp02_35 = new examples.ListComp02(rList22, sList33);
        examples.ListComp02 listComp02_36 = new examples.ListComp02(rList4, sList33);
        java.util.ArrayList<examples.S> sList37 = null;
        examples.ListComp02 listComp02_38 = new examples.ListComp02(rList4, sList37);
        java.util.ArrayList<examples.R> rList39 = null;
        examples.R r42 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray43 = new examples.R[] { r42 };
        java.util.ArrayList<examples.R> rList44 = new java.util.ArrayList<examples.R>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList44, rArray43);
        examples.S s48 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean50 = s48.equals((java.lang.Object) (-8));
        examples.S s53 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray54 = new examples.S[] { s48, s53 };
        java.util.ArrayList<examples.S> sList55 = new java.util.ArrayList<examples.S>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList55, sArray54);
        examples.ListComp02 listComp02_57 = new examples.ListComp02(rList44, sList55);
        examples.R r60 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray61 = new examples.R[] { r60 };
        java.util.ArrayList<examples.R> rList62 = new java.util.ArrayList<examples.R>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList62, rArray61);
        examples.S s66 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean68 = s66.equals((java.lang.Object) (-8));
        examples.S s71 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray72 = new examples.S[] { s66, s71 };
        java.util.ArrayList<examples.S> sList73 = new java.util.ArrayList<examples.S>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList73, sArray72);
        examples.ListComp02 listComp02_75 = new examples.ListComp02(rList62, sList73);
        examples.ListComp02 listComp02_76 = new examples.ListComp02(rList44, sList73);
        examples.ListComp02 listComp02_77 = new examples.ListComp02(rList39, sList73);
        examples.ListComp02 listComp02_78 = new examples.ListComp02(rList4, sList73);
        java.util.ArrayList<examples.R> rList79 = null;
        examples.R r82 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray83 = new examples.R[] { r82 };
        java.util.ArrayList<examples.R> rList84 = new java.util.ArrayList<examples.R>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList84, rArray83);
        examples.S s88 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean90 = s88.equals((java.lang.Object) (-8));
        examples.S s93 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray94 = new examples.S[] { s88, s93 };
        java.util.ArrayList<examples.S> sList95 = new java.util.ArrayList<examples.S>();
        boolean boolean96 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList95, sArray94);
        examples.ListComp02 listComp02_97 = new examples.ListComp02(rList84, sList95);
        examples.ListComp02 listComp02_98 = new examples.ListComp02(rList79, sList95);
        examples.ListComp02 listComp02_99 = new examples.ListComp02(rList4, sList95);
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(rArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(sArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(rArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(sArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(rArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(sArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(rArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(sArray94);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        examples.S s2 = new examples.S("", (java.lang.Integer) (-8));
        java.lang.String str3 = s2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        listComp02_17.clear();
        examples.S s21 = new examples.S("hi!", (java.lang.Integer) (-2));
        listComp02_17.insert_s(s21);
        examples.S s25 = new examples.S("hi!", (java.lang.Integer) 2);
        java.lang.String str26 = s25.getB();
        boolean boolean28 = s25.equals((java.lang.Object) (-7L));
        listComp02_17.insert_s(s25);
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        examples.R r2 = new examples.R((java.lang.Integer) (-4), "hi!");
        java.lang.Class<?> wildcardClass3 = r2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        examples.R r2 = new examples.R((java.lang.Integer) (-6), "");
        examples.R r5 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray6 = new examples.R[] { r5 };
        java.util.ArrayList<examples.R> rList7 = new java.util.ArrayList<examples.R>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList7, rArray6);
        examples.S s11 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean13 = s11.equals((java.lang.Object) (-8));
        examples.S s16 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray17 = new examples.S[] { s11, s16 };
        java.util.ArrayList<examples.S> sList18 = new java.util.ArrayList<examples.S>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList18, sArray17);
        examples.ListComp02 listComp02_20 = new examples.ListComp02(rList7, sList18);
        examples.S s23 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str24 = s23.getB();
        java.lang.String str25 = s23.getB();
        listComp02_20.insert_s(s23);
        boolean boolean27 = r2.equals((java.lang.Object) listComp02_20);
        listComp02_20.clear();
        examples.S s31 = new examples.S("hi!", (java.lang.Integer) 2);
        listComp02_20.insert_s(s31);
        examples.S s33 = null;
        listComp02_20.insert_s(s33);
        listComp02_20.clear();
        org.junit.Assert.assertNotNull(rArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(sArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray21 = new examples.R[] { r20 };
        java.util.ArrayList<examples.R> rList22 = new java.util.ArrayList<examples.R>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList22, rArray21);
        examples.S s26 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean28 = s26.equals((java.lang.Object) (-8));
        examples.S s31 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray32 = new examples.S[] { s26, s31 };
        java.util.ArrayList<examples.S> sList33 = new java.util.ArrayList<examples.S>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList33, sArray32);
        examples.ListComp02 listComp02_35 = new examples.ListComp02(rList22, sList33);
        examples.ListComp02 listComp02_36 = new examples.ListComp02(rList4, sList33);
        examples.R r39 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray40 = new examples.R[] { r39 };
        java.util.ArrayList<examples.R> rList41 = new java.util.ArrayList<examples.R>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList41, rArray40);
        examples.S s45 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean47 = s45.equals((java.lang.Object) (-8));
        examples.S s50 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray51 = new examples.S[] { s45, s50 };
        java.util.ArrayList<examples.S> sList52 = new java.util.ArrayList<examples.S>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList52, sArray51);
        examples.ListComp02 listComp02_54 = new examples.ListComp02(rList41, sList52);
        examples.ListComp02 listComp02_55 = new examples.ListComp02(rList4, sList52);
        java.util.ArrayList<examples.R> rList56 = null;
        java.util.ArrayList<examples.R> rList57 = null;
        examples.R r60 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray61 = new examples.R[] { r60 };
        java.util.ArrayList<examples.R> rList62 = new java.util.ArrayList<examples.R>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList62, rArray61);
        examples.S s66 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean68 = s66.equals((java.lang.Object) (-8));
        examples.S s71 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray72 = new examples.S[] { s66, s71 };
        java.util.ArrayList<examples.S> sList73 = new java.util.ArrayList<examples.S>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList73, sArray72);
        examples.ListComp02 listComp02_75 = new examples.ListComp02(rList62, sList73);
        examples.R r78 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray79 = new examples.R[] { r78 };
        java.util.ArrayList<examples.R> rList80 = new java.util.ArrayList<examples.R>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList80, rArray79);
        examples.S s84 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean86 = s84.equals((java.lang.Object) (-8));
        examples.S s89 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray90 = new examples.S[] { s84, s89 };
        java.util.ArrayList<examples.S> sList91 = new java.util.ArrayList<examples.S>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList91, sArray90);
        examples.ListComp02 listComp02_93 = new examples.ListComp02(rList80, sList91);
        examples.ListComp02 listComp02_94 = new examples.ListComp02(rList62, sList91);
        examples.ListComp02 listComp02_95 = new examples.ListComp02(rList57, sList91);
        examples.ListComp02 listComp02_96 = new examples.ListComp02(rList56, sList91);
        examples.ListComp02 listComp02_97 = new examples.ListComp02(rList4, sList91);
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(rArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(sArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(rArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(sArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(rArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(sArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(rArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(sArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        java.lang.String str3 = r2.getB();
        examples.S s6 = new examples.S("", (java.lang.Integer) 1);
        boolean boolean7 = r2.equals((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass8 = r2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        examples.R r2 = new examples.R((java.lang.Integer) (-9800), "");
        java.lang.Class<?> wildcardClass3 = r2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.util.ArrayList<examples.R> rList0 = null;
        java.util.ArrayList<examples.S> sList1 = null;
        examples.ListComp02 listComp02_2 = new examples.ListComp02(rList0, sList1);
        listComp02_2.clear();
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        examples.S s2 = new examples.S("", (java.lang.Integer) 200);
        java.lang.String str3 = s2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        examples.R r2 = new examples.R((java.lang.Integer) (-6), "");
        examples.R r5 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray6 = new examples.R[] { r5 };
        java.util.ArrayList<examples.R> rList7 = new java.util.ArrayList<examples.R>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList7, rArray6);
        examples.S s11 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean13 = s11.equals((java.lang.Object) (-8));
        examples.S s16 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray17 = new examples.S[] { s11, s16 };
        java.util.ArrayList<examples.S> sList18 = new java.util.ArrayList<examples.S>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList18, sArray17);
        examples.ListComp02 listComp02_20 = new examples.ListComp02(rList7, sList18);
        examples.S s23 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str24 = s23.getB();
        java.lang.String str25 = s23.getB();
        listComp02_20.insert_s(s23);
        boolean boolean27 = r2.equals((java.lang.Object) listComp02_20);
        listComp02_20.clear();
        examples.S s31 = new examples.S("hi!", (java.lang.Integer) 2);
        listComp02_20.insert_s(s31);
        listComp02_20.clear();
        examples.R r36 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray37 = new examples.R[] { r36 };
        java.util.ArrayList<examples.R> rList38 = new java.util.ArrayList<examples.R>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList38, rArray37);
        examples.S s42 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean44 = s42.equals((java.lang.Object) (-8));
        examples.S s47 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray48 = new examples.S[] { s42, s47 };
        java.util.ArrayList<examples.S> sList49 = new java.util.ArrayList<examples.S>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList49, sArray48);
        examples.ListComp02 listComp02_51 = new examples.ListComp02(rList38, sList49);
        listComp02_51.clear();
        examples.S s55 = new examples.S("hi!", (java.lang.Integer) (-2));
        listComp02_51.insert_s(s55);
        examples.R r59 = new examples.R((java.lang.Integer) 100, "hi!");
        boolean boolean60 = s55.equals((java.lang.Object) 100);
        listComp02_20.insert_s(s55);
        org.junit.Assert.assertNotNull(rArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(sArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(rArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(sArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        examples.R r2 = new examples.R((java.lang.Integer) 600, "hi!");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray21 = new examples.R[] { r20 };
        java.util.ArrayList<examples.R> rList22 = new java.util.ArrayList<examples.R>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList22, rArray21);
        examples.S s26 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean28 = s26.equals((java.lang.Object) (-8));
        examples.S s31 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray32 = new examples.S[] { s26, s31 };
        java.util.ArrayList<examples.S> sList33 = new java.util.ArrayList<examples.S>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList33, sArray32);
        examples.ListComp02 listComp02_35 = new examples.ListComp02(rList22, sList33);
        examples.ListComp02 listComp02_36 = new examples.ListComp02(rList4, sList33);
        java.util.ArrayList<examples.S> sList37 = null;
        examples.ListComp02 listComp02_38 = new examples.ListComp02(rList4, sList37);
        examples.R r41 = new examples.R((java.lang.Integer) (-9900), "");
        java.lang.String str42 = r41.getB();
        listComp02_38.insert_r(r41);
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(rArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(sArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        examples.R r2 = new examples.R((java.lang.Integer) (-6), "");
        examples.R r5 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray6 = new examples.R[] { r5 };
        java.util.ArrayList<examples.R> rList7 = new java.util.ArrayList<examples.R>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList7, rArray6);
        examples.S s11 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean13 = s11.equals((java.lang.Object) (-8));
        examples.S s16 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray17 = new examples.S[] { s11, s16 };
        java.util.ArrayList<examples.S> sList18 = new java.util.ArrayList<examples.S>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList18, sArray17);
        examples.ListComp02 listComp02_20 = new examples.ListComp02(rList7, sList18);
        examples.S s23 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str24 = s23.getB();
        java.lang.String str25 = s23.getB();
        listComp02_20.insert_s(s23);
        boolean boolean27 = r2.equals((java.lang.Object) listComp02_20);
        examples.R r30 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray31 = new examples.R[] { r30 };
        java.util.ArrayList<examples.R> rList32 = new java.util.ArrayList<examples.R>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList32, rArray31);
        examples.S s36 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean38 = s36.equals((java.lang.Object) (-8));
        examples.S s41 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray42 = new examples.S[] { s36, s41 };
        java.util.ArrayList<examples.S> sList43 = new java.util.ArrayList<examples.S>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList43, sArray42);
        examples.ListComp02 listComp02_45 = new examples.ListComp02(rList32, sList43);
        examples.S s48 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str49 = s48.getB();
        java.lang.String str50 = s48.getB();
        listComp02_45.insert_s(s48);
        examples.S s54 = new examples.S("hi!", (java.lang.Integer) 1);
        java.lang.String str55 = s54.getB();
        boolean boolean56 = s48.equals((java.lang.Object) s54);
        listComp02_20.insert_s(s54);
        listComp02_20.clear();
        java.lang.Class<?> wildcardClass59 = listComp02_20.getClass();
        org.junit.Assert.assertNotNull(rArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(sArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(rArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(sArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        examples.R r2 = new examples.R((java.lang.Integer) (-882), "hi!");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean22 = r20.equals((java.lang.Object) 6);
        examples.R r25 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r28 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean30 = r28.equals((java.lang.Object) 6);
        examples.R r33 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r36 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray37 = new examples.R[] { r36 };
        java.util.ArrayList<examples.R> rList38 = new java.util.ArrayList<examples.R>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList38, rArray37);
        examples.S s42 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean44 = s42.equals((java.lang.Object) (-8));
        examples.S s47 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray48 = new examples.S[] { s42, s47 };
        java.util.ArrayList<examples.S> sList49 = new java.util.ArrayList<examples.S>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList49, sArray48);
        examples.ListComp02 listComp02_51 = new examples.ListComp02(rList38, sList49);
        examples.R r54 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_51.insert_r(r54);
        java.lang.String str56 = r54.getB();
        examples.R r59 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean61 = r59.equals((java.lang.Object) 6);
        examples.R[] rArray62 = new examples.R[] { r20, r25, r28, r33, r54, r59 };
        java.util.ArrayList<examples.R> rList63 = new java.util.ArrayList<examples.R>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList63, rArray62);
        examples.R r67 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray68 = new examples.R[] { r67 };
        java.util.ArrayList<examples.R> rList69 = new java.util.ArrayList<examples.R>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList69, rArray68);
        examples.S s73 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean75 = s73.equals((java.lang.Object) (-8));
        examples.S s78 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray79 = new examples.S[] { s73, s78 };
        java.util.ArrayList<examples.S> sList80 = new java.util.ArrayList<examples.S>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList80, sArray79);
        examples.ListComp02 listComp02_82 = new examples.ListComp02(rList69, sList80);
        examples.ListComp02 listComp02_83 = new examples.ListComp02(rList63, sList80);
        examples.ListComp02 listComp02_84 = new examples.ListComp02(rList4, sList80);
        examples.R r87 = new examples.R((java.lang.Integer) (-10), "");
        listComp02_84.insert_r(r87);
        examples.R r91 = new examples.R((java.lang.Integer) 100, "hi!");
        listComp02_84.insert_r(r91);
        java.lang.String str93 = r91.getB();
        java.lang.Class<?> wildcardClass94 = r91.getClass();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(rArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(sArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(rArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(rArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(sArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "hi!" + "'", str93, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        examples.R r2 = new examples.R((java.lang.Integer) (-100), "");
        java.lang.String str3 = r2.getB();
        java.lang.String str4 = r2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        examples.R r2 = new examples.R((java.lang.Integer) (-10), "hi!");
        java.lang.String str3 = r2.getB();
        java.lang.Class<?> wildcardClass4 = r2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        examples.R r2 = new examples.R((java.lang.Integer) (-6), "");
        examples.R r5 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray6 = new examples.R[] { r5 };
        java.util.ArrayList<examples.R> rList7 = new java.util.ArrayList<examples.R>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList7, rArray6);
        examples.S s11 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean13 = s11.equals((java.lang.Object) (-8));
        examples.S s16 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray17 = new examples.S[] { s11, s16 };
        java.util.ArrayList<examples.S> sList18 = new java.util.ArrayList<examples.S>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList18, sArray17);
        examples.ListComp02 listComp02_20 = new examples.ListComp02(rList7, sList18);
        examples.S s23 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str24 = s23.getB();
        java.lang.String str25 = s23.getB();
        listComp02_20.insert_s(s23);
        boolean boolean27 = r2.equals((java.lang.Object) listComp02_20);
        examples.R r30 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray31 = new examples.R[] { r30 };
        java.util.ArrayList<examples.R> rList32 = new java.util.ArrayList<examples.R>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList32, rArray31);
        examples.S s36 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean38 = s36.equals((java.lang.Object) (-8));
        examples.S s41 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray42 = new examples.S[] { s36, s41 };
        java.util.ArrayList<examples.S> sList43 = new java.util.ArrayList<examples.S>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList43, sArray42);
        examples.ListComp02 listComp02_45 = new examples.ListComp02(rList32, sList43);
        examples.S s48 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str49 = s48.getB();
        java.lang.String str50 = s48.getB();
        listComp02_45.insert_s(s48);
        examples.S s54 = new examples.S("hi!", (java.lang.Integer) 1);
        java.lang.String str55 = s54.getB();
        boolean boolean56 = s48.equals((java.lang.Object) s54);
        listComp02_20.insert_s(s54);
        examples.R r60 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray61 = new examples.R[] { r60 };
        java.util.ArrayList<examples.R> rList62 = new java.util.ArrayList<examples.R>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList62, rArray61);
        examples.S s66 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean68 = s66.equals((java.lang.Object) (-8));
        examples.S s71 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray72 = new examples.S[] { s66, s71 };
        java.util.ArrayList<examples.S> sList73 = new java.util.ArrayList<examples.S>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList73, sArray72);
        examples.ListComp02 listComp02_75 = new examples.ListComp02(rList62, sList73);
        examples.S s78 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str79 = s78.getB();
        java.lang.String str80 = s78.getB();
        listComp02_75.insert_s(s78);
        examples.R r84 = new examples.R((java.lang.Integer) (-2), "");
        listComp02_75.insert_r(r84);
        boolean boolean86 = s54.equals((java.lang.Object) r84);
        org.junit.Assert.assertNotNull(rArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(sArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(rArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(sArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(rArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(sArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        examples.R r2 = new examples.R((java.lang.Integer) (-5), "");
        java.lang.Class<?> wildcardClass3 = r2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.S s20 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str21 = s20.getB();
        java.lang.String str22 = s20.getB();
        listComp02_17.insert_s(s20);
        examples.S s26 = new examples.S("hi!", (java.lang.Integer) 1);
        java.lang.String str27 = s26.getB();
        boolean boolean28 = s20.equals((java.lang.Object) s26);
        java.lang.String str29 = s26.getB();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_17.insert_r(r20);
        java.lang.Object obj22 = null;
        boolean boolean23 = r20.equals(obj22);
        java.lang.String str24 = r20.getB();
        java.lang.String str25 = r20.getB();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_17.insert_r(r20);
        listComp02_17.clear();
        listComp02_17.clear();
        examples.S s26 = new examples.S("", (java.lang.Integer) 0);
        listComp02_17.insert_s(s26);
        examples.S s28 = null;
        listComp02_17.insert_s(s28);
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        examples.R r2 = new examples.R((java.lang.Integer) 8, "hi!");
        java.lang.String str3 = r2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) 7);
        boolean boolean4 = s2.equals((java.lang.Object) (-5L));
        java.lang.String str5 = s2.getB();
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str9 = s8.getB();
        examples.S s12 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str13 = s12.getB();
        boolean boolean15 = s12.equals((java.lang.Object) 10.0d);
        boolean boolean17 = s12.equals((java.lang.Object) (-2.1d));
        boolean boolean18 = s8.equals((java.lang.Object) boolean17);
        java.lang.String str19 = s8.getB();
        examples.R r22 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray23 = new examples.R[] { r22 };
        java.util.ArrayList<examples.R> rList24 = new java.util.ArrayList<examples.R>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList24, rArray23);
        examples.S s28 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean30 = s28.equals((java.lang.Object) (-8));
        examples.S s33 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray34 = new examples.S[] { s28, s33 };
        java.util.ArrayList<examples.S> sList35 = new java.util.ArrayList<examples.S>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList35, sArray34);
        examples.ListComp02 listComp02_37 = new examples.ListComp02(rList24, sList35);
        examples.R r40 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_37.insert_r(r40);
        java.lang.String str42 = r40.getB();
        examples.R r45 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean47 = r45.equals((java.lang.Object) 6);
        boolean boolean48 = r40.equals((java.lang.Object) 6);
        boolean boolean49 = s8.equals((java.lang.Object) r40);
        boolean boolean50 = s2.equals((java.lang.Object) r40);
        java.lang.String str51 = r40.getB();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(rArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(sArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        examples.S s2 = new examples.S("", (java.lang.Integer) (-9900));
        java.lang.String str3 = s2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        examples.R r2 = new examples.R((java.lang.Integer) 63, "hi!");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        java.util.ArrayList<examples.R> rList0 = null;
        examples.R r3 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray4 = new examples.R[] { r3 };
        java.util.ArrayList<examples.R> rList5 = new java.util.ArrayList<examples.R>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList5, rArray4);
        examples.S s9 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean11 = s9.equals((java.lang.Object) (-8));
        examples.S s14 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray15 = new examples.S[] { s9, s14 };
        java.util.ArrayList<examples.S> sList16 = new java.util.ArrayList<examples.S>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList16, sArray15);
        examples.ListComp02 listComp02_18 = new examples.ListComp02(rList5, sList16);
        examples.R r21 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray22 = new examples.R[] { r21 };
        java.util.ArrayList<examples.R> rList23 = new java.util.ArrayList<examples.R>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList23, rArray22);
        examples.S s27 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean29 = s27.equals((java.lang.Object) (-8));
        examples.S s32 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray33 = new examples.S[] { s27, s32 };
        java.util.ArrayList<examples.S> sList34 = new java.util.ArrayList<examples.S>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList34, sArray33);
        examples.ListComp02 listComp02_36 = new examples.ListComp02(rList23, sList34);
        examples.R r39 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray40 = new examples.R[] { r39 };
        java.util.ArrayList<examples.R> rList41 = new java.util.ArrayList<examples.R>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList41, rArray40);
        examples.S s45 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean47 = s45.equals((java.lang.Object) (-8));
        examples.S s50 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray51 = new examples.S[] { s45, s50 };
        java.util.ArrayList<examples.S> sList52 = new java.util.ArrayList<examples.S>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList52, sArray51);
        examples.ListComp02 listComp02_54 = new examples.ListComp02(rList41, sList52);
        examples.ListComp02 listComp02_55 = new examples.ListComp02(rList23, sList52);
        examples.R r58 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray59 = new examples.R[] { r58 };
        java.util.ArrayList<examples.R> rList60 = new java.util.ArrayList<examples.R>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList60, rArray59);
        examples.S s64 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean66 = s64.equals((java.lang.Object) (-8));
        examples.S s69 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray70 = new examples.S[] { s64, s69 };
        java.util.ArrayList<examples.S> sList71 = new java.util.ArrayList<examples.S>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList71, sArray70);
        examples.ListComp02 listComp02_73 = new examples.ListComp02(rList60, sList71);
        examples.ListComp02 listComp02_74 = new examples.ListComp02(rList23, sList71);
        examples.ListComp02 listComp02_75 = new examples.ListComp02(rList5, sList71);
        examples.ListComp02 listComp02_76 = new examples.ListComp02(rList0, sList71);
        listComp02_76.clear();
        listComp02_76.clear();
        org.junit.Assert.assertNotNull(rArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(sArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(rArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(sArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(rArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(sArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(rArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(sArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        examples.S s2 = new examples.S("", (java.lang.Integer) (-3));
        examples.S s5 = new examples.S("hi!", (java.lang.Integer) (-8));
        boolean boolean7 = s5.equals((java.lang.Object) (-2));
        java.lang.String str8 = s5.getB();
        boolean boolean9 = s2.equals((java.lang.Object) str8);
        java.lang.String str10 = s2.getB();
        java.lang.Class<?> wildcardClass11 = s2.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        examples.S s2 = new examples.S("", (java.lang.Integer) (-2));
        java.lang.String str3 = s2.getB();
        examples.R r6 = new examples.R((java.lang.Integer) 20000, "");
        boolean boolean7 = s2.equals((java.lang.Object) 20000);
        examples.R r10 = new examples.R((java.lang.Integer) (-1), "hi!");
        java.lang.Object obj11 = null;
        boolean boolean12 = r10.equals(obj11);
        examples.R r15 = new examples.R((java.lang.Integer) 100, "hi!");
        java.lang.String str16 = r15.getB();
        boolean boolean17 = r10.equals((java.lang.Object) r15);
        java.lang.String str18 = r15.getB();
        java.lang.String str19 = r15.getB();
        boolean boolean20 = s2.equals((java.lang.Object) str19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        examples.S s2 = new examples.S("", (java.lang.Integer) (-9));
        java.lang.String str3 = s2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        examples.S s2 = new examples.S("", (java.lang.Integer) 10692);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        java.lang.Object obj3 = null;
        boolean boolean4 = r2.equals(obj3);
        examples.R r7 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray8 = new examples.R[] { r7 };
        java.util.ArrayList<examples.R> rList9 = new java.util.ArrayList<examples.R>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList9, rArray8);
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean15 = s13.equals((java.lang.Object) (-8));
        examples.S s18 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray19 = new examples.S[] { s13, s18 };
        java.util.ArrayList<examples.S> sList20 = new java.util.ArrayList<examples.S>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList20, sArray19);
        examples.ListComp02 listComp02_22 = new examples.ListComp02(rList9, sList20);
        examples.R r25 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean27 = r25.equals((java.lang.Object) 6);
        examples.R r30 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r33 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean35 = r33.equals((java.lang.Object) 6);
        examples.R r38 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r41 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray42 = new examples.R[] { r41 };
        java.util.ArrayList<examples.R> rList43 = new java.util.ArrayList<examples.R>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList43, rArray42);
        examples.S s47 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean49 = s47.equals((java.lang.Object) (-8));
        examples.S s52 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray53 = new examples.S[] { s47, s52 };
        java.util.ArrayList<examples.S> sList54 = new java.util.ArrayList<examples.S>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList54, sArray53);
        examples.ListComp02 listComp02_56 = new examples.ListComp02(rList43, sList54);
        examples.R r59 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_56.insert_r(r59);
        java.lang.String str61 = r59.getB();
        examples.R r64 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean66 = r64.equals((java.lang.Object) 6);
        examples.R[] rArray67 = new examples.R[] { r25, r30, r33, r38, r59, r64 };
        java.util.ArrayList<examples.R> rList68 = new java.util.ArrayList<examples.R>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList68, rArray67);
        examples.R r72 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray73 = new examples.R[] { r72 };
        java.util.ArrayList<examples.R> rList74 = new java.util.ArrayList<examples.R>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList74, rArray73);
        examples.S s78 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean80 = s78.equals((java.lang.Object) (-8));
        examples.S s83 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray84 = new examples.S[] { s78, s83 };
        java.util.ArrayList<examples.S> sList85 = new java.util.ArrayList<examples.S>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList85, sArray84);
        examples.ListComp02 listComp02_87 = new examples.ListComp02(rList74, sList85);
        examples.ListComp02 listComp02_88 = new examples.ListComp02(rList68, sList85);
        examples.ListComp02 listComp02_89 = new examples.ListComp02(rList9, sList85);
        listComp02_89.clear();
        boolean boolean91 = r2.equals((java.lang.Object) listComp02_89);
        listComp02_89.clear();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(sArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(rArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(sArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(rArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(rArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(sArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        examples.S s2 = new examples.S("", (java.lang.Integer) (-1600));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) (-10));
        examples.R r5 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray6 = new examples.R[] { r5 };
        java.util.ArrayList<examples.R> rList7 = new java.util.ArrayList<examples.R>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList7, rArray6);
        examples.S s11 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean13 = s11.equals((java.lang.Object) (-8));
        examples.S s16 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray17 = new examples.S[] { s11, s16 };
        java.util.ArrayList<examples.S> sList18 = new java.util.ArrayList<examples.S>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList18, sArray17);
        examples.ListComp02 listComp02_20 = new examples.ListComp02(rList7, sList18);
        examples.R r23 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray24 = new examples.R[] { r23 };
        java.util.ArrayList<examples.R> rList25 = new java.util.ArrayList<examples.R>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList25, rArray24);
        examples.S s29 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean31 = s29.equals((java.lang.Object) (-8));
        examples.S s34 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray35 = new examples.S[] { s29, s34 };
        java.util.ArrayList<examples.S> sList36 = new java.util.ArrayList<examples.S>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList36, sArray35);
        examples.ListComp02 listComp02_38 = new examples.ListComp02(rList25, sList36);
        examples.R r41 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray42 = new examples.R[] { r41 };
        java.util.ArrayList<examples.R> rList43 = new java.util.ArrayList<examples.R>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList43, rArray42);
        examples.S s47 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean49 = s47.equals((java.lang.Object) (-8));
        examples.S s52 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray53 = new examples.S[] { s47, s52 };
        java.util.ArrayList<examples.S> sList54 = new java.util.ArrayList<examples.S>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList54, sArray53);
        examples.ListComp02 listComp02_56 = new examples.ListComp02(rList43, sList54);
        examples.ListComp02 listComp02_57 = new examples.ListComp02(rList25, sList54);
        examples.R r60 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray61 = new examples.R[] { r60 };
        java.util.ArrayList<examples.R> rList62 = new java.util.ArrayList<examples.R>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList62, rArray61);
        examples.S s66 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean68 = s66.equals((java.lang.Object) (-8));
        examples.S s71 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray72 = new examples.S[] { s66, s71 };
        java.util.ArrayList<examples.S> sList73 = new java.util.ArrayList<examples.S>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList73, sArray72);
        examples.ListComp02 listComp02_75 = new examples.ListComp02(rList62, sList73);
        examples.ListComp02 listComp02_76 = new examples.ListComp02(rList25, sList73);
        examples.ListComp02 listComp02_77 = new examples.ListComp02(rList7, sList73);
        examples.S s80 = new examples.S("hi!", (java.lang.Integer) 7);
        examples.S s83 = new examples.S("", (java.lang.Integer) (-2));
        boolean boolean84 = s80.equals((java.lang.Object) s83);
        listComp02_77.insert_s(s80);
        boolean boolean86 = s2.equals((java.lang.Object) listComp02_77);
        boolean boolean88 = s2.equals((java.lang.Object) (-9800));
        org.junit.Assert.assertNotNull(rArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(sArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(rArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(sArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(rArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(sArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(rArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(sArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray21 = new examples.R[] { r20 };
        java.util.ArrayList<examples.R> rList22 = new java.util.ArrayList<examples.R>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList22, rArray21);
        examples.S s26 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean28 = s26.equals((java.lang.Object) (-8));
        examples.S s31 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray32 = new examples.S[] { s26, s31 };
        java.util.ArrayList<examples.S> sList33 = new java.util.ArrayList<examples.S>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList33, sArray32);
        examples.ListComp02 listComp02_35 = new examples.ListComp02(rList22, sList33);
        examples.ListComp02 listComp02_36 = new examples.ListComp02(rList4, sList33);
        examples.R r39 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray40 = new examples.R[] { r39 };
        java.util.ArrayList<examples.R> rList41 = new java.util.ArrayList<examples.R>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList41, rArray40);
        examples.S s45 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean47 = s45.equals((java.lang.Object) (-8));
        examples.S s50 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray51 = new examples.S[] { s45, s50 };
        java.util.ArrayList<examples.S> sList52 = new java.util.ArrayList<examples.S>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList52, sArray51);
        examples.ListComp02 listComp02_54 = new examples.ListComp02(rList41, sList52);
        examples.ListComp02 listComp02_55 = new examples.ListComp02(rList4, sList52);
        examples.S s58 = new examples.S("", (java.lang.Integer) 0);
        listComp02_55.insert_s(s58);
        examples.S s60 = null;
        listComp02_55.insert_s(s60);
        listComp02_55.clear();
        listComp02_55.clear();
        listComp02_55.clear();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(rArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(sArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(rArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(sArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        examples.S s2 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str3 = s2.getB();
        boolean boolean5 = s2.equals((java.lang.Object) 10.0d);
        boolean boolean7 = s2.equals((java.lang.Object) (-2.1d));
        java.lang.String str8 = s2.getB();
        java.lang.String str9 = s2.getB();
        java.lang.String str10 = s2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        examples.R r2 = new examples.R((java.lang.Integer) (-10692), "hi!");
        java.lang.String str3 = r2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        java.util.ArrayList<examples.R> rList0 = null;
        examples.R r3 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray4 = new examples.R[] { r3 };
        java.util.ArrayList<examples.R> rList5 = new java.util.ArrayList<examples.R>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList5, rArray4);
        examples.S s9 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean11 = s9.equals((java.lang.Object) (-8));
        examples.S s14 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray15 = new examples.S[] { s9, s14 };
        java.util.ArrayList<examples.S> sList16 = new java.util.ArrayList<examples.S>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList16, sArray15);
        examples.ListComp02 listComp02_18 = new examples.ListComp02(rList5, sList16);
        examples.R r21 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray22 = new examples.R[] { r21 };
        java.util.ArrayList<examples.R> rList23 = new java.util.ArrayList<examples.R>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList23, rArray22);
        examples.S s27 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean29 = s27.equals((java.lang.Object) (-8));
        examples.S s32 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray33 = new examples.S[] { s27, s32 };
        java.util.ArrayList<examples.S> sList34 = new java.util.ArrayList<examples.S>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList34, sArray33);
        examples.ListComp02 listComp02_36 = new examples.ListComp02(rList23, sList34);
        examples.ListComp02 listComp02_37 = new examples.ListComp02(rList5, sList34);
        examples.ListComp02 listComp02_38 = new examples.ListComp02(rList0, sList34);
        listComp02_38.clear();
        examples.R r42 = new examples.R((java.lang.Integer) (-16), "hi!");
        listComp02_38.insert_r(r42);
        org.junit.Assert.assertNotNull(rArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(sArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(rArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(sArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) 7);
        boolean boolean4 = s2.equals((java.lang.Object) (-5L));
        java.lang.String str5 = s2.getB();
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str9 = s8.getB();
        examples.S s12 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str13 = s12.getB();
        boolean boolean15 = s12.equals((java.lang.Object) 10.0d);
        boolean boolean17 = s12.equals((java.lang.Object) (-2.1d));
        boolean boolean18 = s8.equals((java.lang.Object) boolean17);
        java.lang.String str19 = s8.getB();
        examples.R r22 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray23 = new examples.R[] { r22 };
        java.util.ArrayList<examples.R> rList24 = new java.util.ArrayList<examples.R>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList24, rArray23);
        examples.S s28 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean30 = s28.equals((java.lang.Object) (-8));
        examples.S s33 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray34 = new examples.S[] { s28, s33 };
        java.util.ArrayList<examples.S> sList35 = new java.util.ArrayList<examples.S>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList35, sArray34);
        examples.ListComp02 listComp02_37 = new examples.ListComp02(rList24, sList35);
        examples.R r40 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_37.insert_r(r40);
        java.lang.String str42 = r40.getB();
        examples.R r45 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean47 = r45.equals((java.lang.Object) 6);
        boolean boolean48 = r40.equals((java.lang.Object) 6);
        boolean boolean49 = s8.equals((java.lang.Object) r40);
        boolean boolean50 = s2.equals((java.lang.Object) r40);
        java.lang.String str51 = s2.getB();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(rArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(sArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        java.util.ArrayList<examples.R> rList0 = null;
        examples.R r3 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray4 = new examples.R[] { r3 };
        java.util.ArrayList<examples.R> rList5 = new java.util.ArrayList<examples.R>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList5, rArray4);
        examples.R r9 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean11 = r9.equals((java.lang.Object) 6);
        examples.R r14 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r17 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean19 = r17.equals((java.lang.Object) 6);
        examples.R r22 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r25 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray26 = new examples.R[] { r25 };
        java.util.ArrayList<examples.R> rList27 = new java.util.ArrayList<examples.R>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList27, rArray26);
        examples.S s31 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean33 = s31.equals((java.lang.Object) (-8));
        examples.S s36 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray37 = new examples.S[] { s31, s36 };
        java.util.ArrayList<examples.S> sList38 = new java.util.ArrayList<examples.S>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList38, sArray37);
        examples.ListComp02 listComp02_40 = new examples.ListComp02(rList27, sList38);
        examples.R r43 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_40.insert_r(r43);
        java.lang.String str45 = r43.getB();
        examples.R r48 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean50 = r48.equals((java.lang.Object) 6);
        examples.R[] rArray51 = new examples.R[] { r9, r14, r17, r22, r43, r48 };
        java.util.ArrayList<examples.R> rList52 = new java.util.ArrayList<examples.R>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList52, rArray51);
        examples.R r56 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray57 = new examples.R[] { r56 };
        java.util.ArrayList<examples.R> rList58 = new java.util.ArrayList<examples.R>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList58, rArray57);
        examples.S s62 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean64 = s62.equals((java.lang.Object) (-8));
        examples.S s67 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray68 = new examples.S[] { s62, s67 };
        java.util.ArrayList<examples.S> sList69 = new java.util.ArrayList<examples.S>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList69, sArray68);
        examples.ListComp02 listComp02_71 = new examples.ListComp02(rList58, sList69);
        examples.ListComp02 listComp02_72 = new examples.ListComp02(rList52, sList69);
        examples.ListComp02 listComp02_73 = new examples.ListComp02(rList5, sList69);
        examples.ListComp02 listComp02_74 = new examples.ListComp02(rList0, sList69);
        listComp02_74.clear();
        listComp02_74.clear();
        listComp02_74.clear();
        org.junit.Assert.assertNotNull(rArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(rArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(sArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(rArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(rArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(sArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) (-1600));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) 2);
        java.lang.String str3 = s2.getB();
        boolean boolean5 = s2.equals((java.lang.Object) (-7L));
        java.lang.String str6 = s2.getB();
        java.lang.Class<?> wildcardClass7 = s2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray21 = new examples.R[] { r20 };
        java.util.ArrayList<examples.R> rList22 = new java.util.ArrayList<examples.R>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList22, rArray21);
        examples.S s26 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean28 = s26.equals((java.lang.Object) (-8));
        examples.S s31 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray32 = new examples.S[] { s26, s31 };
        java.util.ArrayList<examples.S> sList33 = new java.util.ArrayList<examples.S>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList33, sArray32);
        examples.ListComp02 listComp02_35 = new examples.ListComp02(rList22, sList33);
        examples.ListComp02 listComp02_36 = new examples.ListComp02(rList4, sList33);
        java.util.ArrayList<examples.S> sList37 = null;
        examples.ListComp02 listComp02_38 = new examples.ListComp02(rList4, sList37);
        listComp02_38.clear();
        listComp02_38.clear();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(rArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(sArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean22 = r20.equals((java.lang.Object) 6);
        examples.R r25 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r28 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean30 = r28.equals((java.lang.Object) 6);
        examples.R r33 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r36 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray37 = new examples.R[] { r36 };
        java.util.ArrayList<examples.R> rList38 = new java.util.ArrayList<examples.R>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList38, rArray37);
        examples.S s42 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean44 = s42.equals((java.lang.Object) (-8));
        examples.S s47 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray48 = new examples.S[] { s42, s47 };
        java.util.ArrayList<examples.S> sList49 = new java.util.ArrayList<examples.S>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList49, sArray48);
        examples.ListComp02 listComp02_51 = new examples.ListComp02(rList38, sList49);
        examples.R r54 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_51.insert_r(r54);
        java.lang.String str56 = r54.getB();
        examples.R r59 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean61 = r59.equals((java.lang.Object) 6);
        examples.R[] rArray62 = new examples.R[] { r20, r25, r28, r33, r54, r59 };
        java.util.ArrayList<examples.R> rList63 = new java.util.ArrayList<examples.R>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList63, rArray62);
        examples.R r67 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray68 = new examples.R[] { r67 };
        java.util.ArrayList<examples.R> rList69 = new java.util.ArrayList<examples.R>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList69, rArray68);
        examples.S s73 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean75 = s73.equals((java.lang.Object) (-8));
        examples.S s78 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray79 = new examples.S[] { s73, s78 };
        java.util.ArrayList<examples.S> sList80 = new java.util.ArrayList<examples.S>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList80, sArray79);
        examples.ListComp02 listComp02_82 = new examples.ListComp02(rList69, sList80);
        examples.ListComp02 listComp02_83 = new examples.ListComp02(rList63, sList80);
        examples.ListComp02 listComp02_84 = new examples.ListComp02(rList4, sList80);
        examples.R r87 = new examples.R((java.lang.Integer) (-10), "");
        listComp02_84.insert_r(r87);
        examples.R r91 = new examples.R((java.lang.Integer) 100, "hi!");
        listComp02_84.insert_r(r91);
        boolean boolean94 = r91.equals((java.lang.Object) 0.0d);
        java.lang.String str95 = r91.getB();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(rArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(sArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(rArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(rArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(sArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "hi!" + "'", str95, "hi!");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) 7);
        examples.R r5 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray6 = new examples.R[] { r5 };
        java.util.ArrayList<examples.R> rList7 = new java.util.ArrayList<examples.R>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList7, rArray6);
        examples.S s11 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean13 = s11.equals((java.lang.Object) (-8));
        examples.S s16 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray17 = new examples.S[] { s11, s16 };
        java.util.ArrayList<examples.S> sList18 = new java.util.ArrayList<examples.S>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList18, sArray17);
        examples.ListComp02 listComp02_20 = new examples.ListComp02(rList7, sList18);
        examples.S s23 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str24 = s23.getB();
        java.lang.String str25 = s23.getB();
        listComp02_20.insert_s(s23);
        examples.R r29 = new examples.R((java.lang.Integer) (-2), "");
        listComp02_20.insert_r(r29);
        boolean boolean31 = s2.equals((java.lang.Object) listComp02_20);
        java.lang.Class<?> wildcardClass32 = s2.getClass();
        org.junit.Assert.assertNotNull(rArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(sArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        examples.R r2 = new examples.R((java.lang.Integer) (-6), "");
        examples.R r5 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray6 = new examples.R[] { r5 };
        java.util.ArrayList<examples.R> rList7 = new java.util.ArrayList<examples.R>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList7, rArray6);
        examples.S s11 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean13 = s11.equals((java.lang.Object) (-8));
        examples.S s16 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray17 = new examples.S[] { s11, s16 };
        java.util.ArrayList<examples.S> sList18 = new java.util.ArrayList<examples.S>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList18, sArray17);
        examples.ListComp02 listComp02_20 = new examples.ListComp02(rList7, sList18);
        examples.S s23 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str24 = s23.getB();
        java.lang.String str25 = s23.getB();
        listComp02_20.insert_s(s23);
        boolean boolean27 = r2.equals((java.lang.Object) listComp02_20);
        examples.R r30 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray31 = new examples.R[] { r30 };
        java.util.ArrayList<examples.R> rList32 = new java.util.ArrayList<examples.R>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList32, rArray31);
        examples.S s36 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean38 = s36.equals((java.lang.Object) (-8));
        examples.S s41 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray42 = new examples.S[] { s36, s41 };
        java.util.ArrayList<examples.S> sList43 = new java.util.ArrayList<examples.S>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList43, sArray42);
        examples.ListComp02 listComp02_45 = new examples.ListComp02(rList32, sList43);
        examples.S s48 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str49 = s48.getB();
        java.lang.String str50 = s48.getB();
        listComp02_45.insert_s(s48);
        examples.S s54 = new examples.S("hi!", (java.lang.Integer) 1);
        java.lang.String str55 = s54.getB();
        boolean boolean56 = s48.equals((java.lang.Object) s54);
        listComp02_20.insert_s(s54);
        listComp02_20.clear();
        listComp02_20.clear();
        listComp02_20.clear();
        org.junit.Assert.assertNotNull(rArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(sArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(rArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(sArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        examples.R r2 = new examples.R((java.lang.Integer) (-6), "");
        examples.R r5 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray6 = new examples.R[] { r5 };
        java.util.ArrayList<examples.R> rList7 = new java.util.ArrayList<examples.R>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList7, rArray6);
        examples.S s11 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean13 = s11.equals((java.lang.Object) (-8));
        examples.S s16 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray17 = new examples.S[] { s11, s16 };
        java.util.ArrayList<examples.S> sList18 = new java.util.ArrayList<examples.S>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList18, sArray17);
        examples.ListComp02 listComp02_20 = new examples.ListComp02(rList7, sList18);
        examples.S s23 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str24 = s23.getB();
        java.lang.String str25 = s23.getB();
        listComp02_20.insert_s(s23);
        boolean boolean27 = r2.equals((java.lang.Object) listComp02_20);
        examples.R r30 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray31 = new examples.R[] { r30 };
        java.util.ArrayList<examples.R> rList32 = new java.util.ArrayList<examples.R>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList32, rArray31);
        examples.S s36 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean38 = s36.equals((java.lang.Object) (-8));
        examples.S s41 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray42 = new examples.S[] { s36, s41 };
        java.util.ArrayList<examples.S> sList43 = new java.util.ArrayList<examples.S>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList43, sArray42);
        examples.ListComp02 listComp02_45 = new examples.ListComp02(rList32, sList43);
        examples.S s48 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str49 = s48.getB();
        java.lang.String str50 = s48.getB();
        listComp02_45.insert_s(s48);
        examples.S s54 = new examples.S("hi!", (java.lang.Integer) 1);
        java.lang.String str55 = s54.getB();
        boolean boolean56 = s48.equals((java.lang.Object) s54);
        listComp02_20.insert_s(s54);
        java.lang.Object obj58 = null;
        boolean boolean59 = s54.equals(obj58);
        java.lang.String str60 = s54.getB();
        org.junit.Assert.assertNotNull(rArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(sArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(rArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(sArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean22 = r20.equals((java.lang.Object) 6);
        examples.R r25 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r28 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean30 = r28.equals((java.lang.Object) 6);
        examples.R r33 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r36 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray37 = new examples.R[] { r36 };
        java.util.ArrayList<examples.R> rList38 = new java.util.ArrayList<examples.R>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList38, rArray37);
        examples.S s42 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean44 = s42.equals((java.lang.Object) (-8));
        examples.S s47 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray48 = new examples.S[] { s42, s47 };
        java.util.ArrayList<examples.S> sList49 = new java.util.ArrayList<examples.S>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList49, sArray48);
        examples.ListComp02 listComp02_51 = new examples.ListComp02(rList38, sList49);
        examples.R r54 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_51.insert_r(r54);
        java.lang.String str56 = r54.getB();
        examples.R r59 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean61 = r59.equals((java.lang.Object) 6);
        examples.R[] rArray62 = new examples.R[] { r20, r25, r28, r33, r54, r59 };
        java.util.ArrayList<examples.R> rList63 = new java.util.ArrayList<examples.R>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList63, rArray62);
        examples.R r67 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray68 = new examples.R[] { r67 };
        java.util.ArrayList<examples.R> rList69 = new java.util.ArrayList<examples.R>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList69, rArray68);
        examples.S s73 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean75 = s73.equals((java.lang.Object) (-8));
        examples.S s78 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray79 = new examples.S[] { s73, s78 };
        java.util.ArrayList<examples.S> sList80 = new java.util.ArrayList<examples.S>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList80, sArray79);
        examples.ListComp02 listComp02_82 = new examples.ListComp02(rList69, sList80);
        examples.ListComp02 listComp02_83 = new examples.ListComp02(rList63, sList80);
        examples.ListComp02 listComp02_84 = new examples.ListComp02(rList4, sList80);
        examples.R r87 = new examples.R((java.lang.Integer) (-10), "");
        listComp02_84.insert_r(r87);
        examples.R r91 = new examples.R((java.lang.Integer) 100, "hi!");
        listComp02_84.insert_r(r91);
        listComp02_84.clear();
        examples.R r96 = new examples.R((java.lang.Integer) 1, "");
        listComp02_84.insert_r(r96);
        java.lang.String str98 = r96.getB();
        java.lang.Class<?> wildcardClass99 = r96.getClass();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(rArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(sArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(rArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(rArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(sArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "" + "'", str98, "");
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        examples.S s2 = new examples.S("", (java.lang.Integer) (-3));
        examples.R r5 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray6 = new examples.R[] { r5 };
        java.util.ArrayList<examples.R> rList7 = new java.util.ArrayList<examples.R>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList7, rArray6);
        examples.S s11 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean13 = s11.equals((java.lang.Object) (-8));
        examples.S s16 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray17 = new examples.S[] { s11, s16 };
        java.util.ArrayList<examples.S> sList18 = new java.util.ArrayList<examples.S>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList18, sArray17);
        examples.ListComp02 listComp02_20 = new examples.ListComp02(rList7, sList18);
        examples.R r23 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray24 = new examples.R[] { r23 };
        java.util.ArrayList<examples.R> rList25 = new java.util.ArrayList<examples.R>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList25, rArray24);
        examples.S s29 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean31 = s29.equals((java.lang.Object) (-8));
        examples.S s34 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray35 = new examples.S[] { s29, s34 };
        java.util.ArrayList<examples.S> sList36 = new java.util.ArrayList<examples.S>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList36, sArray35);
        examples.ListComp02 listComp02_38 = new examples.ListComp02(rList25, sList36);
        examples.ListComp02 listComp02_39 = new examples.ListComp02(rList7, sList36);
        examples.R r42 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray43 = new examples.R[] { r42 };
        java.util.ArrayList<examples.R> rList44 = new java.util.ArrayList<examples.R>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList44, rArray43);
        examples.S s48 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean50 = s48.equals((java.lang.Object) (-8));
        examples.S s53 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray54 = new examples.S[] { s48, s53 };
        java.util.ArrayList<examples.S> sList55 = new java.util.ArrayList<examples.S>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList55, sArray54);
        examples.ListComp02 listComp02_57 = new examples.ListComp02(rList44, sList55);
        examples.ListComp02 listComp02_58 = new examples.ListComp02(rList7, sList55);
        examples.S s61 = new examples.S("", (java.lang.Integer) 0);
        listComp02_58.insert_s(s61);
        boolean boolean63 = s2.equals((java.lang.Object) s61);
        org.junit.Assert.assertNotNull(rArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(sArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(rArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(sArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(rArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(sArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) 7);
        examples.R r5 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray6 = new examples.R[] { r5 };
        java.util.ArrayList<examples.R> rList7 = new java.util.ArrayList<examples.R>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList7, rArray6);
        examples.S s11 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean13 = s11.equals((java.lang.Object) (-8));
        examples.S s16 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray17 = new examples.S[] { s11, s16 };
        java.util.ArrayList<examples.S> sList18 = new java.util.ArrayList<examples.S>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList18, sArray17);
        examples.ListComp02 listComp02_20 = new examples.ListComp02(rList7, sList18);
        examples.S s23 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str24 = s23.getB();
        java.lang.String str25 = s23.getB();
        listComp02_20.insert_s(s23);
        examples.R r29 = new examples.R((java.lang.Integer) (-2), "");
        listComp02_20.insert_r(r29);
        boolean boolean31 = s2.equals((java.lang.Object) listComp02_20);
        listComp02_20.clear();
        listComp02_20.clear();
        listComp02_20.clear();
        listComp02_20.clear();
        org.junit.Assert.assertNotNull(rArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(sArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        examples.S s2 = new examples.S("", (java.lang.Integer) 0);
        examples.R r5 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean7 = r5.equals((java.lang.Object) 6);
        java.lang.Object obj8 = null;
        boolean boolean9 = r5.equals(obj8);
        examples.R r12 = new examples.R((java.lang.Integer) 1, "hi!");
        java.lang.String str13 = r12.getB();
        boolean boolean14 = r5.equals((java.lang.Object) r12);
        java.lang.String str15 = r5.getB();
        examples.R r18 = new examples.R((java.lang.Integer) (-6), "");
        examples.R r21 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray22 = new examples.R[] { r21 };
        java.util.ArrayList<examples.R> rList23 = new java.util.ArrayList<examples.R>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList23, rArray22);
        examples.S s27 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean29 = s27.equals((java.lang.Object) (-8));
        examples.S s32 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray33 = new examples.S[] { s27, s32 };
        java.util.ArrayList<examples.S> sList34 = new java.util.ArrayList<examples.S>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList34, sArray33);
        examples.ListComp02 listComp02_36 = new examples.ListComp02(rList23, sList34);
        examples.S s39 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str40 = s39.getB();
        java.lang.String str41 = s39.getB();
        listComp02_36.insert_s(s39);
        boolean boolean43 = r18.equals((java.lang.Object) listComp02_36);
        boolean boolean44 = r5.equals((java.lang.Object) listComp02_36);
        boolean boolean45 = s2.equals((java.lang.Object) r5);
        java.lang.String str46 = s2.getB();
        java.lang.String str47 = s2.getB();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(rArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(sArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_17.insert_r(r20);
        examples.R r24 = new examples.R((java.lang.Integer) (-1), "hi!");
        java.lang.Object obj25 = null;
        boolean boolean26 = r24.equals(obj25);
        examples.R r29 = new examples.R((java.lang.Integer) 100, "hi!");
        java.lang.String str30 = r29.getB();
        boolean boolean31 = r24.equals((java.lang.Object) r29);
        listComp02_17.insert_r(r29);
        java.lang.String str33 = r29.getB();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        examples.R r2 = new examples.R((java.lang.Integer) 16, "");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean4 = r2.equals((java.lang.Object) 6);
        examples.R r7 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r10 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean12 = r10.equals((java.lang.Object) 6);
        examples.R r15 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r18 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray19 = new examples.R[] { r18 };
        java.util.ArrayList<examples.R> rList20 = new java.util.ArrayList<examples.R>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList20, rArray19);
        examples.S s24 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean26 = s24.equals((java.lang.Object) (-8));
        examples.S s29 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray30 = new examples.S[] { s24, s29 };
        java.util.ArrayList<examples.S> sList31 = new java.util.ArrayList<examples.S>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList31, sArray30);
        examples.ListComp02 listComp02_33 = new examples.ListComp02(rList20, sList31);
        examples.R r36 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_33.insert_r(r36);
        java.lang.String str38 = r36.getB();
        examples.R r41 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean43 = r41.equals((java.lang.Object) 6);
        examples.R[] rArray44 = new examples.R[] { r2, r7, r10, r15, r36, r41 };
        java.util.ArrayList<examples.R> rList45 = new java.util.ArrayList<examples.R>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList45, rArray44);
        examples.R r49 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray50 = new examples.R[] { r49 };
        java.util.ArrayList<examples.R> rList51 = new java.util.ArrayList<examples.R>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList51, rArray50);
        examples.S s55 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean57 = s55.equals((java.lang.Object) (-8));
        examples.S s60 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray61 = new examples.S[] { s55, s60 };
        java.util.ArrayList<examples.S> sList62 = new java.util.ArrayList<examples.S>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList62, sArray61);
        examples.ListComp02 listComp02_64 = new examples.ListComp02(rList51, sList62);
        examples.ListComp02 listComp02_65 = new examples.ListComp02(rList45, sList62);
        examples.R r68 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray69 = new examples.R[] { r68 };
        java.util.ArrayList<examples.R> rList70 = new java.util.ArrayList<examples.R>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList70, rArray69);
        examples.S s74 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean76 = s74.equals((java.lang.Object) (-8));
        examples.S s79 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray80 = new examples.S[] { s74, s79 };
        java.util.ArrayList<examples.S> sList81 = new java.util.ArrayList<examples.S>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList81, sArray80);
        examples.ListComp02 listComp02_83 = new examples.ListComp02(rList70, sList81);
        examples.R r86 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_83.insert_r(r86);
        java.lang.String str88 = r86.getB();
        boolean boolean90 = r86.equals((java.lang.Object) (short) 100);
        listComp02_65.insert_r(r86);
        java.lang.String str92 = r86.getB();
        java.lang.String str93 = r86.getB();
        java.lang.String str94 = r86.getB();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(rArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(sArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(rArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(rArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(sArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(rArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(sArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!" + "'", str88, "hi!");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "hi!" + "'", str92, "hi!");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "hi!" + "'", str93, "hi!");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "hi!" + "'", str94, "hi!");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        examples.R r2 = new examples.R((java.lang.Integer) 10685, "hi!");
        java.lang.String str3 = r2.getB();
        examples.R r6 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray7 = new examples.R[] { r6 };
        java.util.ArrayList<examples.R> rList8 = new java.util.ArrayList<examples.R>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList8, rArray7);
        examples.S s12 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean14 = s12.equals((java.lang.Object) (-8));
        examples.S s17 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray18 = new examples.S[] { s12, s17 };
        java.util.ArrayList<examples.S> sList19 = new java.util.ArrayList<examples.S>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList19, sArray18);
        examples.ListComp02 listComp02_21 = new examples.ListComp02(rList8, sList19);
        examples.R r24 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_21.insert_r(r24);
        examples.S s28 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str29 = s28.getB();
        examples.S s32 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str33 = s32.getB();
        boolean boolean35 = s32.equals((java.lang.Object) 10.0d);
        boolean boolean37 = s32.equals((java.lang.Object) (-2.1d));
        boolean boolean38 = s28.equals((java.lang.Object) boolean37);
        java.lang.String str39 = s28.getB();
        listComp02_21.insert_s(s28);
        boolean boolean41 = r2.equals((java.lang.Object) listComp02_21);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(rArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(sArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        examples.R r2 = new examples.R((java.lang.Integer) (-4), "");
        java.lang.String str3 = r2.getB();
        java.lang.String str4 = r2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_17.insert_r(r20);
        java.lang.String str22 = r20.getB();
        boolean boolean24 = r20.equals((java.lang.Object) (short) 100);
        java.lang.String str25 = r20.getB();
        java.lang.String str26 = r20.getB();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        examples.R r2 = new examples.R((java.lang.Integer) 4, "");
        examples.R r5 = new examples.R((java.lang.Integer) (-6), "hi!");
        boolean boolean6 = r2.equals((java.lang.Object) r5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean22 = r20.equals((java.lang.Object) 6);
        examples.R r25 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r28 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean30 = r28.equals((java.lang.Object) 6);
        examples.R r33 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r36 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray37 = new examples.R[] { r36 };
        java.util.ArrayList<examples.R> rList38 = new java.util.ArrayList<examples.R>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList38, rArray37);
        examples.S s42 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean44 = s42.equals((java.lang.Object) (-8));
        examples.S s47 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray48 = new examples.S[] { s42, s47 };
        java.util.ArrayList<examples.S> sList49 = new java.util.ArrayList<examples.S>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList49, sArray48);
        examples.ListComp02 listComp02_51 = new examples.ListComp02(rList38, sList49);
        examples.R r54 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_51.insert_r(r54);
        java.lang.String str56 = r54.getB();
        examples.R r59 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean61 = r59.equals((java.lang.Object) 6);
        examples.R[] rArray62 = new examples.R[] { r20, r25, r28, r33, r54, r59 };
        java.util.ArrayList<examples.R> rList63 = new java.util.ArrayList<examples.R>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList63, rArray62);
        examples.R r67 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray68 = new examples.R[] { r67 };
        java.util.ArrayList<examples.R> rList69 = new java.util.ArrayList<examples.R>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList69, rArray68);
        examples.S s73 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean75 = s73.equals((java.lang.Object) (-8));
        examples.S s78 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray79 = new examples.S[] { s73, s78 };
        java.util.ArrayList<examples.S> sList80 = new java.util.ArrayList<examples.S>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList80, sArray79);
        examples.ListComp02 listComp02_82 = new examples.ListComp02(rList69, sList80);
        examples.ListComp02 listComp02_83 = new examples.ListComp02(rList63, sList80);
        examples.ListComp02 listComp02_84 = new examples.ListComp02(rList4, sList80);
        examples.R r87 = new examples.R((java.lang.Integer) (-10), "");
        listComp02_84.insert_r(r87);
        examples.R r91 = new examples.R((java.lang.Integer) 10685, "");
        listComp02_84.insert_r(r91);
        listComp02_84.clear();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(rArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(sArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(rArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(rArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(sArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        examples.R r2 = new examples.R((java.lang.Integer) 3, "hi!");
        examples.R r5 = new examples.R((java.lang.Integer) (-6), "");
        examples.R r8 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray9 = new examples.R[] { r8 };
        java.util.ArrayList<examples.R> rList10 = new java.util.ArrayList<examples.R>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList10, rArray9);
        examples.S s14 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean16 = s14.equals((java.lang.Object) (-8));
        examples.S s19 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray20 = new examples.S[] { s14, s19 };
        java.util.ArrayList<examples.S> sList21 = new java.util.ArrayList<examples.S>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList21, sArray20);
        examples.ListComp02 listComp02_23 = new examples.ListComp02(rList10, sList21);
        examples.S s26 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str27 = s26.getB();
        java.lang.String str28 = s26.getB();
        listComp02_23.insert_s(s26);
        boolean boolean30 = r5.equals((java.lang.Object) listComp02_23);
        listComp02_23.clear();
        boolean boolean32 = r2.equals((java.lang.Object) listComp02_23);
        org.junit.Assert.assertNotNull(rArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(sArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.R r8 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean10 = r8.equals((java.lang.Object) 6);
        examples.R r13 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r16 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean18 = r16.equals((java.lang.Object) 6);
        examples.R r21 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r24 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray25 = new examples.R[] { r24 };
        java.util.ArrayList<examples.R> rList26 = new java.util.ArrayList<examples.R>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList26, rArray25);
        examples.S s30 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean32 = s30.equals((java.lang.Object) (-8));
        examples.S s35 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray36 = new examples.S[] { s30, s35 };
        java.util.ArrayList<examples.S> sList37 = new java.util.ArrayList<examples.S>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList37, sArray36);
        examples.ListComp02 listComp02_39 = new examples.ListComp02(rList26, sList37);
        examples.R r42 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_39.insert_r(r42);
        java.lang.String str44 = r42.getB();
        examples.R r47 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean49 = r47.equals((java.lang.Object) 6);
        examples.R[] rArray50 = new examples.R[] { r8, r13, r16, r21, r42, r47 };
        java.util.ArrayList<examples.R> rList51 = new java.util.ArrayList<examples.R>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList51, rArray50);
        examples.R r55 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray56 = new examples.R[] { r55 };
        java.util.ArrayList<examples.R> rList57 = new java.util.ArrayList<examples.R>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList57, rArray56);
        examples.S s61 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean63 = s61.equals((java.lang.Object) (-8));
        examples.S s66 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray67 = new examples.S[] { s61, s66 };
        java.util.ArrayList<examples.S> sList68 = new java.util.ArrayList<examples.S>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList68, sArray67);
        examples.ListComp02 listComp02_70 = new examples.ListComp02(rList57, sList68);
        examples.ListComp02 listComp02_71 = new examples.ListComp02(rList51, sList68);
        examples.ListComp02 listComp02_72 = new examples.ListComp02(rList4, sList68);
        examples.S s75 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean77 = s75.equals((java.lang.Object) (-8));
        listComp02_72.insert_s(s75);
        java.lang.String str79 = s75.getB();
        java.lang.String str80 = s75.getB();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(sArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(rArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(rArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(sArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        examples.R r2 = new examples.R((java.lang.Integer) (-100), "hi!");
        examples.S s5 = new examples.S("hi!", (java.lang.Integer) (-8));
        boolean boolean6 = r2.equals((java.lang.Object) s5);
        java.lang.String str7 = r2.getB();
        examples.R r10 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray11 = new examples.R[] { r10 };
        java.util.ArrayList<examples.R> rList12 = new java.util.ArrayList<examples.R>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList12, rArray11);
        examples.S s16 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean18 = s16.equals((java.lang.Object) (-8));
        examples.S s21 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray22 = new examples.S[] { s16, s21 };
        java.util.ArrayList<examples.S> sList23 = new java.util.ArrayList<examples.S>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList23, sArray22);
        examples.ListComp02 listComp02_25 = new examples.ListComp02(rList12, sList23);
        examples.R r28 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray29 = new examples.R[] { r28 };
        java.util.ArrayList<examples.R> rList30 = new java.util.ArrayList<examples.R>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList30, rArray29);
        examples.S s34 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean36 = s34.equals((java.lang.Object) (-8));
        examples.S s39 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray40 = new examples.S[] { s34, s39 };
        java.util.ArrayList<examples.S> sList41 = new java.util.ArrayList<examples.S>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList41, sArray40);
        examples.ListComp02 listComp02_43 = new examples.ListComp02(rList30, sList41);
        examples.R r46 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray47 = new examples.R[] { r46 };
        java.util.ArrayList<examples.R> rList48 = new java.util.ArrayList<examples.R>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList48, rArray47);
        examples.S s52 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean54 = s52.equals((java.lang.Object) (-8));
        examples.S s57 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray58 = new examples.S[] { s52, s57 };
        java.util.ArrayList<examples.S> sList59 = new java.util.ArrayList<examples.S>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList59, sArray58);
        examples.ListComp02 listComp02_61 = new examples.ListComp02(rList48, sList59);
        examples.ListComp02 listComp02_62 = new examples.ListComp02(rList30, sList59);
        examples.R r65 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray66 = new examples.R[] { r65 };
        java.util.ArrayList<examples.R> rList67 = new java.util.ArrayList<examples.R>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList67, rArray66);
        examples.S s71 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean73 = s71.equals((java.lang.Object) (-8));
        examples.S s76 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray77 = new examples.S[] { s71, s76 };
        java.util.ArrayList<examples.S> sList78 = new java.util.ArrayList<examples.S>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList78, sArray77);
        examples.ListComp02 listComp02_80 = new examples.ListComp02(rList67, sList78);
        examples.ListComp02 listComp02_81 = new examples.ListComp02(rList30, sList78);
        examples.ListComp02 listComp02_82 = new examples.ListComp02(rList12, sList78);
        listComp02_82.clear();
        listComp02_82.clear();
        boolean boolean85 = r2.equals((java.lang.Object) listComp02_82);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(rArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(sArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(rArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(sArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(rArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(sArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(rArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(sArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        examples.S s2 = new examples.S("", (java.lang.Integer) 36);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        examples.R r2 = new examples.R((java.lang.Integer) 98, "hi!");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        examples.R r2 = new examples.R((java.lang.Integer) 63, "");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) 36);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        examples.R r2 = new examples.R((java.lang.Integer) (-8), "");
        examples.S s5 = new examples.S("hi!", (java.lang.Integer) 7);
        boolean boolean7 = s5.equals((java.lang.Object) ' ');
        java.lang.String str8 = s5.getB();
        java.lang.String str9 = s5.getB();
        examples.R r12 = new examples.R((java.lang.Integer) (-6), "");
        examples.R r15 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray16 = new examples.R[] { r15 };
        java.util.ArrayList<examples.R> rList17 = new java.util.ArrayList<examples.R>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList17, rArray16);
        examples.S s21 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean23 = s21.equals((java.lang.Object) (-8));
        examples.S s26 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray27 = new examples.S[] { s21, s26 };
        java.util.ArrayList<examples.S> sList28 = new java.util.ArrayList<examples.S>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList28, sArray27);
        examples.ListComp02 listComp02_30 = new examples.ListComp02(rList17, sList28);
        examples.S s33 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str34 = s33.getB();
        java.lang.String str35 = s33.getB();
        listComp02_30.insert_s(s33);
        boolean boolean37 = r12.equals((java.lang.Object) listComp02_30);
        listComp02_30.clear();
        examples.S s41 = new examples.S("hi!", (java.lang.Integer) 2);
        listComp02_30.insert_s(s41);
        boolean boolean43 = s5.equals((java.lang.Object) listComp02_30);
        java.lang.Class<?> wildcardClass44 = listComp02_30.getClass();
        boolean boolean45 = r2.equals((java.lang.Object) listComp02_30);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(rArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(sArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        examples.R r2 = new examples.R((java.lang.Integer) (-1600), "hi!");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean4 = r2.equals((java.lang.Object) 6);
        java.lang.Object obj5 = null;
        boolean boolean6 = r2.equals(obj5);
        examples.R r9 = new examples.R((java.lang.Integer) 1, "hi!");
        java.lang.String str10 = r9.getB();
        boolean boolean11 = r2.equals((java.lang.Object) r9);
        boolean boolean13 = r2.equals((java.lang.Object) (-8));
        java.lang.String str14 = r2.getB();
        java.lang.String str15 = r2.getB();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        examples.S s2 = new examples.S("", (java.lang.Integer) 63);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean22 = r20.equals((java.lang.Object) 6);
        examples.R r25 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r28 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean30 = r28.equals((java.lang.Object) 6);
        examples.R r33 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r36 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray37 = new examples.R[] { r36 };
        java.util.ArrayList<examples.R> rList38 = new java.util.ArrayList<examples.R>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList38, rArray37);
        examples.S s42 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean44 = s42.equals((java.lang.Object) (-8));
        examples.S s47 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray48 = new examples.S[] { s42, s47 };
        java.util.ArrayList<examples.S> sList49 = new java.util.ArrayList<examples.S>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList49, sArray48);
        examples.ListComp02 listComp02_51 = new examples.ListComp02(rList38, sList49);
        examples.R r54 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_51.insert_r(r54);
        java.lang.String str56 = r54.getB();
        examples.R r59 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean61 = r59.equals((java.lang.Object) 6);
        examples.R[] rArray62 = new examples.R[] { r20, r25, r28, r33, r54, r59 };
        java.util.ArrayList<examples.R> rList63 = new java.util.ArrayList<examples.R>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList63, rArray62);
        examples.R r67 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray68 = new examples.R[] { r67 };
        java.util.ArrayList<examples.R> rList69 = new java.util.ArrayList<examples.R>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList69, rArray68);
        examples.S s73 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean75 = s73.equals((java.lang.Object) (-8));
        examples.S s78 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray79 = new examples.S[] { s73, s78 };
        java.util.ArrayList<examples.S> sList80 = new java.util.ArrayList<examples.S>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList80, sArray79);
        examples.ListComp02 listComp02_82 = new examples.ListComp02(rList69, sList80);
        examples.ListComp02 listComp02_83 = new examples.ListComp02(rList63, sList80);
        examples.ListComp02 listComp02_84 = new examples.ListComp02(rList4, sList80);
        examples.R r87 = new examples.R((java.lang.Integer) (-10), "");
        listComp02_84.insert_r(r87);
        examples.R r91 = new examples.R((java.lang.Integer) 100, "hi!");
        listComp02_84.insert_r(r91);
        listComp02_84.clear();
        listComp02_84.clear();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(rArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(sArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(rArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(rArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(sArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) 16);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) 600);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        java.util.ArrayList<examples.R> rList0 = null;
        examples.R r3 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray4 = new examples.R[] { r3 };
        java.util.ArrayList<examples.R> rList5 = new java.util.ArrayList<examples.R>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList5, rArray4);
        examples.S s9 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean11 = s9.equals((java.lang.Object) (-8));
        examples.S s14 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray15 = new examples.S[] { s9, s14 };
        java.util.ArrayList<examples.S> sList16 = new java.util.ArrayList<examples.S>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList16, sArray15);
        examples.ListComp02 listComp02_18 = new examples.ListComp02(rList5, sList16);
        examples.R r21 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean23 = r21.equals((java.lang.Object) 6);
        examples.R r26 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r29 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean31 = r29.equals((java.lang.Object) 6);
        examples.R r34 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r37 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray38 = new examples.R[] { r37 };
        java.util.ArrayList<examples.R> rList39 = new java.util.ArrayList<examples.R>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList39, rArray38);
        examples.S s43 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean45 = s43.equals((java.lang.Object) (-8));
        examples.S s48 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray49 = new examples.S[] { s43, s48 };
        java.util.ArrayList<examples.S> sList50 = new java.util.ArrayList<examples.S>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList50, sArray49);
        examples.ListComp02 listComp02_52 = new examples.ListComp02(rList39, sList50);
        examples.R r55 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_52.insert_r(r55);
        java.lang.String str57 = r55.getB();
        examples.R r60 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean62 = r60.equals((java.lang.Object) 6);
        examples.R[] rArray63 = new examples.R[] { r21, r26, r29, r34, r55, r60 };
        java.util.ArrayList<examples.R> rList64 = new java.util.ArrayList<examples.R>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList64, rArray63);
        examples.R r68 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray69 = new examples.R[] { r68 };
        java.util.ArrayList<examples.R> rList70 = new java.util.ArrayList<examples.R>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList70, rArray69);
        examples.S s74 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean76 = s74.equals((java.lang.Object) (-8));
        examples.S s79 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray80 = new examples.S[] { s74, s79 };
        java.util.ArrayList<examples.S> sList81 = new java.util.ArrayList<examples.S>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList81, sArray80);
        examples.ListComp02 listComp02_83 = new examples.ListComp02(rList70, sList81);
        examples.ListComp02 listComp02_84 = new examples.ListComp02(rList64, sList81);
        examples.ListComp02 listComp02_85 = new examples.ListComp02(rList5, sList81);
        examples.ListComp02 listComp02_86 = new examples.ListComp02(rList0, sList81);
        org.junit.Assert.assertNotNull(rArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(sArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(rArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(sArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(rArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(rArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(sArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_17.insert_r(r20);
        examples.S s24 = new examples.S("hi!", (java.lang.Integer) (-3));
        java.lang.String str25 = s24.getB();
        listComp02_17.insert_s(s24);
        java.lang.String str27 = s24.getB();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        examples.R r2 = new examples.R((java.lang.Integer) 36, "");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) (-16));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_17.insert_r(r20);
        examples.S s24 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str25 = s24.getB();
        examples.S s28 = new examples.S("", (java.lang.Integer) 0);
        java.lang.String str29 = s28.getB();
        boolean boolean31 = s28.equals((java.lang.Object) 10.0d);
        boolean boolean33 = s28.equals((java.lang.Object) (-2.1d));
        boolean boolean34 = s24.equals((java.lang.Object) boolean33);
        java.lang.String str35 = s24.getB();
        listComp02_17.insert_s(s24);
        examples.R r39 = new examples.R((java.lang.Integer) (-9), "");
        listComp02_17.insert_r(r39);
        examples.S s43 = new examples.S("", (java.lang.Integer) (-40));
        listComp02_17.insert_s(s43);
        java.lang.String str45 = s43.getB();
        java.lang.String str46 = s43.getB();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) 63);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        examples.S s2 = new examples.S("", (java.lang.Integer) 7);
        java.lang.String str3 = s2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        examples.R r2 = new examples.R((java.lang.Integer) 16, "hi!");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_17.insert_r(r20);
        listComp02_17.clear();
        listComp02_17.clear();
        examples.S s26 = new examples.S("", (java.lang.Integer) 0);
        listComp02_17.insert_s(s26);
        listComp02_17.clear();
        listComp02_17.clear();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray21 = new examples.R[] { r20 };
        java.util.ArrayList<examples.R> rList22 = new java.util.ArrayList<examples.R>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList22, rArray21);
        examples.S s26 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean28 = s26.equals((java.lang.Object) (-8));
        examples.S s31 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray32 = new examples.S[] { s26, s31 };
        java.util.ArrayList<examples.S> sList33 = new java.util.ArrayList<examples.S>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList33, sArray32);
        examples.ListComp02 listComp02_35 = new examples.ListComp02(rList22, sList33);
        examples.R r38 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray39 = new examples.R[] { r38 };
        java.util.ArrayList<examples.R> rList40 = new java.util.ArrayList<examples.R>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList40, rArray39);
        examples.S s44 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean46 = s44.equals((java.lang.Object) (-8));
        examples.S s49 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray50 = new examples.S[] { s44, s49 };
        java.util.ArrayList<examples.S> sList51 = new java.util.ArrayList<examples.S>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList51, sArray50);
        examples.ListComp02 listComp02_53 = new examples.ListComp02(rList40, sList51);
        examples.ListComp02 listComp02_54 = new examples.ListComp02(rList22, sList51);
        examples.R r57 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray58 = new examples.R[] { r57 };
        java.util.ArrayList<examples.R> rList59 = new java.util.ArrayList<examples.R>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList59, rArray58);
        examples.S s63 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean65 = s63.equals((java.lang.Object) (-8));
        examples.S s68 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray69 = new examples.S[] { s63, s68 };
        java.util.ArrayList<examples.S> sList70 = new java.util.ArrayList<examples.S>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList70, sArray69);
        examples.ListComp02 listComp02_72 = new examples.ListComp02(rList59, sList70);
        examples.ListComp02 listComp02_73 = new examples.ListComp02(rList22, sList70);
        examples.ListComp02 listComp02_74 = new examples.ListComp02(rList4, sList70);
        examples.S s77 = new examples.S("hi!", (java.lang.Integer) 7);
        examples.S s80 = new examples.S("", (java.lang.Integer) (-2));
        boolean boolean81 = s77.equals((java.lang.Object) s80);
        listComp02_74.insert_s(s77);
        examples.S s85 = new examples.S("", (java.lang.Integer) 20000);
        java.lang.String str86 = s85.getB();
        listComp02_74.insert_s(s85);
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(rArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(sArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(rArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(sArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(rArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(sArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        examples.R r2 = new examples.R((java.lang.Integer) (-4), "hi!");
        java.lang.String str3 = r2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) (-12));
        java.lang.Class<?> wildcardClass3 = s2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) (-40));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) (-10));
        java.lang.String str3 = s2.getB();
        java.lang.String str4 = s2.getB();
        java.lang.Class<?> wildcardClass5 = s2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        java.lang.Object obj3 = null;
        boolean boolean4 = r2.equals(obj3);
        examples.R r7 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray8 = new examples.R[] { r7 };
        java.util.ArrayList<examples.R> rList9 = new java.util.ArrayList<examples.R>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList9, rArray8);
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean15 = s13.equals((java.lang.Object) (-8));
        examples.S s18 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray19 = new examples.S[] { s13, s18 };
        java.util.ArrayList<examples.S> sList20 = new java.util.ArrayList<examples.S>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList20, sArray19);
        examples.ListComp02 listComp02_22 = new examples.ListComp02(rList9, sList20);
        examples.R r25 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean27 = r25.equals((java.lang.Object) 6);
        examples.R r30 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r33 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean35 = r33.equals((java.lang.Object) 6);
        examples.R r38 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r41 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray42 = new examples.R[] { r41 };
        java.util.ArrayList<examples.R> rList43 = new java.util.ArrayList<examples.R>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList43, rArray42);
        examples.S s47 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean49 = s47.equals((java.lang.Object) (-8));
        examples.S s52 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray53 = new examples.S[] { s47, s52 };
        java.util.ArrayList<examples.S> sList54 = new java.util.ArrayList<examples.S>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList54, sArray53);
        examples.ListComp02 listComp02_56 = new examples.ListComp02(rList43, sList54);
        examples.R r59 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_56.insert_r(r59);
        java.lang.String str61 = r59.getB();
        examples.R r64 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean66 = r64.equals((java.lang.Object) 6);
        examples.R[] rArray67 = new examples.R[] { r25, r30, r33, r38, r59, r64 };
        java.util.ArrayList<examples.R> rList68 = new java.util.ArrayList<examples.R>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList68, rArray67);
        examples.R r72 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray73 = new examples.R[] { r72 };
        java.util.ArrayList<examples.R> rList74 = new java.util.ArrayList<examples.R>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList74, rArray73);
        examples.S s78 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean80 = s78.equals((java.lang.Object) (-8));
        examples.S s83 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray84 = new examples.S[] { s78, s83 };
        java.util.ArrayList<examples.S> sList85 = new java.util.ArrayList<examples.S>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList85, sArray84);
        examples.ListComp02 listComp02_87 = new examples.ListComp02(rList74, sList85);
        examples.ListComp02 listComp02_88 = new examples.ListComp02(rList68, sList85);
        examples.ListComp02 listComp02_89 = new examples.ListComp02(rList9, sList85);
        listComp02_89.clear();
        boolean boolean91 = r2.equals((java.lang.Object) listComp02_89);
        examples.S s94 = new examples.S("hi!", (java.lang.Integer) (-3));
        java.lang.Class<?> wildcardClass95 = s94.getClass();
        boolean boolean96 = r2.equals((java.lang.Object) wildcardClass95);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(sArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(rArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(sArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(rArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(rArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(sArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(wildcardClass95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        listComp02_17.clear();
        examples.S s21 = new examples.S("hi!", (java.lang.Integer) (-2));
        listComp02_17.insert_s(s21);
        examples.R r25 = new examples.R((java.lang.Integer) 8, "hi!");
        listComp02_17.insert_r(r25);
        examples.R r29 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean31 = r29.equals((java.lang.Object) 6);
        java.lang.Object obj32 = null;
        boolean boolean33 = r29.equals(obj32);
        java.lang.String str34 = r29.getB();
        java.lang.String str35 = r29.getB();
        listComp02_17.insert_r(r29);
        listComp02_17.clear();
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        examples.S s2 = new examples.S("", (java.lang.Integer) (-4));
        java.lang.String str3 = s2.getB();
        java.lang.String str4 = s2.getB();
        java.lang.String str5 = s2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        examples.R r2 = new examples.R((java.lang.Integer) (-5), "");
        java.lang.String str3 = r2.getB();
        java.lang.String str4 = r2.getB();
        java.lang.String str5 = r2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        examples.R r2 = new examples.R((java.lang.Integer) 7, "");
        java.lang.String str3 = r2.getB();
        examples.S s6 = new examples.S("hi!", (java.lang.Integer) 7);
        examples.S s9 = new examples.S("", (java.lang.Integer) (-2));
        boolean boolean10 = s6.equals((java.lang.Object) s9);
        boolean boolean11 = r2.equals((java.lang.Object) s6);
        java.lang.Class<?> wildcardClass12 = s6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        examples.S s2 = new examples.S("", (java.lang.Integer) 10);
        boolean boolean4 = s2.equals((java.lang.Object) 9.6d);
        examples.R r7 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray8 = new examples.R[] { r7 };
        java.util.ArrayList<examples.R> rList9 = new java.util.ArrayList<examples.R>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList9, rArray8);
        examples.R r13 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean15 = r13.equals((java.lang.Object) 6);
        examples.R r18 = new examples.R((java.lang.Integer) (-9), "hi!");
        examples.R r21 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean23 = r21.equals((java.lang.Object) 6);
        examples.R r26 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R r29 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray30 = new examples.R[] { r29 };
        java.util.ArrayList<examples.R> rList31 = new java.util.ArrayList<examples.R>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList31, rArray30);
        examples.S s35 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean37 = s35.equals((java.lang.Object) (-8));
        examples.S s40 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray41 = new examples.S[] { s35, s40 };
        java.util.ArrayList<examples.S> sList42 = new java.util.ArrayList<examples.S>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList42, sArray41);
        examples.ListComp02 listComp02_44 = new examples.ListComp02(rList31, sList42);
        examples.R r47 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_44.insert_r(r47);
        java.lang.String str49 = r47.getB();
        examples.R r52 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean54 = r52.equals((java.lang.Object) 6);
        examples.R[] rArray55 = new examples.R[] { r13, r18, r21, r26, r47, r52 };
        java.util.ArrayList<examples.R> rList56 = new java.util.ArrayList<examples.R>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList56, rArray55);
        examples.R r60 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray61 = new examples.R[] { r60 };
        java.util.ArrayList<examples.R> rList62 = new java.util.ArrayList<examples.R>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList62, rArray61);
        examples.S s66 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean68 = s66.equals((java.lang.Object) (-8));
        examples.S s71 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray72 = new examples.S[] { s66, s71 };
        java.util.ArrayList<examples.S> sList73 = new java.util.ArrayList<examples.S>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList73, sArray72);
        examples.ListComp02 listComp02_75 = new examples.ListComp02(rList62, sList73);
        examples.ListComp02 listComp02_76 = new examples.ListComp02(rList56, sList73);
        examples.ListComp02 listComp02_77 = new examples.ListComp02(rList9, sList73);
        examples.S s80 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean82 = s80.equals((java.lang.Object) (-8));
        listComp02_77.insert_s(s80);
        examples.S s86 = new examples.S("hi!", (java.lang.Integer) (-10));
        listComp02_77.insert_s(s86);
        boolean boolean88 = s2.equals((java.lang.Object) s86);
        java.lang.String str89 = s2.getB();
        java.lang.String str90 = s2.getB();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(rArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(sArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(rArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(rArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(sArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        examples.S s2 = new examples.S("hi!", (java.lang.Integer) (-20000));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        examples.R r2 = new examples.R((java.lang.Integer) (-1), "hi!");
        examples.R[] rArray3 = new examples.R[] { r2 };
        java.util.ArrayList<examples.R> rList4 = new java.util.ArrayList<examples.R>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList4, rArray3);
        examples.S s8 = new examples.S("", (java.lang.Integer) 0);
        boolean boolean10 = s8.equals((java.lang.Object) (-8));
        examples.S s13 = new examples.S("", (java.lang.Integer) 0);
        examples.S[] sArray14 = new examples.S[] { s8, s13 };
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList4, sList15);
        examples.R r20 = new examples.R((java.lang.Integer) (-1), "hi!");
        listComp02_17.insert_r(r20);
        examples.S s24 = new examples.S("hi!", (java.lang.Integer) (-3));
        java.lang.String str25 = s24.getB();
        listComp02_17.insert_s(s24);
        examples.R r29 = new examples.R((java.lang.Integer) (-1), "hi!");
        boolean boolean31 = r29.equals((java.lang.Object) 6);
        java.lang.Object obj32 = null;
        boolean boolean33 = r29.equals(obj32);
        boolean boolean35 = r29.equals((java.lang.Object) 'a');
        listComp02_17.insert_r(r29);
        org.junit.Assert.assertNotNull(rArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        examples.R r2 = new examples.R((java.lang.Integer) (-1600), "");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        examples.R r2 = new examples.R((java.lang.Integer) 4, "hi!");
        java.lang.String str3 = r2.getB();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }
}

