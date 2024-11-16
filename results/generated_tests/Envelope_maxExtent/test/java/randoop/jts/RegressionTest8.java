package jts;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        jts.Envelope envelope4 = new jts.Envelope((double) 2, (double) 9L, 4.8d, (double) (-1));
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.0d + "'", double6 == 7.0d);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), 76.0d, (double) (-100), (double) (-9));
        double double5 = envelope4.maxExtent();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 91.0d + "'", double5 == 91.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        double double13 = envelope4.getHeight();
        boolean boolean14 = envelope4.isEnvelopeNull();
        envelope4.init((double) (byte) -1, (double) 100, 2.0d, (double) (-8));
        boolean boolean20 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass21 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 3.1d, 5.0d, 2.7d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) 0, (double) 0.0f, (double) (-5), 0.0d);
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.maxExtent();
        double double14 = envelope4.getWidth();
        envelope4.init(32.0d, 8.099999999999994d, 86.1d, 80.2d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3d + "'", double5 == 2.3d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 6.9d + "'", double6 == 6.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 5.0d + "'", double12 == 5.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        jts.Envelope envelope4 = new jts.Envelope(4.799999999999997d, 0.6000000000000005d, 62.0d, 91.3d);
        double double5 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 29.299999999999997d + "'", double5 == 29.299999999999997d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        jts.Envelope envelope4 = new jts.Envelope(112.1d, 82.2d, 49.099999999999994d, 100.7d);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
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
        java.lang.Class<?> wildcardClass26 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.0d + "'", double18 == 8.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 94.1d + "'", double24 == 94.1d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        jts.Envelope envelope4 = new jts.Envelope(109.0d, 2.3d, 58.5d, 53.9d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        jts.Envelope envelope4 = new jts.Envelope((double) 8L, (double) 2L, 52.0d, (double) (byte) 100);
        envelope4.init(88.7d, 92.2d, (-10.5d), 106.9d);
        double double10 = envelope4.maxExtent();
        envelope4.init(52.599999999999994d, 103.3d, 64.0d, 25.1d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 117.4d + "'", double10 == 117.4d);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        jts.Envelope envelope4 = new jts.Envelope(100.8d, 81.1d, (-7.3d), 68.7d);
        envelope4.init(198.5d, 92.0d, (double) 2, 1.6999999999999993d);
        double double10 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.5d + "'", double10 == 106.5d);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
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
        boolean boolean23 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 8.0d + "'", double19 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 8.0d + "'", double21 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        jts.Envelope envelope4 = new jts.Envelope(33.0d, (double) (-9L), 42.0d, 46.2d);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        jts.Envelope envelope4 = new jts.Envelope(26.700000000000003d, 69.39999999999999d, 83.3d, 6.300000000000001d);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        jts.Envelope envelope4 = new jts.Envelope(96.0d, 19.700000000000003d, 31.0d, (double) (-1));
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 76.3d + "'", double5 == 76.3d);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        jts.Envelope envelope4 = new jts.Envelope(1.2999999999999998d, (double) (-5L), 42.3d, 12.200000000000003d);
        envelope4.init(100.1d, 88.5d, 8.600000000000001d, 5.700000000000003d);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        jts.Envelope envelope4 = new jts.Envelope(100.0d, 10.5d, (double) 2, (-100.0d));
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        boolean boolean7 = envelope4.isEnvelopeNull();
        double double8 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.0d + "'", double5 == 102.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 102.0d + "'", double6 == 102.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 102.0d + "'", double8 == 102.0d);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        jts.Envelope envelope4 = new jts.Envelope((double) 0, 0.0d, 5.8d, (double) '#');
        double double5 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 10, (double) 100, (double) 1, (double) (byte) 100);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getHeight();
        envelope4.init(61.9d, 42.3d, 100.60000000000001d, 5.800000000000001d);
        envelope4.init(3.0999999999999996d, 1.7000000000000004d, 63.3d, 95.7d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 90.0d + "'", double6 == 90.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 99.0d + "'", double7 == 99.0d);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        jts.Envelope envelope4 = new jts.Envelope((double) 7, (double) 10.0f, (double) 4L, (double) 0L);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        envelope4.init(100.0d, 11.3d, 194.0d, 107.5d);
        java.lang.Class<?> wildcardClass12 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.0d + "'", double6 == 3.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getWidth();
        double double9 = envelope4.getWidth();
        double double10 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.4d + "'", double10 == 8.4d);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        jts.Envelope envelope4 = new jts.Envelope((double) 8L, (-5.4d), 5.8d, (double) 10L);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.2d + "'", double5 == 4.2d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 13.4d + "'", double6 == 13.4d);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
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
        boolean boolean24 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 109.0d + "'", double15 == 109.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5.0d + "'", double16 == 5.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.6000000000000005d + "'", double22 == 0.6000000000000005d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 86.0d + "'", double23 == 86.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, (-5.4d), 0.0d, 65.0d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.maxExtent();
        envelope4.init(27.3d, 33.4d, 105.2d, 20.2d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.4d + "'", double5 == 15.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 65.0d + "'", double6 == 65.0d);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        jts.Envelope envelope4 = new jts.Envelope((double) 10L, 2.1d, 94.1d, 0.0d);
        envelope4.init((double) (-1), 101.8d, 198.1d, (-3.8d));
        boolean boolean10 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        jts.Envelope envelope4 = new jts.Envelope((double) (-6), 0.0d, (double) (-5L), (double) 7);
        envelope4.init(9.099999999999998d, (double) (-1), (double) (-7L), 20.0d);
        envelope4.init((double) 4L, 2.0999999999999996d, 0.5d, 0.0d);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 52.7d, 79.9d, 8.8d);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getWidth();
        double double10 = envelope4.maxExtent();
        envelope4.init(14.700000000000003d, 38.0d, (double) (-1.0f), 5.0d);
        double double16 = envelope4.getWidth();
        boolean boolean17 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.4d + "'", double10 == 8.4d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 23.299999999999997d + "'", double16 == 23.299999999999997d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        jts.Envelope envelope4 = new jts.Envelope((double) (-6L), (double) (-7), 24.0d, 6.9d);
        envelope4.init((double) 100, 13.4d, 0.6999999999999993d, 3.0d);
        double double10 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass11 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 86.6d + "'", double10 == 86.6d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        jts.Envelope envelope4 = new jts.Envelope(36.0d, (double) 100.0f, 100.0d, 69.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init(3.9000000000000004d, 111.0d, 107.3d, (double) 9);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 64.0d + "'", double5 == 64.0d);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        envelope4.init((double) (byte) 1, (double) (-4L), (double) 100L, 4.8d);
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        envelope4.init((double) 4, 9.6d, (double) 3L, (double) 100L);
        double double18 = envelope4.getHeight();
        boolean boolean19 = envelope4.isEnvelopeNull();
        double double20 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 95.2d + "'", double10 == 95.2d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 95.2d + "'", double11 == 95.2d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        jts.Envelope envelope4 = new jts.Envelope(65.1d, 3.7d, 4.299999999999999d, 11.299999999999983d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 61.39999999999999d + "'", double6 == 61.39999999999999d);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.maxExtent();
        double double14 = envelope4.getWidth();
        double double15 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 106.0d + "'", double13 == 106.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 106.0d + "'", double14 == 106.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 106.0d + "'", double15 == 106.0d);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (short) 0, (-9.3d), (double) (-1L));
        envelope4.init((-2.1d), (double) (-6), (double) (-6L), 2.9000000000000004d);
        envelope4.init(10.4d, 104.1d, 105.0d, 8.600000000000001d);
        double double15 = envelope4.maxExtent();
        double double16 = envelope4.getWidth();
        envelope4.init(2.0d, 1.2d, 54.3d, 5.299999999999983d);
        double double22 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 96.4d + "'", double15 == 96.4d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 93.69999999999999d + "'", double16 == 93.69999999999999d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 49.000000000000014d + "'", double22 == 49.000000000000014d);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        double double13 = envelope4.getWidth();
        double double14 = envelope4.maxExtent();
        double double15 = envelope4.getHeight();
        envelope4.init(90.3d, 18.4d, 33.1d, 33.1d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 109.0d + "'", double13 == 109.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 5.0d + "'", double15 == 5.0d);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        jts.Envelope envelope4 = new jts.Envelope(9.2d, 76.0d, 102.0d, (double) (-1));
        double double5 = envelope4.maxExtent();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 66.8d + "'", double7 == 66.8d);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        jts.Envelope envelope4 = new jts.Envelope(87.1d, 100.30000000000001d, 34.1d, 90.2d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 56.1d + "'", double5 == 56.1d);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.maxExtent();
        boolean boolean8 = envelope4.isEnvelopeNull();
        envelope4.init(1.3000000000000007d, 21.0d, 13.5d, (double) 10);
        double double14 = envelope4.getHeight();
        boolean boolean15 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 103.0d + "'", double6 == 103.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 103.0d + "'", double7 == 103.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.5d + "'", double14 == 3.5d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        jts.Envelope envelope4 = new jts.Envelope((double) (-7L), 74.6d, 79.2d, (double) 100.0f);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init((double) 100, (-100.0d), (double) '#', 5.0d);
        envelope4.init((double) 5, (double) (short) 10, 96.0d, (double) (byte) 10);
        envelope4.init(100.0d, (-100.0d), (double) (byte) 100, (double) 1L);
        envelope4.init((double) 3, 4.8d, 100.0d, 0.0d);
        envelope4.init(111.9d, 4.4d, 0.0d, (double) (-100L));
        double double36 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 107.5d + "'", double36 == 107.5d);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        jts.Envelope envelope4 = new jts.Envelope(84.9d, 34.4d, 24.600000000000005d, 114.4d);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        jts.Envelope envelope4 = new jts.Envelope(104.1d, 104.6d, (-5.4d), 98.6d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, (double) 9, (double) '4', 110.0d);
        double double5 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 58.0d + "'", double5 == 58.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        jts.Envelope envelope4 = new jts.Envelope((double) 9L, (double) 10, (double) (-7L), (double) 0L);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.0d + "'", double5 == 7.0d);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 1, (double) 0.0f, (double) 6, (double) 3L);
        envelope4.init(31.800000000000004d, 3.8000000000000007d, (double) (short) 1, (double) ' ');
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        jts.Envelope envelope4 = new jts.Envelope((double) 100, 24.0d, 5.0d, (double) (-9));
        double double5 = envelope4.getWidth();
        envelope4.init(5.0d, 10.4d, 13.0d, (double) 2L);
        double double11 = envelope4.getHeight();
        boolean boolean12 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 76.0d + "'", double5 == 76.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 11.0d + "'", double11 == 11.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        jts.Envelope envelope4 = new jts.Envelope(16.200000000000003d, 0.0d, 0.0d, 65.0d);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        jts.Envelope envelope4 = new jts.Envelope(38.4d, 0.5999999999999996d, 94.3d, 41.0d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 53.3d + "'", double5 == 53.3d);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        jts.Envelope envelope4 = new jts.Envelope(2.9000000000000004d, 1.2d, 94.0d, (double) (-10));
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7000000000000004d + "'", double5 == 1.7000000000000004d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 104.0d + "'", double7 == 104.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7000000000000004d + "'", double8 == 1.7000000000000004d);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        jts.Envelope envelope4 = new jts.Envelope((double) (-6), 0.0d, (double) (-5L), (double) 7);
        envelope4.init(9.099999999999998d, (double) (-1), (double) (-7L), 20.0d);
        envelope4.init(70.2d, 4.4d, 7.4d, 14.2d);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        jts.Envelope envelope4 = new jts.Envelope(15.0d, 34.7d, 33.7d, 80.0d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 46.3d + "'", double5 == 46.3d);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        envelope4.init((-5.4d), (-8.7d), (double) 5L, (double) 7);
        envelope4.init((double) (-1L), 0.0d, (double) (-6L), 14.0d);
        double double17 = envelope4.getWidth();
        envelope4.init(13.0d, (double) (-2), 0.9000000000000004d, 8.700000000000003d);
        java.lang.Class<?> wildcardClass23 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        jts.Envelope envelope4 = new jts.Envelope(8.600000000000001d, 22.3d, (double) (-4L), (-4.6d));
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), 41.3d, 4.6d, 77.9d);
        envelope4.init(84.5d, (double) 0.0f, (double) 9L, (double) (short) 10);
        boolean boolean10 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass11 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        jts.Envelope envelope4 = new jts.Envelope((double) '#', (double) (short) 100, (double) (short) -1, (double) 1L);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.getWidth();
        envelope4.init(100.2d, 38.1d, 20.0d, 91.0d);
        boolean boolean14 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 65.0d + "'", double6 == 65.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 65.0d + "'", double7 == 65.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 65.0d + "'", double8 == 65.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) 0, (-2.1d), (double) (-8L), (double) (-4));
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.1d + "'", double7 == 2.1d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        jts.Envelope envelope4 = new jts.Envelope(7.899999999999999d, 73.0d, 22.5d, 105.4d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 82.9d + "'", double6 == 82.9d);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
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
        boolean boolean23 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 102.0d + "'", double15 == 102.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 6.9d + "'", double22 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 54.2d, 5.1d, 11.3d);
        double double5 = envelope4.getWidth();
        envelope4.init((double) 6, 5.699999999999999d, 84.10000000000001d, 5.4d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 54.2d + "'", double5 == 54.2d);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        jts.Envelope envelope4 = new jts.Envelope(10.1d, 14.2d, 82.2d, 100.7d);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        jts.Envelope envelope4 = new jts.Envelope(6.0d, 96.89999999999999d, 90.49999999999999d, 115.1d);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        jts.Envelope envelope4 = new jts.Envelope(8.7d, 92.7d, 15.0d, 7.1d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        boolean boolean8 = envelope4.isEnvelopeNull();
        boolean boolean9 = envelope4.isEnvelopeNull();
        double double10 = envelope4.maxExtent();
        boolean boolean11 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 84.0d + "'", double6 == 84.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 84.0d + "'", double7 == 84.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 84.0d + "'", double10 == 84.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        jts.Envelope envelope4 = new jts.Envelope(68.7d, 38.4d, 94.3d, 41.0d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 53.3d + "'", double5 == 53.3d);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) -1, 85.0d, 38.4d, (double) 7);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 86.0d + "'", double5 == 86.0d);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        jts.Envelope envelope4 = new jts.Envelope(100.0d, (double) (short) -1, 0.0d, 0.0d);
        envelope4.init((double) 0, (double) 5, (-9.3d), (double) ' ');
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        envelope4.init(62.900000000000006d, (-10.5d), 24.600000000000005d, 84.3d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.0d + "'", double10 == 5.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 41.3d + "'", double11 == 41.3d);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
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
        double double30 = envelope4.getHeight();
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
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 6.0d + "'", double30 == 6.0d);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        jts.Envelope envelope4 = new jts.Envelope(4.8d, (double) (short) 0, 7.1d, 0.0d);
        envelope4.init(99.0d, 89.5d, 4.0d, 2.9000000000000004d);
        envelope4.init(0.0d, 89.2d, 9.5d, 7.300000000000001d);
        boolean boolean15 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        jts.Envelope envelope4 = new jts.Envelope((-7.3d), 99.4d, 103.3d, 0.0d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 106.7d + "'", double5 == 106.7d);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        jts.Envelope envelope4 = new jts.Envelope((double) (-8), 17.5d, 5.9d, 52.0d);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        double double16 = envelope4.getWidth();
        double double17 = envelope4.maxExtent();
        envelope4.init((double) '#', 87.0d, (double) (byte) 1, (double) 0.0f);
        boolean boolean23 = envelope4.isEnvelopeNull();
        double double24 = envelope4.getHeight();
        boolean boolean25 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        jts.Envelope envelope4 = new jts.Envelope(146.0d, 92.8d, 56.7d, 12.3d);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
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
        double double18 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 104.0d + "'", double12 == 104.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 104.0d + "'", double14 == 104.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 106.0d + "'", double15 == 106.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 106.0d + "'", double16 == 106.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 106.0d + "'", double17 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 106.0d + "'", double18 == 106.0d);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        jts.Envelope envelope4 = new jts.Envelope(62.699999999999996d, 107.3d, 7.1d, 130.2d);
        envelope4.init(0.0d, (double) (byte) -1, 56.5d, 23.5d);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        jts.Envelope envelope4 = new jts.Envelope((double) '4', (double) (-6L), (double) (-6), (double) 100L);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init(101.0d, 5.8999999999999995d, 26.700000000000003d, 17.1d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 106.0d + "'", double5 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        jts.Envelope envelope4 = new jts.Envelope((double) (-8L), 105.0d, 106.0d, 87.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 19.0d + "'", double5 == 19.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 113.0d + "'", double6 == 113.0d);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        jts.Envelope envelope4 = new jts.Envelope(37.20000000000001d, 104.0d, 58.3d, 7.6d);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        jts.Envelope envelope4 = new jts.Envelope(89.5d, 182.7d, 11.0d, 12.7d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getHeight();
        envelope4.init((double) ' ', (-2.1d), 109.0d, (double) 6);
        envelope4.init((double) 10L, (double) 6L, (double) 0L, (-2.1d));
        double double16 = envelope4.getWidth();
        double double17 = envelope4.maxExtent();
        envelope4.init(12.6d, 14.0d, 6.1d, 92.0d);
        java.lang.Class<?> wildcardClass23 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.0d + "'", double17 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.getHeight();
        envelope4.init((double) 10.0f, (-4.6d), (double) (byte) 1, (double) 5);
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        boolean boolean13 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 14.6d + "'", double11 == 14.6d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        jts.Envelope envelope4 = new jts.Envelope(20.0d, (double) (byte) -1, 0.0d, 102.7d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        jts.Envelope envelope4 = new jts.Envelope((double) 10L, 18.0d, (double) (-8), 13.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init(0.0d, 51.0d, 110.0d, (double) 9);
        double double11 = envelope4.getHeight();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 21.0d + "'", double5 == 21.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 101.0d + "'", double11 == 101.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 101.0d + "'", double13 == 101.0d);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
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
        envelope4.init(4.000000000000005d, 29.2d, (-10.5d), 83.3d);
        envelope4.init(56.7d, 44.5d, 84.60000000000001d, (double) 10);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 6.9d + "'", double21 == 6.9d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 6.9d + "'", double22 == 6.9d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 108.4d + "'", double33 == 108.4d);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        jts.Envelope envelope4 = new jts.Envelope((double) 8, 104.6d, 1.0d, (double) 3);
        envelope4.init(190.3d, 105.4d, 5.800000000000001d, (double) 2L);
        envelope4.init((double) (-10L), 3.9000000000000004d, 0.0d, 196.1d);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        jts.Envelope envelope4 = new jts.Envelope((double) 100, 110.0d, 73.0d, (double) 0L);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getHeight();
        boolean boolean7 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 73.0d + "'", double5 == 73.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 73.0d + "'", double6 == 73.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        jts.Envelope envelope4 = new jts.Envelope((double) 0, 0.0d, 5.8d, (double) '#');
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 29.2d + "'", double5 == 29.2d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 29.2d + "'", double7 == 29.2d);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        jts.Envelope envelope4 = new jts.Envelope(7.1d, 16.200000000000003d, (double) (-1.0f), (double) (-3));
        envelope4.init(86.2d, 0.0d, 22.0d, 22.0d);
        double double10 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass11 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 86.2d + "'", double10 == 86.2d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 13.4d, 103.69999999999999d, 109.1d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 13.4d + "'", double5 == 13.4d);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        double double13 = envelope4.getHeight();
        boolean boolean14 = envelope4.isEnvelopeNull();
        envelope4.init((double) (byte) -1, (double) 100, 2.0d, (double) (-8));
        double double20 = envelope4.getHeight();
        boolean boolean21 = envelope4.isEnvelopeNull();
        double double22 = envelope4.getHeight();
        double double23 = envelope4.getWidth();
        double double24 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 101.0d + "'", double23 == 101.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        jts.Envelope envelope4 = new jts.Envelope((-1.2d), 191.3d, 77.7d, 111.3d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 33.599999999999994d + "'", double5 == 33.599999999999994d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 192.5d + "'", double6 == 192.5d);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
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
        boolean boolean29 = envelope4.isEnvelopeNull();
        boolean boolean30 = envelope4.isEnvelopeNull();
        double double31 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 6.9d + "'", double20 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.0d + "'", double22 == 2.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 6.9d + "'", double23 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 95.2d + "'", double31 == 95.2d);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        jts.Envelope envelope4 = new jts.Envelope(1.3999999999999986d, 92.0d, 111.9d, 22.3d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 90.6d + "'", double5 == 90.6d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 90.6d + "'", double6 == 90.6d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.6d + "'", double7 == 90.6d);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (short) 0, (-9.3d), (double) (-1L));
        envelope4.init((-2.1d), (double) (-6), (double) (-6L), 2.9000000000000004d);
        envelope4.init(10.4d, 104.1d, 105.0d, 8.600000000000001d);
        envelope4.init(39.3d, 110.0d, (double) 2, (double) 6L);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        jts.Envelope envelope4 = new jts.Envelope((-2.1d), (double) 1.0f, 18.5d, 7.900000000000006d);
        envelope4.init(56.1d, 116.7d, 12.3d, (-100.0d));
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        jts.Envelope envelope4 = new jts.Envelope((double) 7, (double) 10.0f, (double) 4L, (double) 0L);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getWidth();
        boolean boolean10 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.0d + "'", double6 == 3.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3.0d + "'", double7 == 3.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.0d + "'", double9 == 3.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        jts.Envelope envelope4 = new jts.Envelope((double) '#', (double) (short) 100, (double) (short) -1, (double) 1L);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.0d + "'", double7 == 2.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 65.0d + "'", double8 == 65.0d);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        jts.Envelope envelope4 = new jts.Envelope(4.300000000000009d, 83.3d, 0.40000000000000036d, 44.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        jts.Envelope envelope4 = new jts.Envelope(8.600000000000001d, (-4.6d), 5.1d, 105.4d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.30000000000001d + "'", double5 == 100.30000000000001d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.30000000000001d + "'", double6 == 100.30000000000001d);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        jts.Envelope envelope4 = new jts.Envelope(109.7d, 93.1d, 198.1d, 10.0d);
        envelope4.init((double) 9L, 66.0d, 1.9000000000000004d, (double) 100);
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass12 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 98.1d + "'", double10 == 98.1d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 98.1d + "'", double11 == 98.1d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        boolean boolean16 = envelope4.isEnvelopeNull();
        double double17 = envelope4.getHeight();
        double double18 = envelope4.maxExtent();
        envelope4.init(10.4d, 132.0d, 1.2d, 22.3d);
        double double24 = envelope4.getHeight();
        double double25 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.0d + "'", double18 == 8.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 21.1d + "'", double24 == 21.1d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 21.1d + "'", double25 == 21.1d);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getHeight();
        envelope4.init(12.0d, (double) 10, 19.700000000000003d, 15.4d);
        double double18 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 104.0d + "'", double12 == 104.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 2.0d + "'", double18 == 2.0d);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        jts.Envelope envelope4 = new jts.Envelope((double) '4', (double) (-6L), (double) (-6), (double) 100L);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getHeight();
        boolean boolean8 = envelope4.isEnvelopeNull();
        envelope4.init(11.3d, 31.0d, 9.0d, 86.5d);
        double double14 = envelope4.getHeight();
        double double15 = envelope4.getHeight();
        envelope4.init(65.1d, 90.6d, 11.8d, 105.7d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 106.0d + "'", double5 == 106.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 106.0d + "'", double6 == 106.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 106.0d + "'", double7 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 77.5d + "'", double14 == 77.5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 77.5d + "'", double15 == 77.5d);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        jts.Envelope envelope4 = new jts.Envelope(92.7d, (double) (-10L), 1.2d, (double) (-8L));
        double double5 = envelope4.getWidth();
        envelope4.init((double) 100, 1.2999999999999998d, 58.7d, 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.7d + "'", double5 == 102.7d);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        jts.Envelope envelope4 = new jts.Envelope(102.0d, (double) 1.0f, 25.1d, (-100.0d));
        envelope4.init((double) 3L, (double) (-5), (double) (-8), (double) (-1L));
        boolean boolean10 = envelope4.isEnvelopeNull();
        envelope4.init(88.8d, 29.9d, 0.40000000000000036d, 194.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) 0, (-2.1d), (double) (-8L), (double) (-4));
        envelope4.init((double) 100.0f, 9.0d, (-2.1d), (double) 100L);
        envelope4.init((double) (-1L), 5.3d, 2.7d, 2.3d);
        double double15 = envelope4.maxExtent();
        double double16 = envelope4.getHeight();
        double double17 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 6.3d + "'", double15 == 6.3d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.40000000000000036d + "'", double16 == 0.40000000000000036d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 6.3d + "'", double17 == 6.3d);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) 100, (double) (-100), 94.0d, (double) 9L);
        envelope4.init(90.0d, (double) 5L, (double) (-1), (double) 4);
        double double10 = envelope4.getHeight();
        boolean boolean11 = envelope4.isEnvelopeNull();
        double double12 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.0d + "'", double10 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 5.0d + "'", double12 == 5.0d);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) 0, (-2.1d), (double) (-8L), (double) (-4));
        double double5 = envelope4.maxExtent();
        envelope4.init((double) 100L, (double) (byte) -1, (double) ' ', (double) (byte) 0);
        boolean boolean11 = envelope4.isEnvelopeNull();
        envelope4.init(0.0d, 20.799999999999997d, 13.5d, (double) (-7));
        double double17 = envelope4.getHeight();
        double double18 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass19 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.5d + "'", double17 == 20.5d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.5d + "'", double18 == 20.5d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        jts.Envelope envelope4 = new jts.Envelope((double) (-4L), 76.0d, (double) (-2L), (double) (-8));
        double double5 = envelope4.getWidth();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 80.0d + "'", double5 == 80.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 80.0d + "'", double6 == 80.0d);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        jts.Envelope envelope4 = new jts.Envelope(42.0d, (double) (short) 1, (double) 9, (double) (-100L));
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        envelope4.init((double) 100, 1.7999999999999998d, 21.1d, 61.39999999999999d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 109.0d + "'", double5 == 109.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 109.0d + "'", double6 == 109.0d);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.getWidth();
        double double9 = envelope4.maxExtent();
        envelope4.init(193.6d, 8.299999999999999d, 3.4000000000000004d, 94.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getWidth();
        envelope4.init(39.3d, 85.5d, 24.5d, (-6.9d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        jts.Envelope envelope4 = new jts.Envelope((double) 0.0f, 0.0d, 83.5d, 11.9d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        jts.Envelope envelope4 = new jts.Envelope((-8.7d), (double) (-8L), (double) (-6L), (double) 2);
        double double5 = envelope4.maxExtent();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        boolean boolean11 = envelope4.isEnvelopeNull();
        envelope4.init(2.0999999999999996d, 0.0d, (-1.2d), 11.3d);
        double double17 = envelope4.getHeight();
        double double18 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 12.5d + "'", double17 == 12.5d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 12.5d + "'", double18 == 12.5d);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        jts.Envelope envelope4 = new jts.Envelope(28.900000000000013d, 17.6d, 86.1d, 14.899999999999991d);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getWidth();
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.getWidth();
        double double12 = envelope4.maxExtent();
        envelope4.init(60.099999999999994d, (double) (byte) 100, 34.4d, 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.0d + "'", double12 == 8.0d);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
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
        double double18 = envelope4.maxExtent();
        envelope4.init(4.100000000000001d, 90.6d, 110.39999999999999d, 26.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        jts.Envelope envelope4 = new jts.Envelope(24.2d, 3.0999999999999943d, 6.299999999999997d, 0.0d);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        jts.Envelope envelope4 = new jts.Envelope(9.0d, (double) 0, 92.7d, (double) 100);
        envelope4.init(21.0d, 97.0d, 31.0d, 10.4d);
        envelope4.init(101.0d, 0.0d, (double) (-9L), 1.2000000000000002d);
        envelope4.init((double) 10, 94.1d, (double) 10, 80.7d);
        double double20 = envelope4.maxExtent();
        double double21 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass22 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 84.1d + "'", double20 == 84.1d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 84.1d + "'", double21 == 84.1d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 3.1d, 5.0d, 2.7d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init(30.0d, 10.5d, (double) (-1), 91.3d);
        boolean boolean13 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3d + "'", double5 == 2.3d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 6.9d + "'", double6 == 6.9d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 6.9d + "'", double7 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        envelope4.init(95.2d, 198.5d, (double) (-100L), 0.0d);
        envelope4.init(8.799999999999999d, 102.60000000000001d, 83.7d, 90.3d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        boolean boolean16 = envelope4.isEnvelopeNull();
        double double17 = envelope4.getWidth();
        double double18 = envelope4.maxExtent();
        double double19 = envelope4.maxExtent();
        double double20 = envelope4.getHeight();
        double double21 = envelope4.getHeight();
        double double22 = envelope4.maxExtent();
        boolean boolean23 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.0d + "'", double18 == 8.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 8.0d + "'", double19 == 8.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 8.0d + "'", double20 == 8.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 8.0d + "'", double21 == 8.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 8.0d + "'", double22 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        jts.Envelope envelope4 = new jts.Envelope(100.0d, 10.5d, (double) 2, (-100.0d));
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.maxExtent();
        double double9 = envelope4.getWidth();
        boolean boolean10 = envelope4.isEnvelopeNull();
        envelope4.init((-5.4d), 4.799999999999997d, 0.0d, (double) (-2));
        boolean boolean16 = envelope4.isEnvelopeNull();
        boolean boolean17 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.0d + "'", double5 == 102.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 102.0d + "'", double6 == 102.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 102.0d + "'", double7 == 102.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 102.0d + "'", double8 == 102.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 89.5d + "'", double9 == 89.5d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        jts.Envelope envelope4 = new jts.Envelope(109.7d, 93.1d, 198.1d, 10.0d);
        envelope4.init((double) 9L, 66.0d, 1.9000000000000004d, (double) 100);
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getHeight();
        envelope4.init((double) 1L, 111.0d, 0.2999999999999998d, 56.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 98.1d + "'", double10 == 98.1d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 98.1d + "'", double11 == 98.1d);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        envelope4.init((double) (-8), (double) (-9), (double) (-100), (double) 2L);
        double double16 = envelope4.getHeight();
        double double17 = envelope4.getHeight();
        envelope4.init(20.0d, 0.0d, (double) (short) 100, 96.9d);
        envelope4.init(108.7d, 14.3d, 1.1999999999999886d, (double) 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 102.0d + "'", double16 == 102.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 102.0d + "'", double17 == 102.0d);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        jts.Envelope envelope4 = new jts.Envelope((double) (-8L), 10.0d, (double) (-6L), (double) 8);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getHeight();
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getWidth();
        envelope4.init(26.0d, 74.69999999999999d, (-1.0d), 92.9d);
        boolean boolean17 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.0d + "'", double7 == 18.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 14.0d + "'", double8 == 14.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 14.0d + "'", double9 == 14.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 18.0d + "'", double10 == 18.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 18.0d + "'", double11 == 18.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        envelope4.init(6.9d, (double) (byte) 0, (double) (byte) 1, (double) (-1.0f));
        double double18 = envelope4.getHeight();
        boolean boolean19 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 2.0d + "'", double18 == 2.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        jts.Envelope envelope4 = new jts.Envelope(1.2d, (double) 10L, 0.0d, (double) 4);
        envelope4.init(21.0d, (double) 9L, 14.0d, 0.0d);
        boolean boolean10 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        jts.Envelope envelope4 = new jts.Envelope(9.6d, 89.5d, 106.0d, (double) 3);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init(56.7d, 17.700000000000003d, 1.0d, 76.69999999999999d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 92.0d, 13.899999999999991d, 103.9d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 92.0d + "'", double5 == 92.0d);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        jts.Envelope envelope4 = new jts.Envelope((double) 10L, 18.0d, (double) (-8), 13.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 21.0d + "'", double5 == 21.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 21.0d + "'", double7 == 21.0d);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        jts.Envelope envelope4 = new jts.Envelope(111.9d, 60.0d, 104.6d, 106.9d);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        jts.Envelope envelope4 = new jts.Envelope(31.0d, (double) (byte) 100, 2.9000000000000004d, 5.0d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.getWidth();
        envelope4.init(9.6d, (double) ' ', 92.0d, 86.5d);
        envelope4.init(6.0d, 110.3d, 16.0d, 62.0d);
        double double19 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 69.0d + "'", double5 == 69.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 69.0d + "'", double6 == 69.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 69.0d + "'", double7 == 69.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 69.0d + "'", double8 == 69.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 46.0d + "'", double19 == 46.0d);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        jts.Envelope envelope4 = new jts.Envelope(5.0d, 2.1d, 92.9d, 104.0d);
        envelope4.init(0.9000000000000004d, 36.0d, 87.0d, 92.0d);
        double double10 = envelope4.getWidth();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.1d + "'", double10 == 35.1d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5.0d + "'", double11 == 5.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 5.0d + "'", double12 == 5.0d);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        jts.Envelope envelope4 = new jts.Envelope(83.6d, 78.8d, 7.6d, 24.2d);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getHeight();
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.maxExtent();
        envelope4.init((-1.2d), (double) (-6), 20.5d, 2.0d);
        double double18 = envelope4.getWidth();
        boolean boolean19 = envelope4.isEnvelopeNull();
        boolean boolean20 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.4d + "'", double9 == 8.4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.0d + "'", double10 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.4d + "'", double11 == 8.4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.4d + "'", double12 == 8.4d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.8d + "'", double18 == 4.8d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        jts.Envelope envelope4 = new jts.Envelope(9.2d, 76.0d, 102.0d, (double) (-1));
        boolean boolean5 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getHeight();
        double double10 = envelope4.maxExtent();
        envelope4.init(111.0d, 39.400000000000006d, 41.2d, 5.4d);
        java.lang.Class<?> wildcardClass16 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.4d + "'", double9 == 8.4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.4d + "'", double10 == 8.4d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        double double13 = envelope4.getHeight();
        double double14 = envelope4.getHeight();
        envelope4.init(26.0d, 85.3d, (double) (short) 1, 105.4d);
        double double20 = envelope4.getWidth();
        boolean boolean21 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 59.3d + "'", double20 == 59.3d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        jts.Envelope envelope4 = new jts.Envelope((double) 100, 0.5999999999999996d, 103.7d, 110.39999999999999d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 99.4d + "'", double5 == 99.4d);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
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
        envelope4.init(11.1d, 7.6d, 92.9d, 8.4d);
        double double33 = envelope4.getWidth();
        boolean boolean34 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 109.0d + "'", double15 == 109.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5.0d + "'", double16 == 5.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.6000000000000005d + "'", double22 == 0.6000000000000005d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 3.5d + "'", double33 == 3.5d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), (double) 4, (double) (-3L), (double) '4');
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getWidth();
        boolean boolean7 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.0d + "'", double5 == 5.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.0d + "'", double6 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        jts.Envelope envelope4 = new jts.Envelope((double) 100, 100.0d, (double) 0.0f, (double) 0L);
        envelope4.init(1.7000000000000002d, (double) (-5), 65.0d, (double) (-8));
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getWidth();
        double double13 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 73.0d + "'", double11 == 73.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.7d + "'", double12 == 6.7d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 73.0d + "'", double13 == 73.0d);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        jts.Envelope envelope4 = new jts.Envelope(8.8d, 100.60000000000001d, (double) 1L, (double) (short) 10);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        jts.Envelope envelope4 = new jts.Envelope((double) (-5), (double) 8L, 0.0d, (-7.3d));
        double double5 = envelope4.getHeight();
        envelope4.init(91.0d, 1.3999999999999968d, 100.8d, 2.0d);
        double double11 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.3d + "'", double5 == 7.3d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 98.8d + "'", double11 == 98.8d);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        jts.Envelope envelope4 = new jts.Envelope((double) '4', (double) (-6L), (double) (-6), (double) 100L);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getHeight();
        boolean boolean8 = envelope4.isEnvelopeNull();
        envelope4.init(11.3d, 31.0d, 9.0d, 86.5d);
        double double14 = envelope4.getHeight();
        double double15 = envelope4.maxExtent();
        boolean boolean16 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 106.0d + "'", double5 == 106.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 106.0d + "'", double6 == 106.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 106.0d + "'", double7 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 77.5d + "'", double14 == 77.5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 77.5d + "'", double15 == 77.5d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        jts.Envelope envelope4 = new jts.Envelope((double) 7, (double) 10.0f, (double) 4L, (double) 0L);
        envelope4.init((double) 10.0f, (double) 4, (double) 9, 3.1d);
        envelope4.init((double) 7L, (double) 5L, (double) 2, (double) 9L);
        boolean boolean15 = envelope4.isEnvelopeNull();
        envelope4.init(11.0d, 11.3d, (-9.3d), 90.2d);
        double double21 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 99.5d + "'", double21 == 99.5d);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        jts.Envelope envelope4 = new jts.Envelope(10.200000000000003d, (double) (-7), 6.200000000000003d, (double) 4);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        jts.Envelope envelope4 = new jts.Envelope(10.4d, (double) 0.0f, 0.9000000000000004d, 2.3d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getHeight();
        envelope4.init(102.0d, 0.0d, (double) 0, (double) ' ');
        double double15 = envelope4.maxExtent();
        envelope4.init((-1.2d), (double) (-4), 7.1d, 14.0d);
        double double21 = envelope4.getHeight();
        double double22 = envelope4.getWidth();
        double double23 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 102.0d + "'", double15 == 102.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 6.9d + "'", double21 == 6.9d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.8d + "'", double22 == 2.8d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2.8d + "'", double23 == 2.8d);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.getHeight();
        boolean boolean9 = envelope4.isEnvelopeNull();
        double double10 = envelope4.getHeight();
        double double11 = envelope4.getWidth();
        double double12 = envelope4.getHeight();
        boolean boolean13 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.4d + "'", double10 == 8.4d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.0d + "'", double11 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.4d + "'", double12 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        jts.Envelope envelope4 = new jts.Envelope(5.0d, 5.3d, (double) (-100L), (double) (-2L));
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        envelope4.init(15.700000000000001d, 1.3000000000000007d, 53.2d, 102.3d);
        java.lang.Class<?> wildcardClass13 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 98.0d + "'", double5 == 98.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2999999999999998d + "'", double6 == 0.2999999999999998d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 98.0d + "'", double7 == 98.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        jts.Envelope envelope4 = new jts.Envelope((double) '#', (double) (short) 100, (double) (short) -1, (double) 1L);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 65.0d + "'", double5 == 65.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 65.0d + "'", double6 == 65.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 65.0d + "'", double7 == 65.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.0d + "'", double8 == 2.0d);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        jts.Envelope envelope4 = new jts.Envelope(91.0d, 55.3d, 5.0d, 34.7d);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
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
        boolean boolean29 = envelope4.isEnvelopeNull();
        double double30 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 6.9d + "'", double20 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.0d + "'", double22 == 2.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 6.9d + "'", double23 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 7.900000000000003d + "'", double30 == 7.900000000000003d);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        envelope4.init((double) (byte) 1, (double) (-4L), (double) 100L, 4.8d);
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        envelope4.init((double) 4, 9.6d, (double) 3L, (double) 100L);
        double double18 = envelope4.maxExtent();
        double double19 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 95.2d + "'", double10 == 95.2d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 95.2d + "'", double11 == 95.2d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 5.6d + "'", double19 == 5.6d);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        jts.Envelope envelope4 = new jts.Envelope(58.0d, 0.7000000000000028d, 26.0d, 6.300000000000001d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 57.3d + "'", double5 == 57.3d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 19.7d + "'", double6 == 19.7d);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        envelope4.init(7.1d, (double) (byte) 10, (-5.4d), 5.0d);
        double double12 = envelope4.getWidth();
        envelope4.init((double) (-8), 1.3999999999999986d, 12.7d, 96.0d);
        double double18 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.9000000000000004d + "'", double12 == 2.9000000000000004d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 9.399999999999999d + "'", double18 == 9.399999999999999d);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
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
        double double23 = envelope4.getWidth();
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
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        jts.Envelope envelope4 = new jts.Envelope(1.2d, 29.299999999999997d, 0.0d, (double) (short) 10);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 28.099999999999998d + "'", double5 == 28.099999999999998d);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        jts.Envelope envelope4 = new jts.Envelope((double) 'a', (double) (byte) 1, 2.3d, (double) 0L);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        envelope4.init(14.0d, (double) 100L, 0.0d, 8.4d);
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3d + "'", double5 == 2.3d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 96.0d + "'", double6 == 96.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.4d + "'", double12 == 8.4d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 86.0d + "'", double13 == 86.0d);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        jts.Envelope envelope4 = new jts.Envelope((double) 100, 110.0d, 73.0d, (double) 0L);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 73.0d + "'", double5 == 73.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 73.0d + "'", double6 == 73.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 73.0d + "'", double7 == 73.0d);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        jts.Envelope envelope4 = new jts.Envelope(26.0d, (-7.3d), (double) 100.0f, 90.0d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 33.3d + "'", double5 == 33.3d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        jts.Envelope envelope4 = new jts.Envelope(111.0d, 14.6d, (double) (-7L), 14.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 96.4d + "'", double6 == 96.4d);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) (-1L), (double) (-1.0f), (double) 0L, 100.0d);
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.getWidth();
        double double14 = envelope4.getWidth();
        double double15 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        jts.Envelope envelope4 = new jts.Envelope((double) (-7), (double) 4L, (-7.3d), (-100.0d));
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.getHeight();
        boolean boolean8 = envelope4.isEnvelopeNull();
        envelope4.init(70.2d, 1.3000000000000025d, 2.7d, (double) 9);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 11.0d + "'", double5 == 11.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 92.7d + "'", double6 == 92.7d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 92.7d + "'", double7 == 92.7d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
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
        java.lang.Class<?> wildcardClass14 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        jts.Envelope envelope4 = new jts.Envelope(4.8d, 37.0d, 101.8d, 7.899999999999999d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 93.9d + "'", double5 == 93.9d);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        jts.Envelope envelope4 = new jts.Envelope((double) 1.0f, 95.7d, 100.0d, (-8.7d));
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 108.7d + "'", double5 == 108.7d);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        jts.Envelope envelope4 = new jts.Envelope(4.0d, 10.0d, 52.0d, 182.7d);
        envelope4.init(8.100000000000009d, 12.899999999999991d, 116.10000000000001d, 11.9d);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        jts.Envelope envelope4 = new jts.Envelope(1.5999999999999996d, (double) 100L, 51.0d, (double) 0.0f);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 98.4d + "'", double6 == 98.4d);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        jts.Envelope envelope4 = new jts.Envelope((double) 8, 13.0d, 22.3d, (double) 10L);
        envelope4.init((double) (-100L), 90.3d, 31.0d, (double) 3L);
        double double10 = envelope4.getWidth();
        double double11 = envelope4.getWidth();
        double double12 = envelope4.getWidth();
        double double13 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 190.3d + "'", double10 == 190.3d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 190.3d + "'", double11 == 190.3d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 190.3d + "'", double12 == 190.3d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 28.0d + "'", double13 == 28.0d);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        jts.Envelope envelope4 = new jts.Envelope(116.7d, 100.2d, 20.5d, 1.1999999999999886d);
        envelope4.init(8.800000000000011d, 3.3d, 88.7d, 0.9000000000000004d);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        jts.Envelope envelope4 = new jts.Envelope(3.9000000000000004d, 55.0d, 0.0d, 13.6d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        envelope4.init((-5.4d), (-8.7d), (double) 5L, (double) 7);
        envelope4.init((double) (-1L), 0.0d, (double) (-6L), 14.0d);
        boolean boolean17 = envelope4.isEnvelopeNull();
        double double18 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass19 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getHeight();
        double double14 = envelope4.getHeight();
        boolean boolean15 = envelope4.isEnvelopeNull();
        envelope4.init(2.7d, 4.0d, 1.7000000000000004d, 76.0d);
        double double21 = envelope4.getWidth();
        double double22 = envelope4.getHeight();
        double double23 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass24 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 104.0d + "'", double12 == 104.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 104.0d + "'", double14 == 104.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.2999999999999998d + "'", double21 == 1.2999999999999998d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 74.3d + "'", double22 == 74.3d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 74.3d + "'", double23 == 74.3d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        envelope4.init(6.9d, (double) (byte) 0, (double) (byte) 1, (double) (-1.0f));
        double double18 = envelope4.getWidth();
        boolean boolean19 = envelope4.isEnvelopeNull();
        double double20 = envelope4.getWidth();
        envelope4.init((double) (-3L), 9.0d, 6.1d, (double) 10.0f);
        double double26 = envelope4.getWidth();
        double double27 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 6.9d + "'", double20 == 6.9d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 12.0d + "'", double26 == 12.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 12.0d + "'", double27 == 12.0d);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, (-5.4d), 0.0d, 65.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.4d + "'", double6 == 15.4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 65.0d + "'", double7 == 65.0d);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        jts.Envelope envelope4 = new jts.Envelope(31.0d, (double) (byte) 100, 2.9000000000000004d, 5.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass8 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0999999999999996d + "'", double5 == 2.0999999999999996d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 69.0d + "'", double7 == 69.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        jts.Envelope envelope4 = new jts.Envelope(93.1d, 97.19999999999999d, 110.1d, (double) 100.0f);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        jts.Envelope envelope4 = new jts.Envelope((double) 0, (double) 100, (double) (short) 10, 11.1d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        jts.Envelope envelope4 = new jts.Envelope((double) '#', (double) (short) 100, (double) (short) -1, (double) 1L);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init(107.0d, 34.7d, (double) 6, 56.7d);
        double double13 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 65.0d + "'", double5 == 65.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 65.0d + "'", double6 == 65.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 65.0d + "'", double7 == 65.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.7d + "'", double13 == 50.7d);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        jts.Envelope envelope4 = new jts.Envelope((double) 2L, 15.0d, 199.0d, 101.8d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 13.0d + "'", double5 == 13.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.2d + "'", double6 == 97.2d);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        jts.Envelope envelope4 = new jts.Envelope(4.8d, (double) (short) 0, 7.1d, 0.0d);
        envelope4.init(99.0d, 89.5d, 4.0d, 2.9000000000000004d);
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0999999999999996d + "'", double11 == 1.0999999999999996d);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        jts.Envelope envelope4 = new jts.Envelope(1.7000000000000004d, 97.80000000000001d, 16.0d, 87.3d);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        boolean boolean7 = envelope4.isEnvelopeNull();
        double double8 = envelope4.maxExtent();
        double double9 = envelope4.getHeight();
        double double10 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass11 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.0d + "'", double10 == 8.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), (double) 4L, (double) (-1), (double) (byte) 1);
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init(15.3d, 3.0d, 33.3d, 7.900000000000003d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        jts.Envelope envelope4 = new jts.Envelope((double) (-7), (double) 4L, (-7.3d), (-100.0d));
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init((double) (-4L), 2.9000000000000004d, (double) 10.0f, (double) (-2L));
        double double11 = envelope4.getWidth();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 6.9d + "'", double11 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 6.9d + "'", double13 == 6.9d);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        jts.Envelope envelope4 = new jts.Envelope(90.8d, 0.0d, 11.299999999999983d, (double) 0L);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 11.299999999999983d + "'", double5 == 11.299999999999983d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.8d + "'", double7 == 90.8d);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1.0f), (double) 7L, 11.9d, (double) (-100));
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 111.9d + "'", double5 == 111.9d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        jts.Envelope envelope4 = new jts.Envelope(3.4000000000000004d, (double) (-6L), 100.7d, 86.0d);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        jts.Envelope envelope4 = new jts.Envelope(11.799999999999997d, 109.7d, 111.9d, 23.4d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getWidth();
        envelope4.init(0.0d, (double) 10, (double) 0L, (double) 0.0f);
        double double15 = envelope4.getHeight();
        double double16 = envelope4.getWidth();
        double double17 = envelope4.getWidth();
        double double18 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        jts.Envelope envelope4 = new jts.Envelope((-7.3d), 99.4d, 103.3d, 0.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        jts.Envelope envelope4 = new jts.Envelope(13.5d, 94.60000000000001d, 110.9d, 15.6d);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        jts.Envelope envelope4 = new jts.Envelope(8.7d, 92.7d, 15.0d, 7.1d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass7 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 84.0d + "'", double6 == 84.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
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
        envelope4.init((double) 100L, (-4.6d), 70.1d, (double) (-5));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 107.3d + "'", double21 == 107.3d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 6.199999999999989d + "'", double27 == 6.199999999999989d);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        jts.Envelope envelope4 = new jts.Envelope((double) '4', 54.9d, (double) (-2), 13.899999999999991d);
        envelope4.init(11.600000000000001d, 94.1d, 39.3d, 51.0d);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) 1, 11.0d, (double) (-1), (double) 0.0f);
        double double5 = envelope4.maxExtent();
        envelope4.init(107.5d, 4.3d, 28.900000000000013d, 77.89999999999999d);
        double double11 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 48.99999999999998d + "'", double11 == 48.99999999999998d);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        jts.Envelope envelope4 = new jts.Envelope((double) 2, (double) 9L, 4.8d, (double) (-1));
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass8 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.8d + "'", double5 == 5.8d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 7.0d + "'", double7 == 7.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        jts.Envelope envelope4 = new jts.Envelope(73.0d, 110.5d, 87.0d, 94.3d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.299999999999997d + "'", double5 == 7.299999999999997d);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        jts.Envelope envelope4 = new jts.Envelope(44.60000000000001d, (double) 100, 97.80000000000001d, 44.3d);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        jts.Envelope envelope4 = new jts.Envelope(86.6d, 1.7999999999999998d, 101.0d, (double) 100L);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        envelope4.init(95.2d, 198.5d, (double) (-100L), 0.0d);
        double double18 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 103.3d + "'", double18 == 103.3d);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        jts.Envelope envelope4 = new jts.Envelope(10.8d, (double) (byte) 0, 80.4d, 52.599999999999994d);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
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
        double double27 = envelope4.maxExtent();
        double double28 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 87.0d + "'", double23 == 87.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 3.3d + "'", double25 == 3.3d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 87.0d + "'", double26 == 87.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 87.0d + "'", double27 == 87.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 87.0d + "'", double28 == 87.0d);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        jts.Envelope envelope4 = new jts.Envelope(89.7d, 1.7000000000000004d, 30.0d, 2.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 10, 0.0d, 103.0d, (double) (byte) 1);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getHeight();
        double double14 = envelope4.getHeight();
        double double15 = envelope4.getWidth();
        double double16 = envelope4.getHeight();
        double double17 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 104.0d + "'", double12 == 104.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 104.0d + "'", double14 == 104.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 106.0d + "'", double15 == 106.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 104.0d + "'", double16 == 104.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 104.0d + "'", double17 == 104.0d);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        jts.Envelope envelope4 = new jts.Envelope(102.1d, 0.0d, 95.2d, 1.7000000000000002d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), 86.9d, 24.2d, 0.6000000000000014d);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        jts.Envelope envelope4 = new jts.Envelope((double) (-7), (double) (-3L), 95.2d, (double) 9L);
        envelope4.init(19.6d, 91.0d, 84.0d, 6.1d);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init((double) 100, (-100.0d), (double) '#', 5.0d);
        envelope4.init((double) 5, (double) (short) 10, 96.0d, (double) (byte) 10);
        envelope4.init(100.0d, (-100.0d), (double) (byte) 100, (double) 1L);
        envelope4.init((double) 3, 4.8d, 100.0d, 0.0d);
        boolean boolean31 = envelope4.isEnvelopeNull();
        envelope4.init(102.0d, (-2.1d), (double) (short) 100, 69.0d);
        double double37 = envelope4.getHeight();
        double double38 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 31.0d + "'", double37 == 31.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 104.1d + "'", double38 == 104.1d);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.getHeight();
        envelope4.init((double) 10.0f, (-4.6d), (double) (byte) 1, (double) 5);
        envelope4.init(109.0d, (double) (-1), 76.0d, 102.0d);
        double double16 = envelope4.getWidth();
        double double17 = envelope4.getWidth();
        double double18 = envelope4.maxExtent();
        boolean boolean19 = envelope4.isEnvelopeNull();
        boolean boolean20 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 110.0d + "'", double16 == 110.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 110.0d + "'", double17 == 110.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 110.0d + "'", double18 == 110.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        jts.Envelope envelope4 = new jts.Envelope((double) 'a', (double) (byte) 1, 2.3d, (double) 0L);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass7 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3d + "'", double5 == 2.3d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
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
        envelope4.init((double) (-6), 13.9d, 0.6000000000000005d, 14.6d);
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
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        jts.Envelope envelope4 = new jts.Envelope(91.2d, 2.700000000000003d, 17.700000000000003d, 97.4d);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        jts.Envelope envelope4 = new jts.Envelope(93.7d, 0.0d, 1.6999999999999993d, 82.4d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 80.7d + "'", double5 == 80.7d);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        jts.Envelope envelope4 = new jts.Envelope(8.8d, 192.5d, 83.89999999999999d, 94.60000000000001d);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        jts.Envelope envelope4 = new jts.Envelope(47.0d, 73.0d, 14.4d, 0.5999999999999996d);
        double double5 = envelope4.maxExtent();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 26.0d + "'", double5 == 26.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        jts.Envelope envelope4 = new jts.Envelope((double) 'a', 13.4d, 80.1d, 19.6d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 83.6d + "'", double5 == 83.6d);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass13 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 104.0d + "'", double12 == 104.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
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
        double double29 = envelope4.maxExtent();
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
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        jts.Envelope envelope4 = new jts.Envelope((double) 1, 95.0d, 62.0d, 9.9d);
        envelope4.init((double) (-5L), (double) (-3), 82.3d, 77.5d);
        envelope4.init(96.7d, 97.4d, 33.3d, 5.1d);
        double double15 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.7000000000000028d + "'", double15 == 0.7000000000000028d);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        jts.Envelope envelope4 = new jts.Envelope(2.3d, (double) (-6), 34.0d, 0.2999999999999998d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
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
        double double19 = envelope4.maxExtent();
        envelope4.init(50.1d, 83.19999999999999d, 3.2d, (double) 4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 109.0d + "'", double15 == 109.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 109.0d + "'", double16 == 109.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 109.0d + "'", double17 == 109.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 109.0d + "'", double18 == 109.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 109.0d + "'", double19 == 109.0d);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        envelope4.init((double) 3, 1.2d, (double) (-8), 104.1d);
        envelope4.init(111.0d, (double) 2L, 109.1d, 7.1d);
        double double21 = envelope4.maxExtent();
        boolean boolean22 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 109.0d + "'", double21 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        jts.Envelope envelope4 = new jts.Envelope(94.60000000000001d, 68.7d, 7.7d, 105.2d);
        envelope4.init(92.8d, 108.7d, 5.700000000000001d, 0.0d);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        jts.Envelope envelope4 = new jts.Envelope(12.3d, 62.9d, 5.700000000000001d, 75.9d);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        jts.Envelope envelope4 = new jts.Envelope(111.9d, 8.4d, 83.7d, 128.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init((double) 1, 85.3d, 117.7d, 62.699999999999996d);
        double double11 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 55.00000000000001d + "'", double11 == 55.00000000000001d);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, (double) (-1L), 0.0d, 8.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass7 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        jts.Envelope envelope4 = new jts.Envelope((double) '4', 16.3d, 26.0d, 18.5d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.7d + "'", double5 == 35.7d);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        boolean boolean13 = envelope4.isEnvelopeNull();
        boolean boolean14 = envelope4.isEnvelopeNull();
        double double15 = envelope4.maxExtent();
        boolean boolean16 = envelope4.isEnvelopeNull();
        double double17 = envelope4.getWidth();
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
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1.0f), (double) (-9), (double) 2, (double) 10);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        envelope4.init(7.7d, 90.49999999999999d, (double) (-1L), 3.1d);
        double double12 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass13 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 82.79999999999998d + "'", double12 == 82.79999999999998d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getWidth();
        envelope4.init(9.2d, (double) 100, (double) 0.0f, 92.0d);
        envelope4.init((-3.8d), (double) (-1L), (double) 100.0f, (double) (-1));
        double double19 = envelope4.getHeight();
        double double20 = envelope4.getHeight();
        double double21 = envelope4.getWidth();
        boolean boolean22 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 101.0d + "'", double19 == 101.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 101.0d + "'", double20 == 101.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2.8d + "'", double21 == 2.8d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        jts.Envelope envelope4 = new jts.Envelope((double) 6, 91.2d, 22.5d, 16.2d);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getHeight();
        envelope4.init(102.0d, 0.0d, (double) 0, (double) ' ');
        double double15 = envelope4.getWidth();
        double double16 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 102.0d + "'", double15 == 102.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 102.0d + "'", double16 == 102.0d);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        jts.Envelope envelope4 = new jts.Envelope(7.0d, 8.3d, 90.3d, 4.799999999999997d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.maxExtent();
        double double9 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 85.5d + "'", double5 == 85.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 85.5d + "'", double6 == 85.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 85.5d + "'", double7 == 85.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 85.5d + "'", double8 == 85.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.3000000000000007d + "'", double9 == 1.3000000000000007d);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getHeight();
        envelope4.init(104.0d, (double) 10L, (double) 3L, 4.8d);
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.maxExtent();
        double double14 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7999999999999998d + "'", double11 == 1.7999999999999998d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7999999999999998d + "'", double12 == 1.7999999999999998d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 94.0d + "'", double13 == 94.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7999999999999998d + "'", double14 == 1.7999999999999998d);
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
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
        boolean boolean27 = envelope4.isEnvelopeNull();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) 10, (double) (byte) 1, (double) (byte) 0);
        double double5 = envelope4.maxExtent();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.getWidth();
        double double9 = envelope4.maxExtent();
        boolean boolean10 = envelope4.isEnvelopeNull();
        boolean boolean11 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass12 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init(1.5d, 15.4d, 87.0d, 8.3d);
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getHeight();
        envelope4.init(0.0d, 133.7d, 3.299999999999999d, 84.1d);
        java.lang.Class<?> wildcardClass19 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 78.7d + "'", double12 == 78.7d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 78.7d + "'", double13 == 78.7d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        jts.Envelope envelope4 = new jts.Envelope(3.9d, 81.0d, 4.800000000000001d, (double) 0.0f);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.800000000000001d + "'", double5 == 4.800000000000001d);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) 10, 5.3d, 0.9000000000000004d, 5.1d);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        jts.Envelope envelope4 = new jts.Envelope((-8.7d), (double) (-8L), (double) (-6L), (double) 2);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6999999999999993d + "'", double6 == 0.6999999999999993d);
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        jts.Envelope envelope4 = new jts.Envelope(116.7d, 54.0d, (double) (-1L), 109.4d);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 1, 85.5d, (double) (-4L), 22.0d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 26.0d + "'", double5 == 26.0d);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        jts.Envelope envelope4 = new jts.Envelope((double) 2, (double) 9L, 4.8d, (double) (-1));
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.8d + "'", double5 == 5.8d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 7.0d + "'", double7 == 7.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.0d + "'", double8 == 7.0d);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
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
        envelope4.init(104.0d, (double) ' ', 98.0d, (double) 10L);
        boolean boolean23 = envelope4.isEnvelopeNull();
        double double24 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 104.0d + "'", double14 == 104.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 106.0d + "'", double15 == 106.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 104.0d + "'", double16 == 104.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 104.0d + "'", double17 == 104.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 72.0d + "'", double24 == 72.0d);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        jts.Envelope envelope4 = new jts.Envelope(0.7999999999999838d, 1.3999999999999968d, 0.9000000000000057d, 102.60000000000001d);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        jts.Envelope envelope4 = new jts.Envelope(9.4d, 14.4d, 102.7d, 14.3d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 88.4d + "'", double5 == 88.4d);
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
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
        double double15 = envelope4.getWidth();
        boolean boolean16 = envelope4.isEnvelopeNull();
        double double17 = envelope4.maxExtent();
        double double18 = envelope4.getWidth();
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        jts.Envelope envelope4 = new jts.Envelope((double) (-8L), 10.0d, (double) (-6L), (double) 8);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        boolean boolean7 = envelope4.isEnvelopeNull();
        boolean boolean8 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 18.0d + "'", double6 == 18.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        jts.Envelope envelope4 = new jts.Envelope(121.6d, 0.7999999999999998d, 121.6d, 17.5d);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        jts.Envelope envelope4 = new jts.Envelope(1.9d, 94.1d, 14.9d, 2.3d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
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
        double double22 = envelope4.getWidth();
        double double23 = envelope4.getHeight();
        envelope4.init(65.0d, 107.0d, (double) (-5L), 9.100000000000003d);
        double double29 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 6.9d + "'", double19 == 6.9d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.0d + "'", double20 == 2.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 6.9d + "'", double21 == 6.9d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 6.9d + "'", double22 == 6.9d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2.0d + "'", double23 == 2.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 42.0d + "'", double29 == 42.0d);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 3.0d, (double) 100.0f, 7.1d);
        double double5 = envelope4.maxExtent();
        envelope4.init(36.0d, 148.0d, (double) 100L, 3.9d);
        boolean boolean11 = envelope4.isEnvelopeNull();
        double double12 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 92.9d + "'", double5 == 92.9d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 112.0d + "'", double12 == 112.0d);
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        envelope4.init(6.9d, (double) (byte) 0, (double) (byte) 1, (double) (-1.0f));
        double double18 = envelope4.getWidth();
        envelope4.init(28.0d, (double) (-100), 5.8d, 5.3d);
        double double24 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 128.0d + "'", double24 == 128.0d);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        jts.Envelope envelope4 = new jts.Envelope((double) '#', (double) (short) 100, (double) (short) -1, (double) 1L);
        double double5 = envelope4.getHeight();
        envelope4.init(4.0d, 90.0d, 1.7000000000000002d, 8.0d);
        boolean boolean11 = envelope4.isEnvelopeNull();
        double double12 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 86.0d + "'", double12 == 86.0d);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        jts.Envelope envelope4 = new jts.Envelope(0.9000000000000004d, 3.5999999999999996d, 18.0d, 3.5999999999999996d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 14.4d + "'", double5 == 14.4d);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        jts.Envelope envelope4 = new jts.Envelope(42.3d, (double) (-1L), 104.1d, 0.40000000000000036d);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        jts.Envelope envelope4 = new jts.Envelope(94.1d, 9.100000000000003d, 20.0d, 5.8d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getHeight();
        boolean boolean7 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass8 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 84.99999999999999d + "'", double5 == 84.99999999999999d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 14.2d + "'", double6 == 14.2d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        jts.Envelope envelope4 = new jts.Envelope(31.0d, (double) (byte) 100, 2.9000000000000004d, 5.0d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.getWidth();
        envelope4.init(9.6d, (double) ' ', 92.0d, 86.5d);
        double double14 = envelope4.getWidth();
        boolean boolean15 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 69.0d + "'", double5 == 69.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 69.0d + "'", double6 == 69.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 69.0d + "'", double7 == 69.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 69.0d + "'", double8 == 69.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 22.4d + "'", double14 == 22.4d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        jts.Envelope envelope4 = new jts.Envelope(100.60000000000001d, (double) (-5), (-6.9d), 37.6d);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        jts.Envelope envelope4 = new jts.Envelope(4.199999999999997d, 73.30000000000001d, 0.0d, 38.4d);
        envelope4.init(51.7d, 106.9d, 4.9d, 1.7000000000000002d);
        double double10 = envelope4.maxExtent();
        boolean boolean11 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 55.2d + "'", double10 == 55.2d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        jts.Envelope envelope4 = new jts.Envelope(74.0d, 94.2d, 11.8d, 92.2d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.200000000000003d + "'", double5 == 20.200000000000003d);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        jts.Envelope envelope4 = new jts.Envelope(62.0d, 30.9d, (double) (-4), (double) (-8));
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        jts.Envelope envelope4 = new jts.Envelope(37.6d, 80.2d, 88.5d, 4.100000000000001d);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        jts.Envelope envelope4 = new jts.Envelope(9.5d, (double) 7, 21.0d, 77.7d);
        envelope4.init((double) 1.0f, 11.9d, 82.3d, 94.1d);
        java.lang.Class<?> wildcardClass10 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        jts.Envelope envelope4 = new jts.Envelope(37.1d, 0.0d, 80.7d, 6.0d);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, (double) 0L, (double) 3L, (double) 1);
        envelope4.init((-2.1d), (double) (-6), 95.2d, (double) 5);
        envelope4.init(2.3d, 3.3d, 77.5d, 199.0d);
        envelope4.init(8.799999999999999d, 5.3d, 76.5d, 106.9d);
        java.lang.Class<?> wildcardClass20 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.maxExtent();
        envelope4.init((double) 5L, (-6.9d), (-5.4d), 0.0d);
        double double19 = envelope4.getHeight();
        double double20 = envelope4.getHeight();
        double double21 = envelope4.getWidth();
        envelope4.init((double) (-9L), 7.7d, 88.1d, 31.0d);
        double double27 = envelope4.getHeight();
        double double28 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 106.0d + "'", double13 == 106.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 5.4d + "'", double19 == 5.4d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 5.4d + "'", double20 == 5.4d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 11.9d + "'", double21 == 11.9d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 57.099999999999994d + "'", double27 == 57.099999999999994d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 16.7d + "'", double28 == 16.7d);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        jts.Envelope envelope4 = new jts.Envelope(88.8d, 14.3d, 6.7d, 91.0d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 84.3d + "'", double5 == 84.3d);
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
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
        boolean boolean34 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 6.9d + "'", double21 == 6.9d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 6.9d + "'", double22 == 6.9d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 108.4d + "'", double33 == 108.4d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.getHeight();
        double double15 = envelope4.getWidth();
        double double16 = envelope4.getHeight();
        double double17 = envelope4.getHeight();
        double double18 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 109.0d + "'", double15 == 109.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5.0d + "'", double16 == 5.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 5.0d + "'", double17 == 5.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 109.0d + "'", double18 == 109.0d);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        jts.Envelope envelope4 = new jts.Envelope(25.1d, 104.39999999999999d, 94.2d, 8.1d);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        jts.Envelope envelope4 = new jts.Envelope(126.4d, 29.2d, 17.700000000000003d, 107.9d);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        jts.Envelope envelope4 = new jts.Envelope((double) 1L, 86.5d, 13.0d, 7.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 85.5d + "'", double6 == 85.5d);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (short) 0, (-9.3d), (double) (-1L));
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getHeight();
        envelope4.init(113.0d, 98.0d, 2.0999999999999996d, 24.0d);
        boolean boolean12 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.0d + "'", double5 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.3d + "'", double6 == 8.3d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        jts.Envelope envelope4 = new jts.Envelope(34.4d, 0.0d, 100.30000000000001d, 1.2000000000000002d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 99.10000000000001d + "'", double5 == 99.10000000000001d);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (short) 0, (-9.3d), (double) (-1L));
        envelope4.init((-2.1d), (double) (-6), (double) (-6L), 2.9000000000000004d);
        envelope4.init(10.4d, 104.1d, 105.0d, 8.600000000000001d);
        double double15 = envelope4.maxExtent();
        double double16 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 96.4d + "'", double15 == 96.4d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 96.4d + "'", double16 == 96.4d);
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getHeight();
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.4d + "'", double9 == 8.4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.0d + "'", double10 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.4d + "'", double11 == 8.4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.4d + "'", double12 == 8.4d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.0d + "'", double13 == 8.0d);
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        jts.Envelope envelope4 = new jts.Envelope(100.0d, 10.5d, (double) 2, (-100.0d));
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getWidth();
        boolean boolean7 = envelope4.isEnvelopeNull();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.maxExtent();
        envelope4.init(13.600000000000001d, 56.5d, 85.4d, 104.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.0d + "'", double5 == 102.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 89.5d + "'", double6 == 89.5d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 102.0d + "'", double9 == 102.0d);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        envelope4.init((double) (byte) 1, (double) (-4L), (double) 100L, 4.8d);
        double double10 = envelope4.maxExtent();
        envelope4.init(6.5d, 83.00000000000001d, 99.10000000000001d, 18.199999999999996d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 95.2d + "'", double10 == 95.2d);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        jts.Envelope envelope4 = new jts.Envelope(2.9000000000000004d, 1.2d, 94.0d, (double) (-10));
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7000000000000004d + "'", double5 == 1.7000000000000004d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 104.0d + "'", double7 == 104.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 104.0d + "'", double8 == 104.0d);
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        jts.Envelope envelope4 = new jts.Envelope(6.9d, 12.0d, 2.0d, 69.0d);
        double double5 = envelope4.getWidth();
        envelope4.init(64.0d, 7.900000000000006d, (double) (-8), 12.399999999999999d);
        envelope4.init(131.39999999999998d, (double) (-9L), 19.700000000000003d, 84.6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.1d + "'", double5 == 5.1d);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        jts.Envelope envelope4 = new jts.Envelope((double) (-5), 28.0d, 61.39999999999999d, 19.8d);
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        jts.Envelope envelope4 = new jts.Envelope((-3.8d), (double) (-100L), 0.0d, 1.7000000000000002d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getHeight();
        envelope4.init((-1.2d), 133.7d, 55.00000000000001d, 18.70000000000001d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 96.2d + "'", double5 == 96.2d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 96.2d + "'", double6 == 96.2d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7000000000000002d + "'", double7 == 1.7000000000000002d);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        envelope4.init((double) (-8), (double) (-9), (double) (-100), (double) 2L);
        double double16 = envelope4.maxExtent();
        envelope4.init((-7.3d), 15.0d, 6.0d, (double) 100);
        envelope4.init(2.1d, 1.7000000000000002d, 12.6d, 92.3d);
        double double27 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass28 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 102.0d + "'", double16 == 102.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.3999999999999999d + "'", double27 == 0.3999999999999999d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init(1.7000000000000004d, 3.5d, 105.7d, 0.0d);
        double double12 = envelope4.getHeight();
        double double13 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 105.7d + "'", double12 == 105.7d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 105.7d + "'", double13 == 105.7d);
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
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
        boolean boolean22 = envelope4.isEnvelopeNull();
        double double23 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass24 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 12.0d + "'", double11 == 12.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 12.0d + "'", double12 == 12.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 12.0d + "'", double13 == 12.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 194.0d + "'", double21 == 194.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 105.0d + "'", double23 == 105.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        jts.Envelope envelope4 = new jts.Envelope(5.0d, 5.3d, (double) (-100L), (double) (-2L));
        envelope4.init((double) (byte) 100, 10.5d, (double) (-9L), 8.4d);
        envelope4.init(6.9d, (double) (-3L), (double) 7L, (double) (-6L));
        java.lang.Class<?> wildcardClass15 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        jts.Envelope envelope4 = new jts.Envelope(14.700000000000003d, (double) 0L, 76.0d, 90.3d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 14.299999999999997d + "'", double5 == 14.299999999999997d);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getWidth();
        boolean boolean10 = envelope4.isEnvelopeNull();
        boolean boolean11 = envelope4.isEnvelopeNull();
        double double12 = envelope4.maxExtent();
        envelope4.init(35.0d, 103.69999999999999d, 0.0d, 12.3d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.4d + "'", double12 == 8.4d);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        jts.Envelope envelope4 = new jts.Envelope((double) (-10), (double) (short) -1, 13.5d, 11.3d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getHeight();
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.getHeight();
        double double15 = envelope4.maxExtent();
        double double16 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass17 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 104.0d + "'", double12 == 104.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 104.0d + "'", double14 == 104.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 106.0d + "'", double15 == 106.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 106.0d + "'", double16 == 106.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        jts.Envelope envelope4 = new jts.Envelope((double) (-5L), 2.7d, 65.0d, 14.0d);
        double double5 = envelope4.maxExtent();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init(54.0d, 4.300000000000009d, 86.9d, (double) 1L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 51.0d + "'", double5 == 51.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        jts.Envelope envelope4 = new jts.Envelope((double) 1L, 50.0d, 15.0d, 20.799999999999997d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.799999999999997d + "'", double5 == 5.799999999999997d);
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        jts.Envelope envelope4 = new jts.Envelope((double) (-8L), 10.0d, (double) (-6L), (double) 8);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init(11.7d, 109.4d, 72.3d, 53.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        jts.Envelope envelope4 = new jts.Envelope(7.0d, 8.3d, 90.3d, 4.799999999999997d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getWidth();
        double double9 = envelope4.getWidth();
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 85.5d + "'", double5 == 85.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 85.5d + "'", double6 == 85.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 85.5d + "'", double7 == 85.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.3000000000000007d + "'", double8 == 1.3000000000000007d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.3000000000000007d + "'", double9 == 1.3000000000000007d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.3000000000000007d + "'", double10 == 1.3000000000000007d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 85.5d + "'", double11 == 85.5d);
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
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
        double double22 = envelope4.getWidth();
        double double23 = envelope4.getHeight();
        double double24 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 6.9d + "'", double19 == 6.9d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.0d + "'", double20 == 2.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 6.9d + "'", double21 == 6.9d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 6.9d + "'", double22 == 6.9d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2.0d + "'", double23 == 2.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 6.9d + "'", double24 == 6.9d);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        jts.Envelope envelope4 = new jts.Envelope(7.5d, (-8.7d), 93.7d, 26.2d);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
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
        double double14 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.4d + "'", double10 == 8.4d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.4d + "'", double11 == 8.4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.4d + "'", double12 == 8.4d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.4d + "'", double13 == 8.4d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.0d + "'", double14 == 8.0d);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getHeight();
        envelope4.init((double) ' ', (-2.1d), 109.0d, (double) 6);
        envelope4.init((double) 10L, (double) 6L, (double) 0L, (-2.1d));
        boolean boolean16 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.getHeight();
        envelope4.init(9.0d, (double) 3, 46.0d, (double) (-4L));
        boolean boolean14 = envelope4.isEnvelopeNull();
        double double15 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass16 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 6.0d + "'", double15 == 6.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
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
        boolean boolean22 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass23 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 109.0d + "'", double13 == 109.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.2000000000000002d + "'", double21 == 1.2000000000000002d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        jts.Envelope envelope4 = new jts.Envelope(41.3d, 90.8d, 80.0d, 99.7d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1.0f), (double) 7L, 11.9d, (double) (-100));
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass7 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 111.9d + "'", double5 == 111.9d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        jts.Envelope envelope4 = new jts.Envelope(114.1d, 38.1d, 20.2d, 24.5d);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        jts.Envelope envelope4 = new jts.Envelope((double) '4', (double) (-6L), (double) (-6), (double) 100L);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getHeight();
        boolean boolean8 = envelope4.isEnvelopeNull();
        envelope4.init(11.3d, 31.0d, 9.0d, 86.5d);
        double double14 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 106.0d + "'", double5 == 106.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 106.0d + "'", double6 == 106.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 106.0d + "'", double7 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 77.5d + "'", double14 == 77.5d);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        jts.Envelope envelope4 = new jts.Envelope(84.99999999999999d, 79.7d, (double) (short) 10, 2.0999999999999943d);
        double double5 = envelope4.getWidth();
        envelope4.init(55.89999999999999d, 8.4d, 9.0d, 91.9d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.299999999999983d + "'", double5 == 5.299999999999983d);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        jts.Envelope envelope4 = new jts.Envelope(12.5d, 92.0d, 13.600000000000001d, 1.2999999999999998d);
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        jts.Envelope envelope4 = new jts.Envelope((double) 'a', (double) (byte) 1, 2.3d, (double) 0L);
        double double5 = envelope4.getHeight();
        envelope4.init((double) (-8L), (double) (byte) 1, 13.0d, (-10.5d));
        boolean boolean11 = envelope4.isEnvelopeNull();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.maxExtent();
        envelope4.init(88.1d, 95.2d, 3.5d, 62.0d);
        java.lang.Class<?> wildcardClass19 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.3d + "'", double5 == 2.3d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 23.5d + "'", double12 == 23.5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 23.5d + "'", double13 == 23.5d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        jts.Envelope envelope4 = new jts.Envelope(98.1d, 8.099999999999994d, 1.8000000000000007d, 102.5d);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 90.0d + "'", double5 == 90.0d);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.getHeight();
        envelope4.init((double) 10.0f, (-4.6d), (double) (byte) 1, (double) 5);
        double double11 = envelope4.getWidth();
        double double12 = envelope4.maxExtent();
        double double13 = envelope4.getWidth();
        double double14 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 14.6d + "'", double11 == 14.6d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 14.6d + "'", double12 == 14.6d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 14.6d + "'", double13 == 14.6d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        jts.Envelope envelope4 = new jts.Envelope((double) (-8L), 10.0d, (double) (-6L), (double) 8);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.maxExtent();
        envelope4.init((double) (-9), 92.5d, 100.7d, 100.0d);
        double double13 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 18.0d + "'", double6 == 18.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.0d + "'", double7 == 18.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.7000000000000028d + "'", double13 == 0.7000000000000028d);
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        boolean boolean16 = envelope4.isEnvelopeNull();
        envelope4.init(85.5d, (-8.7d), (double) (short) -1, 3.7d);
        double double22 = envelope4.maxExtent();
        double double23 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 94.2d + "'", double22 == 94.2d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 4.7d + "'", double23 == 4.7d);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        jts.Envelope envelope4 = new jts.Envelope((-8.7d), (-6.9d), (-1.0d), (double) (-10));
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        envelope4.init(1.799999999999999d, 43.6d, 85.5d, 97.19999999999999d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.0d + "'", double5 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.0d + "'", double6 == 9.0d);
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        jts.Envelope envelope4 = new jts.Envelope((double) (-8L), 34.7d, (double) (-3L), (double) (-7));
        envelope4.init(93.1d, 39.2d, 70.1d, 22.5d);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        jts.Envelope envelope4 = new jts.Envelope((double) 0L, 100.0d, 92.0d, 92.7d);
        double double5 = envelope4.getHeight();
        envelope4.init(97.2d, 36.29999999999999d, 33.1d, 30.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7000000000000028d + "'", double5 == 0.7000000000000028d);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 16.200000000000003d, 3.9d, 1.5d);
        envelope4.init(17.499999999999986d, 11.5d, 2.7d, 3.5d);
        boolean boolean10 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        jts.Envelope envelope4 = new jts.Envelope(57.099999999999994d, (double) (-1L), (double) (-1), 58.7d);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        jts.Envelope envelope4 = new jts.Envelope(80.7d, 0.6999999999999993d, 3.299999999999997d, 17.6d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 14.300000000000004d + "'", double6 == 14.300000000000004d);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
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
        envelope4.init(1.799999999999999d, 102.0d, 76.0d, 102.7d);
        double double28 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass29 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 109.0d + "'", double15 == 109.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5.0d + "'", double16 == 5.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.6000000000000005d + "'", double22 == 0.6000000000000005d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 26.700000000000003d + "'", double28 == 26.700000000000003d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        jts.Envelope envelope4 = new jts.Envelope((-8.7d), (-6.9d), (-1.0d), (double) (-10));
        double double5 = envelope4.getWidth();
        envelope4.init((double) 0L, (double) (-3L), (-5.4d), 86.5d);
        envelope4.init(12.899999999999991d, 80.2d, 80.1d, 0.0d);
        double double16 = envelope4.maxExtent();
        double double17 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.799999999999999d + "'", double5 == 1.799999999999999d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 80.1d + "'", double16 == 80.1d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 67.30000000000001d + "'", double17 == 67.30000000000001d);
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        jts.Envelope envelope4 = new jts.Envelope((double) (-4L), (double) 'a', (-3.8d), (double) (short) -1);
        envelope4.init(18.70000000000001d, 0.0d, 26.800000000000004d, 73.0d);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        double double16 = envelope4.getWidth();
        double double17 = envelope4.getHeight();
        double double18 = envelope4.getWidth();
        double double19 = envelope4.maxExtent();
        envelope4.init(18.9d, 83.89999999999999d, 9.600000000000009d, 11.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 8.0d + "'", double19 == 8.0d);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass9 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
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
        double double14 = envelope4.getHeight();
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
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        envelope4.init(6.9d, (double) (byte) 0, (double) (byte) 1, (double) (-1.0f));
        double double18 = envelope4.getWidth();
        boolean boolean19 = envelope4.isEnvelopeNull();
        envelope4.init(54.2d, (double) (byte) 1, 63.300000000000004d, 98.2d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        jts.Envelope envelope4 = new jts.Envelope(17.0d, 1.799999999999999d, (-10.5d), 66.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        envelope4.init(6.9d, (double) (byte) 0, (double) (byte) 1, (double) (-1.0f));
        double double18 = envelope4.getWidth();
        double double19 = envelope4.maxExtent();
        double double20 = envelope4.getHeight();
        envelope4.init((double) 100, 10.5d, 69.0d, 51.0d);
        double double26 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass27 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 6.9d + "'", double19 == 6.9d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.0d + "'", double20 == 2.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 89.5d + "'", double26 == 89.5d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        jts.Envelope envelope4 = new jts.Envelope((double) (-8L), 10.0d, (double) (-6L), (double) 8);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getWidth();
        boolean boolean10 = envelope4.isEnvelopeNull();
        envelope4.init((double) (short) -1, 14.6d, (double) (short) 10, 6.9d);
        boolean boolean16 = envelope4.isEnvelopeNull();
        double double17 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.0d + "'", double7 == 18.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 14.0d + "'", double8 == 14.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 18.0d + "'", double9 == 18.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 15.6d + "'", double17 == 15.6d);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        jts.Envelope envelope4 = new jts.Envelope(7.1d, 16.200000000000003d, (double) (-1.0f), (double) (-3));
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.100000000000003d + "'", double6 == 9.100000000000003d);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        jts.Envelope envelope4 = new jts.Envelope(4.0d, 0.6000000000000005d, 43.6d, 132.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
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
        double double23 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 87.1d + "'", double21 == 87.1d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 43.6d + "'", double22 == 43.6d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 87.1d + "'", double23 == 87.1d);
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getHeight();
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.getHeight();
        double double15 = envelope4.maxExtent();
        double double16 = envelope4.maxExtent();
        boolean boolean17 = envelope4.isEnvelopeNull();
        double double18 = envelope4.maxExtent();
        double double19 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 104.0d + "'", double12 == 104.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 104.0d + "'", double14 == 104.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 106.0d + "'", double15 == 106.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 106.0d + "'", double16 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 106.0d + "'", double18 == 106.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 104.0d + "'", double19 == 104.0d);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        jts.Envelope envelope4 = new jts.Envelope(100.2d, 36.9d, 79.7d, 92.9d);
        double double5 = envelope4.getWidth();
        envelope4.init(105.0d, 11.899999999999999d, (double) 10, 130.2d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 63.300000000000004d + "'", double5 == 63.300000000000004d);
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        envelope4.init((double) (byte) 1, (double) (-8L), (double) 8L, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        double double13 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 12.0d + "'", double10 == 12.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 12.0d + "'", double11 == 12.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 9.0d + "'", double12 == 9.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 9.0d + "'", double13 == 9.0d);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        envelope4.init((double) (-1L), (double) (-7L), 106.0d, (double) 10);
        boolean boolean18 = envelope4.isEnvelopeNull();
        double double19 = envelope4.maxExtent();
        double double20 = envelope4.getHeight();
        envelope4.init(74.3d, 85.5d, 6.3d, 10.299999999999997d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 96.0d + "'", double19 == 96.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 96.0d + "'", double20 == 96.0d);
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        double double13 = envelope4.getHeight();
        boolean boolean14 = envelope4.isEnvelopeNull();
        double double15 = envelope4.getWidth();
        double double16 = envelope4.maxExtent();
        envelope4.init(30.9d, 67.3d, 92.2d, 183.7d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 109.0d + "'", double15 == 109.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 109.0d + "'", double16 == 109.0d);
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        jts.Envelope envelope4 = new jts.Envelope(4.0d, 0.6000000000000005d, 43.6d, 132.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1.0f), (double) (-9), (double) 2, (double) 10);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.maxExtent();
        envelope4.init(0.3999999999999999d, 103.9d, 87.1d, 88.0d);
        double double14 = envelope4.getHeight();
        boolean boolean15 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9000000000000057d + "'", double14 == 0.9000000000000057d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        jts.Envelope envelope4 = new jts.Envelope(4.8d, 37.0d, 101.8d, 7.899999999999999d);
        envelope4.init((double) ' ', 38.0d, 103.2d, 108.0d);
        envelope4.init(58.3d, (double) (-1L), 12.399999999999999d, 80.3d);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), (double) 100L, 86.5d, 13.4d);
        envelope4.init((double) (-2L), 14.299999999999997d, 4.299999999999999d, 8.8d);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getWidth();
        double double10 = envelope4.maxExtent();
        envelope4.init(79.7d, 12.3d, 90.89999999999999d, 3.9000000000000004d);
        boolean boolean16 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.4d + "'", double10 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        jts.Envelope envelope4 = new jts.Envelope(111.9d, 8.4d, 83.7d, 128.0d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.5d + "'", double5 == 103.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 103.5d + "'", double6 == 103.5d);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        jts.Envelope envelope4 = new jts.Envelope(44.0d, (double) (-4), (double) 100L, 15.700000000000001d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        boolean boolean11 = envelope4.isEnvelopeNull();
        double double12 = envelope4.getWidth();
        envelope4.init(4.2d, (-10.5d), 4.4d, 7.699999999999999d);
        envelope4.init(33.4d, 86.9d, 0.0d, 80.4d);
        double double23 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 80.4d + "'", double23 == 80.4d);
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
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
        envelope4.init(133.7d, 84.6d, (double) 7L, 126.4d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.0d + "'", double11 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        jts.Envelope envelope4 = new jts.Envelope(73.0d, 7.300000000000001d, 7.899999999999999d, 92.0d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
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
        double double32 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 8.0d + "'", double19 == 8.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 8.0d + "'", double20 == 8.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 108.8d + "'", double31 == 108.8d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 108.8d + "'", double32 == 108.8d);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        jts.Envelope envelope4 = new jts.Envelope(18.5d, 88.0d, 101.0d, 90.6d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.400000000000006d + "'", double5 == 10.400000000000006d);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        jts.Envelope envelope4 = new jts.Envelope(5.0d, 5.3d, (double) (-100L), (double) (-2L));
        envelope4.init((double) (byte) 100, 10.5d, (double) (-9L), 8.4d);
        envelope4.init(6.9d, (double) (-3L), (double) 7L, (double) (-6L));
        double double15 = envelope4.getHeight();
        double double16 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 13.0d + "'", double15 == 13.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 13.0d + "'", double16 == 13.0d);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, 1.7000000000000002d, (double) 5L, (double) 3);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7000000000000002d + "'", double5 == 1.7000000000000002d);
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        jts.Envelope envelope4 = new jts.Envelope((double) 100, 100.0d, (double) 0.0f, (double) 0L);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass7 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
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
        envelope4.init(80.0d, 80.19999999999999d, 92.2d, 0.0d);
        double double31 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 92.2d + "'", double31 == 92.2d);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        jts.Envelope envelope4 = new jts.Envelope(39.400000000000006d, 18.700000000000003d, 20.799999999999997d, 46.099999999999994d);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        jts.Envelope envelope4 = new jts.Envelope(17.6d, (double) (byte) 1, (double) (byte) 100, (-10.5d));
        envelope4.init(3.2d, 94.1d, 90.3d, (double) (-5));
        envelope4.init(85.3d, 56.7d, 100.30000000000001d, 106.9d);
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        jts.Envelope envelope4 = new jts.Envelope(79.7d, 0.0d, 22.5d, 0.0d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        envelope4.init((double) (byte) 1, (double) (-4L), (double) 100L, 4.8d);
        boolean boolean10 = envelope4.isEnvelopeNull();
        boolean boolean11 = envelope4.isEnvelopeNull();
        envelope4.init(41.3d, (double) 8L, 90.6d, 10.4d);
        double double17 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 80.19999999999999d + "'", double17 == 80.19999999999999d);
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        jts.Envelope envelope4 = new jts.Envelope((double) 8, (-6.9d), 94.3d, 11.3d);
        envelope4.init(2.3d, 98.1d, 7.0d, 49.099999999999994d);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        jts.Envelope envelope4 = new jts.Envelope((double) '#', (-2.1d), (double) 1L, (double) (-8));
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        jts.Envelope envelope4 = new jts.Envelope(34.7d, 10.199999999999998d, 55.2d, (-3.8d));
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        double double13 = envelope4.getHeight();
        boolean boolean14 = envelope4.isEnvelopeNull();
        envelope4.init((double) (byte) -1, (double) 100, 2.0d, (double) (-8));
        double double20 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass21 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), (double) (short) 0, 1.0d, (double) 10);
        double double5 = envelope4.getWidth();
        envelope4.init((double) (byte) 100, (double) (byte) 0, (double) 4, (double) (-1L));
        boolean boolean11 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass12 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getHeight();
        boolean boolean8 = envelope4.isEnvelopeNull();
        boolean boolean9 = envelope4.isEnvelopeNull();
        envelope4.init(88.6d, (double) 9, 6.9d, 98.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        double double16 = envelope4.getWidth();
        double double17 = envelope4.maxExtent();
        double double18 = envelope4.maxExtent();
        boolean boolean19 = envelope4.isEnvelopeNull();
        double double20 = envelope4.getHeight();
        envelope4.init(0.0d, 5.3d, 104.0d, (double) 7);
        double double26 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 8.0d + "'", double17 == 8.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.0d + "'", double18 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 8.0d + "'", double20 == 8.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 97.0d + "'", double26 == 97.0d);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        double double5 = envelope4.getHeight();
        envelope4.init((double) ' ', (-2.1d), 109.0d, (double) 6);
        boolean boolean11 = envelope4.isEnvelopeNull();
        boolean boolean12 = envelope4.isEnvelopeNull();
        boolean boolean13 = envelope4.isEnvelopeNull();
        envelope4.init(14.300000000000004d, 131.39999999999998d, 67.3d, 83.6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.0d + "'", double5 == 103.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        jts.Envelope envelope4 = new jts.Envelope(4.8d, (double) (short) 0, 7.1d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.1d + "'", double5 == 7.1d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.1d + "'", double6 == 7.1d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 7.1d + "'", double7 == 7.1d);
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        jts.Envelope envelope4 = new jts.Envelope(60.099999999999994d, 9.0d, 108.7d, 1.1999999999999886d);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        jts.Envelope envelope4 = new jts.Envelope(25.0d, (double) '4', 181.70000000000002d, (double) 9);
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        jts.Envelope envelope4 = new jts.Envelope(100.0d, (double) (short) -1, 0.0d, 0.0d);
        envelope4.init((double) 0, (double) 5, (-9.3d), (double) ' ');
        double double10 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass11 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.0d + "'", double10 == 5.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        jts.Envelope envelope4 = new jts.Envelope(8.4d, (double) (byte) 10, (double) (-100L), (double) '#');
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init((double) 100, 97.19999999999999d, 0.0d, 44.3d);
        envelope4.init(85.7d, 135.40000000000003d, 77.3d, 38.7d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        jts.Envelope envelope4 = new jts.Envelope(131.0d, 90.2d, 104.1d, 55.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        boolean boolean7 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 49.099999999999994d + "'", double5 == 49.099999999999994d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 49.099999999999994d + "'", double6 == 49.099999999999994d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        jts.Envelope envelope4 = new jts.Envelope((double) 2, (double) 9L, 4.8d, (double) (-1));
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        boolean boolean7 = envelope4.isEnvelopeNull();
        double double8 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.8d + "'", double5 == 5.8d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.0d + "'", double6 == 7.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.8d + "'", double8 == 5.8d);
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init((double) 100, (-100.0d), (double) '#', 5.0d);
        envelope4.init((double) 5, (double) (short) 10, 96.0d, (double) (byte) 10);
        envelope4.init(100.0d, (-100.0d), (double) (byte) 100, (double) 1L);
        envelope4.init((double) 3, 4.8d, 100.0d, 0.0d);
        envelope4.init(111.9d, 4.4d, 0.0d, (double) (-100L));
        double double36 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 107.5d + "'", double36 == 107.5d);
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getHeight();
        envelope4.init((double) 3L, (double) (-7), (double) (byte) 0, 0.0d);
        boolean boolean15 = envelope4.isEnvelopeNull();
        boolean boolean16 = envelope4.isEnvelopeNull();
        double double17 = envelope4.getHeight();
        double double18 = envelope4.maxExtent();
        double double19 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass20 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        jts.Envelope envelope4 = new jts.Envelope((double) (-7), (double) (-3L), 95.2d, (double) 9L);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 86.2d + "'", double5 == 86.2d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 86.2d + "'", double6 == 86.2d);
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, 2.5999999999999996d, 95.0d, 10.5d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.getWidth();
        double double9 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 84.5d + "'", double5 == 84.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 84.5d + "'", double6 == 84.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.4d + "'", double7 == 5.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.4d + "'", double8 == 5.4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5.4d + "'", double9 == 5.4d);
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        jts.Envelope envelope4 = new jts.Envelope((double) (-3L), (double) (-9), 7.1d, (double) (byte) -1);
        envelope4.init((double) 0.0f, (double) (-1), 103.0d, 11.9d);
        double double10 = envelope4.getWidth();
        double double11 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        jts.Envelope envelope4 = new jts.Envelope(4.8d, (double) (-2), (double) ' ', 65.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
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
        double double22 = envelope4.maxExtent();
        boolean boolean23 = envelope4.isEnvelopeNull();
        double double24 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 6.9d + "'", double19 == 6.9d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.0d + "'", double20 == 2.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2.0d + "'", double21 == 2.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 6.9d + "'", double22 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 2.0d + "'", double24 == 2.0d);
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 1, (double) 0.0f, (double) 6, (double) 3L);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        boolean boolean7 = envelope4.isEnvelopeNull();
        envelope4.init(0.0d, 108.0d, 16.3d, 18.1d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        boolean boolean8 = envelope4.isEnvelopeNull();
        boolean boolean9 = envelope4.isEnvelopeNull();
        envelope4.init(0.0d, 200.0d, 101.0d, 19.700000000000003d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
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
        double double23 = envelope4.getWidth();
        envelope4.init((double) (-100L), 103.69999999999999d, 14.700000000000003d, 91.3d);
        boolean boolean29 = envelope4.isEnvelopeNull();
        double double30 = envelope4.getWidth();
        double double31 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 109.0d + "'", double15 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 5.0d + "'", double17 == 5.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 203.7d + "'", double30 == 203.7d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 76.6d + "'", double31 == 76.6d);
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.maxExtent();
        double double15 = envelope4.getHeight();
        double double16 = envelope4.getHeight();
        boolean boolean17 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass18 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 106.0d + "'", double14 == 106.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 104.0d + "'", double15 == 104.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 104.0d + "'", double16 == 104.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        jts.Envelope envelope4 = new jts.Envelope((double) (-100L), 36.0d, 96.2d, 79.9d);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        jts.Envelope envelope4 = new jts.Envelope((double) 8, (double) (short) 0, 16.200000000000003d, 17.6d);
        double double5 = envelope4.getWidth();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init(9.099999999999998d, 33.7d, 9.5d, 89.5d);
        double double12 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass13 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 80.0d + "'", double12 == 80.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, (double) (-100L), 0.0d, (double) 10);
        envelope4.init((double) (byte) 1, (double) 9, 10.4d, 24.0d);
        double double10 = envelope4.getHeight();
        boolean boolean11 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 13.6d + "'", double10 == 13.6d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        jts.Envelope envelope4 = new jts.Envelope(204.1d, 31.099999999999994d, 5.4d, 5.600000000000001d);
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        jts.Envelope envelope4 = new jts.Envelope(20.0d, 10.8d, 10.299999999999997d, 76.5d);
        double double5 = envelope4.maxExtent();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 66.2d + "'", double5 == 66.2d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        jts.Envelope envelope4 = new jts.Envelope(98.7d, 88.1d, (double) (-3), 62.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass7 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 65.0d + "'", double5 == 65.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 65.0d + "'", double6 == 65.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, (double) 9, (double) '4', 110.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        boolean boolean7 = envelope4.isEnvelopeNull();
        boolean boolean8 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 58.0d + "'", double5 == 58.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.0d + "'", double6 == 9.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        jts.Envelope envelope4 = new jts.Envelope(80.7d, 0.6999999999999993d, 3.299999999999997d, 17.6d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 80.0d + "'", double5 == 80.0d);
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, 2.5999999999999996d, 95.0d, 10.5d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 84.5d + "'", double5 == 84.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 84.5d + "'", double6 == 84.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.4d + "'", double7 == 5.4d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        jts.Envelope envelope4 = new jts.Envelope(111.9d, 8.4d, 83.7d, 128.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        envelope4.init((double) 1, 85.3d, 117.7d, 62.699999999999996d);
        envelope4.init((double) 0L, 183.7d, 3.4000000000000004d, 41.0d);
        double double16 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 183.7d + "'", double16 == 183.7d);
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, (double) 0L, (double) 3L, (double) 1);
        envelope4.init((-2.1d), (double) (-6), 95.2d, (double) 5);
        envelope4.init(0.9000000000000004d, 19.0d, 4.800000000000001d, (double) (-1));
        double double15 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 18.1d + "'", double15 == 18.1d);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        jts.Envelope envelope4 = new jts.Envelope((double) (-7), (double) 4L, (-7.3d), (-100.0d));
        envelope4.init(12.0d, (double) (-1.0f), (double) (-1L), 65.0d);
        double double10 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 13.0d + "'", double10 == 13.0d);
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        jts.Envelope envelope4 = new jts.Envelope(100.0d, 10.5d, (double) 2, (-100.0d));
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.maxExtent();
        double double9 = envelope4.getHeight();
        boolean boolean10 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.0d + "'", double5 == 102.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 102.0d + "'", double6 == 102.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 102.0d + "'", double7 == 102.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 102.0d + "'", double8 == 102.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 102.0d + "'", double9 == 102.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        jts.Envelope envelope4 = new jts.Envelope(79.7d, 7.7d, 1.2000000000000002d, 11.3d);
        double double5 = envelope4.getHeight();
        envelope4.init(15.6d, 36.29999999999999d, 17.400000000000006d, 96.2d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.100000000000001d + "'", double5 == 10.100000000000001d);
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        jts.Envelope envelope4 = new jts.Envelope(109.7d, 0.0d, 53.400000000000006d, (double) (-5));
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 100, 80.0d, 88.9d, (double) 5L);
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        envelope4.init(7.1d, (double) (byte) 10, (-5.4d), 5.0d);
        double double12 = envelope4.getWidth();
        envelope4.init((-1.0d), 24.0d, (-3.8d), 0.6999999999999993d);
        java.lang.Class<?> wildcardClass18 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.9000000000000004d + "'", double12 == 2.9000000000000004d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        jts.Envelope envelope4 = new jts.Envelope(24.5d, 100.30000000000001d, 44.0d, 90.8d);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
        jts.Envelope envelope4 = new jts.Envelope(8.100000000000001d, 20.5d, 11.0d, 33.1d);
        envelope4.init(9.2d, 2.0999999999999996d, 85.4d, 85.5d);
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        jts.Envelope envelope4 = new jts.Envelope((double) (-10), 1.2999999999999998d, 10.4d, 89.2d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 78.8d + "'", double5 == 78.8d);
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        envelope4.init((double) (-8), (double) (-9), (double) (-100), (double) 2L);
        double double16 = envelope4.maxExtent();
        envelope4.init((-7.3d), 15.0d, 6.0d, (double) 100);
        double double22 = envelope4.getWidth();
        double double23 = envelope4.getWidth();
        double double24 = envelope4.maxExtent();
        double double25 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 102.0d + "'", double16 == 102.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 22.3d + "'", double22 == 22.3d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 22.3d + "'", double23 == 22.3d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 94.0d + "'", double24 == 94.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 94.0d + "'", double25 == 94.0d);
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        double double13 = envelope4.getHeight();
        double double14 = envelope4.getHeight();
        double double15 = envelope4.getWidth();
        boolean boolean16 = envelope4.isEnvelopeNull();
        boolean boolean17 = envelope4.isEnvelopeNull();
        double double18 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 109.0d + "'", double15 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 109.0d + "'", double18 == 109.0d);
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        jts.Envelope envelope4 = new jts.Envelope(11.9d, (double) 100L, (double) (-1L), (double) 100L);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 88.1d + "'", double6 == 88.1d);
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        jts.Envelope envelope4 = new jts.Envelope((double) 100L, (-2.1d), (double) 100L, 109.7d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.700000000000003d + "'", double6 == 9.700000000000003d);
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getWidth();
        double double8 = envelope4.maxExtent();
        double double9 = envelope4.maxExtent();
        boolean boolean10 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass11 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.4d + "'", double9 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
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
        double double26 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 110.0d + "'", double16 == 110.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 110.0d + "'", double17 == 110.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 26.0d + "'", double18 == 26.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 110.0d + "'", double19 == 110.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 196.3d + "'", double26 == 196.3d);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        jts.Envelope envelope4 = new jts.Envelope((-10.5d), 11.1d, 36.0d, 6.1d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 29.9d + "'", double5 == 29.9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 29.9d + "'", double6 == 29.9d);
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        jts.Envelope envelope4 = new jts.Envelope((double) (-3), (-100.0d), (-3.8d), 90.3d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 94.1d + "'", double5 == 94.1d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
        jts.Envelope envelope4 = new jts.Envelope(58.0d, (double) 8, 85.3d, 83.7d);
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, (double) 0L, (double) 3L, (double) 1);
        envelope4.init((-2.1d), (double) (-6), 95.2d, (double) 5);
        double double10 = envelope4.getHeight();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 90.2d + "'", double10 == 90.2d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 90.2d + "'", double11 == 90.2d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.9d + "'", double12 == 3.9d);
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init(0.0d, 0.0d, (double) 0L, (double) (-8));
        boolean boolean16 = envelope4.isEnvelopeNull();
        envelope4.init(85.5d, (-8.7d), (double) (short) -1, 3.7d);
        double double22 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.7d + "'", double22 == 4.7d);
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
        jts.Envelope envelope4 = new jts.Envelope(69.0d, (double) (byte) 10, 94.0d, 4.8d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        jts.Envelope envelope4 = new jts.Envelope(46.0d, (double) (byte) -1, 34.7d, 83.99999999999999d);
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        envelope4.init((double) (byte) 1, (double) (-8L), (double) 8L, (double) (-4L));
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getHeight();
        double double14 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 12.0d + "'", double11 == 12.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 12.0d + "'", double12 == 12.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 12.0d + "'", double13 == 12.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 9.0d + "'", double14 == 9.0d);
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        envelope4.init((-5.4d), (-8.7d), (double) 5L, (double) 7);
        double double12 = envelope4.getHeight();
        double double13 = envelope4.maxExtent();
        double double14 = envelope4.getHeight();
        double double15 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.0d + "'", double12 == 2.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.299999999999999d + "'", double13 == 3.299999999999999d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.0d + "'", double14 == 2.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.299999999999999d + "'", double15 == 3.299999999999999d);
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
        jts.Envelope envelope4 = new jts.Envelope(10.8d, 1.6999999999999993d, 14.4d, 81.5d);
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        jts.Envelope envelope4 = new jts.Envelope(41.0d, (double) 2L, 106.9d, 7.699999999999999d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 99.2d + "'", double5 == 99.2d);
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        jts.Envelope envelope4 = new jts.Envelope((double) 9L, (double) 10, (double) (-7L), (double) 0L);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, (double) (-5), (double) 8L, (double) (-5));
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 13.0d + "'", double5 == 13.0d);
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        jts.Envelope envelope4 = new jts.Envelope((-4.6d), (double) 100L, (-7.3d), 65.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        envelope4.init(114.9d, 68.6d, (double) 4L, (-5.4d));
        double double12 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 104.6d + "'", double5 == 104.6d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.6d + "'", double6 == 104.6d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 9.4d + "'", double12 == 9.4d);
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        jts.Envelope envelope4 = new jts.Envelope(85.1d, 42.3d, 77.5d, 11.9d);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        jts.Envelope envelope4 = new jts.Envelope(31.0d, 91.1d, 36.9d, 10.5d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
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
        envelope4.init(15.4d, 10.5d, 2.9000000000000004d, 8.0d);
        java.lang.Class<?> wildcardClass19 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.0d + "'", double12 == 8.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        envelope4.init((double) (-8), (double) (-9), (double) (-100), (double) 2L);
        double double16 = envelope4.getHeight();
        double double17 = envelope4.maxExtent();
        double double18 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 102.0d + "'", double16 == 102.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 102.0d + "'", double17 == 102.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 102.0d + "'", double18 == 102.0d);
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
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
        envelope4.init(2.7d, (double) 2, 9.9d, 12.6d);
        double double23 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 5.0d + "'", double15 == 5.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 109.0d + "'", double16 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.7000000000000002d + "'", double23 == 0.7000000000000002d);
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        envelope4.init((double) (-1L), (double) (-1.0f), (double) 0L, 100.0d);
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.getWidth();
        envelope4.init(75.9d, 114.19999999999999d, 80.7d, 95.2d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) -1, 85.0d, 38.4d, (double) 7);
        envelope4.init(91.9d, 100.60000000000001d, 96.2d, 77.9d);
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        jts.Envelope envelope4 = new jts.Envelope((double) (-8L), 10.0d, (double) (-6L), (double) 8);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        boolean boolean7 = envelope4.isEnvelopeNull();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.maxExtent();
        double double10 = envelope4.getHeight();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 14.0d + "'", double8 == 14.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 18.0d + "'", double9 == 18.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 14.0d + "'", double10 == 14.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 18.0d + "'", double11 == 18.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 18.0d + "'", double12 == 18.0d);
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
        jts.Envelope envelope4 = new jts.Envelope(102.3d, 8.0d, 4.0d, (double) (byte) 100);
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
        jts.Envelope envelope4 = new jts.Envelope(2.3d, (double) (-6), 34.0d, 0.2999999999999998d);
        double double5 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.3d + "'", double5 == 8.3d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        jts.Envelope envelope4 = new jts.Envelope(1.2999999999999998d, 117.4d, 0.0d, 0.0d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 116.10000000000001d + "'", double5 == 116.10000000000001d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 116.10000000000001d + "'", double6 == 116.10000000000001d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.maxExtent();
        boolean boolean9 = envelope4.isEnvelopeNull();
        double double10 = envelope4.getWidth();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.0d + "'", double10 == 8.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.4d + "'", double11 == 8.4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.0d + "'", double12 == 8.0d);
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        jts.Envelope envelope4 = new jts.Envelope(11.9d, 6.1d, (double) (-1L), (double) (-1));
        boolean boolean5 = envelope4.isEnvelopeNull();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.800000000000001d + "'", double7 == 5.800000000000001d);
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init((double) 100, (-100.0d), (double) '#', 5.0d);
        boolean boolean16 = envelope4.isEnvelopeNull();
        double double17 = envelope4.getWidth();
        boolean boolean18 = envelope4.isEnvelopeNull();
        double double19 = envelope4.getWidth();
        double double20 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 200.0d + "'", double17 == 200.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 200.0d + "'", double19 == 200.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 30.0d + "'", double20 == 30.0d);
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        jts.Envelope envelope4 = new jts.Envelope(79.7d, 1.2000000000000002d, 3.9000000000000004d, 108.0d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        jts.Envelope envelope4 = new jts.Envelope(30.0d, 55.0d, 6.0d, 101.8d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 25.0d + "'", double6 == 25.0d);
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        jts.Envelope envelope4 = new jts.Envelope(3.3999999999999995d, 1.2000000000000002d, 3.4000000000000004d, 107.2d);
        envelope4.init(57.0d, 3.3d, 88.7d, 111.3d);
        double double10 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 53.7d + "'", double10 == 53.7d);
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
        jts.Envelope envelope4 = new jts.Envelope(3.0d, 103.9d, 96.4d, 105.7d);
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.9d + "'", double5 == 100.9d);
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        envelope4.init((double) (-8), (double) (-9), (double) (-100), (double) 2L);
        double double16 = envelope4.getHeight();
        double double17 = envelope4.getHeight();
        envelope4.init(20.0d, 0.0d, (double) (short) 100, 96.9d);
        double double23 = envelope4.getHeight();
        double double24 = envelope4.getWidth();
        boolean boolean25 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 102.0d + "'", double16 == 102.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 102.0d + "'", double17 == 102.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 3.0999999999999943d + "'", double23 == 3.0999999999999943d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 20.0d + "'", double24 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getHeight();
        double double14 = envelope4.getHeight();
        boolean boolean15 = envelope4.isEnvelopeNull();
        envelope4.init(2.7d, 4.0d, 1.7000000000000004d, 76.0d);
        double double21 = envelope4.getWidth();
        double double22 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 104.0d + "'", double12 == 104.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 104.0d + "'", double14 == 104.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.2999999999999998d + "'", double21 == 1.2999999999999998d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.2999999999999998d + "'", double22 == 1.2999999999999998d);
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
        jts.Envelope envelope4 = new jts.Envelope(7.0d, 203.5d, 131.0d, 134.0d);
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        jts.Envelope envelope4 = new jts.Envelope(16.7d, 4.499999999999999d, 13.0d, 83.6d);
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
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
        envelope4.init(2.1d, 92.3d, 78.7d, 58.3d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.9d + "'", double18 == 6.9d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 6.9d + "'", double21 == 6.9d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 6.9d + "'", double22 == 6.9d);
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        jts.Envelope envelope4 = new jts.Envelope(10.600000000000009d, 92.9d, (double) (-10), 0.5d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 82.3d + "'", double6 == 82.3d);
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
        jts.Envelope envelope4 = new jts.Envelope(6.1d, 14.9d, (double) 0.0f, 96.9d);
        envelope4.init((double) (byte) 10, 93.0d, 20.799999999999997d, (double) 'a');
        double double10 = envelope4.getWidth();
        boolean boolean11 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 83.0d + "'", double10 == 83.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) (-9L), (double) 100L, (double) (-4), (double) (-9));
        double double13 = envelope4.getHeight();
        double double14 = envelope4.maxExtent();
        double double15 = envelope4.getWidth();
        boolean boolean16 = envelope4.isEnvelopeNull();
        boolean boolean17 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 109.0d + "'", double15 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
        jts.Envelope envelope4 = new jts.Envelope((-3.8d), (double) 10L, (double) 1.0f, 86.5d);
        double double5 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 13.8d + "'", double5 == 13.8d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        boolean boolean13 = envelope4.isEnvelopeNull();
        double double14 = envelope4.maxExtent();
        double double15 = envelope4.getHeight();
        envelope4.init(66.8d, 60.6d, 17.499999999999986d, 53.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 106.0d + "'", double14 == 106.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 104.0d + "'", double15 == 104.0d);
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        jts.Envelope envelope4 = new jts.Envelope(5.0d, 5.3d, (double) (-100L), (double) (-2L));
        envelope4.init((double) (byte) 100, 10.5d, (double) (-9L), 8.4d);
        double double10 = envelope4.getHeight();
        envelope4.init(2.1d, (double) 1, (double) (-2), (double) 0);
        envelope4.init(11.8d, 72.3d, 101.39999999999999d, (double) (-10));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 17.4d + "'", double10 == 17.4d);
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) (-4), (double) (-3L), 100.0d);
        envelope4.init((double) (byte) 1, (double) (-8L), (double) 8L, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.maxExtent();
        boolean boolean13 = envelope4.isEnvelopeNull();
        boolean boolean14 = envelope4.isEnvelopeNull();
        double double15 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 12.0d + "'", double10 == 12.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 12.0d + "'", double11 == 12.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 12.0d + "'", double12 == 12.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 9.0d + "'", double15 == 9.0d);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, 16.200000000000003d, 3.9d, 1.5d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.4d + "'", double5 == 2.4d);
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        jts.Envelope envelope4 = new jts.Envelope(100.0d, 10.5d, (double) 2, (-100.0d));
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getWidth();
        boolean boolean9 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.0d + "'", double5 == 102.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 102.0d + "'", double6 == 102.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 102.0d + "'", double7 == 102.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 89.5d + "'", double8 == 89.5d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
        jts.Envelope envelope4 = new jts.Envelope(76.0d, 86.0d, 100.0d, (double) 6);
        boolean boolean5 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getWidth();
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.maxExtent();
        envelope4.init(0.6999999999999993d, (double) (-7), 41.2d, 0.0d);
        boolean boolean18 = envelope4.isEnvelopeNull();
        double double19 = envelope4.getHeight();
        double double20 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.4d + "'", double5 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.4d + "'", double7 == 8.4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.4d + "'", double8 == 8.4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.4d + "'", double11 == 8.4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.4d + "'", double12 == 8.4d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 41.2d + "'", double19 == 41.2d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 41.2d + "'", double20 == 41.2d);
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
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
        double double29 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass30 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 109.0d + "'", double13 == 109.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 109.0d + "'", double14 == 109.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.2000000000000002d + "'", double21 == 1.2000000000000002d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 3.2d + "'", double22 == 3.2d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 12.200000000000003d + "'", double29 == 12.200000000000003d);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        jts.Envelope envelope4 = new jts.Envelope(42.0d, (double) (short) 1, (double) 9, (double) (-100L));
        double double5 = envelope4.getWidth();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init(87.1d, 100.0d, 102.3d, 92.3d);
        double double13 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass14 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 41.0d + "'", double5 == 41.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 109.0d + "'", double6 == 109.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 41.0d + "'", double7 == 41.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        jts.Envelope envelope4 = new jts.Envelope(100.0d, (double) (short) -1, 0.0d, 0.0d);
        envelope4.init((double) 0, (double) 5, (-9.3d), (double) ' ');
        double double10 = envelope4.getHeight();
        double double11 = envelope4.getWidth();
        double double12 = envelope4.getHeight();
        double double13 = envelope4.getWidth();
        double double14 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 41.3d + "'", double10 == 41.3d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5.0d + "'", double11 == 5.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 41.3d + "'", double12 == 41.3d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.0d + "'", double13 == 5.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 41.3d + "'", double14 == 41.3d);
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
        jts.Envelope envelope4 = new jts.Envelope(86.4d, 81.0d, 103.3d, 67.3d);
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        jts.Envelope envelope4 = new jts.Envelope((double) 1L, (double) 0L, 10.5d, (-2.1d));
        envelope4.init(70.0d, 89.8d, 3.3d, 96.8d);
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
        jts.Envelope envelope4 = new jts.Envelope((double) '#', (double) (short) 100, (double) (short) -1, (double) 1L);
        double double5 = envelope4.getHeight();
        envelope4.init(4.0d, 90.0d, 1.7000000000000002d, 8.0d);
        double double11 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 6.3d + "'", double11 == 6.3d);
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
        jts.Envelope envelope4 = new jts.Envelope(7.1d, 16.200000000000003d, (double) (-1.0f), (double) (-3));
        envelope4.init(6.0d, 1.5999999999999996d, 17.6d, 4.0d);
        double double10 = envelope4.maxExtent();
        envelope4.init(35.599999999999994d, 7.899999999999999d, (double) 10, 1.4000000000000004d);
        java.lang.Class<?> wildcardClass16 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 13.600000000000001d + "'", double10 == 13.600000000000001d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        double double13 = envelope4.maxExtent();
        envelope4.init((double) 5L, (-6.9d), (-5.4d), 0.0d);
        double double19 = envelope4.getWidth();
        double double20 = envelope4.maxExtent();
        double double21 = envelope4.getHeight();
        envelope4.init(80.1d, 98.5d, 34.7d, 33.3d);
        java.lang.Class<?> wildcardClass27 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 106.0d + "'", double13 == 106.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 11.9d + "'", double19 == 11.9d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 11.9d + "'", double20 == 11.9d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 5.4d + "'", double21 == 5.4d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
        jts.Envelope envelope4 = new jts.Envelope((double) 2L, (double) (-7), 2.0999999999999996d, 102.7d);
        double double5 = envelope4.getHeight();
        envelope4.init(104.0d, 1.799999999999999d, 0.0d, 110.5d);
        double double11 = envelope4.getHeight();
        double double12 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.60000000000001d + "'", double5 == 100.60000000000001d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 110.5d + "'", double11 == 110.5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 110.5d + "'", double12 == 110.5d);
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        jts.Envelope envelope4 = new jts.Envelope(101.0d, 0.0d, 97.4d, 8.100000000000001d);
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
        jts.Envelope envelope4 = new jts.Envelope(0.6000000000000005d, 0.0d, 84.0d, 91.2d);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
        jts.Envelope envelope4 = new jts.Envelope(4.499999999999999d, 22.700000000000003d, 103.9d, 111.0d);
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
        jts.Envelope envelope4 = new jts.Envelope(9.6d, 0.0d, (double) (-3L), 2.1d);
        envelope4.init(14.3d, 36.0d, 80.4d, 148.0d);
        boolean boolean10 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
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
        double double15 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass16 = envelope4.getClass();
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        envelope4.init((double) (byte) 100, (double) (-6L), (double) 100.0f, (double) (-4L));
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        boolean boolean13 = envelope4.isEnvelopeNull();
        boolean boolean14 = envelope4.isEnvelopeNull();
        boolean boolean15 = envelope4.isEnvelopeNull();
        envelope4.init(109.0d, 94.60000000000001d, 20.9d, 18.9d);
        envelope4.init(0.0d, 21.0d, 83.00000000000001d, 193.6d);
        boolean boolean26 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 106.0d + "'", double10 == 106.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 106.0d + "'", double11 == 106.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 106.0d + "'", double12 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
        jts.Envelope envelope4 = new jts.Envelope(92.7d, (double) (-10L), 1.2d, (double) (-8L));
        double double5 = envelope4.getWidth();
        envelope4.init(0.0d, 2.9000000000000004d, (double) (-6L), 184.1d);
        envelope4.init(10.0d, 31.800000000000004d, 7.899999999999999d, 90.3d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.7d + "'", double5 == 102.7d);
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
        jts.Envelope envelope4 = new jts.Envelope(26.700000000000003d, (double) (-8), 90.19999999999999d, 4.799999999999997d);
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        jts.Envelope envelope4 = new jts.Envelope(12.0d, 95.2d, (double) (-4L), (double) 10L);
        double double5 = envelope4.getHeight();
        envelope4.init(0.0d, 28.900000000000013d, 103.5d, 13.899999999999991d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 14.0d + "'", double5 == 14.0d);
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        jts.Envelope envelope4 = new jts.Envelope(0.0d, (double) 9, (double) '4', 110.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
        jts.Envelope envelope4 = new jts.Envelope((double) 8L, (-5.4d), 5.8d, (double) 10L);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getHeight();
        boolean boolean7 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.2d + "'", double6 == 4.2d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        jts.Envelope envelope4 = new jts.Envelope((double) 8, 13.0d, 22.3d, (double) 10L);
        envelope4.init((double) (-100L), 90.3d, 31.0d, (double) 3L);
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass12 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 190.3d + "'", double10 == 190.3d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 28.0d + "'", double11 == 28.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (-8), 0.0d, (double) 4L, 100.0d);
        envelope4.init((double) (short) 0, 0.0d, (double) 100L, (double) (-6L));
        double double16 = envelope4.getWidth();
        double double17 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 106.0d + "'", double17 == 106.0d);
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
        jts.Envelope envelope4 = new jts.Envelope(97.4d, 83.6d, (double) 100L, 60.6d);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
        jts.Envelope envelope4 = new jts.Envelope(110.39999999999999d, 8.0d, 0.0d, 13.9d);
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        jts.Envelope envelope4 = new jts.Envelope((double) (-7), (double) 4L, (-7.3d), (-100.0d));
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.getHeight();
        boolean boolean7 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 92.7d + "'", double6 == 92.7d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        jts.Envelope envelope4 = new jts.Envelope(126.4d, 19.700000000000003d, (double) (byte) -1, 3.2d);
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
        jts.Envelope envelope4 = new jts.Envelope(17.0d, 1.799999999999999d, (-10.5d), 66.0d);
        envelope4.init(46.3d, 14.200000000000003d, 0.0d, 112.0d);
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        jts.Envelope envelope4 = new jts.Envelope((double) 9, (double) 10, (double) (byte) 1, (double) (byte) 0);
        double double5 = envelope4.maxExtent();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.maxExtent();
        boolean boolean10 = envelope4.isEnvelopeNull();
        double double11 = envelope4.getHeight();
        boolean boolean12 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
        jts.Envelope envelope4 = new jts.Envelope(8.0d, (double) 0L, 8.4d, 0.0d);
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
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        jts.Envelope envelope4 = new jts.Envelope((double) '4', (double) (-6L), (double) (-6), (double) 100L);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.maxExtent();
        boolean boolean7 = envelope4.isEnvelopeNull();
        envelope4.init(11.299999999999983d, 67.0d, 8.0d, 105.2d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 106.0d + "'", double5 == 106.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 106.0d + "'", double6 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        jts.Envelope envelope4 = new jts.Envelope(4.8d, 27.3d, 15.3d, 1.799999999999999d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 13.500000000000002d + "'", double5 == 13.500000000000002d);
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
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
        double double19 = envelope4.getWidth();
        double double20 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9000000000000004d + "'", double17 == 0.9000000000000004d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 58.5d + "'", double18 == 58.5d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.9000000000000004d + "'", double19 == 0.9000000000000004d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.9000000000000004d + "'", double20 == 0.9000000000000004d);
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
        jts.Envelope envelope4 = new jts.Envelope((double) 3L, 182.7d, 6.0d, 58.7d);
        envelope4.init(38.4d, (double) ' ', 29.2d, 26.0d);
        double double10 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.1999999999999993d + "'", double10 == 3.1999999999999993d);
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
        jts.Envelope envelope4 = new jts.Envelope(89.5d, 86.0d, 0.0d, 95.2d);
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getWidth();
        boolean boolean7 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.5d + "'", double5 == 3.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.5d + "'", double6 == 3.5d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
        jts.Envelope envelope4 = new jts.Envelope(42.0d, (double) (short) 1, (double) 9, (double) (-100L));
        double double5 = envelope4.getWidth();
        double double6 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 41.0d + "'", double5 == 41.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 109.0d + "'", double6 == 109.0d);
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
        jts.Envelope envelope4 = new jts.Envelope(8.7d, 84.6d, 99.0d, 68.7d);
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
        jts.Envelope envelope4 = new jts.Envelope(17.6d, (double) (byte) 1, (double) (byte) 100, (-10.5d));
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getHeight();
        envelope4.init(50.1d, 54.2d, 1.1999999999999886d, (double) 0);
        double double12 = envelope4.getWidth();
        double double13 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 110.5d + "'", double5 == 110.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 110.5d + "'", double6 == 110.5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.100000000000001d + "'", double12 == 4.100000000000001d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.1999999999999886d + "'", double13 == 1.1999999999999886d);
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
        jts.Envelope envelope4 = new jts.Envelope(92.7d, (double) (-10L), 1.2d, (double) (-8L));
        double double5 = envelope4.getWidth();
        envelope4.init(0.0d, 2.9000000000000004d, (double) (-6L), 184.1d);
        envelope4.init(5.6d, 45.0d, 53.3d, (-1.2d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.7d + "'", double5 == 102.7d);
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
        jts.Envelope envelope4 = new jts.Envelope((double) 1L, 0.0d, 96.7d, 0.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        double double6 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 96.7d + "'", double6 == 96.7d);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
        jts.Envelope envelope4 = new jts.Envelope((double) (-9), (double) (-9), (double) 8L, 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        envelope4.init(109.1d, (double) (-5), 22.3d, 106.0d);
        double double14 = envelope4.getHeight();
        double double15 = envelope4.getHeight();
        envelope4.init(94.60000000000001d, 38.0d, 84.5d, 4.000000000000005d);
        java.lang.Class<?> wildcardClass21 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 83.7d + "'", double14 == 83.7d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 83.7d + "'", double15 == 83.7d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }
}

