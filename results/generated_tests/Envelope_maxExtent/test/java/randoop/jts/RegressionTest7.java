package jts;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        jts.Envelope envelope4 = new jts.Envelope(95.10000000000001d, 14.4d, 6.900000000000006d, 18.9d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 11.999999999999993d + "'", double5 == 11.999999999999993d);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        envelope4.init((double) (byte) 1, (double) (-8L), (double) 8L, (double) (-4L));
        double double10 = envelope4.getWidth();
        boolean boolean11 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.0d + "'", double10 == 9.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        jts.Envelope envelope4 = new jts.Envelope(13.600000000000001d, 0.0d, 74.0d, 22.5d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 0.0d, 102.7d, (-1.0d));
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 103.7d + "'", double6 == 103.7d);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        double double13 = envelope4.getHeight();
        double double14 = envelope4.maxExtent();
        double double15 = envelope4.getWidth();
        boolean boolean16 = envelope4.isEnvelopeNull();
        envelope4.init(7.1d, 5.8d, 82.3d, 56.900000000000006d);
        boolean boolean22 = envelope4.isEnvelopeNull();
        double double23 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 109.0d + "'", double15 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 25.39999999999999d + "'", double23 == 25.39999999999999d);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        jts.Envelope envelope4 = new jts.Envelope(104.3d, (double) (short) 100, 4.8d, 12.399999999999999d);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        jts.Envelope envelope4 = new jts.Envelope((double) '4', (double) 10, (double) 5, (double) 1L);
        double double5 = envelope4.getWidth();
        envelope4.init((double) (-5), 2.1d, 5.0d, (double) 7);
        double double11 = envelope4.getWidth();
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 42.0d + "'", double5 == 42.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7.1d + "'", double11 == 7.1d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.1d + "'", double12 == 7.1d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 2.0d + "'", double13 == 2.0d);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        double double16 = envelope4.getWidth();
        double double17 = envelope4.getHeight();
        envelope4.init(7.699999999999999d, 98.2d, 92.1d, 98.89999999999999d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) 10, 62.9d, 100.60000000000001d, 57.3d);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        jts.Envelope envelope4 = new jts.Envelope((double) 2, (double) 9L, 4.8d, (double) (-1));
        double double5 = envelope4.getWidth();
        envelope4.init(2.0999999999999943d, 46.2d, (double) 1L, 96.8d);
        java.lang.Class<?> wildcardClass11 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.0d + "'", double5 == 7.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        jts.Envelope envelope4 = new jts.Envelope(46.3d, 181.70000000000002d, 5.1d, 35.5d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 135.40000000000003d + "'", double5 == 135.40000000000003d);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), 13.4d, 109.0d, 23.5d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 22.4d + "'", double5 == 22.4d);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1.0f), (double) (-9), (double) 2, (double) 10);
        double double5 = envelope4.getHeight();
        envelope4.init(88.1d, 2.7d, 115.1d, 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        jts.Envelope envelope4 = new jts.Envelope(94.2d, 20.700000000000003d, 62.9d, (double) (short) 1);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
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
        boolean boolean27 = envelope4.isEnvelopeNull();
        double double28 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.0d + "'", double18 == 8.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 94.1d + "'", double25 == 94.1d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 94.1d + "'", double26 == 94.1d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 94.1d + "'", double28 == 94.1d);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init((double) 100, (-100.0d), (double) '#', 5.0d);
        envelope4.init((double) 1L, (double) (byte) 100, (double) (-8L), (double) (-1));
        double double21 = envelope4.getWidth();
        envelope4.init((double) 1, 2.9000000000000004d, (double) 1, (-2.1d));
        double double27 = envelope4.getHeight();
        double double28 = envelope4.getHeight();
        boolean boolean29 = envelope4.isEnvelopeNull();
        double double30 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 99.0d + "'", double21 == 99.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 3.1d + "'", double27 == 3.1d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 3.1d + "'", double28 == 3.1d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 3.1d + "'", double30 == 3.1d);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        jts.Envelope envelope4 = new jts.Envelope(24.0d, 96.7d, 50.1d, 12.899999999999991d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        jts.Envelope envelope4 = new jts.Envelope(87.0d, 8.299999999999999d, 8.4d, 84.5d);
        envelope4.init(91.0d, 79.9d, 33.0d, (double) 8);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        jts.Envelope envelope4 = new jts.Envelope(92.7d, (double) (-10L), 1.2d, (double) (-8L));
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.2d + "'", double5 == 9.2d);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        jts.Envelope envelope4 = new jts.Envelope(5.3d, (double) 9L, 3.1d, 10.4d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getHeight();
        boolean boolean8 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.300000000000001d + "'", double5 == 7.300000000000001d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.300000000000001d + "'", double6 == 7.300000000000001d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 7.300000000000001d + "'", double7 == 7.300000000000001d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
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
        envelope4.init(82.3d, 11.0d, 9.2d, (-100.0d));
        boolean boolean31 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 6.9d + "'", double19 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        jts.Envelope envelope4 = new jts.Envelope((double) 7, (double) 10.0f, (double) 4L, (double) 0L);
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init(2.0d, 0.0d, 104.0d, 1.7000000000000004d);
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 102.3d + "'", double11 == 102.3d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.0d + "'", double12 == 2.0d);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        jts.Envelope envelope4 = new jts.Envelope(62.699999999999996d, 64.0d, 87.0d, 0.0d);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        jts.Envelope envelope4 = new jts.Envelope(31.0d, (double) (byte) 100, 2.9000000000000004d, 5.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getHeight();
        envelope4.init((double) (-4L), 46.2d, 0.0d, 40.300000000000004d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0999999999999996d + "'", double6 == 2.0999999999999996d);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        boolean boolean7 = envelope4.isEnvelopeNull();
        boolean boolean8 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass9 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        jts.Envelope envelope4 = new jts.Envelope((double) 2L, (double) (-7), 2.0999999999999996d, 102.7d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.60000000000001d + "'", double5 == 100.60000000000001d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.0d + "'", double6 == 9.0d);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        jts.Envelope envelope4 = new jts.Envelope(8.4d, 58.7d, 55.89999999999999d, (double) 9);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        jts.Envelope envelope4 = new jts.Envelope(117.7d, (double) (short) 1, 4.799999999999997d, (double) 100.0f);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 116.7d + "'", double5 == 116.7d);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        jts.Envelope envelope4 = new jts.Envelope((double) 10L, 1.1999999999999886d, 16.3d, 198.1d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.800000000000011d + "'", double5 == 8.800000000000011d);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        jts.Envelope envelope4 = new jts.Envelope(100.0d, 10.5d, (double) 2, (-100.0d));
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.maxExtent();
        double double9 = envelope4.maxExtent();
        double double10 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 102.0d + "'", double6 == 102.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 102.0d + "'", double7 == 102.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 102.0d + "'", double8 == 102.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 102.0d + "'", double9 == 102.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 102.0d + "'", double10 == 102.0d);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        jts.Envelope envelope4 = new jts.Envelope((double) 7, (double) 10.0f, (double) 4L, (double) 0L);
        envelope4.init((double) 10.0f, (double) 4, (double) 9, 3.1d);
        envelope4.init(5.0d, (double) (-1L), (double) 10, (double) 4L);
        double double15 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 6.0d + "'", double15 == 6.0d);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        jts.Envelope envelope4 = new jts.Envelope(1.7999999999999998d, (-9.3d), 3.9000000000000004d, 191.3d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 187.4d + "'", double5 == 187.4d);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        jts.Envelope envelope4 = new jts.Envelope(84.1d, 111.9d, (double) (-6L), 14.2d);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        jts.Envelope envelope4 = new jts.Envelope((double) 100, 24.0d, 5.0d, (double) (-9));
        envelope4.init(102.0d, 109.0d, (double) 1L, (double) (-1));
        double double10 = envelope4.getHeight();
        envelope4.init((double) 1, (-100.0d), 58.5d, (double) 6);
        double double16 = envelope4.maxExtent();
        boolean boolean17 = envelope4.isEnvelopeNull();
        double double18 = envelope4.getWidth();
        double double19 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.0d + "'", double10 == 2.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 101.0d + "'", double16 == 101.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 101.0d + "'", double18 == 101.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.5d + "'", double19 == 52.5d);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        jts.Envelope envelope4 = new jts.Envelope((double) 8L, (-5.4d), 5.8d, (double) 10L);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        envelope4.init(12.6d, 11.3d, 18.0d, 38.0d);
        double double12 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 13.4d + "'", double6 == 13.4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.299999999999999d + "'", double12 == 1.299999999999999d);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        jts.Envelope envelope4 = new jts.Envelope((double) (-10L), 72.3d, 62.9d, 46.3d);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        jts.Envelope envelope4 = new jts.Envelope((double) 100, (double) (-1), 94.3d, 4.4d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        double double13 = envelope4.getHeight();
        double double14 = envelope4.maxExtent();
        envelope4.init(8.4d, (double) '4', 90.0d, 2.9000000000000004d);
        boolean boolean20 = envelope4.isEnvelopeNull();
        envelope4.init((double) (-9), 92.0d, 43.6d, (double) (short) -1);
        envelope4.init(4.9d, 0.0d, 52.0d, 193.6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        jts.Envelope envelope4 = new jts.Envelope(1.799999999999999d, 0.0d, (double) 8, 93.7d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.799999999999999d + "'", double5 == 1.799999999999999d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 85.7d + "'", double6 == 85.7d);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        jts.Envelope envelope4 = new jts.Envelope(182.7d, 9.100000000000003d, 60.49999999999999d, 0.0d);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getHeight();
        envelope4.init(104.0d, (double) 10L, (double) 3L, 4.8d);
        envelope4.init((double) (-1L), 88.7d, (double) 6, 0.0d);
        double double16 = envelope4.maxExtent();
        boolean boolean17 = envelope4.isEnvelopeNull();
        envelope4.init(114.1d, 92.9d, 8.600000000000001d, 4.000000000000005d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 89.7d + "'", double16 == 89.7d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        jts.Envelope envelope4 = new jts.Envelope(24.0d, 51.0d, 96.0d, 3.3d);
        envelope4.init(17.6d, 2.3d, 96.2d, 0.0d);
        double double10 = envelope4.getWidth();
        double double11 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 15.3d + "'", double10 == 15.3d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 96.2d + "'", double11 == 96.2d);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init((double) (-2L), (-3.8d), (double) (-7L), (double) 1.0f);
        double double12 = envelope4.getWidth();
        envelope4.init(7.7d, 100.8d, (double) 'a', 108.8d);
        double double18 = envelope4.maxExtent();
        double double19 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7999999999999998d + "'", double12 == 1.7999999999999998d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 93.1d + "'", double18 == 93.1d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 11.799999999999997d + "'", double19 == 11.799999999999997d);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        jts.Envelope envelope4 = new jts.Envelope(10.4d, 9.099999999999998d, 6.300000000000001d, 89.8d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.3000000000000025d + "'", double5 == 1.3000000000000025d);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        jts.Envelope envelope4 = new jts.Envelope(92.9d, 26.80000000000001d, 5.800000000000001d, 102.3d);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        jts.Envelope envelope4 = new jts.Envelope(100.2d, 36.9d, 79.7d, 92.9d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 13.200000000000003d + "'", double5 == 13.200000000000003d);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        jts.Envelope envelope4 = new jts.Envelope(89.7d, 46.2d, 75.9d, (double) (-100L));
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        jts.Envelope envelope4 = new jts.Envelope((double) (-3), (double) 10L, (double) (-6), 0.0d);
        envelope4.init(73.0d, 2.8d, (double) (-1), (double) 1);
        double double10 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 70.2d + "'", double10 == 70.2d);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.getHeight();
        double double15 = envelope4.getWidth();
        double double16 = envelope4.maxExtent();
        double double17 = envelope4.getWidth();
        boolean boolean18 = envelope4.isEnvelopeNull();
        envelope4.init(0.6999999999999993d, (double) 100L, 46.3d, 86.9d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 109.0d + "'", double15 == 109.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 109.0d + "'", double16 == 109.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 109.0d + "'", double17 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        jts.Envelope envelope4 = new jts.Envelope(80.7d, 8.600000000000001d, 7.7d, 82.3d);
        double double5 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 74.6d + "'", double5 == 74.6d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        jts.Envelope envelope4 = new jts.Envelope((double) 0.0f, (double) (byte) 1, 2.1d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass7 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.1d + "'", double5 == 2.1d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.1d + "'", double6 == 2.1d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        jts.Envelope envelope4 = new jts.Envelope(16.0d, (double) (short) -1, 8.4d, 6.7d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        jts.Envelope envelope4 = new jts.Envelope(39.2d, 6.7d, 14.2d, 50.1d);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 15.4d, (-7.3d), 4.800000000000001d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.4d + "'", double5 == 15.4d);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        jts.Envelope envelope4 = new jts.Envelope(6.9d, (-2.1d), (double) (-6), (double) (short) 1);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        envelope4.init(9.0d, 62.0d, 80.0d, 2.0999999999999996d);
        double double12 = envelope4.getWidth();
        double double13 = envelope4.getHeight();
        envelope4.init(18.0d, 17.0d, 0.0d, 5.4d);
        double double19 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.0d + "'", double6 == 9.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 53.0d + "'", double12 == 53.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 77.9d + "'", double13 == 77.9d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 5.4d + "'", double19 == 5.4d);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1), 24.0d, 90.0d, 2.7d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 87.3d + "'", double7 == 87.3d);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.getHeight();
        envelope4.init((double) 10.0f, (-4.6d), (double) (byte) 1, (double) 5);
        double double11 = envelope4.getWidth();
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 14.6d + "'", double11 == 14.6d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 14.6d + "'", double12 == 14.6d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 14.6d + "'", double13 == 14.6d);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        jts.Envelope envelope4 = new jts.Envelope(7.900000000000006d, 82.9d, 90.19999999999999d, 112.3d);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        jts.Envelope envelope4 = new jts.Envelope(34.1d, 0.0d, 101.0d, 1.6999999999999993d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        jts.Envelope envelope4 = new jts.Envelope((double) 2L, (-3.8d), 2.1d, 0.0d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getHeight();
        envelope4.init(0.0d, 92.0d, 4.4d, 113.0d);
        envelope4.init(4.799999999999997d, (double) (-1L), (double) (-3L), 22.5d);
        boolean boolean17 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.8d + "'", double5 == 5.8d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.1d + "'", double6 == 2.1d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        jts.Envelope envelope4 = new jts.Envelope(110.0d, 0.6000000000000005d, (double) (-7L), 87.1d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 109.4d + "'", double5 == 109.4d);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        double double13 = envelope4.getHeight();
        double double14 = envelope4.maxExtent();
        double double15 = envelope4.getHeight();
        double double16 = envelope4.maxExtent();
        double double17 = envelope4.getHeight();
        double double18 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 5.0d + "'", double15 == 5.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 109.0d + "'", double16 == 109.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 5.0d + "'", double17 == 5.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 5.0d + "'", double18 == 5.0d);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        boolean boolean11 = envelope4.isEnvelopeNull();
        boolean boolean12 = envelope4.isEnvelopeNull();
        boolean boolean13 = envelope4.isEnvelopeNull();
        boolean boolean14 = envelope4.isEnvelopeNull();
        double double15 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 96.0d + "'", double15 == 96.0d);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        jts.Envelope envelope4 = new jts.Envelope(6.9d, 6.1d, 92.2d, 51.0d);
        envelope4.init(76.0d, 3.8000000000000007d, 148.0d, 91.0d);
        double double10 = envelope4.maxExtent();
        boolean boolean11 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 72.2d + "'", double10 == 72.2d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1.0f), (double) (-9), (double) 2, (double) 10);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.maxExtent();
        envelope4.init(0.3999999999999999d, 103.9d, 87.1d, 88.0d);
        double double14 = envelope4.getHeight();
        double double15 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9000000000000057d + "'", double14 == 0.9000000000000057d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 103.5d + "'", double15 == 103.5d);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        jts.Envelope envelope4 = new jts.Envelope(31.0d, (double) (byte) 100, 2.9000000000000004d, 5.0d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.maxExtent();
        boolean boolean7 = envelope4.isEnvelopeNull();
        double double8 = envelope4.getWidth();
        boolean boolean9 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 69.0d + "'", double5 == 69.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 69.0d + "'", double6 == 69.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 69.0d + "'", double8 == 69.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 3.1d, 5.0d, 2.7d);
        double double5 = envelope4.getHeight();
        envelope4.init(25.1d, (double) (-8), (double) (-5), 97.0d);
        double double11 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass12 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3d + "'", double5 == 2.3d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 102.0d + "'", double11 == 102.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        jts.Envelope envelope4 = new jts.Envelope((double) '4', (double) 10, (double) 5, (double) 1L);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        envelope4.init(85.4d, 117.7d, 3.3999999999999915d, 38.1d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 42.0d + "'", double6 == 42.0d);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        envelope4.init(6.9d, (double) (byte) 0, (double) (byte) 1, (double) (-1.0f));
        double double18 = envelope4.getWidth();
        double double19 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 6.9d + "'", double19 == 6.9d);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getHeight();
        envelope4.init(3.299999999999999d, 93.69999999999999d, 98.7d, 84.60000000000001d);
        boolean boolean11 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        jts.Envelope envelope4 = new jts.Envelope(107.2d, 108.4d, 24.2d, (double) (-6));
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        envelope4.init((double) (byte) 1, (double) (-8L), (double) 8L, (double) (-4L));
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getHeight();
        envelope4.init(95.0d, 200.0d, 200.0d, (double) 6);
        boolean boolean19 = envelope4.isEnvelopeNull();
        double double20 = envelope4.getWidth();
        double double21 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 12.0d + "'", double11 == 12.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 12.0d + "'", double12 == 12.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 12.0d + "'", double13 == 12.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 105.0d + "'", double20 == 105.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 194.0d + "'", double21 == 194.0d);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 46.2d, (double) (-8L), (double) (-100));
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        jts.Envelope envelope4 = new jts.Envelope(87.0d, 8.299999999999999d, 8.4d, 84.5d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 78.7d + "'", double5 == 78.7d);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) 1, 11.0d, (double) (-1), (double) 0.0f);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        jts.Envelope envelope4 = new jts.Envelope(4.8d, 27.3d, 15.3d, 1.799999999999999d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) -1, 106.9d, 101.8d, 98.1d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.getWidth();
        double double9 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 107.9d + "'", double7 == 107.9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 107.9d + "'", double8 == 107.9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 107.9d + "'", double9 == 107.9d);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        jts.Envelope envelope4 = new jts.Envelope(6.3d, 54.3d, 103.0d, 0.0d);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        jts.Envelope envelope4 = new jts.Envelope(49.0d, 39.4d, 79.9d, 11.3d);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        jts.Envelope envelope4 = new jts.Envelope(132.0d, 110.5d, 25.1d, (double) (-2L));
        double double5 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 21.5d + "'", double5 == 21.5d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), (double) (short) 0, 1.0d, (double) 10);
        double double5 = envelope4.getWidth();
        envelope4.init((double) 3L, 0.5999999999999996d, 25.0d, 102.9d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        double double13 = envelope4.getHeight();
        double double14 = envelope4.maxExtent();
        double double15 = envelope4.getWidth();
        envelope4.init((double) (short) 10, 117.7d, 0.0d, 19.0d);
        envelope4.init(44.5d, 1.1999999999999886d, 88.7d, 0.0d);
        double double26 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 109.0d + "'", double15 == 109.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 88.7d + "'", double26 == 88.7d);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        jts.Envelope envelope4 = new jts.Envelope(2.200000000000003d, 109.0d, 13.9d, 0.6999999999999993d);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        jts.Envelope envelope4 = new jts.Envelope((double) (-4L), (double) 7L, 6.9d, (double) (-4L));
        double double5 = envelope4.getWidth();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 11.0d + "'", double5 == 11.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 11.0d + "'", double6 == 11.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.9d + "'", double7 == 10.9d);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 111.0d, 4.0d, 102.0d);
        envelope4.init(0.0d, 183.7d, 99.2d, 3.8000000000000007d);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        jts.Envelope envelope4 = new jts.Envelope(92.7d, (double) (-10L), 1.2d, (double) (-8L));
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getWidth();
        envelope4.init(84.5d, (double) 10, 74.69999999999999d, 38.4d);
        boolean boolean14 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.7d + "'", double5 == 102.7d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.2d + "'", double6 == 9.2d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 102.7d + "'", double7 == 102.7d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 102.7d + "'", double8 == 102.7d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        jts.Envelope envelope4 = new jts.Envelope(9.2d, 88.5d, 94.1d, 54.3d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 79.3d + "'", double5 == 79.3d);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        double double16 = envelope4.getWidth();
        double double17 = envelope4.getHeight();
        double double18 = envelope4.getWidth();
        double double19 = envelope4.maxExtent();
        double double20 = envelope4.getHeight();
        envelope4.init((double) 'a', 8.4d, 111.9d, 25.1d);
        envelope4.init(9.100000000000003d, 52.0d, 100.8d, (double) (-8));
        double double31 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass32 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 8.0d + "'", double19 == 8.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 8.0d + "'", double20 == 8.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 108.8d + "'", double31 == 108.8d);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        jts.Envelope envelope4 = new jts.Envelope((double) 7, (double) 10.0f, (double) 4L, (double) 0L);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        envelope4.init(23.5d, 14.9d, 60.0d, 52.7d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.0d + "'", double6 == 3.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        jts.Envelope envelope4 = new jts.Envelope((double) (-8L), 10.0d, (double) (-6L), (double) 8);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init(19.7d, 12.7d, 68.7d, 100.60000000000001d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 18.0d + "'", double6 == 18.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.0d + "'", double7 == 18.0d);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        boolean boolean11 = envelope4.isEnvelopeNull();
        envelope4.init((-2.1d), 104.1d, (-7.3d), (double) (-1.0f));
        double double17 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 6.3d + "'", double17 == 6.3d);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.maxExtent();
        double double9 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.4d + "'", double9 == 8.4d);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        jts.Envelope envelope4 = new jts.Envelope(7.0d, 101.0d, 42.0d, 102.0d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 94.0d + "'", double5 == 94.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 94.0d + "'", double6 == 94.0d);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
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
        double double34 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass35 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 6.9d + "'", double19 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 24.0d + "'", double26 == 24.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 6.0d + "'", double27 == 6.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 24.0d + "'", double28 == 24.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 52.0d + "'", double34 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        jts.Envelope envelope4 = new jts.Envelope(111.9d, 8.4d, 83.7d, 128.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init((double) 1, 85.3d, 117.7d, 62.699999999999996d);
        double double11 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 84.3d + "'", double11 == 84.3d);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        jts.Envelope envelope4 = new jts.Envelope(11.9d, 6.1d, (double) (-1L), (double) (-1));
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        jts.Envelope envelope4 = new jts.Envelope((double) 8, (-6.9d), 94.3d, 11.3d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        jts.Envelope envelope4 = new jts.Envelope(36.0d, (double) 100.0f, 100.0d, 69.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 64.0d + "'", double5 == 64.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 64.0d + "'", double6 == 64.0d);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        jts.Envelope envelope4 = new jts.Envelope(87.1d, 100.30000000000001d, 34.1d, 90.2d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 56.1d + "'", double5 == 56.1d);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 3.1d, 5.0d, 2.7d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) 0, (double) 0.0f, (double) (-5), 0.0d);
        boolean boolean12 = envelope4.isEnvelopeNull();
        envelope4.init(155.4d, 39.400000000000006d, 5.4d, 199.0d);
        boolean boolean18 = envelope4.isEnvelopeNull();
        boolean boolean19 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3d + "'", double5 == 2.3d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 6.9d + "'", double6 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        double double13 = envelope4.getHeight();
        double double14 = envelope4.maxExtent();
        double double15 = envelope4.getWidth();
        double double16 = envelope4.getHeight();
        double double17 = envelope4.getWidth();
        boolean boolean18 = envelope4.isEnvelopeNull();
        double double19 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 109.0d + "'", double15 == 109.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5.0d + "'", double16 == 5.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 109.0d + "'", double17 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 109.0d + "'", double19 == 109.0d);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        jts.Envelope envelope4 = new jts.Envelope(31.0d, (double) (byte) 100, 2.9000000000000004d, 5.0d);
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass9 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 69.0d + "'", double5 == 69.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.0999999999999996d + "'", double7 == 2.0999999999999996d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 69.0d + "'", double8 == 69.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getWidth();
        double double9 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 3.1d, 5.0d, 2.7d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        boolean boolean7 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass8 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.9d + "'", double5 == 6.9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.3d + "'", double6 == 2.3d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        jts.Envelope envelope4 = new jts.Envelope(5.3d, (double) 9L, 3.1d, 10.4d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getWidth();
        boolean boolean7 = envelope4.isEnvelopeNull();
        envelope4.init(26.700000000000003d, (double) 6L, 92.2d, 26.2d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.7d + "'", double5 == 3.7d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.7d + "'", double6 == 3.7d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        jts.Envelope envelope4 = new jts.Envelope(61.9d, 44.0d, 13.9d, 17.4d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        jts.Envelope envelope4 = new jts.Envelope(1.799999999999999d, 35.0d, 96.0d, 3.2d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 33.2d + "'", double5 == 33.2d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 92.8d + "'", double6 == 92.8d);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init((double) 100, (-100.0d), (double) '#', 5.0d);
        boolean boolean16 = envelope4.isEnvelopeNull();
        double double17 = envelope4.getWidth();
        boolean boolean18 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass19 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 200.0d + "'", double17 == 200.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        jts.Envelope envelope4 = new jts.Envelope(24.0d, (double) 2, 104.0d, (-7.3d));
        double double5 = envelope4.maxExtent();
        envelope4.init(58.5d, 58.5d, 65.0d, 3.1d);
        java.lang.Class<?> wildcardClass11 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 111.3d + "'", double5 == 111.3d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        jts.Envelope envelope4 = new jts.Envelope(33.7d, 13.6d, 69.0d, 3.1d);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        double double16 = envelope4.getWidth();
        double double17 = envelope4.getHeight();
        double double18 = envelope4.getWidth();
        boolean boolean19 = envelope4.isEnvelopeNull();
        double double20 = envelope4.getHeight();
        boolean boolean21 = envelope4.isEnvelopeNull();
        double double22 = envelope4.getWidth();
        double double23 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 8.0d + "'", double20 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 8.0d + "'", double23 == 8.0d);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        jts.Envelope envelope4 = new jts.Envelope(194.0d, 1.5999999999999996d, (double) (short) 0, 1.9d);
        double double5 = envelope4.getHeight();
        envelope4.init(93.1d, 9.2d, 79.2d, 11.5d);
        double double11 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.9d + "'", double5 == 1.9d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 83.89999999999999d + "'", double11 == 83.89999999999999d);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1), (double) (-4), 3.3d, 11.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        boolean boolean7 = envelope4.isEnvelopeNull();
        envelope4.init((double) (-1), 61.0d, (double) (-1L), 100.2d);
        double double13 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.7d + "'", double6 == 7.7d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 62.0d + "'", double13 == 62.0d);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        double double16 = envelope4.getWidth();
        double double17 = envelope4.maxExtent();
        boolean boolean18 = envelope4.isEnvelopeNull();
        envelope4.init((double) 1, (double) 4L, 109.0d, 5.8d);
        envelope4.init(1.9000000000000004d, 8.100000000000001d, 94.60000000000001d, 96.2d);
        envelope4.init(89.5d, 117.7d, 28.0d, 5.1d);
        boolean boolean34 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        jts.Envelope envelope4 = new jts.Envelope(12.0d, 44.5d, 14.4d, 20.9d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        double double13 = envelope4.getHeight();
        boolean boolean14 = envelope4.isEnvelopeNull();
        double double15 = envelope4.maxExtent();
        double double16 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 109.0d + "'", double15 == 109.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 109.0d + "'", double16 == 109.0d);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        jts.Envelope envelope4 = new jts.Envelope(80.1d, 17.7d, 2.0999999999999943d, 0.40000000000000036d);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        jts.Envelope envelope4 = new jts.Envelope(98.0d, 92.2d, 107.5d, 19.0d);
        envelope4.init(6.300000000000001d, 16.200000000000003d, 33.7d, 14.700000000000003d);
        java.lang.Class<?> wildcardClass10 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        jts.Envelope envelope4 = new jts.Envelope(24.0d, (double) 2, 104.0d, (-7.3d));
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 111.3d + "'", double5 == 111.3d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 111.3d + "'", double6 == 111.3d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 111.3d + "'", double7 == 111.3d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 111.3d + "'", double8 == 111.3d);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        jts.Envelope envelope4 = new jts.Envelope(10.600000000000009d, 17.6d, 89.5d, (double) (-100));
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 189.5d + "'", double5 == 189.5d);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        jts.Envelope envelope4 = new jts.Envelope(33.7d, 100.0d, 103.2d, 26.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        jts.Envelope envelope4 = new jts.Envelope((double) 100L, 61.9d, 14.700000000000003d, 4.400000000000006d);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getHeight();
        envelope4.init((double) 1, 5.0d, 3.1d, 24.0d);
        envelope4.init(62.699999999999996d, 30.6d, 4.000000000000005d, (double) 3L);
        envelope4.init(111.9d, (double) (short) -1, (double) 1, 8.800000000000011d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        jts.Envelope envelope4 = new jts.Envelope((double) 0, 0.0d, 5.8d, (double) '#');
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.maxExtent();
        double double9 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 29.2d + "'", double5 == 29.2d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 29.2d + "'", double8 == 29.2d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        jts.Envelope envelope4 = new jts.Envelope((-1.0d), 20.799999999999997d, 1.7000000000000002d, 10.600000000000009d);
        envelope4.init(7.7d, 0.0d, (double) (-7), 9.2d);
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 16.2d + "'", double10 == 16.2d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 16.2d + "'", double11 == 16.2d);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        jts.Envelope envelope4 = new jts.Envelope((double) 8, (double) (short) 0, 16.200000000000003d, 17.6d);
        double double5 = envelope4.maxExtent();
        envelope4.init(2.3d, 20.0d, 88.6d, 128.0d);
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 39.400000000000006d + "'", double11 == 39.400000000000006d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 39.400000000000006d + "'", double12 == 39.400000000000006d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 39.400000000000006d + "'", double13 == 39.400000000000006d);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        jts.Envelope envelope4 = new jts.Envelope(132.0d, 110.5d, 25.1d, (double) (-2L));
        envelope4.init((double) 2, 198.1d, 103.0d, 103.0d);
        double double10 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 196.1d + "'", double10 == 196.1d);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        jts.Envelope envelope4 = new jts.Envelope(106.2d, 0.0d, (-8.7d), 113.0d);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        jts.Envelope envelope4 = new jts.Envelope(10.8d, 5.6d, 1.1999999999999886d, 42.0d);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getWidth();
        envelope4.init(0.0d, (double) 10, (double) 0L, (double) 0.0f);
        envelope4.init(4.800000000000001d, 100.0d, 111.9d, (double) 1);
        double double20 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 110.9d + "'", double20 == 110.9d);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        envelope4.init((double) (byte) 1, (double) (-8L), (double) 8L, (double) (-4L));
        double double10 = envelope4.getWidth();
        envelope4.init((double) (-8), 34.0d, (double) 7, 7.699999999999999d);
        envelope4.init(11.1d, 20.9d, (double) 10, 2.0999999999999943d);
        envelope4.init(9.900000000000002d, 24.2d, 0.0d, 73.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.0d + "'", double10 == 9.0d);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        envelope4.init((double) (-8), (double) (-9), (double) (-100), (double) 2L);
        double double16 = envelope4.getHeight();
        double double17 = envelope4.getHeight();
        envelope4.init(20.0d, 0.0d, (double) (short) 100, 96.9d);
        double double23 = envelope4.getHeight();
        double double24 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 102.0d + "'", double16 == 102.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 102.0d + "'", double17 == 102.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 3.0999999999999943d + "'", double23 == 3.0999999999999943d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 3.0999999999999943d + "'", double24 == 3.0999999999999943d);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, (double) (-100), (double) '4', 104.6d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        jts.Envelope envelope4 = new jts.Envelope((double) (-7), 3.3d, (double) 0L, 49.400000000000006d);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getHeight();
        envelope4.init((double) ' ', (-2.1d), 109.0d, (double) 6);
        boolean boolean11 = envelope4.isEnvelopeNull();
        double double12 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass13 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 34.1d + "'", double12 == 34.1d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        jts.Envelope envelope4 = new jts.Envelope((double) (-10), (double) (-3L), 0.0d, (double) 10.0f);
        envelope4.init(94.1d, (-7.3d), 2.1d, 9.2d);
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 101.39999999999999d + "'", double11 == 101.39999999999999d);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        jts.Envelope envelope4 = new jts.Envelope(98.7d, 1.9d, 0.0d, 6.3d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 96.8d + "'", double6 == 96.8d);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        jts.Envelope envelope4 = new jts.Envelope(107.0d, 34.1d, 90.6d, 5.0d);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        jts.Envelope envelope4 = new jts.Envelope((double) 0, 0.0d, 5.8d, (double) '#');
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass7 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        jts.Envelope envelope4 = new jts.Envelope(92.3d, 107.0d, 36.0d, (double) (-3));
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        jts.Envelope envelope4 = new jts.Envelope((double) 100L, 100.0d, (-9.3d), 6.9d);
        double double5 = envelope4.getWidth();
        envelope4.init(3.8000000000000007d, 95.0d, 38.1d, 10.9d);
        envelope4.init(12.5d, 3.3999999999999995d, 191.3d, 88.3d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        jts.Envelope envelope4 = new jts.Envelope(102.7d, 104.1d, 93.7d, 93.7d);
        envelope4.init(112.1d, 101.39999999999999d, 100.7d, 0.5999999999999996d);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        envelope4.init((double) (-1L), (double) (-7L), 106.0d, (double) 10);
        double double18 = envelope4.maxExtent();
        envelope4.init(88.3d, 100.60000000000001d, 0.0d, 100.1d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 96.0d + "'", double18 == 96.0d);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        jts.Envelope envelope4 = new jts.Envelope(110.0d, 0.6000000000000005d, (double) (-7L), 87.1d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 94.1d + "'", double5 == 94.1d);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        jts.Envelope envelope4 = new jts.Envelope(3.3d, 9.5d, 38.0d, 20.0d);
        envelope4.init(77.9d, 0.0d, 80.3d, 69.0d);
        boolean boolean10 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) 10, (double) (byte) 1, (double) (byte) 0);
        double double5 = envelope4.maxExtent();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.getWidth();
        double double9 = envelope4.maxExtent();
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.maxExtent();
        double double14 = envelope4.getHeight();
        boolean boolean15 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        jts.Envelope envelope4 = new jts.Envelope(9.5d, (double) 7, 21.0d, 77.7d);
        envelope4.init((double) 1.0f, 11.9d, 82.3d, 94.1d);
        double double10 = envelope4.maxExtent();
        envelope4.init(83.00000000000001d, 58.0d, 70.0d, 84.60000000000001d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 11.799999999999997d + "'", double10 == 11.799999999999997d);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        jts.Envelope envelope4 = new jts.Envelope((double) 0L, (double) (-9), (double) (-3L), 3.1d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.0d + "'", double5 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.0d + "'", double6 == 9.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.0d + "'", double7 == 9.0d);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass7 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        jts.Envelope envelope4 = new jts.Envelope(198.1d, 18.5d, 86.2d, 96.7d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.5d + "'", double6 == 10.5d);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1), 24.0d, 90.0d, 2.7d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 25.0d + "'", double7 == 25.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 87.3d + "'", double8 == 87.3d);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) 100.0f, (double) 4, (double) 1.0f, 5.3d);
        envelope4.init(103.0d, 100.60000000000001d, 80.7d, 84.1d);
        double double17 = envelope4.getHeight();
        envelope4.init(14.899999999999991d, 30.0d, 10.4d, 94.60000000000001d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 3.3999999999999915d + "'", double17 == 3.3999999999999915d);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getHeight();
        envelope4.init(104.0d, (double) 10L, (double) 3L, 4.8d);
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 94.0d + "'", double11 == 94.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 94.0d + "'", double12 == 94.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 94.0d + "'", double13 == 94.0d);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        jts.Envelope envelope4 = new jts.Envelope(109.0d, 1.7999999999999998d, 1.0d, 14.9d);
        envelope4.init((double) '#', (double) 3, (double) 6, 199.0d);
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 193.0d + "'", double10 == 193.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 193.0d + "'", double11 == 193.0d);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        jts.Envelope envelope4 = new jts.Envelope(13.600000000000001d, 110.0d, 9.099999999999998d, 182.7d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 173.6d + "'", double5 == 173.6d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 96.4d + "'", double6 == 96.4d);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        jts.Envelope envelope4 = new jts.Envelope(98.6d, 91.1d, 68.6d, (double) (-4L));
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.5d + "'", double5 == 7.5d);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        jts.Envelope envelope4 = new jts.Envelope((double) (-8L), 10.0d, (double) (-6L), (double) 8);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getWidth();
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.0d + "'", double7 == 18.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 18.0d + "'", double9 == 18.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 18.0d + "'", double11 == 18.0d);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        jts.Envelope envelope4 = new jts.Envelope((-8.7d), (-6.9d), (-1.0d), (double) (-10));
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.0d + "'", double5 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.799999999999999d + "'", double6 == 1.799999999999999d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.0d + "'", double7 == 9.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 9.0d + "'", double8 == 9.0d);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getHeight();
        envelope4.init((double) ' ', (-2.1d), 109.0d, (double) 6);
        double double11 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 103.0d + "'", double11 == 103.0d);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        jts.Envelope envelope4 = new jts.Envelope(114.9d, 117.4d, 98.89999999999999d, 107.0d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.100000000000009d + "'", double5 == 8.100000000000009d);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        jts.Envelope envelope4 = new jts.Envelope((-3.8d), (-6.9d), 0.0d, (-10.5d));
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getHeight();
        double double14 = envelope4.getHeight();
        double double15 = envelope4.getWidth();
        double double16 = envelope4.getHeight();
        double double17 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 104.0d + "'", double12 == 104.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 104.0d + "'", double14 == 104.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 106.0d + "'", double15 == 106.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 104.0d + "'", double16 == 104.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 106.0d + "'", double17 == 106.0d);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), (double) 4L, (double) (-1), (double) (byte) 1);
        envelope4.init(99.0d, (double) (-3), 9.0d, 2.7d);
        double double10 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6.3d + "'", double10 == 6.3d);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        jts.Envelope envelope4 = new jts.Envelope(8.099999999999994d, 26.800000000000004d, 15.0d, 4.800000000000001d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 18.70000000000001d + "'", double5 == 18.70000000000001d);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), (double) (short) 0, 1.0d, (double) 10);
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        envelope4.init(91.3d, 11.9d, 87.3d, 1.2000000000000002d);
        double double13 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.0d + "'", double7 == 9.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 86.1d + "'", double13 == 86.1d);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 0.0d, (double) 10.0f, 102.3d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 92.3d + "'", double5 == 92.3d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 1, (double) 0.0f, (double) 6, (double) 3L);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init(173.6d, 0.0d, 108.0d, (double) 10.0f);
        double double12 = envelope4.getWidth();
        envelope4.init(155.4d, 0.0d, 110.3d, 88.1d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 173.6d + "'", double12 == 173.6d);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1), 182.7d, 173.6d, 51.0d);
        envelope4.init(90.2d, 7.0d, 19.4d, 3.7d);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        jts.Envelope envelope4 = new jts.Envelope((double) 9L, (double) 10, (double) (-7L), (double) 0L);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getWidth();
        double double9 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 7.0d + "'", double7 == 7.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        jts.Envelope envelope4 = new jts.Envelope((double) (-3), 21.5d, 2.200000000000003d, 37.1d);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        jts.Envelope envelope4 = new jts.Envelope((-8.7d), (-6.9d), (-1.0d), (double) (-10));
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.0d + "'", double5 == 9.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.799999999999999d + "'", double7 == 1.799999999999999d);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        jts.Envelope envelope4 = new jts.Envelope((-4.6d), (double) 100L, (-7.3d), 65.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass8 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 104.6d + "'", double5 == 104.6d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.6d + "'", double6 == 104.6d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 72.3d + "'", double7 == 72.3d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        jts.Envelope envelope4 = new jts.Envelope(26.700000000000003d, 3.299999999999999d, 0.0d, 41.0d);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        jts.Envelope envelope4 = new jts.Envelope(33.7d, (double) (-1L), (double) (-6), 6.1d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 34.7d + "'", double5 == 34.7d);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), 10.5d, (double) (short) 100, (double) 9);
        double double5 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 11.5d + "'", double5 == 11.5d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        jts.Envelope envelope4 = new jts.Envelope((-8.7d), 0.0d, (double) (short) 10, 96.0d);
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        boolean boolean7 = envelope4.isEnvelopeNull();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.maxExtent();
        envelope4.init((double) 8, 22.4d, 15.6d, 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.7d + "'", double5 == 8.7d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 86.0d + "'", double9 == 86.0d);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getHeight();
        envelope4.init((double) 3L, (double) (-7), (double) (byte) 0, 0.0d);
        boolean boolean15 = envelope4.isEnvelopeNull();
        double double16 = envelope4.getHeight();
        envelope4.init(80.4d, 98.89999999999999d, 32.099999999999994d, 58.7d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        jts.Envelope envelope4 = new jts.Envelope(8.700000000000003d, 72.3d, 112.1d, (double) 10);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        double double13 = envelope4.getWidth();
        boolean boolean14 = envelope4.isEnvelopeNull();
        envelope4.init((double) (-1L), 38.0d, 32.0d, 93.1d);
        java.lang.Class<?> wildcardClass20 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 109.0d + "'", double13 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        jts.Envelope envelope4 = new jts.Envelope(89.5d, 7.299999999999997d, 16.000000000000014d, 6.300000000000001d);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        jts.Envelope envelope4 = new jts.Envelope(2.9000000000000004d, 103.0d, 132.0d, 61.9d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.1d + "'", double5 == 100.1d);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        jts.Envelope envelope4 = new jts.Envelope(100.0d, 10.5d, (double) 2, (-100.0d));
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.maxExtent();
        double double9 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass10 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.0d + "'", double5 == 102.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 102.0d + "'", double6 == 102.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 102.0d + "'", double7 == 102.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 102.0d + "'", double8 == 102.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 102.0d + "'", double9 == 102.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        jts.Envelope envelope4 = new jts.Envelope(77.89999999999999d, 97.19999999999999d, (-8.7d), 204.1d);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 99.7d, 30.6d, 0.0d);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        jts.Envelope envelope4 = new jts.Envelope(153.6d, 40.300000000000004d, 18.7d, 44.3d);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) 100, 1.7999999999999998d, 3.3d, (-100.0d));
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 103.3d + "'", double6 == 103.3d);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
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
        double double29 = envelope4.getWidth();
        double double30 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 6.9d + "'", double19 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 24.0d + "'", double26 == 24.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 6.0d + "'", double27 == 6.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 24.0d + "'", double28 == 24.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 24.0d + "'", double29 == 24.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 24.0d + "'", double30 == 24.0d);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getWidth();
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.getWidth();
        envelope4.init(0.0d, 42.0d, 55.0d, 41.0d);
        double double19 = envelope4.maxExtent();
        envelope4.init(47.0d, 99.6d, 10.4d, 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.0d + "'", double11 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 42.0d + "'", double19 == 42.0d);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getWidth();
        envelope4.init((double) 6, 1.2d, 18.0d, (-9.3d));
        envelope4.init((double) 100L, (-4.6d), 13.4d, 5.3d);
        boolean boolean24 = envelope4.isEnvelopeNull();
        boolean boolean25 = envelope4.isEnvelopeNull();
        double double26 = envelope4.maxExtent();
        double double27 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 96.0d + "'", double11 == 96.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 96.0d + "'", double12 == 96.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.0d + "'", double13 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 104.6d + "'", double26 == 104.6d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 104.6d + "'", double27 == 104.6d);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getHeight();
        envelope4.init(102.0d, 0.0d, (double) 0, (double) ' ');
        double double15 = envelope4.getWidth();
        double double16 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 102.0d + "'", double15 == 102.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 32.0d + "'", double16 == 32.0d);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init((double) 100, (-100.0d), (double) '#', 5.0d);
        boolean boolean16 = envelope4.isEnvelopeNull();
        boolean boolean17 = envelope4.isEnvelopeNull();
        double double18 = envelope4.getWidth();
        double double19 = envelope4.getHeight();
        double double20 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 200.0d + "'", double18 == 200.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 30.0d + "'", double20 == 30.0d);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
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
        double double23 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass24 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 109.0d + "'", double15 == 109.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5.0d + "'", double16 == 5.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.6000000000000005d + "'", double22 == 0.6000000000000005d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 86.0d + "'", double23 == 86.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        jts.Envelope envelope4 = new jts.Envelope(17.6d, 198.5d, 80.3d, 134.0d);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        jts.Envelope envelope4 = new jts.Envelope((double) 0, 0.0d, 5.8d, (double) '#');
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getWidth();
        envelope4.init((-3.8d), 134.0d, 3.299999999999999d, 109.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 29.2d + "'", double5 == 29.2d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        jts.Envelope envelope4 = new jts.Envelope((double) (-7), (double) 4L, (-7.3d), (-100.0d));
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init((double) (-4L), 2.9000000000000004d, (double) 10.0f, (double) (-2L));
        boolean boolean11 = envelope4.isEnvelopeNull();
        double double12 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 12.0d + "'", double12 == 12.0d);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        jts.Envelope envelope4 = new jts.Envelope(3.9d, 58.7d, 87.3d, 7.900000000000006d);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        jts.Envelope envelope4 = new jts.Envelope(6.9d, 12.0d, 2.0d, 69.0d);
        double double5 = envelope4.getWidth();
        envelope4.init(22.4d, 114.4d, 105.4d, 91.9d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.1d + "'", double5 == 5.1d);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
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
        boolean boolean30 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 106.0d + "'", double13 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.getHeight();
        double double15 = envelope4.getWidth();
        double double16 = envelope4.maxExtent();
        double double17 = envelope4.getWidth();
        double double18 = envelope4.maxExtent();
        boolean boolean19 = envelope4.isEnvelopeNull();
        boolean boolean20 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 109.0d + "'", double15 == 109.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 109.0d + "'", double16 == 109.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 109.0d + "'", double17 == 109.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 109.0d + "'", double18 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 3.1d, 5.0d, 2.7d);
        double double5 = envelope4.getHeight();
        envelope4.init(30.0d, 17.0d, 17.0d, 1.7000000000000002d);
        double double11 = envelope4.maxExtent();
        envelope4.init(6.1d, (double) 2L, 7.300000000000001d, 89.7d);
        double double17 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3d + "'", double5 == 2.3d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 15.3d + "'", double11 == 15.3d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 82.4d + "'", double17 == 82.4d);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        jts.Envelope envelope4 = new jts.Envelope(83.00000000000001d, 56.5d, 86.1d, 26.700000000000003d);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init((double) 100, (-100.0d), (double) '#', 5.0d);
        envelope4.init((double) 1L, (double) (byte) 100, (double) (-8L), (double) (-1));
        boolean boolean21 = envelope4.isEnvelopeNull();
        double double22 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 99.0d + "'", double22 == 99.0d);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 3.1d, 5.0d, 2.7d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) 0, (double) 0.0f, (double) (-5), 0.0d);
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.maxExtent();
        envelope4.init(126.4d, (double) 5L, 46.2d, 35.5d);
        double double19 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3d + "'", double5 == 2.3d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 6.9d + "'", double6 == 6.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 5.0d + "'", double12 == 5.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.700000000000003d + "'", double19 == 10.700000000000003d);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        jts.Envelope envelope4 = new jts.Envelope(42.0d, (double) (short) 1, (double) 9, (double) (-100L));
        double double5 = envelope4.maxExtent();
        envelope4.init(66.0d, 110.0d, 90.0d, 94.0d);
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 109.0d + "'", double5 == 109.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 44.0d + "'", double11 == 44.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 44.0d + "'", double12 == 44.0d);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        double double13 = envelope4.getHeight();
        double double14 = envelope4.maxExtent();
        envelope4.init(8.4d, (double) '4', 90.0d, 2.9000000000000004d);
        boolean boolean20 = envelope4.isEnvelopeNull();
        double double21 = envelope4.maxExtent();
        double double22 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass23 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 87.1d + "'", double21 == 87.1d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 43.6d + "'", double22 == 43.6d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        jts.Envelope envelope4 = new jts.Envelope(92.3d, 107.0d, 36.0d, (double) (-3));
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 39.0d + "'", double6 == 39.0d);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        jts.Envelope envelope4 = new jts.Envelope(24.0d, (double) 2, 104.0d, (-7.3d));
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) 100.0f, (-2.1d), 0.0d, 20.2d);
        envelope4.init((double) 7, 2.9000000000000004d, 109.1d, 49.0d);
        envelope4.init((double) 100.0f, 98.4d, 79.2d, (double) 10L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 111.3d + "'", double5 == 111.3d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 111.3d + "'", double6 == 111.3d);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        jts.Envelope envelope4 = new jts.Envelope(68.7d, 6.299999999999997d, 74.6d, (double) 6L);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.getHeight();
        envelope4.init((double) 10.0f, (-4.6d), (double) (byte) 1, (double) 5);
        envelope4.init(109.0d, (double) (-1), 76.0d, 102.0d);
        double double16 = envelope4.getWidth();
        double double17 = envelope4.getWidth();
        double double18 = envelope4.getHeight();
        double double19 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 110.0d + "'", double16 == 110.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 110.0d + "'", double17 == 110.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 26.0d + "'", double18 == 26.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 26.0d + "'", double19 == 26.0d);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        envelope4.init((double) (byte) 1, (double) (-8L), (double) 8L, (double) (-4L));
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.maxExtent();
        boolean boolean13 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 12.0d + "'", double11 == 12.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 12.0d + "'", double12 == 12.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        jts.Envelope envelope4 = new jts.Envelope(78.6d, 107.5d, 96.2d, 33.7d);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        jts.Envelope envelope4 = new jts.Envelope(22.3d, 106.0d, 109.0d, (double) 2L);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 107.0d + "'", double5 == 107.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 107.0d + "'", double6 == 107.0d);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        jts.Envelope envelope4 = new jts.Envelope(92.7d, (double) (-10L), 1.2d, (double) (-8L));
        envelope4.init(95.2d, 8.7d, 1.7000000000000002d, 92.0d);
        double double10 = envelope4.maxExtent();
        envelope4.init((double) 9L, 104.1d, 7.699999999999999d, (double) 100);
        boolean boolean16 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 90.3d + "'", double10 == 90.3d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        boolean boolean16 = envelope4.isEnvelopeNull();
        envelope4.init((double) (-1), 2.3d, 96.0d, (double) 9);
        double double22 = envelope4.getWidth();
        double double23 = envelope4.getHeight();
        double double24 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 3.3d + "'", double22 == 3.3d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 87.0d + "'", double23 == 87.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 3.3d + "'", double24 == 3.3d);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        jts.Envelope envelope4 = new jts.Envelope(4.8d, (double) (short) 0, 7.1d, 0.0d);
        double double5 = envelope4.getHeight();
        envelope4.init(3.299999999999999d, (double) (-1), (double) '4', (double) (-10L));
        double double11 = envelope4.getHeight();
        envelope4.init(23.5d, 90.3d, 115.1d, (double) 100L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.1d + "'", double5 == 7.1d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 62.0d + "'", double11 == 62.0d);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        jts.Envelope envelope4 = new jts.Envelope(53.2d, 80.19999999999999d, 67.3d, 80.7d);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        jts.Envelope envelope4 = new jts.Envelope(100.0d, 10.5d, (double) 2, (-100.0d));
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.getWidth();
        boolean boolean9 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 102.0d + "'", double6 == 102.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 89.5d + "'", double7 == 89.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 89.5d + "'", double8 == 89.5d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) 10, (double) (byte) 1, (double) (byte) 0);
        double double5 = envelope4.maxExtent();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.getWidth();
        double double9 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass10 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        jts.Envelope envelope4 = new jts.Envelope(34.0d, 0.2999999999999998d, 13.0d, 10.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init(12.6d, 84.0d, 19.7d, 97.10000000000001d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.maxExtent();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getWidth();
        double double10 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 103.0d + "'", double6 == 103.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 103.0d + "'", double7 == 103.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 13.0d + "'", double9 == 13.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 103.0d + "'", double10 == 103.0d);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        jts.Envelope envelope4 = new jts.Envelope((double) (-4L), 6.1d, (double) 1.0f, 8.4d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.4d + "'", double6 == 7.4d);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        jts.Envelope envelope4 = new jts.Envelope(4.0d, 0.6000000000000005d, 43.6d, 132.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 88.4d + "'", double6 == 88.4d);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getHeight();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getWidth();
        double double10 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.4d + "'", double10 == 8.4d);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        jts.Envelope envelope4 = new jts.Envelope(18.4d, 34.4d, 85.1d, 0.0d);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        jts.Envelope envelope4 = new jts.Envelope(36.9d, (double) (-10L), 117.7d, (double) (-7L));
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getWidth();
        double double14 = envelope4.getWidth();
        envelope4.init(0.0d, 0.0d, 55.0d, (double) (byte) 0);
        boolean boolean20 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 104.0d + "'", double12 == 104.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 106.0d + "'", double13 == 106.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 106.0d + "'", double14 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) 10, (double) (byte) 1, (double) (byte) 0);
        double double5 = envelope4.maxExtent();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.maxExtent();
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 110.1d, 58.7d, 190.1d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 131.39999999999998d + "'", double5 == 131.39999999999998d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 131.39999999999998d + "'", double6 == 131.39999999999998d);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        jts.Envelope envelope4 = new jts.Envelope(90.0d, (double) (-5L), 0.0d, 101.8d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 95.0d + "'", double5 == 95.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 95.0d + "'", double6 == 95.0d);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
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
        double double22 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 8.0d + "'", double21 == 8.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 8.0d + "'", double22 == 8.0d);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        jts.Envelope envelope4 = new jts.Envelope(1.7000000000000002d, 13.0d, (double) 1, (double) 0);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        envelope4.init(104.1d, 14.700000000000003d, 43.6d, 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 11.3d + "'", double6 == 11.3d);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
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
        double double29 = envelope4.getHeight();
        double double30 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 34.0d + "'", double26 == 34.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 34.0d + "'", double27 == 34.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 55.0d + "'", double28 == 55.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 34.0d + "'", double29 == 34.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 34.0d + "'", double30 == 34.0d);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 102.1d, 19.4d, 190.1d);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) 10, (double) (byte) 1, (double) (byte) 0);
        double double5 = envelope4.maxExtent();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.getWidth();
        boolean boolean9 = envelope4.isEnvelopeNull();
        double double10 = envelope4.getHeight();
        double double11 = envelope4.getWidth();
        double double12 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass13 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        envelope4.init((double) (byte) 1, (double) (-8L), (double) 8L, (double) (-4L));
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getHeight();
        double double14 = envelope4.maxExtent();
        double double15 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 12.0d + "'", double11 == 12.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 12.0d + "'", double12 == 12.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 12.0d + "'", double13 == 12.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 12.0d + "'", double14 == 12.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 12.0d + "'", double15 == 12.0d);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.maxExtent();
        double double9 = envelope4.getWidth();
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.getHeight();
        double double14 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.4d + "'", double10 == 8.4d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.4d + "'", double11 == 8.4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.4d + "'", double12 == 8.4d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.4d + "'", double13 == 8.4d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.4d + "'", double14 == 8.4d);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        jts.Envelope envelope4 = new jts.Envelope((double) (-8L), 10.0d, (double) (-6L), (double) 8);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 14.0d + "'", double6 == 14.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 14.0d + "'", double7 == 14.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 14.0d + "'", double8 == 14.0d);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 3.0d, (double) 100.0f, 7.1d);
        double double5 = envelope4.maxExtent();
        envelope4.init(17.0d, 41.3d, 14.3d, 77.7d);
        envelope4.init(112.3d, 2.8d, 90.49999999999999d, 80.7d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 92.9d + "'", double5 == 92.9d);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        jts.Envelope envelope4 = new jts.Envelope(87.0d, (double) (-10), 69.0d, 36.0d);
        double double5 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.getHeight();
        envelope4.init((double) 10.0f, (-4.6d), (double) (byte) 1, (double) 5);
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getHeight();
        boolean boolean13 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 14.6d + "'", double11 == 14.6d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.0d + "'", double12 == 4.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        jts.Envelope envelope4 = new jts.Envelope(92.0d, 12.0d, (double) (-3), (double) (-4));
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 80.0d + "'", double5 == 80.0d);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getHeight();
        double double10 = envelope4.getWidth();
        boolean boolean11 = envelope4.isEnvelopeNull();
        double double12 = envelope4.getWidth();
        envelope4.init((double) 8L, 68.7d, 14.6d, 44.0d);
        envelope4.init(31.0d, 73.0d, 112.3d, 4.3d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.4d + "'", double9 == 8.4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.0d + "'", double10 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.0d + "'", double12 == 8.0d);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        jts.Envelope envelope4 = new jts.Envelope((double) 7, (double) 10.0f, (double) 4L, (double) 0L);
        envelope4.init((double) 10, (double) 8, (double) 8, (-1.2d));
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass12 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.0d + "'", double10 == 2.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 9.2d + "'", double11 == 9.2d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        envelope4.init((double) 1, 200.0d, (-7.3d), 87.0d);
        double double13 = envelope4.getWidth();
        double double14 = envelope4.getWidth();
        double double15 = envelope4.getHeight();
        double double16 = envelope4.maxExtent();
        double double17 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 199.0d + "'", double13 == 199.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 199.0d + "'", double14 == 199.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 94.3d + "'", double15 == 94.3d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 199.0d + "'", double16 == 199.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 199.0d + "'", double17 == 199.0d);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        envelope4.init(65.0d, (double) 100.0f, (-7.3d), (double) 5L);
        double double14 = envelope4.getHeight();
        double double15 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 12.3d + "'", double14 == 12.3d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        jts.Envelope envelope4 = new jts.Envelope(6.9d, 6.1d, 92.2d, 51.0d);
        envelope4.init(76.0d, 3.8000000000000007d, 148.0d, 91.0d);
        boolean boolean10 = envelope4.isEnvelopeNull();
        boolean boolean11 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        jts.Envelope envelope4 = new jts.Envelope((double) 2, (double) 9L, 4.8d, (double) (-1));
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.0d + "'", double5 == 7.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.0d + "'", double6 == 7.0d);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getWidth();
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.4d + "'", double10 == 8.4d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.4d + "'", double11 == 8.4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.0d + "'", double12 == 8.0d);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        jts.Envelope envelope4 = new jts.Envelope(7.3d, 0.0d, 26.0d, 36.0d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
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
        envelope4.init((double) (-2L), (double) (-1), 12.7d, 111.9d);
        double double23 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 104.0d + "'", double12 == 104.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 106.0d + "'", double16 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        jts.Envelope envelope4 = new jts.Envelope(78.8d, 18.7d, 66.0d, 74.3d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 60.099999999999994d + "'", double5 == 60.099999999999994d);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        jts.Envelope envelope4 = new jts.Envelope(92.7d, (double) (-10L), 1.2d, (double) (-8L));
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getWidth();
        envelope4.init(10.4d, 0.0d, 94.0d, 5.1d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.7d + "'", double5 == 102.7d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.2d + "'", double6 == 9.2d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 102.7d + "'", double7 == 102.7d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 102.7d + "'", double8 == 102.7d);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        jts.Envelope envelope4 = new jts.Envelope((-1.0d), 20.799999999999997d, 1.7000000000000002d, 10.600000000000009d);
        envelope4.init(7.7d, 0.0d, (double) (-7), 9.2d);
        double double10 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 7.7d + "'", double10 == 7.7d);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getWidth();
        envelope4.init(9.2d, (double) 100, (double) 0.0f, 92.0d);
        envelope4.init((-3.8d), (double) (-1L), (double) 100.0f, (double) (-1));
        double double19 = envelope4.getHeight();
        double double20 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 101.0d + "'", double19 == 101.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 101.0d + "'", double20 == 101.0d);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        jts.Envelope envelope4 = new jts.Envelope((-100.0d), 46.0d, 4.4d, 105.7d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.3d + "'", double5 == 101.3d);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 54.2d, 11.799999999999997d, 13.200000000000003d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        jts.Envelope envelope4 = new jts.Envelope(58.0d, 198.5d, 3.700000000000003d, 18.70000000000001d);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        double double16 = envelope4.getWidth();
        double double17 = envelope4.maxExtent();
        double double18 = envelope4.maxExtent();
        double double19 = envelope4.getHeight();
        envelope4.init(19.7d, 105.7d, 34.4d, 107.8d);
        java.lang.Class<?> wildcardClass25 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.0d + "'", double18 == 8.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 8.0d + "'", double19 == 8.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getWidth();
        envelope4.init(9.9d, 89.5d, 85.3d, 107.5d);
        envelope4.init(0.40000000000000036d, 58.7d, 49.099999999999994d, 18.9d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        envelope4.init(6.9d, (double) (byte) 0, (double) (byte) 1, (double) (-1.0f));
        double double18 = envelope4.getWidth();
        double double19 = envelope4.maxExtent();
        double double20 = envelope4.getHeight();
        double double21 = envelope4.getHeight();
        double double22 = envelope4.getHeight();
        envelope4.init(6.9d, 1.5d, 83.7d, 111.9d);
        envelope4.init(80.1d, 63.400000000000006d, (double) 100.0f, 47.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 6.9d + "'", double19 == 6.9d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.0d + "'", double20 == 2.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2.0d + "'", double21 == 2.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.0d + "'", double22 == 2.0d);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        jts.Envelope envelope4 = new jts.Envelope((double) '#', (double) (short) 100, (double) (short) -1, (double) 1L);
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init(114.1d, 14.6d, 77.89999999999999d, 35.599999999999994d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 65.0d + "'", double5 == 65.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
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
        envelope4.init((double) 7L, (double) 6, (double) (-2), 90.3d);
        boolean boolean27 = envelope4.isEnvelopeNull();
        boolean boolean28 = envelope4.isEnvelopeNull();
        double double29 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 6.9d + "'", double21 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 92.3d + "'", double29 == 92.3d);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        jts.Envelope envelope4 = new jts.Envelope(29.299999999999997d, 122.6d, 2.0999999999999996d, 11.8d);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (short) 0, (-9.3d), (double) (-1L));
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getHeight();
        boolean boolean7 = envelope4.isEnvelopeNull();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.0d + "'", double5 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.3d + "'", double6 == 8.3d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.3d + "'", double8 == 8.3d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 9.0d + "'", double9 == 9.0d);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        jts.Envelope envelope4 = new jts.Envelope(2.9000000000000004d, 103.0d, 132.0d, 61.9d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 70.1d + "'", double6 == 70.1d);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        jts.Envelope envelope4 = new jts.Envelope(10.100000000000001d, (double) 0, 44.5d, (double) 100L);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        jts.Envelope envelope4 = new jts.Envelope(5.0d, 5.3d, (double) (-100L), (double) (-2L));
        envelope4.init((double) (byte) 100, 10.5d, (double) (-9L), 8.4d);
        envelope4.init(6.9d, (double) (-3L), (double) 7L, (double) (-6L));
        double double15 = envelope4.getHeight();
        double double16 = envelope4.getWidth();
        double double17 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 13.0d + "'", double15 == 13.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9.9d + "'", double16 == 9.9d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 13.0d + "'", double17 == 13.0d);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        jts.Envelope envelope4 = new jts.Envelope(42.0d, (double) (short) 1, (double) 9, (double) (-100L));
        envelope4.init(38.7d, 8.1d, 105.4d, 102.1d);
        double double10 = envelope4.getWidth();
        envelope4.init(77.9d, 105.0d, 77.5d, 86.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.6d + "'", double10 == 30.6d);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getWidth();
        envelope4.init(13.4d, 11.9d, 2.3d, (double) (-4));
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass13 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 13.0d + "'", double5 == 13.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 6.3d + "'", double11 == 6.3d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.3d + "'", double12 == 6.3d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        jts.Envelope envelope4 = new jts.Envelope(4.400000000000006d, 3.299999999999997d, 0.0d, 17.7d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 17.7d + "'", double5 == 17.7d);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) (-1L), (double) (-1.0f), (double) 0L, 100.0d);
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.maxExtent();
        double double14 = envelope4.getWidth();
        double double15 = envelope4.getHeight();
        envelope4.init(24.0d, (double) 0.0f, (-4.6d), 102.7d);
        double double21 = envelope4.maxExtent();
        envelope4.init(1.0999999999999996d, 19.7d, 90.8d, 84.60000000000001d);
        double double27 = envelope4.getHeight();
        double double28 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 107.3d + "'", double21 == 107.3d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 6.199999999999989d + "'", double27 == 6.199999999999989d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 6.199999999999989d + "'", double28 == 6.199999999999989d);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        jts.Envelope envelope4 = new jts.Envelope(21.1d, 67.3d, 89.7d, 72.9d);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        jts.Envelope envelope4 = new jts.Envelope(92.8d, (double) 10.0f, 98.2d, 22.3d);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.getHeight();
        envelope4.init((double) 10.0f, (-4.6d), (double) (byte) 1, (double) 5);
        double double11 = envelope4.getWidth();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.getHeight();
        double double14 = envelope4.maxExtent();
        boolean boolean15 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 14.6d + "'", double11 == 14.6d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.0d + "'", double13 == 4.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 14.6d + "'", double14 == 14.6d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        jts.Envelope envelope4 = new jts.Envelope((double) '4', (double) 10, (double) 5, (double) 1L);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 42.0d + "'", double6 == 42.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 42.0d + "'", double7 == 42.0d);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, (-10.5d), 23.5d, 80.7d);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        jts.Envelope envelope4 = new jts.Envelope((-8.7d), 0.0d, (double) (short) 10, 96.0d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.7d + "'", double5 == 8.7d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 86.0d + "'", double6 == 86.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 86.0d + "'", double7 == 86.0d);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        jts.Envelope envelope4 = new jts.Envelope((double) 'a', (double) (byte) 1, 2.3d, (double) 0L);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getWidth();
        envelope4.init(26.0d, (double) '4', (double) (-3), 113.0d);
        java.lang.Class<?> wildcardClass13 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3d + "'", double5 == 2.3d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 96.0d + "'", double7 == 96.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 3.1d, 5.0d, 2.7d);
        double double5 = envelope4.getHeight();
        envelope4.init(30.0d, 17.0d, 17.0d, 1.7000000000000002d);
        double double11 = envelope4.maxExtent();
        envelope4.init(6.1d, (double) 2L, 7.300000000000001d, 89.7d);
        envelope4.init(39.4d, 25.39999999999999d, 17.200000000000003d, 3.8000000000000007d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3d + "'", double5 == 2.3d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 15.3d + "'", double11 == 15.3d);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        boolean boolean16 = envelope4.isEnvelopeNull();
        envelope4.init(85.5d, (-8.7d), (double) (short) -1, 3.7d);
        double double22 = envelope4.maxExtent();
        envelope4.init(0.2999999999999998d, 76.0d, 62.0d, 88.3d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 94.2d + "'", double22 == 94.2d);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        jts.Envelope envelope4 = new jts.Envelope(64.0d, 117.4d, 11.600000000000001d, 90.6d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 53.400000000000006d + "'", double5 == 53.400000000000006d);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        envelope4.init(30.0d, 11.9d, (double) 100.0f, (double) 10.0f);
        double double13 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 13.0d + "'", double5 == 13.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 103.0d + "'", double7 == 103.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 18.1d + "'", double13 == 18.1d);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        jts.Envelope envelope4 = new jts.Envelope((double) (-2), (-9.3d), 87.1d, 117.7d);
        envelope4.init(101.39999999999999d, 8.0d, 90.80000000000001d, 22.4d);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getWidth();
        boolean boolean9 = envelope4.isEnvelopeNull();
        double double10 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.4d + "'", double10 == 8.4d);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        jts.Envelope envelope4 = new jts.Envelope((double) 7, (double) 10.0f, (double) 4L, (double) 0L);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getHeight();
        envelope4.init(37.1d, 1.0999999999999996d, (double) (-1), 81.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.0d + "'", double6 == 3.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        jts.Envelope envelope4 = new jts.Envelope(1.5999999999999996d, 8.3d, 193.0d, 98.7d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 94.3d + "'", double5 == 94.3d);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        jts.Envelope envelope4 = new jts.Envelope(1.7000000000000004d, (double) (short) 10, 4.0d, (-5.4d));
        double double5 = envelope4.getWidth();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.299999999999999d + "'", double5 == 8.299999999999999d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.4d + "'", double6 == 9.4d);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        jts.Envelope envelope4 = new jts.Envelope(4.199999999999997d, (double) 6, 11.899999999999999d, 75.5d);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 10, 10.5d, (double) (-2), (double) 100.0f);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        jts.Envelope envelope4 = new jts.Envelope(6.0d, 1.0999999999999996d, 81.5d, 45.0d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.9d + "'", double5 == 4.9d);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        envelope4.init((double) (-1L), (double) (-7L), 106.0d, (double) 10);
        boolean boolean18 = envelope4.isEnvelopeNull();
        double double19 = envelope4.maxExtent();
        double double20 = envelope4.getWidth();
        double double21 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 96.0d + "'", double19 == 96.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 6.0d + "'", double20 == 6.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 6.0d + "'", double21 == 6.0d);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        jts.Envelope envelope4 = new jts.Envelope((double) (-10), 1.2999999999999998d, 10.4d, 89.2d);
        double double5 = envelope4.maxExtent();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 78.8d + "'", double5 == 78.8d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        jts.Envelope envelope4 = new jts.Envelope((double) 1.0f, 9.0d, (double) (-10L), (-100.0d));
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.getHeight();
        envelope4.init(0.0d, 113.39999999999999d, 94.2d, 12.7d);
        double double14 = envelope4.getHeight();
        boolean boolean15 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 90.0d + "'", double5 == 90.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 81.5d + "'", double14 == 81.5d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        jts.Envelope envelope4 = new jts.Envelope(35.1d, 102.0d, 189.5d, 19.8d);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        jts.Envelope envelope4 = new jts.Envelope(58.0d, 92.7d, 0.0d, 1.7000000000000002d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 34.7d + "'", double5 == 34.7d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7000000000000002d + "'", double6 == 1.7000000000000002d);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        jts.Envelope envelope4 = new jts.Envelope((double) (-8L), 10.0d, (double) (-6L), (double) 8);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getHeight();
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getWidth();
        envelope4.init(26.0d, 74.69999999999999d, (-1.0d), 92.9d);
        envelope4.init(203.5d, 112.1d, 94.60000000000001d, 112.1d);
        double double22 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.0d + "'", double7 == 18.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 14.0d + "'", double8 == 14.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 14.0d + "'", double9 == 14.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 18.0d + "'", double10 == 18.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 18.0d + "'", double11 == 18.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 17.499999999999986d + "'", double22 == 17.499999999999986d);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        jts.Envelope envelope4 = new jts.Envelope((double) ' ', 5.8d, 86.5d, 102.7d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getHeight();
        boolean boolean7 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 16.200000000000003d + "'", double6 == 16.200000000000003d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        jts.Envelope envelope4 = new jts.Envelope(92.2d, 94.1d, 66.0d, 84.5d);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 10, (double) 100, (double) 1, (double) (byte) 100);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 99.0d + "'", double6 == 99.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 99.0d + "'", double8 == 99.0d);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getHeight();
        envelope4.init((double) 8L, 100.2d, 35.0d, 0.40000000000000036d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 3.1d, 5.0d, 2.7d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) 0, (double) 0.0f, (double) (-5), 0.0d);
        boolean boolean12 = envelope4.isEnvelopeNull();
        envelope4.init(155.4d, 39.400000000000006d, 5.4d, 199.0d);
        double double18 = envelope4.getWidth();
        double double19 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3d + "'", double5 == 2.3d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 6.9d + "'", double6 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 116.0d + "'", double18 == 116.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 116.0d + "'", double19 == 116.0d);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        jts.Envelope envelope4 = new jts.Envelope(1.5999999999999996d, (double) 1L, 100.0d, (double) (-9L));
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init((double) 7, (double) 0.0f, 98.2d, 89.7d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        jts.Envelope envelope4 = new jts.Envelope(110.0d, (double) 1, 11.9d, 24.0d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 109.0d + "'", double5 == 109.0d);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 0.6999999999999993d, (double) (-7L), 15.700000000000001d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 22.700000000000003d + "'", double5 == 22.700000000000003d);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        envelope4.init(65.0d, (double) 100.0f, (-7.3d), (double) 5L);
        double double14 = envelope4.getHeight();
        double double15 = envelope4.maxExtent();
        double double16 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 12.3d + "'", double14 == 12.3d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 12.3d + "'", double16 == 12.3d);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        jts.Envelope envelope4 = new jts.Envelope(31.0d, (double) 100, 20.0d, 92.9d);
        double double5 = envelope4.maxExtent();
        envelope4.init(11.8d, 0.0d, (double) 8L, 204.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 72.9d + "'", double5 == 72.9d);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        jts.Envelope envelope4 = new jts.Envelope((double) 8L, 9.0d, 90.0d, (double) (-3L));
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 93.0d + "'", double5 == 93.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        jts.Envelope envelope4 = new jts.Envelope((double) '4', (double) 10, (double) 5, (double) 1L);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getHeight();
        boolean boolean7 = envelope4.isEnvelopeNull();
        double double8 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 42.0d + "'", double8 == 42.0d);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.getWidth();
        double double15 = envelope4.maxExtent();
        envelope4.init(105.0d, 8.299999999999999d, 0.9000000000000004d, 113.0d);
        double double21 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 109.0d + "'", double15 == 109.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 112.1d + "'", double21 == 112.1d);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        jts.Envelope envelope4 = new jts.Envelope((double) 1.0f, 9.0d, (double) (-10L), (-100.0d));
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        jts.Envelope envelope4 = new jts.Envelope(90.0d, 102.7d, 67.3d, (double) (-3L));
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        jts.Envelope envelope4 = new jts.Envelope((double) 2, (double) 9L, 4.8d, (double) (-1));
        double double5 = envelope4.getWidth();
        envelope4.init(2.0999999999999943d, 46.2d, (double) 1L, 96.8d);
        envelope4.init((double) (-1.0f), (double) (-6), 80.3d, 68.6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.0d + "'", double5 == 7.0d);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        jts.Envelope envelope4 = new jts.Envelope(202.7d, (double) 1, 2.1d, 0.0d);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getWidth();
        envelope4.init(0.0d, (double) 10, (double) 0L, (double) 0.0f);
        double double15 = envelope4.getHeight();
        envelope4.init(0.0d, 25.1d, 14.9d, 194.0d);
        java.lang.Class<?> wildcardClass21 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
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
        double double23 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 102.0d + "'", double15 == 102.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 6.9d + "'", double22 == 6.9d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2.8d + "'", double23 == 2.8d);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        jts.Envelope envelope4 = new jts.Envelope((double) 'a', (double) (byte) 1, 2.3d, (double) 0L);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getWidth();
        envelope4.init(100.0d, (double) 5L, 1.799999999999999d, (-7.3d));
        double double13 = envelope4.getWidth();
        boolean boolean14 = envelope4.isEnvelopeNull();
        boolean boolean15 = envelope4.isEnvelopeNull();
        double double16 = envelope4.getWidth();
        envelope4.init(0.0d, 196.1d, (double) 1, 30.6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3d + "'", double5 == 2.3d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 96.0d + "'", double7 == 96.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 95.0d + "'", double13 == 95.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 95.0d + "'", double16 == 95.0d);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, 2.5999999999999996d, 95.0d, 10.5d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.getWidth();
        double double9 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 84.5d + "'", double5 == 84.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 84.5d + "'", double6 == 84.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.4d + "'", double7 == 5.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.4d + "'", double8 == 5.4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 84.5d + "'", double9 == 84.5d);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getHeight();
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.getHeight();
        double double15 = envelope4.maxExtent();
        double double16 = envelope4.maxExtent();
        double double17 = envelope4.getWidth();
        boolean boolean18 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 104.0d + "'", double12 == 104.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 104.0d + "'", double14 == 104.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 106.0d + "'", double15 == 106.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 106.0d + "'", double16 == 106.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 106.0d + "'", double17 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.getHeight();
        boolean boolean9 = envelope4.isEnvelopeNull();
        double double10 = envelope4.getHeight();
        double double11 = envelope4.getWidth();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getWidth();
        double double14 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.4d + "'", double10 == 8.4d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.0d + "'", double11 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.4d + "'", double12 == 8.4d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.0d + "'", double13 == 8.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.4d + "'", double14 == 8.4d);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        jts.Envelope envelope4 = new jts.Envelope((double) (-8L), 10.0d, (double) (-6L), (double) 8);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getHeight();
        double double10 = envelope4.getWidth();
        envelope4.init(18.0d, 11.299999999999983d, 12.6d, 76.0d);
        boolean boolean16 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.0d + "'", double7 == 18.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 14.0d + "'", double8 == 14.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 14.0d + "'", double9 == 14.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 18.0d + "'", double10 == 18.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        jts.Envelope envelope4 = new jts.Envelope((-8.7d), (double) 100, (double) 100L, 9.100000000000003d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 108.7d + "'", double5 == 108.7d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 108.7d + "'", double6 == 108.7d);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 1, (double) 0.0f, (double) 6, (double) 3L);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        boolean boolean7 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.0d + "'", double5 == 3.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.0d + "'", double6 == 3.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        jts.Envelope envelope4 = new jts.Envelope(7.0d, 75.5d, 103.7d, 107.5d);
        envelope4.init(97.0d, (double) 8L, (double) 6L, 10.200000000000003d);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        jts.Envelope envelope4 = new jts.Envelope(91.9d, 105.0d, 88.0d, 0.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getWidth();
        double double10 = envelope4.maxExtent();
        boolean boolean11 = envelope4.isEnvelopeNull();
        double double12 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.4d + "'", double10 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.4d + "'", double12 == 8.4d);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        jts.Envelope envelope4 = new jts.Envelope(77.5d, (double) (-8L), 21.1d, (double) (short) 0);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        jts.Envelope envelope4 = new jts.Envelope((double) 8, 13.0d, 22.3d, (double) 10L);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 12.3d + "'", double5 == 12.3d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 12.3d + "'", double6 == 12.3d);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
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
        boolean boolean18 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 109.0d + "'", double15 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 5.0d + "'", double17 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        jts.Envelope envelope4 = new jts.Envelope(22.5d, 107.5d, (-5.4d), 90.80000000000001d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 85.0d + "'", double5 == 85.0d);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        jts.Envelope envelope4 = new jts.Envelope((double) 2, (double) 9L, 4.8d, (double) (-1));
        double double5 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.0d + "'", double5 == 7.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getWidth();
        double double14 = envelope4.maxExtent();
        double double15 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 96.0d + "'", double11 == 96.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 96.0d + "'", double12 == 96.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.0d + "'", double13 == 8.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 96.0d + "'", double14 == 96.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 96.0d + "'", double15 == 96.0d);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        jts.Envelope envelope4 = new jts.Envelope(1.2d, (double) 10L, 0.0d, (double) 4);
        envelope4.init(1.3000000000000025d, 13.6d, (double) 0, 116.7d);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.getHeight();
        envelope4.init((double) 10.0f, (-4.6d), (double) (byte) 1, (double) 5);
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 14.6d + "'", double11 == 14.6d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.0d + "'", double13 == 4.0d);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        jts.Envelope envelope4 = new jts.Envelope((double) 100, 100.0d, (double) 0.0f, (double) 0L);
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init(0.0d, 9.100000000000003d, 0.0d, 2.299999999999997d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        jts.Envelope envelope4 = new jts.Envelope((-1.0d), 20.799999999999997d, 1.7000000000000002d, 10.600000000000009d);
        envelope4.init(7.7d, 0.0d, (double) (-7), 9.2d);
        envelope4.init(101.0d, 43.6d, 114.1d, 200.0d);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        jts.Envelope envelope4 = new jts.Envelope((double) 7, 110.0d, (double) 7L, 1.2999999999999998d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 4.800000000000001d, (-6.9d), 3.4000000000000004d);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        jts.Envelope envelope4 = new jts.Envelope(92.7d, (double) (-1L), (double) 7, 31.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        boolean boolean7 = envelope4.isEnvelopeNull();
        envelope4.init((-10.5d), 5.8d, 5.3d, (double) (-9L));
        double double13 = envelope4.getHeight();
        double double14 = envelope4.maxExtent();
        envelope4.init(131.0d, 44.0d, 193.6d, (double) (-5));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 24.0d + "'", double5 == 24.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 93.7d + "'", double6 == 93.7d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 14.3d + "'", double13 == 14.3d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 16.3d + "'", double14 == 16.3d);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        jts.Envelope envelope4 = new jts.Envelope(89.5d, (double) (byte) 100, 2.9000000000000004d, (double) (-1));
        envelope4.init(2.7d, (double) 1L, 103.0d, 100.0d);
        double double10 = envelope4.getWidth();
        envelope4.init(1.7999999999999998d, (double) (-9L), 0.0d, 3.7d);
        double double16 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7000000000000002d + "'", double10 == 1.7000000000000002d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.8d + "'", double16 == 10.8d);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        jts.Envelope envelope4 = new jts.Envelope(92.7d, (double) (-10L), 1.2d, (double) (-8L));
        envelope4.init(95.2d, 8.7d, 1.7000000000000002d, 92.0d);
        double double10 = envelope4.getHeight();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.maxExtent();
        envelope4.init(90.19999999999999d, 79.3d, 88.3d, (double) 8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 90.3d + "'", double10 == 90.3d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 90.3d + "'", double11 == 90.3d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 86.5d + "'", double12 == 86.5d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 90.3d + "'", double14 == 90.3d);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 1, 155.4d, 3.700000000000003d, 5.3d);
        envelope4.init(128.0d, 56.1d, 56.900000000000006d, 32.0d);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        jts.Envelope envelope4 = new jts.Envelope(2.5999999999999996d, 20.799999999999997d, (double) (-1), (-1.0d));
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 18.199999999999996d + "'", double5 == 18.199999999999996d);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        envelope4.init((double) (-1L), (double) (-7L), 106.0d, (double) 10);
        double double18 = envelope4.maxExtent();
        envelope4.init(15.3d, 103.7d, 94.3d, 90.89999999999999d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 96.0d + "'", double18 == 96.0d);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        jts.Envelope envelope4 = new jts.Envelope(11.9d, (double) (byte) 0, 33.7d, 1.7000000000000002d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 11.9d + "'", double5 == 11.9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.getHeight();
        double double15 = envelope4.maxExtent();
        boolean boolean16 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 109.0d + "'", double15 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        jts.Envelope envelope4 = new jts.Envelope(13.899999999999991d, 66.0d, 0.0d, 48.0d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        jts.Envelope envelope4 = new jts.Envelope(5.3d, (double) 9L, 3.1d, 10.4d);
        envelope4.init((-10.5d), 46.0d, 14.9d, 11.8d);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        jts.Envelope envelope4 = new jts.Envelope((double) (-8L), 10.0d, (double) (-6L), (double) 8);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getHeight();
        envelope4.init(1.799999999999999d, 12.6d, 102.7d, 18.0d);
        boolean boolean15 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.0d + "'", double7 == 18.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 14.0d + "'", double8 == 14.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 14.0d + "'", double9 == 14.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        boolean boolean8 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass9 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        jts.Envelope envelope4 = new jts.Envelope((double) 10L, 18.0d, (double) (-8), 13.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getWidth();
        envelope4.init(58.7d, (double) 100.0f, 111.3d, 0.9000000000000004d);
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 21.0d + "'", double5 == 21.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 110.39999999999999d + "'", double12 == 110.39999999999999d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 41.3d + "'", double13 == 41.3d);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        jts.Envelope envelope4 = new jts.Envelope(114.4d, 109.0d, 130.2d, 4.4d);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        envelope4.init((double) 1, 200.0d, (-7.3d), 87.0d);
        double double13 = envelope4.getHeight();
        double double14 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 94.3d + "'", double13 == 94.3d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 199.0d + "'", double14 == 199.0d);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init((double) (short) 0, 2.7d, (double) (-1.0f), (double) 100L);
        double double12 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass13 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 101.0d + "'", double12 == 101.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        jts.Envelope envelope4 = new jts.Envelope(42.0d, (double) (short) 1, (double) 9, (double) (-100L));
        double double5 = envelope4.getWidth();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init(87.1d, 100.0d, 102.3d, 92.3d);
        boolean boolean13 = envelope4.isEnvelopeNull();
        boolean boolean14 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 41.0d + "'", double5 == 41.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 109.0d + "'", double6 == 109.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 41.0d + "'", double7 == 41.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        jts.Envelope envelope4 = new jts.Envelope(34.0d, 4.1d, (-3.8d), (-4.6d));
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 29.9d + "'", double5 == 29.9d);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        jts.Envelope envelope4 = new jts.Envelope(92.7d, (double) (-10L), 1.2d, (double) (-8L));
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.7d + "'", double5 == 102.7d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.2d + "'", double6 == 9.2d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.2d + "'", double7 == 9.2d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 102.7d + "'", double8 == 102.7d);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        jts.Envelope envelope4 = new jts.Envelope((double) (-6L), 1.2000000000000002d, 41.2d, 0.9000000000000004d);
        double double5 = envelope4.getHeight();
        envelope4.init(28.100000000000016d, 198.1d, (double) 100, 32.099999999999994d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.300000000000004d + "'", double5 == 40.300000000000004d);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        jts.Envelope envelope4 = new jts.Envelope(7.899999999999999d, 73.0d, 22.5d, 105.4d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init((double) (short) 0, 2.7d, (double) (-1.0f), (double) 100L);
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.getHeight();
        boolean boolean14 = envelope4.isEnvelopeNull();
        double double15 = envelope4.getWidth();
        double double16 = envelope4.maxExtent();
        boolean boolean17 = envelope4.isEnvelopeNull();
        envelope4.init(55.3d, 103.0d, 2.8d, (double) (-2));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 101.0d + "'", double13 == 101.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2.7d + "'", double15 == 2.7d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 101.0d + "'", double16 == 101.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, (double) 0L, (double) 3L, (double) 1);
        envelope4.init((-2.1d), (double) (-6), 95.2d, (double) 5);
        envelope4.init(2.3d, 3.3d, 77.5d, 199.0d);
        envelope4.init(8.799999999999999d, 5.3d, 76.5d, 106.9d);
        double double20 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 30.400000000000006d + "'", double20 == 30.400000000000006d);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        jts.Envelope envelope4 = new jts.Envelope((-8.7d), (-6.9d), (-1.0d), (double) (-10));
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.799999999999999d + "'", double5 == 1.799999999999999d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.0d + "'", double6 == 9.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.799999999999999d + "'", double7 == 1.799999999999999d);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
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
        envelope4.init((double) (-1), 43.0d, 88.7d, 4.6d);
        double double28 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass29 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 102.0d + "'", double15 == 102.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 84.10000000000001d + "'", double28 == 84.10000000000001d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getHeight();
        boolean boolean7 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.4d + "'", double6 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        jts.Envelope envelope4 = new jts.Envelope(12.7d, 38.0d, 100.1d, 122.6d);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        jts.Envelope envelope4 = new jts.Envelope((-3.8d), 92.0d, 31.099999999999994d, 100.0d);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        jts.Envelope envelope4 = new jts.Envelope(8.7d, 92.7d, 15.0d, 7.1d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        boolean boolean8 = envelope4.isEnvelopeNull();
        envelope4.init((double) (-5L), 73.0d, 86.7d, 0.0d);
        double double14 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 84.0d + "'", double6 == 84.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 84.0d + "'", double7 == 84.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 78.0d + "'", double14 == 78.0d);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        jts.Envelope envelope4 = new jts.Envelope(86.5d, 42.0d, 24.0d, 69.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 44.5d + "'", double6 == 44.5d);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init(1.5d, 15.4d, 87.0d, 8.3d);
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.getWidth();
        envelope4.init(189.5d, 89.7d, 97.80000000000001d, (double) 1L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 13.9d + "'", double13 == 13.9d);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        jts.Envelope envelope4 = new jts.Envelope((double) 2L, 15.0d, 199.0d, 101.8d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getWidth();
        boolean boolean7 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 13.0d + "'", double5 == 13.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 13.0d + "'", double6 == 13.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        jts.Envelope envelope4 = new jts.Envelope((-10.5d), 11.1d, 36.0d, 6.1d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 29.9d + "'", double5 == 29.9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 29.9d + "'", double6 == 29.9d);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        jts.Envelope envelope4 = new jts.Envelope(7.0d, 101.0d, 42.0d, 102.0d);
        double double5 = envelope4.getWidth();
        envelope4.init(16.0d, 14.0d, (double) 1L, 79.7d);
        java.lang.Class<?> wildcardClass11 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 94.0d + "'", double5 == 94.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        jts.Envelope envelope4 = new jts.Envelope(117.4d, 117.7d, 88.5d, (double) 1);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), (double) (short) 0, 1.0d, (double) 10);
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        envelope4.init(49.0d, 58.7d, 2.0d, 14.200000000000003d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.0d + "'", double7 == 9.0d);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        jts.Envelope envelope4 = new jts.Envelope(1.7000000000000002d, 13.0d, (double) 1, (double) 0);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        envelope4.init(86.0d, 0.0d, 41.0d, 3.3d);
        double double12 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 11.3d + "'", double6 == 11.3d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 37.7d + "'", double12 == 37.7d);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        jts.Envelope envelope4 = new jts.Envelope(60.0d, (double) 6, 85.4d, 1.299999999999999d);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        jts.Envelope envelope4 = new jts.Envelope((double) (-7), (double) 4L, (-7.3d), (-100.0d));
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init((double) (-1.0f), (double) 6, (double) (-5), 12.6d);
        envelope4.init(13.4d, 42.0d, (double) (-2L), 10.4d);
        boolean boolean16 = envelope4.isEnvelopeNull();
        double double17 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 12.4d + "'", double17 == 12.4d);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        jts.Envelope envelope4 = new jts.Envelope(130.2d, 85.5d, 90.8d, 102.5d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 11.700000000000003d + "'", double5 == 11.700000000000003d);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        jts.Envelope envelope4 = new jts.Envelope((-8.7d), 90.89999999999999d, 1.9d, 80.2d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 99.6d + "'", double5 == 99.6d);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        jts.Envelope envelope4 = new jts.Envelope(100.2d, 111.3d, 1.3000000000000025d, 92.1d);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        jts.Envelope envelope4 = new jts.Envelope(2.3d, (double) (-6), 34.0d, 0.2999999999999998d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 33.7d + "'", double5 == 33.7d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.3d + "'", double6 == 8.3d);
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        jts.Envelope envelope4 = new jts.Envelope(15.4d, 3.4000000000000004d, (double) 4, 102.1d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        jts.Envelope envelope4 = new jts.Envelope(117.4d, 62.699999999999996d, 13.9d, 58.5d);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, (double) 0L, (double) 3L, (double) 1);
        envelope4.init((-2.1d), (double) (-6), 95.2d, (double) 5);
        envelope4.init(2.3d, 3.3d, 77.5d, 199.0d);
        envelope4.init(8.799999999999999d, 5.3d, 76.5d, 106.9d);
        double double20 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass21 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 3.499999999999999d + "'", double20 == 3.499999999999999d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        jts.Envelope envelope4 = new jts.Envelope((double) 7L, 110.5d, (double) (-1L), 0.0d);
        envelope4.init(2.0999999999999943d, 198.5d, 107.5d, 53.2d);
        double double10 = envelope4.getHeight();
        envelope4.init(6.300000000000001d, 0.5999999999999996d, 1.2999999999999998d, 6.0d);
        double double16 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 54.3d + "'", double10 == 54.3d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5.700000000000001d + "'", double16 == 5.700000000000001d);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) 10, (double) (byte) 1, (double) (byte) 0);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.maxExtent();
        double double9 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), 10.5d, (double) (short) 100, (double) 9);
        envelope4.init(3.0999999999999943d, 57.099999999999994d, 6.200000000000003d, (double) (-2L));
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.getHeight();
        double double15 = envelope4.getWidth();
        boolean boolean16 = envelope4.isEnvelopeNull();
        double double17 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 109.0d + "'", double15 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 109.0d + "'", double17 == 109.0d);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1), 24.0d, 90.0d, 2.7d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init((double) 100L, 109.1d, (double) 4, 86.2d);
        double double11 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 82.2d + "'", double11 == 82.2d);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        jts.Envelope envelope4 = new jts.Envelope(5.3d, 100.1d, 89.2d, 146.0d);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        jts.Envelope envelope4 = new jts.Envelope((double) '4', (double) (-6L), (double) (-6), (double) 100L);
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init(0.0d, 1.9d, 75.5d, (double) 1L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        jts.Envelope envelope4 = new jts.Envelope(4.2d, 12.200000000000003d, 0.0d, 17.1d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
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
        double double18 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass19 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 109.0d + "'", double15 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 109.0d + "'", double17 == 109.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 109.0d + "'", double18 == 109.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        double double16 = envelope4.getWidth();
        double double17 = envelope4.getHeight();
        double double18 = envelope4.getWidth();
        double double19 = envelope4.maxExtent();
        double double20 = envelope4.getHeight();
        double double21 = envelope4.maxExtent();
        double double22 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 8.0d + "'", double19 == 8.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 8.0d + "'", double20 == 8.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 8.0d + "'", double21 == 8.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 8.0d + "'", double22 == 8.0d);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        double double16 = envelope4.getWidth();
        double double17 = envelope4.maxExtent();
        boolean boolean18 = envelope4.isEnvelopeNull();
        envelope4.init((double) 1, (double) 4L, 109.0d, 5.8d);
        boolean boolean24 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.getHeight();
        double double14 = envelope4.getHeight();
        double double15 = envelope4.getWidth();
        double double16 = envelope4.getHeight();
        double double17 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass18 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 104.0d + "'", double14 == 104.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 106.0d + "'", double15 == 106.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 104.0d + "'", double16 == 104.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 104.0d + "'", double17 == 104.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        jts.Envelope envelope4 = new jts.Envelope((double) 7, (double) 10.0f, (double) 4L, (double) 0L);
        envelope4.init((double) 10.0f, (double) 4, (double) 9, 3.1d);
        envelope4.init((double) 7L, (double) 5L, (double) 2, (double) 9L);
        boolean boolean15 = envelope4.isEnvelopeNull();
        double double16 = envelope4.maxExtent();
        envelope4.init(3.9d, 106.2d, 1.5d, 14.3d);
        boolean boolean22 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 7.0d + "'", double16 == 7.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getHeight();
        envelope4.init(20.0d, 9.2d, 9.099999999999998d, 5.9d);
        double double13 = envelope4.getWidth();
        double double14 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.8d + "'", double13 == 10.8d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.8d + "'", double14 == 10.8d);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        jts.Envelope envelope4 = new jts.Envelope(10.600000000000009d, 92.9d, (double) (-10), 0.5d);
        double double5 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 82.3d + "'", double5 == 82.3d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        jts.Envelope envelope4 = new jts.Envelope(7.0d, 101.0d, 42.0d, 102.0d);
        double double5 = envelope4.getWidth();
        envelope4.init(16.0d, 14.0d, (double) 1L, 79.7d);
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 94.0d + "'", double5 == 94.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 78.7d + "'", double11 == 78.7d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 78.7d + "'", double12 == 78.7d);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        jts.Envelope envelope4 = new jts.Envelope(82.79999999999998d, 7.699999999999999d, 101.60000000000001d, (double) 9);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
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
        double double22 = envelope4.getHeight();
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
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        jts.Envelope envelope4 = new jts.Envelope(7.1d, 16.200000000000003d, (double) (-1.0f), (double) (-3));
        envelope4.init(6.0d, 1.5999999999999996d, 17.6d, 4.0d);
        double double10 = envelope4.getWidth();
        double double11 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.4d + "'", double10 == 4.4d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.4d + "'", double11 == 4.4d);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 21.599999999999994d, 18.5d, 73.0d);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        double double11 = envelope4.getWidth();
        double double12 = envelope4.getHeight();
        boolean boolean13 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 104.0d + "'", double12 == 104.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        double double16 = envelope4.getWidth();
        double double17 = envelope4.getHeight();
        double double18 = envelope4.getWidth();
        boolean boolean19 = envelope4.isEnvelopeNull();
        double double20 = envelope4.getHeight();
        boolean boolean21 = envelope4.isEnvelopeNull();
        double double22 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 8.0d + "'", double20 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 8.0d + "'", double22 == 8.0d);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, (double) (-100L), 0.0d, (double) 10);
        double double5 = envelope4.getHeight();
        envelope4.init(0.0d, (double) (-7), (double) 10.0f, 111.3d);
        double double11 = envelope4.getHeight();
        envelope4.init(68.6d, (double) 1.0f, 26.0d, 106.0d);
        boolean boolean17 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 101.3d + "'", double11 == 101.3d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        jts.Envelope envelope4 = new jts.Envelope(84.60000000000001d, 1.5999999999999996d, 10.9d, 74.6d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 83.00000000000001d + "'", double5 == 83.00000000000001d);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        jts.Envelope envelope4 = new jts.Envelope(89.5d, (double) (byte) 100, 2.9000000000000004d, (double) (-1));
        envelope4.init(2.7d, (double) 1L, 103.0d, 100.0d);
        double double10 = envelope4.getWidth();
        envelope4.init(1.7999999999999998d, (double) (-9L), 0.0d, 3.7d);
        double double16 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7000000000000002d + "'", double10 == 1.7000000000000002d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.7d + "'", double16 == 3.7d);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        jts.Envelope envelope4 = new jts.Envelope(3.3d, 97.0d, 102.5d, 148.0d);
        envelope4.init(92.9d, 193.0d, (-3.8d), 0.0d);
        java.lang.Class<?> wildcardClass10 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        envelope4.init((double) (byte) 1, (double) (-8L), (double) 8L, (double) (-4L));
        boolean boolean10 = envelope4.isEnvelopeNull();
        boolean boolean11 = envelope4.isEnvelopeNull();
        envelope4.init(51.0d, (double) (-1L), 0.6999999999999993d, 6.1d);
        double double17 = envelope4.getHeight();
        envelope4.init(0.40000000000000036d, 13.899999999999991d, 132.0d, 5.8d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 5.4d + "'", double17 == 5.4d);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
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
        double double18 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        jts.Envelope envelope4 = new jts.Envelope(6.9d, (double) (byte) 10, 87.0d, 83.7d);
        double double5 = envelope4.getWidth();
        envelope4.init(37.6d, 1.0999999999999996d, (double) (-6), 14.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.0999999999999996d + "'", double5 == 3.0999999999999996d);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        jts.Envelope envelope4 = new jts.Envelope((double) 8, 104.6d, 1.0d, (double) 3);
        envelope4.init(6.900000000000006d, 13.899999999999991d, 5.299999999999983d, 4.499999999999999d);
        double double10 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7999999999999838d + "'", double10 == 0.7999999999999838d);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        jts.Envelope envelope4 = new jts.Envelope(3.9000000000000004d, 55.0d, 0.0d, 13.6d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 13.6d + "'", double5 == 13.6d);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        jts.Envelope envelope4 = new jts.Envelope(5.0d, 5.3d, (double) (-100L), (double) (-2L));
        double double5 = envelope4.getWidth();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2999999999999998d + "'", double5 == 0.2999999999999998d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 98.0d + "'", double6 == 98.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 98.0d + "'", double7 == 98.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 98.0d + "'", double8 == 98.0d);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        jts.Envelope envelope4 = new jts.Envelope((double) (-6L), (double) (byte) 100, (double) (short) 1, (double) (short) 0);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass7 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        jts.Envelope envelope4 = new jts.Envelope(105.0d, 3.3999999999999915d, 82.3d, 44.5d);
        double double5 = envelope4.getWidth();
        envelope4.init(100.2d, 115.1d, 60.0d, 100.2d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.60000000000001d + "'", double5 == 101.60000000000001d);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        jts.Envelope envelope4 = new jts.Envelope((double) (-8L), 10.0d, (double) (-6L), (double) 8);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getWidth();
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.0d + "'", double7 == 18.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 14.0d + "'", double8 == 14.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 18.0d + "'", double9 == 18.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 18.0d + "'", double10 == 18.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 18.0d + "'", double11 == 18.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 14.0d + "'", double12 == 14.0d);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        jts.Envelope envelope4 = new jts.Envelope(84.99999999999999d, (double) (short) 10, 4.8d, (double) 0L);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        jts.Envelope envelope4 = new jts.Envelope((-6.9d), 1.7000000000000002d, 13.0d, 6.0d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.600000000000001d + "'", double5 == 8.600000000000001d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.0d + "'", double6 == 7.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.600000000000001d + "'", double7 == 8.600000000000001d);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        jts.Envelope envelope4 = new jts.Envelope((-8.7d), 0.0d, (double) (short) 10, 96.0d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getHeight();
        boolean boolean7 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.7d + "'", double5 == 8.7d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 86.0d + "'", double6 == 86.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 14.200000000000003d, 5.699999999999999d, 82.2d);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, (-5.4d), 0.0d, 65.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass8 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 65.0d + "'", double7 == 65.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        jts.Envelope envelope4 = new jts.Envelope(88.9d, 66.2d, 18.0d, 7.899999999999999d);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        jts.Envelope envelope4 = new jts.Envelope(100.0d, 10.5d, (double) 2, (-100.0d));
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.maxExtent();
        double double9 = envelope4.getWidth();
        boolean boolean10 = envelope4.isEnvelopeNull();
        envelope4.init((-5.4d), 4.799999999999997d, 0.0d, (double) (-2));
        double double16 = envelope4.getHeight();
        double double17 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.0d + "'", double5 == 102.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 102.0d + "'", double6 == 102.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 102.0d + "'", double7 == 102.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 102.0d + "'", double8 == 102.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 89.5d + "'", double9 == 89.5d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.0d + "'", double16 == 2.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.199999999999998d + "'", double17 == 10.199999999999998d);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        jts.Envelope envelope4 = new jts.Envelope(110.9d, 117.7d, 104.3d, 57.099999999999994d);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        jts.Envelope envelope4 = new jts.Envelope(8.7d, 92.7d, 15.0d, 7.1d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        boolean boolean7 = envelope4.isEnvelopeNull();
        double double8 = envelope4.maxExtent();
        boolean boolean9 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass10 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 84.0d + "'", double6 == 84.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 84.0d + "'", double8 == 84.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), (double) (short) 0, 1.0d, (double) 10);
        double double5 = envelope4.getWidth();
        envelope4.init((double) (byte) 100, (double) (byte) 0, (double) 4, (double) (-1L));
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getWidth();
        double double13 = envelope4.maxExtent();
        envelope4.init(3.9000000000000004d, 5.0d, 112.1d, 198.5d);
        double double19 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5.0d + "'", double11 == 5.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 86.4d + "'", double19 == 86.4d);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, 2.5999999999999996d, 95.0d, 10.5d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 84.5d + "'", double5 == 84.5d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        jts.Envelope envelope4 = new jts.Envelope(100.0d, 10.5d, (double) 2, (-100.0d));
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 89.5d + "'", double5 == 89.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 89.5d + "'", double6 == 89.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 102.0d + "'", double7 == 102.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 102.0d + "'", double8 == 102.0d);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        jts.Envelope envelope4 = new jts.Envelope((double) (-8L), 10.0d, (double) (-6L), (double) 8);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getHeight();
        double double10 = envelope4.getWidth();
        envelope4.init(18.0d, 11.299999999999983d, 12.6d, 76.0d);
        java.lang.Class<?> wildcardClass16 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.0d + "'", double7 == 18.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 14.0d + "'", double8 == 14.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 14.0d + "'", double9 == 14.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 18.0d + "'", double10 == 18.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1.0f), (double) (-9), (double) 2, (double) 10);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) 1L, 106.9d, 20.2d, 100.2d);
        boolean boolean11 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        double double13 = envelope4.getWidth();
        double double14 = envelope4.getWidth();
        boolean boolean15 = envelope4.isEnvelopeNull();
        envelope4.init(5.8d, (double) 7, (double) 8, 4.8d);
        double double21 = envelope4.getHeight();
        double double22 = envelope4.maxExtent();
        double double23 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 109.0d + "'", double13 == 109.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 3.2d + "'", double21 == 3.2d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 3.2d + "'", double22 == 3.2d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 3.2d + "'", double23 == 3.2d);
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        double double16 = envelope4.getWidth();
        double double17 = envelope4.maxExtent();
        double double18 = envelope4.maxExtent();
        double double19 = envelope4.getHeight();
        envelope4.init(14.0d, 4.8d, 0.0d, 8.7d);
        double double25 = envelope4.maxExtent();
        double double26 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.0d + "'", double18 == 8.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 8.0d + "'", double19 == 8.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 9.2d + "'", double25 == 9.2d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 9.2d + "'", double26 == 9.2d);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, 54.2d, 2.299999999999997d, 62.9d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 60.6d + "'", double5 == 60.6d);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1), 97.19999999999999d, 110.1d, 81.5d);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        jts.Envelope envelope4 = new jts.Envelope(89.5d, (double) (byte) 100, 2.9000000000000004d, (double) (-1));
        envelope4.init(2.7d, (double) 1L, 103.0d, 100.0d);
        double double10 = envelope4.getWidth();
        envelope4.init((double) (-3), 1.6999999999999993d, 11.700000000000003d, 67.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7000000000000002d + "'", double10 == 1.7000000000000002d);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        double double16 = envelope4.getWidth();
        double double17 = envelope4.getHeight();
        double double18 = envelope4.maxExtent();
        double double19 = envelope4.maxExtent();
        double double20 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.0d + "'", double18 == 8.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 8.0d + "'", double19 == 8.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        jts.Envelope envelope4 = new jts.Envelope(102.1d, 85.4d, 104.6d, (double) ' ');
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        double double13 = envelope4.getWidth();
        boolean boolean14 = envelope4.isEnvelopeNull();
        boolean boolean15 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass16 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 109.0d + "'", double13 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        jts.Envelope envelope4 = new jts.Envelope((double) 7, (double) 10.0f, (double) 4L, (double) 0L);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass9 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.0d + "'", double6 == 3.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3.0d + "'", double7 == 3.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getHeight();
        boolean boolean14 = envelope4.isEnvelopeNull();
        envelope4.init((-10.5d), 0.0d, (double) 100, (double) (byte) 1);
        double double20 = envelope4.getHeight();
        double double21 = envelope4.getWidth();
        envelope4.init(0.0d, 3.5999999999999996d, 63.400000000000006d, 3.9000000000000004d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 104.0d + "'", double12 == 104.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 99.0d + "'", double20 == 99.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.5d + "'", double21 == 10.5d);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        jts.Envelope envelope4 = new jts.Envelope(89.5d, (double) (byte) 100, 2.9000000000000004d, (double) (-1));
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        boolean boolean7 = envelope4.isEnvelopeNull();
        envelope4.init((double) (-10L), 14.3d, 0.0d, 15.9d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.5d + "'", double6 == 10.5d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getWidth();
        envelope4.init(0.0d, (double) 10, (double) 0L, (double) 0.0f);
        double double15 = envelope4.getHeight();
        envelope4.init(0.0d, 25.1d, 14.9d, 194.0d);
        envelope4.init(96.19999999999999d, 13.200000000000003d, 29.2d, 21.7d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        jts.Envelope envelope4 = new jts.Envelope(1.2d, 29.299999999999997d, 0.0d, (double) (short) 10);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getHeight();
        envelope4.init(102.0d, 0.0d, (double) 0, (double) ' ');
        double double15 = envelope4.getWidth();
        double double16 = envelope4.maxExtent();
        double double17 = envelope4.getHeight();
        double double18 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 102.0d + "'", double15 == 102.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 102.0d + "'", double16 == 102.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 102.0d + "'", double18 == 102.0d);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 3.1d, 5.0d, 2.7d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init(1.5d, 200.0d, 104.6d, 90.3d);
        double double13 = envelope4.maxExtent();
        double double14 = envelope4.maxExtent();
        boolean boolean15 = envelope4.isEnvelopeNull();
        double double16 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3d + "'", double5 == 2.3d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 6.9d + "'", double6 == 6.9d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 6.9d + "'", double7 == 6.9d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 198.5d + "'", double13 == 198.5d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 198.5d + "'", double14 == 198.5d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 198.5d + "'", double16 == 198.5d);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        envelope4.init((double) (byte) 1, (double) (-8L), (double) 8L, (double) (-4L));
        envelope4.init((double) 1, (double) 4, (double) (-4L), 3.0d);
        envelope4.init(27.3d, 7.7d, 9.6d, 100.8d);
        java.lang.Class<?> wildcardClass20 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        jts.Envelope envelope4 = new jts.Envelope(78.7d, 9.5d, 200.0d, 0.0d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 200.0d + "'", double5 == 200.0d);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) (-1L), (double) (-1.0f), (double) 0L, 100.0d);
        double double12 = envelope4.getWidth();
        double double13 = envelope4.getWidth();
        double double14 = envelope4.getWidth();
        double double15 = envelope4.maxExtent();
        boolean boolean16 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        boolean boolean13 = envelope4.isEnvelopeNull();
        boolean boolean14 = envelope4.isEnvelopeNull();
        double double15 = envelope4.maxExtent();
        envelope4.init(85.4d, 100.0d, (double) 0, 106.0d);
        double double21 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass22 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 106.0d + "'", double15 == 106.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 106.0d + "'", double21 == 106.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        jts.Envelope envelope4 = new jts.Envelope(3.2d, 14.9d, 8.700000000000003d, 86.6d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 11.7d + "'", double5 == 11.7d);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getWidth();
        double double10 = envelope4.maxExtent();
        envelope4.init(79.7d, 12.3d, 90.89999999999999d, 3.9000000000000004d);
        double double16 = envelope4.getWidth();
        envelope4.init(11.7d, 86.4d, 102.3d, (-2.1d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.4d + "'", double10 == 8.4d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 67.4d + "'", double16 == 67.4d);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 3.0d, (double) 100.0f, 7.1d);
        envelope4.init(1.7000000000000002d, 106.0d, (double) 100.0f, 14.6d);
        boolean boolean10 = envelope4.isEnvelopeNull();
        envelope4.init(110.0d, 7.1d, (double) 10L, (double) (-1L));
        double double16 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 11.0d + "'", double16 == 11.0d);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        jts.Envelope envelope4 = new jts.Envelope((double) 100L, 2.0d, 1.5999999999999996d, (double) (-1));
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.5999999999999996d + "'", double5 == 2.5999999999999996d);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        jts.Envelope envelope4 = new jts.Envelope(91.3d, 38.1d, 2.5999999999999996d, 6.300000000000001d);
        envelope4.init(41.2d, 93.1d, 0.0d, 0.0d);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.getHeight();
        envelope4.init((double) 10.0f, (-4.6d), (double) (byte) 1, (double) 5);
        envelope4.init(109.0d, (double) (-1), 76.0d, 102.0d);
        double double16 = envelope4.getWidth();
        double double17 = envelope4.maxExtent();
        double double18 = envelope4.getHeight();
        double double19 = envelope4.maxExtent();
        boolean boolean20 = envelope4.isEnvelopeNull();
        envelope4.init(99.2d, 88.1d, 204.0d, 7.7d);
        boolean boolean26 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 110.0d + "'", double16 == 110.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 110.0d + "'", double17 == 110.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 26.0d + "'", double18 == 26.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 110.0d + "'", double19 == 110.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        jts.Envelope envelope4 = new jts.Envelope(24.0d, (double) 2, 104.0d, (-7.3d));
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        boolean boolean7 = envelope4.isEnvelopeNull();
        double double8 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 111.3d + "'", double5 == 111.3d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 111.3d + "'", double6 == 111.3d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 111.3d + "'", double8 == 111.3d);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) 0, (-2.1d), (double) (-8L), (double) (-4));
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getWidth();
        boolean boolean7 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.1d + "'", double5 == 2.1d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.1d + "'", double6 == 2.1d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        jts.Envelope envelope4 = new jts.Envelope(53.9d, 84.1d, 36.29999999999999d, (double) (-8L));
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        jts.Envelope envelope4 = new jts.Envelope(1.5999999999999996d, (double) 1L, 100.0d, (double) (-9L));
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getHeight();
        boolean boolean8 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5999999999999996d + "'", double6 == 0.5999999999999996d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 109.0d + "'", double7 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        jts.Envelope envelope4 = new jts.Envelope((double) (-7), 3.7d, 11.9d, (double) (-8));
        envelope4.init(3.7d, 30.6d, 108.0d, 97.7d);
        envelope4.init((double) '4', 2.1d, 86.7d, 60.0d);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        jts.Envelope envelope4 = new jts.Envelope(83.9d, 102.1d, 173.6d, 9.5d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        jts.Envelope envelope4 = new jts.Envelope(0.5d, 18.9d, 6.7d, 101.3d);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        jts.Envelope envelope4 = new jts.Envelope(1.7999999999999998d, 14.0d, 3.299999999999999d, (double) 100.0f);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 96.7d + "'", double5 == 96.7d);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getHeight();
        boolean boolean7 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (short) 0, (-9.3d), (double) (-1L));
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.0d + "'", double5 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.0d + "'", double6 == 9.0d);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        jts.Envelope envelope4 = new jts.Envelope(3.299999999999999d, 11.1d, 15.3d, (double) (-5L));
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        jts.Envelope envelope4 = new jts.Envelope((double) 5, (double) (byte) 100, 9.0d, 109.0d);
        double double5 = envelope4.getHeight();
        envelope4.init(102.7d, 15.0d, 9.5d, 98.1d);
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 88.6d + "'", double11 == 88.6d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 88.6d + "'", double12 == 88.6d);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        jts.Envelope envelope4 = new jts.Envelope((-100.0d), (double) 7L, 14.6d, (double) 100L);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 107.0d + "'", double5 == 107.0d);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        jts.Envelope envelope4 = new jts.Envelope((-5.4d), 14.4d, (double) (short) 100, 117.4d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.maxExtent();
        envelope4.init((double) (-2L), 11.700000000000003d, 10.100000000000001d, 80.7d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 17.400000000000006d + "'", double5 == 17.400000000000006d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 17.400000000000006d + "'", double6 == 17.400000000000006d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 19.8d + "'", double7 == 19.8d);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        boolean boolean8 = envelope4.isEnvelopeNull();
        envelope4.init(34.7d, 93.0d, (double) (-8), (double) (-10L));
        double double14 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 58.3d + "'", double14 == 58.3d);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        jts.Envelope envelope4 = new jts.Envelope((double) 10.0f, 0.0d, (double) (-3L), (double) 100L);
        double double5 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        jts.Envelope envelope4 = new jts.Envelope(31.0d, (double) (byte) 100, 2.9000000000000004d, 5.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-1), 2.5999999999999996d, 0.0d, 14.9d);
        boolean boolean11 = envelope4.isEnvelopeNull();
        double double12 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 69.0d + "'", double5 == 69.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 14.9d + "'", double12 == 14.9d);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        jts.Envelope envelope4 = new jts.Envelope(6.299999999999997d, (double) (byte) 10, 38.4d, 199.0d);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        jts.Envelope envelope4 = new jts.Envelope(78.7d, 9.5d, 200.0d, 0.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init((-6.9d), (-2.1d), (-7.3d), (double) 4);
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.getWidth();
        double double14 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 11.3d + "'", double12 == 11.3d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.800000000000001d + "'", double13 == 4.800000000000001d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.800000000000001d + "'", double14 == 4.800000000000001d);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        jts.Envelope envelope4 = new jts.Envelope(31.0d, (double) (byte) 100, 2.9000000000000004d, 5.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-1), 2.5999999999999996d, 0.0d, 14.9d);
        double double11 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 69.0d + "'", double5 == 69.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 14.9d + "'", double11 == 14.9d);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        jts.Envelope envelope4 = new jts.Envelope((double) (-7), (double) 4L, (-7.3d), (-100.0d));
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.getHeight();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 11.0d + "'", double5 == 11.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 92.7d + "'", double6 == 92.7d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 92.7d + "'", double7 == 92.7d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 92.7d + "'", double9 == 92.7d);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getWidth();
        envelope4.init((double) (-6L), (double) 6, (double) (short) -1, 6.3d);
        double double19 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 96.0d + "'", double11 == 96.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 96.0d + "'", double12 == 96.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.0d + "'", double13 == 8.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 7.3d + "'", double19 == 7.3d);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        jts.Envelope envelope4 = new jts.Envelope(8.4d, (double) (byte) 10, (double) (-100L), (double) '#');
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 135.0d + "'", double5 == 135.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 135.0d + "'", double6 == 135.0d);
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        envelope4.init((-5.4d), (-8.7d), (double) 5L, (double) 7);
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getWidth();
        double double14 = envelope4.getHeight();
        boolean boolean15 = envelope4.isEnvelopeNull();
        double double16 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.0d + "'", double12 == 2.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.299999999999999d + "'", double13 == 3.299999999999999d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.0d + "'", double14 == 2.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.299999999999999d + "'", double16 == 3.299999999999999d);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.getHeight();
        envelope4.init((double) (-9L), 5.4d, (-2.1d), (double) 6);
        java.lang.Class<?> wildcardClass13 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
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
        double double19 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.0d + "'", double11 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 18.0d + "'", double18 == 18.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 18.0d + "'", double19 == 18.0d);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        jts.Envelope envelope4 = new jts.Envelope((double) (-2), (double) 100, 4.0d, (double) 1.0f);
        double double5 = envelope4.maxExtent();
        envelope4.init(34.7d, 104.1d, 92.9d, 94.1d);
        boolean boolean11 = envelope4.isEnvelopeNull();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.0d + "'", double5 == 102.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.1999999999999886d + "'", double12 == 1.1999999999999886d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 69.39999999999999d + "'", double13 == 69.39999999999999d);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        jts.Envelope envelope4 = new jts.Envelope(7.3d, 0.0d, 26.0d, 36.0d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.3d + "'", double5 == 7.3d);
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        jts.Envelope envelope4 = new jts.Envelope(19.0d, 82.3d, 111.3d, 2.3d);
        double double5 = envelope4.getWidth();
        envelope4.init(184.1d, 0.0d, 10.100000000000001d, 83.19999999999999d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 63.3d + "'", double5 == 63.3d);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        jts.Envelope envelope4 = new jts.Envelope((double) 0.0f, (double) (byte) 1, 2.1d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        envelope4.init((double) 1L, 0.0d, 92.1d, 57.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.1d + "'", double5 == 2.1d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        jts.Envelope envelope4 = new jts.Envelope(0.2999999999999998d, 134.0d, 0.0d, 58.7d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 133.7d + "'", double5 == 133.7d);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        jts.Envelope envelope4 = new jts.Envelope((double) '4', (double) (-6L), (double) (-6), (double) 100L);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass7 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 58.0d + "'", double5 == 58.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 106.0d + "'", double6 == 106.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, (double) (-1L), 0.0d, 8.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        jts.Envelope envelope4 = new jts.Envelope(17.1d, 100.0d, 30.0d, 109.7d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 82.9d + "'", double5 == 82.9d);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        jts.Envelope envelope4 = new jts.Envelope(65.1d, 3.7d, 4.299999999999999d, 11.299999999999983d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) 100, (double) (-100), 94.0d, (double) 9L);
        envelope4.init(90.0d, (double) 5L, (double) (-1), (double) 4);
        double double10 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass11 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.0d + "'", double10 == 5.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        jts.Envelope envelope4 = new jts.Envelope(4.8d, (double) '#', (double) 6, 1.7000000000000002d);
        envelope4.init(106.2d, 52.7d, 97.19999999999999d, (double) 10L);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        envelope4.init((double) 1, 200.0d, (-7.3d), 87.0d);
        double double13 = envelope4.getWidth();
        double double14 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 199.0d + "'", double13 == 199.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 199.0d + "'", double14 == 199.0d);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        double double16 = envelope4.getWidth();
        double double17 = envelope4.maxExtent();
        envelope4.init((double) '#', 87.0d, (double) (byte) 1, (double) 0.0f);
        boolean boolean23 = envelope4.isEnvelopeNull();
        envelope4.init((double) (-10L), (-7.3d), 26.700000000000003d, 204.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }
}

