package jts;

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
        jts.Envelope envelope4 = new jts.Envelope((double) (-8L), 10.0d, (double) (-6L), (double) 8);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getWidth();
        envelope4.init(11.0d, 27.3d, 101.0d, 85.3d);
        java.lang.Class<?> wildcardClass15 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.0d + "'", double7 == 18.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 14.0d + "'", double8 == 14.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 18.0d + "'", double9 == 18.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        envelope4.init((double) (byte) 1, (double) (-8L), (double) 8L, (double) (-4L));
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getHeight();
        envelope4.init(95.0d, 200.0d, 200.0d, (double) 6);
        boolean boolean19 = envelope4.isEnvelopeNull();
        double double20 = envelope4.getWidth();
        double double21 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 12.0d + "'", double11 == 12.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 12.0d + "'", double12 == 12.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 12.0d + "'", double13 == 12.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 105.0d + "'", double20 == 105.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 105.0d + "'", double21 == 105.0d);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        jts.Envelope envelope4 = new jts.Envelope((double) (-3L), 100.0d, 25.1d, 3.3d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        jts.Envelope envelope4 = new jts.Envelope(9.0d, (double) 0, 92.7d, (double) 100);
        envelope4.init(21.0d, 97.0d, 31.0d, 10.4d);
        envelope4.init(101.0d, 0.0d, (double) (-9L), 1.2000000000000002d);
        envelope4.init((double) 10, 94.1d, (double) 10, 80.7d);
        envelope4.init(58.0d, 87.0d, (double) 10, 92.3d);
        boolean boolean25 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, (double) 10.0f, (double) (byte) 1, 58.0d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        jts.Envelope envelope4 = new jts.Envelope(114.9d, 0.0d, 69.0d, 17.0d);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getHeight();
        double double10 = envelope4.getHeight();
        double double11 = envelope4.getHeight();
        envelope4.init(115.1d, (double) (-7), (double) (-4), 14.9d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.0d + "'", double10 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.0d + "'", double11 == 8.0d);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        double double16 = envelope4.getWidth();
        double double17 = envelope4.maxExtent();
        double double18 = envelope4.maxExtent();
        double double19 = envelope4.getHeight();
        double double20 = envelope4.maxExtent();
        double double21 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.0d + "'", double18 == 8.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 8.0d + "'", double19 == 8.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 8.0d + "'", double20 == 8.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        jts.Envelope envelope4 = new jts.Envelope((double) 7, (double) 10.0f, (double) 4L, (double) 0L);
        envelope4.init((double) 10.0f, (double) 4, (double) 9, 3.1d);
        envelope4.init((double) 7L, (double) 5L, (double) 2, (double) 9L);
        double double15 = envelope4.maxExtent();
        double double16 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass17 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 7.0d + "'", double15 == 7.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 7.0d + "'", double16 == 7.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        jts.Envelope envelope4 = new jts.Envelope(24.0d, 92.9d, 5.8d, 0.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        double double13 = envelope4.getHeight();
        double double14 = envelope4.maxExtent();
        envelope4.init(8.4d, (double) '4', 90.0d, 2.9000000000000004d);
        boolean boolean20 = envelope4.isEnvelopeNull();
        double double21 = envelope4.getWidth();
        boolean boolean22 = envelope4.isEnvelopeNull();
        boolean boolean23 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 43.6d + "'", double21 == 43.6d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        jts.Envelope envelope4 = new jts.Envelope(6.9d, (double) (byte) 10, 87.0d, 83.7d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.299999999999997d + "'", double5 == 3.299999999999997d);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) 100, 9.2d, 0.0d, (-4.6d));
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getHeight();
        envelope4.init((double) 3L, (double) (-7), (double) (byte) 0, 0.0d);
        boolean boolean15 = envelope4.isEnvelopeNull();
        boolean boolean16 = envelope4.isEnvelopeNull();
        double double17 = envelope4.maxExtent();
        double double18 = envelope4.getWidth();
        double double19 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        double double16 = envelope4.getWidth();
        double double17 = envelope4.maxExtent();
        boolean boolean18 = envelope4.isEnvelopeNull();
        double double19 = envelope4.getHeight();
        boolean boolean20 = envelope4.isEnvelopeNull();
        double double21 = envelope4.maxExtent();
        boolean boolean22 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass23 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 8.0d + "'", double19 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 8.0d + "'", double21 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getHeight();
        envelope4.init((double) 3L, (double) (-7), (double) (byte) 0, 0.0d);
        boolean boolean15 = envelope4.isEnvelopeNull();
        double double16 = envelope4.getWidth();
        envelope4.init((double) (-1L), (double) (-100L), 8.7d, (double) 1L);
        envelope4.init((double) ' ', (double) 1, 9.0d, 61.9d);
        double double27 = envelope4.getWidth();
        boolean boolean28 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 31.0d + "'", double27 == 31.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        envelope4.init(6.9d, (double) (byte) 0, (double) (byte) 1, (double) (-1.0f));
        double double18 = envelope4.getWidth();
        double double19 = envelope4.maxExtent();
        envelope4.init((double) ' ', (double) 8, (double) 7, 1.0d);
        boolean boolean25 = envelope4.isEnvelopeNull();
        double double26 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 6.9d + "'", double19 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 6.0d + "'", double26 == 6.0d);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getHeight();
        envelope4.init((double) 3L, (double) (-7), (double) (byte) 0, 0.0d);
        double double15 = envelope4.getWidth();
        envelope4.init((double) 100, 102.7d, (-7.3d), (double) 5L);
        double double21 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2.700000000000003d + "'", double21 == 2.700000000000003d);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        jts.Envelope envelope4 = new jts.Envelope((double) (-6), 0.0d, (double) (-5L), (double) 7);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.0d + "'", double5 == 6.0d);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        jts.Envelope envelope4 = new jts.Envelope((double) '4', (double) 1.0f, (-10.5d), (double) (short) 0);
        envelope4.init(38.7d, 9.2d, 88.3d, 16.0d);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        jts.Envelope envelope4 = new jts.Envelope((double) (-4L), (double) 7L, 6.9d, (double) (-4L));
        double double5 = envelope4.getWidth();
        double double6 = envelope4.maxExtent();
        envelope4.init(2.0d, 111.9d, 46.0d, 148.0d);
        java.lang.Class<?> wildcardClass12 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 11.0d + "'", double5 == 11.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 11.0d + "'", double6 == 11.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getWidth();
        envelope4.init(9.2d, (double) 100, (double) 0.0f, 92.0d);
        double double14 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 90.8d + "'", double14 == 90.8d);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, (double) 5L, 98.1d, 65.0d);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        jts.Envelope envelope4 = new jts.Envelope(17.0d, (double) 6L, (double) (short) 10, 105.7d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 11.0d + "'", double5 == 11.0d);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        boolean boolean11 = envelope4.isEnvelopeNull();
        boolean boolean12 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass13 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        jts.Envelope envelope4 = new jts.Envelope(8.7d, 92.7d, 15.0d, 7.1d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        boolean boolean7 = envelope4.isEnvelopeNull();
        double double8 = envelope4.maxExtent();
        boolean boolean9 = envelope4.isEnvelopeNull();
        double double10 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 84.0d + "'", double6 == 84.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 84.0d + "'", double8 == 84.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 84.0d + "'", double10 == 84.0d);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        jts.Envelope envelope4 = new jts.Envelope(98.7d, 5.8999999999999995d, (double) 0, (double) (byte) 1);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        jts.Envelope envelope4 = new jts.Envelope(0.5d, 28.0d, 20.2d, 109.7d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 0, 6.300000000000001d, 69.0d, 66.0d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getWidth();
        double double14 = envelope4.getWidth();
        double double15 = envelope4.maxExtent();
        boolean boolean16 = envelope4.isEnvelopeNull();
        boolean boolean17 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass18 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 104.0d + "'", double12 == 104.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 106.0d + "'", double13 == 106.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 106.0d + "'", double14 == 106.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 106.0d + "'", double15 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init((double) (short) 0, 2.7d, (double) (-1.0f), (double) 100L);
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.getHeight();
        double double14 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 101.0d + "'", double13 == 101.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 101.0d + "'", double14 == 101.0d);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        envelope4.init((-5.4d), (-8.7d), (double) 5L, (double) 7);
        envelope4.init((double) (-1L), 0.0d, (double) (-6L), 14.0d);
        boolean boolean17 = envelope4.isEnvelopeNull();
        double double18 = envelope4.maxExtent();
        envelope4.init(194.0d, (double) (byte) -1, 1.7000000000000004d, 1.7000000000000004d);
        java.lang.Class<?> wildcardClass24 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        jts.Envelope envelope4 = new jts.Envelope(5.0d, 5.3d, (double) (-100L), (double) (-2L));
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2999999999999998d + "'", double6 == 0.2999999999999998d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 98.0d + "'", double7 == 98.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 98.0d + "'", double8 == 98.0d);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        jts.Envelope envelope4 = new jts.Envelope((double) 8, (double) (short) 0, 16.200000000000003d, 17.6d);
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init(9.099999999999998d, 33.7d, 9.5d, 89.5d);
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 80.0d + "'", double12 == 80.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 24.600000000000005d + "'", double13 == 24.600000000000005d);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        jts.Envelope envelope4 = new jts.Envelope((-5.4d), 14.4d, (double) (short) 100, 117.4d);
        double double5 = envelope4.getHeight();
        envelope4.init(23.5d, 97.7d, 100.2d, 9.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 17.400000000000006d + "'", double5 == 17.400000000000006d);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        jts.Envelope envelope4 = new jts.Envelope((-8.7d), (double) (-8L), (double) (-6L), (double) 2);
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init((double) 10, (double) (short) 0, 9.0d, 6.9d);
        boolean boolean11 = envelope4.isEnvelopeNull();
        envelope4.init(8.299999999999999d, 39.400000000000006d, 0.0d, 198.1d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        jts.Envelope envelope4 = new jts.Envelope(84.99999999999999d, 98.89999999999999d, (double) (short) 0, 5.3d);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        jts.Envelope envelope4 = new jts.Envelope(90.2d, 36.0d, (double) 4, 132.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 128.0d + "'", double5 == 128.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 54.2d + "'", double6 == 54.2d);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), (double) 100L, 86.5d, 13.4d);
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        jts.Envelope envelope4 = new jts.Envelope(14.9d, 6.9d, (double) (-2L), 0.0d);
        envelope4.init((double) (-8L), 92.2d, 86.2d, (double) (-5));
        double double10 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass11 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 91.2d + "'", double10 == 91.2d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        jts.Envelope envelope4 = new jts.Envelope(7.7d, 0.0d, 6.3d, 0.0d);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.maxExtent();
        envelope4.init((double) 5L, (-6.9d), (-5.4d), 0.0d);
        double double19 = envelope4.getWidth();
        envelope4.init((double) 3L, 0.0d, 94.1d, 0.0d);
        envelope4.init(5.4d, 102.3d, (double) 6L, 105.4d);
        boolean boolean30 = envelope4.isEnvelopeNull();
        double double31 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 106.0d + "'", double13 == 106.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 11.9d + "'", double19 == 11.9d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 99.4d + "'", double31 == 99.4d);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) 8L, 6.1d, 43.6d);
        envelope4.init((double) 9L, 17.400000000000006d, 20.9d, (-6.9d));
        boolean boolean10 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        jts.Envelope envelope4 = new jts.Envelope(32.0d, (double) 2L, 43.0d, 117.7d);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 10, (double) 100, (double) 1, (double) (byte) 100);
        boolean boolean5 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        jts.Envelope envelope4 = new jts.Envelope(115.1d, 4.0d, 5.600000000000001d, (double) 100.0f);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        boolean boolean11 = envelope4.isEnvelopeNull();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.getWidth();
        double double14 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.0d + "'", double13 == 8.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.0d + "'", double14 == 8.0d);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        jts.Envelope envelope4 = new jts.Envelope((double) (-4L), 76.0d, (double) (-2L), (double) (-8));
        double double5 = envelope4.getHeight();
        envelope4.init((double) 0, 103.2d, 0.0d, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.0d + "'", double5 == 6.0d);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        boolean boolean11 = envelope4.isEnvelopeNull();
        double double12 = envelope4.getWidth();
        double double13 = envelope4.getWidth();
        envelope4.init(0.0d, 1.2000000000000002d, (double) (-8L), 34.0d);
        double double19 = envelope4.getHeight();
        boolean boolean20 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 106.0d + "'", double13 == 106.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 42.0d + "'", double19 == 42.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        jts.Envelope envelope4 = new jts.Envelope(198.1d, 39.400000000000006d, 1.5999999999999996d, 13.100000000000001d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init((double) 100, (-100.0d), (double) '#', 5.0d);
        envelope4.init((double) 1L, (double) (byte) 100, (double) (-8L), (double) (-1));
        double double21 = envelope4.getWidth();
        double double22 = envelope4.getWidth();
        boolean boolean23 = envelope4.isEnvelopeNull();
        double double24 = envelope4.getHeight();
        double double25 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 99.0d + "'", double21 == 99.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 99.0d + "'", double22 == 99.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 7.0d + "'", double24 == 7.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 7.0d + "'", double25 == 7.0d);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        jts.Envelope envelope4 = new jts.Envelope(9.2d, (double) 7, 86.0d, 10.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        envelope4.init(0.40000000000000036d, 1.2000000000000002d, (double) 2, 3.3d);
        envelope4.init(113.0d, 15.4d, 93.1d, 7.899999999999999d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 76.0d + "'", double6 == 76.0d);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        jts.Envelope envelope4 = new jts.Envelope(90.0d, (double) (-5L), 0.0d, 101.8d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        jts.Envelope envelope4 = new jts.Envelope(2.0999999999999943d, 93.1d, 3.7d, 73.30000000000001d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 91.0d + "'", double5 == 91.0d);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getWidth();
        envelope4.init((double) (byte) -1, 0.0d, (double) 10, (double) 100L);
        envelope4.init(0.0d, 3.1d, 34.0d, 7.1d);
        double double19 = envelope4.getWidth();
        envelope4.init(94.60000000000001d, 0.5999999999999996d, 55.0d, 107.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 3.1d + "'", double19 == 3.1d);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        jts.Envelope envelope4 = new jts.Envelope(89.5d, (double) (byte) 100, 2.9000000000000004d, (double) (-1));
        envelope4.init(2.7d, (double) 1L, 103.0d, 100.0d);
        double double10 = envelope4.getWidth();
        envelope4.init(2.8d, (-1.0d), (double) 9L, (double) (short) 100);
        java.lang.Class<?> wildcardClass16 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7000000000000002d + "'", double10 == 1.7000000000000002d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        jts.Envelope envelope4 = new jts.Envelope(0.6999999999999993d, 5.4d, (double) (-4L), (double) (byte) 100);
        envelope4.init(101.0d, 4.1d, 1.2d, 62.699999999999996d);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 3.1d, 5.0d, 2.7d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass7 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3d + "'", double5 == 2.3d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        jts.Envelope envelope4 = new jts.Envelope(12.6d, (double) 7, (double) (-8), 87.0d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) 10, (double) (byte) 1, (double) (byte) 0);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        boolean boolean7 = envelope4.isEnvelopeNull();
        double double8 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass9 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        jts.Envelope envelope4 = new jts.Envelope((double) (-10), (double) (-3L), 0.0d, (double) 10.0f);
        envelope4.init(94.1d, (-7.3d), 2.1d, 9.2d);
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 101.39999999999999d + "'", double10 == 101.39999999999999d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7.1d + "'", double11 == 7.1d);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        jts.Envelope envelope4 = new jts.Envelope(17.4d, 9.6d, 1.0d, 200.0d);
        double double5 = envelope4.getHeight();
        envelope4.init(2.9000000000000004d, 1.3999999999999986d, 9.5d, (double) (byte) 10);
        double double11 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 199.0d + "'", double5 == 199.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5d + "'", double11 == 0.5d);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (short) 0, (-9.3d), (double) (-1L));
        envelope4.init((-2.1d), (double) (-6), (double) (-6L), 2.9000000000000004d);
        boolean boolean10 = envelope4.isEnvelopeNull();
        envelope4.init(21.0d, 6.7d, 1.0999999999999996d, 58.5d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        jts.Envelope envelope4 = new jts.Envelope(100.60000000000001d, 83.7d, 4.199999999999997d, 86.0d);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        jts.Envelope envelope4 = new jts.Envelope(109.1d, (double) (-1L), 74.6d, 0.0d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 110.1d + "'", double5 == 110.1d);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init((double) 100, (-100.0d), (double) '#', 5.0d);
        envelope4.init((double) 5, (double) (short) 10, 96.0d, (double) (byte) 10);
        envelope4.init(100.0d, (-100.0d), (double) (byte) 100, (double) 1L);
        envelope4.init((double) 3, 4.8d, 100.0d, 0.0d);
        double double31 = envelope4.maxExtent();
        double double32 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.7999999999999998d + "'", double32 == 1.7999999999999998d);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        jts.Envelope envelope4 = new jts.Envelope((double) (-7), (double) 4L, (-7.3d), (-100.0d));
        envelope4.init(12.0d, (double) (-1.0f), (double) (-1L), 65.0d);
        envelope4.init((double) (byte) 1, (double) 3, (double) 9L, 0.0d);
        envelope4.init(193.0d, 41.3d, 104.6d, 0.9000000000000004d);
        java.lang.Class<?> wildcardClass20 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        jts.Envelope envelope4 = new jts.Envelope(31.0d, 1.2d, 173.6d, (double) 1L);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass8 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        jts.Envelope envelope4 = new jts.Envelope((double) (-6L), (double) (byte) 100, (double) (short) 1, (double) (short) 0);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 106.0d + "'", double5 == 106.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), (double) (short) 0, 1.0d, (double) 10);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) 7L, (double) 10, (double) 100L, 8.0d);
        envelope4.init(5.8d, (double) 10L, (double) 4L, 2.7d);
        double double16 = envelope4.getWidth();
        double double17 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.0d + "'", double5 == 9.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.2d + "'", double16 == 4.2d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.2d + "'", double17 == 4.2d);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        envelope4.init(6.9d, (double) (byte) 0, (double) (byte) 1, (double) (-1.0f));
        double double18 = envelope4.getWidth();
        boolean boolean19 = envelope4.isEnvelopeNull();
        boolean boolean20 = envelope4.isEnvelopeNull();
        double double21 = envelope4.getWidth();
        double double22 = envelope4.maxExtent();
        envelope4.init(17.4d, (double) (-3), 31.0d, 1.2d);
        envelope4.init(1.7000000000000004d, (double) (short) 0, 0.0d, 65.0d);
        double double33 = envelope4.maxExtent();
        boolean boolean34 = envelope4.isEnvelopeNull();
        double double35 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 6.9d + "'", double21 == 6.9d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 6.9d + "'", double22 == 6.9d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 65.0d + "'", double33 == 65.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 65.0d + "'", double35 == 65.0d);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.maxExtent();
        double double10 = envelope4.getHeight();
        envelope4.init(102.0d, 3.299999999999999d, 107.0d, 99.0d);
        double double16 = envelope4.getWidth();
        double double17 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass18 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.4d + "'", double9 == 8.4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.4d + "'", double10 == 8.4d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 98.7d + "'", double16 == 98.7d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 98.7d + "'", double17 == 98.7d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        envelope4.init((double) 1, 200.0d, (-7.3d), 87.0d);
        double double13 = envelope4.maxExtent();
        double double14 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 199.0d + "'", double13 == 199.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 199.0d + "'", double14 == 199.0d);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) (-1L), (double) (-1.0f), (double) 0L, 100.0d);
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.maxExtent();
        double double14 = envelope4.getWidth();
        boolean boolean15 = envelope4.isEnvelopeNull();
        double double16 = envelope4.getHeight();
        double double17 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        jts.Envelope envelope4 = new jts.Envelope((double) 100, 24.0d, 5.0d, (double) (-9));
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init((double) 1L, (double) (-7), 17.4d, 92.9d);
        double double12 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 76.0d + "'", double5 == 76.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 75.5d + "'", double12 == 75.5d);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        jts.Envelope envelope4 = new jts.Envelope((-8.7d), (-6.9d), (-1.0d), (double) (-10));
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.0d + "'", double5 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.799999999999999d + "'", double6 == 1.799999999999999d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.799999999999999d + "'", double7 == 1.799999999999999d);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getHeight();
        envelope4.init(104.0d, (double) 10L, (double) 3L, 4.8d);
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        envelope4.init(86.0d, (double) '4', 90.3d, 89.2d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 94.0d + "'", double11 == 94.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 94.0d + "'", double12 == 94.0d);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        jts.Envelope envelope4 = new jts.Envelope((double) 'a', (double) (byte) 1, 2.3d, (double) 0L);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getWidth();
        envelope4.init(100.0d, (double) 5L, 1.799999999999999d, (-7.3d));
        double double13 = envelope4.getWidth();
        boolean boolean14 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass15 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3d + "'", double5 == 2.3d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 96.0d + "'", double7 == 96.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 95.0d + "'", double13 == 95.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) -1, 88.7d, 7.300000000000001d, 0.0d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        double double11 = envelope4.getWidth();
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.maxExtent();
        envelope4.init(0.0d, 103.0d, 24.0d, (double) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.0d + "'", double11 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 96.0d + "'", double12 == 96.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 96.0d + "'", double13 == 96.0d);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        jts.Envelope envelope4 = new jts.Envelope(9.0d, 85.5d, 111.3d, 100.0d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 76.5d + "'", double5 == 76.5d);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.maxExtent();
        double double9 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        double double16 = envelope4.getWidth();
        boolean boolean17 = envelope4.isEnvelopeNull();
        double double18 = envelope4.getWidth();
        double double19 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 8.0d + "'", double19 == 8.0d);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        jts.Envelope envelope4 = new jts.Envelope(2.7d, (double) 1, (double) 7L, (double) 5L);
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        boolean boolean7 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7000000000000002d + "'", double5 == 1.7000000000000002d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 2.700000000000003d, 30.0d, (double) 6);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.maxExtent();
        double double14 = envelope4.getWidth();
        boolean boolean15 = envelope4.isEnvelopeNull();
        boolean boolean16 = envelope4.isEnvelopeNull();
        double double17 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 106.0d + "'", double13 == 106.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 106.0d + "'", double14 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 104.0d + "'", double17 == 104.0d);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        jts.Envelope envelope4 = new jts.Envelope((double) 'a', 66.0d, 199.0d, 193.0d);
        envelope4.init((double) 9L, 13.6d, 8.7d, 88.3d);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        jts.Envelope envelope4 = new jts.Envelope(24.0d, (double) 2, 104.0d, (-7.3d));
        double double5 = envelope4.maxExtent();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 111.3d + "'", double5 == 111.3d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 111.3d + "'", double7 == 111.3d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 22.0d + "'", double8 == 22.0d);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        jts.Envelope envelope4 = new jts.Envelope(10.0d, 77.7d, 7.300000000000001d, 0.0d);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        jts.Envelope envelope4 = new jts.Envelope(100.0d, 10.5d, (double) 2, (-100.0d));
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getWidth();
        boolean boolean7 = envelope4.isEnvelopeNull();
        double double8 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.0d + "'", double5 == 102.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 89.5d + "'", double6 == 89.5d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 102.0d + "'", double8 == 102.0d);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 1, 85.5d, (double) (-4L), 22.0d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        jts.Envelope envelope4 = new jts.Envelope(114.9d, (double) (-7), (double) 0, 92.9d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getHeight();
        envelope4.init((double) ' ', (-2.1d), 109.0d, (double) 6);
        boolean boolean11 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass12 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 1, (double) 0.0f, (double) 6, (double) 3L);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getHeight();
        envelope4.init(69.0d, 14.6d, 0.0d, 198.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.0d + "'", double5 == 3.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.0d + "'", double6 == 3.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3.0d + "'", double7 == 3.0d);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        jts.Envelope envelope4 = new jts.Envelope(14.0d, 102.3d, 1.5999999999999996d, 8.0d);
        envelope4.init((double) 2L, 92.0d, (double) (-5L), 13.0d);
        double double10 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass11 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 90.0d + "'", double10 == 90.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 3.1d, 5.0d, 2.7d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getWidth();
        envelope4.init(13.0d, 1.7000000000000002d, (-5.4d), (double) 100);
        double double13 = envelope4.maxExtent();
        double double14 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3d + "'", double5 == 2.3d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 6.9d + "'", double7 == 6.9d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 105.4d + "'", double13 == 105.4d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 105.4d + "'", double14 == 105.4d);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        envelope4.init((double) (-8), (double) (-9), (double) (-100), (double) 2L);
        double double16 = envelope4.maxExtent();
        envelope4.init((-7.3d), 15.0d, 6.0d, (double) 100);
        boolean boolean22 = envelope4.isEnvelopeNull();
        double double23 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 102.0d + "'", double16 == 102.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 94.0d + "'", double23 == 94.0d);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        jts.Envelope envelope4 = new jts.Envelope(54.2d, 1.7999999999999998d, 97.7d, 17.4d);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init((double) 100, (-100.0d), (double) '#', 5.0d);
        envelope4.init((double) 1L, (double) (byte) 100, (double) (-8L), (double) (-1));
        double double21 = envelope4.getWidth();
        envelope4.init((double) 1, 2.9000000000000004d, (double) 1, (-2.1d));
        double double27 = envelope4.getHeight();
        double double28 = envelope4.getWidth();
        double double29 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 99.0d + "'", double21 == 99.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 3.1d + "'", double27 == 3.1d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.9000000000000004d + "'", double28 == 1.9000000000000004d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.9000000000000004d + "'", double29 == 1.9000000000000004d);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        jts.Envelope envelope4 = new jts.Envelope((double) (-7), (double) 4L, (-7.3d), (-100.0d));
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        envelope4.init((double) (-1), 3.1d, 17.6d, (double) 8L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 92.7d + "'", double5 == 92.7d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 92.7d + "'", double6 == 92.7d);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        jts.Envelope envelope4 = new jts.Envelope((double) (-7), (double) 4L, (-7.3d), (-100.0d));
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass7 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.maxExtent();
        boolean boolean10 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.4d + "'", double9 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        jts.Envelope envelope4 = new jts.Envelope(6.0d, (double) 100.0f, 88.6d, (double) 100L);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 94.0d + "'", double5 == 94.0d);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        jts.Envelope envelope4 = new jts.Envelope(89.5d, 86.0d, 0.0d, 95.2d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.getHeight();
        envelope4.init((double) 100L, (double) (byte) 100, 14.0d, 102.7d);
        double double14 = envelope4.maxExtent();
        envelope4.init((-1.2d), 17.1d, 51.0d, 17.200000000000003d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 88.7d + "'", double14 == 88.7d);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getHeight();
        envelope4.init(102.0d, 0.0d, (double) 0, (double) ' ');
        double double15 = envelope4.getWidth();
        double double16 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass17 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 102.0d + "'", double15 == 102.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 102.0d + "'", double16 == 102.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        jts.Envelope envelope4 = new jts.Envelope(19.0d, 82.3d, 111.3d, 2.3d);
        envelope4.init(110.0d, (double) 7, (double) (-6L), 2.1d);
        java.lang.Class<?> wildcardClass10 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        jts.Envelope envelope4 = new jts.Envelope(20.0d, (double) 6, 9.5d, 1.0d);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        jts.Envelope envelope4 = new jts.Envelope((double) (-10), (double) (-3L), 0.0d, (double) 10.0f);
        envelope4.init(94.1d, (-7.3d), 2.1d, 9.2d);
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getWidth();
        double double12 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 101.39999999999999d + "'", double10 == 101.39999999999999d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 101.39999999999999d + "'", double11 == 101.39999999999999d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 101.39999999999999d + "'", double12 == 101.39999999999999d);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.maxExtent();
        envelope4.init((double) 5L, (-6.9d), (-5.4d), 0.0d);
        envelope4.init((double) (-6L), (-7.3d), (double) (short) -1, (double) (-10));
        java.lang.Class<?> wildcardClass24 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 106.0d + "'", double13 == 106.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        envelope4.init((double) (-8), (double) (-9), (double) (-100), (double) 2L);
        double double16 = envelope4.maxExtent();
        double double17 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass18 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 102.0d + "'", double16 == 102.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        jts.Envelope envelope4 = new jts.Envelope(11.3d, 110.39999999999999d, 106.2d, (double) 3L);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        jts.Envelope envelope4 = new jts.Envelope(12.200000000000003d, 16.3d, 96.9d, 29.299999999999997d);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        boolean boolean11 = envelope4.isEnvelopeNull();
        boolean boolean12 = envelope4.isEnvelopeNull();
        envelope4.init((double) 10L, (double) (-1), (double) (-2), (double) (byte) 10);
        double double18 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 11.0d + "'", double18 == 11.0d);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        envelope4.init((double) (byte) 1, (double) (-4L), (double) 100L, 4.8d);
        boolean boolean10 = envelope4.isEnvelopeNull();
        boolean boolean11 = envelope4.isEnvelopeNull();
        boolean boolean12 = envelope4.isEnvelopeNull();
        envelope4.init(19.7d, (double) 'a', 80.0d, 20.5d);
        java.lang.Class<?> wildcardClass18 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        jts.Envelope envelope4 = new jts.Envelope(51.0d, 91.2d, 103.0d, 8.299999999999999d);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        jts.Envelope envelope4 = new jts.Envelope(2.9000000000000004d, 1.2d, 94.0d, (double) (-10));
        double double5 = envelope4.getWidth();
        envelope4.init(88.1d, 107.5d, 65.0d, 117.7d);
        double double11 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7000000000000004d + "'", double5 == 1.7000000000000004d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.7d + "'", double11 == 52.7d);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        double double16 = envelope4.getWidth();
        double double17 = envelope4.getHeight();
        double double18 = envelope4.getWidth();
        double double19 = envelope4.maxExtent();
        double double20 = envelope4.getHeight();
        boolean boolean21 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 8.0d + "'", double19 == 8.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 8.0d + "'", double20 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        jts.Envelope envelope4 = new jts.Envelope(90.2d, 36.0d, (double) 4, 132.0d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1.0f), (double) (-9), (double) 2, (double) 10);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.maxExtent();
        envelope4.init((double) (-5L), 22.0d, 34.0d, (-100.0d));
        envelope4.init((double) 10, 95.10000000000001d, 112.1d, 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        jts.Envelope envelope4 = new jts.Envelope((-3.8d), (double) 10L, (double) 1.0f, 86.5d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 85.5d + "'", double5 == 85.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 85.5d + "'", double6 == 85.5d);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        jts.Envelope envelope4 = new jts.Envelope((-8.7d), 0.0d, (double) (short) 10, 96.0d);
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        boolean boolean7 = envelope4.isEnvelopeNull();
        double double8 = envelope4.getWidth();
        double double9 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.7d + "'", double5 == 8.7d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.7d + "'", double8 == 8.7d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.7d + "'", double9 == 8.7d);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        boolean boolean13 = envelope4.isEnvelopeNull();
        boolean boolean14 = envelope4.isEnvelopeNull();
        double double15 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass16 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 104.0d + "'", double15 == 104.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        jts.Envelope envelope4 = new jts.Envelope((-8.7d), (double) (-8L), (double) (-6L), (double) 2);
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init((-1.0d), (double) (-3L), (double) 6L, 0.0d);
        java.lang.Class<?> wildcardClass11 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        jts.Envelope envelope4 = new jts.Envelope(90.2d, 39.4d, 6.3d, 107.5d);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 10, (double) 100, (double) 1, (double) (byte) 100);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 99.0d + "'", double6 == 99.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 99.0d + "'", double7 == 99.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 99.0d + "'", double8 == 99.0d);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        jts.Envelope envelope4 = new jts.Envelope(8.7d, 5.0d, 15.0d, 97.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        jts.Envelope envelope4 = new jts.Envelope(41.3d, 15.0d, (double) (short) 10, (double) (-6L));
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init(84.99999999999999d, (double) (-1), 100.2d, 3.1d);
        boolean boolean11 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        jts.Envelope envelope4 = new jts.Envelope(20.0d, 1.5999999999999996d, 13.0d, 90.0d);
        envelope4.init(80.2d, 6.9d, 16.200000000000003d, (double) 1L);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        jts.Envelope envelope4 = new jts.Envelope(198.1d, 0.6999999999999993d, 132.0d, 6.1d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        jts.Envelope envelope4 = new jts.Envelope(61.9d, 88.6d, 117.7d, (-8.7d));
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        envelope4.init((double) (byte) 1, (double) (-8L), (double) 8L, (double) (-4L));
        boolean boolean10 = envelope4.isEnvelopeNull();
        boolean boolean11 = envelope4.isEnvelopeNull();
        envelope4.init(51.0d, (double) (-1L), 0.6999999999999993d, 6.1d);
        double double17 = envelope4.maxExtent();
        double double18 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        jts.Envelope envelope4 = new jts.Envelope(1.9d, 18.5d, 1.0d, 38.0d);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getWidth();
        boolean boolean10 = envelope4.isEnvelopeNull();
        boolean boolean11 = envelope4.isEnvelopeNull();
        boolean boolean12 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass13 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 3.0d, (double) 100.0f, 7.1d);
        envelope4.init(1.7000000000000002d, 106.0d, (double) 100.0f, 14.6d);
        boolean boolean10 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass11 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init((double) ' ', (double) 1, (double) (short) -1, 100.0d);
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.maxExtent();
        double double14 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 101.0d + "'", double13 == 101.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 31.0d + "'", double14 == 31.0d);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        boolean boolean16 = envelope4.isEnvelopeNull();
        double double17 = envelope4.getWidth();
        double double18 = envelope4.maxExtent();
        envelope4.init(92.0d, (-2.1d), 0.0d, (double) (byte) 1);
        double double24 = envelope4.getHeight();
        double double25 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.0d + "'", double18 == 8.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        jts.Envelope envelope4 = new jts.Envelope(0.5999999999999996d, 21.5d, 58.0d, 38.7d);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        jts.Envelope envelope4 = new jts.Envelope(98.0d, (double) (-1), (double) (short) 0, 0.0d);
        envelope4.init(1.7000000000000002d, 5.8d, 8.7d, 44.3d);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        jts.Envelope envelope4 = new jts.Envelope(77.5d, 55.0d, 92.7d, (double) 0);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 92.7d + "'", double5 == 92.7d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 22.5d + "'", double6 == 22.5d);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        jts.Envelope envelope4 = new jts.Envelope(100.0d, 10.5d, (double) 2, (-100.0d));
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass9 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.0d + "'", double5 == 102.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 102.0d + "'", double6 == 102.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 102.0d + "'", double7 == 102.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 89.5d + "'", double8 == 89.5d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.maxExtent();
        envelope4.init((double) 5L, (-6.9d), (-5.4d), 0.0d);
        double double19 = envelope4.getWidth();
        envelope4.init((double) (short) -1, 53.0d, (double) 10.0f, 11.3d);
        boolean boolean25 = envelope4.isEnvelopeNull();
        double double26 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 106.0d + "'", double13 == 106.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 11.9d + "'", double19 == 11.9d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 54.0d + "'", double26 == 54.0d);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        jts.Envelope envelope4 = new jts.Envelope(5.8d, (double) 4, 10.0d, 106.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init(91.3d, (-10.5d), (-2.1d), 4.2d);
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getWidth();
        double double13 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 96.0d + "'", double5 == 96.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 6.300000000000001d + "'", double11 == 6.300000000000001d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 101.8d + "'", double12 == 101.8d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 101.8d + "'", double13 == 101.8d);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        jts.Envelope envelope4 = new jts.Envelope(41.2d, 18.9d, 96.0d, 0.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        jts.Envelope envelope4 = new jts.Envelope(98.0d, 92.2d, 107.5d, 19.0d);
        envelope4.init(6.300000000000001d, 16.200000000000003d, 33.7d, 14.700000000000003d);
        double double10 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 19.0d + "'", double10 == 19.0d);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getHeight();
        envelope4.init((double) 3L, (double) (-7), (double) (byte) 0, 0.0d);
        boolean boolean15 = envelope4.isEnvelopeNull();
        double double16 = envelope4.getWidth();
        double double17 = envelope4.maxExtent();
        envelope4.init(11.3d, 110.0d, 5.9d, (double) (short) 1);
        envelope4.init(10.5d, 90.2d, 3.3d, 5.3d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        jts.Envelope envelope4 = new jts.Envelope(113.39999999999999d, 94.0d, 94.2d, 38.7d);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) 10, (double) (byte) 1, (double) (byte) 0);
        envelope4.init((double) 8L, 0.0d, 4.0d, (-6.9d));
        double double10 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.9d + "'", double10 == 10.9d);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1.0f), (double) 6L, (double) 7L, 4.0d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.0d + "'", double5 == 3.0d);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        jts.Envelope envelope4 = new jts.Envelope(12.0d, 8.0d, 87.1d, (double) (-2L));
        envelope4.init(79.7d, (double) (-1.0f), 1.2000000000000002d, 2.1d);
        double double10 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass11 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 80.7d + "'", double10 == 80.7d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        jts.Envelope envelope4 = new jts.Envelope((double) 100L, 2.0d, 1.5999999999999996d, (double) (-1));
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.maxExtent();
        boolean boolean9 = envelope4.isEnvelopeNull();
        double double10 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.4d + "'", double10 == 8.4d);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        jts.Envelope envelope4 = new jts.Envelope(1.7000000000000004d, (double) (short) 10, 4.0d, (-5.4d));
        double double5 = envelope4.maxExtent();
        envelope4.init(94.3d, 1.2000000000000002d, 103.0d, 110.1d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.4d + "'", double5 == 9.4d);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) (-1L), (double) (-1.0f), (double) 0L, 100.0d);
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.getWidth();
        envelope4.init((double) 10L, 14.6d, 190.3d, 8.600000000000001d);
        double double19 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 181.70000000000002d + "'", double19 == 181.70000000000002d);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        jts.Envelope envelope4 = new jts.Envelope(17.4d, 9.6d, 1.0d, 200.0d);
        envelope4.init((double) 7, (double) 5, 12.0d, (double) (byte) 10);
        double double10 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.0d + "'", double10 == 2.0d);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        boolean boolean16 = envelope4.isEnvelopeNull();
        double double17 = envelope4.getWidth();
        double double18 = envelope4.maxExtent();
        envelope4.init(92.0d, (-2.1d), 0.0d, (double) (byte) 1);
        double double24 = envelope4.getHeight();
        double double25 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass26 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.0d + "'", double18 == 8.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 94.1d + "'", double25 == 94.1d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        jts.Envelope envelope4 = new jts.Envelope(31.0d, (double) 100, 20.0d, 92.9d);
        double double5 = envelope4.maxExtent();
        envelope4.init(76.69999999999999d, 0.0d, 0.0d, 5.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 72.9d + "'", double5 == 72.9d);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getWidth();
        envelope4.init((double) 6, 1.2d, 18.0d, (-9.3d));
        envelope4.init((double) 100L, (-4.6d), 13.4d, 5.3d);
        double double24 = envelope4.getWidth();
        double double25 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 96.0d + "'", double11 == 96.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 96.0d + "'", double12 == 96.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.0d + "'", double13 == 8.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 104.6d + "'", double24 == 104.6d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 8.100000000000001d + "'", double25 == 8.100000000000001d);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        jts.Envelope envelope4 = new jts.Envelope(9.9d, 9.2d, 198.5d, 80.1d);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        jts.Envelope envelope4 = new jts.Envelope((double) 8, (double) (short) 0, 16.200000000000003d, 17.6d);
        double double5 = envelope4.maxExtent();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.3999999999999986d + "'", double7 == 1.3999999999999986d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.3999999999999986d + "'", double8 == 1.3999999999999986d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.3999999999999986d + "'", double9 == 1.3999999999999986d);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        double double16 = envelope4.getWidth();
        boolean boolean17 = envelope4.isEnvelopeNull();
        envelope4.init(13.0d, 11.9d, (double) 6L, 5.0d);
        double double23 = envelope4.getHeight();
        double double24 = envelope4.getWidth();
        double double25 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0999999999999996d + "'", double24 == 1.0999999999999996d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0999999999999996d + "'", double25 == 1.0999999999999996d);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        jts.Envelope envelope4 = new jts.Envelope(0.6999999999999993d, 41.3d, 1.9d, 5.9d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getHeight();
        double double10 = envelope4.getWidth();
        envelope4.init(111.0d, (double) 10, (double) 10L, (double) (-100L));
        double double16 = envelope4.maxExtent();
        boolean boolean17 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.4d + "'", double9 == 8.4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.0d + "'", double10 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 110.0d + "'", double16 == 110.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        jts.Envelope envelope4 = new jts.Envelope(6.9d, (-2.1d), (double) (-6), (double) (short) 1);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        envelope4.init(9.0d, 62.0d, 80.0d, 2.0999999999999996d);
        double double12 = envelope4.getWidth();
        double double13 = envelope4.getHeight();
        double double14 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.0d + "'", double6 == 9.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 53.0d + "'", double12 == 53.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 77.9d + "'", double13 == 77.9d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 53.0d + "'", double14 == 53.0d);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getHeight();
        double double14 = envelope4.getHeight();
        double double15 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 104.0d + "'", double12 == 104.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 104.0d + "'", double14 == 104.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 104.0d + "'", double15 == 104.0d);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        double double13 = envelope4.getHeight();
        double double14 = envelope4.maxExtent();
        double double15 = envelope4.getWidth();
        boolean boolean16 = envelope4.isEnvelopeNull();
        double double17 = envelope4.getHeight();
        envelope4.init(11.0d, (double) (byte) 1, 52.0d, 15.0d);
        envelope4.init(99.0d, 4.0d, 14.6d, 13.5d);
        double double28 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass29 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 109.0d + "'", double15 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 5.0d + "'", double17 == 5.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 95.0d + "'", double28 == 95.0d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        envelope4.init(6.9d, (double) (byte) 0, (double) (byte) 1, (double) (-1.0f));
        double double18 = envelope4.getWidth();
        boolean boolean19 = envelope4.isEnvelopeNull();
        double double20 = envelope4.getWidth();
        boolean boolean21 = envelope4.isEnvelopeNull();
        double double22 = envelope4.getHeight();
        double double23 = envelope4.getWidth();
        envelope4.init((double) 100, 4.799999999999997d, 9.100000000000003d, 1.2000000000000002d);
        double double29 = envelope4.maxExtent();
        double double30 = envelope4.maxExtent();
        envelope4.init(3.1d, 37.0d, 98.1d, 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 6.9d + "'", double20 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.0d + "'", double22 == 2.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 6.9d + "'", double23 == 6.9d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 95.2d + "'", double29 == 95.2d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 95.2d + "'", double30 == 95.2d);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        jts.Envelope envelope4 = new jts.Envelope(20.0d, 0.0d, 85.5d, 90.3d);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) 0, 20.2d, 12.6d, 2.5999999999999996d);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        envelope4.init(6.9d, (double) (byte) 0, (double) (byte) 1, (double) (-1.0f));
        double double18 = envelope4.getWidth();
        boolean boolean19 = envelope4.isEnvelopeNull();
        boolean boolean20 = envelope4.isEnvelopeNull();
        boolean boolean21 = envelope4.isEnvelopeNull();
        double double22 = envelope4.getHeight();
        double double23 = envelope4.maxExtent();
        double double24 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.0d + "'", double22 == 2.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 6.9d + "'", double23 == 6.9d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 2.0d + "'", double24 == 2.0d);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        jts.Envelope envelope4 = new jts.Envelope((double) '#', (double) (short) 100, (double) (short) -1, (double) 1L);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        envelope4.init((double) 1, 200.0d, (-7.3d), 87.0d);
        double double13 = envelope4.getWidth();
        boolean boolean14 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 199.0d + "'", double13 == 199.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        jts.Envelope envelope4 = new jts.Envelope(22.0d, 6.7d, 77.5d, 39.400000000000006d);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        jts.Envelope envelope4 = new jts.Envelope((-10.5d), (double) (-7L), 6.1d, 2.0999999999999943d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.000000000000005d + "'", double5 == 4.000000000000005d);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        jts.Envelope envelope4 = new jts.Envelope((double) (-8L), 109.7d, 14.4d, 0.0d);
        envelope4.init(0.0d, 84.5d, 21.5d, 130.2d);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init((double) (-1.0f), (double) (byte) 0, (double) (-2L), (double) 8L);
        double double16 = envelope4.getHeight();
        double double17 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        jts.Envelope envelope4 = new jts.Envelope(5.3d, (double) 9L, 3.1d, 10.4d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.300000000000001d + "'", double6 == 7.300000000000001d);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        jts.Envelope envelope4 = new jts.Envelope((-8.7d), 0.0d, (double) (short) 10, 96.0d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.7d + "'", double5 == 8.7d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.7d + "'", double6 == 8.7d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 86.0d + "'", double7 == 86.0d);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        jts.Envelope envelope4 = new jts.Envelope((double) (-8L), 10.0d, (double) (-6L), (double) 8);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        boolean boolean7 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass8 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        jts.Envelope envelope4 = new jts.Envelope(9.6d, 204.0d, 13.100000000000001d, 3.5d);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        jts.Envelope envelope4 = new jts.Envelope((double) (-3L), (double) (-9), 7.1d, (double) (byte) -1);
        envelope4.init((double) (-8L), 6.9d, (double) 9, 0.0d);
        double double10 = envelope4.getHeight();
        envelope4.init(9.6d, 200.0d, (double) 100, (double) 1L);
        boolean boolean16 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.0d + "'", double10 == 9.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 10, (double) 100, (double) 1, (double) (byte) 100);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        envelope4.init(1.7000000000000004d, 4.4d, (-9.3d), 58.7d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 90.0d + "'", double6 == 90.0d);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        envelope4.init((double) (-8), (double) (-9), (double) (-100), (double) 2L);
        double double16 = envelope4.getHeight();
        double double17 = envelope4.getHeight();
        envelope4.init(20.0d, 0.0d, (double) (short) 100, 96.9d);
        double double23 = envelope4.getHeight();
        double double24 = envelope4.getWidth();
        envelope4.init(100.60000000000001d, 3.2d, 0.0d, (double) (-3));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 102.0d + "'", double16 == 102.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 102.0d + "'", double17 == 102.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 3.0999999999999943d + "'", double23 == 3.0999999999999943d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 20.0d + "'", double24 == 20.0d);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        jts.Envelope envelope4 = new jts.Envelope((-3.8d), (double) (-100L), 0.0d, 1.7000000000000002d);
        double double5 = envelope4.getWidth();
        envelope4.init((double) (-100), 17.4d, 1.7999999999999998d, 9.5d);
        double double11 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 96.2d + "'", double5 == 96.2d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 117.4d + "'", double11 == 117.4d);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        jts.Envelope envelope4 = new jts.Envelope(109.7d, 93.1d, 198.1d, 10.0d);
        envelope4.init((double) 9L, 66.0d, 1.9000000000000004d, (double) 100);
        java.lang.Class<?> wildcardClass10 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        jts.Envelope envelope4 = new jts.Envelope(76.0d, 86.0d, 100.0d, (double) 6);
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init((double) 1L, (double) (-8L), 39.400000000000006d, 17.400000000000006d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        jts.Envelope envelope4 = new jts.Envelope(54.2d, 90.8d, 93.0d, 72.9d);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getWidth();
        envelope4.init((double) (-8), 13.5d, (double) 1L, (double) 1);
        double double15 = envelope4.getWidth();
        double double16 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 21.5d + "'", double15 == 21.5d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 21.5d + "'", double16 == 21.5d);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        jts.Envelope envelope4 = new jts.Envelope(43.6d, 0.0d, 73.0d, 3.1d);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        jts.Envelope envelope4 = new jts.Envelope((double) 8L, (double) 2L, 52.0d, (double) (byte) 100);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 48.0d + "'", double5 == 48.0d);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        jts.Envelope envelope4 = new jts.Envelope((double) 1L, (double) 0L, 10.5d, (-2.1d));
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 12.6d + "'", double6 == 12.6d);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        jts.Envelope envelope4 = new jts.Envelope(46.0d, 102.5d, 74.0d, 128.0d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), (double) (short) 0, 1.0d, (double) 10);
        double double5 = envelope4.getWidth();
        envelope4.init((double) (byte) 100, (double) (byte) 0, (double) 4, (double) (-1L));
        double double11 = envelope4.getWidth();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.maxExtent();
        double double14 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        jts.Envelope envelope4 = new jts.Envelope(104.1d, 13.4d, 4.8d, 111.0d);
        envelope4.init((double) 2L, 87.1d, (double) (-7), (double) (short) 0);
        double double10 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 85.1d + "'", double10 == 85.1d);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getHeight();
        envelope4.init(42.3d, 5.8d, 94.1d, (-7.3d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        jts.Envelope envelope4 = new jts.Envelope(5.0d, 5.3d, (double) (-100L), (double) (-2L));
        envelope4.init((double) (byte) 100, 10.5d, (double) (-9L), 8.4d);
        envelope4.init(6.9d, (double) (-3L), (double) 7L, (double) (-6L));
        double double15 = envelope4.getHeight();
        double double16 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass17 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 13.0d + "'", double15 == 13.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9.9d + "'", double16 == 9.9d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        jts.Envelope envelope4 = new jts.Envelope((double) '#', (double) (short) 100, (double) (short) -1, (double) 1L);
        double double5 = envelope4.getWidth();
        envelope4.init(194.0d, 17.4d, 39.400000000000006d, (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 65.0d + "'", double5 == 65.0d);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, 20.0d, 85.5d, 55.0d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) (-1L), (double) (-1.0f), (double) 0L, 100.0d);
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.maxExtent();
        double double14 = envelope4.getWidth();
        boolean boolean15 = envelope4.isEnvelopeNull();
        double double16 = envelope4.getHeight();
        double double17 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass18 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        jts.Envelope envelope4 = new jts.Envelope((double) (-3L), (double) (-9), 7.1d, (double) (byte) -1);
        envelope4.init((double) 0.0f, (double) (-1), 103.0d, 11.9d);
        envelope4.init(104.3d, 6.1d, 54.5d, 100.0d);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        jts.Envelope envelope4 = new jts.Envelope(94.1d, 9.100000000000003d, 20.0d, 5.8d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 84.99999999999999d + "'", double5 == 84.99999999999999d);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getWidth();
        envelope4.init(9.2d, (double) 100, (double) 0.0f, 92.0d);
        envelope4.init((-3.8d), (double) (-1L), (double) 100.0f, (double) (-1));
        double double19 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 2.8d + "'", double19 == 2.8d);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        jts.Envelope envelope4 = new jts.Envelope(41.2d, (double) 1L, 111.9d, 8.7d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.2d + "'", double5 == 103.2d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 103.2d + "'", double6 == 103.2d);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        jts.Envelope envelope4 = new jts.Envelope((double) 10L, 18.0d, (double) (-8), 13.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init(0.0d, 51.0d, 110.0d, (double) 9);
        double double11 = envelope4.maxExtent();
        envelope4.init(72.9d, 98.5d, 0.5d, 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 21.0d + "'", double5 == 21.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 101.0d + "'", double11 == 101.0d);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        jts.Envelope envelope4 = new jts.Envelope(1.5999999999999996d, (double) 1L, 100.0d, (double) (-9L));
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        boolean boolean8 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5999999999999996d + "'", double6 == 0.5999999999999996d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 109.0d + "'", double7 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) 0, (-2.1d), (double) (-8L), (double) (-4));
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init(3.3999999999999915d, 48.0d, 28.0d, 0.2999999999999998d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.1d + "'", double7 == 2.1d);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        jts.Envelope envelope4 = new jts.Envelope(38.4d, 0.5999999999999996d, 94.3d, 41.0d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass8 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getHeight();
        envelope4.init(102.0d, 0.0d, (double) 0, (double) ' ');
        double double15 = envelope4.maxExtent();
        envelope4.init((-1.2d), (double) (-4), 7.1d, 14.0d);
        boolean boolean21 = envelope4.isEnvelopeNull();
        double double22 = envelope4.getHeight();
        double double23 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 102.0d + "'", double15 == 102.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 6.9d + "'", double22 == 6.9d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 6.9d + "'", double23 == 6.9d);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.getHeight();
        double double14 = envelope4.getHeight();
        double double15 = envelope4.getWidth();
        double double16 = envelope4.getWidth();
        double double17 = envelope4.getHeight();
        envelope4.init(0.0d, 0.5d, 38.0d, 41.3d);
        envelope4.init((double) (-1L), (double) 0.0f, 0.0d, 43.6d);
        double double28 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 104.0d + "'", double14 == 104.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 106.0d + "'", double15 == 106.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 106.0d + "'", double16 == 106.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 104.0d + "'", double17 == 104.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 43.6d + "'", double28 == 43.6d);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        envelope4.init((-5.4d), (-8.7d), (double) 5L, (double) 7);
        double double12 = envelope4.getWidth();
        boolean boolean13 = envelope4.isEnvelopeNull();
        envelope4.init(89.2d, 10.4d, (double) (byte) 10, (-1.0d));
        boolean boolean19 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.299999999999999d + "'", double12 == 3.299999999999999d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        jts.Envelope envelope4 = new jts.Envelope((double) (-8L), 5.9d, (double) 5, (double) (-6));
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 13.9d + "'", double5 == 13.9d);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.maxExtent();
        boolean boolean8 = envelope4.isEnvelopeNull();
        boolean boolean9 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 103.0d + "'", double6 == 103.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 103.0d + "'", double7 == 103.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        jts.Envelope envelope4 = new jts.Envelope((double) (-8L), 109.7d, 14.4d, 0.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        jts.Envelope envelope4 = new jts.Envelope((double) 7, (double) 10.0f, (double) 4L, (double) 0L);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.0d + "'", double6 == 3.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3.0d + "'", double7 == 3.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        jts.Envelope envelope4 = new jts.Envelope(86.0d, 12.6d, 89.2d, (double) 3);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 86.2d + "'", double5 == 86.2d);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        jts.Envelope envelope4 = new jts.Envelope(15.0d, 34.7d, 33.7d, 80.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, (-5.4d), 0.0d, 65.0d);
        envelope4.init(95.7d, 104.6d, (double) (-2), (double) 1L);
        envelope4.init(0.5d, 31.0d, 36.0d, 12.6d);
        double double15 = envelope4.getHeight();
        double double16 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 23.4d + "'", double15 == 23.4d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.5d + "'", double16 == 30.5d);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getHeight();
        envelope4.init((-5.4d), 97.4d, 1.2000000000000002d, 106.2d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.4d + "'", double9 == 8.4d);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        jts.Envelope envelope4 = new jts.Envelope(110.5d, 37.0d, (double) 100L, 7.299999999999997d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 92.7d + "'", double5 == 92.7d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 92.7d + "'", double6 == 92.7d);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        envelope4.init((double) (byte) 1, (double) (-4L), (double) 100L, 4.8d);
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getHeight();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 95.2d + "'", double10 == 95.2d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 95.2d + "'", double11 == 95.2d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        jts.Envelope envelope4 = new jts.Envelope((double) 8L, (-5.4d), 5.8d, (double) 10L);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        envelope4.init(12.6d, 11.3d, 18.0d, 38.0d);
        java.lang.Class<?> wildcardClass12 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 13.4d + "'", double6 == 13.4d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        jts.Envelope envelope4 = new jts.Envelope((double) (-4), (double) ' ', 6.9d, 111.3d);
        double double5 = envelope4.getWidth();
        envelope4.init(94.0d, 109.1d, (double) (-9), 93.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 36.0d + "'", double5 == 36.0d);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        jts.Envelope envelope4 = new jts.Envelope((double) '#', (double) (short) 100, (double) (short) -1, (double) 1L);
        double double5 = envelope4.getHeight();
        envelope4.init(4.0d, 90.0d, 1.7000000000000002d, 8.0d);
        envelope4.init(10.0d, (double) 1.0f, 109.7d, (double) 7);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        jts.Envelope envelope4 = new jts.Envelope((double) 7, (double) 10.0f, (double) 4L, (double) 0L);
        envelope4.init((double) 10.0f, (double) 4, (double) 9, 3.1d);
        double double10 = envelope4.getHeight();
        boolean boolean11 = envelope4.isEnvelopeNull();
        double double12 = envelope4.getWidth();
        envelope4.init(14.9d, 87.0d, 0.0d, 13.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.9d + "'", double10 == 5.9d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.0d + "'", double12 == 6.0d);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        jts.Envelope envelope4 = new jts.Envelope(2.0999999999999943d, 93.1d, 3.7d, 73.30000000000001d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 91.0d + "'", double5 == 91.0d);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        jts.Envelope envelope4 = new jts.Envelope(92.7d, (double) (-10L), 1.2d, (double) (-8L));
        envelope4.init(95.2d, 8.7d, 1.7000000000000002d, 92.0d);
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getWidth();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 90.3d + "'", double10 == 90.3d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 86.5d + "'", double11 == 86.5d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 86.5d + "'", double13 == 86.5d);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        jts.Envelope envelope4 = new jts.Envelope(173.6d, (double) 0, 4.2d, 30.5d);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        envelope4.init(82.3d, 92.9d, 103.5d, 96.9d);
        envelope4.init(155.4d, 94.3d, 39.4d, 13.5d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        jts.Envelope envelope4 = new jts.Envelope(132.0d, 110.5d, 25.1d, (double) (-2L));
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        double double16 = envelope4.getWidth();
        boolean boolean17 = envelope4.isEnvelopeNull();
        double double18 = envelope4.getWidth();
        envelope4.init((double) 100L, 4.3d, 99.7d, 13.600000000000001d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        jts.Envelope envelope4 = new jts.Envelope((-8.7d), (-6.9d), (-1.0d), (double) (-10));
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getHeight();
        boolean boolean8 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.0d + "'", double5 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.799999999999999d + "'", double6 == 1.799999999999999d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.0d + "'", double7 == 9.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        jts.Envelope envelope4 = new jts.Envelope((double) '4', (double) (-6L), (double) (-6), (double) 100L);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 58.0d + "'", double7 == 58.0d);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.getHeight();
        double double14 = envelope4.getHeight();
        boolean boolean15 = envelope4.isEnvelopeNull();
        envelope4.init(0.0d, 29.2d, 4.199999999999997d, 90.19999999999999d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 104.0d + "'", double14 == 104.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        jts.Envelope envelope4 = new jts.Envelope(3.5d, (double) 100, (double) 'a', 10.600000000000009d);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        jts.Envelope envelope4 = new jts.Envelope(2.7d, (double) 1, (double) 7L, (double) 5L);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        jts.Envelope envelope4 = new jts.Envelope(14.9d, 6.9d, (double) (-2L), 0.0d);
        envelope4.init((double) (-8L), 92.2d, 86.2d, (double) (-5));
        double double10 = envelope4.getHeight();
        double double11 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 91.2d + "'", double10 == 91.2d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 91.2d + "'", double11 == 91.2d);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init((double) ' ', (double) 1, (double) (short) -1, 100.0d);
        double double12 = envelope4.getWidth();
        double double13 = envelope4.getWidth();
        double double14 = envelope4.getWidth();
        envelope4.init(98.5d, 9.9d, 0.0d, 4.3d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 31.0d + "'", double12 == 31.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 31.0d + "'", double13 == 31.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 31.0d + "'", double14 == 31.0d);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        jts.Envelope envelope4 = new jts.Envelope(98.6d, 92.0d, 18.5d, 8.0d);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        jts.Envelope envelope4 = new jts.Envelope(46.3d, 88.7d, 0.5d, (-3.8d));
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        envelope4.init(7.1d, (double) (byte) 10, (-5.4d), 5.0d);
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.getWidth();
        double double14 = envelope4.maxExtent();
        envelope4.init(182.7d, 8.700000000000003d, 90.0d, 98.6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 2.9000000000000004d + "'", double13 == 2.9000000000000004d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.4d + "'", double14 == 10.4d);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.getHeight();
        boolean boolean14 = envelope4.isEnvelopeNull();
        double double15 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 106.0d + "'", double15 == 106.0d);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        jts.Envelope envelope4 = new jts.Envelope((-3.8d), (double) (-100L), 0.0d, 1.7000000000000002d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getWidth();
        boolean boolean7 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass8 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 96.2d + "'", double5 == 96.2d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 96.2d + "'", double6 == 96.2d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        jts.Envelope envelope4 = new jts.Envelope((double) 'a', 66.0d, 199.0d, 193.0d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        jts.Envelope envelope4 = new jts.Envelope(15.0d, 34.7d, 33.7d, 80.0d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 19.700000000000003d + "'", double5 == 19.700000000000003d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 46.3d + "'", double6 == 46.3d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 46.3d + "'", double7 == 46.3d);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getWidth();
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        envelope4.init((double) 10, (double) (-8), 8.3d, (double) (short) 10);
        double double18 = envelope4.maxExtent();
        double double19 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.0d + "'", double11 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 18.0d + "'", double18 == 18.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.6999999999999993d + "'", double19 == 1.6999999999999993d);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) (-1L), (double) (-1.0f), (double) 0L, 100.0d);
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.maxExtent();
        double double14 = envelope4.getWidth();
        double double15 = envelope4.getHeight();
        double double16 = envelope4.getHeight();
        envelope4.init(115.1d, 117.4d, 9.5d, 10.5d);
        java.lang.Class<?> wildcardClass22 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getWidth();
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.maxExtent();
        envelope4.init(8.4d, 52.0d, 58.7d, 3.0999999999999943d);
        boolean boolean17 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.4d + "'", double11 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, (double) 10.0f, (double) (byte) 1, 58.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.getHeight();
        envelope4.init((double) 10.0f, (-4.6d), (double) (byte) 1, (double) 5);
        double double11 = envelope4.getWidth();
        envelope4.init(3.299999999999999d, 2.0999999999999996d, (-10.5d), 194.0d);
        double double17 = envelope4.getHeight();
        double double18 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 14.6d + "'", double11 == 14.6d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 204.5d + "'", double17 == 204.5d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 204.5d + "'", double18 == 204.5d);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        jts.Envelope envelope4 = new jts.Envelope(34.0d, 0.2999999999999998d, 13.0d, 10.0d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 33.7d + "'", double5 == 33.7d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 33.7d + "'", double6 == 33.7d);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        jts.Envelope envelope4 = new jts.Envelope(3.8000000000000007d, 0.7000000000000028d, 99.7d, 1.9000000000000004d);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        jts.Envelope envelope4 = new jts.Envelope((double) 100, 100.0d, (double) 0.0f, (double) 0L);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (short) 0, (-9.3d), (double) (-1L));
        envelope4.init((-2.1d), (double) (-6), (double) (-6L), 2.9000000000000004d);
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.getWidth();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.9d + "'", double11 == 3.9d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.9d + "'", double13 == 3.9d);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getHeight();
        double double14 = envelope4.getHeight();
        boolean boolean15 = envelope4.isEnvelopeNull();
        double double16 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 104.0d + "'", double12 == 104.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 104.0d + "'", double14 == 104.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 106.0d + "'", double16 == 106.0d);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        envelope4.init(6.9d, (double) (byte) 0, (double) (byte) 1, (double) (-1.0f));
        double double18 = envelope4.getWidth();
        boolean boolean19 = envelope4.isEnvelopeNull();
        boolean boolean20 = envelope4.isEnvelopeNull();
        double double21 = envelope4.getHeight();
        envelope4.init((double) (-6), (double) (-9), 0.0d, 0.0d);
        double double27 = envelope4.getWidth();
        double double28 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2.0d + "'", double21 == 2.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 3.0d + "'", double27 == 3.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        jts.Envelope envelope4 = new jts.Envelope((double) (-7), (double) 4L, (-7.3d), (-100.0d));
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.getHeight();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 11.0d + "'", double5 == 11.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 92.7d + "'", double6 == 92.7d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 92.7d + "'", double7 == 92.7d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 92.7d + "'", double9 == 92.7d);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        envelope4.init((double) (byte) 1, (double) (-8L), (double) 8L, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 12.0d + "'", double10 == 12.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 12.0d + "'", double11 == 12.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 12.0d + "'", double12 == 12.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 12.0d + "'", double13 == 12.0d);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 7.7d, (double) 3, 34.7d);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        jts.Envelope envelope4 = new jts.Envelope(4.4d, 0.0d, (double) (byte) 10, 85.3d);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), (double) (short) 0, 1.0d, (double) 10);
        double double5 = envelope4.getWidth();
        envelope4.init((double) (byte) 100, (double) (byte) 0, (double) 4, (double) (-1L));
        double double11 = envelope4.getWidth();
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.getHeight();
        double double14 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass15 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        envelope4.init(6.9d, (double) (byte) 0, (double) (byte) 1, (double) (-1.0f));
        double double18 = envelope4.getWidth();
        boolean boolean19 = envelope4.isEnvelopeNull();
        boolean boolean20 = envelope4.isEnvelopeNull();
        double double21 = envelope4.getWidth();
        double double22 = envelope4.maxExtent();
        envelope4.init(17.4d, (double) (-3), 31.0d, 1.2d);
        envelope4.init(111.0d, 2.5999999999999996d, (double) 10, 109.1d);
        double double33 = envelope4.getWidth();
        envelope4.init((double) (-1), 53.0d, 3.1d, 0.0d);
        double double39 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 6.9d + "'", double21 == 6.9d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 6.9d + "'", double22 == 6.9d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 108.4d + "'", double33 == 108.4d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 3.1d + "'", double39 == 3.1d);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        jts.Envelope envelope4 = new jts.Envelope(104.1d, (double) (-4L), 1.7000000000000004d, (double) (-5));
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.7d + "'", double5 == 6.7d);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        jts.Envelope envelope4 = new jts.Envelope((double) (-3L), (double) (-9), 7.1d, (double) (byte) -1);
        envelope4.init((double) 0.0f, (double) (-1), 103.0d, 11.9d);
        envelope4.init(68.6d, 104.1d, (double) 7L, 9.100000000000003d);
        double double15 = envelope4.getWidth();
        double double16 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.5d + "'", double15 == 35.5d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.100000000000003d + "'", double16 == 2.100000000000003d);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        jts.Envelope envelope4 = new jts.Envelope((double) 7L, (double) 5L, (double) 9L, 6.0d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        boolean boolean11 = envelope4.isEnvelopeNull();
        boolean boolean12 = envelope4.isEnvelopeNull();
        envelope4.init((double) 10L, (double) (-1), (double) (-2), (double) (byte) 10);
        double double18 = envelope4.maxExtent();
        double double19 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 12.0d + "'", double18 == 12.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 12.0d + "'", double19 == 12.0d);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        jts.Envelope envelope4 = new jts.Envelope(27.0d, 14.700000000000003d, 10.0d, 0.0d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        jts.Envelope envelope4 = new jts.Envelope((-6.9d), 1.7000000000000002d, 13.0d, 6.0d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.600000000000001d + "'", double5 == 8.600000000000001d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.600000000000001d + "'", double6 == 8.600000000000001d);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, 2.5999999999999996d, 95.0d, 10.5d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.maxExtent();
        boolean boolean9 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 84.5d + "'", double5 == 84.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 84.5d + "'", double6 == 84.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.4d + "'", double7 == 5.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 84.5d + "'", double8 == 84.5d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        jts.Envelope envelope4 = new jts.Envelope(3.2d, 19.700000000000003d, 5.1d, 102.5d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        jts.Envelope envelope4 = new jts.Envelope(6.9d, 12.0d, 2.0d, 69.0d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.maxExtent();
        envelope4.init(4.3d, (double) (-10L), (double) 0L, 36.9d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.1d + "'", double5 == 5.1d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 67.0d + "'", double6 == 67.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 67.0d + "'", double7 == 67.0d);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) 100, (double) (-100), 94.0d, (double) 9L);
        envelope4.init(0.0d, 77.0d, 8.3d, 2.700000000000003d);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, (double) (-1L), 0.0d, 8.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        jts.Envelope envelope4 = new jts.Envelope((double) 'a', (double) (byte) 1, 2.3d, (double) 0L);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass7 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3d + "'", double5 == 2.3d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 96.0d + "'", double6 == 96.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getHeight();
        envelope4.init((double) ' ', (-2.1d), 109.0d, (double) 6);
        envelope4.init((double) (-9L), (double) 10L, 0.0d, 25.1d);
        java.lang.Class<?> wildcardClass16 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        jts.Envelope envelope4 = new jts.Envelope(102.3d, (-8.7d), (double) (-100L), 98.1d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        envelope4.init(7.1d, (double) (byte) 10, (-5.4d), 5.0d);
        double double12 = envelope4.getWidth();
        envelope4.init((double) (-8), 1.3999999999999986d, 12.7d, 96.0d);
        boolean boolean18 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.9000000000000004d + "'", double12 == 2.9000000000000004d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        jts.Envelope envelope4 = new jts.Envelope((double) (-10), (double) (-3L), 0.0d, (double) 10.0f);
        envelope4.init(94.1d, (-7.3d), 2.1d, 9.2d);
        envelope4.init(108.0d, 86.5d, 113.39999999999999d, 58.0d);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        jts.Envelope envelope4 = new jts.Envelope(13.600000000000001d, 110.0d, 9.099999999999998d, 182.7d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 173.6d + "'", double5 == 173.6d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 173.6d + "'", double6 == 173.6d);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        jts.Envelope envelope4 = new jts.Envelope(3.299999999999999d, 7.1d, 0.0d, (double) 2L);
        envelope4.init((double) (short) 0, 104.1d, 2.7d, 5.1d);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        jts.Envelope envelope4 = new jts.Envelope(100.0d, 10.5d, (double) 2, (-100.0d));
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.0d + "'", double5 == 102.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 102.0d + "'", double6 == 102.0d);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        jts.Envelope envelope4 = new jts.Envelope((-9.3d), 26.800000000000004d, 2.3d, 88.3d);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        boolean boolean13 = envelope4.isEnvelopeNull();
        envelope4.init((double) 2L, 27.3d, 204.0d, 12.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.maxExtent();
        double double14 = envelope4.getWidth();
        boolean boolean15 = envelope4.isEnvelopeNull();
        boolean boolean16 = envelope4.isEnvelopeNull();
        double double17 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 106.0d + "'", double13 == 106.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 106.0d + "'", double14 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 106.0d + "'", double17 == 106.0d);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        boolean boolean16 = envelope4.isEnvelopeNull();
        double double17 = envelope4.getHeight();
        double double18 = envelope4.maxExtent();
        envelope4.init(10.4d, 132.0d, 1.2d, 22.3d);
        boolean boolean24 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.0d + "'", double18 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        jts.Envelope envelope4 = new jts.Envelope((double) 7, (double) 10.0f, (double) 4L, (double) 0L);
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init(2.0d, 0.0d, 104.0d, 1.7000000000000004d);
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 102.3d + "'", double11 == 102.3d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 102.3d + "'", double12 == 102.3d);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        envelope4.init(82.3d, 92.9d, 103.5d, 96.9d);
        java.lang.Class<?> wildcardClass12 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        jts.Envelope envelope4 = new jts.Envelope(106.0d, 18.0d, 85.3d, (double) 0);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        boolean boolean16 = envelope4.isEnvelopeNull();
        envelope4.init((double) (-1), 2.3d, 96.0d, (double) 9);
        double double22 = envelope4.getWidth();
        double double23 = envelope4.getHeight();
        double double24 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 3.3d + "'", double22 == 3.3d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 87.0d + "'", double23 == 87.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 87.0d + "'", double24 == 87.0d);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        jts.Envelope envelope4 = new jts.Envelope(24.0d, 94.0d, (double) (-1), (double) (-6));
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init(90.8d, 4.799999999999997d, 9.100000000000003d, 89.5d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        jts.Envelope envelope4 = new jts.Envelope((double) 7, (double) 10.0f, (double) 4L, (double) 0L);
        envelope4.init((double) 10, (double) 8, (double) 8, (-1.2d));
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.0d + "'", double10 == 2.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 9.2d + "'", double11 == 9.2d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 9.2d + "'", double12 == 9.2d);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        jts.Envelope envelope4 = new jts.Envelope(109.0d, 1.7999999999999998d, 1.0d, 14.9d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init((double) 100, (-100.0d), (double) '#', 5.0d);
        envelope4.init((double) 5, (double) (short) 10, 96.0d, (double) (byte) 10);
        envelope4.init(100.0d, (-100.0d), (double) (byte) 100, (double) 1L);
        envelope4.init((double) 3, 4.8d, 100.0d, 0.0d);
        boolean boolean31 = envelope4.isEnvelopeNull();
        double double32 = envelope4.getWidth();
        boolean boolean33 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.7999999999999998d + "'", double32 == 1.7999999999999998d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        jts.Envelope envelope4 = new jts.Envelope(8.3d, 92.9d, (double) 8, 2.8d);
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass7 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 84.60000000000001d + "'", double5 == 84.60000000000001d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        jts.Envelope envelope4 = new jts.Envelope(8.7d, 92.7d, 15.0d, 7.1d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init(0.0d, 1.5d, (double) 0, (-1.2d));
        double double11 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.2d + "'", double11 == 1.2d);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        jts.Envelope envelope4 = new jts.Envelope(0.5999999999999996d, 95.2d, 12.3d, (double) (-1L));
        double double5 = envelope4.getHeight();
        envelope4.init(198.5d, 0.0d, 0.0d, 75.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 13.3d + "'", double5 == 13.3d);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        envelope4.init((double) (byte) 1, (double) (-8L), (double) 8L, (double) (-4L));
        envelope4.init((double) 1, (double) 4, (double) (-4L), 3.0d);
        double double15 = envelope4.maxExtent();
        double double16 = envelope4.getHeight();
        envelope4.init(15.4d, 3.4000000000000004d, 99.7d, 9.5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 7.0d + "'", double15 == 7.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 7.0d + "'", double16 == 7.0d);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass8 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        jts.Envelope envelope4 = new jts.Envelope(99.0d, (double) 0L, 13.0d, (double) (-1.0f));
        double double5 = envelope4.getWidth();
        envelope4.init(100.60000000000001d, 102.3d, (double) 10L, (double) (-1L));
        double double11 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 99.0d + "'", double5 == 99.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.6999999999999886d + "'", double11 == 1.6999999999999886d);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        jts.Envelope envelope4 = new jts.Envelope((double) (-3), (double) 10L, (double) (-6), 0.0d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 13.0d + "'", double5 == 13.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 13.0d + "'", double6 == 13.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 13.0d + "'", double7 == 13.0d);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass9 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), (double) (short) 0, 1.0d, (double) 10);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.maxExtent();
        envelope4.init(4.0d, 36.0d, (double) (-10L), 11.3d);
        double double12 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.0d + "'", double6 == 9.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        jts.Envelope envelope4 = new jts.Envelope(79.7d, 75.5d, 98.7d, 52.0d);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.getHeight();
        double double15 = envelope4.getWidth();
        boolean boolean16 = envelope4.isEnvelopeNull();
        double double17 = envelope4.maxExtent();
        double double18 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 109.0d + "'", double15 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 109.0d + "'", double17 == 109.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 109.0d + "'", double18 == 109.0d);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        jts.Envelope envelope4 = new jts.Envelope((double) (-7), (double) 4L, (-7.3d), (-100.0d));
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass7 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 92.7d + "'", double6 == 92.7d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        boolean boolean16 = envelope4.isEnvelopeNull();
        envelope4.init(85.5d, (-8.7d), (double) (short) -1, 3.7d);
        java.lang.Class<?> wildcardClass22 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        jts.Envelope envelope4 = new jts.Envelope(1.5999999999999996d, (double) 100L, 51.0d, (double) 0.0f);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        jts.Envelope envelope4 = new jts.Envelope(99.0d, (double) 0L, 13.0d, (double) (-1.0f));
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getWidth();
        envelope4.init(100.30000000000001d, 56.7d, 35.0d, (double) (-3));
        java.lang.Class<?> wildcardClass12 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 99.0d + "'", double5 == 99.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 99.0d + "'", double6 == 99.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getHeight();
        envelope4.init((double) 3L, (double) (-7), (double) (byte) 0, 0.0d);
        boolean boolean15 = envelope4.isEnvelopeNull();
        envelope4.init((double) 1, 20.5d, (double) (-1L), 110.1d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        jts.Envelope envelope4 = new jts.Envelope(31.0d, (double) (byte) 100, 2.9000000000000004d, 5.0d);
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init(98.89999999999999d, 1.7000000000000002d, 86.5d, (double) 10);
        double double12 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 69.0d + "'", double5 == 69.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.19999999999999d + "'", double12 == 97.19999999999999d);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        double double13 = envelope4.getWidth();
        double double14 = envelope4.getWidth();
        envelope4.init((double) (-7), (double) 100L, (-5.4d), (double) 100);
        double double20 = envelope4.getHeight();
        double double21 = envelope4.getWidth();
        double double22 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 109.0d + "'", double13 == 109.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 105.4d + "'", double20 == 105.4d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 107.0d + "'", double21 == 107.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 107.0d + "'", double22 == 107.0d);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        jts.Envelope envelope4 = new jts.Envelope(1.5d, 5.1d, 0.0d, 9.2d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        envelope4.init(6.9d, (double) (byte) 0, (double) (byte) 1, (double) (-1.0f));
        double double18 = envelope4.getWidth();
        boolean boolean19 = envelope4.isEnvelopeNull();
        boolean boolean20 = envelope4.isEnvelopeNull();
        envelope4.init(65.0d, (double) (short) 10, (double) '#', (double) 1);
        double double26 = envelope4.getHeight();
        double double27 = envelope4.getHeight();
        envelope4.init(5.0d, (double) (-7), 0.0d, (double) 10.0f);
        boolean boolean33 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 34.0d + "'", double26 == 34.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 34.0d + "'", double27 == 34.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), (double) (short) 0, 1.0d, (double) 10);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.0d + "'", double5 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.0d + "'", double6 == 9.0d);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) 0, (-2.1d), (double) (-8L), (double) (-4));
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getWidth();
        envelope4.init(193.0d, 62.0d, 51.0d, (double) (-3L));
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.1d + "'", double5 == 2.1d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.1d + "'", double6 == 2.1d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 131.0d + "'", double13 == 131.0d);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        double double16 = envelope4.getWidth();
        double double17 = envelope4.maxExtent();
        double double18 = envelope4.maxExtent();
        double double19 = envelope4.getHeight();
        envelope4.init(5.4d, 117.7d, 74.6d, 53.0d);
        double double25 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.0d + "'", double18 == 8.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 8.0d + "'", double19 == 8.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 112.3d + "'", double25 == 112.3d);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        jts.Envelope envelope4 = new jts.Envelope((double) 0, (-6.9d), 93.0d, 10.0d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.9d + "'", double5 == 6.9d);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        jts.Envelope envelope4 = new jts.Envelope(87.1d, (double) 1L, 73.0d, (double) 0);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1), 182.7d, 173.6d, 51.0d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 122.6d + "'", double5 == 122.6d);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init((double) 100, (-100.0d), (double) '#', 5.0d);
        envelope4.init((double) 5, (double) (short) 10, 96.0d, (double) (byte) 10);
        envelope4.init(100.0d, (-100.0d), (double) (byte) 100, (double) 1L);
        envelope4.init((double) 3, 4.8d, 100.0d, 0.0d);
        envelope4.init(111.9d, 4.4d, 0.0d, (double) (-100L));
        envelope4.init(1.3000000000000007d, 101.8d, 46.0d, 41.3d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        jts.Envelope envelope4 = new jts.Envelope((double) (-7), (double) (-3L), 95.2d, (double) 9L);
        double double5 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 86.2d + "'", double5 == 86.2d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 3.1d, 5.0d, 2.7d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) 0, (double) 0.0f, (double) (-5), 0.0d);
        double double12 = envelope4.maxExtent();
        boolean boolean13 = envelope4.isEnvelopeNull();
        boolean boolean14 = envelope4.isEnvelopeNull();
        boolean boolean15 = envelope4.isEnvelopeNull();
        envelope4.init(92.7d, 24.0d, (double) 1L, 89.5d);
        double double21 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3d + "'", double5 == 2.3d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 6.9d + "'", double6 == 6.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 5.0d + "'", double12 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 68.7d + "'", double21 == 68.7d);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), 16.0d, 9.0d, 106.0d);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        jts.Envelope envelope4 = new jts.Envelope(89.5d, (double) (byte) 100, 2.9000000000000004d, (double) (-1));
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.5d + "'", double5 == 10.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.9000000000000004d + "'", double6 == 3.9000000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.5d + "'", double7 == 10.5d);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        jts.Envelope envelope4 = new jts.Envelope(84.60000000000001d, 17.6d, 90.3d, 104.6d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        jts.Envelope envelope4 = new jts.Envelope(51.0d, 2.200000000000003d, 12.3d, 1.2000000000000002d);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        jts.Envelope envelope4 = new jts.Envelope(41.2d, (double) 1L, 111.9d, 8.7d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        double double13 = envelope4.getHeight();
        double double14 = envelope4.maxExtent();
        double double15 = envelope4.getWidth();
        envelope4.init((double) (short) 10, 117.7d, 0.0d, 19.0d);
        boolean boolean21 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 109.0d + "'", double15 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        envelope4.init((double) (byte) 1, (double) (-8L), (double) 8L, (double) (-4L));
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getHeight();
        envelope4.init(95.0d, 200.0d, 200.0d, (double) 6);
        boolean boolean19 = envelope4.isEnvelopeNull();
        boolean boolean20 = envelope4.isEnvelopeNull();
        envelope4.init((double) 10L, 16.0d, 90.0d, 102.3d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 12.0d + "'", double11 == 12.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 12.0d + "'", double12 == 12.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 12.0d + "'", double13 == 12.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        jts.Envelope envelope4 = new jts.Envelope(60.0d, 1.2000000000000002d, (double) 4L, 3.299999999999997d);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        jts.Envelope envelope4 = new jts.Envelope((-100.0d), (double) 7L, 14.6d, (double) 100L);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.getWidth();
        boolean boolean9 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 107.0d + "'", double5 == 107.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 107.0d + "'", double6 == 107.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 85.4d + "'", double7 == 85.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 107.0d + "'", double8 == 107.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getHeight();
        envelope4.init((double) ' ', (-2.1d), 109.0d, (double) 6);
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 103.0d + "'", double11 == 103.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 132.0d, 9.5d, 3.7d);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        jts.Envelope envelope4 = new jts.Envelope(9.6d, 0.0d, (double) (-3L), 2.1d);
        envelope4.init(16.200000000000003d, 5.1d, 9.100000000000003d, 93.1d);
        envelope4.init(1.5999999999999996d, 5.4d, 102.3d, 24.0d);
        boolean boolean15 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        jts.Envelope envelope4 = new jts.Envelope(34.0d, 55.0d, 92.3d, 95.7d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 21.0d + "'", double5 == 21.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 21.0d + "'", double6 == 21.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 21.0d + "'", double7 == 21.0d);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        jts.Envelope envelope4 = new jts.Envelope(88.7d, 11.0d, 0.0d, (double) 4L);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        jts.Envelope envelope4 = new jts.Envelope((double) 100L, (double) (short) 100, (double) 4, 0.0d);
        double double5 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        jts.Envelope envelope4 = new jts.Envelope(13.0d, 0.6000000000000005d, (double) ' ', 83.7d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 12.399999999999999d + "'", double5 == 12.399999999999999d);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        jts.Envelope envelope4 = new jts.Envelope(3.2d, 14.9d, 8.700000000000003d, 86.6d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 77.89999999999999d + "'", double5 == 77.89999999999999d);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        double double13 = envelope4.getHeight();
        double double14 = envelope4.maxExtent();
        double double15 = envelope4.getWidth();
        boolean boolean16 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass17 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 109.0d + "'", double15 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        jts.Envelope envelope4 = new jts.Envelope(8.4d, 7.7d, 98.89999999999999d, 13.5d);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        jts.Envelope envelope4 = new jts.Envelope((double) 0, 0.0d, 203.5d, 109.7d);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        envelope4.init((double) (-8), (double) (-9), (double) (-100), (double) 2L);
        double double16 = envelope4.maxExtent();
        envelope4.init((-7.3d), 15.0d, 6.0d, (double) 100);
        double double22 = envelope4.getWidth();
        double double23 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass24 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 102.0d + "'", double16 == 102.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 22.3d + "'", double22 == 22.3d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 22.3d + "'", double23 == 22.3d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        jts.Envelope envelope4 = new jts.Envelope((-7.3d), 3.9d, 87.0d, 0.5999999999999996d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getWidth();
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.getWidth();
        envelope4.init((double) (byte) 10, 0.0d, (double) (short) 1, 62.0d);
        double double17 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.0d + "'", double11 == 8.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 61.0d + "'", double17 == 61.0d);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        jts.Envelope envelope4 = new jts.Envelope(98.7d, 95.0d, 4.4d, 9.0d);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        jts.Envelope envelope4 = new jts.Envelope(99.7d, 13.3d, 33.1d, 68.7d);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getHeight();
        boolean boolean14 = envelope4.isEnvelopeNull();
        boolean boolean15 = envelope4.isEnvelopeNull();
        double double16 = envelope4.getWidth();
        boolean boolean17 = envelope4.isEnvelopeNull();
        double double18 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 104.0d + "'", double12 == 104.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 106.0d + "'", double16 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 106.0d + "'", double18 == 106.0d);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        jts.Envelope envelope4 = new jts.Envelope((double) (-7), (double) (-3L), 95.2d, (double) 9L);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (short) 0, (-9.3d), (double) (-1L));
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass7 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.0d + "'", double5 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.0d + "'", double6 == 9.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getHeight();
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getHeight();
        envelope4.init((-3.8d), 65.0d, 1.3000000000000007d, 104.1d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.4d + "'", double9 == 8.4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.0d + "'", double10 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.4d + "'", double11 == 8.4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.4d + "'", double12 == 8.4d);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        jts.Envelope envelope4 = new jts.Envelope((double) (-6), 0.0d, (double) (-5L), (double) 7);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        jts.Envelope envelope4 = new jts.Envelope(24.0d, 51.0d, 96.0d, 3.3d);
        envelope4.init(17.6d, 2.3d, 96.2d, 0.0d);
        double double10 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 96.2d + "'", double10 == 96.2d);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        jts.Envelope envelope4 = new jts.Envelope((double) 10L, 18.0d, (double) (-8), 13.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init(0.0d, 51.0d, 110.0d, (double) 9);
        double double11 = envelope4.getHeight();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.maxExtent();
        double double14 = envelope4.getWidth();
        double double15 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 21.0d + "'", double5 == 21.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 101.0d + "'", double11 == 101.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 101.0d + "'", double13 == 101.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 51.0d + "'", double14 == 51.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 51.0d + "'", double15 == 51.0d);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        jts.Envelope envelope4 = new jts.Envelope(92.2d, 94.0d, 24.0d, 11.5d);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        jts.Envelope envelope4 = new jts.Envelope((double) 7, (double) 10.0f, (double) 4L, (double) 0L);
        envelope4.init((double) 10.0f, (double) 4, (double) 9, 3.1d);
        double double10 = envelope4.getHeight();
        double double11 = envelope4.getWidth();
        double double12 = envelope4.maxExtent();
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.9d + "'", double10 == 5.9d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 6.0d + "'", double11 == 6.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.0d + "'", double12 == 6.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.0d + "'", double14 == 6.0d);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        jts.Envelope envelope4 = new jts.Envelope(91.0d, 12.6d, 90.19999999999999d, 2.1d);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getHeight();
        envelope4.init((double) 1, 5.0d, 3.1d, 24.0d);
        envelope4.init((double) '4', 105.7d, 43.6d, 105.2d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        envelope4.init((-5.4d), (-8.7d), (double) 5L, (double) 7);
        envelope4.init((double) (-1L), 0.0d, (double) (-6L), 14.0d);
        boolean boolean17 = envelope4.isEnvelopeNull();
        double double18 = envelope4.maxExtent();
        envelope4.init(63.3d, 1.0d, 0.0d, 62.699999999999996d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        jts.Envelope envelope4 = new jts.Envelope((double) 10.0f, (double) 4, (double) 5, 8.4d);
        envelope4.init((double) (-3L), (double) (byte) 100, 110.5d, (double) (-7));
        double double10 = envelope4.getHeight();
        envelope4.init(21.0d, 27.0d, 173.6d, 68.6d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 117.5d + "'", double10 == 117.5d);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getWidth();
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.getWidth();
        envelope4.init((double) 100L, 102.0d, 52.0d, 132.0d);
        double double17 = envelope4.maxExtent();
        envelope4.init(0.0d, (-3.8d), 73.0d, 0.0d);
        double double23 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 80.0d + "'", double17 == 80.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 3.8d + "'", double23 == 3.8d);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        jts.Envelope envelope4 = new jts.Envelope(92.2d, (double) 2, 14.700000000000003d, 98.2d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 90.2d + "'", double5 == 90.2d);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        boolean boolean8 = envelope4.isEnvelopeNull();
        envelope4.init((-100.0d), (double) (-1), 104.0d, (double) (-7L));
        boolean boolean14 = envelope4.isEnvelopeNull();
        double double15 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 111.0d + "'", double15 == 111.0d);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) 0, (-2.1d), (double) (-8L), (double) (-4));
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        envelope4.init(0.0d, 5.0d, 2.3d, (double) 10.0f);
        envelope4.init(7.6d, 191.3d, 1.3999999999999986d, (-8.7d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        jts.Envelope envelope4 = new jts.Envelope((double) 100, 24.0d, 5.0d, (double) (-9));
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 76.0d + "'", double5 == 76.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 76.0d + "'", double6 == 76.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 14.0d + "'", double7 == 14.0d);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        jts.Envelope envelope4 = new jts.Envelope((double) (-2), (double) 100, 4.0d, (double) 1.0f);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.0d + "'", double5 == 102.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.0d + "'", double6 == 3.0d);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        jts.Envelope envelope4 = new jts.Envelope(9.0d, 88.7d, 55.0d, 15.0d);
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 79.7d + "'", double5 == 79.7d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        boolean boolean16 = envelope4.isEnvelopeNull();
        double double17 = envelope4.getHeight();
        double double18 = envelope4.maxExtent();
        double double19 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.0d + "'", double18 == 8.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        envelope4.init(7.1d, (double) (byte) 10, (-5.4d), 5.0d);
        boolean boolean12 = envelope4.isEnvelopeNull();
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.4d + "'", double14 == 10.4d);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        jts.Envelope envelope4 = new jts.Envelope(11.9d, (double) 100L, (double) (-1L), (double) 100L);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 88.1d + "'", double5 == 88.1d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 101.0d + "'", double6 == 101.0d);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        envelope4.init(6.9d, (double) (byte) 0, (double) (byte) 1, (double) (-1.0f));
        double double18 = envelope4.getWidth();
        boolean boolean19 = envelope4.isEnvelopeNull();
        boolean boolean20 = envelope4.isEnvelopeNull();
        boolean boolean21 = envelope4.isEnvelopeNull();
        double double22 = envelope4.getHeight();
        double double23 = envelope4.getHeight();
        double double24 = envelope4.getHeight();
        envelope4.init(94.1d, (double) (-4), 2.1d, 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.0d + "'", double22 == 2.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2.0d + "'", double23 == 2.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 2.0d + "'", double24 == 2.0d);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.getHeight();
        double double14 = envelope4.maxExtent();
        boolean boolean15 = envelope4.isEnvelopeNull();
        envelope4.init((double) (-5L), (double) 7L, 52.5d, (double) (-5));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 106.0d + "'", double14 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 94.3d, 8.7d, (double) 3L);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 94.3d + "'", double5 == 94.3d);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getHeight();
        envelope4.init(1.5d, (double) (-1.0f), (double) (-1L), (double) (byte) 100);
        double double13 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 101.0d + "'", double13 == 101.0d);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        jts.Envelope envelope4 = new jts.Envelope(6.3d, (double) 7L, 87.0d, (double) 10.0f);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 77.0d + "'", double6 == 77.0d);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        jts.Envelope envelope4 = new jts.Envelope(8.1d, 6.1d, 114.9d, 77.9d);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        jts.Envelope envelope4 = new jts.Envelope(0.6999999999999993d, 41.3d, 1.9d, 5.9d);
        envelope4.init(33.7d, 38.0d, 111.0d, (double) 10L);
        java.lang.Class<?> wildcardClass10 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init((double) (short) 0, 2.7d, (double) (-1.0f), (double) 100L);
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.getHeight();
        boolean boolean14 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass15 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 101.0d + "'", double13 == 101.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        envelope4.init(7.1d, (double) (byte) 10, (-5.4d), 5.0d);
        double double12 = envelope4.getWidth();
        envelope4.init((double) (-8), 1.3999999999999986d, 12.7d, 96.0d);
        double double18 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.9000000000000004d + "'", double12 == 2.9000000000000004d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 83.3d + "'", double18 == 83.3d);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        double double13 = envelope4.getWidth();
        double double14 = envelope4.getWidth();
        boolean boolean15 = envelope4.isEnvelopeNull();
        envelope4.init(5.8d, (double) 7, (double) 8, 4.8d);
        double double21 = envelope4.getWidth();
        double double22 = envelope4.maxExtent();
        boolean boolean23 = envelope4.isEnvelopeNull();
        envelope4.init(84.0d, 90.0d, 77.5d, 89.7d);
        envelope4.init(5.0d, (double) 3L, (double) 0L, 9.100000000000003d);
        double double34 = envelope4.getHeight();
        double double35 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 109.0d + "'", double13 == 109.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.2000000000000002d + "'", double21 == 1.2000000000000002d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 3.2d + "'", double22 == 3.2d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 9.100000000000003d + "'", double34 == 9.100000000000003d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 9.100000000000003d + "'", double35 == 9.100000000000003d);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        jts.Envelope envelope4 = new jts.Envelope(98.1d, (double) (-100), 5.299999999999983d, (double) (-6L));
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 11.299999999999983d + "'", double5 == 11.299999999999983d);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        jts.Envelope envelope4 = new jts.Envelope(92.3d, (double) 4L, 95.0d, 92.7d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 88.3d + "'", double5 == 88.3d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 88.3d + "'", double6 == 88.3d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 88.3d + "'", double7 == 88.3d);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        jts.Envelope envelope4 = new jts.Envelope(5.0d, 2.1d, 92.9d, 104.0d);
        envelope4.init(190.3d, 86.6d, 82.3d, 22.5d);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getHeight();
        double double10 = envelope4.getHeight();
        double double11 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.0d + "'", double10 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.0d + "'", double11 == 8.0d);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), (double) 100L, 86.5d, 13.4d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 73.1d + "'", double5 == 73.1d);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.maxExtent();
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getHeight();
        boolean boolean12 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.4d + "'", double9 == 8.4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.4d + "'", double10 == 8.4d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.4d + "'", double11 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        jts.Envelope envelope4 = new jts.Envelope(92.7d, (double) (-10L), 1.2d, (double) (-8L));
        double double5 = envelope4.getWidth();
        envelope4.init(110.0d, (double) (-4), (double) 1, (double) 0);
        envelope4.init((double) (-10L), (double) 100L, (double) 10, (double) 10.0f);
        double double16 = envelope4.getHeight();
        double double17 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.7d + "'", double5 == 102.7d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        jts.Envelope envelope4 = new jts.Envelope(9.2d, (double) 7, 86.0d, 10.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getHeight();
        envelope4.init(0.0d, 24.0d, 103.69999999999999d, 99.0d);
        double double13 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 76.0d + "'", double6 == 76.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 76.0d + "'", double7 == 76.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 24.0d + "'", double13 == 24.0d);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        jts.Envelope envelope4 = new jts.Envelope(100.0d, 10.5d, (double) 2, (-100.0d));
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        envelope4.init(104.0d, 11.3d, 4.800000000000001d, 105.0d);
        double double13 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.0d + "'", double5 == 102.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 89.5d + "'", double6 == 89.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 102.0d + "'", double7 == 102.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 92.7d + "'", double13 == 92.7d);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getHeight();
        double double10 = envelope4.getHeight();
        envelope4.init(0.0d, 80.0d, (double) 4, 99.0d);
        boolean boolean16 = envelope4.isEnvelopeNull();
        boolean boolean17 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.4d + "'", double9 == 8.4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.4d + "'", double10 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        boolean boolean13 = envelope4.isEnvelopeNull();
        boolean boolean14 = envelope4.isEnvelopeNull();
        double double15 = envelope4.getWidth();
        boolean boolean16 = envelope4.isEnvelopeNull();
        double double17 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 106.0d + "'", double15 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 106.0d + "'", double17 == 106.0d);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), 10.5d, (double) (short) 100, (double) 9);
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 11.5d + "'", double5 == 11.5d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        jts.Envelope envelope4 = new jts.Envelope((double) (-7), (double) (-3L), 95.2d, (double) 9L);
        double double5 = envelope4.maxExtent();
        envelope4.init(40.300000000000004d, 10.299999999999997d, 72.9d, (double) (-4L));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 86.2d + "'", double5 == 86.2d);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getHeight();
        double double10 = envelope4.maxExtent();
        envelope4.init(12.0d, 0.0d, 1.3000000000000007d, 3.299999999999997d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.4d + "'", double9 == 8.4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.4d + "'", double10 == 8.4d);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getHeight();
        envelope4.init(104.0d, (double) 10L, (double) 3L, 4.8d);
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getHeight();
        envelope4.init(85.0d, 78.7d, 90.89999999999999d, 86.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7999999999999998d + "'", double11 == 1.7999999999999998d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7999999999999998d + "'", double12 == 1.7999999999999998d);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        boolean boolean9 = envelope4.isEnvelopeNull();
        double double10 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass11 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.0d + "'", double10 == 8.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass7 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.4d + "'", double6 == 8.4d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getWidth();
        envelope4.init((double) 6, 1.2d, 18.0d, (-9.3d));
        envelope4.init(20.0d, 103.0d, 0.0d, 93.1d);
        java.lang.Class<?> wildcardClass24 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 96.0d + "'", double11 == 96.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 96.0d + "'", double12 == 96.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.0d + "'", double13 == 8.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        double double13 = envelope4.getWidth();
        double double14 = envelope4.getWidth();
        envelope4.init((double) (-7), (double) 100L, (-5.4d), (double) 100);
        double double20 = envelope4.getHeight();
        double double21 = envelope4.getHeight();
        double double22 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass23 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 109.0d + "'", double13 == 109.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 105.4d + "'", double20 == 105.4d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 105.4d + "'", double21 == 105.4d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 107.0d + "'", double22 == 107.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        jts.Envelope envelope4 = new jts.Envelope(109.0d, 1.7999999999999998d, 1.0d, 14.9d);
        envelope4.init((double) '#', (double) 3, (double) 6, 199.0d);
        envelope4.init((double) (byte) -1, 20.5d, 116.0d, 86.5d);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        envelope4.init(7.1d, (double) (byte) 10, (-5.4d), 5.0d);
        boolean boolean12 = envelope4.isEnvelopeNull();
        boolean boolean13 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass14 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        jts.Envelope envelope4 = new jts.Envelope(4.799999999999997d, 0.6000000000000005d, 62.0d, 91.3d);
        double double5 = envelope4.getWidth();
        envelope4.init(14.6d, 0.0d, 18.9d, 86.2d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.199999999999997d + "'", double5 == 4.199999999999997d);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        jts.Envelope envelope4 = new jts.Envelope(6.0d, (double) 1L, 0.0d, 95.2d);
        envelope4.init(18.9d, 92.7d, 79.7d, (double) 10L);
        envelope4.init((double) (-7), 3.5d, 80.3d, 26.800000000000004d);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        jts.Envelope envelope4 = new jts.Envelope(98.7d, 88.1d, (double) (-3), 62.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        boolean boolean8 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 65.0d + "'", double5 == 65.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.600000000000009d + "'", double6 == 10.600000000000009d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 65.0d + "'", double7 == 65.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        jts.Envelope envelope4 = new jts.Envelope(105.4d, 102.0d, 11.5d, 48.0d);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        envelope4.init(7.1d, (double) (byte) 10, (-5.4d), 5.0d);
        boolean boolean12 = envelope4.isEnvelopeNull();
        envelope4.init(103.0d, 24.0d, (double) (-3L), 106.0d);
        boolean boolean18 = envelope4.isEnvelopeNull();
        double double19 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 109.0d + "'", double19 == 109.0d);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        jts.Envelope envelope4 = new jts.Envelope(2.5999999999999996d, 5.3d, 11.600000000000001d, (double) 100.0f);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        jts.Envelope envelope4 = new jts.Envelope((double) 1.0f, 95.7d, 100.0d, (-8.7d));
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        jts.Envelope envelope4 = new jts.Envelope(11.9d, (double) 100L, (double) (-1L), (double) 100L);
        double double5 = envelope4.getWidth();
        envelope4.init(66.0d, 42.0d, 3.299999999999997d, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 88.1d + "'", double5 == 88.1d);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        envelope4.init((double) (byte) 1, (double) (-8L), (double) 8L, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.maxExtent();
        boolean boolean13 = envelope4.isEnvelopeNull();
        envelope4.init((-4.6d), 98.89999999999999d, 106.9d, (double) (-2L));
        envelope4.init(3.299999999999999d, 8.4d, 21.1d, 6.3d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 12.0d + "'", double10 == 12.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 12.0d + "'", double11 == 12.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 12.0d + "'", double12 == 12.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.getHeight();
        double double15 = envelope4.getWidth();
        double double16 = envelope4.getHeight();
        envelope4.init((double) (-10), 76.0d, 0.9000000000000004d, 0.2999999999999998d);
        double double22 = envelope4.getHeight();
        envelope4.init((double) 1, 98.7d, 7.1d, 4.8d);
        double double28 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 109.0d + "'", double15 == 109.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5.0d + "'", double16 == 5.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.6000000000000005d + "'", double22 == 0.6000000000000005d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 97.7d + "'", double28 == 97.7d);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), (double) (short) 0, 1.0d, (double) 10);
        double double5 = envelope4.getWidth();
        envelope4.init((double) (byte) 100, (double) (byte) 0, (double) 4, (double) (-1L));
        double double11 = envelope4.getWidth();
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.getHeight();
        envelope4.init((-4.6d), 12.7d, 7.899999999999999d, (double) (-1L));
        envelope4.init(5.600000000000001d, 107.9d, 7.300000000000001d, 96.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        jts.Envelope envelope4 = new jts.Envelope((double) 1.0f, 1.0d, 8.0d, (double) 100);
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init(0.0d, 0.2999999999999998d, 11.3d, 0.0d);
        boolean boolean11 = envelope4.isEnvelopeNull();
        envelope4.init(14.3d, 97.4d, (double) 5, 11.299999999999983d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        boolean boolean11 = envelope4.isEnvelopeNull();
        boolean boolean12 = envelope4.isEnvelopeNull();
        boolean boolean13 = envelope4.isEnvelopeNull();
        boolean boolean14 = envelope4.isEnvelopeNull();
        envelope4.init(1.2999999999999998d, 102.3d, 73.0d, (double) (byte) 1);
        double double20 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 101.0d + "'", double20 == 101.0d);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        jts.Envelope envelope4 = new jts.Envelope(110.1d, (double) 100, 6.0d, 132.0d);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        jts.Envelope envelope4 = new jts.Envelope(0.9000000000000004d, 2.7d, 22.3d, 98.1d);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        envelope4.init(6.9d, (double) (byte) 0, (double) (byte) 1, (double) (-1.0f));
        double double18 = envelope4.getWidth();
        double double19 = envelope4.maxExtent();
        envelope4.init((double) ' ', (double) 8, (double) 7, 1.0d);
        boolean boolean25 = envelope4.isEnvelopeNull();
        double double26 = envelope4.getWidth();
        double double27 = envelope4.getHeight();
        double double28 = envelope4.getWidth();
        double double29 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 6.9d + "'", double19 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 24.0d + "'", double26 == 24.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 6.0d + "'", double27 == 6.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 24.0d + "'", double28 == 24.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 6.0d + "'", double29 == 6.0d);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        double double13 = envelope4.getHeight();
        double double14 = envelope4.maxExtent();
        double double15 = envelope4.getHeight();
        double double16 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass17 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 5.0d + "'", double15 == 5.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 109.0d + "'", double16 == 109.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        jts.Envelope envelope4 = new jts.Envelope((double) (-10L), 61.9d, (double) 10.0f, 33.1d);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        jts.Envelope envelope4 = new jts.Envelope(4.8d, (double) (short) 0, 7.1d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass7 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.1d + "'", double5 == 7.1d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.1d + "'", double6 == 7.1d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) 10, (double) (byte) 1, (double) (byte) 0);
        double double5 = envelope4.maxExtent();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.getWidth();
        envelope4.init(109.0d, 6.1d, 13.0d, (double) 100.0f);
        envelope4.init((double) 'a', (double) '4', (double) (short) 1, 111.0d);
        double double19 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 110.0d + "'", double19 == 110.0d);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        jts.Envelope envelope4 = new jts.Envelope(1.7000000000000002d, 13.0d, (double) 1, (double) 0);
        double double5 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 11.3d + "'", double5 == 11.3d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        double double16 = envelope4.getWidth();
        double double17 = envelope4.maxExtent();
        boolean boolean18 = envelope4.isEnvelopeNull();
        double double19 = envelope4.getHeight();
        boolean boolean20 = envelope4.isEnvelopeNull();
        double double21 = envelope4.maxExtent();
        boolean boolean22 = envelope4.isEnvelopeNull();
        double double23 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 8.0d + "'", double19 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 8.0d + "'", double21 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 8.0d + "'", double23 == 8.0d);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) 100, (double) (-100), 94.0d, (double) 9L);
        envelope4.init(90.0d, (double) 5L, (double) (-1), (double) 4);
        double double10 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 85.0d + "'", double10 == 85.0d);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        jts.Envelope envelope4 = new jts.Envelope((double) (-3), 0.0d, 155.4d, 0.0d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 155.4d + "'", double5 == 155.4d);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        jts.Envelope envelope4 = new jts.Envelope(3.0d, (-9.3d), (-8.7d), (double) (short) 10);
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 12.3d + "'", double5 == 12.3d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        envelope4.init(6.9d, (double) (byte) 0, (double) (byte) 1, (double) (-1.0f));
        double double18 = envelope4.getWidth();
        double double19 = envelope4.maxExtent();
        double double20 = envelope4.getHeight();
        double double21 = envelope4.getWidth();
        envelope4.init(90.2d, 83.0d, (double) 10, 12.3d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 6.9d + "'", double19 == 6.9d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.0d + "'", double20 == 2.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 6.9d + "'", double21 == 6.9d);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getHeight();
        envelope4.init(102.0d, 0.0d, (double) 0, (double) ' ');
        double double15 = envelope4.maxExtent();
        envelope4.init((-1.2d), (double) (-4), 7.1d, 14.0d);
        boolean boolean21 = envelope4.isEnvelopeNull();
        boolean boolean22 = envelope4.isEnvelopeNull();
        envelope4.init(48.0d, 36.0d, 3.8d, 199.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 102.0d + "'", double15 == 102.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        envelope4.init(6.9d, (double) (byte) 0, (double) (byte) 1, (double) (-1.0f));
        double double18 = envelope4.getWidth();
        double double19 = envelope4.maxExtent();
        double double20 = envelope4.getHeight();
        boolean boolean21 = envelope4.isEnvelopeNull();
        double double22 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 6.9d + "'", double19 == 6.9d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.0d + "'", double20 == 2.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 6.9d + "'", double22 == 6.9d);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.getWidth();
        envelope4.init(58.0d, 13.0d, (double) (byte) 0, 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 106.0d + "'", double14 == 106.0d);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        jts.Envelope envelope4 = new jts.Envelope(84.0d, (double) (short) 10, (double) '#', 89.5d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        jts.Envelope envelope4 = new jts.Envelope((-7.3d), 86.6d, 203.5d, 4.4d);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.maxExtent();
        boolean boolean9 = envelope4.isEnvelopeNull();
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.4d + "'", double11 == 8.4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.4d + "'", double12 == 8.4d);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        jts.Envelope envelope4 = new jts.Envelope(20.0d, (double) 10L, 0.6999999999999993d, 109.7d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 109.0d + "'", double5 == 109.0d);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        jts.Envelope envelope4 = new jts.Envelope((double) (-7), (double) (-3L), 95.2d, (double) 9L);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 86.2d + "'", double5 == 86.2d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        jts.Envelope envelope4 = new jts.Envelope(99.2d, 0.0d, 92.0d, (double) '#');
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        jts.Envelope envelope4 = new jts.Envelope(30.0d, (double) 100L, 103.0d, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 103.0d + "'", double6 == 103.0d);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getWidth();
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass13 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.0d + "'", double11 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        jts.Envelope envelope4 = new jts.Envelope(98.7d, 88.1d, (double) (-3), 62.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 65.0d + "'", double6 == 65.0d);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) 100L, 15.0d, 2.3d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass7 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 12.7d + "'", double5 == 12.7d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 12.7d + "'", double6 == 12.7d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 3.1d, 5.0d, 2.7d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        envelope4.init(98.7d, 62.0d, 90.0d, 60.0d);
        double double12 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.9d + "'", double5 == 6.9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.3d + "'", double6 == 2.3d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        jts.Envelope envelope4 = new jts.Envelope((double) (-10), (double) (-3L), 0.0d, (double) 10.0f);
        envelope4.init(2.700000000000003d, 89.2d, 93.0d, 72.3d);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 3.0d, (double) 100.0f, 7.1d);
        envelope4.init(1.7000000000000002d, 106.0d, (double) 100.0f, 14.6d);
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass13 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 85.4d + "'", double11 == 85.4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 104.3d + "'", double12 == 104.3d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        jts.Envelope envelope4 = new jts.Envelope(3.0d, (-9.3d), (-8.7d), (double) (short) 10);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 18.7d + "'", double5 == 18.7d);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        envelope4.init((-5.4d), (-8.7d), (double) 5L, (double) 7);
        envelope4.init((double) (-1L), (double) 1L, 96.0d, 100.0d);
        envelope4.init(1.7000000000000002d, (double) (byte) 0, (double) 100L, 93.1d);
        double double22 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 6.900000000000006d + "'", double22 == 6.900000000000006d);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        jts.Envelope envelope4 = new jts.Envelope((-8.7d), (double) (-8L), (double) (-6L), (double) 2);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        envelope4.init(86.5d, 194.0d, 42.0d, (double) (-7));
        boolean boolean12 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 0.0d, 102.7d, (-1.0d));
        double double5 = envelope4.maxExtent();
        envelope4.init(8.1d, 20.799999999999997d, 96.2d, (-10.5d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.7d + "'", double5 == 103.7d);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 73.0d, 68.6d, 13.600000000000001d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 73.0d + "'", double5 == 73.0d);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        jts.Envelope envelope4 = new jts.Envelope((double) 8, 13.0d, 22.3d, (double) 10L);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        jts.Envelope envelope4 = new jts.Envelope((double) ' ', 5.8d, 86.5d, 102.7d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 16.200000000000003d + "'", double6 == 16.200000000000003d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 16.200000000000003d + "'", double7 == 16.200000000000003d);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        jts.Envelope envelope4 = new jts.Envelope((-8.7d), (-6.9d), (-1.0d), (double) (-10));
        double double5 = envelope4.getWidth();
        envelope4.init((double) 0L, (double) (-3L), (-5.4d), 86.5d);
        double double11 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.799999999999999d + "'", double5 == 1.799999999999999d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 91.9d + "'", double11 == 91.9d);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        jts.Envelope envelope4 = new jts.Envelope(9.0d, (double) 0, 92.7d, (double) 100);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.299999999999997d + "'", double5 == 7.299999999999997d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        jts.Envelope envelope4 = new jts.Envelope(31.0d, (double) (byte) 100, 2.9000000000000004d, 5.0d);
        double double5 = envelope4.maxExtent();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 69.0d + "'", double5 == 69.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        envelope4.init(98.6d, 77.9d, 104.0d, 190.3d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        jts.Envelope envelope4 = new jts.Envelope(41.3d, 0.0d, 73.30000000000001d, 7.6d);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        jts.Envelope envelope4 = new jts.Envelope((-7.3d), 3.9d, 87.0d, 0.5999999999999996d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        jts.Envelope envelope4 = new jts.Envelope(98.7d, 41.2d, (-2.1d), 105.7d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 107.8d + "'", double5 == 107.8d);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1.0f), (double) (-9), (double) 2, (double) 10);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.maxExtent();
        envelope4.init((double) (-5L), 22.0d, 34.0d, (-100.0d));
        double double13 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 134.0d + "'", double13 == 134.0d);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        jts.Envelope envelope4 = new jts.Envelope(0.2999999999999998d, 89.2d, 0.0d, 63.3d);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        jts.Envelope envelope4 = new jts.Envelope(90.80000000000001d, 21.1d, 30.0d, 110.0d);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        jts.Envelope envelope4 = new jts.Envelope(17.4d, 0.0d, 88.7d, (double) 7L);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.getWidth();
        double double9 = envelope4.getWidth();
        double double10 = envelope4.getWidth();
        double double11 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.0d + "'", double10 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.4d + "'", double11 == 8.4d);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        jts.Envelope envelope4 = new jts.Envelope(1.799999999999999d, (-5.4d), 96.0d, 43.6d);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        jts.Envelope envelope4 = new jts.Envelope(110.39999999999999d, 0.0d, 4.4d, (double) (-6));
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init(0.0d, 10.4d, (double) (short) -1, (double) (-10L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        jts.Envelope envelope4 = new jts.Envelope(24.0d, 94.0d, (double) (-1), (double) (-6));
        envelope4.init(92.2d, 6.3d, (double) 0.0f, 111.0d);
        double double10 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass11 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 85.9d + "'", double10 == 85.9d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), (double) 4, (double) (-3L), (double) '4');
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass7 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.0d + "'", double5 == 5.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 55.0d + "'", double6 == 55.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        jts.Envelope envelope4 = new jts.Envelope(15.0d, 34.7d, 33.7d, 80.0d);
        double double5 = envelope4.getWidth();
        envelope4.init((double) 10L, 8.8d, (double) 1L, 102.3d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 19.700000000000003d + "'", double5 == 19.700000000000003d);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        jts.Envelope envelope4 = new jts.Envelope((double) (-7), (double) 4L, (-7.3d), (-100.0d));
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        boolean boolean7 = envelope4.isEnvelopeNull();
        double double8 = envelope4.maxExtent();
        double double9 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 11.0d + "'", double6 == 11.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 92.7d + "'", double8 == 92.7d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 11.0d + "'", double9 == 11.0d);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.4d + "'", double6 == 8.4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        envelope4.init((double) (byte) 1, (double) (-8L), (double) 8L, (double) (-4L));
        envelope4.init((double) 1, (double) 4, (double) (-4L), 3.0d);
        double double15 = envelope4.maxExtent();
        double double16 = envelope4.getHeight();
        envelope4.init(1.6999999999999993d, 2.5999999999999996d, 91.2d, 55.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 7.0d + "'", double15 == 7.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 7.0d + "'", double16 == 7.0d);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.getHeight();
        envelope4.init((double) 100L, (double) (byte) 100, 14.0d, 102.7d);
        envelope4.init(3.0d, (double) 1L, (double) (short) 10, (double) (-1L));
        double double19 = envelope4.maxExtent();
        double double20 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 11.0d + "'", double19 == 11.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 11.0d + "'", double20 == 11.0d);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        jts.Envelope envelope4 = new jts.Envelope(92.2d, (double) (byte) 0, 204.0d, 0.0d);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        double double13 = envelope4.getWidth();
        double double14 = envelope4.getWidth();
        envelope4.init((-100.0d), (double) (short) 100, (double) (-7), (double) (byte) -1);
        java.lang.Class<?> wildcardClass20 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 109.0d + "'", double13 == 109.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), (double) (short) 0, 1.0d, (double) 10);
        double double5 = envelope4.getWidth();
        envelope4.init((double) (byte) 100, (double) (byte) 0, (double) 4, (double) (-1L));
        boolean boolean11 = envelope4.isEnvelopeNull();
        double double12 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), (double) (short) 0, 1.0d, (double) 10);
        double double5 = envelope4.getWidth();
        envelope4.init((double) (byte) 100, (double) (byte) 0, (double) 4, (double) (-1L));
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getWidth();
        double double13 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass14 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5.0d + "'", double11 == 5.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        jts.Envelope envelope4 = new jts.Envelope((double) (-8L), 10.0d, (double) (-6L), (double) 8);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getWidth();
        double double10 = envelope4.getWidth();
        envelope4.init(31.0d, (double) 8, 3.9d, 74.69999999999999d);
        java.lang.Class<?> wildcardClass16 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.0d + "'", double7 == 18.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 14.0d + "'", double8 == 14.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 18.0d + "'", double9 == 18.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 18.0d + "'", double10 == 18.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        jts.Envelope envelope4 = new jts.Envelope(11.8d, 12.200000000000003d, 93.7d, 1.9d);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        jts.Envelope envelope4 = new jts.Envelope(1.2d, (double) 10L, 0.0d, (double) 4);
        double double5 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        jts.Envelope envelope4 = new jts.Envelope((double) 1.0f, 104.6d, 54.0d, 13.100000000000001d);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init((double) (short) 0, 0.0d, (double) 100L, (double) (-6L));
        double double16 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass17 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 106.0d + "'", double16 == 106.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getWidth();
        double double9 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 103.0d + "'", double6 == 103.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 103.0d + "'", double7 == 103.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 13.0d + "'", double8 == 13.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 103.0d + "'", double9 == 103.0d);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.getHeight();
        double double15 = envelope4.getWidth();
        double double16 = envelope4.maxExtent();
        double double17 = envelope4.getHeight();
        double double18 = envelope4.getWidth();
        boolean boolean19 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass20 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 109.0d + "'", double15 == 109.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 109.0d + "'", double16 == 109.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 5.0d + "'", double17 == 5.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 109.0d + "'", double18 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        jts.Envelope envelope4 = new jts.Envelope(90.2d, 18.0d, 73.30000000000001d, 96.9d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        jts.Envelope envelope4 = new jts.Envelope((double) (-8L), 101.0d, 72.9d, 0.9000000000000004d);
        envelope4.init((-7.3d), (double) (short) 0, 0.0d, 15.4d);
        double double10 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 7.3d + "'", double10 == 7.3d);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        double double16 = envelope4.getWidth();
        double double17 = envelope4.maxExtent();
        boolean boolean18 = envelope4.isEnvelopeNull();
        double double19 = envelope4.getHeight();
        boolean boolean20 = envelope4.isEnvelopeNull();
        double double21 = envelope4.maxExtent();
        double double22 = envelope4.getHeight();
        double double23 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass24 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 8.0d + "'", double19 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 8.0d + "'", double21 == 8.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 8.0d + "'", double22 == 8.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 8.0d + "'", double23 == 8.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        jts.Envelope envelope4 = new jts.Envelope(24.0d, (double) 2, 104.0d, (-7.3d));
        double double5 = envelope4.maxExtent();
        envelope4.init(58.5d, 58.5d, 65.0d, 3.1d);
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 111.3d + "'", double5 == 111.3d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 61.9d + "'", double11 == 61.9d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.getWidth();
        double double14 = envelope4.getWidth();
        boolean boolean15 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 106.0d + "'", double13 == 106.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 106.0d + "'", double14 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        jts.Envelope envelope4 = new jts.Envelope(19.0d, 82.3d, 111.3d, 2.3d);
        double double5 = envelope4.getHeight();
        envelope4.init(82.3d, 0.0d, (double) 0L, 122.6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 109.0d + "'", double5 == 109.0d);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        envelope4.init(6.9d, (double) (byte) 0, (double) (byte) 1, (double) (-1.0f));
        double double18 = envelope4.getWidth();
        boolean boolean19 = envelope4.isEnvelopeNull();
        boolean boolean20 = envelope4.isEnvelopeNull();
        double double21 = envelope4.getHeight();
        envelope4.init(26.0d, (double) (-1L), 15.0d, 92.0d);
        envelope4.init(0.0d, 5.8999999999999995d, 0.0d, 4.3d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2.0d + "'", double21 == 2.0d);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        jts.Envelope envelope4 = new jts.Envelope(53.0d, 25.1d, 84.0d, 105.4d);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) 0, (-2.1d), (double) (-8L), (double) (-4));
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.1d + "'", double5 == 2.1d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.1d + "'", double6 == 2.1d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.1d + "'", double7 == 2.1d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        jts.Envelope envelope4 = new jts.Envelope(24.0d, (double) 2, 104.0d, (-7.3d));
        double double5 = envelope4.maxExtent();
        envelope4.init(58.5d, 58.5d, 65.0d, 3.1d);
        double double11 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 111.3d + "'", double5 == 111.3d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        boolean boolean11 = envelope4.isEnvelopeNull();
        double double12 = envelope4.getWidth();
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.getHeight();
        boolean boolean15 = envelope4.isEnvelopeNull();
        double double16 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass17 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 104.0d + "'", double14 == 104.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 104.0d + "'", double16 == 104.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.getHeight();
        double double15 = envelope4.getWidth();
        boolean boolean16 = envelope4.isEnvelopeNull();
        double double17 = envelope4.getHeight();
        double double18 = envelope4.maxExtent();
        envelope4.init(96.4d, 2.8d, (double) 100, 41.3d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 109.0d + "'", double15 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 5.0d + "'", double17 == 5.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 109.0d + "'", double18 == 109.0d);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        jts.Envelope envelope4 = new jts.Envelope((double) 7, (double) 10.0f, (double) 4L, (double) 0L);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass8 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.0d + "'", double6 == 3.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
}

