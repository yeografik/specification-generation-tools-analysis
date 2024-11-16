package jts;

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
        double double27 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass28 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 6.9d + "'", double19 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 24.0d + "'", double26 == 24.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 24.0d + "'", double27 == 24.0d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        jts.Envelope envelope4 = new jts.Envelope(87.1d, 85.4d, 0.0d, 51.0d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        jts.Envelope envelope4 = new jts.Envelope(6.1d, 100.8d, 85.3d, 52.0d);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        jts.Envelope envelope4 = new jts.Envelope((double) 100, 100.0d, (double) 0.0f, (double) 0L);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        boolean boolean7 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        jts.Envelope envelope4 = new jts.Envelope(10.200000000000003d, (double) 10L, 37.1d, 3.0d);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        jts.Envelope envelope4 = new jts.Envelope(100.60000000000001d, 13.6d, 0.0d, 9.6d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) 10, (double) (byte) 1, (double) (byte) 0);
        double double5 = envelope4.maxExtent();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        jts.Envelope envelope4 = new jts.Envelope(2.700000000000003d, (-3.8d), 92.3d, (double) (-1));
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        jts.Envelope envelope4 = new jts.Envelope(92.7d, (double) (-10L), 1.2d, (double) (-8L));
        double double5 = envelope4.getWidth();
        envelope4.init(0.0d, 2.9000000000000004d, (double) (-6L), 184.1d);
        double double11 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.7d + "'", double5 == 102.7d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 190.1d + "'", double11 == 190.1d);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        jts.Envelope envelope4 = new jts.Envelope((double) (-7), (double) 4L, (-7.3d), (-100.0d));
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init((double) (-1.0f), (double) 6, (double) (-5), 12.6d);
        double double11 = envelope4.maxExtent();
        envelope4.init(95.2d, (-4.6d), 198.1d, 91.2d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 17.6d + "'", double11 == 17.6d);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.maxExtent();
        double double9 = envelope4.getWidth();
        double double10 = envelope4.getWidth();
        double double11 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.0d + "'", double10 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.4d + "'", double11 == 8.4d);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        jts.Envelope envelope4 = new jts.Envelope(103.0d, 10.5d, 12.3d, 94.1d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 92.5d + "'", double5 == 92.5d);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        boolean boolean16 = envelope4.isEnvelopeNull();
        double double17 = envelope4.getWidth();
        double double18 = envelope4.maxExtent();
        double double19 = envelope4.maxExtent();
        double double20 = envelope4.getHeight();
        boolean boolean21 = envelope4.isEnvelopeNull();
        envelope4.init(54.5d, 0.0d, 0.0d, 30.6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.0d + "'", double18 == 8.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 8.0d + "'", double19 == 8.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 8.0d + "'", double20 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        jts.Envelope envelope4 = new jts.Envelope(51.0d, 12.6d, (-1.2d), 0.0d);
        envelope4.init(29.299999999999997d, 4.800000000000001d, 1.7999999999999998d, (double) (-1));
        double double10 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.8d + "'", double10 == 2.8d);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        jts.Envelope envelope4 = new jts.Envelope(20.0d, 1.5999999999999996d, 13.0d, 90.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        jts.Envelope envelope4 = new jts.Envelope((double) (-10L), (double) (byte) -1, 100.0d, (double) 1);
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init(83.9d, 5.299999999999983d, 101.60000000000001d, 82.9d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        jts.Envelope envelope4 = new jts.Envelope(132.0d, 110.5d, 25.1d, (double) (-2L));
        envelope4.init(9.0d, 12.3d, 107.5d, 5.299999999999983d);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 97.10000000000001d, 83.0d, 1.4000000000000004d);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) 10, (double) (byte) 1, (double) (byte) 0);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        envelope4.init(95.2d, 9.6d, (double) 10, (double) 3L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        jts.Envelope envelope4 = new jts.Envelope(84.0d, 9.6d, 101.0d, 0.0d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 4.1d, (double) 10.0f, 109.7d);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        jts.Envelope envelope4 = new jts.Envelope((double) '4', (double) (-6L), (double) (-6), (double) 100L);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getHeight();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getWidth();
        double double10 = envelope4.getHeight();
        boolean boolean11 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 106.0d + "'", double5 == 106.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 106.0d + "'", double6 == 106.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 106.0d + "'", double7 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 58.0d + "'", double9 == 58.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 3.1d, 5.0d, 2.7d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.9d + "'", double5 == 6.9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 6.9d + "'", double6 == 6.9d);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1.0f), (double) 7L, 11.9d, (double) (-100));
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass7 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        jts.Envelope envelope4 = new jts.Envelope(130.2d, 11.1d, (-4.6d), 24.0d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 119.1d + "'", double5 == 119.1d);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        jts.Envelope envelope4 = new jts.Envelope(5.0d, 5.3d, (double) (-100L), (double) (-2L));
        envelope4.init((double) (byte) 100, 10.5d, (double) (-9L), 8.4d);
        double double10 = envelope4.getHeight();
        double double11 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 17.4d + "'", double10 == 17.4d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 17.4d + "'", double11 == 17.4d);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        jts.Envelope envelope4 = new jts.Envelope(100.0d, 10.5d, (double) 2, (-100.0d));
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 102.0d + "'", double6 == 102.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 102.0d + "'", double7 == 102.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 89.5d + "'", double8 == 89.5d);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        jts.Envelope envelope4 = new jts.Envelope(89.5d, (double) (byte) 100, 2.9000000000000004d, (double) (-1));
        double double5 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.5d + "'", double5 == 10.5d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init((double) 100, (-100.0d), (double) '#', 5.0d);
        envelope4.init((double) 5, (double) (short) 10, 96.0d, (double) (byte) 10);
        envelope4.init(100.0d, (-100.0d), (double) (byte) 100, (double) 1L);
        double double26 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass27 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 99.0d + "'", double26 == 99.0d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getHeight();
        envelope4.init((double) 3L, (double) (-7), (double) (byte) 0, 0.0d);
        boolean boolean15 = envelope4.isEnvelopeNull();
        boolean boolean16 = envelope4.isEnvelopeNull();
        double double17 = envelope4.getWidth();
        envelope4.init(1.7000000000000004d, 12.6d, 21.0d, (double) (-5));
        double double23 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 26.0d + "'", double23 == 26.0d);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        jts.Envelope envelope4 = new jts.Envelope((double) ' ', 5.8d, 86.5d, 102.7d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 16.200000000000003d + "'", double5 == 16.200000000000003d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 16.200000000000003d + "'", double6 == 16.200000000000003d);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        jts.Envelope envelope4 = new jts.Envelope(8.8d, (double) (byte) 100, 27.0d, (double) 8L);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
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
        double double22 = envelope4.getHeight();
        envelope4.init((double) (-1), (double) (-100L), (-10.5d), (-7.3d));
        double double28 = envelope4.getHeight();
        boolean boolean29 = envelope4.isEnvelopeNull();
        double double30 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 6.9d + "'", double19 == 6.9d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.0d + "'", double20 == 2.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 6.9d + "'", double21 == 6.9d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.0d + "'", double22 == 2.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 3.2d + "'", double28 == 3.2d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 3.2d + "'", double30 == 3.2d);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        boolean boolean16 = envelope4.isEnvelopeNull();
        double double17 = envelope4.getWidth();
        double double18 = envelope4.maxExtent();
        envelope4.init(92.0d, (-2.1d), 0.0d, (double) (byte) 1);
        double double24 = envelope4.getHeight();
        double double25 = envelope4.getWidth();
        double double26 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.0d + "'", double18 == 8.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 94.1d + "'", double25 == 94.1d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        jts.Envelope envelope4 = new jts.Envelope((double) (-3), (-100.0d), (-3.8d), 90.3d);
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        boolean boolean7 = envelope4.isEnvelopeNull();
        double double8 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        jts.Envelope envelope4 = new jts.Envelope(3.299999999999997d, 8.100000000000001d, 30.6d, 84.6d);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getHeight();
        boolean boolean14 = envelope4.isEnvelopeNull();
        boolean boolean15 = envelope4.isEnvelopeNull();
        boolean boolean16 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 104.0d + "'", double12 == 104.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 54.2d, 5.1d, 11.3d);
        envelope4.init(41.2d, 98.4d, 3.299999999999997d, 77.89999999999999d);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        jts.Envelope envelope4 = new jts.Envelope((double) 7, (double) 10.0f, (double) 4L, (double) 0L);
        envelope4.init((double) 10.0f, (double) 4, (double) 9, 3.1d);
        envelope4.init((double) 7L, (double) 5L, (double) 2, (double) 9L);
        boolean boolean15 = envelope4.isEnvelopeNull();
        double double16 = envelope4.maxExtent();
        double double17 = envelope4.getWidth();
        double double18 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 7.0d + "'", double16 == 7.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 2.0d + "'", double17 == 2.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 2.0d + "'", double18 == 2.0d);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.maxExtent();
        envelope4.init((-10.5d), (double) 8L, (double) (-10L), (double) (-3));
        boolean boolean14 = envelope4.isEnvelopeNull();
        envelope4.init((double) 4L, 14.6d, 42.3d, 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, (double) 9, (double) '4', 110.0d);
        double double5 = envelope4.getHeight();
        envelope4.init(9.6d, 16.2d, (double) (-100L), 99.4d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 58.0d + "'", double5 == 58.0d);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        jts.Envelope envelope4 = new jts.Envelope(64.0d, 11.1d, 1.0999999999999996d, 72.9d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
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
        double double18 = envelope4.getWidth();
        double double19 = envelope4.getHeight();
        double double20 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 109.0d + "'", double15 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 5.0d + "'", double17 == 5.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 109.0d + "'", double18 == 109.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 5.0d + "'", double19 == 5.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 109.0d + "'", double20 == 109.0d);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        jts.Envelope envelope4 = new jts.Envelope(98.0d, 194.0d, 0.0d, 14.6d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 0.3999999999999999d, 3.7d, 99.0d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 95.3d + "'", double5 == 95.3d);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        jts.Envelope envelope4 = new jts.Envelope((double) 7, (double) 10.0f, (double) 4L, (double) 0L);
        envelope4.init((double) 10.0f, (double) 4, (double) 9, 3.1d);
        envelope4.init((double) 7L, (double) 5L, (double) 2, (double) 9L);
        boolean boolean15 = envelope4.isEnvelopeNull();
        envelope4.init(11.0d, 11.3d, (-9.3d), 90.2d);
        java.lang.Class<?> wildcardClass21 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        jts.Envelope envelope4 = new jts.Envelope((double) 7, (double) 0, (double) 8, (double) (-10));
        envelope4.init(42.0d, 105.4d, (double) 0L, (double) (short) -1);
        envelope4.init((double) ' ', 90.0d, 9.099999999999998d, 109.0d);
        double double15 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 99.9d + "'", double15 == 99.9d);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        jts.Envelope envelope4 = new jts.Envelope(92.2d, 4.799999999999997d, 10.8d, 66.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), (double) 4L, (double) (-1), (double) (byte) 1);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.0d + "'", double6 == 5.0d);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        jts.Envelope envelope4 = new jts.Envelope(10.8d, 101.39999999999999d, 11.5d, (double) (-10L));
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        jts.Envelope envelope4 = new jts.Envelope(6.0d, (double) 100.0f, 88.6d, (double) 100L);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        jts.Envelope envelope4 = new jts.Envelope(14.0d, 102.3d, 1.5999999999999996d, 8.0d);
        envelope4.init(184.1d, 41.3d, 5.800000000000001d, 95.2d);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
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
        boolean boolean29 = envelope4.isEnvelopeNull();
        double double30 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 109.0d + "'", double13 == 109.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.2000000000000002d + "'", double21 == 1.2000000000000002d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 3.2d + "'", double22 == 3.2d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 12.200000000000003d + "'", double30 == 12.200000000000003d);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        jts.Envelope envelope4 = new jts.Envelope(55.0d, 58.5d, 99.7d, (double) (-7L));
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        jts.Envelope envelope4 = new jts.Envelope((double) '4', (double) (-6L), (double) (-6), (double) 100L);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getHeight();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.maxExtent();
        double double10 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 106.0d + "'", double5 == 106.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 106.0d + "'", double6 == 106.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 106.0d + "'", double7 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 106.0d + "'", double9 == 106.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 58.0d + "'", double10 == 58.0d);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        envelope4.init(7.1d, (double) (byte) 10, (-5.4d), 5.0d);
        boolean boolean12 = envelope4.isEnvelopeNull();
        envelope4.init(103.0d, 24.0d, (double) (-3L), 106.0d);
        java.lang.Class<?> wildcardClass18 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        jts.Envelope envelope4 = new jts.Envelope(20.0d, 1.5999999999999996d, 13.0d, 90.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 77.0d + "'", double6 == 77.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.4d + "'", double7 == 18.4d);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init((double) ' ', (double) 1, (double) (short) -1, 100.0d);
        double double12 = envelope4.getWidth();
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.getWidth();
        double double15 = envelope4.getWidth();
        double double16 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 31.0d + "'", double12 == 31.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 31.0d + "'", double14 == 31.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 31.0d + "'", double15 == 31.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 31.0d + "'", double16 == 31.0d);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        jts.Envelope envelope4 = new jts.Envelope(4.8d, (double) (short) 0, 7.1d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.1d + "'", double5 == 7.1d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.1d + "'", double6 == 7.1d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.8d + "'", double7 == 4.8d);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) (-1L), (double) (-1.0f), (double) 0L, 100.0d);
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.maxExtent();
        double double14 = envelope4.maxExtent();
        double double15 = envelope4.maxExtent();
        boolean boolean16 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        jts.Envelope envelope4 = new jts.Envelope((-5.4d), 53.0d, 0.0d, 103.2d);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        jts.Envelope envelope4 = new jts.Envelope((double) 0, 102.7d, (double) (short) 100, 11.3d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 88.7d + "'", double5 == 88.7d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 102.7d + "'", double6 == 102.7d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 102.7d + "'", double7 == 102.7d);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        jts.Envelope envelope4 = new jts.Envelope(55.0d, 111.9d, 14.9d, (double) (-1L));
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 56.900000000000006d + "'", double5 == 56.900000000000006d);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init((double) 100, (-100.0d), (double) '#', 5.0d);
        envelope4.init((double) 1L, (double) (byte) 100, (double) (-8L), (double) (-1));
        envelope4.init((double) (-7), 0.6999999999999993d, (double) 2L, 102.0d);
        double double26 = envelope4.getHeight();
        double double27 = envelope4.getWidth();
        double double28 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 7.699999999999999d + "'", double27 == 7.699999999999999d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 7.699999999999999d + "'", double28 == 7.699999999999999d);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        jts.Envelope envelope4 = new jts.Envelope((-3.8d), (double) (-100L), 0.0d, 1.7000000000000002d);
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 96.2d + "'", double5 == 96.2d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        jts.Envelope envelope4 = new jts.Envelope(52.599999999999994d, 18.700000000000003d, 24.5d, 14.2d);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        jts.Envelope envelope4 = new jts.Envelope(0.5999999999999996d, 40.300000000000004d, 1.7999999999999998d, 37.20000000000001d);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init((-6.9d), (-2.1d), (-7.3d), (double) 4);
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.maxExtent();
        double double14 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass15 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 11.3d + "'", double12 == 11.3d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 11.3d + "'", double13 == 11.3d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 11.3d + "'", double14 == 11.3d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        jts.Envelope envelope4 = new jts.Envelope(31.0d, (double) (byte) 100, 2.9000000000000004d, 5.0d);
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 69.0d + "'", double5 == 69.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.0999999999999996d + "'", double7 == 2.0999999999999996d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 69.0d + "'", double8 == 69.0d);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getHeight();
        envelope4.init((double) ' ', (-2.1d), 109.0d, (double) 6);
        boolean boolean11 = envelope4.isEnvelopeNull();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.getHeight();
        double double14 = envelope4.getHeight();
        double double15 = envelope4.maxExtent();
        double double16 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 103.0d + "'", double13 == 103.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 103.0d + "'", double14 == 103.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 103.0d + "'", double15 == 103.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 103.0d + "'", double16 == 103.0d);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        jts.Envelope envelope4 = new jts.Envelope(90.49999999999999d, 1.4000000000000004d, 3.9d, 110.0d);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.maxExtent();
        envelope4.init((-10.5d), (double) 8L, (double) (-10L), (double) (-3));
        boolean boolean14 = envelope4.isEnvelopeNull();
        boolean boolean15 = envelope4.isEnvelopeNull();
        envelope4.init(10.200000000000003d, 12.3d, 17.7d, (double) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        jts.Envelope envelope4 = new jts.Envelope(5.0d, 5.3d, (double) (-100L), (double) (-2L));
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 98.0d + "'", double6 == 98.0d);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
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
        double double26 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 55.0d + "'", double26 == 55.0d);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        double double13 = envelope4.getHeight();
        double double14 = envelope4.maxExtent();
        double double15 = envelope4.getWidth();
        double double16 = envelope4.getWidth();
        double double17 = envelope4.maxExtent();
        boolean boolean18 = envelope4.isEnvelopeNull();
        double double19 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 109.0d + "'", double15 == 109.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 109.0d + "'", double16 == 109.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 109.0d + "'", double17 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 109.0d + "'", double19 == 109.0d);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 3.1d, 5.0d, 2.7d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) 0, (double) 0.0f, (double) (-5), 0.0d);
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.maxExtent();
        boolean boolean14 = envelope4.isEnvelopeNull();
        double double15 = envelope4.maxExtent();
        double double16 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3d + "'", double5 == 2.3d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 6.9d + "'", double6 == 6.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 5.0d + "'", double12 == 5.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 5.0d + "'", double15 == 5.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5.0d + "'", double16 == 5.0d);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getHeight();
        envelope4.init((double) 1, 5.0d, 3.1d, 24.0d);
        envelope4.init(62.699999999999996d, 30.6d, 4.000000000000005d, (double) 3L);
        java.lang.Class<?> wildcardClass22 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        jts.Envelope envelope4 = new jts.Envelope(92.7d, (double) (-1L), (double) 7, 31.0d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 93.7d + "'", double5 == 93.7d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 24.0d + "'", double6 == 24.0d);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        jts.Envelope envelope4 = new jts.Envelope(90.3d, 0.0d, 128.0d, (double) (-9));
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 41.0d, 3.2d, (double) 2L);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.2000000000000002d + "'", double5 == 1.2000000000000002d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        jts.Envelope envelope4 = new jts.Envelope(1.1999999999999886d, 58.5d, 5.299999999999983d, 32.099999999999994d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 26.80000000000001d + "'", double5 == 26.80000000000001d);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        jts.Envelope envelope4 = new jts.Envelope(42.0d, 93.7d, (-6.9d), 0.0d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.9d + "'", double5 == 6.9d);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) 10, (double) (byte) 1, (double) (byte) 0);
        double double5 = envelope4.maxExtent();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.maxExtent();
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.maxExtent();
        envelope4.init(193.0d, 96.2d, (double) 1, 73.30000000000001d);
        envelope4.init(3.4000000000000004d, 5.8d, 9.2d, 74.3d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        jts.Envelope envelope4 = new jts.Envelope(84.99999999999999d, 79.7d, (double) (short) 10, 2.0999999999999943d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.900000000000006d + "'", double5 == 7.900000000000006d);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        jts.Envelope envelope4 = new jts.Envelope(92.5d, (double) (byte) 100, 21.5d, (-6.9d));
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        jts.Envelope envelope4 = new jts.Envelope(8.7d, 92.7d, 15.0d, 7.1d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init(0.0d, 1.5d, (double) 0, (-1.2d));
        double double11 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.5d + "'", double11 == 1.5d);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        jts.Envelope envelope4 = new jts.Envelope(20.0d, 1.5999999999999996d, 13.0d, 90.0d);
        envelope4.init(58.5d, 3.2d, 96.0d, 0.0d);
        double double10 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 55.3d + "'", double10 == 55.3d);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        double double16 = envelope4.getWidth();
        double double17 = envelope4.maxExtent();
        double double18 = envelope4.maxExtent();
        double double19 = envelope4.getHeight();
        envelope4.init(5.4d, 117.7d, 74.6d, 53.0d);
        boolean boolean25 = envelope4.isEnvelopeNull();
        boolean boolean26 = envelope4.isEnvelopeNull();
        double double27 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.0d + "'", double18 == 8.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 8.0d + "'", double19 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 21.599999999999994d + "'", double27 == 21.599999999999994d);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        jts.Envelope envelope4 = new jts.Envelope(98.89999999999999d, 90.2d, 5.9d, 97.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 91.1d + "'", double5 == 91.1d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 91.1d + "'", double6 == 91.1d);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        boolean boolean7 = envelope4.isEnvelopeNull();
        envelope4.init(105.0d, (-4.6d), 1.799999999999999d, 0.0d);
        envelope4.init(1.9000000000000004d, 20.2d, 39.4d, (double) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        envelope4.init(7.1d, (double) (byte) 10, (-5.4d), 5.0d);
        boolean boolean12 = envelope4.isEnvelopeNull();
        envelope4.init(103.0d, 24.0d, (double) (-3L), 106.0d);
        boolean boolean18 = envelope4.isEnvelopeNull();
        envelope4.init(83.5d, 21.0d, 8.100000000000001d, 6.900000000000006d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        jts.Envelope envelope4 = new jts.Envelope(20.5d, (double) 3, 4.0d, 3.9d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 17.5d + "'", double5 == 17.5d);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        jts.Envelope envelope4 = new jts.Envelope(13.9d, 12.3d, (double) 2, 54.2d);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        jts.Envelope envelope4 = new jts.Envelope((double) 5, (double) (byte) 100, 9.0d, 109.0d);
        double double5 = envelope4.getHeight();
        envelope4.init(102.7d, 15.0d, 9.5d, 98.1d);
        double double11 = envelope4.getHeight();
        envelope4.init(112.1d, 0.0d, (double) (-100L), 0.0d);
        double double17 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 88.6d + "'", double11 == 88.6d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 112.1d + "'", double17 == 112.1d);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        jts.Envelope envelope4 = new jts.Envelope(6.3d, (double) 7L, 87.0d, (double) 10.0f);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 77.0d + "'", double7 == 77.0d);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        jts.Envelope envelope4 = new jts.Envelope(109.0d, 18.0d, 97.0d, 72.3d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 91.0d + "'", double5 == 91.0d);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        jts.Envelope envelope4 = new jts.Envelope(10.4d, (double) 0.0f, 0.9000000000000004d, 2.3d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.4d + "'", double6 == 10.4d);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
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
        double double34 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 109.0d + "'", double13 == 109.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.2000000000000002d + "'", double21 == 1.2000000000000002d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 3.2d + "'", double22 == 3.2d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 2.0d + "'", double34 == 2.0d);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        jts.Envelope envelope4 = new jts.Envelope((double) 7, (double) 10.0f, (double) 4L, (double) 0L);
        envelope4.init((double) 10, (double) 8, (double) 8, (-1.2d));
        double double10 = envelope4.getWidth();
        boolean boolean11 = envelope4.isEnvelopeNull();
        boolean boolean12 = envelope4.isEnvelopeNull();
        boolean boolean13 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.0d + "'", double10 == 2.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 16.200000000000003d, 3.9d, 1.5d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.200000000000003d + "'", double5 == 6.200000000000003d);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        jts.Envelope envelope4 = new jts.Envelope(24.600000000000005d, 0.0d, 200.0d, 27.3d);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        boolean boolean16 = envelope4.isEnvelopeNull();
        envelope4.init((double) (-1), 2.3d, 96.0d, (double) 9);
        boolean boolean22 = envelope4.isEnvelopeNull();
        double double23 = envelope4.maxExtent();
        boolean boolean24 = envelope4.isEnvelopeNull();
        double double25 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 87.0d + "'", double23 == 87.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 87.0d + "'", double25 == 87.0d);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 20.799999999999997d, (double) (-4L), 61.9d);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        jts.Envelope envelope4 = new jts.Envelope(4.0d, 0.0d, 76.5d, 13.6d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 62.9d + "'", double5 == 62.9d);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        jts.Envelope envelope4 = new jts.Envelope(55.0d, 111.9d, 14.9d, (double) (-1L));
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 56.900000000000006d + "'", double5 == 56.900000000000006d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 56.900000000000006d + "'", double6 == 56.900000000000006d);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        jts.Envelope envelope4 = new jts.Envelope(2.9000000000000004d, 1.2d, 94.0d, (double) (-10));
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.getHeight();
        envelope4.init(98.1d, (-10.5d), 2.7d, 83.7d);
        double double14 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7000000000000004d + "'", double5 == 1.7000000000000004d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7000000000000004d + "'", double7 == 1.7000000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 104.0d + "'", double8 == 104.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 81.0d + "'", double14 == 81.0d);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        jts.Envelope envelope4 = new jts.Envelope((double) 3L, 69.0d, (double) 10, 4.800000000000001d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 66.0d + "'", double5 == 66.0d);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        jts.Envelope envelope4 = new jts.Envelope(3.299999999999999d, (double) (-7), (double) (byte) -1, 2.7d);
        envelope4.init(0.0d, 8.0d, 14.0d, (double) (short) -1);
        java.lang.Class<?> wildcardClass10 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        jts.Envelope envelope4 = new jts.Envelope((double) 7, (double) 10.0f, (double) 4L, (double) 0L);
        envelope4.init((double) 10.0f, (double) 4, (double) 9, 3.1d);
        double double10 = envelope4.getHeight();
        double double11 = envelope4.getWidth();
        double double12 = envelope4.maxExtent();
        boolean boolean13 = envelope4.isEnvelopeNull();
        envelope4.init(11.299999999999983d, 80.7d, 15.9d, 104.3d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.9d + "'", double10 == 5.9d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 6.0d + "'", double11 == 6.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.0d + "'", double12 == 6.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init((double) ' ', (double) 1, (double) (short) -1, 100.0d);
        double double12 = envelope4.getWidth();
        double double13 = envelope4.getWidth();
        double double14 = envelope4.getWidth();
        boolean boolean15 = envelope4.isEnvelopeNull();
        envelope4.init(1.2d, 88.6d, 95.2d, 5.1d);
        java.lang.Class<?> wildcardClass21 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 31.0d + "'", double12 == 31.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 31.0d + "'", double13 == 31.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 31.0d + "'", double14 == 31.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        jts.Envelope envelope4 = new jts.Envelope(11.9d, 6.1d, (double) (-1L), (double) (-1));
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.800000000000001d + "'", double5 == 5.800000000000001d);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        double double13 = envelope4.getHeight();
        boolean boolean14 = envelope4.isEnvelopeNull();
        boolean boolean15 = envelope4.isEnvelopeNull();
        double double16 = envelope4.maxExtent();
        double double17 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass18 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 109.0d + "'", double16 == 109.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 5.0d + "'", double17 == 5.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) 10L, 100.0d, (double) 10L);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 90.0d + "'", double5 == 90.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 90.0d + "'", double6 == 90.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        jts.Envelope envelope4 = new jts.Envelope(98.1d, (double) (-100), 5.299999999999983d, (double) (-6L));
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        jts.Envelope envelope4 = new jts.Envelope((double) (-3), (-100.0d), (-3.8d), 90.3d);
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 94.1d + "'", double7 == 94.1d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 94.1d + "'", double8 == 94.1d);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        jts.Envelope envelope4 = new jts.Envelope(109.0d, 1.7999999999999998d, 1.0d, 14.9d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init(7.7d, 90.8d, 38.1d, 76.69999999999999d);
        envelope4.init(86.0d, 10.5d, 131.0d, 35.1d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        jts.Envelope envelope4 = new jts.Envelope(9.0d, (double) 0, 92.7d, (double) 100);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        jts.Envelope envelope4 = new jts.Envelope(31.0d, (double) (byte) 100, 2.9000000000000004d, 5.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0999999999999996d + "'", double5 == 2.0999999999999996d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 69.0d + "'", double6 == 69.0d);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
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
        double double23 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 104.0d + "'", double14 == 104.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 106.0d + "'", double15 == 106.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 106.0d + "'", double16 == 106.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 104.0d + "'", double17 == 104.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.5d + "'", double23 == 0.5d);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        jts.Envelope envelope4 = new jts.Envelope(8.7d, 92.7d, 15.0d, 7.1d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        jts.Envelope envelope4 = new jts.Envelope(61.9d, 88.6d, 117.7d, (-8.7d));
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 126.4d + "'", double5 == 126.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 126.4d + "'", double6 == 126.4d);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        jts.Envelope envelope4 = new jts.Envelope((double) 10L, 18.0d, (double) (-8), 13.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init(0.0d, 51.0d, 110.0d, (double) 9);
        envelope4.init(22.5d, 183.7d, 37.20000000000001d, 82.2d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 21.0d + "'", double5 == 21.0d);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
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
        double double23 = envelope4.maxExtent();
        double double24 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 104.0d + "'", double14 == 104.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 106.0d + "'", double15 == 106.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 106.0d + "'", double16 == 106.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 104.0d + "'", double17 == 104.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 3.299999999999997d + "'", double23 == 3.299999999999997d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.5d + "'", double24 == 0.5d);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getHeight();
        double double10 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass11 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.4d + "'", double9 == 8.4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.4d + "'", double10 == 8.4d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        jts.Envelope envelope4 = new jts.Envelope(24.0d, (double) 2, 104.0d, (-7.3d));
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) 100.0f, (-2.1d), 0.0d, 20.2d);
        envelope4.init(38.0d, 98.2d, 117.5d, 94.2d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 111.3d + "'", double5 == 111.3d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 111.3d + "'", double6 == 111.3d);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        jts.Envelope envelope4 = new jts.Envelope(36.0d, 1.799999999999999d, 104.6d, 5.8d);
        envelope4.init(102.3d, 50.0d, 106.0d, (double) (-8L));
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1), 100.2d, 38.4d, 63.3d);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getWidth();
        boolean boolean10 = envelope4.isEnvelopeNull();
        envelope4.init(43.6d, 32.0d, 87.1d, 55.0d);
        double double16 = envelope4.getWidth();
        double double17 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 11.600000000000001d + "'", double16 == 11.600000000000001d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.099999999999994d + "'", double17 == 32.099999999999994d);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        jts.Envelope envelope4 = new jts.Envelope((double) 1L, 86.5d, 13.0d, 7.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 85.5d + "'", double5 == 85.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 6.0d + "'", double6 == 6.0d);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        jts.Envelope envelope4 = new jts.Envelope((double) 7, (double) 0, (double) 8, (double) (-10));
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        boolean boolean8 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 18.0d + "'", double5 == 18.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.0d + "'", double7 == 18.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) (-1L), (double) (-1.0f), (double) 0L, 100.0d);
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.maxExtent();
        double double14 = envelope4.maxExtent();
        double double15 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        jts.Envelope envelope4 = new jts.Envelope(90.6d, 7.0d, 3.8000000000000007d, 43.0d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 83.6d + "'", double5 == 83.6d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 83.6d + "'", double6 == 83.6d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 39.2d + "'", double7 == 39.2d);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        jts.Envelope envelope4 = new jts.Envelope(92.3d, 30.0d, 85.5d, 94.3d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        jts.Envelope envelope4 = new jts.Envelope(35.5d, 1.6999999999999886d, 91.9d, 0.0d);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        jts.Envelope envelope4 = new jts.Envelope(34.0d, 55.0d, 92.3d, 95.7d);
        envelope4.init((double) 5L, 17.4d, (double) 0, 8.3d);
        envelope4.init(0.0d, 0.9000000000000004d, (double) 5, (-4.6d));
        double double15 = envelope4.getHeight();
        envelope4.init(0.0d, 81.3d, 14.0d, 73.30000000000001d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 9.6d + "'", double15 == 9.6d);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getWidth();
        boolean boolean10 = envelope4.isEnvelopeNull();
        boolean boolean11 = envelope4.isEnvelopeNull();
        double double12 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.0d + "'", double12 == 8.0d);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, (double) '#', 114.9d, 199.0d);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        jts.Envelope envelope4 = new jts.Envelope(4.8d, (double) (short) 0, 7.1d, 0.0d);
        envelope4.init(99.0d, 89.5d, 4.0d, 2.9000000000000004d);
        boolean boolean10 = envelope4.isEnvelopeNull();
        boolean boolean11 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        jts.Envelope envelope4 = new jts.Envelope(80.1d, 88.1d, 104.6d, (double) 0);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        jts.Envelope envelope4 = new jts.Envelope(4.300000000000009d, 83.3d, 0.40000000000000036d, 44.0d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 43.6d + "'", double5 == 43.6d);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.getHeight();
        envelope4.init((double) 10.0f, (-4.6d), (double) (byte) 1, (double) 5);
        double double11 = envelope4.getWidth();
        double double12 = envelope4.getWidth();
        double double13 = envelope4.maxExtent();
        envelope4.init(90.89999999999999d, 0.0d, 83.3d, 110.39999999999999d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 14.6d + "'", double11 == 14.6d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 14.6d + "'", double12 == 14.6d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 14.6d + "'", double13 == 14.6d);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        jts.Envelope envelope4 = new jts.Envelope(112.3d, 82.9d, 93.7d, 14.700000000000003d);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, (-5.4d), 0.0d, 65.0d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.4d + "'", double5 == 15.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.4d + "'", double6 == 15.4d);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, (-5.4d), 0.0d, 65.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.maxExtent();
        double double9 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.4d + "'", double7 == 15.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 65.0d + "'", double8 == 65.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 65.0d + "'", double9 == 65.0d);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        jts.Envelope envelope4 = new jts.Envelope(26.0d, 11.3d, 86.2d, (double) (-1));
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        boolean boolean7 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        double double13 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass14 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 109.0d + "'", double13 == 109.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), 41.3d, 4.6d, 77.9d);
        double double5 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 42.3d + "'", double5 == 42.3d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        jts.Envelope envelope4 = new jts.Envelope(8.8d, (double) 100, 13.3d, 4.9d);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        jts.Envelope envelope4 = new jts.Envelope(9.5d, (double) 7, 21.0d, 77.7d);
        envelope4.init((double) 1.0f, 11.9d, 82.3d, 94.1d);
        double double10 = envelope4.maxExtent();
        boolean boolean11 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 11.799999999999997d + "'", double10 == 11.799999999999997d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        jts.Envelope envelope4 = new jts.Envelope(107.0d, 7.7d, (double) 5, 30.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.maxExtent();
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.getHeight();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.4d + "'", double9 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.4d + "'", double11 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.4d + "'", double13 == 8.4d);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        jts.Envelope envelope4 = new jts.Envelope(6.300000000000001d, 86.5d, 1.5999999999999996d, 28.0d);
        envelope4.init(41.3d, 46.2d, 1.5d, 13.8d);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        jts.Envelope envelope4 = new jts.Envelope(31.0d, (double) (byte) 100, 2.9000000000000004d, 5.0d);
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.getWidth();
        boolean boolean9 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 69.0d + "'", double5 == 69.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.0999999999999996d + "'", double7 == 2.0999999999999996d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 69.0d + "'", double8 == 69.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        jts.Envelope envelope4 = new jts.Envelope(94.1d, (double) 1.0f, (double) (-9), (double) 1.0f);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        jts.Envelope envelope4 = new jts.Envelope((double) 100, 36.9d, 58.0d, 110.0d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        jts.Envelope envelope4 = new jts.Envelope((double) 10.0f, 0.0d, (double) (-3L), (double) 100L);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        jts.Envelope envelope4 = new jts.Envelope(13.5d, 2.1d, (double) (-100L), 98.4d);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        jts.Envelope envelope4 = new jts.Envelope(84.0d, (double) (short) 10, (double) '#', 89.5d);
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 74.0d + "'", double5 == 74.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 3.1d, 5.0d, 2.7d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init(1.5d, 200.0d, 104.6d, 90.3d);
        envelope4.init(93.0d, 4.0d, 3.7d, 110.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3d + "'", double5 == 2.3d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 6.9d + "'", double6 == 6.9d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 6.9d + "'", double7 == 6.9d);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 3.1d, 5.0d, 2.7d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) 0, (double) 0.0f, (double) (-5), 0.0d);
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.getHeight();
        envelope4.init((double) (byte) 100, 22.0d, 95.7d, 1.7000000000000004d);
        boolean boolean19 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass20 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3d + "'", double5 == 2.3d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 6.9d + "'", double6 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) (-1L), (double) (-1.0f), (double) 0L, 100.0d);
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.maxExtent();
        double double14 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass15 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        jts.Envelope envelope4 = new jts.Envelope(38.7d, 0.0d, 13.0d, 95.3d);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 103.0d + "'", double6 == 103.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 13.0d + "'", double7 == 13.0d);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) (-1L), (double) (-1.0f), (double) 0L, 100.0d);
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.getHeight();
        envelope4.init(0.0d, (double) 100L, (double) (short) -1, 86.0d);
        envelope4.init(14.0d, 21.0d, 11.0d, (double) 0.0f);
        double double24 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 11.0d + "'", double24 == 11.0d);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        jts.Envelope envelope4 = new jts.Envelope(14.700000000000003d, (double) 0L, 76.0d, 90.3d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 14.700000000000003d + "'", double5 == 14.700000000000003d);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.maxExtent();
        envelope4.init((double) 5L, (-6.9d), (-5.4d), 0.0d);
        envelope4.init((double) (-6L), (-7.3d), (double) (short) -1, (double) (-10));
        envelope4.init(2.0d, 3.299999999999999d, (double) 4, 89.5d);
        boolean boolean29 = envelope4.isEnvelopeNull();
        double double30 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 106.0d + "'", double13 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.299999999999999d + "'", double30 == 1.299999999999999d);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1), 182.7d, 173.6d, 51.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.maxExtent();
        envelope4.init((-10.5d), (double) 8L, (double) (-10L), (double) (-3));
        java.lang.Class<?> wildcardClass14 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        jts.Envelope envelope4 = new jts.Envelope(13.4d, 90.19999999999999d, 1.9000000000000004d, 49.0d);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getWidth();
        double double10 = envelope4.maxExtent();
        envelope4.init(14.700000000000003d, 38.0d, (double) (-1.0f), 5.0d);
        double double16 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.4d + "'", double10 == 8.4d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 6.0d + "'", double16 == 6.0d);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) (-1L), (double) (-1.0f), (double) 0L, 100.0d);
        double double12 = envelope4.getWidth();
        double double13 = envelope4.getWidth();
        double double14 = envelope4.getWidth();
        double double15 = envelope4.getHeight();
        double double16 = envelope4.getWidth();
        boolean boolean17 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        boolean boolean16 = envelope4.isEnvelopeNull();
        envelope4.init((double) (-1), 2.3d, 96.0d, (double) 9);
        boolean boolean22 = envelope4.isEnvelopeNull();
        double double23 = envelope4.maxExtent();
        boolean boolean24 = envelope4.isEnvelopeNull();
        double double25 = envelope4.getWidth();
        double double26 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass27 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 87.0d + "'", double23 == 87.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 3.3d + "'", double25 == 3.3d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 87.0d + "'", double26 == 87.0d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 3.1d, 5.0d, 2.7d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) 0, (double) 0.0f, (double) (-5), 0.0d);
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.getHeight();
        double double14 = envelope4.getHeight();
        double double15 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3d + "'", double5 == 2.3d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 6.9d + "'", double6 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 5.0d + "'", double15 == 5.0d);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        jts.Envelope envelope4 = new jts.Envelope((double) 1.0f, 95.7d, 100.0d, (-8.7d));
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        jts.Envelope envelope4 = new jts.Envelope(6.200000000000003d, 9.9d, 19.7d, 69.0d);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        jts.Envelope envelope4 = new jts.Envelope(86.0d, 33.3d, (double) 100, (double) (-8));
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        jts.Envelope envelope4 = new jts.Envelope(90.3d, (double) (-1), (double) 100L, 3.1d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getHeight();
        envelope4.init((double) 0L, 104.0d, 102.0d, (double) 3);
        double double13 = envelope4.getWidth();
        envelope4.init((double) (short) 1, (double) (-7), (double) 1, 109.0d);
        boolean boolean19 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) (-1L), (double) (-1.0f), (double) 0L, 100.0d);
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.maxExtent();
        double double14 = envelope4.getWidth();
        double double15 = envelope4.getHeight();
        boolean boolean16 = envelope4.isEnvelopeNull();
        envelope4.init(12.6d, 0.0d, (-4.6d), 92.2d);
        double double22 = envelope4.maxExtent();
        envelope4.init(2.8d, (double) 8L, 11.1d, 101.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 96.8d + "'", double22 == 96.8d);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        jts.Envelope envelope4 = new jts.Envelope(1.799999999999999d, 0.0d, (double) 8, 93.7d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 85.7d + "'", double5 == 85.7d);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        boolean boolean11 = envelope4.isEnvelopeNull();
        double double12 = envelope4.getWidth();
        boolean boolean13 = envelope4.isEnvelopeNull();
        envelope4.init(102.3d, 88.1d, (double) (-6), 76.5d);
        double double19 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 14.200000000000003d + "'", double19 == 14.200000000000003d);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        jts.Envelope envelope4 = new jts.Envelope(100.60000000000001d, (double) (-3), 1.8000000000000007d, 95.3d);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        jts.Envelope envelope4 = new jts.Envelope(101.0d, 54.0d, 0.7000000000000028d, 11.1d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 47.0d + "'", double5 == 47.0d);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        envelope4.init((double) (-1L), (double) (-7L), 106.0d, (double) 10);
        boolean boolean18 = envelope4.isEnvelopeNull();
        double double19 = envelope4.getWidth();
        envelope4.init(84.1d, 107.0d, 103.7d, 22.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 6.0d + "'", double19 == 6.0d);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        jts.Envelope envelope4 = new jts.Envelope(62.699999999999996d, 10.4d, 61.0d, 7.1d);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        boolean boolean13 = envelope4.isEnvelopeNull();
        boolean boolean14 = envelope4.isEnvelopeNull();
        double double15 = envelope4.maxExtent();
        double double16 = envelope4.getWidth();
        double double17 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 106.0d + "'", double15 == 106.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 106.0d + "'", double16 == 106.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 104.0d + "'", double17 == 104.0d);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.getHeight();
        envelope4.init((double) 100L, (double) (byte) 100, 14.0d, 102.7d);
        envelope4.init(3.0d, (double) 1L, (double) (short) 10, (double) (-1L));
        double double19 = envelope4.getWidth();
        double double20 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 2.0d + "'", double19 == 2.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 11.0d + "'", double20 == 11.0d);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        jts.Envelope envelope4 = new jts.Envelope((double) 5, (double) 100, (double) (short) 100, 4.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        jts.Envelope envelope4 = new jts.Envelope((-8.7d), (-6.9d), (-1.0d), (double) (-10));
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        boolean boolean7 = envelope4.isEnvelopeNull();
        double double8 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.0d + "'", double5 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.0d + "'", double6 == 9.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.799999999999999d + "'", double8 == 1.799999999999999d);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        jts.Envelope envelope4 = new jts.Envelope(19.700000000000003d, 104.3d, 22.0d, 0.0d);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), (double) (short) 0, 1.0d, (double) 10);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) 7L, (double) 10, (double) 100L, 8.0d);
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getHeight();
        double double14 = envelope4.maxExtent();
        double double15 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.0d + "'", double5 == 9.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 92.0d + "'", double11 == 92.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 92.0d + "'", double12 == 92.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 92.0d + "'", double13 == 92.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 92.0d + "'", double14 == 92.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 92.0d + "'", double15 == 92.0d);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        jts.Envelope envelope4 = new jts.Envelope(17.4d, 74.6d, 88.1d, 44.0d);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        jts.Envelope envelope4 = new jts.Envelope(3.0999999999999943d, 17.1d, 7.300000000000001d, (double) 100L);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 92.7d + "'", double5 == 92.7d);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init((double) (short) 0, 0.0d, (double) 100L, (double) (-6L));
        double double16 = envelope4.getWidth();
        envelope4.init(7.299999999999997d, 6.9d, 84.5d, 0.5999999999999996d);
        double double22 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 83.9d + "'", double22 == 83.9d);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        jts.Envelope envelope4 = new jts.Envelope(2.9000000000000004d, 103.0d, 132.0d, 61.9d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        jts.Envelope envelope4 = new jts.Envelope(51.0d, 12.6d, (-1.2d), 0.0d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 38.4d + "'", double5 == 38.4d);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 18.9d, 102.1d, 103.3d);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        jts.Envelope envelope4 = new jts.Envelope((double) 1, 95.0d, 62.0d, 9.9d);
        envelope4.init((double) (-5L), (double) (-3), 82.3d, 77.5d);
        double double10 = envelope4.getWidth();
        boolean boolean11 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass12 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.0d + "'", double10 == 2.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init((double) ' ', (double) 1, (double) (short) -1, 100.0d);
        double double12 = envelope4.getWidth();
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.maxExtent();
        double double15 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 31.0d + "'", double12 == 31.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 101.0d + "'", double14 == 101.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 101.0d + "'", double15 == 101.0d);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        jts.Envelope envelope4 = new jts.Envelope((double) 1.0f, 102.1d, 45.0d, 115.1d);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        jts.Envelope envelope4 = new jts.Envelope(14.0d, 102.3d, 1.5999999999999996d, 8.0d);
        envelope4.init((double) 2L, 92.0d, (double) (-5L), 13.0d);
        envelope4.init(93.7d, 8.0d, (double) (byte) 100, 3.299999999999999d);
        boolean boolean15 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        jts.Envelope envelope4 = new jts.Envelope(90.2d, 36.0d, (double) 4, 132.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 128.0d + "'", double5 == 128.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 128.0d + "'", double6 == 128.0d);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        jts.Envelope envelope4 = new jts.Envelope(24.0d, 94.0d, (double) (-1), (double) (-6));
        envelope4.init(92.2d, 6.3d, (double) 0.0f, 111.0d);
        double double10 = envelope4.getWidth();
        double double11 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 85.9d + "'", double10 == 85.9d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 111.0d + "'", double11 == 111.0d);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        jts.Envelope envelope4 = new jts.Envelope((double) 8, 13.0d, 22.3d, (double) 10L);
        envelope4.init((double) (-100L), 90.3d, 31.0d, (double) 3L);
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getWidth();
        envelope4.init((-9.3d), 35.0d, (double) (short) 1, 56.900000000000006d);
        double double17 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 190.3d + "'", double10 == 190.3d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 190.3d + "'", double11 == 190.3d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 44.3d + "'", double17 == 44.3d);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        jts.Envelope envelope4 = new jts.Envelope((double) 1L, 86.5d, 13.0d, 7.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        jts.Envelope envelope4 = new jts.Envelope(5.0d, 5.3d, (double) (-100L), (double) (-2L));
        envelope4.init((double) (byte) 100, 10.5d, (double) (-9L), 8.4d);
        envelope4.init(6.9d, (double) (-3L), (double) 7L, (double) (-6L));
        envelope4.init(0.0d, 5.9d, 0.0d, (-7.3d));
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) 10L, 100.0d, (double) 10L);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 90.0d + "'", double5 == 90.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 90.0d + "'", double6 == 90.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        jts.Envelope envelope4 = new jts.Envelope(5.0d, 0.0d, 0.0d, 19.700000000000003d);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) (-1L), (double) (-1.0f), (double) 0L, 100.0d);
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.maxExtent();
        double double14 = envelope4.getWidth();
        double double15 = envelope4.maxExtent();
        double double16 = envelope4.getWidth();
        double double17 = envelope4.getHeight();
        double double18 = envelope4.getWidth();
        boolean boolean19 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        boolean boolean16 = envelope4.isEnvelopeNull();
        double double17 = envelope4.getWidth();
        double double18 = envelope4.maxExtent();
        envelope4.init(92.0d, (-2.1d), 0.0d, (double) (byte) 1);
        double double24 = envelope4.maxExtent();
        boolean boolean25 = envelope4.isEnvelopeNull();
        double double26 = envelope4.maxExtent();
        envelope4.init(91.0d, 32.099999999999994d, 91.0d, 3.3999999999999915d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.0d + "'", double18 == 8.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 94.1d + "'", double24 == 94.1d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 94.1d + "'", double26 == 94.1d);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        jts.Envelope envelope4 = new jts.Envelope((double) 8, 11.8d, 117.4d, 37.1d);
        double double5 = envelope4.getWidth();
        envelope4.init(0.0d, 198.1d, 90.0d, 23.4d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.8000000000000007d + "'", double5 == 3.8000000000000007d);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        jts.Envelope envelope4 = new jts.Envelope(5.3d, (double) 9L, 3.1d, 10.4d);
        envelope4.init(0.0d, (double) 10L, (double) 9, (double) 7L);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 3.0d, (double) 100.0f, 7.1d);
        double double5 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 92.9d + "'", double5 == 92.9d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        jts.Envelope envelope4 = new jts.Envelope((double) 5, (double) 0L, 51.0d, (double) 5L);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass7 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 46.0d + "'", double6 == 46.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.getHeight();
        envelope4.init((double) 10.0f, (-4.6d), (double) (byte) 1, (double) 5);
        envelope4.init(109.0d, (double) (-1), 76.0d, 102.0d);
        double double16 = envelope4.getWidth();
        double double17 = envelope4.getWidth();
        double double18 = envelope4.maxExtent();
        boolean boolean19 = envelope4.isEnvelopeNull();
        double double20 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 110.0d + "'", double16 == 110.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 110.0d + "'", double17 == 110.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 110.0d + "'", double18 == 110.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 110.0d + "'", double20 == 110.0d);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        jts.Envelope envelope4 = new jts.Envelope(3.0d, (double) 9, 91.3d, 52.0d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 39.3d + "'", double5 == 39.3d);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        jts.Envelope envelope4 = new jts.Envelope((double) (-3), (-100.0d), (-3.8d), 90.3d);
        double double5 = envelope4.getWidth();
        envelope4.init(2.0999999999999996d, 103.7d, 85.5d, 75.5d);
        double double11 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 101.60000000000001d + "'", double11 == 101.60000000000001d);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 3.1d, 5.0d, 2.7d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init(1.5d, 200.0d, 104.6d, 90.3d);
        double double13 = envelope4.maxExtent();
        double double14 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass15 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3d + "'", double5 == 2.3d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 6.9d + "'", double6 == 6.9d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 6.9d + "'", double7 == 6.9d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 198.5d + "'", double13 == 198.5d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 198.5d + "'", double14 == 198.5d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        jts.Envelope envelope4 = new jts.Envelope(92.7d, (double) (-10L), 1.2d, (double) (-8L));
        double double5 = envelope4.getWidth();
        envelope4.init(110.0d, (double) (-4), (double) 1, (double) 0);
        envelope4.init((double) (-10L), (double) 100L, (double) 10, (double) 10.0f);
        envelope4.init(90.2d, (double) (-3), (double) (-5), 90.0d);
        boolean boolean21 = envelope4.isEnvelopeNull();
        envelope4.init(194.0d, 87.0d, 85.3d, 88.7d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.7d + "'", double5 == 102.7d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        jts.Envelope envelope4 = new jts.Envelope(92.7d, 110.39999999999999d, 46.0d, 3.4000000000000004d);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        jts.Envelope envelope4 = new jts.Envelope((double) 0.0f, (double) (byte) 1, 2.1d, 0.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        boolean boolean7 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.1d + "'", double6 == 2.1d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        jts.Envelope envelope4 = new jts.Envelope(3.299999999999999d, (double) '4', 0.0d, 2.0999999999999996d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        jts.Envelope envelope4 = new jts.Envelope(92.7d, (double) (-10L), 1.2d, (double) (-8L));
        envelope4.init(95.2d, 8.7d, 1.7000000000000002d, 92.0d);
        double double10 = envelope4.getHeight();
        double double11 = envelope4.maxExtent();
        envelope4.init(77.89999999999999d, 8.600000000000001d, 198.1d, 200.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 90.3d + "'", double10 == 90.3d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 90.3d + "'", double11 == 90.3d);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        jts.Envelope envelope4 = new jts.Envelope(100.0d, 10.5d, (double) 2, (-100.0d));
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.maxExtent();
        double double9 = envelope4.getWidth();
        boolean boolean10 = envelope4.isEnvelopeNull();
        envelope4.init((-5.4d), 4.799999999999997d, 0.0d, (double) (-2));
        boolean boolean16 = envelope4.isEnvelopeNull();
        double double17 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.0d + "'", double5 == 102.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 102.0d + "'", double6 == 102.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 102.0d + "'", double7 == 102.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 102.0d + "'", double8 == 102.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 89.5d + "'", double9 == 89.5d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 2.0d + "'", double17 == 2.0d);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        jts.Envelope envelope4 = new jts.Envelope((double) 4, (double) (-2), (double) (-6L), (double) (-1.0f));
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.0d + "'", double5 == 6.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.0d + "'", double6 == 5.0d);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        jts.Envelope envelope4 = new jts.Envelope(91.0d, 9.100000000000003d, 2.8d, 100.60000000000001d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.80000000000001d + "'", double5 == 97.80000000000001d);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        jts.Envelope envelope4 = new jts.Envelope((double) ' ', (double) (-1), (double) (-4), (-1.2d));
        envelope4.init(85.4d, 30.2d, 100.2d, 5.299999999999983d);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
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
        double double35 = envelope4.getWidth();
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
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 2.0d + "'", double35 == 2.0d);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        jts.Envelope envelope4 = new jts.Envelope(17.4d, (double) 7, (double) 'a', 86.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        jts.Envelope envelope4 = new jts.Envelope(20.5d, 1.5999999999999996d, 94.0d, 0.2999999999999998d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 18.9d + "'", double5 == 18.9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 93.7d + "'", double6 == 93.7d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 93.7d + "'", double7 == 93.7d);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        jts.Envelope envelope4 = new jts.Envelope(42.3d, 16.200000000000003d, 9.5d, 90.2d);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 9.2d, 132.0d, 14.0d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        jts.Envelope envelope4 = new jts.Envelope(84.60000000000001d, 1.5999999999999996d, 10.9d, 74.6d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 83.00000000000001d + "'", double5 == 83.00000000000001d);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), (double) 100L, 86.5d, 13.4d);
        double double5 = envelope4.maxExtent();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        jts.Envelope envelope4 = new jts.Envelope((double) (-3), (double) 10L, (double) (-6), 0.0d);
        double double5 = envelope4.getWidth();
        envelope4.init(91.2d, 96.4d, 94.1d, 44.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 13.0d + "'", double5 == 13.0d);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        jts.Envelope envelope4 = new jts.Envelope(90.0d, (double) (-5L), 0.0d, 101.8d);
        double double5 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 95.0d + "'", double5 == 95.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        jts.Envelope envelope4 = new jts.Envelope(61.9d, 88.6d, 117.7d, (-8.7d));
        double double5 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 126.4d + "'", double5 == 126.4d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        jts.Envelope envelope4 = new jts.Envelope(4.8d, (double) (short) 0, 7.1d, 0.0d);
        double double5 = envelope4.getHeight();
        envelope4.init(3.299999999999999d, (double) (-1), (double) '4', (double) (-10L));
        double double11 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.1d + "'", double5 == 7.1d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.299999999999999d + "'", double11 == 4.299999999999999d);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        jts.Envelope envelope4 = new jts.Envelope(4.8d, (double) (short) 0, 7.1d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        envelope4.init(85.1d, 0.0d, 47.0d, (double) (-5L));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.1d + "'", double5 == 7.1d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.1d + "'", double6 == 7.1d);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        jts.Envelope envelope4 = new jts.Envelope(55.0d, 111.9d, 14.9d, (double) (-1L));
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.9d + "'", double5 == 15.9d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        jts.Envelope envelope4 = new jts.Envelope(21.7d, 74.3d, 10.200000000000003d, 104.1d);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) (-1L), (double) (-1.0f), (double) 0L, 100.0d);
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.maxExtent();
        double double14 = envelope4.getWidth();
        double double15 = envelope4.getHeight();
        double double16 = envelope4.getWidth();
        double double17 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass18 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        jts.Envelope envelope4 = new jts.Envelope(104.6d, 16.0d, 3.2d, (double) 9);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.8d + "'", double5 == 5.8d);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        jts.Envelope envelope4 = new jts.Envelope(21.0d, 5.600000000000001d, 4.9d, 0.0d);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
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
        double double34 = envelope4.maxExtent();
        boolean boolean35 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 6.9d + "'", double21 == 6.9d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 6.9d + "'", double22 == 6.9d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 65.0d + "'", double33 == 65.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 65.0d + "'", double34 == 65.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        jts.Envelope envelope4 = new jts.Envelope(36.0d, (double) 100.0f, 100.0d, 69.0d);
        double double5 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 31.0d + "'", double5 == 31.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        jts.Envelope envelope4 = new jts.Envelope((double) (-6L), 90.0d, 43.0d, (double) (-3L));
        envelope4.init(26.800000000000004d, (double) 4L, 8.700000000000003d, 61.0d);
        envelope4.init(109.1d, 97.4d, 100.30000000000001d, 111.0d);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        jts.Envelope envelope4 = new jts.Envelope(102.3d, 8.0d, 4.0d, (double) (byte) 100);
        double double5 = envelope4.getHeight();
        envelope4.init(109.1d, 97.0d, (double) (-2L), 15.4d);
        envelope4.init(0.0d, 94.3d, (double) 2L, (double) 4);
        envelope4.init(3.7d, 13.0d, 111.0d, 1.2999999999999998d);
        boolean boolean21 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 96.0d + "'", double5 == 96.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        jts.Envelope envelope4 = new jts.Envelope(13.8d, 102.5d, 96.0d, 20.5d);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
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
        java.lang.Class<?> wildcardClass26 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        boolean boolean16 = envelope4.isEnvelopeNull();
        envelope4.init(85.5d, (-8.7d), (double) (short) -1, 3.7d);
        double double22 = envelope4.maxExtent();
        boolean boolean23 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 94.2d + "'", double22 == 94.2d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        boolean boolean11 = envelope4.isEnvelopeNull();
        envelope4.init(2.0999999999999996d, 0.0d, (-1.2d), 11.3d);
        boolean boolean17 = envelope4.isEnvelopeNull();
        envelope4.init(13.4d, (double) 0, (double) 100L, 0.0d);
        double double23 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        jts.Envelope envelope4 = new jts.Envelope((double) 7, (double) 10.0f, (double) 4L, (double) 0L);
        envelope4.init((double) 10.0f, (double) 4, (double) 9, 3.1d);
        double double10 = envelope4.getHeight();
        double double11 = envelope4.getHeight();
        boolean boolean12 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.9d + "'", double10 == 5.9d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5.9d + "'", double11 == 5.9d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        jts.Envelope envelope4 = new jts.Envelope(1.6999999999999886d, (-1.0d), (double) (-2L), 0.0d);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1.0f), (double) (-9), (double) 2, (double) 10);
        double double5 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        jts.Envelope envelope4 = new jts.Envelope(9.0d, 88.7d, 55.0d, 15.0d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 79.7d + "'", double5 == 79.7d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 79.7d + "'", double6 == 79.7d);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        jts.Envelope envelope4 = new jts.Envelope(44.0d, 6.7d, 3.9000000000000004d, 3.7d);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        jts.Envelope envelope4 = new jts.Envelope(7.3d, 4.0d, 0.0d, 6.9d);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        jts.Envelope envelope4 = new jts.Envelope((double) 100, 24.0d, 5.0d, (double) (-9));
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init(100.0d, (double) 100, (double) 10L, 12.6d);
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 76.0d + "'", double5 == 76.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.5999999999999996d + "'", double12 == 2.5999999999999996d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        jts.Envelope envelope4 = new jts.Envelope(96.8d, 114.4d, 3.7d, 78.7d);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        boolean boolean8 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 13.0d + "'", double5 == 13.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 103.0d + "'", double7 == 103.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        jts.Envelope envelope4 = new jts.Envelope((double) (-3L), (double) (-9), 7.1d, (double) (byte) -1);
        envelope4.init((double) 0.0f, (double) (-1), 103.0d, 11.9d);
        double double10 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 91.1d + "'", double10 == 91.1d);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        jts.Envelope envelope4 = new jts.Envelope(17.4d, 9.6d, 1.0d, 200.0d);
        envelope4.init((double) 7, (double) 5, 12.0d, (double) (byte) 10);
        envelope4.init(100.8d, 90.6d, 13.600000000000001d, 90.3d);
        double double15 = envelope4.maxExtent();
        envelope4.init(20.2d, 53.9d, 83.7d, 182.7d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 76.69999999999999d + "'", double15 == 76.69999999999999d);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        envelope4.init((double) (byte) 1, (double) (-8L), (double) 8L, (double) (-4L));
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.getHeight();
        boolean boolean12 = envelope4.isEnvelopeNull();
        envelope4.init(114.1d, 100.60000000000001d, 43.0d, 13.3d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 12.0d + "'", double11 == 12.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        jts.Envelope envelope4 = new jts.Envelope(41.3d, 14.700000000000003d, 198.5d, (double) 8L);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        jts.Envelope envelope4 = new jts.Envelope(1.6999999999999886d, (double) 100.0f, 8.4d, (double) (-10));
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        jts.Envelope envelope4 = new jts.Envelope(80.7d, (double) (short) 10, 21.7d, 117.7d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 96.0d + "'", double5 == 96.0d);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        jts.Envelope envelope4 = new jts.Envelope(24.0d, 92.9d, 5.8d, 0.0d);
        envelope4.init(21.5d, 2.0d, 54.5d, 104.0d);
        envelope4.init(112.3d, 110.1d, 11.3d, 102.1d);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.getHeight();
        envelope4.init((double) 100L, (double) (byte) 100, 14.0d, 102.7d);
        envelope4.init(3.0d, (double) 1L, (double) (short) 10, (double) (-1L));
        double double19 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass20 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 2.0d + "'", double19 == 2.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        jts.Envelope envelope4 = new jts.Envelope(92.7d, (double) (-1L), (double) 7, 31.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        boolean boolean7 = envelope4.isEnvelopeNull();
        envelope4.init((-10.5d), 5.8d, 5.3d, (double) (-9L));
        double double13 = envelope4.getHeight();
        double double14 = envelope4.maxExtent();
        double double15 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass16 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 24.0d + "'", double5 == 24.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 93.7d + "'", double6 == 93.7d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 14.3d + "'", double13 == 14.3d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 16.3d + "'", double14 == 16.3d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 16.3d + "'", double15 == 16.3d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        jts.Envelope envelope4 = new jts.Envelope((-4.6d), (double) 0, (double) 4, (double) 1L);
        envelope4.init(36.0d, 19.0d, 7.1d, 1.2d);
        double double10 = envelope4.maxExtent();
        boolean boolean11 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 17.0d + "'", double10 == 17.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
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
        double double22 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 7.699999999999999d + "'", double22 == 7.699999999999999d);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        jts.Envelope envelope4 = new jts.Envelope((double) 0L, 100.0d, 92.0d, 92.7d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7000000000000028d + "'", double5 == 0.7000000000000028d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7000000000000028d + "'", double6 == 0.7000000000000028d);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
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
        envelope4.init(11.3d, 89.7d, 96.7d, 92.3d);
        double double27 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 102.0d + "'", double15 == 102.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 4.400000000000006d + "'", double27 == 4.400000000000006d);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) (-1L), (double) (-1.0f), (double) 0L, 100.0d);
        double double12 = envelope4.getWidth();
        double double13 = envelope4.getWidth();
        double double14 = envelope4.getWidth();
        double double15 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        double double13 = envelope4.getHeight();
        double double14 = envelope4.maxExtent();
        double double15 = envelope4.getHeight();
        double double16 = envelope4.maxExtent();
        boolean boolean17 = envelope4.isEnvelopeNull();
        double double18 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass19 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 5.0d + "'", double15 == 5.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 109.0d + "'", double16 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 109.0d + "'", double18 == 109.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        envelope4.init((-5.4d), (-8.7d), (double) 5L, (double) 7);
        double double12 = envelope4.getHeight();
        double double13 = envelope4.maxExtent();
        envelope4.init(111.9d, 31.0d, 191.3d, 87.0d);
        envelope4.init(27.3d, 100.0d, 4.199999999999997d, 106.0d);
        double double24 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.0d + "'", double12 == 2.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.299999999999999d + "'", double13 == 3.299999999999999d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 101.8d + "'", double24 == 101.8d);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) 0, (-2.1d), (double) (-8L), (double) (-4));
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getWidth();
        envelope4.init(193.0d, 62.0d, 51.0d, (double) (-3L));
        boolean boolean12 = envelope4.isEnvelopeNull();
        envelope4.init(90.80000000000001d, 91.0d, 63.3d, 16.200000000000003d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.1d + "'", double5 == 2.1d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.1d + "'", double6 == 2.1d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, (-5.4d), 0.0d, 65.0d);
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.4d + "'", double5 == 15.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) 0, (-2.1d), (double) (-8L), (double) (-4));
        double double5 = envelope4.maxExtent();
        envelope4.init((double) 100L, (double) (byte) -1, (double) ' ', (double) (byte) 0);
        boolean boolean11 = envelope4.isEnvelopeNull();
        envelope4.init(0.0d, 20.799999999999997d, 13.5d, (double) (-7));
        double double17 = envelope4.getHeight();
        boolean boolean18 = envelope4.isEnvelopeNull();
        double double19 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.5d + "'", double17 == 20.5d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.799999999999997d + "'", double19 == 20.799999999999997d);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
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
        java.lang.Class<?> wildcardClass22 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 8.0d + "'", double19 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 8.0d + "'", double21 == 8.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
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
        double double28 = envelope4.getWidth();
        envelope4.init(1.7000000000000002d, (double) 100, 93.1d, 8.4d);
        double double34 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 34.0d + "'", double26 == 34.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 34.0d + "'", double27 == 34.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 55.0d + "'", double28 == 55.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 98.3d + "'", double34 == 98.3d);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        boolean boolean16 = envelope4.isEnvelopeNull();
        double double17 = envelope4.getWidth();
        double double18 = envelope4.maxExtent();
        envelope4.init(92.0d, (-2.1d), 0.0d, (double) (byte) 1);
        double double24 = envelope4.getHeight();
        double double25 = envelope4.getWidth();
        double double26 = envelope4.maxExtent();
        double double27 = envelope4.getWidth();
        double double28 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.0d + "'", double18 == 8.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 94.1d + "'", double25 == 94.1d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 94.1d + "'", double26 == 94.1d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 94.1d + "'", double27 == 94.1d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 94.1d + "'", double28 == 94.1d);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        jts.Envelope envelope4 = new jts.Envelope((double) 7L, 110.5d, (double) (-1L), 0.0d);
        envelope4.init(2.0999999999999943d, 198.5d, 107.5d, 53.2d);
        double double10 = envelope4.getHeight();
        double double11 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 54.3d + "'", double10 == 54.3d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 54.3d + "'", double11 == 54.3d);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        envelope4.init(7.1d, (double) (byte) 10, (-5.4d), 5.0d);
        double double12 = envelope4.getHeight();
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.getWidth();
        double double15 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.4d + "'", double12 == 10.4d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.9000000000000004d + "'", double14 == 2.9000000000000004d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.4d + "'", double15 == 10.4d);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        jts.Envelope envelope4 = new jts.Envelope((double) 4L, (-10.5d), 80.2d, 62.9d);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        jts.Envelope envelope4 = new jts.Envelope((double) (-7), 3.7d, 11.9d, (double) (-8));
        envelope4.init(3.7d, 30.6d, 108.0d, 97.7d);
        java.lang.Class<?> wildcardClass10 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        jts.Envelope envelope4 = new jts.Envelope(92.2d, 193.0d, 101.0d, 107.0d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.8d + "'", double5 == 100.8d);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        jts.Envelope envelope4 = new jts.Envelope(4.8d, 80.1d, 117.5d, 89.7d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        boolean boolean8 = envelope4.isEnvelopeNull();
        envelope4.init((double) 8, (-3.8d), 94.0d, 90.3d);
        envelope4.init(17.4d, 72.3d, 111.0d, 105.4d);
        double double19 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 54.9d + "'", double19 == 54.9d);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        jts.Envelope envelope4 = new jts.Envelope(3.299999999999999d, 3.299999999999999d, 0.0d, (double) 9);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.maxExtent();
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.4d + "'", double9 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.4d + "'", double11 == 8.4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.4d + "'", double12 == 8.4d);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        envelope4.init((-5.4d), (-8.7d), (double) 5L, (double) 7);
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getWidth();
        double double14 = envelope4.getHeight();
        double double15 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass16 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.0d + "'", double12 == 2.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.299999999999999d + "'", double13 == 3.299999999999999d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.0d + "'", double14 == 2.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2.0d + "'", double15 == 2.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getWidth();
        envelope4.init(13.4d, 11.9d, 2.3d, (double) (-4));
        double double11 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass12 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 13.0d + "'", double5 == 13.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 6.3d + "'", double11 == 6.3d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
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
        boolean boolean23 = envelope4.isEnvelopeNull();
        boolean boolean24 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass25 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 109.0d + "'", double13 == 109.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 105.4d + "'", double20 == 105.4d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 105.4d + "'", double21 == 105.4d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 107.0d + "'", double22 == 107.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.getHeight();
        envelope4.init((double) 10.0f, (-4.6d), (double) (byte) 1, (double) 5);
        double double11 = envelope4.getWidth();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.getWidth();
        boolean boolean14 = envelope4.isEnvelopeNull();
        double double15 = envelope4.getWidth();
        double double16 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 14.6d + "'", double11 == 14.6d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 14.6d + "'", double13 == 14.6d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 14.6d + "'", double15 == 14.6d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 14.6d + "'", double16 == 14.6d);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        jts.Envelope envelope4 = new jts.Envelope(52.7d, 0.0d, 1.4000000000000004d, 19.4d);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init((double) 100, (-100.0d), (double) '#', 5.0d);
        envelope4.init((double) 5, (double) (short) 10, 96.0d, (double) (byte) 10);
        boolean boolean21 = envelope4.isEnvelopeNull();
        double double22 = envelope4.maxExtent();
        boolean boolean23 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 86.0d + "'", double22 == 86.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        boolean boolean16 = envelope4.isEnvelopeNull();
        double double17 = envelope4.getHeight();
        double double18 = envelope4.maxExtent();
        envelope4.init((double) 2L, 53.0d, 90.89999999999999d, (double) '#');
        double double24 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.0d + "'", double18 == 8.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 55.89999999999999d + "'", double24 == 55.89999999999999d);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        jts.Envelope envelope4 = new jts.Envelope(15.0d, 36.0d, 89.7d, 108.4d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 21.0d + "'", double5 == 21.0d);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        jts.Envelope envelope4 = new jts.Envelope(1.7999999999999998d, (double) (short) 10, 9.0d, 101.8d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 92.8d + "'", double5 == 92.8d);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        jts.Envelope envelope4 = new jts.Envelope(7.1d, 16.200000000000003d, (double) (-1.0f), (double) (-3));
        envelope4.init(77.5d, 76.5d, (-100.0d), 105.4d);
        boolean boolean10 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 10.5d, (double) 0, (double) 1L);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.5d + "'", double5 == 10.5d);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        jts.Envelope envelope4 = new jts.Envelope((double) ' ', 5.8d, 86.5d, 102.7d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 16.200000000000003d + "'", double6 == 16.200000000000003d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 26.2d + "'", double7 == 26.2d);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.maxExtent();
        double double9 = envelope4.getWidth();
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.4d + "'", double10 == 8.4d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.4d + "'", double11 == 8.4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.0d + "'", double12 == 8.0d);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        jts.Envelope envelope4 = new jts.Envelope(84.99999999999999d, 79.7d, (double) (short) 10, 2.0999999999999943d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.299999999999983d + "'", double5 == 5.299999999999983d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.900000000000006d + "'", double6 == 7.900000000000006d);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        jts.Envelope envelope4 = new jts.Envelope(0.5999999999999996d, 95.2d, 12.3d, (double) (-1L));
        double double5 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 13.3d + "'", double5 == 13.3d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        jts.Envelope envelope4 = new jts.Envelope((double) '#', 107.0d, 194.0d, 94.0d);
        envelope4.init(85.5d, 5.1d, 90.6d, (double) 9);
        double double10 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 80.4d + "'", double10 == 80.4d);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        jts.Envelope envelope4 = new jts.Envelope(1.7000000000000002d, 13.0d, (double) 1, (double) 0);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 11.3d + "'", double6 == 11.3d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        jts.Envelope envelope4 = new jts.Envelope(89.5d, (double) (byte) 100, 2.9000000000000004d, (double) (-1));
        envelope4.init(8.0d, (double) 10L, 101.0d, 2.9000000000000004d);
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass12 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 98.1d + "'", double10 == 98.1d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.0d + "'", double11 == 2.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        jts.Envelope envelope4 = new jts.Envelope(199.0d, 88.7d, 95.7d, 0.0d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 110.3d + "'", double5 == 110.3d);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 3.1d, 5.0d, 2.7d);
        double double5 = envelope4.getHeight();
        envelope4.init(25.1d, (double) (-8), (double) (-5), 97.0d);
        double double11 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3d + "'", double5 == 2.3d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 102.0d + "'", double11 == 102.0d);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.getHeight();
        envelope4.init((double) (-9L), 5.4d, (-2.1d), (double) 6);
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.getWidth();
        double double15 = envelope4.getWidth();
        envelope4.init((double) (-1.0f), 14.3d, 87.3d, 9.900000000000002d);
        double double21 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 14.4d + "'", double14 == 14.4d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 14.4d + "'", double15 == 14.4d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 15.3d + "'", double21 == 15.3d);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        double double13 = envelope4.getHeight();
        double double14 = envelope4.maxExtent();
        double double15 = envelope4.getHeight();
        double double16 = envelope4.maxExtent();
        boolean boolean17 = envelope4.isEnvelopeNull();
        double double18 = envelope4.maxExtent();
        double double19 = envelope4.getWidth();
        boolean boolean20 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 5.0d + "'", double15 == 5.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 109.0d + "'", double16 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 109.0d + "'", double18 == 109.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 109.0d + "'", double19 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        jts.Envelope envelope4 = new jts.Envelope(84.5d, (double) 1L, 90.0d, 0.9000000000000004d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 89.1d + "'", double5 == 89.1d);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
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
        envelope4.init((double) 100, 3.0d, (double) (byte) 0, (double) 0);
        double double28 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 8.0d + "'", double19 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 8.0d + "'", double21 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 97.0d + "'", double28 == 97.0d);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.maxExtent();
        double double9 = envelope4.getWidth();
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass12 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.4d + "'", double10 == 8.4d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.4d + "'", double11 == 8.4d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        envelope4.init(7.1d, (double) (byte) 10, (-5.4d), 5.0d);
        double double12 = envelope4.getHeight();
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.getHeight();
        double double15 = envelope4.getHeight();
        double double16 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.4d + "'", double12 == 10.4d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.4d + "'", double14 == 10.4d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.4d + "'", double15 == 10.4d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.4d + "'", double16 == 10.4d);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        jts.Envelope envelope4 = new jts.Envelope(31.0d, (double) (byte) 100, 2.9000000000000004d, 5.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        boolean boolean7 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass8 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0999999999999996d + "'", double5 == 2.0999999999999996d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 69.0d + "'", double6 == 69.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init((double) (short) 0, 0.0d, (double) 100L, (double) (-6L));
        envelope4.init(0.0d, 11.1d, 3.3999999999999915d, 55.89999999999999d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.maxExtent();
        boolean boolean9 = envelope4.isEnvelopeNull();
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.0d + "'", double10 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.4d + "'", double11 == 8.4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.4d + "'", double12 == 8.4d);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        jts.Envelope envelope4 = new jts.Envelope(117.4d, 49.5d, 48.0d, 100.0d);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        double double16 = envelope4.getWidth();
        boolean boolean17 = envelope4.isEnvelopeNull();
        double double18 = envelope4.getWidth();
        double double19 = envelope4.getWidth();
        double double20 = envelope4.getWidth();
        boolean boolean21 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass22 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        jts.Envelope envelope4 = new jts.Envelope(84.0d, (-6.9d), 1.2000000000000002d, 8.0d);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        jts.Envelope envelope4 = new jts.Envelope((double) 2, (double) 9L, 4.8d, (double) (-1));
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        boolean boolean7 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.8d + "'", double5 == 5.8d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        jts.Envelope envelope4 = new jts.Envelope(0.7000000000000028d, 2.0999999999999996d, 90.89999999999999d, 74.69999999999999d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.3999999999999968d + "'", double5 == 1.3999999999999968d);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        envelope4.init((double) (byte) 1, (double) (-4L), (double) 100L, 4.8d);
        boolean boolean10 = envelope4.isEnvelopeNull();
        boolean boolean11 = envelope4.isEnvelopeNull();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        jts.Envelope envelope4 = new jts.Envelope(12.7d, 85.4d, 17.4d, 55.0d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 37.6d + "'", double5 == 37.6d);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        jts.Envelope envelope4 = new jts.Envelope(9.0d, (double) 0, 92.7d, (double) 100);
        envelope4.init(21.0d, 97.0d, 31.0d, 10.4d);
        envelope4.init(101.0d, 0.0d, (double) (-9L), 1.2000000000000002d);
        envelope4.init((double) 10, 94.1d, (double) 10, 80.7d);
        double double20 = envelope4.maxExtent();
        double double21 = envelope4.maxExtent();
        double double22 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 84.1d + "'", double20 == 84.1d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 84.1d + "'", double21 == 84.1d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 84.1d + "'", double22 == 84.1d);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        jts.Envelope envelope4 = new jts.Envelope(72.9d, 59.3d, 0.0d, 0.0d);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), (double) (short) 0, 1.0d, (double) 10);
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.0d + "'", double7 == 9.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 9.0d + "'", double8 == 9.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 9.0d + "'", double9 == 9.0d);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        jts.Envelope envelope4 = new jts.Envelope((double) 3L, 1.0d, (double) 5L, 14.0d);
        envelope4.init(21.0d, 0.0d, (-7.3d), (double) (-3));
        double double10 = envelope4.getWidth();
        double double11 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 21.0d + "'", double10 == 21.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 21.0d + "'", double11 == 21.0d);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        jts.Envelope envelope4 = new jts.Envelope((double) (-5L), 2.7d, 65.0d, 14.0d);
        double double5 = envelope4.getHeight();
        envelope4.init((double) (-6L), (double) 10.0f, 97.0d, (double) 100.0f);
        double double11 = envelope4.getHeight();
        double double12 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 51.0d + "'", double5 == 51.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.0d + "'", double11 == 3.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 16.0d + "'", double12 == 16.0d);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        jts.Envelope envelope4 = new jts.Envelope(7.1d, (double) 3, (double) 0, 104.0d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        jts.Envelope envelope4 = new jts.Envelope(1.5999999999999996d, 46.3d, 44.3d, 30.2d);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.maxExtent();
        double double14 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 96.0d + "'", double11 == 96.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 96.0d + "'", double12 == 96.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 96.0d + "'", double13 == 96.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 96.0d + "'", double14 == 96.0d);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        jts.Envelope envelope4 = new jts.Envelope(96.9d, (double) 10, 41.3d, 1.2000000000000002d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 86.9d + "'", double5 == 86.9d);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        envelope4.init((double) (byte) 1, (double) (-8L), (double) 8L, (double) (-4L));
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 12.0d + "'", double11 == 12.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 12.0d + "'", double12 == 12.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 12.0d + "'", double13 == 12.0d);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        jts.Envelope envelope4 = new jts.Envelope(11.9d, 6.1d, (double) (-1L), (double) (-1));
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        jts.Envelope envelope4 = new jts.Envelope(92.2d, (double) 2, 14.700000000000003d, 98.2d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 83.5d + "'", double5 == 83.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 90.2d + "'", double6 == 90.2d);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        jts.Envelope envelope4 = new jts.Envelope(41.3d, 15.0d, (double) (short) 10, (double) (-6L));
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init(84.99999999999999d, (double) (-1), 100.2d, 3.1d);
        java.lang.Class<?> wildcardClass11 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init((double) (-1.0f), (double) (byte) 0, (double) (-2L), (double) 8L);
        double double16 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        jts.Envelope envelope4 = new jts.Envelope(90.89999999999999d, 76.0d, 93.7d, 61.9d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        jts.Envelope envelope4 = new jts.Envelope(73.0d, 0.3999999999999999d, 22.0d, 3.5d);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init((double) (short) 0, 0.0d, (double) 100L, (double) (-6L));
        double double16 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass17 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 106.0d + "'", double16 == 106.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        jts.Envelope envelope4 = new jts.Envelope((double) 10L, 2.1d, 94.1d, 0.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        jts.Envelope envelope4 = new jts.Envelope(41.3d, 15.0d, (double) (short) 10, (double) (-6L));
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init(84.99999999999999d, (double) (-1), 100.2d, 3.1d);
        double double11 = envelope4.getHeight();
        boolean boolean12 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass13 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.10000000000001d + "'", double11 == 97.10000000000001d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        jts.Envelope envelope4 = new jts.Envelope((double) (-7), (double) 4L, (-7.3d), (-100.0d));
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        envelope4.init(35.1d, 191.3d, 49.5d, 84.0d);
        boolean boolean13 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 92.7d + "'", double7 == 92.7d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        double double16 = envelope4.getWidth();
        boolean boolean17 = envelope4.isEnvelopeNull();
        double double18 = envelope4.getWidth();
        double double19 = envelope4.getWidth();
        double double20 = envelope4.getWidth();
        double double21 = envelope4.maxExtent();
        double double22 = envelope4.getWidth();
        double double23 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 8.0d + "'", double21 == 8.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 8.0d + "'", double23 == 8.0d);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), (double) (short) 0, 1.0d, (double) 10);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) 7L, (double) 10, (double) 100L, 8.0d);
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        envelope4.init((double) 5L, 2.9000000000000004d, 91.3d, (double) (byte) 10);
        double double18 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.0d + "'", double5 == 9.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 92.0d + "'", double11 == 92.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 2.0999999999999996d + "'", double18 == 2.0999999999999996d);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getWidth();
        double double10 = envelope4.maxExtent();
        envelope4.init(0.0d, 4.1d, 21.599999999999994d, 14.899999999999991d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.4d + "'", double10 == 8.4d);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        jts.Envelope envelope4 = new jts.Envelope((double) 5L, 4.3d, 96.0d, 26.0d);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        jts.Envelope envelope4 = new jts.Envelope(128.0d, 108.8d, 38.7d, (-1.2d));
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 3.1d, 5.0d, 2.7d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        boolean boolean7 = envelope4.isEnvelopeNull();
        double double8 = envelope4.maxExtent();
        boolean boolean9 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.9d + "'", double5 == 6.9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.3d + "'", double6 == 2.3d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 6.9d + "'", double8 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        jts.Envelope envelope4 = new jts.Envelope(101.0d, 54.0d, 0.7000000000000028d, 11.1d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.getHeight();
        double double15 = envelope4.getWidth();
        double double16 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 109.0d + "'", double15 == 109.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 109.0d + "'", double16 == 109.0d);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.getHeight();
        boolean boolean9 = envelope4.isEnvelopeNull();
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.0d + "'", double10 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.4d + "'", double11 == 8.4d);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        jts.Envelope envelope4 = new jts.Envelope(17.4d, 9.6d, 1.0d, 200.0d);
        envelope4.init((double) 7, (double) 5, 12.0d, (double) (byte) 10);
        envelope4.init(58.0d, 9.2d, 9.0d, (double) 3);
        java.lang.Class<?> wildcardClass15 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getWidth();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 104.0d + "'", double12 == 104.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 106.0d + "'", double13 == 106.0d);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        jts.Envelope envelope4 = new jts.Envelope(88.7d, (-1.2d), 97.10000000000001d, 1.5999999999999996d);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.maxExtent();
        double double14 = envelope4.getWidth();
        boolean boolean15 = envelope4.isEnvelopeNull();
        boolean boolean16 = envelope4.isEnvelopeNull();
        double double17 = envelope4.getWidth();
        double double18 = envelope4.getHeight();
        boolean boolean19 = envelope4.isEnvelopeNull();
        boolean boolean20 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 106.0d + "'", double13 == 106.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 106.0d + "'", double14 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 106.0d + "'", double17 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 104.0d + "'", double18 == 104.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        jts.Envelope envelope4 = new jts.Envelope(134.0d, 17.4d, 46.2d, 0.0d);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        jts.Envelope envelope4 = new jts.Envelope((double) 8, 13.0d, 22.3d, (double) 10L);
        envelope4.init((double) (-100L), 90.3d, 31.0d, (double) 3L);
        boolean boolean10 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getHeight();
        double double10 = envelope4.maxExtent();
        boolean boolean11 = envelope4.isEnvelopeNull();
        double double12 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.4d + "'", double9 == 8.4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.4d + "'", double10 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.0d + "'", double12 == 8.0d);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        jts.Envelope envelope4 = new jts.Envelope((-2.1d), 94.1d, (double) (-2), 86.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 88.0d + "'", double5 == 88.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 96.19999999999999d + "'", double6 == 96.19999999999999d);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        double double16 = envelope4.getWidth();
        boolean boolean17 = envelope4.isEnvelopeNull();
        envelope4.init(13.0d, 11.9d, (double) 6L, 5.0d);
        double double23 = envelope4.getHeight();
        double double24 = envelope4.getHeight();
        boolean boolean25 = envelope4.isEnvelopeNull();
        boolean boolean26 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        jts.Envelope envelope4 = new jts.Envelope(99.4d, 107.5d, 7.299999999999997d, 18.5d);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getWidth();
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        boolean boolean13 = envelope4.isEnvelopeNull();
        envelope4.init(12.6d, 0.0d, (double) 100L, (-5.4d));
        double double19 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.0d + "'", double11 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 105.4d + "'", double19 == 105.4d);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        boolean boolean8 = envelope4.isEnvelopeNull();
        envelope4.init((-100.0d), (double) (-1), 104.0d, (double) (-7L));
        double double14 = envelope4.getWidth();
        double double15 = envelope4.getHeight();
        boolean boolean16 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 99.0d + "'", double14 == 99.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 111.0d + "'", double15 == 111.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        jts.Envelope envelope4 = new jts.Envelope(20.0d, (double) 10L, 0.6999999999999993d, 109.7d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.maxExtent();
        double double10 = envelope4.getHeight();
        double double11 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.4d + "'", double9 == 8.4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.4d + "'", double10 == 8.4d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.4d + "'", double11 == 8.4d);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        jts.Envelope envelope4 = new jts.Envelope(1.7999999999999998d, (double) 1, 0.9000000000000004d, 94.1d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7999999999999998d + "'", double5 == 0.7999999999999998d);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        jts.Envelope envelope4 = new jts.Envelope(91.0d, (double) 6L, 17.4d, (double) (-7));
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 85.0d + "'", double5 == 85.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 4.1d, 22.5d, 0.0d);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.getHeight();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getHeight();
        double double10 = envelope4.getWidth();
        double double11 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.0d + "'", double11 == 8.0d);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init((double) 100, (-100.0d), (double) '#', 5.0d);
        boolean boolean16 = envelope4.isEnvelopeNull();
        boolean boolean17 = envelope4.isEnvelopeNull();
        double double18 = envelope4.getWidth();
        double double19 = envelope4.getHeight();
        double double20 = envelope4.getWidth();
        double double21 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 200.0d + "'", double18 == 200.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 200.0d + "'", double20 == 200.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 200.0d + "'", double21 == 200.0d);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        jts.Envelope envelope4 = new jts.Envelope((double) (-6L), (double) (byte) 100, (double) (short) 1, (double) (short) 0);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        jts.Envelope envelope4 = new jts.Envelope(92.7d, (double) (-10L), 1.2d, (double) (-8L));
        double double5 = envelope4.getWidth();
        envelope4.init(110.0d, (double) (-4), (double) 1, (double) 0);
        envelope4.init((double) (-10L), (double) 100L, (double) 10, (double) 10.0f);
        double double16 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.7d + "'", double5 == 102.7d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 110.0d + "'", double16 == 110.0d);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        jts.Envelope envelope4 = new jts.Envelope(107.0d, 91.3d, 11.3d, 19.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init(88.7d, 0.5d, (double) 4, 86.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        jts.Envelope envelope4 = new jts.Envelope(42.0d, 93.7d, (-6.9d), 0.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 51.7d + "'", double6 == 51.7d);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        jts.Envelope envelope4 = new jts.Envelope(1.4000000000000004d, 130.2d, 102.5d, 5.1d);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        double double11 = envelope4.getWidth();
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass14 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.0d + "'", double11 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 96.0d + "'", double12 == 96.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 96.0d + "'", double13 == 96.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getHeight();
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getWidth();
        double double13 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.0d + "'", double11 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.0d + "'", double13 == 8.0d);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        jts.Envelope envelope4 = new jts.Envelope(1.4000000000000004d, 96.2d, 4.400000000000006d, (double) (-100L));
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.maxExtent();
        boolean boolean14 = envelope4.isEnvelopeNull();
        double double15 = envelope4.getHeight();
        double double16 = envelope4.getHeight();
        double double17 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass18 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 104.0d + "'", double12 == 104.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 106.0d + "'", double13 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 104.0d + "'", double15 == 104.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 104.0d + "'", double16 == 104.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 106.0d + "'", double17 == 106.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        jts.Envelope envelope4 = new jts.Envelope(2.3d, (double) (short) 10, 3.299999999999999d, (-8.7d));
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        jts.Envelope envelope4 = new jts.Envelope((double) 7, (double) 10.0f, (double) 4L, (double) 0L);
        envelope4.init((double) 10, (double) 8, (double) 8, (-1.2d));
        double double10 = envelope4.getWidth();
        boolean boolean11 = envelope4.isEnvelopeNull();
        boolean boolean12 = envelope4.isEnvelopeNull();
        envelope4.init((-100.0d), 104.1d, (double) (-100L), (double) ' ');
        boolean boolean18 = envelope4.isEnvelopeNull();
        double double19 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.0d + "'", double10 == 2.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 204.1d + "'", double19 == 204.1d);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        jts.Envelope envelope4 = new jts.Envelope((double) 1L, (double) 0L, 10.5d, (-2.1d));
        double double5 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 12.6d + "'", double5 == 12.6d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
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
        double double22 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass23 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 6.9d + "'", double22 == 6.9d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1), (double) (-4), 3.3d, 11.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), (double) (short) 0, 1.0d, (double) 10);
        double double5 = envelope4.getWidth();
        envelope4.init((double) (byte) 100, (double) (byte) 0, (double) 4, (double) (-1L));
        double double11 = envelope4.getWidth();
        double double12 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 5.0d + "'", double12 == 5.0d);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) 0, 92.9d, 8.4d, 6.3d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 92.9d + "'", double5 == 92.9d);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) 100, (double) (-100), 94.0d, (double) 9L);
        envelope4.init(90.0d, (double) 5L, (double) (-1), (double) 4);
        double double10 = envelope4.getHeight();
        boolean boolean11 = envelope4.isEnvelopeNull();
        envelope4.init(22.5d, 13.8d, 104.0d, (-5.4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.0d + "'", double10 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.maxExtent();
        double double9 = envelope4.getWidth();
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.maxExtent();
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.4d + "'", double10 == 8.4d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.4d + "'", double11 == 8.4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.4d + "'", double12 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.4d + "'", double14 == 8.4d);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        jts.Envelope envelope4 = new jts.Envelope(122.6d, 30.0d, 47.0d, 83.9d);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        jts.Envelope envelope4 = new jts.Envelope((double) 5, (double) (byte) 100, 9.0d, 109.0d);
        double double5 = envelope4.getHeight();
        envelope4.init(102.0d, (double) (-6L), (double) 10, 86.0d);
        double double11 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 108.0d + "'", double11 == 108.0d);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        jts.Envelope envelope4 = new jts.Envelope(109.1d, (double) (-6L), (-7.3d), (double) (-4));
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 115.1d + "'", double5 == 115.1d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 115.1d + "'", double6 == 115.1d);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.getWidth();
        boolean boolean9 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 103.0d + "'", double6 == 103.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 103.0d + "'", double7 == 103.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 13.0d + "'", double8 == 13.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        jts.Envelope envelope4 = new jts.Envelope((-8.7d), (-6.9d), (-1.0d), (double) (-10));
        double double5 = envelope4.getWidth();
        envelope4.init((double) 0L, (double) (-3L), (-5.4d), 86.5d);
        envelope4.init(12.899999999999991d, 80.2d, 80.1d, 0.0d);
        double double16 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.799999999999999d + "'", double5 == 1.799999999999999d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 80.1d + "'", double16 == 80.1d);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        jts.Envelope envelope4 = new jts.Envelope(84.9d, 55.0d, 54.3d, 97.19999999999999d);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        jts.Envelope envelope4 = new jts.Envelope(18.7d, 1.5999999999999996d, 2.3000000000000007d, 76.69999999999999d);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) 0, (-2.1d), (double) (-8L), (double) (-4));
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getWidth();
        envelope4.init(193.0d, 62.0d, 51.0d, (double) (-3L));
        double double12 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.1d + "'", double5 == 2.1d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.1d + "'", double6 == 2.1d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 54.0d + "'", double12 == 54.0d);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 98.4d, (double) 100.0f, 82.9d);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        jts.Envelope envelope4 = new jts.Envelope(1.7000000000000002d, 6.7d, 1.5999999999999996d, 4.0d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        jts.Envelope envelope4 = new jts.Envelope(17.1d, 193.0d, 52.599999999999994d, 68.7d);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        jts.Envelope envelope4 = new jts.Envelope(95.10000000000001d, 14.4d, 6.900000000000006d, 18.9d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        jts.Envelope envelope4 = new jts.Envelope(5.3d, (double) 1, 96.2d, (double) (-9L));
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass7 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.3d + "'", double6 == 4.3d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        jts.Envelope envelope4 = new jts.Envelope((double) 8, 13.0d, 22.3d, (double) 10L);
        envelope4.init((double) (-100L), 90.3d, 31.0d, (double) 3L);
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getWidth();
        boolean boolean12 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 190.3d + "'", double10 == 190.3d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 190.3d + "'", double11 == 190.3d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        jts.Envelope envelope4 = new jts.Envelope(49.5d, (double) 5L, 7.1d, 53.0d);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        jts.Envelope envelope4 = new jts.Envelope((double) '#', (-2.1d), (double) 1L, (double) (-8));
        envelope4.init(11.8d, 81.5d, 70.0d, 22.5d);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.getHeight();
        envelope4.init(34.0d, (double) (-9L), 3.0d, 31.0d);
        double double20 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 43.0d + "'", double20 == 43.0d);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        jts.Envelope envelope4 = new jts.Envelope((double) 100L, (-2.1d), (double) 100L, 109.7d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.1d + "'", double5 == 102.1d);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        jts.Envelope envelope4 = new jts.Envelope(14.700000000000003d, 4.8d, 52.599999999999994d, 12.0d);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 54.2d, 5.1d, 11.3d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.200000000000001d + "'", double5 == 6.200000000000001d);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        jts.Envelope envelope4 = new jts.Envelope((double) '#', (double) (short) 100, (double) (short) -1, (double) 1L);
        double double5 = envelope4.getHeight();
        envelope4.init((double) 3, (double) 10L, (double) 100, 0.0d);
        double double11 = envelope4.getHeight();
        envelope4.init(0.0d, (double) 6L, (double) (-6L), 31.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        jts.Envelope envelope4 = new jts.Envelope(86.6d, (double) 2L, 84.5d, 0.9000000000000004d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 84.6d + "'", double6 == 84.6d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 84.6d + "'", double7 == 84.6d);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        jts.Envelope envelope4 = new jts.Envelope(155.4d, 5.8999999999999995d, 89.5d, (double) (-1));
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 103.7d, 35.1d, 3.0999999999999943d);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        jts.Envelope envelope4 = new jts.Envelope((-6.9d), 0.0d, 3.0999999999999943d, 66.0d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 62.900000000000006d + "'", double5 == 62.900000000000006d);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init((double) 7L, (double) 0L, (double) 10, 101.0d);
        boolean boolean12 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        jts.Envelope envelope4 = new jts.Envelope(57.0d, 2.8d, 94.2d, 29.2d);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getHeight();
        double double10 = envelope4.getWidth();
        envelope4.init(111.0d, (double) 10, (double) 10L, (double) (-100L));
        envelope4.init(102.0d, 102.7d, 93.7d, (double) (-5));
        double double21 = envelope4.maxExtent();
        double double22 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass23 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.4d + "'", double9 == 8.4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.0d + "'", double10 == 8.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 98.7d + "'", double21 == 98.7d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 98.7d + "'", double22 == 98.7d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getWidth();
        envelope4.init((double) (-6L), (double) 6, (double) (short) -1, 6.3d);
        boolean boolean19 = envelope4.isEnvelopeNull();
        envelope4.init(3.9d, 20.0d, (double) (-8L), 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 96.0d + "'", double11 == 96.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 96.0d + "'", double12 == 96.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.0d + "'", double13 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
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
        envelope4.init(38.1d, 11.799999999999997d, (double) (-9L), (double) 2L);
        boolean boolean28 = envelope4.isEnvelopeNull();
        double double29 = envelope4.getHeight();
        double double30 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 80.0d + "'", double17 == 80.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 11.0d + "'", double29 == 11.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 11.0d + "'", double30 == 11.0d);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        jts.Envelope envelope4 = new jts.Envelope((double) (-7), (double) 4L, (-7.3d), (-100.0d));
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init((double) (-1.0f), (double) 6, (double) (-5), 12.6d);
        double double11 = envelope4.getWidth();
        double double12 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7.0d + "'", double11 == 7.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        jts.Envelope envelope4 = new jts.Envelope((double) (-7), (double) 4L, (-7.3d), (-100.0d));
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init((double) (-1.0f), (double) 6, (double) (-5), 12.6d);
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 17.6d + "'", double11 == 17.6d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 17.6d + "'", double12 == 17.6d);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 3.1d, 5.0d, 2.7d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        boolean boolean7 = envelope4.isEnvelopeNull();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getHeight();
        double double10 = envelope4.getHeight();
        double double11 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.9d + "'", double5 == 6.9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.3d + "'", double6 == 2.3d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.3d + "'", double9 == 2.3d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.3d + "'", double10 == 2.3d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 6.9d + "'", double11 == 6.9d);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        jts.Envelope envelope4 = new jts.Envelope(77.89999999999999d, 3.8000000000000007d, 52.5d, 90.6d);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.getHeight();
        envelope4.init(34.0d, (double) (-9L), 3.0d, 31.0d);
        double double20 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass21 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 28.0d + "'", double20 == 28.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        envelope4.init((-5.4d), (-8.7d), (double) 5L, (double) 7);
        envelope4.init((double) (-1L), 0.0d, (double) (-6L), 14.0d);
        boolean boolean17 = envelope4.isEnvelopeNull();
        double double18 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) (-1L), (double) (-1.0f), (double) 0L, 100.0d);
        double double12 = envelope4.getWidth();
        envelope4.init((-2.1d), 2.3d, 104.0d, 100.0d);
        boolean boolean18 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass19 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init((double) 100, (-100.0d), (double) '#', 5.0d);
        boolean boolean16 = envelope4.isEnvelopeNull();
        boolean boolean17 = envelope4.isEnvelopeNull();
        double double18 = envelope4.getWidth();
        double double19 = envelope4.getHeight();
        double double20 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 200.0d + "'", double18 == 200.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 200.0d + "'", double20 == 200.0d);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        boolean boolean11 = envelope4.isEnvelopeNull();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.maxExtent();
        boolean boolean14 = envelope4.isEnvelopeNull();
        double double15 = envelope4.getWidth();
        double double16 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 96.0d + "'", double13 == 96.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 8.0d + "'", double15 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 96.0d + "'", double16 == 96.0d);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        jts.Envelope envelope4 = new jts.Envelope(17.0d, (double) 6L, (double) (short) 10, 105.7d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init(94.5d, 4.2d, (double) 2L, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.getHeight();
        envelope4.init((double) 10.0f, (-4.6d), (double) (byte) 1, (double) 5);
        boolean boolean11 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        boolean boolean13 = envelope4.isEnvelopeNull();
        boolean boolean14 = envelope4.isEnvelopeNull();
        double double15 = envelope4.maxExtent();
        double double16 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 106.0d + "'", double15 == 106.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 106.0d + "'", double16 == 106.0d);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        jts.Envelope envelope4 = new jts.Envelope(100.0d, 10.5d, (double) 2, (-100.0d));
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getWidth();
        boolean boolean7 = envelope4.isEnvelopeNull();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getHeight();
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getWidth();
        double double12 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.0d + "'", double5 == 102.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 89.5d + "'", double6 == 89.5d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 102.0d + "'", double9 == 102.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 102.0d + "'", double10 == 102.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 89.5d + "'", double11 == 89.5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 102.0d + "'", double12 == 102.0d);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        jts.Envelope envelope4 = new jts.Envelope((double) (-8L), 110.39999999999999d, 198.5d, 10.100000000000001d);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        jts.Envelope envelope4 = new jts.Envelope((double) 1L, (double) 0L, 10.5d, (-2.1d));
        envelope4.init(119.1d, 12.0d, 56.900000000000006d, 20.2d);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 92.2d, 2.7d, 76.5d);
        envelope4.init(91.2d, 17.4d, 200.0d, 4.0d);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        jts.Envelope envelope4 = new jts.Envelope(9.6d, 0.0d, (double) (-3L), 2.1d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        envelope4.init(13.0d, (double) (-6), 80.3d, 34.4d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.6d + "'", double5 == 9.6d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.1d + "'", double6 == 5.1d);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
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
        envelope4.init((-2.1d), 0.0d, 98.7d, 2.7d);
        double double23 = envelope4.getWidth();
        envelope4.init(11.5d, 81.0d, 49.5d, 1.7000000000000004d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.4d + "'", double9 == 8.4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.4d + "'", double10 == 8.4d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 98.7d + "'", double16 == 98.7d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 98.7d + "'", double17 == 98.7d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2.1d + "'", double23 == 2.1d);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init((double) ' ', (double) 1, (double) (short) -1, 100.0d);
        double double12 = envelope4.getWidth();
        envelope4.init(100.0d, 96.0d, 17.200000000000003d, (double) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 31.0d + "'", double12 == 31.0d);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        jts.Envelope envelope4 = new jts.Envelope((-2.1d), (double) 7L, 24.0d, (-6.9d));
        double double5 = envelope4.getHeight();
        envelope4.init(2.700000000000003d, 204.5d, 85.1d, 2.3000000000000007d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.9d + "'", double5 == 30.9d);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        jts.Envelope envelope4 = new jts.Envelope((double) 8L, (double) 2L, 52.0d, (double) (byte) 100);
        envelope4.init(88.7d, 92.2d, (-10.5d), 106.9d);
        double double10 = envelope4.maxExtent();
        boolean boolean11 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 117.4d + "'", double10 == 117.4d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        jts.Envelope envelope4 = new jts.Envelope(11.9d, 6.1d, (double) (-1L), (double) (-1));
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        boolean boolean8 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass9 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        jts.Envelope envelope4 = new jts.Envelope(0.5d, 11.9d, 87.0d, (double) (byte) 10);
        envelope4.init(132.0d, (double) 8, 33.3d, 77.9d);
        double double10 = envelope4.getHeight();
        boolean boolean11 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 44.60000000000001d + "'", double10 == 44.60000000000001d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        jts.Envelope envelope4 = new jts.Envelope((double) 8, 13.0d, 22.3d, (double) 10L);
        envelope4.init((double) (-100L), 90.3d, 31.0d, (double) 3L);
        envelope4.init(16.0d, 28.0d, 30.5d, 0.0d);
        double double15 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 12.0d + "'", double15 == 12.0d);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        jts.Envelope envelope4 = new jts.Envelope(88.7d, 44.0d, 52.7d, (double) (short) -1);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.maxExtent();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getHeight();
        double double10 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 103.0d + "'", double6 == 103.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 103.0d + "'", double7 == 103.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 103.0d + "'", double9 == 103.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 103.0d + "'", double10 == 103.0d);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getWidth();
        envelope4.init(9.2d, (double) 100, (double) 0.0f, 92.0d);
        double double14 = envelope4.maxExtent();
        double double15 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 92.0d + "'", double14 == 92.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 92.0d + "'", double15 == 92.0d);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        jts.Envelope envelope4 = new jts.Envelope(74.0d, 94.2d, 11.8d, 92.2d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, (double) (-100), (double) '4', 104.6d);
        double double5 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), (double) 4L, (double) (-1), (double) (byte) 1);
        envelope4.init(99.0d, (double) (-3), 9.0d, 2.7d);
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 102.0d + "'", double11 == 102.0d);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        jts.Envelope envelope4 = new jts.Envelope(190.1d, 42.3d, 8.4d, 43.6d);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        jts.Envelope envelope4 = new jts.Envelope(105.2d, 200.0d, 4.6d, 1.5999999999999996d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        jts.Envelope envelope4 = new jts.Envelope(9.6d, 0.0d, (double) (-3L), 2.1d);
        envelope4.init(105.7d, 17.200000000000003d, 13.3d, 13.8d);
        double double10 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 88.5d + "'", double10 == 88.5d);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 74.6d, 115.1d, 0.9000000000000004d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 114.19999999999999d + "'", double5 == 114.19999999999999d);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        jts.Envelope envelope4 = new jts.Envelope(17.4d, 9.6d, 1.0d, 200.0d);
        envelope4.init((double) 7, (double) 5, 12.0d, (double) (byte) 10);
        boolean boolean10 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass11 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 1, 85.5d, (double) (-4L), 22.0d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 84.5d + "'", double5 == 84.5d);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), (double) (short) 0, 1.0d, (double) 10);
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.0d + "'", double7 == 9.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 9.0d + "'", double8 == 9.0d);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 0.0d, 102.7d, (-1.0d));
        envelope4.init(8.700000000000003d, 60.49999999999999d, 5.6d, 4.3d);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
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
        double double24 = envelope4.getWidth();
        double double25 = envelope4.getWidth();
        double double26 = envelope4.getHeight();
        envelope4.init(1.5999999999999996d, 106.2d, 97.4d, 33.7d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 109.0d + "'", double13 == 109.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.2000000000000002d + "'", double21 == 1.2000000000000002d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 3.2d + "'", double22 == 3.2d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.2000000000000002d + "'", double24 == 1.2000000000000002d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.2000000000000002d + "'", double25 == 1.2000000000000002d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 3.2d + "'", double26 == 3.2d);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getWidth();
        envelope4.init(9.2d, (double) 100, (double) 0.0f, 92.0d);
        envelope4.init((-3.8d), (double) (-1L), (double) 100.0f, (double) (-1));
        double double19 = envelope4.getHeight();
        double double20 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass21 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 101.0d + "'", double19 == 101.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 101.0d + "'", double20 == 101.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        jts.Envelope envelope4 = new jts.Envelope(92.3d, (double) 4L, 95.0d, 92.7d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.299999999999997d + "'", double6 == 2.299999999999997d);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        jts.Envelope envelope4 = new jts.Envelope((double) 5, (double) (byte) 100, 9.0d, 109.0d);
        double double5 = envelope4.getHeight();
        envelope4.init(102.7d, 15.0d, 9.5d, 98.1d);
        double double11 = envelope4.getHeight();
        double double12 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 88.6d + "'", double11 == 88.6d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 88.6d + "'", double12 == 88.6d);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        jts.Envelope envelope4 = new jts.Envelope(86.6d, (double) 2L, 84.5d, 0.9000000000000004d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        jts.Envelope envelope4 = new jts.Envelope((-7.3d), 3.9d, 87.0d, 0.5999999999999996d);
        envelope4.init((double) (-100L), (double) (-8L), 0.0d, 0.40000000000000036d);
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 92.0d + "'", double11 == 92.0d);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        jts.Envelope envelope4 = new jts.Envelope((-100.0d), 46.0d, 4.4d, 105.7d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 146.0d + "'", double5 == 146.0d);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) 10, (double) (byte) 1, (double) (byte) 0);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        boolean boolean7 = envelope4.isEnvelopeNull();
        double double8 = envelope4.maxExtent();
        double double9 = envelope4.maxExtent();
        double double10 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
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
        boolean boolean24 = envelope4.isEnvelopeNull();
        boolean boolean25 = envelope4.isEnvelopeNull();
        double double26 = envelope4.maxExtent();
        double double27 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.0d + "'", double22 == 2.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2.0d + "'", double23 == 2.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 6.9d + "'", double26 == 6.9d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 6.9d + "'", double27 == 6.9d);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) 1, 9.2d, 1.799999999999999d, 14.9d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) (-1L), (double) (-1.0f), (double) 0L, 100.0d);
        double double12 = envelope4.getWidth();
        double double13 = envelope4.getWidth();
        double double14 = envelope4.getWidth();
        double double15 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass16 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        jts.Envelope envelope4 = new jts.Envelope(18.0d, 17.6d, (double) (-5), 2.0d);
        envelope4.init(101.0d, 10.4d, 88.1d, 88.3d);
        envelope4.init(69.0d, 39.2d, 89.2d, (-5.4d));
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 3.1d, 5.0d, 2.7d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getWidth();
        envelope4.init(13.0d, 1.7000000000000002d, (-5.4d), (double) 100);
        double double13 = envelope4.maxExtent();
        boolean boolean14 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3d + "'", double5 == 2.3d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 6.9d + "'", double7 == 6.9d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 105.4d + "'", double13 == 105.4d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
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
        double double23 = envelope4.maxExtent();
        double double24 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 98.7d + "'", double23 == 98.7d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 98.7d + "'", double24 == 98.7d);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        jts.Envelope envelope4 = new jts.Envelope(24.0d, 51.0d, 96.0d, 3.3d);
        envelope4.init(17.6d, 2.3d, 96.2d, 0.0d);
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 15.3d + "'", double10 == 15.3d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 96.2d + "'", double11 == 96.2d);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        jts.Envelope envelope4 = new jts.Envelope(42.0d, 93.7d, (-6.9d), 0.0d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 51.7d + "'", double5 == 51.7d);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        envelope4.init((double) (-1L), (double) (-7L), 106.0d, (double) 10);
        boolean boolean18 = envelope4.isEnvelopeNull();
        double double19 = envelope4.maxExtent();
        double double20 = envelope4.getHeight();
        boolean boolean21 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 96.0d + "'", double19 == 96.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 96.0d + "'", double20 == 96.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        jts.Envelope envelope4 = new jts.Envelope(42.0d, (double) (short) 1, (double) 9, (double) (-100L));
        double double5 = envelope4.getWidth();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 41.0d + "'", double5 == 41.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 109.0d + "'", double6 == 109.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 41.0d + "'", double7 == 41.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 109.0d + "'", double8 == 109.0d);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 3.1d, 5.0d, 2.7d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init((double) (byte) -1, (double) 1, (double) (short) 100, (double) (-1L));
        double double12 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3d + "'", double5 == 2.3d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 101.0d + "'", double12 == 101.0d);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        jts.Envelope envelope4 = new jts.Envelope(3.3d, 76.0d, 24.0d, (double) (-10));
        envelope4.init(43.0d, 96.0d, 90.3d, 2.3d);
        double double10 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 88.0d + "'", double10 == 88.0d);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        jts.Envelope envelope4 = new jts.Envelope(111.3d, 113.39999999999999d, 7.299999999999997d, 16.0d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        jts.Envelope envelope4 = new jts.Envelope(98.1d, 8.099999999999994d, 1.8000000000000007d, 102.5d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.7d + "'", double5 == 100.7d);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        jts.Envelope envelope4 = new jts.Envelope((-8.7d), 0.0d, (double) (short) 10, 96.0d);
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        boolean boolean7 = envelope4.isEnvelopeNull();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.maxExtent();
        double double10 = envelope4.getHeight();
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.7d + "'", double5 == 8.7d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 86.0d + "'", double9 == 86.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 86.0d + "'", double10 == 86.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 86.0d + "'", double11 == 86.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
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
        envelope4.init(3.3d, 117.7d, (double) 1L, 53.0d);
        double double34 = envelope4.maxExtent();
        double double35 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 6.9d + "'", double19 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 24.0d + "'", double26 == 24.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 6.0d + "'", double27 == 6.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 24.0d + "'", double28 == 24.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 114.4d + "'", double34 == 114.4d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 114.4d + "'", double35 == 114.4d);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        jts.Envelope envelope4 = new jts.Envelope((double) 7, (double) 10.0f, (double) 4L, (double) 0L);
        envelope4.init((double) 10.0f, (double) 4, (double) 9, 3.1d);
        envelope4.init(5.0d, (double) (-1L), (double) 10, (double) 4L);
        double double15 = envelope4.getHeight();
        envelope4.init((double) 10, 26.0d, 3.0d, (double) (-1L));
        double double21 = envelope4.maxExtent();
        boolean boolean22 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 6.0d + "'", double15 == 6.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 16.0d + "'", double21 == 16.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        jts.Envelope envelope4 = new jts.Envelope(92.7d, (double) (-1L), (double) 7, 31.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        envelope4.init(7.1d, 100.0d, 95.10000000000001d, (-1.0d));
        boolean boolean13 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 24.0d + "'", double5 == 24.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 93.7d + "'", double6 == 93.7d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 93.7d + "'", double7 == 93.7d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        jts.Envelope envelope4 = new jts.Envelope(1.3999999999999986d, 98.1d, 14.899999999999991d, 101.60000000000001d);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        jts.Envelope envelope4 = new jts.Envelope(119.1d, 8.100000000000001d, 0.0d, 25.0d);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        jts.Envelope envelope4 = new jts.Envelope(5.3d, (double) 1, 96.2d, (double) (-9L));
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 105.2d + "'", double6 == 105.2d);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 10, (double) 100, (double) 1, (double) (byte) 100);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getHeight();
        envelope4.init(61.9d, 42.3d, 100.60000000000001d, 5.800000000000001d);
        double double13 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 90.0d + "'", double6 == 90.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 99.0d + "'", double7 == 99.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 19.6d + "'", double13 == 19.6d);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) 100, 1.7999999999999998d, 3.3d, (-100.0d));
        double double5 = envelope4.getWidth();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getHeight();
        boolean boolean8 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 98.2d + "'", double5 == 98.2d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 103.3d + "'", double6 == 103.3d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 103.3d + "'", double7 == 103.3d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        jts.Envelope envelope4 = new jts.Envelope(98.7d, 1.9d, 0.0d, 6.3d);
        envelope4.init((double) 0L, (double) (-7), 155.4d, 106.0d);
        double double10 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 49.400000000000006d + "'", double10 == 49.400000000000006d);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        jts.Envelope envelope4 = new jts.Envelope((double) 5, (double) (byte) 100, 9.0d, 109.0d);
        double double5 = envelope4.getHeight();
        envelope4.init(102.0d, (double) (-6L), (double) 10, 86.0d);
        envelope4.init(8.700000000000003d, 90.80000000000001d, 102.3d, 0.0d);
        double double16 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 102.3d + "'", double16 == 102.3d);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        jts.Envelope envelope4 = new jts.Envelope(1.7000000000000002d, 13.0d, (double) 1, (double) 0);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        boolean boolean9 = envelope4.isEnvelopeNull();
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 11.3d + "'", double5 == 11.3d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 11.3d + "'", double6 == 11.3d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 11.3d + "'", double7 == 11.3d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 11.3d + "'", double10 == 11.3d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 11.3d + "'", double11 == 11.3d);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 3.7d, (double) 1, 13.5d);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        jts.Envelope envelope4 = new jts.Envelope(56.900000000000006d, 44.60000000000001d, 1.7000000000000004d, 53.9d);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getHeight();
        double double14 = envelope4.getWidth();
        boolean boolean15 = envelope4.isEnvelopeNull();
        double double16 = envelope4.maxExtent();
        envelope4.init((-100.0d), (double) (-8L), 10.100000000000001d, 110.3d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 104.0d + "'", double12 == 104.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 106.0d + "'", double14 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 106.0d + "'", double16 == 106.0d);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        envelope4.init(6.9d, (double) (byte) 0, (double) (byte) 1, (double) (-1.0f));
        double double18 = envelope4.getWidth();
        envelope4.init(28.0d, (double) (-100), 5.8d, 5.3d);
        double double24 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.5d + "'", double24 == 0.5d);
    }
}

