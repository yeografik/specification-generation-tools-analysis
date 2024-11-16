package org.apache.commons.math3.util;

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
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException5 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException4);
        java.lang.IllegalArgumentException illegalArgumentException6 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException5);
        java.lang.IllegalArgumentException illegalArgumentException7 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException5);
        java.lang.IllegalArgumentException illegalArgumentException8 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: ", (java.lang.Throwable) illegalArgumentException5);
        java.lang.IllegalArgumentException illegalArgumentException9 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: ", (java.lang.Throwable) illegalArgumentException5);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        java.lang.IllegalArgumentException illegalArgumentException1 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException2 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException1);
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException5 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException4);
        illegalArgumentException2.addSuppressed((java.lang.Throwable) illegalArgumentException5);
        java.lang.IllegalArgumentException illegalArgumentException7 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException2);
        java.lang.String str8 = illegalArgumentException2.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.IllegalArgumentException: hi!" + "'", str8, "java.lang.IllegalArgumentException: hi!");
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        java.lang.IllegalArgumentException illegalArgumentException2 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException3 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException3);
        illegalArgumentException2.addSuppressed((java.lang.Throwable) illegalArgumentException3);
        java.lang.IllegalArgumentException illegalArgumentException10 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException11 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException10);
        java.lang.IllegalArgumentException illegalArgumentException12 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException10);
        java.lang.IllegalArgumentException illegalArgumentException13 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException10);
        java.lang.IllegalArgumentException illegalArgumentException14 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException10);
        illegalArgumentException3.addSuppressed((java.lang.Throwable) illegalArgumentException14);
        java.lang.IllegalArgumentException illegalArgumentException16 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: ", (java.lang.Throwable) illegalArgumentException3);
        java.lang.IllegalArgumentException illegalArgumentException19 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException20 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException19);
        java.lang.IllegalArgumentException illegalArgumentException21 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException19);
        java.lang.IllegalArgumentException illegalArgumentException23 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException24 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException23);
        java.lang.IllegalArgumentException illegalArgumentException25 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException23);
        illegalArgumentException19.addSuppressed((java.lang.Throwable) illegalArgumentException25);
        java.lang.IllegalArgumentException illegalArgumentException27 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException25);
        illegalArgumentException16.addSuppressed((java.lang.Throwable) illegalArgumentException25);
        java.lang.IllegalArgumentException illegalArgumentException32 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException33 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException34 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException33);
        illegalArgumentException32.addSuppressed((java.lang.Throwable) illegalArgumentException33);
        java.lang.IllegalArgumentException illegalArgumentException36 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException33);
        java.lang.IllegalArgumentException illegalArgumentException37 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException36);
        java.lang.IllegalArgumentException illegalArgumentException38 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException36);
        java.lang.IllegalArgumentException illegalArgumentException40 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException41 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException42 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException41);
        illegalArgumentException40.addSuppressed((java.lang.Throwable) illegalArgumentException41);
        java.lang.IllegalArgumentException illegalArgumentException48 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException49 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException48);
        java.lang.IllegalArgumentException illegalArgumentException50 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException48);
        java.lang.IllegalArgumentException illegalArgumentException51 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException48);
        java.lang.IllegalArgumentException illegalArgumentException52 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException48);
        illegalArgumentException41.addSuppressed((java.lang.Throwable) illegalArgumentException52);
        java.lang.IllegalArgumentException illegalArgumentException56 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException57 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException56);
        java.lang.IllegalArgumentException illegalArgumentException58 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException56);
        illegalArgumentException41.addSuppressed((java.lang.Throwable) illegalArgumentException58);
        java.lang.Throwable[] throwableArray60 = illegalArgumentException58.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException61 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException58);
        illegalArgumentException38.addSuppressed((java.lang.Throwable) illegalArgumentException58);
        java.lang.IllegalArgumentException illegalArgumentException63 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException58);
        illegalArgumentException25.addSuppressed((java.lang.Throwable) illegalArgumentException58);
        java.lang.IllegalArgumentException illegalArgumentException71 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException72 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException71);
        java.lang.IllegalArgumentException illegalArgumentException73 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException71);
        java.lang.IllegalArgumentException illegalArgumentException74 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException71);
        java.lang.IllegalArgumentException illegalArgumentException75 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException71);
        java.lang.Throwable[] throwableArray76 = illegalArgumentException71.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException77 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException71);
        java.lang.IllegalArgumentException illegalArgumentException78 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException71);
        java.lang.IllegalArgumentException illegalArgumentException79 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException71);
        java.lang.IllegalArgumentException illegalArgumentException80 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException71);
        illegalArgumentException25.addSuppressed((java.lang.Throwable) illegalArgumentException80);
        java.lang.Throwable[] throwableArray82 = illegalArgumentException80.getSuppressed();
        java.lang.String str83 = illegalArgumentException80.toString();
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray76);
        org.junit.Assert.assertNotNull(throwableArray82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "java.lang.IllegalArgumentException: java.lang.IllegalArgumentException" + "'", str83, "java.lang.IllegalArgumentException: java.lang.IllegalArgumentException");
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException5 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException6 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException5);
        illegalArgumentException4.addSuppressed((java.lang.Throwable) illegalArgumentException5);
        java.lang.IllegalArgumentException illegalArgumentException8 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException5);
        java.lang.IllegalArgumentException illegalArgumentException9 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException8);
        java.lang.IllegalArgumentException illegalArgumentException10 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException9);
        java.lang.Throwable[] throwableArray11 = illegalArgumentException10.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException14 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException15 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException14);
        java.lang.IllegalArgumentException illegalArgumentException17 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!");
        illegalArgumentException15.addSuppressed((java.lang.Throwable) illegalArgumentException17);
        java.lang.IllegalArgumentException illegalArgumentException19 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException17);
        illegalArgumentException10.addSuppressed((java.lang.Throwable) illegalArgumentException17);
        java.lang.IllegalArgumentException illegalArgumentException24 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException25 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException24);
        java.lang.IllegalArgumentException illegalArgumentException26 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException24);
        java.lang.IllegalArgumentException illegalArgumentException27 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException24);
        java.lang.IllegalArgumentException illegalArgumentException30 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException31 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException30);
        java.lang.IllegalArgumentException illegalArgumentException32 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException", (java.lang.Throwable) illegalArgumentException31);
        illegalArgumentException24.addSuppressed((java.lang.Throwable) illegalArgumentException31);
        java.lang.IllegalArgumentException illegalArgumentException35 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException36 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException37 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException36);
        illegalArgumentException35.addSuppressed((java.lang.Throwable) illegalArgumentException36);
        java.lang.IllegalArgumentException illegalArgumentException39 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException35);
        java.lang.IllegalArgumentException illegalArgumentException41 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException42 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException43 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException42);
        illegalArgumentException41.addSuppressed((java.lang.Throwable) illegalArgumentException42);
        java.lang.IllegalArgumentException illegalArgumentException45 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException41);
        illegalArgumentException35.addSuppressed((java.lang.Throwable) illegalArgumentException45);
        illegalArgumentException31.addSuppressed((java.lang.Throwable) illegalArgumentException45);
        illegalArgumentException10.addSuppressed((java.lang.Throwable) illegalArgumentException31);
        java.lang.IllegalArgumentException illegalArgumentException49 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: ", (java.lang.Throwable) illegalArgumentException31);
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        java.lang.IllegalArgumentException illegalArgumentException3 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException3);
        java.lang.IllegalArgumentException illegalArgumentException5 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException3);
        java.lang.IllegalArgumentException illegalArgumentException6 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException3);
        java.lang.Throwable[] throwableArray7 = illegalArgumentException6.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException9 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!");
        java.lang.IllegalArgumentException illegalArgumentException14 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException15 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException14);
        java.lang.IllegalArgumentException illegalArgumentException16 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException14);
        java.lang.IllegalArgumentException illegalArgumentException17 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException14);
        java.lang.IllegalArgumentException illegalArgumentException18 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException14);
        java.lang.Throwable[] throwableArray19 = illegalArgumentException18.getSuppressed();
        illegalArgumentException9.addSuppressed((java.lang.Throwable) illegalArgumentException18);
        illegalArgumentException6.addSuppressed((java.lang.Throwable) illegalArgumentException18);
        java.lang.IllegalArgumentException illegalArgumentException24 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!");
        java.lang.IllegalArgumentException illegalArgumentException25 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException24);
        java.lang.IllegalArgumentException illegalArgumentException26 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException24);
        illegalArgumentException18.addSuppressed((java.lang.Throwable) illegalArgumentException24);
        java.lang.Throwable[] throwableArray28 = illegalArgumentException24.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray28);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        java.lang.IllegalArgumentException illegalArgumentException2 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException3 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException2);
        java.lang.IllegalArgumentException illegalArgumentException5 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException6 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException7 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException6);
        illegalArgumentException5.addSuppressed((java.lang.Throwable) illegalArgumentException6);
        java.lang.IllegalArgumentException illegalArgumentException13 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException14 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException13);
        java.lang.IllegalArgumentException illegalArgumentException15 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException13);
        java.lang.IllegalArgumentException illegalArgumentException16 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException13);
        java.lang.IllegalArgumentException illegalArgumentException17 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException13);
        illegalArgumentException6.addSuppressed((java.lang.Throwable) illegalArgumentException17);
        illegalArgumentException3.addSuppressed((java.lang.Throwable) illegalArgumentException17);
        java.lang.IllegalArgumentException illegalArgumentException23 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException24 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException25 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException24);
        illegalArgumentException23.addSuppressed((java.lang.Throwable) illegalArgumentException24);
        java.lang.IllegalArgumentException illegalArgumentException27 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException24);
        java.lang.IllegalArgumentException illegalArgumentException28 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException27);
        java.lang.IllegalArgumentException illegalArgumentException29 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException27);
        java.lang.IllegalArgumentException illegalArgumentException30 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException29);
        java.lang.Throwable[] throwableArray31 = illegalArgumentException30.getSuppressed();
        illegalArgumentException3.addSuppressed((java.lang.Throwable) illegalArgumentException30);
        java.lang.IllegalArgumentException illegalArgumentException33 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: ", (java.lang.Throwable) illegalArgumentException30);
        java.lang.Throwable[] throwableArray34 = illegalArgumentException33.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray34);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        java.lang.IllegalArgumentException illegalArgumentException6 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException7 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException6);
        java.lang.IllegalArgumentException illegalArgumentException8 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException6);
        java.lang.IllegalArgumentException illegalArgumentException9 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException6);
        java.lang.IllegalArgumentException illegalArgumentException10 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException6);
        java.lang.IllegalArgumentException illegalArgumentException11 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException10);
        java.lang.IllegalArgumentException illegalArgumentException12 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException10);
        java.lang.IllegalArgumentException illegalArgumentException13 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException14 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException13);
        java.lang.IllegalArgumentException illegalArgumentException18 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException19 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException18);
        java.lang.IllegalArgumentException illegalArgumentException20 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException18);
        java.lang.IllegalArgumentException illegalArgumentException21 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException18);
        java.lang.Throwable[] throwableArray22 = illegalArgumentException21.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException25 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException26 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException25);
        java.lang.IllegalArgumentException illegalArgumentException27 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException", (java.lang.Throwable) illegalArgumentException26);
        illegalArgumentException21.addSuppressed((java.lang.Throwable) illegalArgumentException26);
        java.lang.IllegalArgumentException illegalArgumentException29 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException21);
        illegalArgumentException14.addSuppressed((java.lang.Throwable) illegalArgumentException21);
        java.lang.IllegalArgumentException illegalArgumentException31 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException21);
        illegalArgumentException12.addSuppressed((java.lang.Throwable) illegalArgumentException31);
        java.lang.IllegalArgumentException illegalArgumentException35 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException36 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException35);
        java.lang.IllegalArgumentException illegalArgumentException37 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException35);
        java.lang.IllegalArgumentException illegalArgumentException40 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException41 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException42 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException41);
        illegalArgumentException40.addSuppressed((java.lang.Throwable) illegalArgumentException41);
        java.lang.IllegalArgumentException illegalArgumentException44 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException41);
        java.lang.IllegalArgumentException illegalArgumentException45 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException44);
        java.lang.IllegalArgumentException illegalArgumentException49 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException50 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException49);
        java.lang.IllegalArgumentException illegalArgumentException51 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException49);
        java.lang.IllegalArgumentException illegalArgumentException52 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException49);
        java.lang.Throwable[] throwableArray53 = illegalArgumentException52.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException55 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!");
        java.lang.IllegalArgumentException illegalArgumentException60 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException61 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException60);
        java.lang.IllegalArgumentException illegalArgumentException62 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException60);
        java.lang.IllegalArgumentException illegalArgumentException63 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException60);
        java.lang.IllegalArgumentException illegalArgumentException64 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException60);
        java.lang.Throwable[] throwableArray65 = illegalArgumentException64.getSuppressed();
        illegalArgumentException55.addSuppressed((java.lang.Throwable) illegalArgumentException64);
        illegalArgumentException52.addSuppressed((java.lang.Throwable) illegalArgumentException64);
        java.lang.IllegalArgumentException illegalArgumentException69 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException70 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException69);
        java.lang.IllegalArgumentException illegalArgumentException71 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException70);
        illegalArgumentException52.addSuppressed((java.lang.Throwable) illegalArgumentException71);
        illegalArgumentException45.addSuppressed((java.lang.Throwable) illegalArgumentException52);
        illegalArgumentException37.addSuppressed((java.lang.Throwable) illegalArgumentException45);
        illegalArgumentException31.addSuppressed((java.lang.Throwable) illegalArgumentException45);
        java.lang.IllegalArgumentException illegalArgumentException76 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException45);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray65);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        java.lang.IllegalArgumentException illegalArgumentException8 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException9 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException8);
        java.lang.IllegalArgumentException illegalArgumentException10 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException8);
        java.lang.IllegalArgumentException illegalArgumentException11 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException8);
        java.lang.IllegalArgumentException illegalArgumentException12 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException8);
        java.lang.Throwable[] throwableArray13 = illegalArgumentException8.getSuppressed();
        java.lang.Throwable[] throwableArray14 = illegalArgumentException8.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException15 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException8);
        java.lang.IllegalArgumentException illegalArgumentException17 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException18 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException17);
        java.lang.Throwable[] throwableArray19 = illegalArgumentException18.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException21 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException22 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException21);
        illegalArgumentException18.addSuppressed((java.lang.Throwable) illegalArgumentException22);
        illegalArgumentException15.addSuppressed((java.lang.Throwable) illegalArgumentException18);
        java.lang.IllegalArgumentException illegalArgumentException25 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException15);
        java.lang.IllegalArgumentException illegalArgumentException26 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: ", (java.lang.Throwable) illegalArgumentException15);
        java.lang.IllegalArgumentException illegalArgumentException29 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException30 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException31 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException30);
        illegalArgumentException29.addSuppressed((java.lang.Throwable) illegalArgumentException30);
        java.lang.IllegalArgumentException illegalArgumentException37 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException38 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException37);
        java.lang.IllegalArgumentException illegalArgumentException39 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException37);
        java.lang.IllegalArgumentException illegalArgumentException40 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException37);
        java.lang.IllegalArgumentException illegalArgumentException41 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException37);
        illegalArgumentException30.addSuppressed((java.lang.Throwable) illegalArgumentException41);
        java.lang.IllegalArgumentException illegalArgumentException45 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException46 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException45);
        java.lang.IllegalArgumentException illegalArgumentException47 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException45);
        illegalArgumentException30.addSuppressed((java.lang.Throwable) illegalArgumentException47);
        java.lang.Throwable[] throwableArray49 = illegalArgumentException47.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException50 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException47);
        java.lang.IllegalArgumentException illegalArgumentException51 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException47);
        java.lang.Throwable[] throwableArray52 = illegalArgumentException51.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException53 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException51);
        illegalArgumentException15.addSuppressed((java.lang.Throwable) illegalArgumentException51);
        java.lang.Throwable throwable56 = null;
        java.lang.IllegalArgumentException illegalArgumentException57 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException", throwable56);
        illegalArgumentException51.addSuppressed((java.lang.Throwable) illegalArgumentException57);
        java.lang.IllegalArgumentException illegalArgumentException59 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException51);
        java.lang.IllegalArgumentException illegalArgumentException60 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException51);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray52);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException5 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException6 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException5);
        illegalArgumentException4.addSuppressed((java.lang.Throwable) illegalArgumentException5);
        java.lang.IllegalArgumentException illegalArgumentException8 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException5);
        java.lang.IllegalArgumentException illegalArgumentException9 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException8);
        java.lang.IllegalArgumentException illegalArgumentException10 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException8);
        java.lang.Throwable[] throwableArray11 = illegalArgumentException10.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException12 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException10);
        java.lang.IllegalArgumentException illegalArgumentException13 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException12);
        java.lang.IllegalArgumentException illegalArgumentException14 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException13);
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException5 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException6 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException5);
        illegalArgumentException4.addSuppressed((java.lang.Throwable) illegalArgumentException5);
        java.lang.IllegalArgumentException illegalArgumentException12 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException13 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException12);
        java.lang.IllegalArgumentException illegalArgumentException14 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException12);
        java.lang.IllegalArgumentException illegalArgumentException15 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException12);
        java.lang.IllegalArgumentException illegalArgumentException16 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException12);
        illegalArgumentException5.addSuppressed((java.lang.Throwable) illegalArgumentException16);
        java.lang.IllegalArgumentException illegalArgumentException20 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException21 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException20);
        java.lang.IllegalArgumentException illegalArgumentException22 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException20);
        illegalArgumentException5.addSuppressed((java.lang.Throwable) illegalArgumentException22);
        java.lang.Throwable[] throwableArray24 = illegalArgumentException22.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException25 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException22);
        java.lang.IllegalArgumentException illegalArgumentException30 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException31 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException30);
        java.lang.IllegalArgumentException illegalArgumentException32 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException30);
        java.lang.IllegalArgumentException illegalArgumentException33 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException30);
        java.lang.Throwable[] throwableArray34 = illegalArgumentException33.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException37 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException38 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException37);
        java.lang.IllegalArgumentException illegalArgumentException39 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException", (java.lang.Throwable) illegalArgumentException38);
        illegalArgumentException33.addSuppressed((java.lang.Throwable) illegalArgumentException38);
        java.lang.IllegalArgumentException illegalArgumentException41 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException38);
        java.lang.Throwable[] throwableArray42 = illegalArgumentException38.getSuppressed();
        illegalArgumentException22.addSuppressed((java.lang.Throwable) illegalArgumentException38);
        java.lang.IllegalArgumentException illegalArgumentException45 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException");
        java.lang.Throwable[] throwableArray46 = illegalArgumentException45.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException47 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException45);
        illegalArgumentException38.addSuppressed((java.lang.Throwable) illegalArgumentException45);
        java.lang.IllegalArgumentException illegalArgumentException53 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException54 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException53);
        java.lang.IllegalArgumentException illegalArgumentException55 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException54);
        java.lang.IllegalArgumentException illegalArgumentException56 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException54);
        java.lang.IllegalArgumentException illegalArgumentException57 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: ", (java.lang.Throwable) illegalArgumentException54);
        java.lang.Throwable[] throwableArray58 = illegalArgumentException57.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException59 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException57);
        java.lang.IllegalArgumentException illegalArgumentException60 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException59);
        illegalArgumentException45.addSuppressed((java.lang.Throwable) illegalArgumentException60);
        java.lang.IllegalArgumentException illegalArgumentException62 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException", (java.lang.Throwable) illegalArgumentException60);
        java.lang.Throwable[] throwableArray63 = illegalArgumentException60.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException64 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException60);
        java.lang.Throwable[] throwableArray65 = illegalArgumentException60.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray65);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        java.lang.IllegalArgumentException illegalArgumentException5 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException6 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException5);
        java.lang.IllegalArgumentException illegalArgumentException7 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException5);
        java.lang.IllegalArgumentException illegalArgumentException8 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException5);
        java.lang.IllegalArgumentException illegalArgumentException9 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException5);
        java.lang.Throwable[] throwableArray10 = illegalArgumentException5.getSuppressed();
        java.lang.Throwable[] throwableArray11 = illegalArgumentException5.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException12 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException5);
        java.lang.IllegalArgumentException illegalArgumentException14 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException15 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException14);
        java.lang.Throwable[] throwableArray16 = illegalArgumentException15.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException18 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException19 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException18);
        illegalArgumentException15.addSuppressed((java.lang.Throwable) illegalArgumentException19);
        illegalArgumentException12.addSuppressed((java.lang.Throwable) illegalArgumentException15);
        java.lang.IllegalArgumentException illegalArgumentException22 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException15);
        java.lang.IllegalArgumentException illegalArgumentException23 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: ", (java.lang.Throwable) illegalArgumentException15);
        java.lang.IllegalArgumentException illegalArgumentException30 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException31 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException30);
        java.lang.IllegalArgumentException illegalArgumentException32 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException30);
        java.lang.IllegalArgumentException illegalArgumentException33 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException30);
        java.lang.IllegalArgumentException illegalArgumentException34 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException30);
        java.lang.Throwable[] throwableArray35 = illegalArgumentException30.getSuppressed();
        java.lang.Throwable[] throwableArray36 = illegalArgumentException30.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException37 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException30);
        java.lang.IllegalArgumentException illegalArgumentException38 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException", (java.lang.Throwable) illegalArgumentException37);
        java.lang.IllegalArgumentException illegalArgumentException39 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException38);
        java.lang.IllegalArgumentException illegalArgumentException42 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException43 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException42);
        java.lang.Throwable[] throwableArray44 = illegalArgumentException43.getSuppressed();
        java.lang.Throwable[] throwableArray45 = illegalArgumentException43.getSuppressed();
        illegalArgumentException39.addSuppressed((java.lang.Throwable) illegalArgumentException43);
        java.lang.IllegalArgumentException illegalArgumentException48 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException49 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException48);
        java.lang.IllegalArgumentException illegalArgumentException50 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: ", (java.lang.Throwable) illegalArgumentException48);
        java.lang.Throwable[] throwableArray51 = illegalArgumentException50.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException53 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException54 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException53);
        illegalArgumentException50.addSuppressed((java.lang.Throwable) illegalArgumentException54);
        illegalArgumentException39.addSuppressed((java.lang.Throwable) illegalArgumentException50);
        illegalArgumentException23.addSuppressed((java.lang.Throwable) illegalArgumentException39);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray51);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) 9, (-10L));
        long long6 = arithmeticUtilsNew0.subAndCheck(7L, (long) 1);
        long long9 = arithmeticUtilsNew0.subAndCheck(1L, (long) (-100));
        long long12 = arithmeticUtilsNew0.subAndCheck((long) (short) 10, (long) (-10));
        long long15 = arithmeticUtilsNew0.subAndCheck(0L, (long) (-100));
        long long18 = arithmeticUtilsNew0.subAndCheck(0L, 1L);
        long long21 = arithmeticUtilsNew0.subAndCheck((-14L), (long) (-1));
        long long24 = arithmeticUtilsNew0.subAndCheck(23L, 95L);
        long long27 = arithmeticUtilsNew0.subAndCheck((long) (-6), 416L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 19L + "'", long3 == 19L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 6L + "'", long6 == 6L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 101L + "'", long9 == 101L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 20L + "'", long12 == 20L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-13L) + "'", long21 == (-13L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-72L) + "'", long24 == (-72L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-422L) + "'", long27 == (-422L));
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        java.lang.IllegalArgumentException illegalArgumentException1 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException2 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException1);
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException5 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException4);
        java.lang.Throwable[] throwableArray6 = illegalArgumentException5.getSuppressed();
        java.lang.Throwable[] throwableArray7 = illegalArgumentException5.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException10 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException11 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException10);
        java.lang.IllegalArgumentException illegalArgumentException12 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException11);
        illegalArgumentException5.addSuppressed((java.lang.Throwable) illegalArgumentException11);
        illegalArgumentException1.addSuppressed((java.lang.Throwable) illegalArgumentException5);
        java.lang.IllegalArgumentException illegalArgumentException16 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException17 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException16);
        java.lang.IllegalArgumentException illegalArgumentException19 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException20 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException19);
        java.lang.Throwable[] throwableArray21 = illegalArgumentException20.getSuppressed();
        java.lang.Throwable[] throwableArray22 = illegalArgumentException20.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException25 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException26 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException25);
        java.lang.IllegalArgumentException illegalArgumentException27 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException26);
        illegalArgumentException20.addSuppressed((java.lang.Throwable) illegalArgumentException26);
        illegalArgumentException16.addSuppressed((java.lang.Throwable) illegalArgumentException20);
        illegalArgumentException1.addSuppressed((java.lang.Throwable) illegalArgumentException20);
        java.lang.Throwable throwable31 = null;
        // The following exception was thrown during execution in test generation
        try {
            illegalArgumentException20.addSuppressed(throwable31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) 9, (-10L));
        long long6 = arithmeticUtilsNew0.subAndCheck(7L, (long) 1);
        long long9 = arithmeticUtilsNew0.subAndCheck(1L, (long) (-100));
        long long12 = arithmeticUtilsNew0.subAndCheck((long) (short) 10, (long) (-10));
        long long15 = arithmeticUtilsNew0.subAndCheck(0L, (long) (-100));
        long long18 = arithmeticUtilsNew0.subAndCheck(5L, (long) 100);
        long long21 = arithmeticUtilsNew0.subAndCheck(9L, (long) 5);
        long long24 = arithmeticUtilsNew0.subAndCheck((long) (-7), (long) (byte) 1);
        long long27 = arithmeticUtilsNew0.subAndCheck(0L, (-95L));
        long long30 = arithmeticUtilsNew0.subAndCheck((long) 3, (-96L));
        long long33 = arithmeticUtilsNew0.subAndCheck(100L, (-120L));
        long long36 = arithmeticUtilsNew0.subAndCheck((-183L), 173L);
        long long39 = arithmeticUtilsNew0.subAndCheck(100L, (-321L));
        long long42 = arithmeticUtilsNew0.subAndCheck(13L, 0L);
        long long45 = arithmeticUtilsNew0.subAndCheck((-95L), (-201L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 19L + "'", long3 == 19L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 6L + "'", long6 == 6L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 101L + "'", long9 == 101L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 20L + "'", long12 == 20L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-95L) + "'", long18 == (-95L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 4L + "'", long21 == 4L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-8L) + "'", long24 == (-8L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 95L + "'", long27 == 95L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 99L + "'", long30 == 99L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 220L + "'", long33 == 220L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-356L) + "'", long36 == (-356L));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 421L + "'", long39 == 421L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 13L + "'", long42 == 13L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 106L + "'", long45 == 106L);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        java.lang.IllegalArgumentException illegalArgumentException1 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException2 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException1);
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException5 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException4);
        java.lang.Throwable[] throwableArray6 = illegalArgumentException5.getSuppressed();
        java.lang.Throwable[] throwableArray7 = illegalArgumentException5.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException10 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException11 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException10);
        java.lang.IllegalArgumentException illegalArgumentException12 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException11);
        illegalArgumentException5.addSuppressed((java.lang.Throwable) illegalArgumentException11);
        illegalArgumentException1.addSuppressed((java.lang.Throwable) illegalArgumentException5);
        java.lang.Throwable[] throwableArray15 = illegalArgumentException5.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException16 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException5);
        java.lang.Throwable[] throwableArray17 = illegalArgumentException5.getSuppressed();
        java.lang.Throwable[] throwableArray18 = illegalArgumentException5.getSuppressed();
        java.lang.Class<?> wildcardClass19 = throwableArray18.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException5 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException6 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException5);
        illegalArgumentException4.addSuppressed((java.lang.Throwable) illegalArgumentException5);
        java.lang.IllegalArgumentException illegalArgumentException8 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException5);
        java.lang.IllegalArgumentException illegalArgumentException11 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException12 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException13 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException12);
        illegalArgumentException11.addSuppressed((java.lang.Throwable) illegalArgumentException12);
        java.lang.IllegalArgumentException illegalArgumentException15 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException12);
        java.lang.IllegalArgumentException illegalArgumentException19 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException20 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException19);
        java.lang.IllegalArgumentException illegalArgumentException21 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException19);
        java.lang.IllegalArgumentException illegalArgumentException22 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException19);
        java.lang.Throwable[] throwableArray23 = illegalArgumentException22.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException26 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException27 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException26);
        java.lang.IllegalArgumentException illegalArgumentException28 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException", (java.lang.Throwable) illegalArgumentException27);
        illegalArgumentException22.addSuppressed((java.lang.Throwable) illegalArgumentException27);
        illegalArgumentException15.addSuppressed((java.lang.Throwable) illegalArgumentException22);
        illegalArgumentException5.addSuppressed((java.lang.Throwable) illegalArgumentException15);
        java.lang.Throwable[] throwableArray32 = illegalArgumentException15.getSuppressed();
        java.lang.Throwable[] throwableArray33 = illegalArgumentException15.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException34 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException15);
        java.lang.IllegalArgumentException illegalArgumentException35 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException15);
        java.lang.IllegalArgumentException illegalArgumentException36 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException35);
        java.lang.IllegalArgumentException illegalArgumentException44 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException45 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException44);
        java.lang.IllegalArgumentException illegalArgumentException46 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException44);
        java.lang.IllegalArgumentException illegalArgumentException47 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException44);
        java.lang.IllegalArgumentException illegalArgumentException48 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException44);
        java.lang.Throwable[] throwableArray49 = illegalArgumentException44.getSuppressed();
        java.lang.Throwable[] throwableArray50 = illegalArgumentException44.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException51 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException44);
        java.lang.IllegalArgumentException illegalArgumentException52 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException", (java.lang.Throwable) illegalArgumentException51);
        java.lang.IllegalArgumentException illegalArgumentException53 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException52);
        java.lang.IllegalArgumentException illegalArgumentException54 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException52);
        illegalArgumentException36.addSuppressed((java.lang.Throwable) illegalArgumentException54);
        java.lang.IllegalArgumentException illegalArgumentException56 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: ", (java.lang.Throwable) illegalArgumentException54);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray50);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        java.lang.IllegalArgumentException illegalArgumentException2 = new java.lang.IllegalArgumentException("");
        java.lang.IllegalArgumentException illegalArgumentException3 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException2);
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException3);
        java.lang.Throwable[] throwableArray5 = illegalArgumentException3.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException9 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException10 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException9);
        java.lang.IllegalArgumentException illegalArgumentException11 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException9);
        java.lang.IllegalArgumentException illegalArgumentException12 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException9);
        java.lang.Throwable[] throwableArray13 = illegalArgumentException12.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException16 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException17 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException16);
        java.lang.IllegalArgumentException illegalArgumentException18 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException", (java.lang.Throwable) illegalArgumentException17);
        illegalArgumentException12.addSuppressed((java.lang.Throwable) illegalArgumentException17);
        java.lang.IllegalArgumentException illegalArgumentException20 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException17);
        java.lang.IllegalArgumentException illegalArgumentException21 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException20);
        illegalArgumentException3.addSuppressed((java.lang.Throwable) illegalArgumentException20);
        java.lang.IllegalArgumentException illegalArgumentException23 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException3);
        java.lang.IllegalArgumentException illegalArgumentException24 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException3);
        java.lang.IllegalArgumentException illegalArgumentException25 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException24);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        java.lang.Throwable throwable1 = null;
        java.lang.IllegalArgumentException illegalArgumentException2 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!", throwable1);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        java.lang.IllegalArgumentException illegalArgumentException6 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException7 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException6);
        java.lang.IllegalArgumentException illegalArgumentException8 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException", (java.lang.Throwable) illegalArgumentException6);
        java.lang.IllegalArgumentException illegalArgumentException9 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException6);
        java.lang.IllegalArgumentException illegalArgumentException10 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException", (java.lang.Throwable) illegalArgumentException9);
        java.lang.IllegalArgumentException illegalArgumentException11 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: ", (java.lang.Throwable) illegalArgumentException10);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException5 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException4);
        java.lang.IllegalArgumentException illegalArgumentException6 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException4);
        java.lang.IllegalArgumentException illegalArgumentException7 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException4);
        java.lang.Throwable[] throwableArray8 = illegalArgumentException7.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException9 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: ", (java.lang.Throwable) illegalArgumentException7);
        java.lang.IllegalArgumentException illegalArgumentException11 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException");
        java.lang.Throwable[] throwableArray12 = illegalArgumentException11.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException13 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException11);
        illegalArgumentException9.addSuppressed((java.lang.Throwable) illegalArgumentException11);
        java.lang.Throwable[] throwableArray15 = illegalArgumentException11.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray15);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) 9, (-10L));
        long long6 = arithmeticUtilsNew0.subAndCheck(7L, (long) 1);
        long long9 = arithmeticUtilsNew0.subAndCheck(1L, (long) (-100));
        long long12 = arithmeticUtilsNew0.subAndCheck((long) (short) 10, (long) (-10));
        long long15 = arithmeticUtilsNew0.subAndCheck(0L, (long) (-100));
        long long18 = arithmeticUtilsNew0.subAndCheck(5L, (long) 100);
        long long21 = arithmeticUtilsNew0.subAndCheck((-95L), 0L);
        long long24 = arithmeticUtilsNew0.subAndCheck(101L, (long) (short) 100);
        long long27 = arithmeticUtilsNew0.subAndCheck(60L, 362L);
        java.lang.Class<?> wildcardClass28 = arithmeticUtilsNew0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 19L + "'", long3 == 19L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 6L + "'", long6 == 6L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 101L + "'", long9 == 101L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 20L + "'", long12 == 20L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-95L) + "'", long18 == (-95L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-95L) + "'", long21 == (-95L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-302L) + "'", long27 == (-302L));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) 9, (-10L));
        long long6 = arithmeticUtilsNew0.subAndCheck(7L, (long) 1);
        long long9 = arithmeticUtilsNew0.subAndCheck(1L, (long) (-100));
        long long12 = arithmeticUtilsNew0.subAndCheck((long) (short) 10, (long) (-10));
        long long15 = arithmeticUtilsNew0.subAndCheck(0L, (long) (-100));
        long long18 = arithmeticUtilsNew0.subAndCheck(5L, (long) 100);
        long long21 = arithmeticUtilsNew0.subAndCheck(190L, (-1L));
        long long24 = arithmeticUtilsNew0.subAndCheck((long) 0, (-189L));
        long long27 = arithmeticUtilsNew0.subAndCheck((long) 1, 292L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 19L + "'", long3 == 19L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 6L + "'", long6 == 6L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 101L + "'", long9 == 101L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 20L + "'", long12 == 20L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-95L) + "'", long18 == (-95L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 191L + "'", long21 == 191L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 189L + "'", long24 == 189L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-291L) + "'", long27 == (-291L));
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        java.lang.IllegalArgumentException illegalArgumentException2 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException3 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException3);
        illegalArgumentException2.addSuppressed((java.lang.Throwable) illegalArgumentException3);
        java.lang.IllegalArgumentException illegalArgumentException10 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException11 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException10);
        java.lang.IllegalArgumentException illegalArgumentException12 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException10);
        java.lang.IllegalArgumentException illegalArgumentException13 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException10);
        java.lang.IllegalArgumentException illegalArgumentException14 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException10);
        illegalArgumentException3.addSuppressed((java.lang.Throwable) illegalArgumentException14);
        java.lang.IllegalArgumentException illegalArgumentException16 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: ", (java.lang.Throwable) illegalArgumentException3);
        java.lang.IllegalArgumentException illegalArgumentException21 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException22 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException21);
        java.lang.IllegalArgumentException illegalArgumentException23 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException21);
        java.lang.IllegalArgumentException illegalArgumentException24 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException21);
        java.lang.IllegalArgumentException illegalArgumentException25 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException21);
        java.lang.Throwable[] throwableArray26 = illegalArgumentException21.getSuppressed();
        java.lang.Throwable[] throwableArray27 = illegalArgumentException21.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException28 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException21);
        illegalArgumentException3.addSuppressed((java.lang.Throwable) illegalArgumentException21);
        java.lang.IllegalArgumentException illegalArgumentException33 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException34 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException33);
        java.lang.IllegalArgumentException illegalArgumentException35 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException33);
        java.lang.IllegalArgumentException illegalArgumentException36 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException33);
        java.lang.Throwable[] throwableArray37 = illegalArgumentException36.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException40 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException41 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException40);
        java.lang.IllegalArgumentException illegalArgumentException42 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException40);
        java.lang.IllegalArgumentException illegalArgumentException44 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException45 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException44);
        java.lang.IllegalArgumentException illegalArgumentException46 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException44);
        illegalArgumentException40.addSuppressed((java.lang.Throwable) illegalArgumentException46);
        java.lang.IllegalArgumentException illegalArgumentException48 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException46);
        java.lang.IllegalArgumentException illegalArgumentException49 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException48);
        illegalArgumentException36.addSuppressed((java.lang.Throwable) illegalArgumentException49);
        illegalArgumentException21.addSuppressed((java.lang.Throwable) illegalArgumentException36);
        java.lang.IllegalArgumentException illegalArgumentException54 = new java.lang.IllegalArgumentException("hi!");
        java.lang.Throwable[] throwableArray55 = illegalArgumentException54.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException56 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException54);
        java.lang.IllegalArgumentException illegalArgumentException57 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException54);
        illegalArgumentException21.addSuppressed((java.lang.Throwable) illegalArgumentException54);
        java.lang.IllegalArgumentException illegalArgumentException59 = new java.lang.IllegalArgumentException();
        java.lang.Throwable[] throwableArray60 = illegalArgumentException59.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException61 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException59);
        java.lang.IllegalArgumentException illegalArgumentException62 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException59);
        illegalArgumentException21.addSuppressed((java.lang.Throwable) illegalArgumentException62);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray60);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) 9, (-10L));
        long long6 = arithmeticUtilsNew0.subAndCheck(7L, (long) 1);
        long long9 = arithmeticUtilsNew0.subAndCheck(1L, (long) (-100));
        long long12 = arithmeticUtilsNew0.subAndCheck((long) (short) 10, (long) (-10));
        long long15 = arithmeticUtilsNew0.subAndCheck(0L, (long) (-100));
        long long18 = arithmeticUtilsNew0.subAndCheck(5L, (long) 100);
        long long21 = arithmeticUtilsNew0.subAndCheck(9L, (long) 5);
        long long24 = arithmeticUtilsNew0.subAndCheck((-12L), 191L);
        long long27 = arithmeticUtilsNew0.subAndCheck((-4L), 7L);
        long long30 = arithmeticUtilsNew0.subAndCheck((long) (-4), 51L);
        long long33 = arithmeticUtilsNew0.subAndCheck((long) (-3), (long) 3);
        long long36 = arithmeticUtilsNew0.subAndCheck(40L, 53L);
        long long39 = arithmeticUtilsNew0.subAndCheck(0L, 12L);
        long long42 = arithmeticUtilsNew0.subAndCheck((long) (-8), 46L);
        long long45 = arithmeticUtilsNew0.subAndCheck(416L, (long) (-5));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 19L + "'", long3 == 19L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 6L + "'", long6 == 6L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 101L + "'", long9 == 101L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 20L + "'", long12 == 20L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-95L) + "'", long18 == (-95L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 4L + "'", long21 == 4L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-203L) + "'", long24 == (-203L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-11L) + "'", long27 == (-11L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-55L) + "'", long30 == (-55L));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-6L) + "'", long33 == (-6L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-13L) + "'", long36 == (-13L));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-12L) + "'", long39 == (-12L));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-54L) + "'", long42 == (-54L));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 421L + "'", long45 == 421L);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException5 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException4);
        java.lang.IllegalArgumentException illegalArgumentException6 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException4);
        java.lang.IllegalArgumentException illegalArgumentException7 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException4);
        java.lang.Throwable[] throwableArray8 = illegalArgumentException7.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException9 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: ", (java.lang.Throwable) illegalArgumentException7);
        java.lang.IllegalArgumentException illegalArgumentException11 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException");
        java.lang.Throwable[] throwableArray12 = illegalArgumentException11.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException13 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException11);
        illegalArgumentException9.addSuppressed((java.lang.Throwable) illegalArgumentException11);
        java.lang.IllegalArgumentException illegalArgumentException17 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!");
        java.lang.IllegalArgumentException illegalArgumentException18 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException17);
        java.lang.IllegalArgumentException illegalArgumentException19 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException17);
        java.lang.IllegalArgumentException illegalArgumentException20 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException17);
        java.lang.Throwable[] throwableArray21 = illegalArgumentException17.getSuppressed();
        java.lang.Throwable[] throwableArray22 = illegalArgumentException17.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException25 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException26 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException25);
        java.lang.IllegalArgumentException illegalArgumentException27 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException", (java.lang.Throwable) illegalArgumentException26);
        java.lang.IllegalArgumentException illegalArgumentException28 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException27);
        java.lang.IllegalArgumentException illegalArgumentException33 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException34 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException33);
        java.lang.IllegalArgumentException illegalArgumentException35 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException33);
        java.lang.IllegalArgumentException illegalArgumentException36 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException33);
        java.lang.Throwable[] throwableArray37 = illegalArgumentException36.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException40 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException41 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException40);
        java.lang.IllegalArgumentException illegalArgumentException42 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException", (java.lang.Throwable) illegalArgumentException41);
        illegalArgumentException36.addSuppressed((java.lang.Throwable) illegalArgumentException41);
        java.lang.IllegalArgumentException illegalArgumentException44 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException36);
        java.lang.IllegalArgumentException illegalArgumentException45 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException36);
        java.lang.IllegalArgumentException illegalArgumentException49 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException50 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException49);
        java.lang.IllegalArgumentException illegalArgumentException52 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!");
        illegalArgumentException50.addSuppressed((java.lang.Throwable) illegalArgumentException52);
        java.lang.IllegalArgumentException illegalArgumentException54 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException52);
        illegalArgumentException45.addSuppressed((java.lang.Throwable) illegalArgumentException54);
        java.lang.IllegalArgumentException illegalArgumentException59 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException60 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException61 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException60);
        illegalArgumentException59.addSuppressed((java.lang.Throwable) illegalArgumentException60);
        java.lang.IllegalArgumentException illegalArgumentException63 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException60);
        java.lang.IllegalArgumentException illegalArgumentException64 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException63);
        java.lang.IllegalArgumentException illegalArgumentException65 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException63);
        illegalArgumentException45.addSuppressed((java.lang.Throwable) illegalArgumentException63);
        java.lang.IllegalArgumentException illegalArgumentException67 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException45);
        java.lang.Throwable[] throwableArray68 = illegalArgumentException67.getSuppressed();
        illegalArgumentException28.addSuppressed((java.lang.Throwable) illegalArgumentException67);
        illegalArgumentException17.addSuppressed((java.lang.Throwable) illegalArgumentException28);
        illegalArgumentException9.addSuppressed((java.lang.Throwable) illegalArgumentException28);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray68);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        java.lang.Throwable throwable0 = null;
        java.lang.IllegalArgumentException illegalArgumentException1 = new java.lang.IllegalArgumentException(throwable0);
        java.lang.Throwable[] throwableArray2 = illegalArgumentException1.getSuppressed();
        java.lang.Throwable throwable3 = null;
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException(throwable3);
        illegalArgumentException1.addSuppressed((java.lang.Throwable) illegalArgumentException4);
        java.lang.IllegalArgumentException illegalArgumentException6 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException1);
        java.lang.Throwable[] throwableArray7 = illegalArgumentException1.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException8 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException1);
        java.lang.IllegalArgumentException illegalArgumentException12 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException13 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException14 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException13);
        illegalArgumentException12.addSuppressed((java.lang.Throwable) illegalArgumentException13);
        java.lang.IllegalArgumentException illegalArgumentException16 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException13);
        java.lang.IllegalArgumentException illegalArgumentException20 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException21 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException20);
        java.lang.IllegalArgumentException illegalArgumentException22 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException20);
        java.lang.IllegalArgumentException illegalArgumentException23 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException20);
        java.lang.Throwable[] throwableArray24 = illegalArgumentException23.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException27 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException28 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException27);
        java.lang.IllegalArgumentException illegalArgumentException29 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException", (java.lang.Throwable) illegalArgumentException28);
        illegalArgumentException23.addSuppressed((java.lang.Throwable) illegalArgumentException28);
        illegalArgumentException16.addSuppressed((java.lang.Throwable) illegalArgumentException23);
        java.lang.Throwable[] throwableArray32 = illegalArgumentException23.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException33 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException23);
        illegalArgumentException8.addSuppressed((java.lang.Throwable) illegalArgumentException23);
        java.lang.String str35 = illegalArgumentException23.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "java.lang.IllegalArgumentException: " + "'", str35, "java.lang.IllegalArgumentException: ");
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        java.lang.IllegalArgumentException illegalArgumentException0 = new java.lang.IllegalArgumentException();
        java.lang.Throwable[] throwableArray1 = illegalArgumentException0.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException2 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException0);
        java.lang.IllegalArgumentException illegalArgumentException3 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException0);
        java.lang.Throwable[] throwableArray4 = illegalArgumentException0.getSuppressed();
        java.lang.Class<?> wildcardClass5 = throwableArray4.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException5 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException4);
        java.lang.IllegalArgumentException illegalArgumentException6 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException4);
        java.lang.IllegalArgumentException illegalArgumentException7 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException4);
        java.lang.Throwable[] throwableArray8 = illegalArgumentException7.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException11 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException12 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException11);
        java.lang.IllegalArgumentException illegalArgumentException13 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException", (java.lang.Throwable) illegalArgumentException12);
        illegalArgumentException7.addSuppressed((java.lang.Throwable) illegalArgumentException12);
        java.lang.IllegalArgumentException illegalArgumentException15 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException7);
        java.lang.IllegalArgumentException illegalArgumentException16 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException7);
        java.lang.IllegalArgumentException illegalArgumentException20 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException21 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException20);
        java.lang.IllegalArgumentException illegalArgumentException23 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!");
        illegalArgumentException21.addSuppressed((java.lang.Throwable) illegalArgumentException23);
        java.lang.IllegalArgumentException illegalArgumentException25 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException23);
        illegalArgumentException16.addSuppressed((java.lang.Throwable) illegalArgumentException25);
        java.lang.IllegalArgumentException illegalArgumentException27 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException25);
        java.lang.Class<?> wildcardClass28 = illegalArgumentException27.getClass();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        java.lang.IllegalArgumentException illegalArgumentException6 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException7 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException6);
        java.lang.IllegalArgumentException illegalArgumentException8 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException6);
        java.lang.IllegalArgumentException illegalArgumentException9 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException6);
        java.lang.IllegalArgumentException illegalArgumentException10 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException6);
        java.lang.Throwable[] throwableArray11 = illegalArgumentException6.getSuppressed();
        java.lang.Throwable[] throwableArray12 = illegalArgumentException6.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException13 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException6);
        java.lang.IllegalArgumentException illegalArgumentException14 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: ", (java.lang.Throwable) illegalArgumentException13);
        java.lang.IllegalArgumentException illegalArgumentException15 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException14);
        java.lang.IllegalArgumentException illegalArgumentException16 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: ", (java.lang.Throwable) illegalArgumentException14);
        java.lang.IllegalArgumentException illegalArgumentException17 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException14);
        java.lang.String str18 = illegalArgumentException14.toString();
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: " + "'", str18, "java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: ");
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) 9, (-10L));
        long long6 = arithmeticUtilsNew0.subAndCheck(7L, (long) 1);
        long long9 = arithmeticUtilsNew0.subAndCheck(1L, (long) (-100));
        long long12 = arithmeticUtilsNew0.subAndCheck((long) (short) 10, (long) (-10));
        long long15 = arithmeticUtilsNew0.subAndCheck(0L, (long) (-100));
        long long18 = arithmeticUtilsNew0.subAndCheck((-2L), 5L);
        long long21 = arithmeticUtilsNew0.subAndCheck((long) 5, (long) (-1));
        long long24 = arithmeticUtilsNew0.subAndCheck(82L, 19L);
        long long27 = arithmeticUtilsNew0.subAndCheck((-60L), (-275L));
        long long30 = arithmeticUtilsNew0.subAndCheck(38L, (long) (-6));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 19L + "'", long3 == 19L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 6L + "'", long6 == 6L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 101L + "'", long9 == 101L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 20L + "'", long12 == 20L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-7L) + "'", long18 == (-7L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 6L + "'", long21 == 6L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 63L + "'", long24 == 63L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 215L + "'", long27 == 215L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 44L + "'", long30 == 44L);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) 'a', (long) 100);
        long long6 = arithmeticUtilsNew0.subAndCheck((long) 6, 4L);
        long long9 = arithmeticUtilsNew0.subAndCheck(0L, (long) 0);
        long long12 = arithmeticUtilsNew0.subAndCheck((-1L), (-4L));
        long long15 = arithmeticUtilsNew0.subAndCheck((-72L), 100L);
        long long18 = arithmeticUtilsNew0.subAndCheck(14L, 220L);
        long long21 = arithmeticUtilsNew0.subAndCheck(271L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3L) + "'", long3 == (-3L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-172L) + "'", long15 == (-172L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-206L) + "'", long18 == (-206L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 271L + "'", long21 == 271L);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) 'a', (long) 100);
        long long6 = arithmeticUtilsNew0.subAndCheck((long) 6, 4L);
        long long9 = arithmeticUtilsNew0.subAndCheck((long) 2, (long) 100);
        long long12 = arithmeticUtilsNew0.subAndCheck((long) (byte) 10, (long) (short) -1);
        long long15 = arithmeticUtilsNew0.subAndCheck((-5L), 9L);
        long long18 = arithmeticUtilsNew0.subAndCheck(0L, (long) 100);
        long long21 = arithmeticUtilsNew0.subAndCheck(5L, (-5L));
        long long24 = arithmeticUtilsNew0.subAndCheck(0L, (long) 0);
        long long27 = arithmeticUtilsNew0.subAndCheck(7L, (long) 10);
        java.lang.Class<?> wildcardClass28 = arithmeticUtilsNew0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3L) + "'", long3 == (-3L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-98L) + "'", long9 == (-98L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 11L + "'", long12 == 11L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-14L) + "'", long15 == (-14L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-100L) + "'", long18 == (-100L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-3L) + "'", long27 == (-3L));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        java.lang.IllegalArgumentException illegalArgumentException3 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException5 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException4);
        illegalArgumentException3.addSuppressed((java.lang.Throwable) illegalArgumentException4);
        java.lang.IllegalArgumentException illegalArgumentException7 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException4);
        java.lang.IllegalArgumentException illegalArgumentException8 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException7);
        java.lang.IllegalArgumentException illegalArgumentException9 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException8);
        java.lang.Throwable[] throwableArray10 = illegalArgumentException8.getSuppressed();
        java.lang.Throwable[] throwableArray11 = illegalArgumentException8.getSuppressed();
        java.lang.Throwable[] throwableArray12 = illegalArgumentException8.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        java.lang.IllegalArgumentException illegalArgumentException1 = new java.lang.IllegalArgumentException("");
        java.lang.IllegalArgumentException illegalArgumentException2 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException1);
        java.lang.IllegalArgumentException illegalArgumentException3 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException2);
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException();
        illegalArgumentException2.addSuppressed((java.lang.Throwable) illegalArgumentException4);
        java.lang.IllegalArgumentException illegalArgumentException6 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException4);
        java.lang.IllegalArgumentException illegalArgumentException10 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException11 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException12 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException11);
        illegalArgumentException10.addSuppressed((java.lang.Throwable) illegalArgumentException11);
        java.lang.IllegalArgumentException illegalArgumentException18 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException19 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException18);
        java.lang.IllegalArgumentException illegalArgumentException20 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException18);
        java.lang.IllegalArgumentException illegalArgumentException21 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException18);
        java.lang.IllegalArgumentException illegalArgumentException22 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException18);
        illegalArgumentException11.addSuppressed((java.lang.Throwable) illegalArgumentException22);
        java.lang.IllegalArgumentException illegalArgumentException24 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: ", (java.lang.Throwable) illegalArgumentException11);
        java.lang.IllegalArgumentException illegalArgumentException29 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException30 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException29);
        java.lang.IllegalArgumentException illegalArgumentException31 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException29);
        java.lang.IllegalArgumentException illegalArgumentException32 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException29);
        java.lang.IllegalArgumentException illegalArgumentException33 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException29);
        java.lang.Throwable[] throwableArray34 = illegalArgumentException29.getSuppressed();
        java.lang.Throwable[] throwableArray35 = illegalArgumentException29.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException36 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException29);
        illegalArgumentException11.addSuppressed((java.lang.Throwable) illegalArgumentException29);
        java.lang.IllegalArgumentException illegalArgumentException41 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException42 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException41);
        java.lang.IllegalArgumentException illegalArgumentException43 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException42);
        java.lang.IllegalArgumentException illegalArgumentException44 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException42);
        java.lang.IllegalArgumentException illegalArgumentException45 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException42);
        illegalArgumentException11.addSuppressed((java.lang.Throwable) illegalArgumentException42);
        java.lang.Throwable[] throwableArray47 = illegalArgumentException42.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException48 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException42);
        illegalArgumentException6.addSuppressed((java.lang.Throwable) illegalArgumentException48);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray47);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        java.lang.IllegalArgumentException illegalArgumentException3 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException5 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException4);
        illegalArgumentException3.addSuppressed((java.lang.Throwable) illegalArgumentException4);
        java.lang.IllegalArgumentException illegalArgumentException7 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException4);
        java.lang.IllegalArgumentException illegalArgumentException9 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!");
        java.lang.IllegalArgumentException illegalArgumentException14 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException15 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException14);
        java.lang.IllegalArgumentException illegalArgumentException16 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException14);
        java.lang.IllegalArgumentException illegalArgumentException17 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException14);
        java.lang.IllegalArgumentException illegalArgumentException18 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException14);
        java.lang.Throwable[] throwableArray19 = illegalArgumentException18.getSuppressed();
        illegalArgumentException9.addSuppressed((java.lang.Throwable) illegalArgumentException18);
        illegalArgumentException7.addSuppressed((java.lang.Throwable) illegalArgumentException9);
        java.lang.IllegalArgumentException illegalArgumentException22 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException7);
        java.lang.Throwable[] throwableArray23 = illegalArgumentException7.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException28 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException29 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException30 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException29);
        illegalArgumentException28.addSuppressed((java.lang.Throwable) illegalArgumentException29);
        java.lang.IllegalArgumentException illegalArgumentException32 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException29);
        java.lang.IllegalArgumentException illegalArgumentException33 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException32);
        java.lang.IllegalArgumentException illegalArgumentException36 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException37 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException38 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException37);
        illegalArgumentException36.addSuppressed((java.lang.Throwable) illegalArgumentException37);
        java.lang.IllegalArgumentException illegalArgumentException40 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException37);
        java.lang.IllegalArgumentException illegalArgumentException44 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException45 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException44);
        java.lang.IllegalArgumentException illegalArgumentException46 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException44);
        java.lang.IllegalArgumentException illegalArgumentException47 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException44);
        java.lang.Throwable[] throwableArray48 = illegalArgumentException47.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException51 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException52 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException51);
        java.lang.IllegalArgumentException illegalArgumentException53 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException", (java.lang.Throwable) illegalArgumentException52);
        illegalArgumentException47.addSuppressed((java.lang.Throwable) illegalArgumentException52);
        illegalArgumentException40.addSuppressed((java.lang.Throwable) illegalArgumentException47);
        illegalArgumentException33.addSuppressed((java.lang.Throwable) illegalArgumentException47);
        java.lang.IllegalArgumentException illegalArgumentException57 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException47);
        java.lang.IllegalArgumentException illegalArgumentException58 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException57);
        java.lang.IllegalArgumentException illegalArgumentException59 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException57);
        java.lang.IllegalArgumentException illegalArgumentException62 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException63 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException62);
        java.lang.IllegalArgumentException illegalArgumentException64 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException62);
        java.lang.IllegalArgumentException illegalArgumentException66 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException67 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException66);
        java.lang.IllegalArgumentException illegalArgumentException68 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException66);
        illegalArgumentException62.addSuppressed((java.lang.Throwable) illegalArgumentException68);
        java.lang.IllegalArgumentException illegalArgumentException70 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException62);
        illegalArgumentException57.addSuppressed((java.lang.Throwable) illegalArgumentException70);
        java.lang.Throwable[] throwableArray72 = illegalArgumentException57.getSuppressed();
        illegalArgumentException7.addSuppressed((java.lang.Throwable) illegalArgumentException57);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray72);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        java.lang.IllegalArgumentException illegalArgumentException3 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException3);
        java.lang.IllegalArgumentException illegalArgumentException6 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!");
        illegalArgumentException4.addSuppressed((java.lang.Throwable) illegalArgumentException6);
        java.lang.IllegalArgumentException illegalArgumentException8 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException6);
        java.lang.IllegalArgumentException illegalArgumentException11 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException12 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException13 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException12);
        illegalArgumentException11.addSuppressed((java.lang.Throwable) illegalArgumentException12);
        java.lang.IllegalArgumentException illegalArgumentException15 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException12);
        java.lang.IllegalArgumentException illegalArgumentException16 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException15);
        java.lang.IllegalArgumentException illegalArgumentException17 = new java.lang.IllegalArgumentException();
        java.lang.Throwable[] throwableArray18 = illegalArgumentException17.getSuppressed();
        illegalArgumentException15.addSuppressed((java.lang.Throwable) illegalArgumentException17);
        illegalArgumentException8.addSuppressed((java.lang.Throwable) illegalArgumentException15);
        java.lang.Throwable[] throwableArray21 = illegalArgumentException8.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException22 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException8);
        java.lang.String str23 = illegalArgumentException22.toString();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!" + "'", str23, "java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!");
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        java.lang.IllegalArgumentException illegalArgumentException3 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException5 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException4);
        illegalArgumentException3.addSuppressed((java.lang.Throwable) illegalArgumentException4);
        java.lang.IllegalArgumentException illegalArgumentException7 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException4);
        java.lang.IllegalArgumentException illegalArgumentException8 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException7);
        java.lang.Throwable throwable11 = null;
        java.lang.IllegalArgumentException illegalArgumentException12 = new java.lang.IllegalArgumentException(throwable11);
        java.lang.Throwable[] throwableArray13 = illegalArgumentException12.getSuppressed();
        java.lang.Throwable throwable14 = null;
        java.lang.IllegalArgumentException illegalArgumentException15 = new java.lang.IllegalArgumentException(throwable14);
        illegalArgumentException12.addSuppressed((java.lang.Throwable) illegalArgumentException15);
        java.lang.IllegalArgumentException illegalArgumentException17 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException15);
        java.lang.IllegalArgumentException illegalArgumentException18 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException17);
        illegalArgumentException8.addSuppressed((java.lang.Throwable) illegalArgumentException17);
        java.lang.Class<?> wildcardClass20 = illegalArgumentException17.getClass();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        java.lang.IllegalArgumentException illegalArgumentException3 = new java.lang.IllegalArgumentException("hi!");
        java.lang.Throwable[] throwableArray4 = illegalArgumentException3.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException5 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException3);
        java.lang.IllegalArgumentException illegalArgumentException6 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException", (java.lang.Throwable) illegalArgumentException3);
        java.lang.Class<?> wildcardClass7 = illegalArgumentException6.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        java.lang.IllegalArgumentException illegalArgumentException5 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException6 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException5);
        java.lang.IllegalArgumentException illegalArgumentException7 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException5);
        java.lang.IllegalArgumentException illegalArgumentException8 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException5);
        java.lang.Throwable[] throwableArray9 = illegalArgumentException8.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException12 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException13 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException12);
        java.lang.IllegalArgumentException illegalArgumentException14 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException", (java.lang.Throwable) illegalArgumentException13);
        illegalArgumentException8.addSuppressed((java.lang.Throwable) illegalArgumentException13);
        java.lang.IllegalArgumentException illegalArgumentException16 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException13);
        java.lang.IllegalArgumentException illegalArgumentException17 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException16);
        java.lang.IllegalArgumentException illegalArgumentException18 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException16);
        java.lang.Throwable[] throwableArray19 = illegalArgumentException18.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException20 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException18);
        java.lang.IllegalArgumentException illegalArgumentException21 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException20);
        java.lang.Throwable[] throwableArray22 = illegalArgumentException20.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException26 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException27 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException26);
        java.lang.IllegalArgumentException illegalArgumentException28 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException26);
        java.lang.IllegalArgumentException illegalArgumentException29 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException26);
        java.lang.Throwable[] throwableArray30 = illegalArgumentException29.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException32 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!");
        java.lang.IllegalArgumentException illegalArgumentException37 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException38 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException37);
        java.lang.IllegalArgumentException illegalArgumentException39 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException37);
        java.lang.IllegalArgumentException illegalArgumentException40 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException37);
        java.lang.IllegalArgumentException illegalArgumentException41 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException37);
        java.lang.Throwable[] throwableArray42 = illegalArgumentException41.getSuppressed();
        illegalArgumentException32.addSuppressed((java.lang.Throwable) illegalArgumentException41);
        illegalArgumentException29.addSuppressed((java.lang.Throwable) illegalArgumentException41);
        java.lang.IllegalArgumentException illegalArgumentException46 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException47 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException46);
        java.lang.IllegalArgumentException illegalArgumentException48 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException47);
        illegalArgumentException29.addSuppressed((java.lang.Throwable) illegalArgumentException48);
        java.lang.IllegalArgumentException illegalArgumentException52 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException53 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException54 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException53);
        illegalArgumentException52.addSuppressed((java.lang.Throwable) illegalArgumentException53);
        java.lang.IllegalArgumentException illegalArgumentException60 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException61 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException60);
        java.lang.IllegalArgumentException illegalArgumentException62 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException60);
        java.lang.IllegalArgumentException illegalArgumentException63 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException60);
        java.lang.IllegalArgumentException illegalArgumentException64 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException60);
        illegalArgumentException53.addSuppressed((java.lang.Throwable) illegalArgumentException64);
        java.lang.IllegalArgumentException illegalArgumentException66 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: ", (java.lang.Throwable) illegalArgumentException53);
        java.lang.IllegalArgumentException illegalArgumentException69 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException70 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException69);
        java.lang.IllegalArgumentException illegalArgumentException71 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException69);
        java.lang.IllegalArgumentException illegalArgumentException73 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException74 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException73);
        java.lang.IllegalArgumentException illegalArgumentException75 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException73);
        illegalArgumentException69.addSuppressed((java.lang.Throwable) illegalArgumentException75);
        java.lang.IllegalArgumentException illegalArgumentException77 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException75);
        illegalArgumentException66.addSuppressed((java.lang.Throwable) illegalArgumentException75);
        illegalArgumentException48.addSuppressed((java.lang.Throwable) illegalArgumentException75);
        illegalArgumentException20.addSuppressed((java.lang.Throwable) illegalArgumentException75);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray42);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        java.lang.IllegalArgumentException illegalArgumentException6 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException7 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException6);
        java.lang.IllegalArgumentException illegalArgumentException8 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException6);
        java.lang.IllegalArgumentException illegalArgumentException9 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException6);
        java.lang.IllegalArgumentException illegalArgumentException10 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException6);
        java.lang.Throwable[] throwableArray11 = illegalArgumentException6.getSuppressed();
        java.lang.Throwable[] throwableArray12 = illegalArgumentException6.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException13 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException6);
        java.lang.IllegalArgumentException illegalArgumentException14 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException", (java.lang.Throwable) illegalArgumentException13);
        java.lang.IllegalArgumentException illegalArgumentException15 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException14);
        java.lang.IllegalArgumentException illegalArgumentException18 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException19 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException18);
        java.lang.Throwable[] throwableArray20 = illegalArgumentException19.getSuppressed();
        java.lang.Throwable[] throwableArray21 = illegalArgumentException19.getSuppressed();
        illegalArgumentException15.addSuppressed((java.lang.Throwable) illegalArgumentException19);
        java.lang.IllegalArgumentException illegalArgumentException24 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException25 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException24);
        java.lang.IllegalArgumentException illegalArgumentException26 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: ", (java.lang.Throwable) illegalArgumentException24);
        java.lang.Throwable[] throwableArray27 = illegalArgumentException26.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException29 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException30 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException29);
        illegalArgumentException26.addSuppressed((java.lang.Throwable) illegalArgumentException30);
        illegalArgumentException15.addSuppressed((java.lang.Throwable) illegalArgumentException26);
        java.lang.IllegalArgumentException illegalArgumentException33 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException15);
        java.lang.IllegalArgumentException illegalArgumentException36 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException37 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException38 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException37);
        illegalArgumentException36.addSuppressed((java.lang.Throwable) illegalArgumentException37);
        java.lang.Throwable[] throwableArray40 = illegalArgumentException36.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException45 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException46 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException47 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException46);
        illegalArgumentException45.addSuppressed((java.lang.Throwable) illegalArgumentException46);
        java.lang.IllegalArgumentException illegalArgumentException49 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException46);
        java.lang.IllegalArgumentException illegalArgumentException50 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException49);
        java.lang.IllegalArgumentException illegalArgumentException53 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException54 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException55 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException54);
        illegalArgumentException53.addSuppressed((java.lang.Throwable) illegalArgumentException54);
        java.lang.IllegalArgumentException illegalArgumentException57 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException54);
        java.lang.IllegalArgumentException illegalArgumentException61 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException62 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException61);
        java.lang.IllegalArgumentException illegalArgumentException63 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException61);
        java.lang.IllegalArgumentException illegalArgumentException64 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException61);
        java.lang.Throwable[] throwableArray65 = illegalArgumentException64.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException68 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException69 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException68);
        java.lang.IllegalArgumentException illegalArgumentException70 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException", (java.lang.Throwable) illegalArgumentException69);
        illegalArgumentException64.addSuppressed((java.lang.Throwable) illegalArgumentException69);
        illegalArgumentException57.addSuppressed((java.lang.Throwable) illegalArgumentException64);
        illegalArgumentException50.addSuppressed((java.lang.Throwable) illegalArgumentException64);
        java.lang.IllegalArgumentException illegalArgumentException74 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException64);
        java.lang.Throwable[] throwableArray75 = illegalArgumentException64.getSuppressed();
        illegalArgumentException36.addSuppressed((java.lang.Throwable) illegalArgumentException64);
        java.lang.IllegalArgumentException illegalArgumentException77 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException64);
        java.lang.IllegalArgumentException illegalArgumentException78 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException77);
        java.lang.Throwable[] throwableArray79 = illegalArgumentException78.getSuppressed();
        illegalArgumentException15.addSuppressed((java.lang.Throwable) illegalArgumentException78);
        java.lang.Throwable[] throwableArray81 = illegalArgumentException78.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertNotNull(throwableArray81);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        java.lang.IllegalArgumentException illegalArgumentException3 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException5 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException4);
        illegalArgumentException3.addSuppressed((java.lang.Throwable) illegalArgumentException4);
        java.lang.IllegalArgumentException illegalArgumentException7 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException4);
        java.lang.IllegalArgumentException illegalArgumentException11 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException12 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException11);
        java.lang.IllegalArgumentException illegalArgumentException13 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException11);
        java.lang.IllegalArgumentException illegalArgumentException14 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException11);
        java.lang.Throwable[] throwableArray15 = illegalArgumentException14.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException18 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException19 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException18);
        java.lang.IllegalArgumentException illegalArgumentException20 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException", (java.lang.Throwable) illegalArgumentException19);
        illegalArgumentException14.addSuppressed((java.lang.Throwable) illegalArgumentException19);
        illegalArgumentException7.addSuppressed((java.lang.Throwable) illegalArgumentException14);
        java.lang.IllegalArgumentException illegalArgumentException23 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: ", (java.lang.Throwable) illegalArgumentException7);
        java.lang.IllegalArgumentException illegalArgumentException29 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException30 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException29);
        java.lang.IllegalArgumentException illegalArgumentException31 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException29);
        java.lang.IllegalArgumentException illegalArgumentException32 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException29);
        java.lang.IllegalArgumentException illegalArgumentException33 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException29);
        java.lang.Throwable[] throwableArray34 = illegalArgumentException33.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException35 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException33);
        java.lang.IllegalArgumentException illegalArgumentException36 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException33);
        java.lang.IllegalArgumentException illegalArgumentException38 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!");
        java.lang.Throwable[] throwableArray39 = illegalArgumentException38.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException40 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException38);
        illegalArgumentException36.addSuppressed((java.lang.Throwable) illegalArgumentException38);
        java.lang.IllegalArgumentException illegalArgumentException42 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException", (java.lang.Throwable) illegalArgumentException38);
        java.lang.Throwable[] throwableArray43 = illegalArgumentException38.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException44 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException38);
        illegalArgumentException7.addSuppressed((java.lang.Throwable) illegalArgumentException38);
        java.lang.Throwable[] throwableArray46 = illegalArgumentException7.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray46);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        java.lang.IllegalArgumentException illegalArgumentException3 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: ");
        java.lang.IllegalArgumentException illegalArgumentException8 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException9 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException8);
        java.lang.IllegalArgumentException illegalArgumentException10 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException8);
        java.lang.IllegalArgumentException illegalArgumentException11 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException8);
        java.lang.IllegalArgumentException illegalArgumentException12 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException8);
        java.lang.Throwable[] throwableArray13 = illegalArgumentException12.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException14 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException12);
        illegalArgumentException3.addSuppressed((java.lang.Throwable) illegalArgumentException14);
        java.lang.IllegalArgumentException illegalArgumentException16 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException14);
        java.lang.IllegalArgumentException illegalArgumentException17 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException14);
        java.lang.Class<?> wildcardClass18 = illegalArgumentException14.getClass();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        java.lang.IllegalArgumentException illegalArgumentException3 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException5 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException4);
        illegalArgumentException3.addSuppressed((java.lang.Throwable) illegalArgumentException4);
        java.lang.IllegalArgumentException illegalArgumentException11 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException12 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException11);
        java.lang.IllegalArgumentException illegalArgumentException13 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException11);
        java.lang.IllegalArgumentException illegalArgumentException14 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException11);
        java.lang.IllegalArgumentException illegalArgumentException15 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException11);
        illegalArgumentException4.addSuppressed((java.lang.Throwable) illegalArgumentException15);
        java.lang.IllegalArgumentException illegalArgumentException17 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: ", (java.lang.Throwable) illegalArgumentException4);
        java.lang.IllegalArgumentException illegalArgumentException21 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException22 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException23 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException22);
        illegalArgumentException21.addSuppressed((java.lang.Throwable) illegalArgumentException22);
        java.lang.IllegalArgumentException illegalArgumentException25 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException22);
        java.lang.IllegalArgumentException illegalArgumentException26 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException25);
        illegalArgumentException17.addSuppressed((java.lang.Throwable) illegalArgumentException25);
        java.lang.IllegalArgumentException illegalArgumentException28 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException17);
        java.lang.Throwable[] throwableArray29 = illegalArgumentException17.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray29);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) 'a', (long) 100);
        long long6 = arithmeticUtilsNew0.subAndCheck((long) 6, 4L);
        long long9 = arithmeticUtilsNew0.subAndCheck((long) (-6), (long) 10);
        long long12 = arithmeticUtilsNew0.subAndCheck((-4L), 8L);
        long long15 = arithmeticUtilsNew0.subAndCheck((long) (-3), 3L);
        long long18 = arithmeticUtilsNew0.subAndCheck((long) 2, 55L);
        long long21 = arithmeticUtilsNew0.subAndCheck((long) 0, (long) (-10));
        long long24 = arithmeticUtilsNew0.subAndCheck(249L, 116L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3L) + "'", long3 == (-3L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-16L) + "'", long9 == (-16L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-12L) + "'", long12 == (-12L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-6L) + "'", long15 == (-6L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-53L) + "'", long18 == (-53L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 133L + "'", long24 == 133L);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException("");
        java.lang.IllegalArgumentException illegalArgumentException5 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException4);
        java.lang.IllegalArgumentException illegalArgumentException6 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException5);
        java.lang.IllegalArgumentException illegalArgumentException7 = new java.lang.IllegalArgumentException();
        illegalArgumentException5.addSuppressed((java.lang.Throwable) illegalArgumentException7);
        java.lang.IllegalArgumentException illegalArgumentException9 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException5);
        java.lang.IllegalArgumentException illegalArgumentException13 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException14 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException15 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException14);
        illegalArgumentException13.addSuppressed((java.lang.Throwable) illegalArgumentException14);
        java.lang.IllegalArgumentException illegalArgumentException17 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException14);
        java.lang.IllegalArgumentException illegalArgumentException18 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException17);
        java.lang.IllegalArgumentException illegalArgumentException19 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException17);
        illegalArgumentException9.addSuppressed((java.lang.Throwable) illegalArgumentException17);
        java.lang.IllegalArgumentException illegalArgumentException21 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: ", (java.lang.Throwable) illegalArgumentException17);
        java.lang.IllegalArgumentException illegalArgumentException25 = new java.lang.IllegalArgumentException("");
        java.lang.IllegalArgumentException illegalArgumentException26 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException25);
        java.lang.IllegalArgumentException illegalArgumentException27 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException26);
        java.lang.IllegalArgumentException illegalArgumentException28 = new java.lang.IllegalArgumentException();
        illegalArgumentException26.addSuppressed((java.lang.Throwable) illegalArgumentException28);
        java.lang.IllegalArgumentException illegalArgumentException30 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException26);
        java.lang.IllegalArgumentException illegalArgumentException31 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: ", (java.lang.Throwable) illegalArgumentException26);
        java.lang.IllegalArgumentException illegalArgumentException32 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException26);
        illegalArgumentException17.addSuppressed((java.lang.Throwable) illegalArgumentException26);
        java.lang.IllegalArgumentException illegalArgumentException34 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException", (java.lang.Throwable) illegalArgumentException26);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        java.lang.Throwable throwable1 = null;
        java.lang.IllegalArgumentException illegalArgumentException2 = new java.lang.IllegalArgumentException("hi!", throwable1);
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: ");
        illegalArgumentException2.addSuppressed((java.lang.Throwable) illegalArgumentException4);
        java.lang.IllegalArgumentException illegalArgumentException6 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException2);
        java.lang.IllegalArgumentException illegalArgumentException9 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException10 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException11 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException10);
        illegalArgumentException9.addSuppressed((java.lang.Throwable) illegalArgumentException10);
        java.lang.IllegalArgumentException illegalArgumentException13 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException10);
        java.lang.Throwable[] throwableArray14 = illegalArgumentException13.getSuppressed();
        java.lang.Throwable[] throwableArray15 = illegalArgumentException13.getSuppressed();
        illegalArgumentException2.addSuppressed((java.lang.Throwable) illegalArgumentException13);
        java.lang.IllegalArgumentException illegalArgumentException17 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException2);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) 9, (-10L));
        long long6 = arithmeticUtilsNew0.subAndCheck(7L, (long) 1);
        long long9 = arithmeticUtilsNew0.subAndCheck((-11L), (long) 4);
        long long12 = arithmeticUtilsNew0.subAndCheck((-2L), 3L);
        long long15 = arithmeticUtilsNew0.subAndCheck((long) 4, 112L);
        long long18 = arithmeticUtilsNew0.subAndCheck(122L, (long) (-4));
        long long21 = arithmeticUtilsNew0.subAndCheck((-72L), 21L);
        long long24 = arithmeticUtilsNew0.subAndCheck(399L, (-41L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 19L + "'", long3 == 19L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 6L + "'", long6 == 6L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-15L) + "'", long9 == (-15L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-5L) + "'", long12 == (-5L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-108L) + "'", long15 == (-108L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 126L + "'", long18 == 126L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-93L) + "'", long21 == (-93L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 440L + "'", long24 == 440L);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        java.lang.IllegalArgumentException illegalArgumentException6 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException7 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException6);
        java.lang.IllegalArgumentException illegalArgumentException8 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException6);
        java.lang.IllegalArgumentException illegalArgumentException9 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException6);
        java.lang.Throwable[] throwableArray10 = illegalArgumentException9.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException13 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException14 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException13);
        java.lang.IllegalArgumentException illegalArgumentException15 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException", (java.lang.Throwable) illegalArgumentException14);
        illegalArgumentException9.addSuppressed((java.lang.Throwable) illegalArgumentException14);
        java.lang.IllegalArgumentException illegalArgumentException17 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException9);
        java.lang.IllegalArgumentException illegalArgumentException18 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException9);
        java.lang.IllegalArgumentException illegalArgumentException22 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException23 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException22);
        java.lang.IllegalArgumentException illegalArgumentException25 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!");
        illegalArgumentException23.addSuppressed((java.lang.Throwable) illegalArgumentException25);
        java.lang.IllegalArgumentException illegalArgumentException27 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException25);
        illegalArgumentException18.addSuppressed((java.lang.Throwable) illegalArgumentException27);
        java.lang.IllegalArgumentException illegalArgumentException32 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException33 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException34 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException33);
        illegalArgumentException32.addSuppressed((java.lang.Throwable) illegalArgumentException33);
        java.lang.IllegalArgumentException illegalArgumentException36 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException33);
        java.lang.IllegalArgumentException illegalArgumentException37 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException36);
        java.lang.IllegalArgumentException illegalArgumentException38 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException36);
        illegalArgumentException18.addSuppressed((java.lang.Throwable) illegalArgumentException36);
        java.lang.IllegalArgumentException illegalArgumentException40 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException18);
        java.lang.IllegalArgumentException illegalArgumentException41 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException18);
        java.lang.IllegalArgumentException illegalArgumentException42 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException", (java.lang.Throwable) illegalArgumentException41);
        java.lang.Throwable[] throwableArray43 = illegalArgumentException42.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray43);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        java.lang.IllegalArgumentException illegalArgumentException1 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!");
        java.lang.String str2 = illegalArgumentException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!" + "'", str2, "java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!");
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) 9, (-10L));
        long long6 = arithmeticUtilsNew0.subAndCheck(7L, (long) 1);
        long long9 = arithmeticUtilsNew0.subAndCheck(1L, (long) (-100));
        long long12 = arithmeticUtilsNew0.subAndCheck((long) (short) 10, (long) (-10));
        long long15 = arithmeticUtilsNew0.subAndCheck(0L, (long) (-100));
        long long18 = arithmeticUtilsNew0.subAndCheck(5L, (long) 100);
        long long21 = arithmeticUtilsNew0.subAndCheck((-95L), 0L);
        long long24 = arithmeticUtilsNew0.subAndCheck((long) ' ', 127L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 19L + "'", long3 == 19L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 6L + "'", long6 == 6L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 101L + "'", long9 == 101L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 20L + "'", long12 == 20L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-95L) + "'", long18 == (-95L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-95L) + "'", long21 == (-95L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-95L) + "'", long24 == (-95L));
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        java.lang.IllegalArgumentException illegalArgumentException3 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException5 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException4);
        illegalArgumentException3.addSuppressed((java.lang.Throwable) illegalArgumentException4);
        java.lang.IllegalArgumentException illegalArgumentException11 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException12 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException11);
        java.lang.IllegalArgumentException illegalArgumentException13 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException11);
        java.lang.IllegalArgumentException illegalArgumentException14 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException11);
        java.lang.IllegalArgumentException illegalArgumentException15 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException11);
        illegalArgumentException4.addSuppressed((java.lang.Throwable) illegalArgumentException15);
        java.lang.IllegalArgumentException illegalArgumentException17 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: ", (java.lang.Throwable) illegalArgumentException4);
        java.lang.IllegalArgumentException illegalArgumentException22 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException23 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException22);
        java.lang.IllegalArgumentException illegalArgumentException24 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException22);
        java.lang.IllegalArgumentException illegalArgumentException25 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException22);
        java.lang.IllegalArgumentException illegalArgumentException26 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException22);
        java.lang.Throwable[] throwableArray27 = illegalArgumentException22.getSuppressed();
        java.lang.Throwable[] throwableArray28 = illegalArgumentException22.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException29 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException22);
        illegalArgumentException4.addSuppressed((java.lang.Throwable) illegalArgumentException22);
        java.lang.IllegalArgumentException illegalArgumentException34 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException35 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException34);
        java.lang.IllegalArgumentException illegalArgumentException36 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException34);
        java.lang.IllegalArgumentException illegalArgumentException37 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException34);
        java.lang.Throwable[] throwableArray38 = illegalArgumentException37.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException41 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException42 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException41);
        java.lang.IllegalArgumentException illegalArgumentException43 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException41);
        java.lang.IllegalArgumentException illegalArgumentException45 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException46 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException45);
        java.lang.IllegalArgumentException illegalArgumentException47 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException45);
        illegalArgumentException41.addSuppressed((java.lang.Throwable) illegalArgumentException47);
        java.lang.IllegalArgumentException illegalArgumentException49 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException47);
        java.lang.IllegalArgumentException illegalArgumentException50 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException49);
        illegalArgumentException37.addSuppressed((java.lang.Throwable) illegalArgumentException50);
        illegalArgumentException22.addSuppressed((java.lang.Throwable) illegalArgumentException37);
        java.lang.IllegalArgumentException illegalArgumentException55 = new java.lang.IllegalArgumentException("hi!");
        java.lang.Throwable[] throwableArray56 = illegalArgumentException55.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException57 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException55);
        java.lang.IllegalArgumentException illegalArgumentException58 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException55);
        illegalArgumentException22.addSuppressed((java.lang.Throwable) illegalArgumentException55);
        java.lang.IllegalArgumentException illegalArgumentException60 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException22);
        java.lang.String str61 = illegalArgumentException22.toString();
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "java.lang.IllegalArgumentException" + "'", str61, "java.lang.IllegalArgumentException");
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) 'a', (long) 100);
        long long6 = arithmeticUtilsNew0.subAndCheck((long) 6, 4L);
        long long9 = arithmeticUtilsNew0.subAndCheck((long) (-6), (long) 10);
        long long12 = arithmeticUtilsNew0.subAndCheck((long) (short) 0, (-123L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3L) + "'", long3 == (-3L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-16L) + "'", long9 == (-16L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 123L + "'", long12 == 123L);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        java.lang.IllegalArgumentException illegalArgumentException5 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException6 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException7 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException6);
        illegalArgumentException5.addSuppressed((java.lang.Throwable) illegalArgumentException6);
        java.lang.IllegalArgumentException illegalArgumentException9 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException6);
        java.lang.IllegalArgumentException illegalArgumentException10 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException9);
        java.lang.IllegalArgumentException illegalArgumentException13 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException14 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException15 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException14);
        illegalArgumentException13.addSuppressed((java.lang.Throwable) illegalArgumentException14);
        java.lang.IllegalArgumentException illegalArgumentException17 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException14);
        java.lang.IllegalArgumentException illegalArgumentException21 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException22 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException21);
        java.lang.IllegalArgumentException illegalArgumentException23 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException21);
        java.lang.IllegalArgumentException illegalArgumentException24 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException21);
        java.lang.Throwable[] throwableArray25 = illegalArgumentException24.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException28 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException29 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException28);
        java.lang.IllegalArgumentException illegalArgumentException30 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException", (java.lang.Throwable) illegalArgumentException29);
        illegalArgumentException24.addSuppressed((java.lang.Throwable) illegalArgumentException29);
        illegalArgumentException17.addSuppressed((java.lang.Throwable) illegalArgumentException24);
        illegalArgumentException10.addSuppressed((java.lang.Throwable) illegalArgumentException24);
        java.lang.IllegalArgumentException illegalArgumentException34 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException24);
        java.lang.IllegalArgumentException illegalArgumentException35 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException34);
        java.lang.IllegalArgumentException illegalArgumentException36 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException35);
        java.lang.IllegalArgumentException illegalArgumentException41 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException42 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException41);
        java.lang.IllegalArgumentException illegalArgumentException43 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException41);
        java.lang.IllegalArgumentException illegalArgumentException44 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException41);
        java.lang.IllegalArgumentException illegalArgumentException45 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException41);
        java.lang.Throwable[] throwableArray46 = illegalArgumentException41.getSuppressed();
        java.lang.Throwable[] throwableArray47 = illegalArgumentException41.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException48 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException41);
        java.lang.IllegalArgumentException illegalArgumentException50 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException51 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException50);
        java.lang.Throwable[] throwableArray52 = illegalArgumentException51.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException54 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException55 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException54);
        illegalArgumentException51.addSuppressed((java.lang.Throwable) illegalArgumentException55);
        illegalArgumentException48.addSuppressed((java.lang.Throwable) illegalArgumentException51);
        illegalArgumentException35.addSuppressed((java.lang.Throwable) illegalArgumentException51);
        java.lang.IllegalArgumentException illegalArgumentException61 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException62 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException61);
        java.lang.IllegalArgumentException illegalArgumentException63 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException61);
        java.lang.IllegalArgumentException illegalArgumentException65 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException66 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException65);
        java.lang.IllegalArgumentException illegalArgumentException67 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException65);
        illegalArgumentException61.addSuppressed((java.lang.Throwable) illegalArgumentException67);
        java.lang.IllegalArgumentException illegalArgumentException69 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException61);
        illegalArgumentException35.addSuppressed((java.lang.Throwable) illegalArgumentException61);
        java.lang.IllegalArgumentException illegalArgumentException71 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException61);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray52);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        java.lang.IllegalArgumentException illegalArgumentException0 = new java.lang.IllegalArgumentException();
        java.lang.Throwable[] throwableArray1 = illegalArgumentException0.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException2 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException0);
        java.lang.IllegalArgumentException illegalArgumentException3 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException2);
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException3);
        java.lang.Class<?> wildcardClass5 = illegalArgumentException4.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) 9, (-10L));
        long long6 = arithmeticUtilsNew0.subAndCheck(7L, (long) 1);
        long long9 = arithmeticUtilsNew0.subAndCheck(1L, (long) (-100));
        long long12 = arithmeticUtilsNew0.subAndCheck((long) (short) 10, (long) (-10));
        long long15 = arithmeticUtilsNew0.subAndCheck(0L, (long) (-100));
        long long18 = arithmeticUtilsNew0.subAndCheck(5L, (long) 100);
        long long21 = arithmeticUtilsNew0.subAndCheck(9L, (long) 5);
        long long24 = arithmeticUtilsNew0.subAndCheck((-12L), 191L);
        long long27 = arithmeticUtilsNew0.subAndCheck((-132L), (-381L));
        long long30 = arithmeticUtilsNew0.subAndCheck((long) 0, (-160L));
        long long33 = arithmeticUtilsNew0.subAndCheck(3L, 109L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 19L + "'", long3 == 19L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 6L + "'", long6 == 6L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 101L + "'", long9 == 101L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 20L + "'", long12 == 20L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-95L) + "'", long18 == (-95L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 4L + "'", long21 == 4L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-203L) + "'", long24 == (-203L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 249L + "'", long27 == 249L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 160L + "'", long30 == 160L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-106L) + "'", long33 == (-106L));
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        java.lang.IllegalArgumentException illegalArgumentException5 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException6 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException5);
        java.lang.IllegalArgumentException illegalArgumentException7 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException5);
        java.lang.IllegalArgumentException illegalArgumentException8 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException5);
        java.lang.Throwable[] throwableArray9 = illegalArgumentException5.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException10 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException5);
        java.lang.IllegalArgumentException illegalArgumentException11 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException10);
        java.lang.IllegalArgumentException illegalArgumentException12 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException10);
        java.lang.IllegalArgumentException illegalArgumentException13 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException10);
        java.lang.String str14 = illegalArgumentException10.toString();
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.IllegalArgumentException: hi!" + "'", str14, "java.lang.IllegalArgumentException: hi!");
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        java.lang.IllegalArgumentException illegalArgumentException5 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException6 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException5);
        java.lang.IllegalArgumentException illegalArgumentException7 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException5);
        java.lang.IllegalArgumentException illegalArgumentException8 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException5);
        java.lang.IllegalArgumentException illegalArgumentException9 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException5);
        java.lang.Throwable[] throwableArray10 = illegalArgumentException5.getSuppressed();
        java.lang.Throwable[] throwableArray11 = illegalArgumentException5.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException12 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException5);
        java.lang.IllegalArgumentException illegalArgumentException15 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!");
        java.lang.IllegalArgumentException illegalArgumentException16 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException15);
        java.lang.IllegalArgumentException illegalArgumentException17 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException16);
        illegalArgumentException5.addSuppressed((java.lang.Throwable) illegalArgumentException17);
        java.lang.IllegalArgumentException illegalArgumentException19 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException5);
        java.lang.IllegalArgumentException illegalArgumentException20 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException19);
        java.lang.IllegalArgumentException illegalArgumentException24 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException25 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException24);
        java.lang.IllegalArgumentException illegalArgumentException26 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException24);
        java.lang.IllegalArgumentException illegalArgumentException27 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException26);
        java.lang.IllegalArgumentException illegalArgumentException28 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException27);
        illegalArgumentException20.addSuppressed((java.lang.Throwable) illegalArgumentException28);
        java.lang.IllegalArgumentException illegalArgumentException30 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException28);
        java.lang.IllegalArgumentException illegalArgumentException31 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException30);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) 9, (-10L));
        long long6 = arithmeticUtilsNew0.subAndCheck(7L, (long) 1);
        long long9 = arithmeticUtilsNew0.subAndCheck(1L, (long) (-100));
        long long12 = arithmeticUtilsNew0.subAndCheck((long) (short) 10, (long) (-10));
        long long15 = arithmeticUtilsNew0.subAndCheck((-19L), (long) (-7));
        long long18 = arithmeticUtilsNew0.subAndCheck((-212L), (-57L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 19L + "'", long3 == 19L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 6L + "'", long6 == 6L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 101L + "'", long9 == 101L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 20L + "'", long12 == 20L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-12L) + "'", long15 == (-12L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-155L) + "'", long18 == (-155L));
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        java.lang.IllegalArgumentException illegalArgumentException1 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException2 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException1);
        java.lang.String str3 = illegalArgumentException1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.IllegalArgumentException" + "'", str3, "java.lang.IllegalArgumentException");
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        java.lang.IllegalArgumentException illegalArgumentException3 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException3);
        java.lang.IllegalArgumentException illegalArgumentException6 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!");
        illegalArgumentException4.addSuppressed((java.lang.Throwable) illegalArgumentException6);
        java.lang.IllegalArgumentException illegalArgumentException8 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException6);
        java.lang.IllegalArgumentException illegalArgumentException11 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException12 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException13 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException12);
        illegalArgumentException11.addSuppressed((java.lang.Throwable) illegalArgumentException12);
        java.lang.IllegalArgumentException illegalArgumentException15 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException12);
        java.lang.IllegalArgumentException illegalArgumentException16 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException15);
        java.lang.IllegalArgumentException illegalArgumentException17 = new java.lang.IllegalArgumentException();
        java.lang.Throwable[] throwableArray18 = illegalArgumentException17.getSuppressed();
        illegalArgumentException15.addSuppressed((java.lang.Throwable) illegalArgumentException17);
        illegalArgumentException8.addSuppressed((java.lang.Throwable) illegalArgumentException15);
        java.lang.String str21 = illegalArgumentException15.toString();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.IllegalArgumentException: java.lang.IllegalArgumentException" + "'", str21, "java.lang.IllegalArgumentException: java.lang.IllegalArgumentException");
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) 'a', (long) 100);
        long long6 = arithmeticUtilsNew0.subAndCheck((long) 6, 4L);
        long long9 = arithmeticUtilsNew0.subAndCheck((long) 2, (long) 100);
        long long12 = arithmeticUtilsNew0.subAndCheck((long) (byte) 10, (long) (short) -1);
        long long15 = arithmeticUtilsNew0.subAndCheck((-5L), 9L);
        long long18 = arithmeticUtilsNew0.subAndCheck(0L, (long) 100);
        long long21 = arithmeticUtilsNew0.subAndCheck(5L, (-5L));
        long long24 = arithmeticUtilsNew0.subAndCheck(0L, (long) 0);
        long long27 = arithmeticUtilsNew0.subAndCheck(633L, (-169L));
        java.lang.Class<?> wildcardClass28 = arithmeticUtilsNew0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3L) + "'", long3 == (-3L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-98L) + "'", long9 == (-98L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 11L + "'", long12 == 11L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-14L) + "'", long15 == (-14L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-100L) + "'", long18 == (-100L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 802L + "'", long27 == 802L);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException5 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException6 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException5);
        illegalArgumentException4.addSuppressed((java.lang.Throwable) illegalArgumentException5);
        java.lang.IllegalArgumentException illegalArgumentException12 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException13 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException12);
        java.lang.IllegalArgumentException illegalArgumentException14 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException12);
        java.lang.IllegalArgumentException illegalArgumentException15 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException12);
        java.lang.IllegalArgumentException illegalArgumentException16 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException12);
        illegalArgumentException5.addSuppressed((java.lang.Throwable) illegalArgumentException16);
        java.lang.IllegalArgumentException illegalArgumentException18 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: ", (java.lang.Throwable) illegalArgumentException5);
        java.lang.IllegalArgumentException illegalArgumentException19 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException18);
        java.lang.IllegalArgumentException illegalArgumentException20 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException19);
        java.lang.IllegalArgumentException illegalArgumentException22 = new java.lang.IllegalArgumentException("");
        java.lang.IllegalArgumentException illegalArgumentException23 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException22);
        java.lang.IllegalArgumentException illegalArgumentException24 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException23);
        java.lang.IllegalArgumentException illegalArgumentException25 = new java.lang.IllegalArgumentException();
        illegalArgumentException23.addSuppressed((java.lang.Throwable) illegalArgumentException25);
        java.lang.IllegalArgumentException illegalArgumentException31 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException32 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException31);
        java.lang.IllegalArgumentException illegalArgumentException33 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException31);
        java.lang.IllegalArgumentException illegalArgumentException34 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException31);
        java.lang.IllegalArgumentException illegalArgumentException35 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException31);
        java.lang.Throwable[] throwableArray36 = illegalArgumentException31.getSuppressed();
        java.lang.Throwable[] throwableArray37 = illegalArgumentException31.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException38 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException31);
        java.lang.IllegalArgumentException illegalArgumentException41 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!");
        java.lang.IllegalArgumentException illegalArgumentException42 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException41);
        java.lang.IllegalArgumentException illegalArgumentException43 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException42);
        illegalArgumentException31.addSuppressed((java.lang.Throwable) illegalArgumentException43);
        java.lang.IllegalArgumentException illegalArgumentException45 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException31);
        illegalArgumentException23.addSuppressed((java.lang.Throwable) illegalArgumentException45);
        java.lang.Throwable[] throwableArray47 = illegalArgumentException45.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException48 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException45);
        java.lang.IllegalArgumentException illegalArgumentException54 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException55 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException54);
        java.lang.IllegalArgumentException illegalArgumentException56 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException54);
        java.lang.IllegalArgumentException illegalArgumentException57 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException54);
        java.lang.IllegalArgumentException illegalArgumentException58 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException54);
        java.lang.IllegalArgumentException illegalArgumentException59 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException58);
        java.lang.IllegalArgumentException illegalArgumentException60 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException58);
        java.lang.IllegalArgumentException illegalArgumentException61 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException62 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException61);
        java.lang.IllegalArgumentException illegalArgumentException66 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException67 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException66);
        java.lang.IllegalArgumentException illegalArgumentException68 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException66);
        java.lang.IllegalArgumentException illegalArgumentException69 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException66);
        java.lang.Throwable[] throwableArray70 = illegalArgumentException69.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException73 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException74 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException73);
        java.lang.IllegalArgumentException illegalArgumentException75 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException", (java.lang.Throwable) illegalArgumentException74);
        illegalArgumentException69.addSuppressed((java.lang.Throwable) illegalArgumentException74);
        java.lang.IllegalArgumentException illegalArgumentException77 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException69);
        illegalArgumentException62.addSuppressed((java.lang.Throwable) illegalArgumentException69);
        java.lang.IllegalArgumentException illegalArgumentException79 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException69);
        illegalArgumentException60.addSuppressed((java.lang.Throwable) illegalArgumentException79);
        illegalArgumentException48.addSuppressed((java.lang.Throwable) illegalArgumentException60);
        java.lang.Throwable[] throwableArray82 = illegalArgumentException60.getSuppressed();
        illegalArgumentException20.addSuppressed((java.lang.Throwable) illegalArgumentException60);
        java.lang.IllegalArgumentException illegalArgumentException84 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException20);
        java.lang.Throwable[] throwableArray85 = illegalArgumentException84.getSuppressed();
        java.lang.String str86 = illegalArgumentException84.toString();
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertNotNull(throwableArray82);
        org.junit.Assert.assertNotNull(throwableArray85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!" + "'", str86, "java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!");
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        java.lang.IllegalArgumentException illegalArgumentException6 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException7 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException8 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException7);
        illegalArgumentException6.addSuppressed((java.lang.Throwable) illegalArgumentException7);
        java.lang.IllegalArgumentException illegalArgumentException10 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException7);
        java.lang.IllegalArgumentException illegalArgumentException11 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException10);
        java.lang.IllegalArgumentException illegalArgumentException14 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException15 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException16 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException15);
        illegalArgumentException14.addSuppressed((java.lang.Throwable) illegalArgumentException15);
        java.lang.IllegalArgumentException illegalArgumentException18 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException15);
        java.lang.IllegalArgumentException illegalArgumentException22 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException23 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException22);
        java.lang.IllegalArgumentException illegalArgumentException24 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException22);
        java.lang.IllegalArgumentException illegalArgumentException25 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException22);
        java.lang.Throwable[] throwableArray26 = illegalArgumentException25.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException29 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException30 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException29);
        java.lang.IllegalArgumentException illegalArgumentException31 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException", (java.lang.Throwable) illegalArgumentException30);
        illegalArgumentException25.addSuppressed((java.lang.Throwable) illegalArgumentException30);
        illegalArgumentException18.addSuppressed((java.lang.Throwable) illegalArgumentException25);
        illegalArgumentException11.addSuppressed((java.lang.Throwable) illegalArgumentException25);
        java.lang.IllegalArgumentException illegalArgumentException35 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException25);
        java.lang.IllegalArgumentException illegalArgumentException36 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException35);
        java.lang.IllegalArgumentException illegalArgumentException40 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException41 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException40);
        java.lang.IllegalArgumentException illegalArgumentException43 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!");
        illegalArgumentException41.addSuppressed((java.lang.Throwable) illegalArgumentException43);
        java.lang.IllegalArgumentException illegalArgumentException45 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException43);
        illegalArgumentException35.addSuppressed((java.lang.Throwable) illegalArgumentException45);
        java.lang.IllegalArgumentException illegalArgumentException47 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException45);
        java.lang.Throwable[] throwableArray48 = illegalArgumentException47.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray48);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        java.lang.Throwable throwable1 = null;
        java.lang.IllegalArgumentException illegalArgumentException2 = new java.lang.IllegalArgumentException("hi!", throwable1);
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: ");
        illegalArgumentException2.addSuppressed((java.lang.Throwable) illegalArgumentException4);
        java.lang.IllegalArgumentException illegalArgumentException6 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException4);
        java.lang.IllegalArgumentException illegalArgumentException7 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException4);
        java.lang.IllegalArgumentException illegalArgumentException12 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException13 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException12);
        java.lang.IllegalArgumentException illegalArgumentException14 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException12);
        java.lang.IllegalArgumentException illegalArgumentException15 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException12);
        java.lang.Throwable[] throwableArray16 = illegalArgumentException15.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException19 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException20 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException19);
        java.lang.IllegalArgumentException illegalArgumentException21 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException", (java.lang.Throwable) illegalArgumentException20);
        illegalArgumentException15.addSuppressed((java.lang.Throwable) illegalArgumentException20);
        java.lang.Throwable[] throwableArray23 = illegalArgumentException15.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException24 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException15);
        java.lang.Throwable[] throwableArray25 = illegalArgumentException15.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException26 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException15);
        java.lang.IllegalArgumentException illegalArgumentException27 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException26);
        java.lang.IllegalArgumentException illegalArgumentException28 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException26);
        java.lang.Throwable[] throwableArray29 = illegalArgumentException28.getSuppressed();
        illegalArgumentException4.addSuppressed((java.lang.Throwable) illegalArgumentException28);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray29);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        java.lang.IllegalArgumentException illegalArgumentException2 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!");
        java.lang.IllegalArgumentException illegalArgumentException7 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException8 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException7);
        java.lang.IllegalArgumentException illegalArgumentException9 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException7);
        java.lang.IllegalArgumentException illegalArgumentException10 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException7);
        java.lang.IllegalArgumentException illegalArgumentException11 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException7);
        java.lang.Throwable[] throwableArray12 = illegalArgumentException11.getSuppressed();
        illegalArgumentException2.addSuppressed((java.lang.Throwable) illegalArgumentException11);
        java.lang.Throwable[] throwableArray14 = illegalArgumentException2.getSuppressed();
        java.lang.Throwable[] throwableArray15 = illegalArgumentException2.getSuppressed();
        java.lang.Throwable[] throwableArray16 = illegalArgumentException2.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException17 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: ", (java.lang.Throwable) illegalArgumentException2);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        java.lang.IllegalArgumentException illegalArgumentException5 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException6 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException5);
        java.lang.IllegalArgumentException illegalArgumentException7 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException5);
        java.lang.IllegalArgumentException illegalArgumentException8 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException5);
        java.lang.Throwable[] throwableArray9 = illegalArgumentException8.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException12 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException13 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException12);
        java.lang.IllegalArgumentException illegalArgumentException14 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException", (java.lang.Throwable) illegalArgumentException13);
        illegalArgumentException8.addSuppressed((java.lang.Throwable) illegalArgumentException13);
        java.lang.IllegalArgumentException illegalArgumentException16 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException8);
        java.lang.IllegalArgumentException illegalArgumentException17 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException8);
        java.lang.IllegalArgumentException illegalArgumentException21 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException22 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException21);
        java.lang.IllegalArgumentException illegalArgumentException24 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!");
        illegalArgumentException22.addSuppressed((java.lang.Throwable) illegalArgumentException24);
        java.lang.IllegalArgumentException illegalArgumentException26 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException24);
        illegalArgumentException17.addSuppressed((java.lang.Throwable) illegalArgumentException26);
        java.lang.IllegalArgumentException illegalArgumentException28 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException17);
        java.lang.IllegalArgumentException illegalArgumentException29 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException28);
        java.lang.IllegalArgumentException illegalArgumentException30 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException29);
        java.lang.Throwable[] throwableArray31 = illegalArgumentException29.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException32 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException29);
        java.lang.Throwable[] throwableArray33 = illegalArgumentException32.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray33);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException5 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException6 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException5);
        illegalArgumentException4.addSuppressed((java.lang.Throwable) illegalArgumentException5);
        java.lang.IllegalArgumentException illegalArgumentException8 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException5);
        java.lang.IllegalArgumentException illegalArgumentException9 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException8);
        java.lang.IllegalArgumentException illegalArgumentException10 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException8);
        java.lang.IllegalArgumentException illegalArgumentException11 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException10);
        java.lang.IllegalArgumentException illegalArgumentException16 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException17 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException16);
        java.lang.IllegalArgumentException illegalArgumentException18 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException16);
        java.lang.IllegalArgumentException illegalArgumentException19 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException16);
        java.lang.Throwable[] throwableArray20 = illegalArgumentException19.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException23 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException24 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException23);
        java.lang.IllegalArgumentException illegalArgumentException25 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException", (java.lang.Throwable) illegalArgumentException24);
        illegalArgumentException19.addSuppressed((java.lang.Throwable) illegalArgumentException24);
        java.lang.IllegalArgumentException illegalArgumentException27 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException19);
        java.lang.IllegalArgumentException illegalArgumentException28 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException19);
        java.lang.IllegalArgumentException illegalArgumentException32 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException33 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException32);
        java.lang.IllegalArgumentException illegalArgumentException35 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!");
        illegalArgumentException33.addSuppressed((java.lang.Throwable) illegalArgumentException35);
        java.lang.IllegalArgumentException illegalArgumentException37 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException35);
        illegalArgumentException28.addSuppressed((java.lang.Throwable) illegalArgumentException37);
        illegalArgumentException10.addSuppressed((java.lang.Throwable) illegalArgumentException37);
        java.lang.Throwable[] throwableArray40 = illegalArgumentException10.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException41 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException10);
        java.lang.IllegalArgumentException illegalArgumentException42 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException10);
        java.lang.Throwable[] throwableArray43 = illegalArgumentException42.getSuppressed();
        java.lang.Throwable[] throwableArray44 = illegalArgumentException42.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException48 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!");
        java.lang.IllegalArgumentException illegalArgumentException49 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException48);
        java.lang.Throwable[] throwableArray50 = illegalArgumentException49.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException51 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException", (java.lang.Throwable) illegalArgumentException49);
        illegalArgumentException42.addSuppressed((java.lang.Throwable) illegalArgumentException51);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray50);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        java.lang.IllegalArgumentException illegalArgumentException1 = new java.lang.IllegalArgumentException("");
        java.lang.IllegalArgumentException illegalArgumentException2 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException1);
        java.lang.IllegalArgumentException illegalArgumentException3 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException2);
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException();
        illegalArgumentException2.addSuppressed((java.lang.Throwable) illegalArgumentException4);
        java.lang.IllegalArgumentException illegalArgumentException10 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException11 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException10);
        java.lang.IllegalArgumentException illegalArgumentException12 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException10);
        java.lang.IllegalArgumentException illegalArgumentException13 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException10);
        java.lang.IllegalArgumentException illegalArgumentException14 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException10);
        java.lang.Throwable[] throwableArray15 = illegalArgumentException10.getSuppressed();
        java.lang.Throwable[] throwableArray16 = illegalArgumentException10.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException17 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException10);
        java.lang.IllegalArgumentException illegalArgumentException20 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!");
        java.lang.IllegalArgumentException illegalArgumentException21 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException20);
        java.lang.IllegalArgumentException illegalArgumentException22 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException21);
        illegalArgumentException10.addSuppressed((java.lang.Throwable) illegalArgumentException22);
        java.lang.IllegalArgumentException illegalArgumentException24 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException10);
        illegalArgumentException2.addSuppressed((java.lang.Throwable) illegalArgumentException24);
        java.lang.Throwable[] throwableArray26 = illegalArgumentException24.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException27 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException24);
        java.lang.IllegalArgumentException illegalArgumentException28 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException24);
        java.lang.String str29 = illegalArgumentException24.toString();
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "java.lang.IllegalArgumentException: java.lang.IllegalArgumentException" + "'", str29, "java.lang.IllegalArgumentException: java.lang.IllegalArgumentException");
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException5 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException4);
        java.lang.IllegalArgumentException illegalArgumentException6 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException4);
        java.lang.IllegalArgumentException illegalArgumentException7 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException4);
        java.lang.IllegalArgumentException illegalArgumentException8 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException4);
        java.lang.Throwable[] throwableArray9 = illegalArgumentException4.getSuppressed();
        java.lang.Throwable[] throwableArray10 = illegalArgumentException4.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException11 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException4);
        java.lang.IllegalArgumentException illegalArgumentException14 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!");
        java.lang.IllegalArgumentException illegalArgumentException15 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException14);
        java.lang.IllegalArgumentException illegalArgumentException16 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException15);
        illegalArgumentException4.addSuppressed((java.lang.Throwable) illegalArgumentException16);
        java.lang.IllegalArgumentException illegalArgumentException18 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException4);
        java.lang.IllegalArgumentException illegalArgumentException19 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException18);
        java.lang.IllegalArgumentException illegalArgumentException23 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException24 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException23);
        java.lang.IllegalArgumentException illegalArgumentException25 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException23);
        java.lang.IllegalArgumentException illegalArgumentException26 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException25);
        java.lang.IllegalArgumentException illegalArgumentException27 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException26);
        illegalArgumentException19.addSuppressed((java.lang.Throwable) illegalArgumentException27);
        java.lang.IllegalArgumentException illegalArgumentException29 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException27);
        java.lang.String str30 = illegalArgumentException27.toString();
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: " + "'", str30, "java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: ");
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        java.lang.IllegalArgumentException illegalArgumentException3 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException5 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException4);
        illegalArgumentException3.addSuppressed((java.lang.Throwable) illegalArgumentException4);
        java.lang.IllegalArgumentException illegalArgumentException8 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!");
        java.lang.IllegalArgumentException illegalArgumentException10 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException11 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException12 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException11);
        illegalArgumentException10.addSuppressed((java.lang.Throwable) illegalArgumentException11);
        java.lang.IllegalArgumentException illegalArgumentException18 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException19 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException18);
        java.lang.IllegalArgumentException illegalArgumentException20 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException18);
        java.lang.IllegalArgumentException illegalArgumentException21 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException18);
        java.lang.IllegalArgumentException illegalArgumentException22 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException18);
        illegalArgumentException11.addSuppressed((java.lang.Throwable) illegalArgumentException22);
        java.lang.IllegalArgumentException illegalArgumentException26 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException27 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException26);
        java.lang.IllegalArgumentException illegalArgumentException28 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException26);
        illegalArgumentException11.addSuppressed((java.lang.Throwable) illegalArgumentException28);
        java.lang.Throwable[] throwableArray30 = illegalArgumentException28.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException31 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException28);
        illegalArgumentException8.addSuppressed((java.lang.Throwable) illegalArgumentException28);
        java.lang.IllegalArgumentException illegalArgumentException34 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!");
        illegalArgumentException28.addSuppressed((java.lang.Throwable) illegalArgumentException34);
        illegalArgumentException3.addSuppressed((java.lang.Throwable) illegalArgumentException34);
        java.lang.IllegalArgumentException illegalArgumentException37 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: ", (java.lang.Throwable) illegalArgumentException3);
        java.lang.IllegalArgumentException illegalArgumentException43 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException44 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException43);
        java.lang.IllegalArgumentException illegalArgumentException45 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException43);
        java.lang.IllegalArgumentException illegalArgumentException46 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException43);
        java.lang.Throwable[] throwableArray47 = illegalArgumentException43.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException48 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException43);
        java.lang.IllegalArgumentException illegalArgumentException49 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException43);
        java.lang.IllegalArgumentException illegalArgumentException54 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException55 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException56 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException55);
        illegalArgumentException54.addSuppressed((java.lang.Throwable) illegalArgumentException55);
        java.lang.IllegalArgumentException illegalArgumentException58 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException55);
        java.lang.IllegalArgumentException illegalArgumentException59 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException58);
        java.lang.IllegalArgumentException illegalArgumentException62 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException63 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException64 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException63);
        illegalArgumentException62.addSuppressed((java.lang.Throwable) illegalArgumentException63);
        java.lang.IllegalArgumentException illegalArgumentException66 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException63);
        java.lang.IllegalArgumentException illegalArgumentException70 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException71 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException70);
        java.lang.IllegalArgumentException illegalArgumentException72 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException70);
        java.lang.IllegalArgumentException illegalArgumentException73 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException70);
        java.lang.Throwable[] throwableArray74 = illegalArgumentException73.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException77 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException78 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException77);
        java.lang.IllegalArgumentException illegalArgumentException79 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException", (java.lang.Throwable) illegalArgumentException78);
        illegalArgumentException73.addSuppressed((java.lang.Throwable) illegalArgumentException78);
        illegalArgumentException66.addSuppressed((java.lang.Throwable) illegalArgumentException73);
        illegalArgumentException59.addSuppressed((java.lang.Throwable) illegalArgumentException73);
        java.lang.IllegalArgumentException illegalArgumentException83 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException73);
        java.lang.IllegalArgumentException illegalArgumentException84 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException83);
        java.lang.IllegalArgumentException illegalArgumentException85 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException83);
        java.lang.IllegalArgumentException illegalArgumentException86 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException83);
        illegalArgumentException49.addSuppressed((java.lang.Throwable) illegalArgumentException83);
        java.lang.Throwable[] throwableArray88 = illegalArgumentException49.getSuppressed();
        illegalArgumentException3.addSuppressed((java.lang.Throwable) illegalArgumentException49);
        java.lang.IllegalArgumentException illegalArgumentException90 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException49);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(throwableArray88);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        java.lang.IllegalArgumentException illegalArgumentException3 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException5 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException4);
        illegalArgumentException3.addSuppressed((java.lang.Throwable) illegalArgumentException4);
        java.lang.IllegalArgumentException illegalArgumentException7 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException4);
        java.lang.IllegalArgumentException illegalArgumentException8 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException7);
        java.lang.IllegalArgumentException illegalArgumentException11 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException12 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException13 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException12);
        illegalArgumentException11.addSuppressed((java.lang.Throwable) illegalArgumentException12);
        java.lang.IllegalArgumentException illegalArgumentException15 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException12);
        java.lang.IllegalArgumentException illegalArgumentException19 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException20 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException19);
        java.lang.IllegalArgumentException illegalArgumentException21 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException19);
        java.lang.IllegalArgumentException illegalArgumentException22 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException19);
        java.lang.Throwable[] throwableArray23 = illegalArgumentException22.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException26 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException27 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException26);
        java.lang.IllegalArgumentException illegalArgumentException28 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException", (java.lang.Throwable) illegalArgumentException27);
        illegalArgumentException22.addSuppressed((java.lang.Throwable) illegalArgumentException27);
        illegalArgumentException15.addSuppressed((java.lang.Throwable) illegalArgumentException22);
        illegalArgumentException8.addSuppressed((java.lang.Throwable) illegalArgumentException22);
        java.lang.IllegalArgumentException illegalArgumentException35 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException36 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException37 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException36);
        illegalArgumentException35.addSuppressed((java.lang.Throwable) illegalArgumentException36);
        java.lang.IllegalArgumentException illegalArgumentException39 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException36);
        java.lang.IllegalArgumentException illegalArgumentException40 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException39);
        java.lang.IllegalArgumentException illegalArgumentException41 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException39);
        java.lang.IllegalArgumentException illegalArgumentException42 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException41);
        java.lang.Throwable[] throwableArray43 = illegalArgumentException42.getSuppressed();
        illegalArgumentException8.addSuppressed((java.lang.Throwable) illegalArgumentException42);
        java.lang.Throwable throwable47 = null;
        java.lang.IllegalArgumentException illegalArgumentException48 = new java.lang.IllegalArgumentException(throwable47);
        java.lang.Throwable[] throwableArray49 = illegalArgumentException48.getSuppressed();
        java.lang.Throwable throwable50 = null;
        java.lang.IllegalArgumentException illegalArgumentException51 = new java.lang.IllegalArgumentException(throwable50);
        illegalArgumentException48.addSuppressed((java.lang.Throwable) illegalArgumentException51);
        java.lang.IllegalArgumentException illegalArgumentException53 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException51);
        java.lang.IllegalArgumentException illegalArgumentException54 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException53);
        java.lang.IllegalArgumentException illegalArgumentException57 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException58 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException57);
        java.lang.Throwable[] throwableArray59 = illegalArgumentException58.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException60 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException58);
        illegalArgumentException54.addSuppressed((java.lang.Throwable) illegalArgumentException60);
        java.lang.IllegalArgumentException illegalArgumentException62 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException54);
        illegalArgumentException42.addSuppressed((java.lang.Throwable) illegalArgumentException62);
        java.lang.IllegalArgumentException illegalArgumentException64 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException42);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray59);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        java.lang.IllegalArgumentException illegalArgumentException6 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException7 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException6);
        java.lang.IllegalArgumentException illegalArgumentException8 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException6);
        java.lang.IllegalArgumentException illegalArgumentException9 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException6);
        java.lang.IllegalArgumentException illegalArgumentException10 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException6);
        java.lang.Throwable[] throwableArray11 = illegalArgumentException6.getSuppressed();
        java.lang.Throwable[] throwableArray12 = illegalArgumentException6.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException13 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException6);
        java.lang.IllegalArgumentException illegalArgumentException14 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: ", (java.lang.Throwable) illegalArgumentException13);
        java.lang.IllegalArgumentException illegalArgumentException15 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException14);
        java.lang.IllegalArgumentException illegalArgumentException16 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: ", (java.lang.Throwable) illegalArgumentException14);
        java.lang.Class<?> wildcardClass17 = illegalArgumentException14.getClass();
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException5 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException4);
        java.lang.IllegalArgumentException illegalArgumentException6 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException4);
        java.lang.IllegalArgumentException illegalArgumentException7 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException4);
        java.lang.Throwable[] throwableArray8 = illegalArgumentException7.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException11 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException12 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException11);
        java.lang.IllegalArgumentException illegalArgumentException13 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException", (java.lang.Throwable) illegalArgumentException12);
        illegalArgumentException7.addSuppressed((java.lang.Throwable) illegalArgumentException12);
        java.lang.IllegalArgumentException illegalArgumentException15 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException7);
        java.lang.IllegalArgumentException illegalArgumentException16 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException7);
        java.lang.IllegalArgumentException illegalArgumentException20 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException21 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException20);
        java.lang.IllegalArgumentException illegalArgumentException23 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!");
        illegalArgumentException21.addSuppressed((java.lang.Throwable) illegalArgumentException23);
        java.lang.IllegalArgumentException illegalArgumentException25 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException23);
        illegalArgumentException16.addSuppressed((java.lang.Throwable) illegalArgumentException25);
        java.lang.IllegalArgumentException illegalArgumentException27 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException16);
        java.lang.IllegalArgumentException illegalArgumentException28 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException27);
        java.lang.IllegalArgumentException illegalArgumentException29 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException28);
        java.lang.IllegalArgumentException illegalArgumentException30 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException28);
        java.lang.IllegalArgumentException illegalArgumentException31 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException30);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        java.lang.IllegalArgumentException illegalArgumentException2 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException3 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException2);
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException", (java.lang.Throwable) illegalArgumentException3);
        java.lang.Throwable[] throwableArray5 = illegalArgumentException3.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException8 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException9 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException10 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException9);
        illegalArgumentException8.addSuppressed((java.lang.Throwable) illegalArgumentException9);
        java.lang.IllegalArgumentException illegalArgumentException16 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException17 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException16);
        java.lang.IllegalArgumentException illegalArgumentException18 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException16);
        java.lang.IllegalArgumentException illegalArgumentException19 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException16);
        java.lang.IllegalArgumentException illegalArgumentException20 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException16);
        illegalArgumentException9.addSuppressed((java.lang.Throwable) illegalArgumentException20);
        java.lang.IllegalArgumentException illegalArgumentException24 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException25 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException24);
        java.lang.IllegalArgumentException illegalArgumentException26 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException24);
        illegalArgumentException9.addSuppressed((java.lang.Throwable) illegalArgumentException26);
        java.lang.Throwable[] throwableArray28 = illegalArgumentException26.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException29 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException26);
        java.lang.IllegalArgumentException illegalArgumentException30 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException26);
        illegalArgumentException3.addSuppressed((java.lang.Throwable) illegalArgumentException30);
        java.lang.IllegalArgumentException illegalArgumentException34 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException35 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException34);
        illegalArgumentException3.addSuppressed((java.lang.Throwable) illegalArgumentException35);
        java.lang.Throwable[] throwableArray37 = illegalArgumentException3.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException38 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray37);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        java.lang.IllegalArgumentException illegalArgumentException3 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException3);
        java.lang.IllegalArgumentException illegalArgumentException6 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException7 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException6);
        java.lang.Throwable[] throwableArray8 = illegalArgumentException7.getSuppressed();
        java.lang.Throwable[] throwableArray9 = illegalArgumentException7.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException12 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException13 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException12);
        java.lang.IllegalArgumentException illegalArgumentException14 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException13);
        illegalArgumentException7.addSuppressed((java.lang.Throwable) illegalArgumentException13);
        illegalArgumentException3.addSuppressed((java.lang.Throwable) illegalArgumentException7);
        java.lang.IllegalArgumentException illegalArgumentException18 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException19 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException18);
        java.lang.IllegalArgumentException illegalArgumentException21 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException22 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException21);
        java.lang.Throwable[] throwableArray23 = illegalArgumentException22.getSuppressed();
        java.lang.Throwable[] throwableArray24 = illegalArgumentException22.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException27 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException28 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException27);
        java.lang.IllegalArgumentException illegalArgumentException29 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException28);
        illegalArgumentException22.addSuppressed((java.lang.Throwable) illegalArgumentException28);
        illegalArgumentException18.addSuppressed((java.lang.Throwable) illegalArgumentException22);
        illegalArgumentException3.addSuppressed((java.lang.Throwable) illegalArgumentException22);
        java.lang.IllegalArgumentException illegalArgumentException33 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException3);
        java.lang.IllegalArgumentException illegalArgumentException34 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException3);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) 9, (-10L));
        long long6 = arithmeticUtilsNew0.subAndCheck(7L, (long) 1);
        long long9 = arithmeticUtilsNew0.subAndCheck(1L, (long) (-100));
        long long12 = arithmeticUtilsNew0.subAndCheck((long) (short) 10, (long) (-10));
        long long15 = arithmeticUtilsNew0.subAndCheck(0L, (long) (-100));
        long long18 = arithmeticUtilsNew0.subAndCheck((-2L), 5L);
        long long21 = arithmeticUtilsNew0.subAndCheck((long) 5, (long) (-1));
        long long24 = arithmeticUtilsNew0.subAndCheck((-7L), (-4L));
        long long27 = arithmeticUtilsNew0.subAndCheck((-21L), (-491L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 19L + "'", long3 == 19L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 6L + "'", long6 == 6L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 101L + "'", long9 == 101L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 20L + "'", long12 == 20L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-7L) + "'", long18 == (-7L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 6L + "'", long21 == 6L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-3L) + "'", long24 == (-3L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 470L + "'", long27 == 470L);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        java.lang.IllegalArgumentException illegalArgumentException1 = new java.lang.IllegalArgumentException("");
        java.lang.IllegalArgumentException illegalArgumentException2 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException1);
        java.lang.IllegalArgumentException illegalArgumentException3 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException2);
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException();
        illegalArgumentException2.addSuppressed((java.lang.Throwable) illegalArgumentException4);
        java.lang.IllegalArgumentException illegalArgumentException10 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException11 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException10);
        java.lang.IllegalArgumentException illegalArgumentException12 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException10);
        java.lang.IllegalArgumentException illegalArgumentException13 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException10);
        java.lang.IllegalArgumentException illegalArgumentException14 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException10);
        java.lang.Throwable[] throwableArray15 = illegalArgumentException10.getSuppressed();
        java.lang.Throwable[] throwableArray16 = illegalArgumentException10.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException17 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException10);
        java.lang.IllegalArgumentException illegalArgumentException20 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!");
        java.lang.IllegalArgumentException illegalArgumentException21 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException20);
        java.lang.IllegalArgumentException illegalArgumentException22 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException21);
        illegalArgumentException10.addSuppressed((java.lang.Throwable) illegalArgumentException22);
        java.lang.IllegalArgumentException illegalArgumentException24 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException10);
        illegalArgumentException2.addSuppressed((java.lang.Throwable) illegalArgumentException24);
        java.lang.Throwable[] throwableArray26 = illegalArgumentException24.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException27 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException24);
        java.lang.IllegalArgumentException illegalArgumentException33 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException34 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException33);
        java.lang.IllegalArgumentException illegalArgumentException35 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException33);
        java.lang.IllegalArgumentException illegalArgumentException36 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException33);
        java.lang.IllegalArgumentException illegalArgumentException37 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException33);
        java.lang.IllegalArgumentException illegalArgumentException38 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException37);
        java.lang.IllegalArgumentException illegalArgumentException39 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException37);
        java.lang.IllegalArgumentException illegalArgumentException40 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException41 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException40);
        java.lang.IllegalArgumentException illegalArgumentException45 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException46 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException45);
        java.lang.IllegalArgumentException illegalArgumentException47 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException45);
        java.lang.IllegalArgumentException illegalArgumentException48 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException45);
        java.lang.Throwable[] throwableArray49 = illegalArgumentException48.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException52 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException53 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException52);
        java.lang.IllegalArgumentException illegalArgumentException54 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException", (java.lang.Throwable) illegalArgumentException53);
        illegalArgumentException48.addSuppressed((java.lang.Throwable) illegalArgumentException53);
        java.lang.IllegalArgumentException illegalArgumentException56 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException48);
        illegalArgumentException41.addSuppressed((java.lang.Throwable) illegalArgumentException48);
        java.lang.IllegalArgumentException illegalArgumentException58 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException48);
        illegalArgumentException39.addSuppressed((java.lang.Throwable) illegalArgumentException58);
        illegalArgumentException27.addSuppressed((java.lang.Throwable) illegalArgumentException39);
        java.lang.Throwable[] throwableArray61 = illegalArgumentException39.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException62 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException39);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray61);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        java.lang.IllegalArgumentException illegalArgumentException2 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException3 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException3);
        illegalArgumentException2.addSuppressed((java.lang.Throwable) illegalArgumentException3);
        java.lang.IllegalArgumentException illegalArgumentException10 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException11 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException10);
        java.lang.IllegalArgumentException illegalArgumentException12 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException10);
        java.lang.IllegalArgumentException illegalArgumentException13 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException10);
        java.lang.IllegalArgumentException illegalArgumentException14 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException10);
        illegalArgumentException3.addSuppressed((java.lang.Throwable) illegalArgumentException14);
        java.lang.IllegalArgumentException illegalArgumentException16 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: ", (java.lang.Throwable) illegalArgumentException3);
        java.lang.IllegalArgumentException illegalArgumentException19 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException20 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException19);
        java.lang.IllegalArgumentException illegalArgumentException21 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException19);
        java.lang.IllegalArgumentException illegalArgumentException23 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException24 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException23);
        java.lang.IllegalArgumentException illegalArgumentException25 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException23);
        illegalArgumentException19.addSuppressed((java.lang.Throwable) illegalArgumentException25);
        java.lang.IllegalArgumentException illegalArgumentException27 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException25);
        illegalArgumentException16.addSuppressed((java.lang.Throwable) illegalArgumentException25);
        java.lang.IllegalArgumentException illegalArgumentException32 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException33 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException34 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException33);
        illegalArgumentException32.addSuppressed((java.lang.Throwable) illegalArgumentException33);
        java.lang.IllegalArgumentException illegalArgumentException36 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException33);
        java.lang.IllegalArgumentException illegalArgumentException37 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException36);
        java.lang.IllegalArgumentException illegalArgumentException38 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException36);
        java.lang.IllegalArgumentException illegalArgumentException40 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException41 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException42 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException41);
        illegalArgumentException40.addSuppressed((java.lang.Throwable) illegalArgumentException41);
        java.lang.IllegalArgumentException illegalArgumentException48 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException49 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException48);
        java.lang.IllegalArgumentException illegalArgumentException50 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException48);
        java.lang.IllegalArgumentException illegalArgumentException51 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException48);
        java.lang.IllegalArgumentException illegalArgumentException52 = new java.lang.IllegalArgumentException("", (java.lang.Throwable) illegalArgumentException48);
        illegalArgumentException41.addSuppressed((java.lang.Throwable) illegalArgumentException52);
        java.lang.IllegalArgumentException illegalArgumentException56 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException57 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException56);
        java.lang.IllegalArgumentException illegalArgumentException58 = new java.lang.IllegalArgumentException("hi!", (java.lang.Throwable) illegalArgumentException56);
        illegalArgumentException41.addSuppressed((java.lang.Throwable) illegalArgumentException58);
        java.lang.Throwable[] throwableArray60 = illegalArgumentException58.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException61 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException58);
        illegalArgumentException38.addSuppressed((java.lang.Throwable) illegalArgumentException58);
        java.lang.IllegalArgumentException illegalArgumentException63 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException58);
        illegalArgumentException25.addSuppressed((java.lang.Throwable) illegalArgumentException58);
        java.lang.IllegalArgumentException illegalArgumentException65 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException25);
        java.lang.IllegalArgumentException illegalArgumentException66 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException25);
        java.lang.IllegalArgumentException illegalArgumentException69 = new java.lang.IllegalArgumentException("hi!");
        java.lang.IllegalArgumentException illegalArgumentException70 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: hi!", (java.lang.Throwable) illegalArgumentException69);
        java.lang.IllegalArgumentException illegalArgumentException72 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: hi!");
        illegalArgumentException70.addSuppressed((java.lang.Throwable) illegalArgumentException72);
        java.lang.Throwable[] throwableArray74 = illegalArgumentException70.getSuppressed();
        java.lang.IllegalArgumentException illegalArgumentException76 = new java.lang.IllegalArgumentException();
        java.lang.IllegalArgumentException illegalArgumentException77 = new java.lang.IllegalArgumentException((java.lang.Throwable) illegalArgumentException76);
        java.lang.IllegalArgumentException illegalArgumentException78 = new java.lang.IllegalArgumentException("java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: ", (java.lang.Throwable) illegalArgumentException76);
        illegalArgumentException70.addSuppressed((java.lang.Throwable) illegalArgumentException76);
        illegalArgumentException25.addSuppressed((java.lang.Throwable) illegalArgumentException70);
        java.lang.Throwable[] throwableArray81 = illegalArgumentException70.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(throwableArray81);
    }
}

