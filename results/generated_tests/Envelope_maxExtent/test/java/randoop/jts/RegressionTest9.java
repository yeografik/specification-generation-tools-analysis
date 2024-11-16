package jts;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        jts.Envelope envelope4 = new jts.Envelope((double) 6L, (double) 10, 39.4d, 2.3000000000000007d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 37.099999999999994d + "'", double5 == 37.099999999999994d);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.getWidth();
        boolean boolean15 = envelope4.isEnvelopeNull();
        boolean boolean16 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 106.0d + "'", double14 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        jts.Envelope envelope4 = new jts.Envelope((double) 10L, 18.0d, (double) (-8), 13.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init(0.0d, 51.0d, 110.0d, (double) 9);
        boolean boolean11 = envelope4.isEnvelopeNull();
        envelope4.init((double) (byte) 0, 0.0d, 0.0d, 7.0d);
        double double17 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 21.0d + "'", double5 == 21.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 7.0d + "'", double17 == 7.0d);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        envelope4.init((double) (-8), (double) (-9), (double) (-100), (double) 2L);
        double double16 = envelope4.maxExtent();
        double double17 = envelope4.getWidth();
        double double18 = envelope4.maxExtent();
        boolean boolean19 = envelope4.isEnvelopeNull();
        double double20 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 102.0d + "'", double16 == 102.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 102.0d + "'", double18 == 102.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        jts.Envelope envelope4 = new jts.Envelope(184.1d, (double) (-7), 56.1d, 96.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        jts.Envelope envelope4 = new jts.Envelope(102.3d, 22.0d, 6.300000000000001d, 101.8d);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        jts.Envelope envelope4 = new jts.Envelope(3.9d, 39.400000000000006d, (double) (-2), 60.0d);
        envelope4.init(0.0d, 8.4d, 58.0d, 3.9d);
        double double10 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 54.1d + "'", double10 == 54.1d);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        jts.Envelope envelope4 = new jts.Envelope(92.7d, (double) (-10L), 1.2d, (double) (-8L));
        double double5 = envelope4.getWidth();
        envelope4.init(110.0d, (double) (-4), (double) 1, (double) 0);
        envelope4.init((double) (-10L), (double) 100L, (double) 10, (double) 10.0f);
        envelope4.init(90.2d, (double) (-3), (double) (-5), 90.0d);
        boolean boolean21 = envelope4.isEnvelopeNull();
        envelope4.init(0.0d, 2.7d, 85.1d, 114.9d);
        boolean boolean27 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.7d + "'", double5 == 102.7d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        jts.Envelope envelope4 = new jts.Envelope((-9.3d), 19.8d, 89.7d, 80.1d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.600000000000009d + "'", double5 == 9.600000000000009d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init(1.7000000000000004d, 3.5d, 105.7d, 0.0d);
        double double12 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7999999999999996d + "'", double12 == 1.7999999999999996d);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        jts.Envelope envelope4 = new jts.Envelope(33.7d, 80.0d, 8.600000000000001d, 0.0d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 46.3d + "'", double5 == 46.3d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.600000000000001d + "'", double6 == 8.600000000000001d);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
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
        double double23 = envelope4.getHeight();
        envelope4.init(3.8d, 17.1d, 98.7d, 7.299999999999997d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 109.0d + "'", double13 == 109.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 105.4d + "'", double20 == 105.4d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 105.4d + "'", double21 == 105.4d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 107.0d + "'", double22 == 107.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 105.4d + "'", double23 == 105.4d);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        jts.Envelope envelope4 = new jts.Envelope(184.1d, 2.700000000000003d, 0.9000000000000004d, 5.8999999999999995d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.999999999999999d + "'", double5 == 4.999999999999999d);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        jts.Envelope envelope4 = new jts.Envelope(100.0d, 10.5d, (double) 2, (-100.0d));
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-1), 14.0d, 77.9d, 32.0d);
        double double11 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.0d + "'", double5 == 102.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 15.0d + "'", double11 == 15.0d);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        jts.Envelope envelope4 = new jts.Envelope(79.7d, 108.7d, 0.0d, (double) 100L);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 29.0d + "'", double5 == 29.0d);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        boolean boolean11 = envelope4.isEnvelopeNull();
        double double12 = envelope4.getWidth();
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.getHeight();
        boolean boolean15 = envelope4.isEnvelopeNull();
        envelope4.init(12.3d, 193.0d, 44.3d, 107.3d);
        double double21 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 104.0d + "'", double14 == 104.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 180.7d + "'", double21 == 180.7d);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        jts.Envelope envelope4 = new jts.Envelope(110.3d, 9.099999999999998d, 37.20000000000001d, 96.9d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.2d + "'", double5 == 101.2d);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        jts.Envelope envelope4 = new jts.Envelope((double) (-6), 0.0d, (double) (-5L), (double) 7);
        envelope4.init(9.099999999999998d, (double) (-1), (double) (-7L), 20.0d);
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 27.0d + "'", double10 == 27.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 27.0d + "'", double11 == 27.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 27.0d + "'", double12 == 27.0d);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) 1, 9.2d, 1.799999999999999d, 14.9d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 13.100000000000001d + "'", double6 == 13.100000000000001d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 13.100000000000001d + "'", double7 == 13.100000000000001d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 13.100000000000001d + "'", double8 == 13.100000000000001d);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        jts.Envelope envelope4 = new jts.Envelope((-10.5d), 11.1d, 36.0d, 6.1d);
        envelope4.init(6.300000000000001d, 89.8d, 109.7d, 6.9d);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        jts.Envelope envelope4 = new jts.Envelope(35.7d, 100.0d, 66.2d, 96.0d);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        jts.Envelope envelope4 = new jts.Envelope(42.0d, (double) (short) 1, (double) 9, (double) (-100L));
        double double5 = envelope4.getWidth();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 41.0d + "'", double5 == 41.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 109.0d + "'", double6 == 109.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 41.0d + "'", double7 == 41.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 109.0d + "'", double9 == 109.0d);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        jts.Envelope envelope4 = new jts.Envelope((double) (-6L), (double) (-7), 24.0d, 6.9d);
        envelope4.init((double) 100, 13.4d, 0.6999999999999993d, 3.0d);
        double double10 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 86.6d + "'", double10 == 86.6d);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 1, (double) 0.0f, (double) 6, (double) 3L);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass8 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.0d + "'", double5 == 3.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3.0d + "'", double7 == 3.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        jts.Envelope envelope4 = new jts.Envelope(1.7000000000000004d, 46.2d, 82.3d, 19.7d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
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
        double double18 = envelope4.getHeight();
        double double19 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass20 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 109.0d + "'", double16 == 109.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 5.0d + "'", double17 == 5.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 5.0d + "'", double18 == 5.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 109.0d + "'", double19 == 109.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        jts.Envelope envelope4 = new jts.Envelope((double) 8, 13.0d, 22.3d, (double) 10L);
        envelope4.init((double) (-100L), 90.3d, 31.0d, (double) 3L);
        double double10 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass11 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 190.3d + "'", double10 == 190.3d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        jts.Envelope envelope4 = new jts.Envelope(24.0d, 94.0d, (double) (-1), (double) (-6));
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 70.0d + "'", double5 == 70.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 70.0d + "'", double6 == 70.0d);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 3.1d, 5.0d, 2.7d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) 0, (double) 0.0f, (double) (-5), 0.0d);
        boolean boolean12 = envelope4.isEnvelopeNull();
        envelope4.init(155.4d, 39.400000000000006d, 5.4d, 199.0d);
        double double18 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3d + "'", double5 == 2.3d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 6.9d + "'", double6 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 193.6d + "'", double18 == 193.6d);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        jts.Envelope envelope4 = new jts.Envelope((double) 7, (double) 10.0f, (double) 4L, (double) 0L);
        envelope4.init((double) 10.0f, (double) 4, (double) 9, 3.1d);
        double double10 = envelope4.getHeight();
        double double11 = envelope4.getWidth();
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.9d + "'", double10 == 5.9d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 6.0d + "'", double11 == 6.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.0d + "'", double12 == 6.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.9d + "'", double13 == 5.9d);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) (-1L), (double) (-1.0f), (double) 0L, 100.0d);
        double double12 = envelope4.getWidth();
        envelope4.init((-2.1d), 2.3d, 104.0d, 100.0d);
        double double18 = envelope4.getWidth();
        double double19 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.4d + "'", double18 == 4.4d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 4.4d + "'", double19 == 4.4d);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        jts.Envelope envelope4 = new jts.Envelope(4.799999999999997d, 0.6000000000000005d, 62.0d, 91.3d);
        double double5 = envelope4.maxExtent();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 29.299999999999997d + "'", double5 == 29.299999999999997d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        jts.Envelope envelope4 = new jts.Envelope((double) 0, 0.0d, 5.8d, (double) '#');
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass9 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 29.2d + "'", double5 == 29.2d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 29.2d + "'", double8 == 29.2d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 3.1d, 5.0d, 2.7d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass8 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3d + "'", double5 == 2.3d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 6.9d + "'", double6 == 6.9d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 6.9d + "'", double7 == 6.9d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getHeight();
        envelope4.init((double) ' ', (-2.1d), 109.0d, (double) 6);
        envelope4.init((double) 10L, (double) 6L, (double) 0L, (-2.1d));
        double double16 = envelope4.getWidth();
        double double17 = envelope4.getWidth();
        envelope4.init(6.1d, 94.1d, 0.0d, 84.60000000000001d);
        envelope4.init(1.3999999999999968d, 70.2d, 90.39999999999999d, 0.9000000000000004d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.0d + "'", double17 == 4.0d);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        jts.Envelope envelope4 = new jts.Envelope(90.8d, 55.3d, 69.39999999999999d, 88.9d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.5d + "'", double5 == 35.5d);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        jts.Envelope envelope4 = new jts.Envelope((double) 1L, (double) 0L, 10.5d, (-2.1d));
        double double5 = envelope4.maxExtent();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 12.6d + "'", double5 == 12.6d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        jts.Envelope envelope4 = new jts.Envelope(18.5d, 7.5d, 48.0d, 3.3d);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.getHeight();
        boolean boolean14 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass15 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        jts.Envelope envelope4 = new jts.Envelope(92.7d, (double) (-10L), 1.2d, (double) (-8L));
        envelope4.init(95.2d, 8.7d, 1.7000000000000002d, 92.0d);
        double double10 = envelope4.getHeight();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        boolean boolean13 = envelope4.isEnvelopeNull();
        boolean boolean14 = envelope4.isEnvelopeNull();
        double double15 = envelope4.getWidth();
        envelope4.init(3.1d, 80.3d, 98.0d, 104.1d);
        boolean boolean21 = envelope4.isEnvelopeNull();
        double double22 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 90.3d + "'", double10 == 90.3d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 90.3d + "'", double11 == 90.3d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 86.5d + "'", double12 == 86.5d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 86.5d + "'", double15 == 86.5d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 77.2d + "'", double22 == 77.2d);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        jts.Envelope envelope4 = new jts.Envelope((double) 8L, (-5.4d), 5.8d, (double) 10L);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        envelope4.init(12.6d, 11.3d, 18.0d, 38.0d);
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.maxExtent();
        double double14 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 13.4d + "'", double6 == 13.4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
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
        double double28 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 6.9d + "'", double19 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 24.0d + "'", double26 == 24.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 24.0d + "'", double27 == 24.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 6.0d + "'", double28 == 6.0d);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 1, (double) 0.0f, (double) 6, (double) 3L);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getHeight();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.0d + "'", double5 == 3.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.0d + "'", double6 == 3.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3.0d + "'", double7 == 3.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        jts.Envelope envelope4 = new jts.Envelope(1.5999999999999996d, (double) 1L, 100.0d, (double) (-9L));
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 109.0d + "'", double5 == 109.0d);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        jts.Envelope envelope4 = new jts.Envelope(34.0d, 55.0d, 92.3d, 95.7d);
        envelope4.init((double) 5L, 17.4d, (double) 0, 8.3d);
        double double10 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 12.399999999999999d + "'", double10 == 12.399999999999999d);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        jts.Envelope envelope4 = new jts.Envelope((double) 100, 100.0d, (double) 0.0f, (double) 0L);
        envelope4.init(1.7000000000000002d, (double) (-5), 65.0d, (double) (-8));
        double double10 = envelope4.getHeight();
        boolean boolean11 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 73.0d + "'", double10 == 73.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        jts.Envelope envelope4 = new jts.Envelope((double) 100, 24.0d, 5.0d, (double) (-9));
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init((double) 1L, (double) (-7), 17.4d, 92.9d);
        boolean boolean12 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 76.0d + "'", double5 == 76.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 3.1d, 5.0d, 2.7d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init(30.0d, 10.5d, (double) (-1), 91.3d);
        envelope4.init((double) (-1.0f), 6.9d, (-4.6d), 105.4d);
        java.lang.Class<?> wildcardClass18 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3d + "'", double5 == 2.3d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 6.9d + "'", double6 == 6.9d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 6.9d + "'", double7 == 6.9d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getHeight();
        double double14 = envelope4.getWidth();
        boolean boolean15 = envelope4.isEnvelopeNull();
        double double16 = envelope4.maxExtent();
        double double17 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 104.0d + "'", double12 == 104.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 106.0d + "'", double14 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 106.0d + "'", double16 == 106.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 106.0d + "'", double17 == 106.0d);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), (double) (short) 0, 1.0d, (double) 10);
        double double5 = envelope4.getWidth();
        envelope4.init((double) (byte) 100, (double) (byte) 0, (double) 4, (double) (-1L));
        envelope4.init(3.700000000000003d, 43.0d, 4.1d, 3.2d);
        java.lang.Class<?> wildcardClass16 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
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
        envelope4.init(198.1d, 11.299999999999983d, 100.30000000000001d, 98.89999999999999d);
        double double24 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.0d + "'", double11 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 186.8d + "'", double24 == 186.8d);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        jts.Envelope envelope4 = new jts.Envelope(8.3d, 21.0d, (double) 100, 11.3d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 12.7d + "'", double5 == 12.7d);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init((double) 100, (-100.0d), (double) '#', 5.0d);
        envelope4.init((double) 1L, (double) (byte) 100, (double) (-8L), (double) (-1));
        boolean boolean21 = envelope4.isEnvelopeNull();
        envelope4.init(0.0d, 14.9d, (-8.7d), 15.0d);
        double double27 = envelope4.getWidth();
        boolean boolean28 = envelope4.isEnvelopeNull();
        envelope4.init(74.3d, 3.3d, 114.1d, 102.60000000000001d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 14.9d + "'", double27 == 14.9d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        jts.Envelope envelope4 = new jts.Envelope(37.20000000000001d, 3.4000000000000004d, 38.0d, 57.0d);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        jts.Envelope envelope4 = new jts.Envelope((double) '4', (double) (-6L), (double) (-6), (double) 100L);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 106.0d + "'", double7 == 106.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 106.0d + "'", double8 == 106.0d);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        jts.Envelope envelope4 = new jts.Envelope(77.9d, 1.0999999999999996d, 21.1d, 7.0d);
        envelope4.init((double) 9L, 52.0d, 4.7d, 32.099999999999994d);
        double double10 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 27.399999999999995d + "'", double10 == 27.399999999999995d);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        jts.Envelope envelope4 = new jts.Envelope((double) '#', (double) (short) 100, (double) (short) -1, (double) 1L);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 65.0d + "'", double5 == 65.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 65.0d + "'", double6 == 65.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 65.0d + "'", double7 == 65.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 65.0d + "'", double8 == 65.0d);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        jts.Envelope envelope4 = new jts.Envelope(0.5d, 11.9d, 87.0d, (double) (byte) 10);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 77.0d + "'", double5 == 77.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 77.0d + "'", double6 == 77.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 77.0d + "'", double7 == 77.0d);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        jts.Envelope envelope4 = new jts.Envelope(117.4d, 89.5d, 4.2d, (double) 5);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 27.900000000000006d + "'", double5 == 27.900000000000006d);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        jts.Envelope envelope4 = new jts.Envelope(51.0d, 12.6d, (-1.2d), 0.0d);
        double double5 = envelope4.getHeight();
        envelope4.init((double) 8, (double) 0L, (double) 4L, (double) 100.0f);
        boolean boolean11 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.2d + "'", double5 == 1.2d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getHeight();
        envelope4.init(79.2d, (double) 10L, 110.1d, 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        jts.Envelope envelope4 = new jts.Envelope(44.5d, (double) (-6L), 102.1d, 0.0d);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 10, (double) 100, (double) 1, (double) (byte) 100);
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init((double) (-7), (double) (-1.0f), 106.9d, 9.0d);
        envelope4.init(8.0d, 73.30000000000001d, (double) (-7L), 10.5d);
        boolean boolean16 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
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
        double double19 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass20 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 109.0d + "'", double15 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 5.0d + "'", double17 == 5.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 109.0d + "'", double18 == 109.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 109.0d + "'", double19 == 109.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        jts.Envelope envelope4 = new jts.Envelope((double) 7, (double) 0, (double) 8, (double) (-10));
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 18.0d + "'", double5 == 18.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.0d + "'", double6 == 7.0d);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        jts.Envelope envelope4 = new jts.Envelope(92.7d, (double) (-10L), 1.2d, (double) (-8L));
        double double5 = envelope4.getWidth();
        envelope4.init(110.0d, (double) (-4), (double) 1, (double) 0);
        envelope4.init((double) (-10L), (double) 100L, (double) 10, (double) 10.0f);
        envelope4.init(90.2d, (double) (-3), (double) (-5), 90.0d);
        boolean boolean21 = envelope4.isEnvelopeNull();
        double double22 = envelope4.getHeight();
        double double23 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.7d + "'", double5 == 102.7d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 95.0d + "'", double22 == 95.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 95.0d + "'", double23 == 95.0d);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        jts.Envelope envelope4 = new jts.Envelope(20.200000000000003d, 9.2d, 0.7999999999999838d, 111.3d);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        jts.Envelope envelope4 = new jts.Envelope(10.5d, 19.0d, (double) 1L, 105.2d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 104.2d + "'", double5 == 104.2d);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        jts.Envelope envelope4 = new jts.Envelope((double) (-4), (double) 100.0f, 102.0d, 104.1d);
        envelope4.init((double) 6L, 58.0d, 13.0d, (-8.7d));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        jts.Envelope envelope4 = new jts.Envelope((double) 4L, 2.1d, 14.6d, 13.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.5999999999999996d + "'", double6 == 1.5999999999999996d);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) 100, (double) 0, 84.0d, (double) 10L);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 74.0d + "'", double5 == 74.0d);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        envelope4.init((-5.4d), (-8.7d), (double) 5L, (double) 7);
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.maxExtent();
        double double14 = envelope4.getHeight();
        double double15 = envelope4.getHeight();
        envelope4.init((double) 1.0f, (double) 2L, 4.400000000000006d, 72.9d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.299999999999999d + "'", double12 == 3.299999999999999d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.299999999999999d + "'", double13 == 3.299999999999999d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.0d + "'", double14 == 2.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2.0d + "'", double15 == 2.0d);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.getHeight();
        envelope4.init((double) 100L, (double) (byte) 100, 14.0d, 102.7d);
        envelope4.init(3.0d, (double) 1L, (double) (short) 10, (double) (-1L));
        envelope4.init(203.5d, 23.5d, 130.2d, 181.70000000000002d);
        envelope4.init((double) (-8), 4.0d, 1.9000000000000004d, 84.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        jts.Envelope envelope4 = new jts.Envelope(102.3d, 8.0d, 4.0d, (double) (byte) 100);
        double double5 = envelope4.getHeight();
        envelope4.init(109.1d, 97.0d, (double) (-2L), 15.4d);
        envelope4.init(13.3d, 11.9d, 98.0d, 94.0d);
        double double16 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 96.0d + "'", double5 == 96.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        jts.Envelope envelope4 = new jts.Envelope(9.900000000000002d, (double) (byte) 100, 204.0d, 85.9d);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, 2.5999999999999996d, 95.0d, 10.5d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.maxExtent();
        double double9 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 84.5d + "'", double5 == 84.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 84.5d + "'", double6 == 84.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.4d + "'", double7 == 5.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 84.5d + "'", double8 == 84.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 84.5d + "'", double9 == 84.5d);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        jts.Envelope envelope4 = new jts.Envelope(92.7d, (double) (-10L), 1.2d, (double) (-8L));
        envelope4.init(95.2d, 8.7d, 1.7000000000000002d, 92.0d);
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass12 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 90.3d + "'", double10 == 90.3d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 90.3d + "'", double11 == 90.3d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        jts.Envelope envelope4 = new jts.Envelope(3.9000000000000004d, 55.0d, 0.0d, 13.6d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 51.1d + "'", double5 == 51.1d);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        envelope4.init((double) (-8), (double) (-9), (double) (-100), (double) 2L);
        double double16 = envelope4.getHeight();
        double double17 = envelope4.getHeight();
        envelope4.init(20.0d, 0.0d, (double) (short) 100, 96.9d);
        double double23 = envelope4.getHeight();
        double double24 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 102.0d + "'", double16 == 102.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 102.0d + "'", double17 == 102.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 3.0999999999999943d + "'", double23 == 3.0999999999999943d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 20.0d + "'", double24 == 20.0d);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getHeight();
        double double14 = envelope4.getHeight();
        boolean boolean15 = envelope4.isEnvelopeNull();
        envelope4.init(2.7d, 4.0d, 1.7000000000000004d, 76.0d);
        boolean boolean21 = envelope4.isEnvelopeNull();
        double double22 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 104.0d + "'", double12 == 104.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 104.0d + "'", double14 == 104.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 74.3d + "'", double22 == 74.3d);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        jts.Envelope envelope4 = new jts.Envelope(100.0d, (double) (short) -1, 0.0d, 0.0d);
        envelope4.init((double) 0, (double) 5, (-9.3d), (double) ' ');
        double double10 = envelope4.getHeight();
        double double11 = envelope4.getWidth();
        double double12 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 41.3d + "'", double10 == 41.3d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5.0d + "'", double11 == 5.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 5.0d + "'", double12 == 5.0d);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        envelope4.init((double) 1, 200.0d, (-7.3d), 87.0d);
        double double13 = envelope4.getWidth();
        double double14 = envelope4.getWidth();
        double double15 = envelope4.getHeight();
        envelope4.init(0.9000000000000057d, 54.0d, 0.6000000000000005d, 86.6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 199.0d + "'", double13 == 199.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 199.0d + "'", double14 == 199.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 94.3d + "'", double15 == 94.3d);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getHeight();
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.getHeight();
        double double15 = envelope4.maxExtent();
        double double16 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass17 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 104.0d + "'", double12 == 104.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 104.0d + "'", double14 == 104.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 106.0d + "'", double15 == 106.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 104.0d + "'", double16 == 104.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        jts.Envelope envelope4 = new jts.Envelope(74.69999999999999d, 103.2d, 107.3d, 9.900000000000002d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        jts.Envelope envelope4 = new jts.Envelope(90.49999999999999d, 121.6d, 80.19999999999999d, 94.2d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 14.000000000000014d + "'", double5 == 14.000000000000014d);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        jts.Envelope envelope4 = new jts.Envelope(12.0d, 67.0d, 12.799999999999983d, 3.8000000000000007d);
        double double5 = envelope4.maxExtent();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 55.0d + "'", double5 == 55.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        jts.Envelope envelope4 = new jts.Envelope(1.7000000000000004d, 46.2d, 82.3d, 19.7d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 62.599999999999994d + "'", double5 == 62.599999999999994d);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        jts.Envelope envelope4 = new jts.Envelope(15.3d, 52.5d, 111.3d, 90.8d);
        envelope4.init(56.1d, 3.7d, 22.5d, (double) 0L);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        jts.Envelope envelope4 = new jts.Envelope(9.5d, 6.9d, 11.9d, 9.100000000000003d);
        envelope4.init(90.2d, 41.2d, 0.0d, 3.3999999999999995d);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        jts.Envelope envelope4 = new jts.Envelope(27.3d, 0.3999999999999999d, 3.1d, 105.7d);
        envelope4.init((double) (-10), (double) (-100L), 153.6d, 4.8d);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
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
        envelope4.init(2.4d, 114.1d, 9.399999999999999d, 2.8d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 34.0d + "'", double26 == 34.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 34.0d + "'", double27 == 34.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 55.0d + "'", double28 == 55.0d);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        double double13 = envelope4.maxExtent();
        envelope4.init(96.9d, 92.0d, (-4.6d), 85.4d);
        envelope4.init(100.2d, 78.7d, 32.099999999999994d, 26.2d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 109.0d + "'", double13 == 109.0d);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        jts.Envelope envelope4 = new jts.Envelope((double) 7L, (double) 1L, 36.29999999999999d, 0.5d);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        jts.Envelope envelope4 = new jts.Envelope(1.7000000000000002d, 13.0d, (double) 1, (double) 0);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        envelope4.init(57.099999999999994d, 95.7d, 28.0d, 4.6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 11.3d + "'", double5 == 11.3d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 11.3d + "'", double6 == 11.3d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 11.3d + "'", double7 == 11.3d);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        jts.Envelope envelope4 = new jts.Envelope(17.4d, 12.6d, 83.89999999999999d, 105.7d);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        jts.Envelope envelope4 = new jts.Envelope((-9.3d), (double) 0.0f, 25.1d, 116.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        jts.Envelope envelope4 = new jts.Envelope((double) (-8L), 105.0d, 106.0d, 87.0d);
        envelope4.init(50.0d, (double) (-7L), 58.7d, 7.6d);
        java.lang.Class<?> wildcardClass10 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        jts.Envelope envelope4 = new jts.Envelope((double) 0L, 100.0d, 92.0d, 92.7d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
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
        boolean boolean33 = envelope4.isEnvelopeNull();
        double double34 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 6.9d + "'", double21 == 6.9d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 6.9d + "'", double22 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 108.4d + "'", double34 == 108.4d);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        jts.Envelope envelope4 = new jts.Envelope(100.0d, 10.5d, (double) 2, (-100.0d));
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getWidth();
        boolean boolean7 = envelope4.isEnvelopeNull();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getHeight();
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getWidth();
        boolean boolean12 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass13 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.0d + "'", double5 == 102.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 89.5d + "'", double6 == 89.5d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 102.0d + "'", double9 == 102.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 102.0d + "'", double10 == 102.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 89.5d + "'", double11 == 89.5d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        jts.Envelope envelope4 = new jts.Envelope(98.1d, 67.0d, 10.0d, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 31.099999999999994d + "'", double5 == 31.099999999999994d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 31.099999999999994d + "'", double6 == 31.099999999999994d);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) 10L, 100.0d, (double) 10L);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.maxExtent();
        boolean boolean8 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 90.0d + "'", double5 == 90.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 90.0d + "'", double6 == 90.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getWidth();
        envelope4.init(9.2d, (double) 100, (double) 0.0f, 92.0d);
        envelope4.init((-3.8d), (double) (-1L), (double) 100.0f, (double) (-1));
        double double19 = envelope4.getHeight();
        boolean boolean20 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 101.0d + "'", double19 == 101.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        jts.Envelope envelope4 = new jts.Envelope(106.2d, 72.3d, 43.6d, 32.0d);
        double double5 = envelope4.getHeight();
        envelope4.init(20.5d, 66.0d, 7.0d, 4.400000000000006d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 11.600000000000001d + "'", double5 == 11.600000000000001d);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getWidth();
        envelope4.init((double) 6, 1.2d, 18.0d, (-9.3d));
        envelope4.init((double) 100L, (-4.6d), 13.4d, 5.3d);
        boolean boolean24 = envelope4.isEnvelopeNull();
        double double25 = envelope4.getHeight();
        double double26 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 96.0d + "'", double11 == 96.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 96.0d + "'", double12 == 96.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.0d + "'", double13 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 8.100000000000001d + "'", double25 == 8.100000000000001d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 104.6d + "'", double26 == 104.6d);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        jts.Envelope envelope4 = new jts.Envelope((double) 9L, (double) 10, (double) (-7L), (double) 0L);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getWidth();
        boolean boolean7 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        envelope4.init(82.3d, 92.9d, 103.5d, 96.9d);
        double double12 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.600000000000009d + "'", double12 == 10.600000000000009d);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        jts.Envelope envelope4 = new jts.Envelope(18.9d, (double) (-2L), 17.400000000000006d, 53.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.599999999999994d + "'", double5 == 35.599999999999994d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.599999999999994d + "'", double6 == 35.599999999999994d);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        jts.Envelope envelope4 = new jts.Envelope(75.9d, 24.2d, 27.0d, 3.9000000000000004d);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        jts.Envelope envelope4 = new jts.Envelope(67.30000000000001d, 36.9d, 33.0d, 2.0d);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, (double) (-100L), 0.0d, (double) 10);
        double double5 = envelope4.getHeight();
        envelope4.init(0.0d, (double) (-7), (double) 10.0f, 111.3d);
        double double11 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7.0d + "'", double11 == 7.0d);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        boolean boolean9 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass10 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        jts.Envelope envelope4 = new jts.Envelope(4.400000000000006d, 21.0d, 78.0d, (double) 0);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1.0f), (double) (-9), (double) 2, (double) 10);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        envelope4.init(7.7d, 90.49999999999999d, (double) (-1L), 3.1d);
        boolean boolean12 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        jts.Envelope envelope4 = new jts.Envelope(102.1d, 0.0d, 95.2d, 1.7000000000000002d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        jts.Envelope envelope4 = new jts.Envelope(90.3d, (double) (-1), (double) 100L, 3.1d);
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 91.3d + "'", double5 == 91.3d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 91.3d + "'", double7 == 91.3d);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getHeight();
        envelope4.init((double) ' ', (-2.1d), 109.0d, (double) 6);
        boolean boolean11 = envelope4.isEnvelopeNull();
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 103.0d + "'", double12 == 103.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 103.0d + "'", double13 == 103.0d);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        jts.Envelope envelope4 = new jts.Envelope(3.299999999999999d, 7.1d, 0.0d, (double) 2L);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        jts.Envelope envelope4 = new jts.Envelope(17.6d, (double) (byte) 1, (double) (byte) 100, (-10.5d));
        double double5 = envelope4.maxExtent();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 110.5d + "'", double5 == 110.5d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 110.5d + "'", double7 == 110.5d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 16.6d + "'", double9 == 16.6d);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.maxExtent();
        boolean boolean9 = envelope4.isEnvelopeNull();
        double double10 = envelope4.getWidth();
        envelope4.init(73.0d, (double) 'a', 4.8d, 34.0d);
        boolean boolean16 = envelope4.isEnvelopeNull();
        double double17 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.0d + "'", double10 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 29.2d + "'", double17 == 29.2d);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getHeight();
        envelope4.init((double) 0L, 104.0d, 102.0d, (double) 3);
        double double13 = envelope4.getWidth();
        envelope4.init((double) (short) 1, (double) (-7), (double) 1, 109.0d);
        double double19 = envelope4.maxExtent();
        double double20 = envelope4.getHeight();
        double double21 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 108.0d + "'", double19 == 108.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 108.0d + "'", double20 == 108.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 108.0d + "'", double21 == 108.0d);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        envelope4.init(109.1d, (double) (-5), 22.3d, 106.0d);
        double double14 = envelope4.getHeight();
        double double15 = envelope4.getWidth();
        double double16 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 83.7d + "'", double14 == 83.7d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 114.1d + "'", double15 == 114.1d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 114.1d + "'", double16 == 114.1d);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        jts.Envelope envelope4 = new jts.Envelope((double) 0, 89.5d, 193.0d, 10.4d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 89.5d + "'", double5 == 89.5d);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        jts.Envelope envelope4 = new jts.Envelope(95.10000000000001d, 14.4d, 6.900000000000006d, 18.9d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 80.7d + "'", double6 == 80.7d);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
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
        envelope4.init(86.5d, 88.7d, 95.2d, (double) 100L);
        double double31 = envelope4.maxExtent();
        double double32 = envelope4.getWidth();
        boolean boolean33 = envelope4.isEnvelopeNull();
        double double34 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 6.9d + "'", double19 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 4.799999999999997d + "'", double31 == 4.799999999999997d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 2.200000000000003d + "'", double32 == 2.200000000000003d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 4.799999999999997d + "'", double34 == 4.799999999999997d);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getHeight();
        double double10 = envelope4.getWidth();
        envelope4.init(111.0d, (double) 10, (double) 10L, (double) (-100L));
        double double16 = envelope4.maxExtent();
        double double17 = envelope4.maxExtent();
        envelope4.init((double) (byte) 1, 41.3d, 100.60000000000001d, 103.7d);
        double double23 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.4d + "'", double9 == 8.4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.0d + "'", double10 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 110.0d + "'", double16 == 110.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 110.0d + "'", double17 == 110.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 40.3d + "'", double23 == 40.3d);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        jts.Envelope envelope4 = new jts.Envelope(98.0d, 106.9d, 88.7d, 61.9d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 26.800000000000004d + "'", double5 == 26.800000000000004d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        jts.Envelope envelope4 = new jts.Envelope(102.3d, 8.0d, 4.0d, (double) (byte) 100);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 96.0d + "'", double5 == 96.0d);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        jts.Envelope envelope4 = new jts.Envelope(17.4d, 9.6d, 1.0d, 200.0d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 199.0d + "'", double5 == 199.0d);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        jts.Envelope envelope4 = new jts.Envelope(12.799999999999983d, 62.0d, 105.2d, (double) (-2));
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        jts.Envelope envelope4 = new jts.Envelope(35.5d, 104.0d, 17.5d, 101.2d);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        jts.Envelope envelope4 = new jts.Envelope(80.0d, 81.3d, 39.4d, (double) 5);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        envelope4.init(43.6d, 117.4d, 198.1d, 14.0d);
        envelope4.init(49.400000000000006d, 38.0d, 15.6d, 94.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 103.0d + "'", double6 == 103.0d);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        jts.Envelope envelope4 = new jts.Envelope(105.0d, 3.3999999999999915d, 82.3d, 44.5d);
        double double5 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.60000000000001d + "'", double5 == 101.60000000000001d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        jts.Envelope envelope4 = new jts.Envelope(11.9d, 0.0d, (double) (-4), 34.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 38.0d + "'", double5 == 38.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 38.0d + "'", double6 == 38.0d);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init((double) ' ', (double) 1, (double) (short) -1, 100.0d);
        double double12 = envelope4.getWidth();
        double double13 = envelope4.getWidth();
        double double14 = envelope4.getWidth();
        boolean boolean15 = envelope4.isEnvelopeNull();
        envelope4.init(1.2d, 88.6d, 95.2d, 5.1d);
        double double21 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 31.0d + "'", double12 == 31.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 31.0d + "'", double13 == 31.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 31.0d + "'", double14 == 31.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 90.10000000000001d + "'", double21 == 90.10000000000001d);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.getHeight();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getHeight();
        double double10 = envelope4.maxExtent();
        boolean boolean11 = envelope4.isEnvelopeNull();
        boolean boolean12 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.0d + "'", double10 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        double double16 = envelope4.getWidth();
        double double17 = envelope4.maxExtent();
        boolean boolean18 = envelope4.isEnvelopeNull();
        envelope4.init((double) 1, (double) 4L, 109.0d, 5.8d);
        double double24 = envelope4.maxExtent();
        boolean boolean25 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 103.2d + "'", double24 == 103.2d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        jts.Envelope envelope4 = new jts.Envelope((double) 'a', (double) (byte) 1, 2.3d, (double) 0L);
        double double5 = envelope4.getHeight();
        envelope4.init((double) (-8L), (double) (byte) 1, 13.0d, (-10.5d));
        boolean boolean11 = envelope4.isEnvelopeNull();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.maxExtent();
        double double14 = envelope4.getHeight();
        double double15 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3d + "'", double5 == 2.3d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 23.5d + "'", double12 == 23.5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 23.5d + "'", double13 == 23.5d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 23.5d + "'", double14 == 23.5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 9.0d + "'", double15 == 9.0d);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        jts.Envelope envelope4 = new jts.Envelope((double) 7L, (double) 5L, (double) 9L, 6.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init(4.299999999999999d, 97.80000000000001d, 38.0d, 73.0d);
        boolean boolean11 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.0d + "'", double5 == 3.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        double double13 = envelope4.getHeight();
        double double14 = envelope4.getHeight();
        double double15 = envelope4.maxExtent();
        envelope4.init(8.8d, 21.5d, 8.7d, (double) (-4));
        boolean boolean21 = envelope4.isEnvelopeNull();
        boolean boolean22 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 109.0d + "'", double15 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        jts.Envelope envelope4 = new jts.Envelope(44.3d, 65.0d, 27.3d, 98.89999999999999d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.700000000000003d + "'", double5 == 20.700000000000003d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 71.6d + "'", double6 == 71.6d);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        jts.Envelope envelope4 = new jts.Envelope((double) 'a', (double) (byte) 1, 2.3d, (double) 0L);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getWidth();
        envelope4.init(100.0d, (double) 5L, 1.799999999999999d, (-7.3d));
        double double13 = envelope4.getHeight();
        double double14 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3d + "'", double5 == 2.3d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 96.0d + "'", double7 == 96.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 9.099999999999998d + "'", double13 == 9.099999999999998d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 9.099999999999998d + "'", double14 == 9.099999999999998d);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) 100, (double) 0, 84.0d, (double) 10L);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        jts.Envelope envelope4 = new jts.Envelope(44.5d, 3.3999999999999915d, 1.6999999999999993d, 34.7d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        jts.Envelope envelope4 = new jts.Envelope((-10.5d), 19.7d, 10.0d, 102.0d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 92.0d + "'", double5 == 92.0d);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        jts.Envelope envelope4 = new jts.Envelope((-1.2d), 1.3000000000000007d, 76.3d, 84.3d);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        jts.Envelope envelope4 = new jts.Envelope((double) 10L, 2.1d, 94.1d, 0.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        jts.Envelope envelope4 = new jts.Envelope(58.7d, 16.0d, 111.9d, (double) 8);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        envelope4.init(100.0d, 28.0d, 20.0d, 19.8d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.9d + "'", double5 == 103.9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 103.9d + "'", double6 == 103.9d);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getHeight();
        envelope4.init((double) ' ', (-2.1d), 109.0d, (double) 6);
        envelope4.init((double) 10L, (double) 6L, (double) 0L, (-2.1d));
        double double16 = envelope4.getWidth();
        double double17 = envelope4.maxExtent();
        envelope4.init(12.6d, 14.0d, 6.1d, 92.0d);
        double double23 = envelope4.getHeight();
        boolean boolean24 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.0d + "'", double17 == 4.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 85.9d + "'", double23 == 85.9d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        jts.Envelope envelope4 = new jts.Envelope(6.3d, 36.7d, (-8.7d), 77.9d);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        jts.Envelope envelope4 = new jts.Envelope(51.0d, 12.6d, (-1.2d), 0.0d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getHeight();
        envelope4.init(2.3d, 9.9d, 10.600000000000009d, 107.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 104.0d + "'", double12 == 104.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        jts.Envelope envelope4 = new jts.Envelope(99.7d, 74.6d, 33.599999999999994d, 22.0d);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        jts.Envelope envelope4 = new jts.Envelope((double) (-100), (double) ' ', (double) (-7L), 85.3d);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        jts.Envelope envelope4 = new jts.Envelope(86.0d, 94.0d, (double) (-10), (double) 100L);
        boolean boolean5 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        jts.Envelope envelope4 = new jts.Envelope(0.6999999999999993d, 5.4d, (double) (-4L), (double) (byte) 100);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        jts.Envelope envelope4 = new jts.Envelope(17.4d, 9.6d, 1.0d, 200.0d);
        double double5 = envelope4.getHeight();
        envelope4.init(2.9000000000000004d, 1.3999999999999986d, 9.5d, (double) (byte) 10);
        double double11 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 199.0d + "'", double5 == 199.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.5000000000000018d + "'", double11 == 1.5000000000000018d);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        jts.Envelope envelope4 = new jts.Envelope(92.2d, (double) 2, 14.700000000000003d, 98.2d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 83.5d + "'", double5 == 83.5d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        jts.Envelope envelope4 = new jts.Envelope(34.0d, 55.0d, 92.3d, 95.7d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getWidth();
        envelope4.init(4.2d, 62.699999999999996d, (double) 'a', 114.9d);
        envelope4.init(96.19999999999999d, (double) 7, 33.2d, 104.39999999999999d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 21.0d + "'", double5 == 21.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 21.0d + "'", double6 == 21.0d);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        jts.Envelope envelope4 = new jts.Envelope(42.3d, 113.0d, 12.4d, 27.900000000000006d);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        jts.Envelope envelope4 = new jts.Envelope((double) (-6L), (double) (byte) 100, (double) (short) 1, (double) (short) 0);
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init(18.9d, (double) (short) 100, (double) (short) 1, 94.3d);
        double double11 = envelope4.getWidth();
        boolean boolean12 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 81.1d + "'", double11 == 81.1d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        jts.Envelope envelope4 = new jts.Envelope(20.9d, (double) 7L, 90.3d, 33.599999999999994d);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 0.0d, (double) 10.0f, 102.3d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 92.3d + "'", double5 == 92.3d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        jts.Envelope envelope4 = new jts.Envelope(200.0d, 94.0d, 89.2d, 104.39999999999999d);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        jts.Envelope envelope4 = new jts.Envelope((double) (-7), 3.7d, 11.9d, (double) (-8));
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        jts.Envelope envelope4 = new jts.Envelope(31.0d, (double) (byte) 100, 2.9000000000000004d, 5.0d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.maxExtent();
        boolean boolean7 = envelope4.isEnvelopeNull();
        double double8 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 69.0d + "'", double5 == 69.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 69.0d + "'", double6 == 69.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 69.0d + "'", double8 == 69.0d);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        jts.Envelope envelope4 = new jts.Envelope(85.3d, 9.399999999999999d, 6.0d, 0.40000000000000036d);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        jts.Envelope envelope4 = new jts.Envelope(5.0d, 5.3d, (double) (-100L), (double) (-2L));
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2999999999999998d + "'", double5 == 0.2999999999999998d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2999999999999998d + "'", double7 == 0.2999999999999998d);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        jts.Envelope envelope4 = new jts.Envelope(109.0d, 1.7999999999999998d, 1.0d, 14.9d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 107.2d + "'", double7 == 107.2d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 107.2d + "'", double8 == 107.2d);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        envelope4.init(0.2999999999999998d, (double) 7, (double) (-3L), (double) 1L);
        double double13 = envelope4.getHeight();
        envelope4.init(194.0d, (-6.9d), 6.300000000000001d, 0.0d);
        java.lang.Class<?> wildcardClass19 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.0d + "'", double13 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        jts.Envelope envelope4 = new jts.Envelope((double) (-3), (-100.0d), (-3.8d), 90.3d);
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 94.1d + "'", double7 == 94.1d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        jts.Envelope envelope4 = new jts.Envelope(92.7d, (double) (-1L), (double) 7, 31.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 24.0d + "'", double5 == 24.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 24.0d + "'", double7 == 24.0d);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
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
        envelope4.init(86.5d, 88.7d, 95.2d, (double) 100L);
        double double31 = envelope4.maxExtent();
        double double32 = envelope4.getWidth();
        envelope4.init(113.39999999999999d, 57.0d, 61.4d, 97.4d);
        double double38 = envelope4.maxExtent();
        envelope4.init(204.5d, 19.4d, 88.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 6.9d + "'", double19 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 4.799999999999997d + "'", double31 == 4.799999999999997d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 2.200000000000003d + "'", double32 == 2.200000000000003d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 56.39999999999999d + "'", double38 == 56.39999999999999d);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getWidth();
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.getWidth();
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.getWidth();
        double double14 = envelope4.maxExtent();
        double double15 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass16 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.0d + "'", double12 == 8.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.0d + "'", double14 == 8.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 8.0d + "'", double15 == 8.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 39.400000000000006d, 9.6d, 46.099999999999994d);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        jts.Envelope envelope4 = new jts.Envelope(87.1d, 19.700000000000003d, 18.0d, 115.1d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.1d + "'", double5 == 97.1d);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init((double) (-2L), (-3.8d), (double) (-7L), (double) 1.0f);
        envelope4.init(2.8d, 1.3000000000000007d, (double) 4L, 48.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init((double) 100, (-100.0d), (double) '#', 5.0d);
        boolean boolean16 = envelope4.isEnvelopeNull();
        boolean boolean17 = envelope4.isEnvelopeNull();
        double double18 = envelope4.getWidth();
        double double19 = envelope4.getWidth();
        double double20 = envelope4.maxExtent();
        double double21 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 200.0d + "'", double18 == 200.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 200.0d + "'", double19 == 200.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 200.0d + "'", double20 == 200.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 200.0d + "'", double21 == 200.0d);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        jts.Envelope envelope4 = new jts.Envelope((double) (-3L), 100.0d, 25.1d, 3.3d);
        envelope4.init(20.9d, 196.3d, 107.9d, (double) 0L);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        jts.Envelope envelope4 = new jts.Envelope(77.9d, 90.80000000000001d, 7.0d, 132.0d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        jts.Envelope envelope4 = new jts.Envelope(1.3000000000000025d, 108.7d, 104.0d, 190.1d);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, (double) 4, 103.0d, 76.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 27.0d + "'", double6 == 27.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 27.0d + "'", double7 == 27.0d);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        jts.Envelope envelope4 = new jts.Envelope(31.0d, (double) (byte) 100, 2.9000000000000004d, 5.0d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getWidth();
        envelope4.init(83.3d, (double) (-1), 88.4d, 33.7d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 69.0d + "'", double5 == 69.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 69.0d + "'", double6 == 69.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 69.0d + "'", double7 == 69.0d);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        jts.Envelope envelope4 = new jts.Envelope(72.0d, 190.1d, 90.39999999999999d, 69.0d);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 1, (double) 0.0f, (double) 6, (double) 3L);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        boolean boolean7 = envelope4.isEnvelopeNull();
        envelope4.init((double) 8L, (double) 7, 13.6d, 53.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        jts.Envelope envelope4 = new jts.Envelope(2.9000000000000004d, 10.5d, (double) (-5), (double) (-8));
        double double5 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.6d + "'", double5 == 7.6d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        jts.Envelope envelope4 = new jts.Envelope(11.9d, 0.0d, (double) (-4), 34.0d);
        envelope4.init(12.6d, 15.0d, (double) 8L, 1.799999999999999d);
        envelope4.init((double) (-8L), 6.300000000000001d, (double) 4L, 12.0d);
        double double15 = envelope4.maxExtent();
        double double16 = envelope4.getHeight();
        double double17 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 14.3d + "'", double15 == 14.3d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 8.0d + "'", double16 == 8.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
    }
}

