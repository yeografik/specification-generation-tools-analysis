package jts;

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
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        envelope4.init((double) (byte) 1, (double) (-8L), (double) 8L, (double) (-4L));
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.getHeight();
        boolean boolean12 = envelope4.isEnvelopeNull();
        envelope4.init((-1.2d), 85.4d, 0.0d, 92.3d);
        envelope4.init(92.8d, 5.800000000000001d, 11.799999999999997d, 134.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 12.0d + "'", double11 == 12.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        jts.Envelope envelope4 = new jts.Envelope(1.2d, 29.299999999999997d, 0.0d, (double) (short) 10);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        jts.Envelope envelope4 = new jts.Envelope(5.0d, 5.3d, (double) (-100L), (double) (-2L));
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) (-100), 22.3d, 94.3d, (-4.6d));
        envelope4.init(122.6d, 108.0d, 90.3d, (double) (-3L));
        boolean boolean17 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 98.0d + "'", double6 == 98.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        jts.Envelope envelope4 = new jts.Envelope((-2.1d), 26.80000000000001d, 50.1d, 113.39999999999999d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 28.900000000000013d + "'", double5 == 28.900000000000013d);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        jts.Envelope envelope4 = new jts.Envelope((double) (-8L), 10.0d, (double) (-6L), (double) 8);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.getHeight();
        envelope4.init((double) (short) 0, 11.1d, 64.0d, 46.3d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 14.0d + "'", double6 == 14.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 14.0d + "'", double7 == 14.0d);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init((double) 100, (-100.0d), (double) '#', 5.0d);
        envelope4.init((double) 5, (double) (short) 10, 96.0d, (double) (byte) 10);
        boolean boolean21 = envelope4.isEnvelopeNull();
        boolean boolean22 = envelope4.isEnvelopeNull();
        envelope4.init(130.2d, 117.4d, 1.2999999999999998d, (-100.0d));
        double double28 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 12.799999999999983d + "'", double28 == 12.799999999999983d);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        jts.Envelope envelope4 = new jts.Envelope(5.0d, 5.3d, (double) (-100L), (double) (-2L));
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2999999999999998d + "'", double6 == 0.2999999999999998d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 98.0d + "'", double7 == 98.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 98.0d + "'", double8 == 98.0d);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        envelope4.init(44.60000000000001d, 102.3d, 95.0d, (double) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        jts.Envelope envelope4 = new jts.Envelope(86.5d, 42.0d, 24.0d, 69.0d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 44.5d + "'", double5 == 44.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 45.0d + "'", double6 == 45.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 45.0d + "'", double7 == 45.0d);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        jts.Envelope envelope4 = new jts.Envelope((double) 3, (-10.5d), (-9.3d), 1.799999999999999d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.maxExtent();
        envelope4.init(107.0d, 1.1999999999999886d, 66.0d, (double) 100.0f);
        java.lang.Class<?> wildcardClass13 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 13.5d + "'", double5 == 13.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 11.1d + "'", double6 == 11.1d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 13.5d + "'", double7 == 13.5d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.getHeight();
        boolean boolean9 = envelope4.isEnvelopeNull();
        double double10 = envelope4.getWidth();
        double double11 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.0d + "'", double10 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.4d + "'", double11 == 8.4d);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        jts.Envelope envelope4 = new jts.Envelope(44.5d, 198.1d, 115.1d, 11.3d);
        double double5 = envelope4.maxExtent();
        envelope4.init(13.4d, (-5.4d), 98.89999999999999d, 102.7d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 153.6d + "'", double5 == 153.6d);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        jts.Envelope envelope4 = new jts.Envelope(24.0d, (double) 2, 104.0d, (-7.3d));
        double double5 = envelope4.maxExtent();
        envelope4.init(58.5d, 58.5d, 65.0d, 3.1d);
        double double11 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass12 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 111.3d + "'", double5 == 111.3d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 61.9d + "'", double11 == 61.9d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        jts.Envelope envelope4 = new jts.Envelope(33.7d, 80.0d, 8.600000000000001d, 0.0d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init((double) 100, (-100.0d), (double) '#', 5.0d);
        envelope4.init((double) 1L, (double) (byte) 100, (double) (-8L), (double) (-1));
        double double21 = envelope4.getWidth();
        envelope4.init((double) 1, 2.9000000000000004d, (double) 1, (-2.1d));
        double double27 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 99.0d + "'", double21 == 99.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 3.1d + "'", double27 == 3.1d);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        jts.Envelope envelope4 = new jts.Envelope(3.299999999999999d, 12.3d, 19.0d, 65.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init(5.1d, (double) (-7L), 16.200000000000003d, 30.2d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.getHeight();
        boolean boolean9 = envelope4.isEnvelopeNull();
        boolean boolean10 = envelope4.isEnvelopeNull();
        envelope4.init(24.5d, (double) (-4), 0.0d, 98.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        jts.Envelope envelope4 = new jts.Envelope(27.0d, 82.3d, 10.4d, 90.3d);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        jts.Envelope envelope4 = new jts.Envelope(17.200000000000003d, 79.7d, 17.0d, 83.9d);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        jts.Envelope envelope4 = new jts.Envelope(3.0999999999999996d, 0.0d, 4.4d, 30.0d);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
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
        boolean boolean14 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass15 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.0d + "'", double11 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 1, (double) 0.0f, (double) 6, (double) 3L);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init(5.800000000000001d, 14.0d, 7.699999999999999d, 39.4d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.0d + "'", double5 == 3.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        jts.Envelope envelope4 = new jts.Envelope((double) 100L, 100.0d, (-9.3d), 6.9d);
        double double5 = envelope4.getWidth();
        envelope4.init(3.8000000000000007d, 95.0d, 38.1d, 10.9d);
        double double11 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 91.2d + "'", double11 == 91.2d);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        jts.Envelope envelope4 = new jts.Envelope(100.0d, 10.5d, (double) 2, (-100.0d));
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getWidth();
        boolean boolean7 = envelope4.isEnvelopeNull();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getHeight();
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass12 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.0d + "'", double5 == 102.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 89.5d + "'", double6 == 89.5d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 102.0d + "'", double9 == 102.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 102.0d + "'", double10 == 102.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 89.5d + "'", double11 == 89.5d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        jts.Envelope envelope4 = new jts.Envelope(3.299999999999999d, 11.1d, 15.3d, (double) (-5L));
        envelope4.init(87.3d, (double) (short) 10, 55.89999999999999d, 0.0d);
        double double10 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 77.3d + "'", double10 == 77.3d);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        envelope4.init((double) (byte) 1, (double) (-8L), (double) 8L, (double) (-4L));
        boolean boolean10 = envelope4.isEnvelopeNull();
        boolean boolean11 = envelope4.isEnvelopeNull();
        envelope4.init(51.0d, (double) (-1L), 0.6999999999999993d, 6.1d);
        double double17 = envelope4.maxExtent();
        envelope4.init(86.6d, 15.0d, 85.0d, 0.0d);
        double double23 = envelope4.getHeight();
        boolean boolean24 = envelope4.isEnvelopeNull();
        double double25 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 85.0d + "'", double23 == 85.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 85.0d + "'", double25 == 85.0d);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        jts.Envelope envelope4 = new jts.Envelope((-8.7d), 0.0d, (double) (short) 10, 96.0d);
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        boolean boolean7 = envelope4.isEnvelopeNull();
        double double8 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass9 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.7d + "'", double5 == 8.7d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.7d + "'", double8 == 8.7d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        jts.Envelope envelope4 = new jts.Envelope(117.7d, 56.900000000000006d, 83.99999999999999d, (double) 100.0f);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 16.000000000000014d + "'", double5 == 16.000000000000014d);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        jts.Envelope envelope4 = new jts.Envelope(90.39999999999999d, 41.2d, 79.7d, 111.3d);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        jts.Envelope envelope4 = new jts.Envelope((double) (-8L), 10.0d, (double) (-6L), (double) 8);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getWidth();
        boolean boolean10 = envelope4.isEnvelopeNull();
        boolean boolean11 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.0d + "'", double7 == 18.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 18.0d + "'", double9 == 18.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        jts.Envelope envelope4 = new jts.Envelope((double) 8L, (-5.4d), 5.8d, (double) 10L);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        boolean boolean7 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 13.4d + "'", double6 == 13.4d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) (-1L), (double) (-1.0f), (double) 0L, 100.0d);
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.maxExtent();
        double double14 = envelope4.getWidth();
        boolean boolean15 = envelope4.isEnvelopeNull();
        boolean boolean16 = envelope4.isEnvelopeNull();
        envelope4.init(2.3d, 98.7d, 97.0d, 17.6d);
        double double22 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 96.4d + "'", double22 == 96.4d);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 1, 155.4d, 3.700000000000003d, 5.3d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        jts.Envelope envelope4 = new jts.Envelope((double) 7, (double) 10.0f, (double) 4L, (double) 0L);
        envelope4.init((double) 10, (double) 8, (double) 8, (-1.2d));
        double double10 = envelope4.getWidth();
        boolean boolean11 = envelope4.isEnvelopeNull();
        boolean boolean12 = envelope4.isEnvelopeNull();
        envelope4.init((-100.0d), 104.1d, (double) (-100L), (double) ' ');
        java.lang.Class<?> wildcardClass18 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.0d + "'", double10 == 2.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getWidth();
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.getWidth();
        double double12 = envelope4.maxExtent();
        boolean boolean13 = envelope4.isEnvelopeNull();
        boolean boolean14 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.0d + "'", double12 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        jts.Envelope envelope4 = new jts.Envelope(2.1d, 91.3d, 7.1d, 17.6d);
        double double5 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 89.2d + "'", double5 == 89.2d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        jts.Envelope envelope4 = new jts.Envelope(7.0d, 8.3d, 90.3d, 4.799999999999997d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass9 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 85.5d + "'", double5 == 85.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 85.5d + "'", double6 == 85.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 85.5d + "'", double7 == 85.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 85.5d + "'", double8 == 85.5d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.getHeight();
        double double14 = envelope4.getHeight();
        double double15 = envelope4.getWidth();
        double double16 = envelope4.getWidth();
        boolean boolean17 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 104.0d + "'", double14 == 104.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 106.0d + "'", double15 == 106.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 106.0d + "'", double16 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        jts.Envelope envelope4 = new jts.Envelope(92.7d, (double) (-1L), (double) 7, 31.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        envelope4.init(60.0d, 7.699999999999999d, 56.900000000000006d, 103.0d);
        double double13 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 24.0d + "'", double5 == 24.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 93.7d + "'", double6 == 93.7d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 93.7d + "'", double7 == 93.7d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 46.099999999999994d + "'", double13 == 46.099999999999994d);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
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
        double double34 = envelope4.getHeight();
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
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        jts.Envelope envelope4 = new jts.Envelope((double) (-7), (double) 4L, (-7.3d), (-100.0d));
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getHeight();
        boolean boolean7 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 11.0d + "'", double5 == 11.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 92.7d + "'", double6 == 92.7d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        jts.Envelope envelope4 = new jts.Envelope((double) 8, (double) (short) 0, 16.200000000000003d, 17.6d);
        double double5 = envelope4.maxExtent();
        envelope4.init(2.3d, 20.0d, 88.6d, 128.0d);
        double double11 = envelope4.maxExtent();
        envelope4.init(8.7d, 110.5d, 2.100000000000003d, 204.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 39.400000000000006d + "'", double11 == 39.400000000000006d);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        jts.Envelope envelope4 = new jts.Envelope(102.7d, 0.0d, 12.0d, 103.0d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 91.0d + "'", double5 == 91.0d);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        jts.Envelope envelope4 = new jts.Envelope(58.7d, 77.3d, 103.9d, 15.0d);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
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
        boolean boolean22 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass23 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 8.0d + "'", double21 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getWidth();
        double double13 = envelope4.getHeight();
        double double14 = envelope4.maxExtent();
        double double15 = envelope4.getHeight();
        double double16 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 106.0d + "'", double14 == 106.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 104.0d + "'", double15 == 104.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 104.0d + "'", double16 == 104.0d);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        jts.Envelope envelope4 = new jts.Envelope(19.8d, 200.0d, 7.900000000000006d, 0.0d);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        jts.Envelope envelope4 = new jts.Envelope(8.600000000000001d, (-4.6d), 5.1d, 105.4d);
        double double5 = envelope4.getHeight();
        envelope4.init(6.7d, (-5.4d), 115.1d, 107.3d);
        java.lang.Class<?> wildcardClass11 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.30000000000001d + "'", double5 == 100.30000000000001d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        jts.Envelope envelope4 = new jts.Envelope(58.0d, 92.7d, 0.0d, 1.7000000000000002d);
        envelope4.init(82.9d, 19.8d, (double) 100, 52.0d);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.maxExtent();
        envelope4.init((double) 5L, (-6.9d), (-5.4d), 0.0d);
        envelope4.init((double) (-6L), (-7.3d), (double) (short) -1, (double) (-10));
        envelope4.init(2.0d, 3.299999999999999d, (double) 4, 89.5d);
        double double29 = envelope4.maxExtent();
        boolean boolean30 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 106.0d + "'", double13 == 106.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 85.5d + "'", double29 == 85.5d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        envelope4.init((double) (-8), (double) (-9), (double) (-100), (double) 2L);
        double double16 = envelope4.maxExtent();
        boolean boolean17 = envelope4.isEnvelopeNull();
        double double18 = envelope4.maxExtent();
        double double19 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 102.0d + "'", double16 == 102.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 102.0d + "'", double18 == 102.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 102.0d + "'", double19 == 102.0d);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        jts.Envelope envelope4 = new jts.Envelope(4.0d, 0.6000000000000005d, 43.6d, 132.0d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.3999999999999995d + "'", double5 == 3.3999999999999995d);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        jts.Envelope envelope4 = new jts.Envelope((double) '#', 107.0d, 194.0d, 94.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init(91.3d, 1.5999999999999996d, (double) 6, 1.3000000000000007d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getWidth();
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.getWidth();
        envelope4.init((double) 100L, 102.0d, 52.0d, 132.0d);
        boolean boolean17 = envelope4.isEnvelopeNull();
        double double18 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 80.0d + "'", double18 == 80.0d);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        jts.Envelope envelope4 = new jts.Envelope((double) (-3L), (double) (-9), 7.1d, (double) (byte) -1);
        envelope4.init((double) 0.0f, (double) (-1), 103.0d, 11.9d);
        double double10 = envelope4.getWidth();
        boolean boolean11 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 111.0d, 4.0d, 102.0d);
        envelope4.init(104.1d, 98.6d, (double) 6, 0.0d);
        java.lang.Class<?> wildcardClass10 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        envelope4.init((double) 3, 1.2d, (double) (-8), 104.1d);
        envelope4.init(111.0d, (double) 2L, 109.1d, 7.1d);
        double double21 = envelope4.maxExtent();
        double double22 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 109.0d + "'", double21 == 109.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 109.0d + "'", double22 == 109.0d);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        jts.Envelope envelope4 = new jts.Envelope(114.9d, 21.599999999999994d, 80.7d, 63.3d);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init((double) ' ', (double) 1, (double) (short) -1, 100.0d);
        double double12 = envelope4.getHeight();
        envelope4.init(92.7d, (-5.4d), 99.0d, 33.1d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 101.0d + "'", double12 == 101.0d);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        jts.Envelope envelope4 = new jts.Envelope(31.0d, (double) (byte) 100, 2.9000000000000004d, 5.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        envelope4.init(19.700000000000003d, (double) (short) 1, 98.4d, 73.1d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0999999999999996d + "'", double5 == 2.0999999999999996d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.0999999999999996d + "'", double7 == 2.0999999999999996d);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        jts.Envelope envelope4 = new jts.Envelope(2.9000000000000004d, 105.4d, 93.7d, (double) 8);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 10, (double) 100, (double) 1, (double) (byte) 100);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass8 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 99.0d + "'", double6 == 99.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, (-5.4d), 0.0d, 65.0d);
        envelope4.init(105.0d, 94.60000000000001d, 54.2d, (double) (short) 10);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        jts.Envelope envelope4 = new jts.Envelope((double) '4', (double) (-6L), (double) (-6), (double) 100L);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getHeight();
        boolean boolean8 = envelope4.isEnvelopeNull();
        envelope4.init(11.3d, 31.0d, 9.0d, 86.5d);
        double double14 = envelope4.getWidth();
        double double15 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 106.0d + "'", double5 == 106.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 106.0d + "'", double6 == 106.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 106.0d + "'", double7 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 19.7d + "'", double14 == 19.7d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 77.5d + "'", double15 == 77.5d);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        jts.Envelope envelope4 = new jts.Envelope((double) 100, 100.0d, (double) 0.0f, (double) 0L);
        envelope4.init(1.7000000000000002d, (double) (-5), 65.0d, (double) (-8));
        envelope4.init(5.0d, 3.5d, 109.7d, 7.1d);
        double double15 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 102.60000000000001d + "'", double15 == 102.60000000000001d);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        jts.Envelope envelope4 = new jts.Envelope(12.3d, 134.0d, 104.0d, 58.5d);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
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
        double double29 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 109.0d + "'", double13 == 109.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.2000000000000002d + "'", double21 == 1.2000000000000002d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 3.2d + "'", double22 == 3.2d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 6.0d + "'", double29 == 6.0d);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        jts.Envelope envelope4 = new jts.Envelope(6.9d, 90.6d, (double) (-8), 86.5d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 94.5d + "'", double6 == 94.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 94.5d + "'", double7 == 94.5d);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        jts.Envelope envelope4 = new jts.Envelope((double) 7, (double) 10.0f, (double) 4L, (double) 0L);
        envelope4.init((double) 10, (double) 8, (double) 8, (-1.2d));
        boolean boolean10 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
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
        boolean boolean22 = envelope4.isEnvelopeNull();
        double double23 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2.0d + "'", double21 == 2.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 6.9d + "'", double23 == 6.9d);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        jts.Envelope envelope4 = new jts.Envelope(14.3d, 20.0d, 88.3d, 80.19999999999999d);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        jts.Envelope envelope4 = new jts.Envelope(5.0d, 5.3d, (double) (-100L), (double) (-2L));
        envelope4.init((double) (byte) 100, 10.5d, (double) (-9L), 8.4d);
        envelope4.init(6.9d, (double) (-3L), (double) 7L, (double) (-6L));
        double double15 = envelope4.getHeight();
        double double16 = envelope4.getHeight();
        envelope4.init(41.2d, 95.10000000000001d, 88.8d, 18.7d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 13.0d + "'", double15 == 13.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 13.0d + "'", double16 == 13.0d);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), 19.0d, 98.7d, 113.39999999999999d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        envelope4.init((double) (byte) 1, (double) (-8L), (double) 8L, (double) (-4L));
        double double10 = envelope4.getWidth();
        envelope4.init((double) (-8), 34.0d, (double) 7, 7.699999999999999d);
        envelope4.init(11.1d, 20.9d, (double) 10, 2.0999999999999943d);
        double double21 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.0d + "'", double10 == 9.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 7.900000000000006d + "'", double21 == 7.900000000000006d);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        jts.Envelope envelope4 = new jts.Envelope(92.3d, (double) 'a', 73.0d, 21.7d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getHeight();
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        double double13 = envelope4.getHeight();
        double double14 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.4d + "'", double9 == 8.4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.0d + "'", double10 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.4d + "'", double11 == 8.4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.0d + "'", double12 == 8.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.4d + "'", double13 == 8.4d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.4d + "'", double14 == 8.4d);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        jts.Envelope envelope4 = new jts.Envelope((double) 7, (double) 5L, 8.8d, 99.2d);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 3.1d, 5.0d, 2.7d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        envelope4.init(98.7d, 62.0d, 90.0d, 60.0d);
        double double12 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass13 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.9d + "'", double5 == 6.9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.3d + "'", double6 == 2.3d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 36.7d + "'", double12 == 36.7d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        jts.Envelope envelope4 = new jts.Envelope(24.0d, (double) 2, 104.0d, (-7.3d));
        double double5 = envelope4.maxExtent();
        envelope4.init(58.5d, 58.5d, 65.0d, 3.1d);
        envelope4.init(77.0d, 1.0d, 3.299999999999997d, 14.3d);
        double double16 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 111.3d + "'", double5 == 111.3d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 76.0d + "'", double16 == 76.0d);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        jts.Envelope envelope4 = new jts.Envelope(5.1d, 3.299999999999999d, (double) '#', 107.0d);
        double double5 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.8000000000000007d + "'", double5 == 1.8000000000000007d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        jts.Envelope envelope4 = new jts.Envelope(89.5d, 86.0d, 0.0d, 95.2d);
        envelope4.init(0.0d, (double) 3L, 92.9d, (double) 9);
        envelope4.init(102.7d, 90.89999999999999d, 4.0d, 73.1d);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        jts.Envelope envelope4 = new jts.Envelope(72.3d, 51.0d, 61.0d, 1.6999999999999886d);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
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
        envelope4.init(193.0d, 96.0d, 109.7d, 7.0d);
        double double35 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass36 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 106.0d + "'", double13 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 102.7d + "'", double35 == 102.7d);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        jts.Envelope envelope4 = new jts.Envelope(5.8d, (double) 4, 10.0d, 106.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init(91.3d, (-10.5d), (-2.1d), 4.2d);
        double double11 = envelope4.getHeight();
        envelope4.init((double) (-6L), (double) (-1), 27.3d, 80.0d);
        envelope4.init((double) ' ', 21.1d, 88.5d, 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 96.0d + "'", double5 == 96.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 6.300000000000001d + "'", double11 == 6.300000000000001d);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) 10L, 100.0d, (double) 10L);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        boolean boolean7 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 90.0d + "'", double5 == 90.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
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
        double double28 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 104.0d + "'", double14 == 104.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 106.0d + "'", double15 == 106.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 106.0d + "'", double16 == 106.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 104.0d + "'", double17 == 104.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        jts.Envelope envelope4 = new jts.Envelope(100.0d, 10.5d, (double) 2, (-100.0d));
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getWidth();
        boolean boolean7 = envelope4.isEnvelopeNull();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getHeight();
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getWidth();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.0d + "'", double5 == 102.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 89.5d + "'", double6 == 89.5d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 102.0d + "'", double9 == 102.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 102.0d + "'", double10 == 102.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 89.5d + "'", double11 == 89.5d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 89.5d + "'", double13 == 89.5d);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        jts.Envelope envelope4 = new jts.Envelope(17.0d, 1.3999999999999986d, 4.000000000000005d, 35.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        jts.Envelope envelope4 = new jts.Envelope(126.4d, 77.3d, 0.7000000000000028d, 104.0d);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
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
        double double20 = envelope4.getWidth();
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 109.0d + "'", double20 == 109.0d);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        jts.Envelope envelope4 = new jts.Envelope((double) (-7L), (double) (short) 1, (double) 100L, 1.0d);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        jts.Envelope envelope4 = new jts.Envelope((double) (-8L), 10.0d, (double) (-6L), (double) 8);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getWidth();
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.0d + "'", double7 == 18.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 14.0d + "'", double8 == 14.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 18.0d + "'", double9 == 18.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 18.0d + "'", double11 == 18.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        jts.Envelope envelope4 = new jts.Envelope(7.899999999999999d, 17.200000000000003d, 0.0d, 66.0d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 66.0d + "'", double5 == 66.0d);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        jts.Envelope envelope4 = new jts.Envelope(6.0d, (double) 1L, 0.0d, 95.2d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        jts.Envelope envelope4 = new jts.Envelope(24.0d, (double) 2, 104.0d, (-7.3d));
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 111.3d + "'", double5 == 111.3d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 22.0d + "'", double6 == 22.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 22.0d + "'", double7 == 22.0d);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        jts.Envelope envelope4 = new jts.Envelope(204.1d, 96.0d, 8.799999999999999d, 19.6d);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        jts.Envelope envelope4 = new jts.Envelope(87.0d, (double) (-10), 69.0d, 36.0d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.getWidth();
        envelope4.init((double) 5, (double) 8, (double) (-3), (double) 10.0f);
        double double19 = envelope4.maxExtent();
        double double20 = envelope4.getHeight();
        double double21 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 96.0d + "'", double11 == 96.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 96.0d + "'", double12 == 96.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.0d + "'", double13 == 8.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 13.0d + "'", double19 == 13.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 13.0d + "'", double20 == 13.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 13.0d + "'", double21 == 13.0d);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.maxExtent();
        double double10 = envelope4.getHeight();
        double double11 = envelope4.maxExtent();
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
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        jts.Envelope envelope4 = new jts.Envelope(92.7d, (double) (-10L), 1.2d, (double) (-8L));
        envelope4.init(95.2d, 8.7d, 1.7000000000000002d, 92.0d);
        double double10 = envelope4.getHeight();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 90.3d + "'", double10 == 90.3d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 90.3d + "'", double11 == 90.3d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 90.3d + "'", double12 == 90.3d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 90.3d + "'", double13 == 90.3d);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        jts.Envelope envelope4 = new jts.Envelope((-9.3d), (double) ' ', (double) (byte) 100, 82.3d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 17.700000000000003d + "'", double5 == 17.700000000000003d);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        jts.Envelope envelope4 = new jts.Envelope(31.0d, (double) (byte) 100, 2.9000000000000004d, 5.0d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getHeight();
        boolean boolean8 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 69.0d + "'", double5 == 69.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 69.0d + "'", double6 == 69.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.0999999999999996d + "'", double7 == 2.0999999999999996d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        double double13 = envelope4.getHeight();
        double double14 = envelope4.maxExtent();
        double double15 = envelope4.getHeight();
        double double16 = envelope4.maxExtent();
        double double17 = envelope4.getWidth();
        double double18 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 5.0d + "'", double15 == 5.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 109.0d + "'", double16 == 109.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 109.0d + "'", double17 == 109.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 5.0d + "'", double18 == 5.0d);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) (-1L), (double) (-1.0f), (double) 0L, 100.0d);
        double double12 = envelope4.getWidth();
        double double13 = envelope4.getWidth();
        double double14 = envelope4.getWidth();
        double double15 = envelope4.maxExtent();
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
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        jts.Envelope envelope4 = new jts.Envelope((double) '4', (double) 10, (double) 5, (double) 1L);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getHeight();
        boolean boolean7 = envelope4.isEnvelopeNull();
        double double8 = envelope4.getHeight();
        boolean boolean9 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        envelope4.init(7.1d, (double) (byte) 10, (-5.4d), 5.0d);
        double double12 = envelope4.getHeight();
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.getHeight();
        boolean boolean15 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.4d + "'", double12 == 10.4d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.4d + "'", double14 == 10.4d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getHeight();
        envelope4.init(0.0d, (double) 8L, (double) 9L, 103.0d);
        double double15 = envelope4.maxExtent();
        double double16 = envelope4.getWidth();
        double double17 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.4d + "'", double9 == 8.4d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 94.0d + "'", double15 == 94.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 8.0d + "'", double16 == 8.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        jts.Envelope envelope4 = new jts.Envelope(100.0d, 10.5d, (double) 2, (-100.0d));
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.maxExtent();
        double double9 = envelope4.getWidth();
        double double10 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.0d + "'", double5 == 102.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 102.0d + "'", double6 == 102.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 102.0d + "'", double7 == 102.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 102.0d + "'", double8 == 102.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 89.5d + "'", double9 == 89.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 102.0d + "'", double10 == 102.0d);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        jts.Envelope envelope4 = new jts.Envelope((-8.7d), (-6.9d), (-1.0d), (double) (-10));
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass9 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.0d + "'", double5 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.799999999999999d + "'", double6 == 1.799999999999999d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.0d + "'", double7 == 9.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 9.0d + "'", double8 == 9.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        jts.Envelope envelope4 = new jts.Envelope((double) 7, (double) 0, (double) 8, (double) (-10));
        envelope4.init(42.0d, 105.4d, (double) 0L, (double) (short) -1);
        envelope4.init((double) (-8L), 38.4d, 86.2d, 2.3d);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        jts.Envelope envelope4 = new jts.Envelope(31.0d, (double) (byte) 100, 2.9000000000000004d, 5.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 69.0d + "'", double5 == 69.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 69.0d + "'", double6 == 69.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 69.0d + "'", double7 == 69.0d);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        jts.Envelope envelope4 = new jts.Envelope(77.9d, (double) 100L, 29.2d, (double) (-1L));
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        jts.Envelope envelope4 = new jts.Envelope(100.60000000000001d, 11.3d, 92.0d, 90.3d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 89.30000000000001d + "'", double5 == 89.30000000000001d);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        jts.Envelope envelope4 = new jts.Envelope(76.0d, 86.0d, 100.0d, (double) 6);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getHeight();
        boolean boolean8 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 94.0d + "'", double6 == 94.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 94.0d + "'", double7 == 94.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        jts.Envelope envelope4 = new jts.Envelope((double) (-7), (double) 4L, (-7.3d), (-100.0d));
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init((double) (-1.0f), (double) 6, (double) (-5), 12.6d);
        double double11 = envelope4.getWidth();
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7.0d + "'", double11 == 7.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 17.6d + "'", double12 == 17.6d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 17.6d + "'", double13 == 17.6d);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        jts.Envelope envelope4 = new jts.Envelope(10.4d, 110.0d, 7.1d, 110.5d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 99.6d + "'", double5 == 99.6d);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        jts.Envelope envelope4 = new jts.Envelope(1.3999999999999986d, 92.0d, 111.9d, 22.3d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass7 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 90.6d + "'", double5 == 90.6d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 90.6d + "'", double6 == 90.6d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        jts.Envelope envelope4 = new jts.Envelope((double) (-7), (double) 4L, (-7.3d), (-100.0d));
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getHeight();
        envelope4.init(104.6d, 14.4d, 99.0d, 103.5d);
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 92.7d + "'", double6 == 92.7d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 90.19999999999999d + "'", double12 == 90.19999999999999d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 90.19999999999999d + "'", double13 == 90.19999999999999d);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        jts.Envelope envelope4 = new jts.Envelope(6.0d, 111.0d, 198.5d, 38.4d);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getWidth();
        envelope4.init((double) 6, 1.2d, 18.0d, (-9.3d));
        double double19 = envelope4.getHeight();
        boolean boolean20 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 96.0d + "'", double11 == 96.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 96.0d + "'", double12 == 96.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.0d + "'", double13 == 8.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 27.3d + "'", double19 == 27.3d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        jts.Envelope envelope4 = new jts.Envelope((double) 1, 0.0d, (double) (-10L), (double) (short) 1);
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init(80.1d, 97.7d, 0.6999999999999993d, (-100.0d));
        boolean boolean11 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        jts.Envelope envelope4 = new jts.Envelope(7.299999999999997d, 97.7d, 56.900000000000006d, 91.3d);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        jts.Envelope envelope4 = new jts.Envelope((double) 5, (double) 100, (double) (short) 100, 4.0d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        boolean boolean11 = envelope4.isEnvelopeNull();
        envelope4.init(2.0999999999999996d, 0.0d, (-1.2d), 11.3d);
        double double17 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 2.0999999999999996d + "'", double17 == 2.0999999999999996d);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        jts.Envelope envelope4 = new jts.Envelope(94.2d, 0.0d, 3.1d, (double) (-7));
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.1d + "'", double5 == 10.1d);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        jts.Envelope envelope4 = new jts.Envelope((double) (-3), (-100.0d), (-3.8d), 90.3d);
        double double5 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        jts.Envelope envelope4 = new jts.Envelope(106.2d, 70.0d, 52.5d, 5.8999999999999995d);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        jts.Envelope envelope4 = new jts.Envelope(19.0d, 82.3d, 111.3d, 2.3d);
        envelope4.init(110.0d, (double) 7, (double) (-6L), 2.1d);
        double double10 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.1d + "'", double10 == 8.1d);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        boolean boolean8 = envelope4.isEnvelopeNull();
        envelope4.init((-100.0d), (double) (-1), 104.0d, (double) (-7L));
        double double14 = envelope4.getWidth();
        double double15 = envelope4.maxExtent();
        double double16 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 99.0d + "'", double14 == 99.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 111.0d + "'", double15 == 111.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 111.0d + "'", double16 == 111.0d);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        jts.Envelope envelope4 = new jts.Envelope((double) (-4L), (double) 7L, 6.9d, (double) (-4L));
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 11.0d + "'", double5 == 11.0d);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        jts.Envelope envelope4 = new jts.Envelope((double) (-8L), 10.0d, (double) (-6L), (double) 8);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getWidth();
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.0d + "'", double7 == 18.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 14.0d + "'", double8 == 14.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 18.0d + "'", double9 == 18.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 18.0d + "'", double11 == 18.0d);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        jts.Envelope envelope4 = new jts.Envelope(61.9d, (double) 2, 84.60000000000001d, 10.4d);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        jts.Envelope envelope4 = new jts.Envelope(13.3d, 80.7d, (double) 1.0f, 3.0d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        envelope4.init((double) (byte) 1, (double) (-8L), (double) 8L, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        envelope4.init((double) 9, 12.0d, (double) (short) 0, 5.9d);
        envelope4.init(27.3d, 12.3d, 106.0d, 198.1d);
        double double22 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 12.0d + "'", double10 == 12.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 12.0d + "'", double11 == 12.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 92.1d + "'", double22 == 92.1d);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 9.6d, 106.0d, 72.3d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        jts.Envelope envelope4 = new jts.Envelope(92.7d, (double) (-10L), 1.2d, (double) (-8L));
        envelope4.init(95.2d, 8.7d, 1.7000000000000002d, 92.0d);
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getWidth();
        boolean boolean12 = envelope4.isEnvelopeNull();
        boolean boolean13 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 90.3d + "'", double10 == 90.3d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 86.5d + "'", double11 == 86.5d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        jts.Envelope envelope4 = new jts.Envelope(27.3d, 6.9d, 101.3d, 73.30000000000001d);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        jts.Envelope envelope4 = new jts.Envelope(5.3d, (double) 9L, 3.1d, 10.4d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass8 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.300000000000001d + "'", double5 == 7.300000000000001d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.300000000000001d + "'", double6 == 7.300000000000001d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 7.300000000000001d + "'", double7 == 7.300000000000001d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 94.3d, 8.7d, (double) 3L);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        jts.Envelope envelope4 = new jts.Envelope(4.6d, 103.9d, 8.700000000000003d, 63.3d);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.maxExtent();
        envelope4.init((double) 5L, (-6.9d), (-5.4d), 0.0d);
        double double19 = envelope4.getWidth();
        double double20 = envelope4.maxExtent();
        boolean boolean21 = envelope4.isEnvelopeNull();
        double double22 = envelope4.getWidth();
        envelope4.init(26.800000000000004d, 0.0d, 84.9d, 77.7d);
        java.lang.Class<?> wildcardClass28 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 106.0d + "'", double13 == 106.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 11.9d + "'", double19 == 11.9d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 11.9d + "'", double20 == 11.9d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 11.9d + "'", double22 == 11.9d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        envelope4.init(43.6d, 117.4d, 198.1d, 14.0d);
        double double12 = envelope4.getHeight();
        boolean boolean13 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 103.0d + "'", double6 == 103.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 184.1d + "'", double12 == 184.1d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.maxExtent();
        envelope4.init((double) 5L, (-6.9d), (-5.4d), 0.0d);
        double double19 = envelope4.getHeight();
        double double20 = envelope4.getHeight();
        double double21 = envelope4.getHeight();
        double double22 = envelope4.getWidth();
        double double23 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass24 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 106.0d + "'", double13 == 106.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 5.4d + "'", double19 == 5.4d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 5.4d + "'", double20 == 5.4d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 5.4d + "'", double21 == 5.4d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 11.9d + "'", double22 == 11.9d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 11.9d + "'", double23 == 11.9d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        jts.Envelope envelope4 = new jts.Envelope(10.5d, 19.0d, (double) 1L, 105.2d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.maxExtent();
        envelope4.init(11.0d, 1.0d, (double) 3L, (double) (-2));
        envelope4.init(3.5d, 7.300000000000001d, 13.5d, (double) 4);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 106.0d + "'", double13 == 106.0d);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        jts.Envelope envelope4 = new jts.Envelope(4.6d, (-7.3d), 4.199999999999997d, 199.0d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 11.899999999999999d + "'", double5 == 11.899999999999999d);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        jts.Envelope envelope4 = new jts.Envelope(7.0d, 8.3d, 90.3d, 4.799999999999997d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        boolean boolean7 = envelope4.isEnvelopeNull();
        double double8 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 85.5d + "'", double5 == 85.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 85.5d + "'", double6 == 85.5d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 85.5d + "'", double8 == 85.5d);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (short) 0, (-9.3d), (double) (-1L));
        envelope4.init((-2.1d), (double) (-6), (double) (-6L), 2.9000000000000004d);
        envelope4.init(10.4d, 104.1d, 105.0d, 8.600000000000001d);
        double double15 = envelope4.maxExtent();
        double double16 = envelope4.getWidth();
        envelope4.init(83.99999999999999d, 5.0d, 0.0d, 198.5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 96.4d + "'", double15 == 96.4d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 93.69999999999999d + "'", double16 == 93.69999999999999d);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.getHeight();
        envelope4.init((double) 10.0f, (-4.6d), (double) (byte) 1, (double) 5);
        double double11 = envelope4.getWidth();
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.getWidth();
        double double14 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 14.6d + "'", double11 == 14.6d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 14.6d + "'", double12 == 14.6d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 14.6d + "'", double13 == 14.6d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 14.6d + "'", double14 == 14.6d);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        boolean boolean16 = envelope4.isEnvelopeNull();
        envelope4.init((double) (-1), 2.3d, 96.0d, (double) 9);
        double double22 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 87.0d + "'", double22 == 87.0d);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        jts.Envelope envelope4 = new jts.Envelope((double) 3, 1.2000000000000002d, 3.299999999999999d, (double) (-1L));
        envelope4.init(0.0d, 86.6d, 56.7d, 108.0d);
        java.lang.Class<?> wildcardClass10 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        jts.Envelope envelope4 = new jts.Envelope(9.0d, (double) 0, 92.7d, (double) 100);
        envelope4.init(21.0d, 97.0d, 31.0d, 10.4d);
        envelope4.init(101.0d, 0.0d, (double) (-9L), 1.2000000000000002d);
        envelope4.init((double) 10, 94.1d, (double) 10, 80.7d);
        double double20 = envelope4.maxExtent();
        double double21 = envelope4.maxExtent();
        double double22 = envelope4.maxExtent();
        envelope4.init(86.6d, 98.1d, 11.8d, 96.7d);
        double double28 = envelope4.maxExtent();
        double double29 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 84.1d + "'", double20 == 84.1d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 84.1d + "'", double21 == 84.1d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 84.1d + "'", double22 == 84.1d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 84.9d + "'", double28 == 84.9d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 84.9d + "'", double29 == 84.9d);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        jts.Envelope envelope4 = new jts.Envelope(2.700000000000003d, 5.8d, 92.8d, 87.3d);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        jts.Envelope envelope4 = new jts.Envelope(31.0d, (double) (byte) 100, 2.9000000000000004d, 5.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-1), 2.5999999999999996d, 0.0d, 14.9d);
        double double11 = envelope4.getWidth();
        envelope4.init(0.0d, (double) (-3L), 12.899999999999991d, 1.8000000000000007d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 69.0d + "'", double5 == 69.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.5999999999999996d + "'", double11 == 3.5999999999999996d);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        jts.Envelope envelope4 = new jts.Envelope(92.7d, (double) (-10L), 1.2d, (double) (-8L));
        envelope4.init(95.2d, 8.7d, 1.7000000000000002d, 92.0d);
        double double10 = envelope4.maxExtent();
        envelope4.init(103.0d, (-4.6d), 10.8d, 184.1d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 90.3d + "'", double10 == 90.3d);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
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
        envelope4.init(16.200000000000003d, (double) (-8L), (double) ' ', 0.0d);
        double double27 = envelope4.getHeight();
        boolean boolean28 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 6.9d + "'", double20 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 32.0d + "'", double27 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 3.1d, 5.0d, 2.7d);
        double double5 = envelope4.getHeight();
        envelope4.init(25.1d, (double) (-8), (double) (-5), 97.0d);
        double double11 = envelope4.getWidth();
        boolean boolean12 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3d + "'", double5 == 2.3d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 33.1d + "'", double11 == 33.1d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        jts.Envelope envelope4 = new jts.Envelope(1.6999999999999993d, 90.19999999999999d, 11.9d, 35.5d);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        jts.Envelope envelope4 = new jts.Envelope(99.9d, 90.80000000000001d, 98.2d, 7.899999999999999d);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 10, (double) 100, (double) 1, (double) (byte) 100);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        boolean boolean7 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 90.0d + "'", double6 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        jts.Envelope envelope4 = new jts.Envelope(31.0d, (double) (byte) 100, 2.9000000000000004d, 5.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        envelope4.init(1.2d, 76.5d, (double) 0.0f, (-5.4d));
        double double12 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 69.0d + "'", double6 == 69.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 5.4d + "'", double12 == 5.4d);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        jts.Envelope envelope4 = new jts.Envelope(4.1d, (-3.8d), (double) 5L, 20.0d);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        envelope4.init(7.1d, (double) (byte) 10, (-5.4d), 5.0d);
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.getWidth();
        double double14 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass15 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 2.9000000000000004d + "'", double13 == 2.9000000000000004d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.4d + "'", double14 == 10.4d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        envelope4.init((double) (-1L), (double) (-7L), 106.0d, (double) 10);
        boolean boolean18 = envelope4.isEnvelopeNull();
        double double19 = envelope4.getHeight();
        double double20 = envelope4.maxExtent();
        boolean boolean21 = envelope4.isEnvelopeNull();
        double double22 = envelope4.getHeight();
        double double23 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 96.0d + "'", double19 == 96.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 96.0d + "'", double20 == 96.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 96.0d + "'", double22 == 96.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 6.0d + "'", double23 == 6.0d);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        boolean boolean8 = envelope4.isEnvelopeNull();
        envelope4.init((double) 0, 91.3d, (double) (byte) -1, 89.5d);
        double double14 = envelope4.maxExtent();
        double double15 = envelope4.getWidth();
        envelope4.init(21.1d, 13.3d, (double) (-5L), 117.4d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 91.3d + "'", double14 == 91.3d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 91.3d + "'", double15 == 91.3d);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        jts.Envelope envelope4 = new jts.Envelope((double) '4', (double) (-6L), (double) (-6), (double) 100L);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 58.0d + "'", double6 == 58.0d);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        jts.Envelope envelope4 = new jts.Envelope(88.3d, 11.0d, 80.0d, 34.0d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 46.0d + "'", double5 == 46.0d);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        jts.Envelope envelope4 = new jts.Envelope(53.2d, 77.5d, 1.3999999999999986d, 51.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        boolean boolean7 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        jts.Envelope envelope4 = new jts.Envelope((double) 7, (double) 10.0f, (double) 4L, (double) 0L);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getWidth();
        double double10 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.0d + "'", double6 == 3.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3.0d + "'", double7 == 3.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.0d + "'", double9 == 3.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
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
        boolean boolean24 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 8.0d + "'", double19 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 8.0d + "'", double21 == 8.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 8.0d + "'", double22 == 8.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 8.0d + "'", double23 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        jts.Envelope envelope4 = new jts.Envelope(21.599999999999994d, 0.0d, 2.200000000000003d, 79.2d);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        jts.Envelope envelope4 = new jts.Envelope(1.6999999999999886d, (double) 100.0f, 107.8d, 199.0d);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        jts.Envelope envelope4 = new jts.Envelope(102.3d, 8.0d, 4.0d, (double) (byte) 100);
        double double5 = envelope4.getHeight();
        envelope4.init(109.1d, 97.0d, (double) (-2L), 15.4d);
        envelope4.init(101.3d, (double) 9, 1.9000000000000004d, 94.0d);
        double double16 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 96.0d + "'", double5 == 96.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 92.1d + "'", double16 == 92.1d);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        jts.Envelope envelope4 = new jts.Envelope(107.5d, (double) (-1.0f), 16.3d, 84.6d);
        envelope4.init(62.9d, 13.6d, 79.9d, 60.49999999999999d);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        jts.Envelope envelope4 = new jts.Envelope(17.6d, (-1.0d), 0.0d, 0.0d);
        double double5 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init((double) 100, (-100.0d), (double) '#', 5.0d);
        envelope4.init((double) 1L, (double) (byte) 100, (double) (-8L), (double) (-1));
        double double21 = envelope4.getWidth();
        double double22 = envelope4.getWidth();
        boolean boolean23 = envelope4.isEnvelopeNull();
        double double24 = envelope4.getHeight();
        double double25 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 99.0d + "'", double21 == 99.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 99.0d + "'", double22 == 99.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 7.0d + "'", double24 == 7.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 99.0d + "'", double25 == 99.0d);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        jts.Envelope envelope4 = new jts.Envelope(13.6d, 4.6d, 50.1d, 0.5d);
        envelope4.init(89.1d, (double) (-5L), 89.5d, 1.2999999999999998d);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        jts.Envelope envelope4 = new jts.Envelope((double) 100, 24.0d, 5.0d, (double) (-9));
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 76.0d + "'", double5 == 76.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 76.0d + "'", double7 == 76.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 76.0d + "'", double8 == 76.0d);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        double double16 = envelope4.getWidth();
        boolean boolean17 = envelope4.isEnvelopeNull();
        envelope4.init(13.0d, 11.9d, (double) 6L, 5.0d);
        double double23 = envelope4.getHeight();
        double double24 = envelope4.getWidth();
        double double25 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0999999999999996d + "'", double24 == 1.0999999999999996d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1), 89.7d, 102.3d, 80.19999999999999d);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        jts.Envelope envelope4 = new jts.Envelope(90.39999999999999d, 13.200000000000003d, 34.7d, 20.0d);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        jts.Envelope envelope4 = new jts.Envelope(79.7d, 7.7d, 1.2000000000000002d, 11.3d);
        envelope4.init(4.300000000000009d, 85.4d, 13.200000000000003d, 3.1d);
        java.lang.Class<?> wildcardClass10 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        jts.Envelope envelope4 = new jts.Envelope((-8.7d), (double) (-8L), (double) (-6L), (double) 2);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getHeight();
        envelope4.init(104.0d, (double) 10L, (double) 3L, 4.8d);
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getHeight();
        envelope4.init(58.7d, 5.1d, 3.7d, 61.9d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7999999999999998d + "'", double11 == 1.7999999999999998d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7999999999999998d + "'", double12 == 1.7999999999999998d);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        jts.Envelope envelope4 = new jts.Envelope(4.2d, 13.0d, (double) 10L, 1.5d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.8d + "'", double5 == 8.8d);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        jts.Envelope envelope4 = new jts.Envelope(103.69999999999999d, 89.8d, 77.9d, (double) 0.0f);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 13.899999999999991d + "'", double5 == 13.899999999999991d);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) 0, (double) (-1), (double) (short) 0, 24.600000000000005d);
        envelope4.init(30.5d, 37.6d, 19.700000000000003d, 103.2d);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        jts.Envelope envelope4 = new jts.Envelope((-4.6d), 11.3d, 16.3d, (double) 100L);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 83.7d + "'", double5 == 83.7d);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        jts.Envelope envelope4 = new jts.Envelope(6.3d, 76.5d, 82.3d, 14.6d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        jts.Envelope envelope4 = new jts.Envelope(4.499999999999999d, 0.0d, 8.799999999999999d, 108.8d);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        jts.Envelope envelope4 = new jts.Envelope(11.0d, 8.700000000000003d, 107.3d, 27.3d);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        jts.Envelope envelope4 = new jts.Envelope(102.3d, (-8.7d), (-10.5d), 20.0d);
        envelope4.init(96.0d, 29.9d, 70.0d, 200.0d);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.getWidth();
        double double9 = envelope4.getWidth();
        envelope4.init((double) (-3), 46.0d, (-7.3d), 13.100000000000001d);
        double double15 = envelope4.getWidth();
        double double16 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 49.0d + "'", double15 == 49.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 49.0d + "'", double16 == 49.0d);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        jts.Envelope envelope4 = new jts.Envelope(4.2d, 13.0d, (double) 10L, 1.5d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.8d + "'", double5 == 8.8d);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        jts.Envelope envelope4 = new jts.Envelope((double) (-4L), (double) 7L, 6.9d, (double) (-4L));
        double double5 = envelope4.getWidth();
        double double6 = envelope4.maxExtent();
        envelope4.init(51.7d, (double) (-4), 38.0d, 204.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 11.0d + "'", double5 == 11.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 11.0d + "'", double6 == 11.0d);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.maxExtent();
        envelope4.init((-10.5d), (double) 8L, (double) (-10L), (double) (-3));
        boolean boolean14 = envelope4.isEnvelopeNull();
        double double15 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass16 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 7.0d + "'", double15 == 7.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        jts.Envelope envelope4 = new jts.Envelope(104.1d, (-9.3d), 3.299999999999999d, 104.1d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.8d + "'", double5 == 100.8d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 113.39999999999999d + "'", double6 == 113.39999999999999d);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass9 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        jts.Envelope envelope4 = new jts.Envelope(11.299999999999983d, 13.899999999999991d, 111.9d, 98.7d);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        jts.Envelope envelope4 = new jts.Envelope((double) (-7), (double) 4L, (-7.3d), (-100.0d));
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.getWidth();
        double double9 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 92.7d + "'", double6 == 92.7d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 11.0d + "'", double7 == 11.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 11.0d + "'", double8 == 11.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 11.0d + "'", double9 == 11.0d);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        jts.Envelope envelope4 = new jts.Envelope((double) '4', 1.9d, 0.2999999999999998d, 20.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 19.7d + "'", double6 == 19.7d);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) 100.0f, (double) 4, (double) 1.0f, 5.3d);
        envelope4.init(76.0d, 86.5d, 104.0d, 5.4d);
        double double17 = envelope4.getWidth();
        boolean boolean18 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.5d + "'", double17 == 10.5d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        jts.Envelope envelope4 = new jts.Envelope((double) 8L, (-5.4d), 5.8d, (double) 10L);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        double double13 = envelope4.getWidth();
        double double14 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass15 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 109.0d + "'", double13 == 109.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        jts.Envelope envelope4 = new jts.Envelope(2.0999999999999943d, 83.7d, 77.5d, 0.5d);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        jts.Envelope envelope4 = new jts.Envelope((double) (-10), (double) (-3L), 0.0d, (double) 10.0f);
        envelope4.init(94.1d, (-7.3d), 2.1d, 9.2d);
        envelope4.init((double) 1, 109.7d, 12.799999999999983d, (double) 1L);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        jts.Envelope envelope4 = new jts.Envelope(4.300000000000009d, 6.900000000000006d, 51.7d, (-5.4d));
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (short) 0, (-9.3d), (double) (-1L));
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.3d + "'", double5 == 8.3d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.3d + "'", double7 == 8.3d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 9.0d + "'", double8 == 9.0d);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        jts.Envelope envelope4 = new jts.Envelope((double) '4', 117.5d, 43.6d, 128.0d);
        envelope4.init(53.0d, 6.199999999999989d, 92.5d, 102.3d);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) 10, (double) (byte) 1, (double) (byte) 0);
        double double5 = envelope4.maxExtent();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.getWidth();
        double double9 = envelope4.maxExtent();
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        jts.Envelope envelope4 = new jts.Envelope(110.0d, 11.1d, 110.39999999999999d, 43.6d);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        jts.Envelope envelope4 = new jts.Envelope((double) (-5), 88.6d, 93.0d, 20.9d);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        jts.Envelope envelope4 = new jts.Envelope((double) '4', (double) (-6L), (double) (-6), (double) 100L);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getHeight();
        boolean boolean8 = envelope4.isEnvelopeNull();
        envelope4.init(11.3d, 31.0d, 9.0d, 86.5d);
        java.lang.Class<?> wildcardClass14 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 106.0d + "'", double5 == 106.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 106.0d + "'", double6 == 106.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 106.0d + "'", double7 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        jts.Envelope envelope4 = new jts.Envelope(13.8d, 46.099999999999994d, 10.5d, 86.0d);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        jts.Envelope envelope4 = new jts.Envelope((double) (-8L), 10.0d, (double) (-6L), (double) 8);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 18.0d + "'", double6 == 18.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 14.0d + "'", double7 == 14.0d);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        jts.Envelope envelope4 = new jts.Envelope((double) '#', (double) (short) 100, (double) (short) -1, (double) 1L);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass9 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 65.0d + "'", double5 == 65.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 65.0d + "'", double6 == 65.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 65.0d + "'", double7 == 65.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 65.0d + "'", double8 == 65.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init((double) (short) 0, 2.7d, (double) (-1.0f), (double) 100L);
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.getHeight();
        boolean boolean14 = envelope4.isEnvelopeNull();
        double double15 = envelope4.getWidth();
        double double16 = envelope4.maxExtent();
        envelope4.init(112.3d, 3.4000000000000004d, 21.1d, 24.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 101.0d + "'", double13 == 101.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2.7d + "'", double15 == 2.7d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 101.0d + "'", double16 == 101.0d);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        jts.Envelope envelope4 = new jts.Envelope((double) 100L, 100.0d, (-9.3d), 6.9d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 16.200000000000003d + "'", double5 == 16.200000000000003d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 16.200000000000003d + "'", double6 == 16.200000000000003d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        jts.Envelope envelope4 = new jts.Envelope((double) (-7L), 18.0d, 1.7000000000000002d, 87.0d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 85.3d + "'", double5 == 85.3d);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        jts.Envelope envelope4 = new jts.Envelope(6.199999999999989d, 1.299999999999999d, 55.3d, 93.1d);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        jts.Envelope envelope4 = new jts.Envelope(102.7d, 0.0d, 200.0d, (double) '4');
        double double5 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.7d + "'", double5 == 102.7d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        jts.Envelope envelope4 = new jts.Envelope((double) (-7), (double) 4L, (-7.3d), (-100.0d));
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init((double) (-1.0f), (double) 6, (double) (-5), 12.6d);
        double double11 = envelope4.maxExtent();
        envelope4.init((double) 7, 93.7d, 37.0d, (-4.6d));
        boolean boolean17 = envelope4.isEnvelopeNull();
        double double18 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 17.6d + "'", double11 == 17.6d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 86.7d + "'", double18 == 86.7d);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        jts.Envelope envelope4 = new jts.Envelope((double) 5, 30.9d, 33.1d, 3.0999999999999996d);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        double double11 = envelope4.getWidth();
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.getHeight();
        boolean boolean14 = envelope4.isEnvelopeNull();
        double double15 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.0d + "'", double11 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 96.0d + "'", double12 == 96.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 96.0d + "'", double13 == 96.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 96.0d + "'", double15 == 96.0d);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        jts.Envelope envelope4 = new jts.Envelope((double) 'a', (double) (byte) 1, 2.3d, (double) 0L);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getWidth();
        envelope4.init(100.0d, (double) 5L, 1.799999999999999d, (-7.3d));
        double double13 = envelope4.getHeight();
        double double14 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3d + "'", double5 == 2.3d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 96.0d + "'", double7 == 96.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 9.099999999999998d + "'", double13 == 9.099999999999998d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 95.0d + "'", double14 == 95.0d);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        boolean boolean8 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass9 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getHeight();
        envelope4.init((double) (byte) 1, 34.0d, 92.3d, (double) (byte) 10);
        envelope4.init(93.7d, 9.4d, 80.4d, 38.7d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) 1, 11.0d, (double) (-1), (double) 0.0f);
        double double5 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        boolean boolean16 = envelope4.isEnvelopeNull();
        double double17 = envelope4.getWidth();
        double double18 = envelope4.maxExtent();
        envelope4.init(92.0d, (-2.1d), 0.0d, (double) (byte) 1);
        envelope4.init(2.9000000000000004d, 3.299999999999999d, 30.0d, 99.0d);
        envelope4.init(0.9000000000000004d, 148.0d, (double) (-7L), 46.2d);
        boolean boolean34 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.0d + "'", double18 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        jts.Envelope envelope4 = new jts.Envelope((-2.1d), 3.0999999999999943d, 5.299999999999983d, 20.0d);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        jts.Envelope envelope4 = new jts.Envelope((double) (-5), 4.3d, (double) (-7), 109.0d);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
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
        boolean boolean22 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 107.3d + "'", double21 == 107.3d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, (-5.4d), 0.0d, 65.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        boolean boolean8 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 65.0d + "'", double7 == 65.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.getWidth();
        envelope4.init((double) 5, (double) 8, (double) (-3), (double) 10.0f);
        double double19 = envelope4.maxExtent();
        double double20 = envelope4.getHeight();
        envelope4.init(0.0d, 9.4d, (double) 4, (double) (-1));
        double double26 = envelope4.maxExtent();
        boolean boolean27 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 96.0d + "'", double11 == 96.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 96.0d + "'", double12 == 96.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.0d + "'", double13 == 8.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 13.0d + "'", double19 == 13.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 13.0d + "'", double20 == 13.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 9.4d + "'", double26 == 9.4d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (short) 0, (-9.3d), (double) (-1L));
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getWidth();
        envelope4.init(39.400000000000006d, 105.4d, 58.5d, 0.0d);
        double double12 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.0d + "'", double5 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.0d + "'", double6 == 9.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 66.0d + "'", double12 == 66.0d);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
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
        double double26 = envelope4.getHeight();
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
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        jts.Envelope envelope4 = new jts.Envelope(79.7d, 0.0d, 22.5d, 0.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        jts.Envelope envelope4 = new jts.Envelope(100.0d, 10.5d, (double) 2, (-100.0d));
        envelope4.init(100.0d, (double) 8L, (double) 0L, (double) 10L);
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 92.0d + "'", double11 == 92.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
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
        double double35 = envelope4.getWidth();
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
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        jts.Envelope envelope4 = new jts.Envelope(5.299999999999983d, 1.9d, 47.0d, 9.9d);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        jts.Envelope envelope4 = new jts.Envelope((double) (-7), (double) 4L, (-7.3d), (-100.0d));
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.getWidth();
        envelope4.init((double) (-100), 102.7d, (-9.3d), 3.0999999999999996d);
        double double14 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 92.7d + "'", double6 == 92.7d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 11.0d + "'", double7 == 11.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 11.0d + "'", double8 == 11.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 202.7d + "'", double14 == 202.7d);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        jts.Envelope envelope4 = new jts.Envelope(41.3d, 55.0d, 191.3d, (double) (-6));
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
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
        envelope4.init(1.7000000000000004d, 1.2d, 90.80000000000001d, 3.0999999999999943d);
        java.lang.Class<?> wildcardClass27 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 8.0d + "'", double20 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        jts.Envelope envelope4 = new jts.Envelope((double) 1L, 92.3d, 62.9d, 26.800000000000004d);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        jts.Envelope envelope4 = new jts.Envelope((double) 5, (double) 0L, 51.0d, (double) 5L);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 46.0d + "'", double6 == 46.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 46.0d + "'", double7 == 46.0d);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.getWidth();
        double double9 = envelope4.maxExtent();
        envelope4.init(200.0d, 18.0d, (-1.0d), 88.3d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        jts.Envelope envelope4 = new jts.Envelope(3.0999999999999996d, 20.5d, 6.300000000000001d, (double) (-9L));
        double double5 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 17.4d + "'", double5 == 17.4d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        jts.Envelope envelope4 = new jts.Envelope(51.0d, (double) 1L, 15.9d, (double) 8L);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        envelope4.init((double) (byte) 1, (double) (-8L), (double) 8L, (double) (-4L));
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getHeight();
        envelope4.init(95.0d, 200.0d, 200.0d, (double) 6);
        boolean boolean19 = envelope4.isEnvelopeNull();
        boolean boolean20 = envelope4.isEnvelopeNull();
        double double21 = envelope4.maxExtent();
        double double22 = envelope4.getHeight();
        double double23 = envelope4.maxExtent();
        envelope4.init(0.7000000000000028d, 80.2d, 19.6d, 98.2d);
        boolean boolean29 = envelope4.isEnvelopeNull();
        double double30 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 12.0d + "'", double11 == 12.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 12.0d + "'", double12 == 12.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 12.0d + "'", double13 == 12.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 194.0d + "'", double21 == 194.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 194.0d + "'", double22 == 194.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 194.0d + "'", double23 == 194.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 78.6d + "'", double30 == 78.6d);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.getHeight();
        envelope4.init((double) 10.0f, (-4.6d), (double) (byte) 1, (double) 5);
        double double11 = envelope4.getWidth();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.getHeight();
        double double14 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 14.6d + "'", double11 == 14.6d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.0d + "'", double13 == 4.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        envelope4.init((double) (byte) 1, (double) (-8L), (double) 8L, (double) (-4L));
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        boolean boolean13 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 12.0d + "'", double11 == 12.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        boolean boolean16 = envelope4.isEnvelopeNull();
        envelope4.init((double) (-1), 2.3d, 96.0d, (double) 9);
        envelope4.init(42.0d, (double) (-10), (double) 10.0f, (-10.5d));
        double double27 = envelope4.getWidth();
        double double28 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 52.0d + "'", double27 == 52.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 52.0d + "'", double28 == 52.0d);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        jts.Envelope envelope4 = new jts.Envelope(109.7d, 93.1d, 198.1d, 10.0d);
        envelope4.init((double) 9L, 66.0d, 1.9000000000000004d, (double) 100);
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 98.1d + "'", double10 == 98.1d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 98.1d + "'", double11 == 98.1d);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        jts.Envelope envelope4 = new jts.Envelope((double) 8, (double) (short) 0, 16.200000000000003d, 17.6d);
        double double5 = envelope4.maxExtent();
        envelope4.init(2.3d, 20.0d, 88.6d, 128.0d);
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getHeight();
        envelope4.init(10.200000000000003d, 95.7d, 0.0d, 85.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 39.400000000000006d + "'", double11 == 39.400000000000006d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 39.400000000000006d + "'", double12 == 39.400000000000006d);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        jts.Envelope envelope4 = new jts.Envelope(117.5d, 88.5d, 72.9d, 114.19999999999999d);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        jts.Envelope envelope4 = new jts.Envelope((double) 7, (double) 10.0f, (double) 4L, (double) 0L);
        envelope4.init((double) 10.0f, (double) 4, (double) 9, 3.1d);
        envelope4.init((double) 7L, (double) 5L, (double) 2, (double) 9L);
        boolean boolean15 = envelope4.isEnvelopeNull();
        double double16 = envelope4.maxExtent();
        double double17 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 7.0d + "'", double16 == 7.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 7.0d + "'", double17 == 7.0d);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        jts.Envelope envelope4 = new jts.Envelope((double) 5, (double) (byte) 100, 9.0d, 109.0d);
        double double5 = envelope4.getHeight();
        envelope4.init(102.7d, 15.0d, 9.5d, 98.1d);
        double double11 = envelope4.getHeight();
        envelope4.init(0.0d, 86.6d, 81.0d, 52.7d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 88.6d + "'", double11 == 88.6d);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        boolean boolean16 = envelope4.isEnvelopeNull();
        double double17 = envelope4.getWidth();
        double double18 = envelope4.maxExtent();
        envelope4.init(92.0d, (-2.1d), 0.0d, (double) (byte) 1);
        envelope4.init(2.9000000000000004d, 3.299999999999999d, 30.0d, 99.0d);
        envelope4.init(0.9000000000000004d, 148.0d, (double) (-7L), 46.2d);
        double double34 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.0d + "'", double18 == 8.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 53.2d + "'", double34 == 53.2d);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        jts.Envelope envelope4 = new jts.Envelope(183.7d, 114.1d, 15.9d, 110.0d);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        envelope4.init(21.5d, (double) (-2L), 97.10000000000001d, 36.9d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        jts.Envelope envelope4 = new jts.Envelope((double) (-4L), (double) 7L, 6.9d, (double) (-4L));
        envelope4.init(6.0d, 14.0d, 10.5d, (double) (byte) 10);
        double double10 = envelope4.getHeight();
        boolean boolean11 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        jts.Envelope envelope4 = new jts.Envelope(22.3d, 106.0d, 109.0d, (double) 2L);
        envelope4.init(73.30000000000001d, 92.9d, 3.0d, 20.0d);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        jts.Envelope envelope4 = new jts.Envelope((double) (-8L), 10.0d, (double) (-6L), (double) 8);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getWidth();
        boolean boolean10 = envelope4.isEnvelopeNull();
        boolean boolean11 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass12 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.0d + "'", double7 == 18.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 14.0d + "'", double8 == 14.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 18.0d + "'", double9 == 18.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
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
        double double20 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass21 = envelope4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 3.1d, 5.0d, 2.7d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        boolean boolean7 = envelope4.isEnvelopeNull();
        boolean boolean8 = envelope4.isEnvelopeNull();
        boolean boolean9 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.9d + "'", double5 == 6.9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.3d + "'", double6 == 2.3d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        jts.Envelope envelope4 = new jts.Envelope(1.5999999999999996d, (double) 1L, 100.0d, (double) (-9L));
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init(101.0d, 104.6d, (double) '4', 76.5d);
        envelope4.init(97.80000000000001d, 2.700000000000003d, 106.9d, 55.0d);
        boolean boolean16 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        double double16 = envelope4.getWidth();
        double double17 = envelope4.getHeight();
        double double18 = envelope4.getWidth();
        boolean boolean19 = envelope4.isEnvelopeNull();
        envelope4.init(102.7d, 90.0d, 111.3d, 7.1d);
        envelope4.init((-3.8d), 90.3d, 7.699999999999999d, 100.8d);
        double double30 = envelope4.maxExtent();
        boolean boolean31 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 94.1d + "'", double30 == 94.1d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        jts.Envelope envelope4 = new jts.Envelope(89.5d, 86.0d, 0.0d, 95.2d);
        envelope4.init(0.0d, (double) 3L, 92.9d, (double) 9);
        double double10 = envelope4.getHeight();
        double double11 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 83.9d + "'", double10 == 83.9d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 83.9d + "'", double11 == 83.9d);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        jts.Envelope envelope4 = new jts.Envelope(15.4d, 3.4000000000000004d, (double) 4, 102.1d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 98.1d + "'", double5 == 98.1d);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1.0f), (double) (-9), (double) 2, (double) 10);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass8 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        jts.Envelope envelope4 = new jts.Envelope(28.900000000000013d, 106.9d, 66.0d, 1.1999999999999886d);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, (double) 9, (double) '4', 110.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 58.0d + "'", double5 == 58.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 58.0d + "'", double6 == 58.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.0d + "'", double7 == 9.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 9.0d + "'", double8 == 9.0d);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
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
        boolean boolean27 = envelope4.isEnvelopeNull();
        double double28 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 87.0d + "'", double23 == 87.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 3.3d + "'", double25 == 3.3d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 87.0d + "'", double26 == 87.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 3.3d + "'", double28 == 3.3d);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), (double) 4, (double) (-3L), (double) '4');
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.0d + "'", double5 == 5.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 55.0d + "'", double6 == 55.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 55.0d + "'", double7 == 55.0d);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        jts.Envelope envelope4 = new jts.Envelope(14.0d, 102.3d, 1.5999999999999996d, 8.0d);
        envelope4.init((double) 2L, 92.0d, (double) (-5L), 13.0d);
        envelope4.init(93.7d, 8.0d, (double) (byte) 100, 3.299999999999999d);
        double double15 = envelope4.maxExtent();
        double double16 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 96.7d + "'", double15 == 96.7d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 96.7d + "'", double16 == 96.7d);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        envelope4.init(7.1d, (double) (byte) 10, (-5.4d), 5.0d);
        double double12 = envelope4.getWidth();
        envelope4.init(99.4d, 78.6d, 17.6d, 190.3d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.9000000000000004d + "'", double12 == 2.9000000000000004d);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        jts.Envelope envelope4 = new jts.Envelope(15.3d, (double) 9, 104.0d, 54.9d);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        jts.Envelope envelope4 = new jts.Envelope(5.8d, (double) 4, 10.0d, 106.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init(91.3d, (-10.5d), (-2.1d), 4.2d);
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getWidth();
        double double13 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 96.0d + "'", double5 == 96.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 6.300000000000001d + "'", double11 == 6.300000000000001d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 101.8d + "'", double12 == 101.8d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 101.8d + "'", double13 == 101.8d);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 3.1d, 5.0d, 2.7d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3d + "'", double5 == 2.3d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 6.9d + "'", double6 == 6.9d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 6.9d + "'", double7 == 6.9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 6.9d + "'", double8 == 6.9d);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        jts.Envelope envelope4 = new jts.Envelope(6.9d, (double) (byte) 10, 87.0d, 83.7d);
        envelope4.init(1.7999999999999998d, (double) (-7L), 10.4d, 87.0d);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        jts.Envelope envelope4 = new jts.Envelope(92.7d, (double) (-10L), 1.2d, (double) (-8L));
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getWidth();
        envelope4.init(84.5d, (double) 10, 74.69999999999999d, 38.4d);
        double double14 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.7d + "'", double5 == 102.7d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.2d + "'", double6 == 9.2d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 102.7d + "'", double7 == 102.7d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 102.7d + "'", double8 == 102.7d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 36.29999999999999d + "'", double14 == 36.29999999999999d);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        jts.Envelope envelope4 = new jts.Envelope(0.5999999999999996d, 95.2d, 12.3d, (double) (-1L));
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 13.3d + "'", double5 == 13.3d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 94.60000000000001d + "'", double6 == 94.60000000000001d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 94.60000000000001d + "'", double7 == 94.60000000000001d);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        jts.Envelope envelope4 = new jts.Envelope(3.299999999999999d, 7.1d, 0.0d, (double) 2L);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init((-6.9d), (-2.1d), (-7.3d), (double) 4);
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.getHeight();
        double double14 = envelope4.getHeight();
        double double15 = envelope4.maxExtent();
        double double16 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 11.3d + "'", double12 == 11.3d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 11.3d + "'", double13 == 11.3d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 11.3d + "'", double14 == 11.3d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 11.3d + "'", double15 == 11.3d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 11.3d + "'", double16 == 11.3d);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        jts.Envelope envelope4 = new jts.Envelope(102.7d, 0.0d, 200.0d, (double) '4');
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getWidth();
        boolean boolean7 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.7d + "'", double5 == 102.7d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 102.7d + "'", double6 == 102.7d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        jts.Envelope envelope4 = new jts.Envelope((double) (-3), (-100.0d), (-3.8d), 90.3d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        jts.Envelope envelope4 = new jts.Envelope(2.5999999999999996d, 44.3d, 44.0d, 9.900000000000002d);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 1, 85.5d, (double) (-4L), 22.0d);
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 84.5d + "'", double5 == 84.5d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        envelope4.init(6.9d, (double) (byte) 0, (double) (byte) 1, (double) (-1.0f));
        double double18 = envelope4.getWidth();
        double double19 = envelope4.maxExtent();
        double double20 = envelope4.getHeight();
        double double21 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 6.9d + "'", double19 == 6.9d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.0d + "'", double20 == 2.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 6.9d + "'", double21 == 6.9d);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), 53.2d, 84.9d, 0.0d);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        envelope4.init(84.5d, 99.2d, 66.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.getHeight();
        envelope4.init(18.5d, 107.0d, 60.0d, 15.4d);
        double double20 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 104.0d + "'", double14 == 104.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 88.5d + "'", double20 == 88.5d);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        jts.Envelope envelope4 = new jts.Envelope(100.0d, 10.5d, (double) 2, (-100.0d));
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.maxExtent();
        envelope4.init(58.0d, 3.5999999999999996d, 15.0d, 0.9000000000000004d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.0d + "'", double5 == 102.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 89.5d + "'", double6 == 89.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 102.0d + "'", double7 == 102.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 102.0d + "'", double8 == 102.0d);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        jts.Envelope envelope4 = new jts.Envelope((-3.8d), (double) (-100L), 0.0d, 1.7000000000000002d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 96.2d + "'", double5 == 96.2d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 96.2d + "'", double6 == 96.2d);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getHeight();
        envelope4.init((double) ' ', (-2.1d), 109.0d, (double) 6);
        boolean boolean11 = envelope4.isEnvelopeNull();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.getHeight();
        double double14 = envelope4.getHeight();
        boolean boolean15 = envelope4.isEnvelopeNull();
        double double16 = envelope4.getWidth();
        double double17 = envelope4.getHeight();
        double double18 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 103.0d + "'", double13 == 103.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 103.0d + "'", double14 == 103.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 34.1d + "'", double16 == 34.1d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 103.0d + "'", double17 == 103.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 103.0d + "'", double18 == 103.0d);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        jts.Envelope envelope4 = new jts.Envelope(25.1d, 53.2d, 0.5999999999999996d, 95.7d);
        double double5 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 95.10000000000001d + "'", double5 == 95.10000000000001d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
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
        double double26 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 96.0d + "'", double11 == 96.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 96.0d + "'", double12 == 96.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.0d + "'", double13 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 8.100000000000001d + "'", double26 == 8.100000000000001d);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        jts.Envelope envelope4 = new jts.Envelope(114.19999999999999d, 8.8d, 4.4d, 0.0d);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init((-6.9d), (-2.1d), (-7.3d), (double) 4);
        double double12 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass13 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 11.3d + "'", double12 == 11.3d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        jts.Envelope envelope4 = new jts.Envelope(100.0d, (double) (short) -1, 0.0d, 0.0d);
        envelope4.init((double) 0, (double) 5, (-9.3d), (double) ' ');
        double double10 = envelope4.getHeight();
        envelope4.init(114.19999999999999d, 21.0d, 19.4d, 97.7d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 41.3d + "'", double10 == 41.3d);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.getHeight();
        envelope4.init(104.1d, 193.0d, 8.600000000000001d, 84.99999999999999d);
        double double11 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 88.9d + "'", double11 == 88.9d);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
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
        boolean boolean18 = envelope4.isEnvelopeNull();
        boolean boolean19 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 5.0d + "'", double15 == 5.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 109.0d + "'", double16 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        jts.Envelope envelope4 = new jts.Envelope(92.7d, (double) (-1L), (double) 7, 31.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 24.0d + "'", double5 == 24.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 93.7d + "'", double6 == 93.7d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 24.0d + "'", double7 == 24.0d);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        jts.Envelope envelope4 = new jts.Envelope((double) (-8L), 10.0d, (double) (-6L), (double) 8);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        boolean boolean7 = envelope4.isEnvelopeNull();
        double double8 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 18.0d + "'", double8 == 18.0d);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
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
        envelope4.init(51.7d, 103.69999999999999d, 99.4d, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.0d + "'", double18 == 8.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 94.1d + "'", double25 == 94.1d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 94.1d + "'", double26 == 94.1d);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        jts.Envelope envelope4 = new jts.Envelope(4.4d, 41.3d, (-1.2d), 113.39999999999999d);
        double double5 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 36.9d + "'", double5 == 36.9d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        jts.Envelope envelope4 = new jts.Envelope((double) 'a', (double) (byte) 1, 2.3d, (double) 0L);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getWidth();
        envelope4.init(100.0d, (double) 5L, 1.799999999999999d, (-7.3d));
        double double13 = envelope4.getHeight();
        envelope4.init(5.9d, (double) (-2L), 12.799999999999983d, 52.599999999999994d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3d + "'", double5 == 2.3d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 96.0d + "'", double7 == 96.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 9.099999999999998d + "'", double13 == 9.099999999999998d);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        jts.Envelope envelope4 = new jts.Envelope((double) ' ', (double) (-1), (double) (-4), (-1.2d));
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 33.0d + "'", double5 == 33.0d);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        boolean boolean13 = envelope4.isEnvelopeNull();
        boolean boolean14 = envelope4.isEnvelopeNull();
        double double15 = envelope4.getHeight();
        boolean boolean16 = envelope4.isEnvelopeNull();
        envelope4.init(39.0d, 35.5d, 2.3d, 99.2d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 104.0d + "'", double15 == 104.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1.0f), (double) 6L, (double) 7L, 4.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.0d + "'", double5 == 7.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.0d + "'", double6 == 7.0d);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        jts.Envelope envelope4 = new jts.Envelope(76.5d, 9.2d, (double) 5, 52.0d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 67.3d + "'", double5 == 67.3d);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        envelope4.init((-5.4d), (-8.7d), (double) 5L, (double) 7);
        double double12 = envelope4.getHeight();
        double double13 = envelope4.maxExtent();
        envelope4.init(111.9d, 31.0d, 191.3d, 87.0d);
        envelope4.init(60.49999999999999d, 10.200000000000003d, 26.800000000000004d, 75.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.0d + "'", double12 == 2.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.299999999999999d + "'", double13 == 3.299999999999999d);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.getWidth();
        double double9 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 103.0d + "'", double6 == 103.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 103.0d + "'", double7 == 103.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 13.0d + "'", double8 == 13.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 103.0d + "'", double9 == 103.0d);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        jts.Envelope envelope4 = new jts.Envelope(34.0d, 55.0d, 92.3d, 95.7d);
        envelope4.init((double) 5L, 17.4d, (double) 0, 8.3d);
        envelope4.init(0.0d, 0.9000000000000004d, (double) 5, (-4.6d));
        double double15 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass16 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 9.6d + "'", double15 == 9.6d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init((double) 100, (-100.0d), (double) '#', 5.0d);
        boolean boolean16 = envelope4.isEnvelopeNull();
        double double17 = envelope4.getHeight();
        double double18 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 200.0d + "'", double18 == 200.0d);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        envelope4.init((double) (byte) 1, (double) (-8L), (double) 8L, (double) (-4L));
        boolean boolean10 = envelope4.isEnvelopeNull();
        boolean boolean11 = envelope4.isEnvelopeNull();
        envelope4.init(51.0d, (double) (-1L), 0.6999999999999993d, 6.1d);
        envelope4.init(28.0d, (double) 8L, (-1.2d), 1.2000000000000002d);
        double double22 = envelope4.getWidth();
        envelope4.init(90.2d, 94.5d, 9.099999999999998d, 88.3d);
        double double28 = envelope4.getHeight();
        double double29 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 20.0d + "'", double22 == 20.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 79.2d + "'", double28 == 79.2d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 79.2d + "'", double29 == 79.2d);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        double double16 = envelope4.getWidth();
        double double17 = envelope4.maxExtent();
        envelope4.init((double) '#', 87.0d, (double) (byte) 1, (double) 0.0f);
        double double23 = envelope4.maxExtent();
        envelope4.init(46.0d, 76.69999999999999d, 94.3d, 5.1d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 52.0d + "'", double23 == 52.0d);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        jts.Envelope envelope4 = new jts.Envelope((double) (-6), 0.0d, (double) (-5L), (double) 7);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-5), 60.0d, 67.3d, 131.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 12.0d + "'", double5 == 12.0d);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        envelope4.init((double) (-8), (double) (-9), (double) (-100), (double) 2L);
        double double16 = envelope4.getHeight();
        double double17 = envelope4.getHeight();
        double double18 = envelope4.getHeight();
        double double19 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 102.0d + "'", double16 == 102.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 102.0d + "'", double17 == 102.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 102.0d + "'", double18 == 102.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 102.0d + "'", double19 == 102.0d);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        jts.Envelope envelope4 = new jts.Envelope(3.299999999999999d, 7.1d, 0.0d, (double) 2L);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.8000000000000007d + "'", double6 == 3.8000000000000007d);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        envelope4.init((double) 1, 200.0d, (-7.3d), 87.0d);
        double double13 = envelope4.getWidth();
        double double14 = envelope4.getWidth();
        double double15 = envelope4.getHeight();
        double double16 = envelope4.maxExtent();
        boolean boolean17 = envelope4.isEnvelopeNull();
        double double18 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 199.0d + "'", double13 == 199.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 199.0d + "'", double14 == 199.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 94.3d + "'", double15 == 94.3d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 199.0d + "'", double16 == 199.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 199.0d + "'", double18 == 199.0d);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        jts.Envelope envelope4 = new jts.Envelope(29.299999999999997d, 31.0d, (double) (-3), 92.8d);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        jts.Envelope envelope4 = new jts.Envelope(4.8d, (double) (short) 0, 7.1d, 0.0d);
        double double5 = envelope4.getHeight();
        envelope4.init(3.299999999999999d, (double) (-1), (double) '4', (double) (-10L));
        double double11 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.1d + "'", double5 == 7.1d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 62.0d + "'", double11 == 62.0d);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init((double) (short) 0, 2.7d, (double) (-1.0f), (double) 100L);
        double double12 = envelope4.getHeight();
        boolean boolean13 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 101.0d + "'", double12 == 101.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getWidth();
        envelope4.init((double) (byte) -1, 0.0d, (double) 10, (double) 100L);
        envelope4.init(0.0d, 3.1d, 34.0d, 7.1d);
        double double19 = envelope4.getWidth();
        double double20 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass21 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 3.1d + "'", double19 == 3.1d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 3.1d + "'", double20 == 3.1d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        jts.Envelope envelope4 = new jts.Envelope((double) 3, 69.0d, 20.0d, (double) (-4));
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 66.0d + "'", double5 == 66.0d);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        jts.Envelope envelope4 = new jts.Envelope(90.49999999999999d, 106.9d, 46.0d, 19.6d);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        jts.Envelope envelope4 = new jts.Envelope((double) (-7), (double) 4L, (-7.3d), (-100.0d));
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init((double) (-4L), 2.9000000000000004d, (double) 10.0f, (double) (-2L));
        boolean boolean11 = envelope4.isEnvelopeNull();
        envelope4.init(10.100000000000001d, 107.9d, 2.0999999999999996d, (double) (-4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 3.0d, (double) 100.0f, 7.1d);
        envelope4.init(1.7000000000000002d, 106.0d, (double) 100.0f, 14.6d);
        boolean boolean10 = envelope4.isEnvelopeNull();
        envelope4.init(86.6d, 3.2d, 6.9d, 102.7d);
        java.lang.Class<?> wildcardClass16 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
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
        envelope4.init(91.0d, 105.7d, (double) 8L, 4.0d);
        double double23 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 109.0d + "'", double15 == 109.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 109.0d + "'", double16 == 109.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 109.0d + "'", double17 == 109.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 14.700000000000003d + "'", double23 == 14.700000000000003d);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        boolean boolean8 = envelope4.isEnvelopeNull();
        envelope4.init((double) 0, 91.3d, (double) (byte) -1, 89.5d);
        double double14 = envelope4.maxExtent();
        double double15 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass16 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 91.3d + "'", double14 == 91.3d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 91.3d + "'", double15 == 91.3d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        jts.Envelope envelope4 = new jts.Envelope(79.7d, 85.4d, 108.4d, 128.0d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.700000000000003d + "'", double5 == 5.700000000000003d);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        jts.Envelope envelope4 = new jts.Envelope(89.5d, 86.0d, 0.0d, 95.2d);
        envelope4.init(0.0d, (double) 3L, 92.9d, (double) 9);
        java.lang.Class<?> wildcardClass10 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        jts.Envelope envelope4 = new jts.Envelope(80.7d, 8.600000000000001d, 7.7d, 82.3d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 74.6d + "'", double5 == 74.6d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 74.6d + "'", double6 == 74.6d);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        jts.Envelope envelope4 = new jts.Envelope((-8.7d), (-6.9d), (-1.0d), (double) (-10));
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.maxExtent();
        double double9 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.0d + "'", double5 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.799999999999999d + "'", double6 == 1.799999999999999d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.0d + "'", double7 == 9.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 9.0d + "'", double8 == 9.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.799999999999999d + "'", double9 == 1.799999999999999d);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getHeight();
        envelope4.init((double) ' ', (-2.1d), 109.0d, (double) 6);
        envelope4.init((double) 10L, (double) 6L, (double) 0L, (-2.1d));
        double double16 = envelope4.getWidth();
        double double17 = envelope4.maxExtent();
        double double18 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.0d + "'", double17 == 4.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        jts.Envelope envelope4 = new jts.Envelope(114.9d, 0.0d, 15.0d, 1.1999999999999886d);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        jts.Envelope envelope4 = new jts.Envelope((double) (-8L), 10.0d, (double) (-6L), (double) 8);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getHeight();
        boolean boolean7 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 14.0d + "'", double6 == 14.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        jts.Envelope envelope4 = new jts.Envelope(73.1d, 77.89999999999999d, 7.1d, 110.0d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.9d + "'", double5 == 102.9d);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
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
        envelope4.init(90.19999999999999d, 3.700000000000003d, 95.2d, 0.0d);
        double double30 = envelope4.maxExtent();
        double double31 = envelope4.maxExtent();
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
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 95.2d + "'", double30 == 95.2d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 95.2d + "'", double31 == 95.2d);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.maxExtent();
        double double9 = envelope4.getWidth();
        double double10 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass11 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.0d + "'", double10 == 8.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        envelope4.init((double) (-8), (double) (-9), (double) (-100), (double) 2L);
        double double16 = envelope4.maxExtent();
        envelope4.init((-7.3d), 15.0d, 6.0d, (double) 100);
        double double22 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 102.0d + "'", double16 == 102.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 94.0d + "'", double22 == 94.0d);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        jts.Envelope envelope4 = new jts.Envelope(0.5999999999999996d, 95.2d, 12.3d, (double) (-1L));
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        jts.Envelope envelope4 = new jts.Envelope(100.30000000000001d, 0.0d, 15.4d, 75.5d);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        jts.Envelope envelope4 = new jts.Envelope((double) (-4L), (double) 7L, 6.9d, (double) (-4L));
        double double5 = envelope4.getWidth();
        envelope4.init(88.6d, (double) 2, 8.1d, 11.9d);
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 11.0d + "'", double5 == 11.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.8000000000000007d + "'", double11 == 3.8000000000000007d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.8000000000000007d + "'", double12 == 3.8000000000000007d);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        jts.Envelope envelope4 = new jts.Envelope(101.8d, 113.39999999999999d, 21.599999999999994d, 1.799999999999999d);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        jts.Envelope envelope4 = new jts.Envelope((-100.0d), 102.1d, 80.0d, 13.6d);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.maxExtent();
        double double10 = envelope4.getHeight();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.4d + "'", double9 == 8.4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.4d + "'", double10 == 8.4d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.4d + "'", double11 == 8.4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.4d + "'", double12 == 8.4d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.4d + "'", double13 == 8.4d);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1), 24.0d, 90.0d, 2.7d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass7 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        jts.Envelope envelope4 = new jts.Envelope(81.5d, 193.0d, 193.0d, 39.0d);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        jts.Envelope envelope4 = new jts.Envelope(6.3d, 85.7d, 98.3d, 5.1d);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) 10, (double) (byte) 1, (double) (byte) 0);
        double double5 = envelope4.maxExtent();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        jts.Envelope envelope4 = new jts.Envelope(9.0d, (double) 0, 92.7d, (double) 100);
        envelope4.init(21.0d, 97.0d, 31.0d, 10.4d);
        envelope4.init(101.0d, 0.0d, (double) (-9L), 1.2000000000000002d);
        envelope4.init((double) 10, 94.1d, (double) 10, 80.7d);
        double double20 = envelope4.maxExtent();
        double double21 = envelope4.maxExtent();
        double double22 = envelope4.maxExtent();
        envelope4.init(89.1d, 114.9d, 83.6d, 4.199999999999997d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 84.1d + "'", double20 == 84.1d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 84.1d + "'", double21 == 84.1d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 84.1d + "'", double22 == 84.1d);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
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
        double double22 = envelope4.getHeight();
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
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        jts.Envelope envelope4 = new jts.Envelope(9.0d, (double) 0, 92.7d, (double) 100);
        envelope4.init(21.0d, 97.0d, 31.0d, 10.4d);
        boolean boolean10 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.getHeight();
        boolean boolean9 = envelope4.isEnvelopeNull();
        double double10 = envelope4.getHeight();
        double double11 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass12 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.4d + "'", double10 == 8.4d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.0d + "'", double11 == 8.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        jts.Envelope envelope4 = new jts.Envelope(21.0d, 96.9d, 4.1d, 34.1d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 75.9d + "'", double5 == 75.9d);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        jts.Envelope envelope4 = new jts.Envelope(51.0d, 12.6d, (-1.2d), 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        boolean boolean7 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.2d + "'", double5 == 1.2d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 38.4d + "'", double6 == 38.4d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        double double16 = envelope4.getWidth();
        double double17 = envelope4.maxExtent();
        boolean boolean18 = envelope4.isEnvelopeNull();
        double double19 = envelope4.getHeight();
        envelope4.init((double) (-1), (double) 10L, 132.0d, 17.4d);
        double double25 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass26 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 8.0d + "'", double19 == 8.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 11.0d + "'", double25 == 11.0d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getWidth();
        boolean boolean10 = envelope4.isEnvelopeNull();
        envelope4.init(43.6d, 32.0d, 87.1d, 55.0d);
        double double16 = envelope4.getWidth();
        boolean boolean17 = envelope4.isEnvelopeNull();
        double double18 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 11.600000000000001d + "'", double16 == 11.600000000000001d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 11.600000000000001d + "'", double18 == 11.600000000000001d);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        jts.Envelope envelope4 = new jts.Envelope(104.39999999999999d, 18.0d, 199.0d, 146.0d);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getHeight();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.maxExtent();
        double double10 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass11 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.4d + "'", double9 == 8.4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.4d + "'", double10 == 8.4d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        jts.Envelope envelope4 = new jts.Envelope(3.3d, 97.0d, 102.5d, 148.0d);
        envelope4.init(92.9d, 193.0d, (-3.8d), 0.0d);
        double double10 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.1d + "'", double10 == 100.1d);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        jts.Envelope envelope4 = new jts.Envelope(101.8d, 3.299999999999999d, 9.099999999999998d, 20.5d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.maxExtent();
        envelope4.init(61.4d, 0.0d, 96.4d, 86.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 98.5d + "'", double5 == 98.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 98.5d + "'", double6 == 98.5d);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.getWidth();
        double double15 = envelope4.maxExtent();
        double double16 = envelope4.maxExtent();
        double double17 = envelope4.getHeight();
        envelope4.init(102.60000000000001d, 3.299999999999997d, 11.799999999999997d, 4.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 109.0d + "'", double15 == 109.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 109.0d + "'", double16 == 109.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 5.0d + "'", double17 == 5.0d);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 3.1d, 5.0d, 2.7d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) 0, (double) 0.0f, (double) (-5), 0.0d);
        boolean boolean12 = envelope4.isEnvelopeNull();
        envelope4.init(155.4d, 39.400000000000006d, 5.4d, 199.0d);
        double double18 = envelope4.getWidth();
        double double19 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3d + "'", double5 == 2.3d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 6.9d + "'", double6 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 116.0d + "'", double18 == 116.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 193.6d + "'", double19 == 193.6d);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.getHeight();
        double double15 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 5.0d + "'", double15 == 5.0d);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        jts.Envelope envelope4 = new jts.Envelope(31.0d, (double) (byte) 100, 2.9000000000000004d, 5.0d);
        envelope4.init(47.0d, 4.799999999999997d, 29.9d, (double) (byte) 0);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        jts.Envelope envelope4 = new jts.Envelope(15.0d, 34.7d, 33.7d, 80.0d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 19.700000000000003d + "'", double5 == 19.700000000000003d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 46.3d + "'", double6 == 46.3d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 46.3d + "'", double7 == 46.3d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 19.700000000000003d + "'", double8 == 19.700000000000003d);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        jts.Envelope envelope4 = new jts.Envelope((double) 100, 24.0d, 5.0d, (double) (-9));
        envelope4.init(102.0d, 109.0d, (double) 1L, (double) (-1));
        envelope4.init(83.7d, 107.8d, 98.6d, (double) 1L);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 10, 84.5d, 10.100000000000001d, 0.0d);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        double double13 = envelope4.maxExtent();
        envelope4.init(95.0d, 0.0d, (-8.7d), (double) (byte) -1);
        double double19 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 106.0d + "'", double13 == 106.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 95.0d + "'", double19 == 95.0d);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        jts.Envelope envelope4 = new jts.Envelope(48.0d, 81.5d, 85.3d, 3.8000000000000007d);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        jts.Envelope envelope4 = new jts.Envelope(5.0d, 5.3d, (double) (-100L), (double) (-2L));
        envelope4.init((double) (byte) 100, 10.5d, (double) (-9L), 8.4d);
        double double10 = envelope4.getHeight();
        envelope4.init(2.1d, (double) 1, (double) (-2), (double) 0);
        java.lang.Class<?> wildcardClass16 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 17.4d + "'", double10 == 17.4d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
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
        double double22 = envelope4.getWidth();
        double double23 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 102.0d + "'", double15 == 102.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.8d + "'", double22 == 2.8d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 6.9d + "'", double23 == 6.9d);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        jts.Envelope envelope4 = new jts.Envelope(59.3d, 76.0d, 72.3d, (double) (-9L));
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getWidth();
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.getHeight();
        boolean boolean12 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.4d + "'", double11 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        jts.Envelope envelope4 = new jts.Envelope(15.0d, 34.7d, 33.7d, 80.0d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 19.700000000000003d + "'", double5 == 19.700000000000003d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 19.700000000000003d + "'", double6 == 19.700000000000003d);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        jts.Envelope envelope4 = new jts.Envelope((double) '4', (double) 10, (double) 5, (double) 1L);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getHeight();
        boolean boolean7 = envelope4.isEnvelopeNull();
        double double8 = envelope4.getHeight();
        envelope4.init(4.4d, 55.3d, 132.0d, 80.19999999999999d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
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
        envelope4.init(1.7000000000000004d, 1.2d, 90.80000000000001d, 3.0999999999999943d);
        double double27 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 8.0d + "'", double20 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 87.70000000000002d + "'", double27 == 87.70000000000002d);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getHeight();
        boolean boolean10 = envelope4.isEnvelopeNull();
        boolean boolean11 = envelope4.isEnvelopeNull();
        envelope4.init((double) 6, 6.9d, 89.5d, 31.0d);
        double double17 = envelope4.getWidth();
        double double18 = envelope4.getHeight();
        envelope4.init(9.9d, 7.1d, 16.200000000000003d, 4.000000000000005d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9000000000000004d + "'", double17 == 0.9000000000000004d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 58.5d + "'", double18 == 58.5d);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        jts.Envelope envelope4 = new jts.Envelope(46.0d, 102.5d, 74.0d, 128.0d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 56.5d + "'", double5 == 56.5d);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        envelope4.init((double) (byte) 1, (double) (-8L), (double) 8L, (double) (-4L));
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getHeight();
        envelope4.init(95.0d, 200.0d, 200.0d, (double) 6);
        boolean boolean19 = envelope4.isEnvelopeNull();
        boolean boolean20 = envelope4.isEnvelopeNull();
        double double21 = envelope4.maxExtent();
        double double22 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass23 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 12.0d + "'", double11 == 12.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 12.0d + "'", double12 == 12.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 12.0d + "'", double13 == 12.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 194.0d + "'", double21 == 194.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 194.0d + "'", double22 == 194.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        jts.Envelope envelope4 = new jts.Envelope(111.9d, 8.4d, 83.7d, 128.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init((double) 1, 85.3d, 117.7d, 62.699999999999996d);
        boolean boolean11 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        jts.Envelope envelope4 = new jts.Envelope(199.0d, 51.0d, 107.0d, 5.9d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) 100.0f, (double) 4, (double) 1.0f, 5.3d);
        envelope4.init(76.0d, 86.5d, 104.0d, 5.4d);
        double double17 = envelope4.maxExtent();
        envelope4.init(31.0d, (-3.8d), (double) 0, 108.4d);
        boolean boolean23 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 98.6d + "'", double17 == 98.6d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 94.3d, 8.7d, (double) 3L);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.699999999999999d + "'", double5 == 5.699999999999999d);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        boolean boolean16 = envelope4.isEnvelopeNull();
        double double17 = envelope4.getHeight();
        double double18 = envelope4.maxExtent();
        double double19 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.0d + "'", double18 == 8.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 8.0d + "'", double19 == 8.0d);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        jts.Envelope envelope4 = new jts.Envelope((double) (-2L), 2.3d, (double) 0.0f, (-5.4d));
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        jts.Envelope envelope4 = new jts.Envelope(13.600000000000001d, 72.9d, 0.0d, 7.3d);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        boolean boolean7 = envelope4.isEnvelopeNull();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getWidth();
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.4d + "'", double11 == 8.4d);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        jts.Envelope envelope4 = new jts.Envelope(15.0d, 36.0d, 89.7d, 108.4d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        jts.Envelope envelope4 = new jts.Envelope(13.600000000000001d, 0.0d, 74.0d, 22.5d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 13.600000000000001d + "'", double5 == 13.600000000000001d);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        jts.Envelope envelope4 = new jts.Envelope((double) 0, 0.0d, 5.8d, (double) '#');
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 29.2d + "'", double5 == 29.2d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 29.2d + "'", double8 == 29.2d);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getHeight();
        envelope4.init((double) ' ', (-2.1d), 109.0d, (double) 6);
        envelope4.init((double) 10L, (double) 6L, (double) 0L, (-2.1d));
        double double16 = envelope4.getWidth();
        double double17 = envelope4.getWidth();
        double double18 = envelope4.getWidth();
        double double19 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.0d + "'", double17 == 4.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 4.0d + "'", double19 == 4.0d);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        jts.Envelope envelope4 = new jts.Envelope(128.0d, 56.7d, 8.0d, 1.5d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.5d + "'", double5 == 6.5d);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init((double) 100, (-100.0d), (double) '#', 5.0d);
        boolean boolean16 = envelope4.isEnvelopeNull();
        boolean boolean17 = envelope4.isEnvelopeNull();
        double double18 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 200.0d + "'", double18 == 200.0d);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.maxExtent();
        envelope4.init((double) 5L, (-6.9d), (-5.4d), 0.0d);
        envelope4.init((double) (-6L), (-7.3d), (double) (short) -1, (double) (-10));
        double double24 = envelope4.getHeight();
        double double25 = envelope4.getWidth();
        boolean boolean26 = envelope4.isEnvelopeNull();
        envelope4.init(13.5d, 91.3d, 36.7d, 41.0d);
        boolean boolean32 = envelope4.isEnvelopeNull();
        double double33 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 106.0d + "'", double13 == 106.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 9.0d + "'", double24 == 9.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.2999999999999998d + "'", double25 == 1.2999999999999998d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 4.299999999999997d + "'", double33 == 4.299999999999997d);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        jts.Envelope envelope4 = new jts.Envelope(9.5d, 11.1d, 0.6000000000000014d, 0.0d);
        envelope4.init(61.0d, 0.0d, 91.3d, 1.4000000000000004d);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init((-6.9d), (-2.1d), (-7.3d), (double) 4);
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.getHeight();
        double double14 = envelope4.getHeight();
        double double15 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass16 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 11.3d + "'", double12 == 11.3d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 11.3d + "'", double13 == 11.3d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 11.3d + "'", double14 == 11.3d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 11.3d + "'", double15 == 11.3d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getHeight();
        envelope4.init((double) ' ', (-2.1d), 109.0d, (double) 6);
        boolean boolean11 = envelope4.isEnvelopeNull();
        boolean boolean12 = envelope4.isEnvelopeNull();
        boolean boolean13 = envelope4.isEnvelopeNull();
        boolean boolean14 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 103.0d + "'", double6 == 103.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 103.0d + "'", double7 == 103.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 103.0d + "'", double8 == 103.0d);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        jts.Envelope envelope4 = new jts.Envelope((double) (-8L), 66.0d, 11.600000000000001d, 3.8000000000000007d);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
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
        boolean boolean26 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.0d + "'", double18 == 8.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 94.1d + "'", double25 == 94.1d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        boolean boolean13 = envelope4.isEnvelopeNull();
        boolean boolean14 = envelope4.isEnvelopeNull();
        double double15 = envelope4.getWidth();
        double double16 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 106.0d + "'", double15 == 106.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 106.0d + "'", double16 == 106.0d);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), 13.4d, 109.0d, 23.5d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        jts.Envelope envelope4 = new jts.Envelope(92.7d, (double) (-10L), 1.2d, (double) (-8L));
        envelope4.init(95.2d, 8.7d, 1.7000000000000002d, 92.0d);
        double double10 = envelope4.getHeight();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.getHeight();
        double double14 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 90.3d + "'", double10 == 90.3d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 90.3d + "'", double11 == 90.3d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 90.3d + "'", double12 == 90.3d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 90.3d + "'", double13 == 90.3d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 90.3d + "'", double14 == 90.3d);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        jts.Envelope envelope4 = new jts.Envelope(5.3d, (double) 9L, 3.1d, 10.4d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) (-1L), (double) (-1.0f), (double) 0L, 100.0d);
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.maxExtent();
        double double14 = envelope4.getWidth();
        boolean boolean15 = envelope4.isEnvelopeNull();
        double double16 = envelope4.getWidth();
        envelope4.init(18.7d, 117.5d, 14.700000000000003d, 109.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (short) 0, (-9.3d), (double) (-1L));
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.3d + "'", double5 == 8.3d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.0d + "'", double7 == 9.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 9.0d + "'", double8 == 9.0d);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        jts.Envelope envelope4 = new jts.Envelope((double) 8L, (double) 2L, 52.0d, (double) (byte) 100);
        double double5 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.0d + "'", double5 == 6.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        jts.Envelope envelope4 = new jts.Envelope(65.0d, (double) (-1L), (double) (-8), 98.0d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 106.0d + "'", double5 == 106.0d);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        jts.Envelope envelope4 = new jts.Envelope(92.7d, (double) (-10L), 1.2d, (double) (-8L));
        envelope4.init(95.2d, 8.7d, 1.7000000000000002d, 92.0d);
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getWidth();
        boolean boolean12 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass13 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 90.3d + "'", double10 == 90.3d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 86.5d + "'", double11 == 86.5d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        jts.Envelope envelope4 = new jts.Envelope((double) 3L, 1.0d, (double) 5L, 14.0d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        jts.Envelope envelope4 = new jts.Envelope((double) (-10L), (double) (byte) -1, 100.0d, (double) 1);
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.0d + "'", double5 == 9.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        jts.Envelope envelope4 = new jts.Envelope(3.5999999999999996d, 104.1d, 17.200000000000003d, 114.1d);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        jts.Envelope envelope4 = new jts.Envelope((double) 2L, 15.0d, 199.0d, 101.8d);
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 13.0d + "'", double5 == 13.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
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
        java.lang.Class<?> wildcardClass14 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.0d + "'", double12 == 8.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        jts.Envelope envelope4 = new jts.Envelope(90.89999999999999d, 76.0d, 93.7d, 61.9d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 31.800000000000004d + "'", double5 == 31.800000000000004d);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        jts.Envelope envelope4 = new jts.Envelope(72.2d, 90.6d, 11.600000000000001d, 10.8d);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
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
        double double30 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 106.0d + "'", double13 == 106.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 11.9d + "'", double19 == 11.9d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 96.89999999999999d + "'", double30 == 96.89999999999999d);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        jts.Envelope envelope4 = new jts.Envelope((double) 4, 85.5d, 116.0d, (double) 100);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getHeight();
        double double14 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 104.0d + "'", double12 == 104.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 106.0d + "'", double14 == 106.0d);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getWidth();
        envelope4.init((double) (-100), (-8.7d), (double) (-1L), (double) (-3L));
        double double19 = envelope4.maxExtent();
        envelope4.init(9.6d, (double) (-10), 81.3d, 84.1d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 104.0d + "'", double12 == 104.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 106.0d + "'", double13 == 106.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 91.3d + "'", double19 == 91.3d);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        double double11 = envelope4.getWidth();
        double double12 = envelope4.maxExtent();
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.getWidth();
        envelope4.init(107.3d, (double) (-4L), 148.0d, 14.0d);
        boolean boolean20 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 106.0d + "'", double14 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        envelope4.init((double) (byte) 1, (double) (-8L), (double) 8L, (double) (-4L));
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getHeight();
        envelope4.init(95.0d, 200.0d, 200.0d, (double) 6);
        boolean boolean19 = envelope4.isEnvelopeNull();
        double double20 = envelope4.getWidth();
        boolean boolean21 = envelope4.isEnvelopeNull();
        double double22 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 12.0d + "'", double11 == 12.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 12.0d + "'", double12 == 12.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 12.0d + "'", double13 == 12.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 105.0d + "'", double20 == 105.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 105.0d + "'", double22 == 105.0d);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        jts.Envelope envelope4 = new jts.Envelope(7.0d, 101.0d, 42.0d, 102.0d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 94.0d + "'", double5 == 94.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 94.0d + "'", double6 == 94.0d);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getHeight();
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.getHeight();
        double double15 = envelope4.maxExtent();
        boolean boolean16 = envelope4.isEnvelopeNull();
        double double17 = envelope4.maxExtent();
        boolean boolean18 = envelope4.isEnvelopeNull();
        double double19 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 104.0d + "'", double12 == 104.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 104.0d + "'", double14 == 104.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 106.0d + "'", double15 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 106.0d + "'", double17 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 106.0d + "'", double19 == 106.0d);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        jts.Envelope envelope4 = new jts.Envelope(91.1d, 51.0d, 63.3d, 0.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getHeight();
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.getHeight();
        double double15 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass16 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 104.0d + "'", double12 == 104.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 104.0d + "'", double14 == 104.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 104.0d + "'", double15 == 104.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        jts.Envelope envelope4 = new jts.Envelope(11.9d, 0.0d, (double) (-4), 34.0d);
        envelope4.init(12.6d, 15.0d, (double) 8L, 1.799999999999999d);
        double double10 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6.200000000000001d + "'", double10 == 6.200000000000001d);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        jts.Envelope envelope4 = new jts.Envelope((double) (-10L), (double) (-9L), 39.4d, 11.299999999999983d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 28.100000000000016d + "'", double5 == 28.100000000000016d);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 3.1d, 5.0d, 2.7d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        boolean boolean7 = envelope4.isEnvelopeNull();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getHeight();
        boolean boolean10 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.9d + "'", double5 == 6.9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.3d + "'", double6 == 2.3d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.3d + "'", double9 == 2.3d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        jts.Envelope envelope4 = new jts.Envelope(89.2d, 100.0d, 27.3d, 0.5999999999999996d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getWidth();
        envelope4.init(9.2d, (double) 100, (double) 0.0f, 92.0d);
        envelope4.init(61.4d, 33.4d, 96.0d, 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        jts.Envelope envelope4 = new jts.Envelope((double) 100, 100.0d, (double) 0.0f, (double) 0L);
        envelope4.init(1.7000000000000002d, (double) (-5), 65.0d, (double) (-8));
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getWidth();
        double double13 = envelope4.getWidth();
        boolean boolean14 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 73.0d + "'", double11 == 73.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.7d + "'", double12 == 6.7d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 6.7d + "'", double13 == 6.7d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
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
        java.lang.Class<?> wildcardClass33 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 6.9d + "'", double19 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 4.799999999999997d + "'", double31 == 4.799999999999997d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 2.200000000000003d + "'", double32 == 2.200000000000003d);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        jts.Envelope envelope4 = new jts.Envelope((double) 4, 74.69999999999999d, 115.1d, 126.4d);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 3.1d, 5.0d, 2.7d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) 0, (double) 0.0f, (double) (-5), 0.0d);
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.maxExtent();
        double double14 = envelope4.getWidth();
        boolean boolean15 = envelope4.isEnvelopeNull();
        boolean boolean16 = envelope4.isEnvelopeNull();
        double double17 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3d + "'", double5 == 2.3d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 6.9d + "'", double6 == 6.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 5.0d + "'", double12 == 5.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        jts.Envelope envelope4 = new jts.Envelope(25.0d, 35.0d, 3.700000000000003d, (double) (-7L));
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        jts.Envelope envelope4 = new jts.Envelope(4.8d, (double) (short) 0, 7.1d, 0.0d);
        envelope4.init((double) 5L, 9.5d, 103.7d, 0.0d);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        jts.Envelope envelope4 = new jts.Envelope(8.600000000000001d, (-4.6d), 5.1d, 105.4d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.30000000000001d + "'", double5 == 100.30000000000001d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.30000000000001d + "'", double6 == 100.30000000000001d);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        jts.Envelope envelope4 = new jts.Envelope(2.1d, 91.3d, 7.1d, 17.6d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 89.2d + "'", double5 == 89.2d);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        jts.Envelope envelope4 = new jts.Envelope(111.0d, 14.6d, (double) (-7L), 14.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 21.0d + "'", double7 == 21.0d);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, (-5.4d), 0.0d, 65.0d);
        envelope4.init(95.7d, 104.6d, (double) (-2), (double) 1L);
        envelope4.init(0.5d, 31.0d, 36.0d, 12.6d);
        double double15 = envelope4.getHeight();
        envelope4.init(81.5d, 84.5d, 77.7d, 3.299999999999999d);
        java.lang.Class<?> wildcardClass21 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 23.4d + "'", double15 == 23.4d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        jts.Envelope envelope4 = new jts.Envelope(24.0d, (double) 2, 104.0d, (-7.3d));
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        envelope4.init(99.7d, (double) 2, 8.4d, (double) (-8));
        envelope4.init(34.4d, (double) (-6), 97.10000000000001d, 193.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 111.3d + "'", double5 == 111.3d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 111.3d + "'", double6 == 111.3d);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        jts.Envelope envelope4 = new jts.Envelope(74.6d, 10.4d, 95.10000000000001d, 39.400000000000006d);
        envelope4.init(3.3999999999999915d, 106.9d, 4.0d, 6.200000000000001d);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) 0, (-2.1d), (double) (-8L), (double) (-4));
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.1d + "'", double5 == 2.1d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, (-5.4d), 0.0d, 65.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.maxExtent();
        envelope4.init(29.9d, 18.9d, 1.8000000000000007d, 16.3d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.4d + "'", double7 == 15.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 65.0d + "'", double8 == 65.0d);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        jts.Envelope envelope4 = new jts.Envelope((double) 10L, 18.0d, (double) (-8), 13.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init(109.1d, 19.700000000000003d, (-7.3d), 77.5d);
        boolean boolean11 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 21.0d + "'", double5 == 21.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        boolean boolean16 = envelope4.isEnvelopeNull();
        double double17 = envelope4.getWidth();
        boolean boolean18 = envelope4.isEnvelopeNull();
        boolean boolean19 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        jts.Envelope envelope4 = new jts.Envelope((double) 10L, 18.0d, (double) (-8), 13.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init(0.0d, 51.0d, 110.0d, (double) 9);
        double double11 = envelope4.getHeight();
        envelope4.init(11.299999999999983d, 22.5d, 88.7d, 65.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 21.0d + "'", double5 == 21.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 101.0d + "'", double11 == 101.0d);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        jts.Envelope envelope4 = new jts.Envelope((-4.6d), 77.9d, 13.899999999999991d, 62.9d);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        jts.Envelope envelope4 = new jts.Envelope(19.0d, 82.3d, 111.3d, 2.3d);
        double double5 = envelope4.getHeight();
        envelope4.init(66.0d, 99.9d, 17.6d, 100.8d);
        double double11 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 109.0d + "'", double5 == 109.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 83.19999999999999d + "'", double11 == 83.19999999999999d);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        jts.Envelope envelope4 = new jts.Envelope(89.5d, (double) (byte) 100, 2.9000000000000004d, (double) (-1));
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        boolean boolean7 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass8 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.5d + "'", double6 == 10.5d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        jts.Envelope envelope4 = new jts.Envelope((double) (-8L), 10.0d, (double) (-6L), (double) 8);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getWidth();
        boolean boolean10 = envelope4.isEnvelopeNull();
        envelope4.init(30.2d, 92.3d, (double) 2, 49.400000000000006d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.0d + "'", double7 == 18.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 14.0d + "'", double8 == 14.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 18.0d + "'", double9 == 18.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        jts.Envelope envelope4 = new jts.Envelope((double) (-10), (double) (-3L), 0.0d, (double) 10.0f);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.0d + "'", double5 == 7.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.0d + "'", double6 == 7.0d);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getWidth();
        envelope4.init(9.2d, (double) 100, (double) 0.0f, 92.0d);
        boolean boolean14 = envelope4.isEnvelopeNull();
        double double15 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass16 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 90.8d + "'", double15 == 90.8d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        jts.Envelope envelope4 = new jts.Envelope((double) 7L, (double) 1.0f, 105.7d, 5.8999999999999995d);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        jts.Envelope envelope4 = new jts.Envelope(17.5d, 74.0d, 55.89999999999999d, 17.200000000000003d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, (double) (short) 100, 104.1d, (double) (-5L));
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 109.1d + "'", double5 == 109.1d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 109.1d + "'", double6 == 109.1d);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        jts.Envelope envelope4 = new jts.Envelope(93.7d, 82.9d, 96.4d, 89.2d);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        jts.Envelope envelope4 = new jts.Envelope(66.0d, 5.9d, 108.4d, 85.3d);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) 10, (double) (byte) 1, (double) (byte) 0);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.maxExtent();
        double double9 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        jts.Envelope envelope4 = new jts.Envelope((double) 7, (double) 10.0f, (double) 4L, (double) 0L);
        envelope4.init((double) 10, (double) 8, (double) 8, (-1.2d));
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.0d + "'", double10 == 2.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 9.2d + "'", double11 == 9.2d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 9.2d + "'", double12 == 9.2d);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.getHeight();
        double double15 = envelope4.maxExtent();
        double double16 = envelope4.getHeight();
        boolean boolean17 = envelope4.isEnvelopeNull();
        envelope4.init(92.0d, 128.0d, 0.6999999999999993d, (double) (-10L));
        double double23 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 109.0d + "'", double15 == 109.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5.0d + "'", double16 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 36.0d + "'", double23 == 36.0d);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.getHeight();
        envelope4.init((double) 100L, (double) (byte) 100, 14.0d, 102.7d);
        java.lang.Class<?> wildcardClass14 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        jts.Envelope envelope4 = new jts.Envelope((-6.9d), 1.7000000000000002d, 13.0d, 6.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.getHeight();
        envelope4.init((double) (-10), 14.2d, 6.900000000000006d, 89.2d);
        double double14 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.600000000000001d + "'", double7 == 8.600000000000001d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.0d + "'", double8 == 7.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 24.2d + "'", double14 == 24.2d);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        jts.Envelope envelope4 = new jts.Envelope(5.0d, 5.3d, (double) (-100L), (double) (-2L));
        envelope4.init((double) (byte) 100, 10.5d, (double) (-9L), 8.4d);
        envelope4.init((double) (byte) 0, (double) 5, 86.5d, 34.0d);
        double double15 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 5.0d + "'", double15 == 5.0d);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        jts.Envelope envelope4 = new jts.Envelope(1.5999999999999996d, (double) '#', 0.0d, 11.0d);
        double double5 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 33.4d + "'", double5 == 33.4d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
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
        java.lang.Class<?> wildcardClass19 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 109.0d + "'", double15 == 109.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 109.0d + "'", double16 == 109.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 5.0d + "'", double17 == 5.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 109.0d + "'", double18 == 109.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 1.8000000000000007d, 96.8d, (double) (byte) 1);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        jts.Envelope envelope4 = new jts.Envelope(4.499999999999999d, 98.7d, 88.1d, 7.6d);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        jts.Envelope envelope4 = new jts.Envelope(128.0d, 2.299999999999997d, 7.1d, (double) 1L);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
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
        double double29 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 6.9d + "'", double19 == 6.9d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.0d + "'", double20 == 2.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 6.9d + "'", double21 == 6.9d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.0d + "'", double22 == 2.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 3.2d + "'", double28 == 3.2d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 3.2d + "'", double29 == 3.2d);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 73.0d, 0.5999999999999996d, 0.0d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 73.0d + "'", double5 == 73.0d);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) 100, 9.2d, 0.0d, (-4.6d));
        envelope4.init(11.299999999999983d, 93.69999999999999d, 92.0d, 11.899999999999999d);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        jts.Envelope envelope4 = new jts.Envelope(53.2d, 77.5d, 1.3999999999999986d, 51.0d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        jts.Envelope envelope4 = new jts.Envelope(12.0d, (-10.5d), 18.4d, 126.4d);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        jts.Envelope envelope4 = new jts.Envelope(61.9d, 11.3d, (double) (short) 0, 0.0d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 50.599999999999994d + "'", double5 == 50.599999999999994d);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        jts.Envelope envelope4 = new jts.Envelope(92.7d, (double) (-10L), 1.2d, (double) (-8L));
        double double5 = envelope4.getWidth();
        envelope4.init(0.0d, 2.9000000000000004d, (double) (-6L), 184.1d);
        envelope4.init(36.7d, 83.19999999999999d, 90.8d, 88.1d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.7d + "'", double5 == 102.7d);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), (double) (short) 0, 1.0d, (double) 10);
        boolean boolean5 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        jts.Envelope envelope4 = new jts.Envelope((-2.1d), 94.1d, (double) (-2), 86.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 88.0d + "'", double5 == 88.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 88.0d + "'", double6 == 88.0d);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        jts.Envelope envelope4 = new jts.Envelope(84.99999999999999d, (-5.4d), 102.3d, 96.0d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 90.39999999999999d + "'", double5 == 90.39999999999999d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 6.299999999999997d + "'", double6 == 6.299999999999997d);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 79.2d, 103.7d, 184.1d);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        jts.Envelope envelope4 = new jts.Envelope((double) (-10), (double) (-3L), 0.0d, (double) 10.0f);
        envelope4.init(94.1d, (-7.3d), 2.1d, 9.2d);
        boolean boolean10 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass11 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getHeight();
        double double10 = envelope4.getWidth();
        double double11 = envelope4.getWidth();
        double double12 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.4d + "'", double9 == 8.4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.0d + "'", double10 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.0d + "'", double11 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.0d + "'", double12 == 8.0d);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        jts.Envelope envelope4 = new jts.Envelope(94.3d, (double) 10L, 0.0d, 104.6d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 84.3d + "'", double5 == 84.3d);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        jts.Envelope envelope4 = new jts.Envelope(5.3d, (double) 1, 96.2d, (double) (-9L));
        boolean boolean5 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        jts.Envelope envelope4 = new jts.Envelope(98.89999999999999d, 90.2d, 5.9d, 97.0d);
        double double5 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 91.1d + "'", double5 == 91.1d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        jts.Envelope envelope4 = new jts.Envelope(43.6d, 199.0d, 11.3d, 194.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 182.7d + "'", double5 == 182.7d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 182.7d + "'", double6 == 182.7d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 182.7d + "'", double7 == 182.7d);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        boolean boolean16 = envelope4.isEnvelopeNull();
        double double17 = envelope4.getHeight();
        double double18 = envelope4.maxExtent();
        envelope4.init(10.4d, 132.0d, 1.2d, 22.3d);
        double double24 = envelope4.getHeight();
        boolean boolean25 = envelope4.isEnvelopeNull();
        double double26 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.0d + "'", double18 == 8.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 21.1d + "'", double24 == 21.1d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 121.6d + "'", double26 == 121.6d);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        double double16 = envelope4.getWidth();
        double double17 = envelope4.getHeight();
        double double18 = envelope4.getWidth();
        double double19 = envelope4.maxExtent();
        double double20 = envelope4.getHeight();
        envelope4.init(5.0d, 102.0d, 77.5d, 9.9d);
        boolean boolean26 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 8.0d + "'", double19 == 8.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 8.0d + "'", double20 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) 0, (-2.1d), (double) (-8L), (double) (-4));
        envelope4.init((double) 100.0f, 9.0d, (-2.1d), (double) 100L);
        envelope4.init((double) (-1L), 5.3d, 2.7d, 2.3d);
        double double15 = envelope4.maxExtent();
        double double16 = envelope4.maxExtent();
        double double17 = envelope4.maxExtent();
        double double18 = envelope4.getHeight();
        double double19 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 6.3d + "'", double15 == 6.3d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 6.3d + "'", double16 == 6.3d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 6.3d + "'", double17 == 6.3d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.40000000000000036d + "'", double18 == 0.40000000000000036d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 6.3d + "'", double19 == 6.3d);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getWidth();
        envelope4.init(0.0d, (double) 10, (double) 0L, (double) 0.0f);
        envelope4.init((-8.7d), 3.3d, 10.5d, 17.4d);
        double double20 = envelope4.maxExtent();
        double double21 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 12.0d + "'", double20 == 12.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 12.0d + "'", double21 == 12.0d);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        jts.Envelope envelope4 = new jts.Envelope(7.899999999999999d, 73.0d, 22.5d, 105.4d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init((double) ' ', (double) 1, (double) (short) -1, 100.0d);
        double double12 = envelope4.getWidth();
        double double13 = envelope4.getWidth();
        double double14 = envelope4.getHeight();
        boolean boolean15 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 31.0d + "'", double12 == 31.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 31.0d + "'", double13 == 31.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 101.0d + "'", double14 == 101.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        jts.Envelope envelope4 = new jts.Envelope(79.7d, 1.2000000000000002d, 3.9000000000000004d, 108.0d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 104.1d + "'", double5 == 104.1d);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        jts.Envelope envelope4 = new jts.Envelope(11.9d, 6.1d, (double) (-1L), (double) (-1));
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
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        jts.Envelope envelope4 = new jts.Envelope((double) 0L, (double) (-9), (double) (-3L), 3.1d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.0d + "'", double6 == 9.0d);
    }
}

