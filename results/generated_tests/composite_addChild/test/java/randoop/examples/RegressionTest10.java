package examples;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite1.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet12 = composite1.children();
        java.util.Set<examples.Composite> compositeSet13 = composite1.children();
        examples.Composite composite15 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        java.util.Set<examples.Composite> compositeSet19 = composite15.children();
        composite1.addChild(composite15);
        java.lang.Class<?> wildcardClass21 = composite15.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite3.children();
        java.util.Set<examples.Composite> compositeSet11 = composite3.children();
        examples.Composite composite13 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        java.util.Set<examples.Composite> compositeSet16 = composite13.children();
        composite3.addChild(composite13);
        examples.Composite composite19 = new examples.Composite((-100));
        examples.Composite composite21 = new examples.Composite((-3));
        composite19.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        java.util.Set<examples.Composite> compositeSet24 = composite21.children();
        examples.Composite composite26 = new examples.Composite((-9));
        composite21.addChild(composite26);
        java.util.Set<examples.Composite> compositeSet28 = composite26.children();
        examples.Composite composite30 = new examples.Composite((int) '4');
        composite26.addChild(composite30);
        examples.Composite composite33 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet34 = composite33.children();
        composite26.addChild(composite33);
        examples.Composite composite37 = new examples.Composite((-100));
        composite33.addChild(composite37);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet34);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        examples.Composite composite1 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite11 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        composite1.addChild(composite11);
        examples.Composite composite16 = new examples.Composite(1);
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        java.util.Set<examples.Composite> compositeSet20 = composite16.children();
        java.util.Set<examples.Composite> compositeSet21 = composite16.children();
        java.util.Set<examples.Composite> compositeSet22 = composite16.children();
        composite1.addChild(composite16);
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        examples.Composite composite1 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        java.util.Set<examples.Composite> compositeSet9 = composite4.children();
        java.util.Set<examples.Composite> compositeSet10 = composite4.children();
        java.util.Set<examples.Composite> compositeSet11 = composite4.children();
        java.util.Set<examples.Composite> compositeSet12 = composite4.children();
        java.util.Set<examples.Composite> compositeSet13 = composite4.children();
        java.util.Set<examples.Composite> compositeSet14 = composite4.children();
        java.util.Set<examples.Composite> compositeSet15 = composite4.children();
        java.lang.Class<?> wildcardClass16 = compositeSet15.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        examples.Composite composite1 = new examples.Composite((-4));
        examples.Composite composite3 = new examples.Composite((-100));
        examples.Composite composite5 = new examples.Composite((-3));
        composite3.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        java.util.Set<examples.Composite> compositeSet8 = composite5.children();
        java.util.Set<examples.Composite> compositeSet9 = composite5.children();
        java.util.Set<examples.Composite> compositeSet10 = composite5.children();
        examples.Composite composite12 = new examples.Composite((int) (short) 0);
        composite5.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet14 = composite5.children();
        java.util.Set<examples.Composite> compositeSet15 = composite5.children();
        java.util.Set<examples.Composite> compositeSet16 = composite5.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite((int) '4');
        composite8.addChild(composite12);
        examples.Composite composite15 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        composite8.addChild(composite15);
        examples.Composite composite19 = new examples.Composite((-100));
        composite15.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        examples.Composite composite23 = new examples.Composite((int) (byte) -1);
        composite19.addChild(composite23);
        examples.Composite composite26 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        java.util.Set<examples.Composite> compositeSet28 = composite26.children();
        java.util.Set<examples.Composite> compositeSet29 = composite26.children();
        examples.Composite composite31 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet32 = composite31.children();
        java.util.Set<examples.Composite> compositeSet33 = composite31.children();
        composite26.addChild(composite31);
        examples.Composite composite36 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet37 = composite36.children();
        composite26.addChild(composite36);
        java.util.Set<examples.Composite> compositeSet39 = composite36.children();
        java.util.Set<examples.Composite> compositeSet40 = composite36.children();
        java.util.Set<examples.Composite> compositeSet41 = composite36.children();
        // The following exception was thrown during execution in test generation
        try {
            composite19.addChild(composite36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet37);
        org.junit.Assert.assertNotNull(compositeSet39);
        org.junit.Assert.assertNotNull(compositeSet40);
        org.junit.Assert.assertNotNull(compositeSet41);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        examples.Composite composite13 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        java.util.Set<examples.Composite> compositeSet16 = composite13.children();
        java.util.Set<examples.Composite> compositeSet17 = composite13.children();
        java.util.Set<examples.Composite> compositeSet18 = composite13.children();
        java.util.Set<examples.Composite> compositeSet19 = composite13.children();
        composite1.addChild(composite13);
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        composite4.addChild(composite11);
        examples.Composite composite16 = new examples.Composite((-9));
        composite11.addChild(composite16);
        examples.Composite composite19 = new examples.Composite(9);
        composite16.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite16.children();
        java.util.Set<examples.Composite> compositeSet22 = composite16.children();
        java.util.Set<examples.Composite> compositeSet23 = composite16.children();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        examples.Composite composite1 = new examples.Composite(3);
        examples.Composite composite3 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        examples.Composite composite10 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        java.util.Set<examples.Composite> compositeSet14 = composite10.children();
        composite3.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet16 = composite3.children();
        java.util.Set<examples.Composite> compositeSet17 = composite3.children();
        examples.Composite composite19 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        examples.Composite composite22 = new examples.Composite(8);
        composite19.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        java.util.Set<examples.Composite> compositeSet26 = composite22.children();
        java.util.Set<examples.Composite> compositeSet27 = composite22.children();
        java.util.Set<examples.Composite> compositeSet28 = composite22.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        examples.Composite composite1 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-10));
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        java.util.Set<examples.Composite> compositeSet8 = composite5.children();
        java.lang.Class<?> wildcardClass9 = compositeSet8.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        composite4.addChild(composite11);
        examples.Composite composite16 = new examples.Composite((-9));
        composite11.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite11.children();
        examples.Composite composite20 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        java.util.Set<examples.Composite> compositeSet23 = composite20.children();
        java.util.Set<examples.Composite> compositeSet24 = composite20.children();
        composite11.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet26 = composite20.children();
        java.util.Set<examples.Composite> compositeSet27 = composite20.children();
        java.util.Set<examples.Composite> compositeSet28 = composite20.children();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        examples.Composite composite13 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        composite8.addChild(composite13);
        examples.Composite composite17 = new examples.Composite(4);
        composite13.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        java.util.Set<examples.Composite> compositeSet20 = composite17.children();
        java.util.Set<examples.Composite> compositeSet21 = composite17.children();
        java.lang.Class<?> wildcardClass22 = composite17.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        examples.Composite composite1 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        examples.Composite composite13 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        java.util.Set<examples.Composite> compositeSet16 = composite13.children();
        examples.Composite composite18 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        composite13.addChild(composite18);
        examples.Composite composite23 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        composite13.addChild(composite23);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite((int) '4');
        composite8.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet14 = composite8.children();
        java.util.Set<examples.Composite> compositeSet15 = composite8.children();
        examples.Composite composite17 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        composite8.addChild(composite17);
        examples.Composite composite22 = new examples.Composite(6);
        composite8.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        java.lang.Class<?> wildcardClass26 = compositeSet25.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        examples.Composite composite1 = new examples.Composite((-1));
        examples.Composite composite3 = new examples.Composite(100);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((int) (byte) 10);
        composite3.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        examples.Composite composite14 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        composite11.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet17 = composite11.children();
        java.util.Set<examples.Composite> compositeSet18 = composite11.children();
        java.util.Set<examples.Composite> compositeSet19 = composite11.children();
        examples.Composite composite21 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        composite11.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet25 = composite21.children();
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        examples.Composite composite1 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        examples.Composite composite7 = new examples.Composite(8);
        composite4.addChild(composite7);
        examples.Composite composite10 = new examples.Composite((int) (short) 0);
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        composite7.addChild(composite10);
        examples.Composite composite14 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        java.util.Set<examples.Composite> compositeSet18 = composite14.children();
        java.util.Set<examples.Composite> compositeSet19 = composite14.children();
        composite7.addChild(composite14);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        examples.Composite composite7 = new examples.Composite((int) (short) 0);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        composite4.addChild(composite7);
        examples.Composite composite11 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite7.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        java.util.Set<examples.Composite> compositeSet15 = composite11.children();
        examples.Composite composite17 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        java.util.Set<examples.Composite> compositeSet20 = composite17.children();
        examples.Composite composite22 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        composite17.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet26 = composite17.children();
        java.util.Set<examples.Composite> compositeSet27 = composite17.children();
        java.util.Set<examples.Composite> compositeSet28 = composite17.children();
        java.util.Set<examples.Composite> compositeSet29 = composite17.children();
        java.util.Set<examples.Composite> compositeSet30 = composite17.children();
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        examples.Composite composite1 = new examples.Composite(2);
        examples.Composite composite3 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.lang.Class<?> wildcardClass8 = compositeSet7.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        examples.Composite composite1 = new examples.Composite(2);
        examples.Composite composite3 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((-5));
        composite3.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite8.addChild(composite11);
        java.lang.Class<?> wildcardClass14 = composite11.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        examples.Composite composite1 = new examples.Composite((-10));
        examples.Composite composite3 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        java.util.Set<examples.Composite> compositeSet9 = composite3.children();
        java.util.Set<examples.Composite> compositeSet10 = composite3.children();
        java.util.Set<examples.Composite> compositeSet11 = composite3.children();
        java.util.Set<examples.Composite> compositeSet12 = composite3.children();
        java.util.Set<examples.Composite> compositeSet13 = composite3.children();
        java.util.Set<examples.Composite> compositeSet14 = composite3.children();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        examples.Composite composite1 = new examples.Composite(10);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(3);
        composite1.addChild(composite6);
        examples.Composite composite9 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        composite1.addChild(composite9);
        examples.Composite composite15 = new examples.Composite((-10));
        composite1.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        java.lang.Class<?> wildcardClass19 = compositeSet18.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite((int) '4');
        composite8.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet14 = composite8.children();
        java.util.Set<examples.Composite> compositeSet15 = composite8.children();
        examples.Composite composite17 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        composite8.addChild(composite17);
        examples.Composite composite22 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        composite17.addChild(composite22);
        examples.Composite composite27 = new examples.Composite((-10));
        composite22.addChild(composite27);
        java.util.Set<examples.Composite> compositeSet29 = composite27.children();
        java.lang.Class<?> wildcardClass30 = compositeSet29.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet11 = composite6.children();
        java.util.Set<examples.Composite> compositeSet12 = composite6.children();
        examples.Composite composite14 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        composite6.addChild(composite14);
        examples.Composite composite20 = new examples.Composite((-1));
        examples.Composite composite22 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        composite20.addChild(composite22);
        examples.Composite composite26 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        composite22.addChild(composite26);
        java.util.Set<examples.Composite> compositeSet29 = composite26.children();
        examples.Composite composite31 = new examples.Composite((int) (short) 10);
        java.util.Set<examples.Composite> compositeSet32 = composite31.children();
        composite26.addChild(composite31);
        // The following exception was thrown during execution in test generation
        try {
            composite14.addChild(composite31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet32);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite10 = new examples.Composite(10);
        composite6.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite6.children();
        java.util.Set<examples.Composite> compositeSet13 = composite6.children();
        java.lang.Class<?> wildcardClass14 = composite6.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite7 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        composite3.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet10 = composite3.children();
        java.lang.Class<?> wildcardClass11 = composite3.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        examples.Composite composite1 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        java.util.Set<examples.Composite> compositeSet9 = composite4.children();
        java.util.Set<examples.Composite> compositeSet10 = composite4.children();
        java.util.Set<examples.Composite> compositeSet11 = composite4.children();
        java.util.Set<examples.Composite> compositeSet12 = composite4.children();
        java.util.Set<examples.Composite> compositeSet13 = composite4.children();
        java.util.Set<examples.Composite> compositeSet14 = composite4.children();
        java.util.Set<examples.Composite> compositeSet15 = composite4.children();
        java.lang.Class<?> wildcardClass16 = composite4.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite(4);
        composite3.addChild(composite8);
        examples.Composite composite11 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        java.util.Set<examples.Composite> compositeSet15 = composite11.children();
        composite3.addChild(composite11);
        examples.Composite composite18 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        composite11.addChild(composite18);
        examples.Composite composite22 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        java.util.Set<examples.Composite> compositeSet26 = composite22.children();
        composite11.addChild(composite22);
        examples.Composite composite29 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet30 = composite29.children();
        java.util.Set<examples.Composite> compositeSet31 = composite29.children();
        composite11.addChild(composite29);
        java.util.Set<examples.Composite> compositeSet33 = composite29.children();
        java.util.Set<examples.Composite> compositeSet34 = composite29.children();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet34);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        composite4.addChild(composite11);
        examples.Composite composite16 = new examples.Composite((-9));
        composite11.addChild(composite16);
        examples.Composite composite19 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
        composite11.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet24 = composite11.children();
        examples.Composite composite25 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        examples.Composite composite1 = new examples.Composite((int) 'a');
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        examples.Composite composite6 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite3.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet10 = composite3.children();
        examples.Composite composite12 = new examples.Composite(4);
        composite3.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet14 = composite3.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet14);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        examples.Composite composite1 = new examples.Composite(9);
        examples.Composite composite3 = new examples.Composite((int) (short) 10);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        java.lang.Class<?> wildcardClass10 = composite6.getClass();
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        examples.Composite composite9 = new examples.Composite((-100));
        examples.Composite composite11 = new examples.Composite((-3));
        composite9.addChild(composite11);
        examples.Composite composite14 = new examples.Composite((-8));
        composite9.addChild(composite14);
        examples.Composite composite17 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        composite9.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet21 = composite17.children();
        java.util.Set<examples.Composite> compositeSet22 = composite17.children();
        examples.Composite composite24 = new examples.Composite((int) 'a');
        composite17.addChild(composite24);
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        examples.Composite composite1 = new examples.Composite((int) (short) 100);
        examples.Composite composite3 = new examples.Composite((int) (short) 0);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-100));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        examples.Composite composite15 = new examples.Composite((-9));
        composite10.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        examples.Composite composite19 = new examples.Composite((int) '4');
        composite15.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite15.children();
        java.util.Set<examples.Composite> compositeSet22 = composite15.children();
        java.util.Set<examples.Composite> compositeSet23 = composite15.children();
        java.util.Set<examples.Composite> compositeSet24 = composite15.children();
        examples.Composite composite26 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        java.util.Set<examples.Composite> compositeSet28 = composite26.children();
        java.util.Set<examples.Composite> compositeSet29 = composite26.children();
        composite15.addChild(composite26);
        java.util.Set<examples.Composite> compositeSet31 = composite26.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet31);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        java.util.Set<examples.Composite> compositeSet12 = composite1.children();
        java.util.Set<examples.Composite> compositeSet13 = composite1.children();
        java.util.Set<examples.Composite> compositeSet14 = composite1.children();
        java.lang.Class<?> wildcardClass15 = compositeSet14.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        examples.Composite composite1 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        java.util.Set<examples.Composite> compositeSet12 = composite1.children();
        java.util.Set<examples.Composite> compositeSet13 = composite1.children();
        java.util.Set<examples.Composite> compositeSet14 = composite1.children();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite1.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        examples.Composite composite14 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        examples.Composite composite17 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        composite14.addChild(composite17);
        examples.Composite composite21 = new examples.Composite((-2));
        composite14.addChild(composite21);
        examples.Composite composite24 = new examples.Composite(7);
        composite14.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet26 = composite14.children();
        examples.Composite composite28 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        composite14.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet31 = composite28.children();
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet31);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        examples.Composite composite1 = new examples.Composite(3);
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite((int) (byte) 1);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite1.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet12 = composite1.children();
        java.util.Set<examples.Composite> compositeSet13 = composite1.children();
        java.util.Set<examples.Composite> compositeSet14 = composite1.children();
        java.util.Set<examples.Composite> compositeSet15 = composite1.children();
        java.lang.Class<?> wildcardClass16 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        java.util.Set<examples.Composite> compositeSet12 = composite1.children();
        examples.Composite composite14 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        composite1.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        java.util.Set<examples.Composite> compositeSet18 = composite14.children();
        examples.Composite composite20 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        composite14.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet24 = composite14.children();
        java.util.Set<examples.Composite> compositeSet25 = composite14.children();
        java.util.Set<examples.Composite> compositeSet26 = composite14.children();
        java.lang.Class<?> wildcardClass27 = composite14.getClass();
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite11 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        composite1.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet16 = composite1.children();
        java.util.Set<examples.Composite> compositeSet17 = composite1.children();
        examples.Composite composite19 = new examples.Composite((int) (short) 10);
        composite1.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
        java.util.Set<examples.Composite> compositeSet23 = composite19.children();
        examples.Composite composite25 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        java.util.Set<examples.Composite> compositeSet27 = composite25.children();
        examples.Composite composite29 = new examples.Composite((int) (short) -1);
        java.util.Set<examples.Composite> compositeSet30 = composite29.children();
        composite25.addChild(composite29);
        java.util.Set<examples.Composite> compositeSet32 = composite29.children();
        // The following exception was thrown during execution in test generation
        try {
            composite19.addChild(composite29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet32);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite(2);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-5));
        examples.Composite composite8 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite6.addChild(composite8);
        examples.Composite composite12 = new examples.Composite(2);
        composite6.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        examples.Composite composite1 = new examples.Composite((-5));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        java.util.Set<examples.Composite> compositeSet8 = composite5.children();
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        examples.Composite composite13 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        composite1.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet17 = composite13.children();
        examples.Composite composite19 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
        composite13.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet24 = composite13.children();
        java.util.Set<examples.Composite> compositeSet25 = composite13.children();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((int) (short) -1);
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet8 = composite5.children();
        java.util.Set<examples.Composite> compositeSet9 = composite5.children();
        examples.Composite composite11 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        composite5.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet15 = composite5.children();
        java.lang.Class<?> wildcardClass16 = compositeSet15.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        examples.Composite composite1 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite(4);
        composite1.addChild(composite5);
        examples.Composite composite8 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        composite1.addChild(composite8);
        examples.Composite composite14 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        composite1.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet19 = composite1.children();
        examples.Composite composite21 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        composite1.addChild(composite21);
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        composite4.addChild(composite11);
        examples.Composite composite16 = new examples.Composite((-9));
        composite11.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite11.children();
        java.util.Set<examples.Composite> compositeSet19 = composite11.children();
        examples.Composite composite21 = new examples.Composite((-5));
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        examples.Composite composite25 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        java.util.Set<examples.Composite> compositeSet27 = composite25.children();
        java.util.Set<examples.Composite> compositeSet28 = composite25.children();
        composite21.addChild(composite25);
        java.util.Set<examples.Composite> compositeSet30 = composite21.children();
        java.util.Set<examples.Composite> compositeSet31 = composite21.children();
        examples.Composite composite33 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet34 = composite33.children();
        java.util.Set<examples.Composite> compositeSet35 = composite33.children();
        composite21.addChild(composite33);
        java.util.Set<examples.Composite> compositeSet37 = composite33.children();
        examples.Composite composite39 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet40 = composite39.children();
        java.util.Set<examples.Composite> compositeSet41 = composite39.children();
        java.util.Set<examples.Composite> compositeSet42 = composite39.children();
        composite33.addChild(composite39);
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet35);
        org.junit.Assert.assertNotNull(compositeSet37);
        org.junit.Assert.assertNotNull(compositeSet40);
        org.junit.Assert.assertNotNull(compositeSet41);
        org.junit.Assert.assertNotNull(compositeSet42);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite((int) '4');
        composite8.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet14 = composite8.children();
        java.util.Set<examples.Composite> compositeSet15 = composite8.children();
        examples.Composite composite17 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        composite8.addChild(composite17);
        examples.Composite composite22 = new examples.Composite((int) (short) 10);
        composite8.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite8.children();
        java.util.Set<examples.Composite> compositeSet25 = composite8.children();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        examples.Composite composite1 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite(4);
        composite1.addChild(composite5);
        examples.Composite composite8 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        composite1.addChild(composite8);
        examples.Composite composite14 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        composite8.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        java.util.Set<examples.Composite> compositeSet18 = composite14.children();
        java.util.Set<examples.Composite> compositeSet19 = composite14.children();
        java.util.Set<examples.Composite> compositeSet20 = composite14.children();
        java.util.Set<examples.Composite> compositeSet21 = composite14.children();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        examples.Composite composite7 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        composite4.addChild(composite7);
        examples.Composite composite11 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite7.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet14 = composite7.children();
        examples.Composite composite16 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        java.util.Set<examples.Composite> compositeSet20 = composite16.children();
        composite7.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet22 = composite7.children();
        examples.Composite composite24 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        composite7.addChild(composite24);
        java.lang.Class<?> wildcardClass28 = composite7.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite10 = new examples.Composite(10);
        composite6.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite6.children();
        java.util.Set<examples.Composite> compositeSet13 = composite6.children();
        java.util.Set<examples.Composite> compositeSet14 = composite6.children();
        java.util.Set<examples.Composite> compositeSet15 = composite6.children();
        examples.Composite composite17 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        examples.Composite composite20 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        composite17.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet24 = composite20.children();
        java.util.Set<examples.Composite> compositeSet25 = composite20.children();
        java.util.Set<examples.Composite> compositeSet26 = composite20.children();
        examples.Composite composite28 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        java.util.Set<examples.Composite> compositeSet30 = composite28.children();
        java.util.Set<examples.Composite> compositeSet31 = composite28.children();
        java.util.Set<examples.Composite> compositeSet32 = composite28.children();
        java.util.Set<examples.Composite> compositeSet33 = composite28.children();
        java.util.Set<examples.Composite> compositeSet34 = composite28.children();
        java.util.Set<examples.Composite> compositeSet35 = composite28.children();
        composite20.addChild(composite28);
        // The following exception was thrown during execution in test generation
        try {
            composite6.addChild(composite28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet35);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        examples.Composite composite10 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        java.util.Set<examples.Composite> compositeSet14 = composite10.children();
        java.util.Set<examples.Composite> compositeSet15 = composite10.children();
        java.util.Set<examples.Composite> compositeSet16 = composite10.children();
        java.util.Set<examples.Composite> compositeSet17 = composite10.children();
        composite3.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet19 = composite10.children();
        java.util.Set<examples.Composite> compositeSet20 = composite10.children();
        examples.Composite composite22 = new examples.Composite((int) (byte) 10);
        composite10.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite10.children();
        java.lang.Class<?> wildcardClass25 = compositeSet24.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        examples.Composite composite1 = new examples.Composite((-2));
        examples.Composite composite3 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        examples.Composite composite11 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        java.util.Set<examples.Composite> compositeSet15 = composite11.children();
        java.util.Set<examples.Composite> compositeSet16 = composite11.children();
        examples.Composite composite18 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        java.util.Set<examples.Composite> compositeSet21 = composite18.children();
        java.util.Set<examples.Composite> compositeSet22 = composite18.children();
        composite11.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet24 = composite11.children();
        java.util.Set<examples.Composite> compositeSet25 = composite11.children();
        java.util.Set<examples.Composite> compositeSet26 = composite11.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        examples.Composite composite1 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite(4);
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        java.util.Set<examples.Composite> compositeSet8 = composite5.children();
        java.util.Set<examples.Composite> compositeSet9 = composite5.children();
        java.lang.Class<?> wildcardClass10 = composite5.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite9 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-6));
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        java.util.Set<examples.Composite> compositeSet8 = composite5.children();
        java.util.Set<examples.Composite> compositeSet9 = composite5.children();
        java.util.Set<examples.Composite> compositeSet10 = composite5.children();
        java.util.Set<examples.Composite> compositeSet11 = composite5.children();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite9 = new examples.Composite((int) (short) 1);
        composite4.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        examples.Composite composite13 = new examples.Composite((-1));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        composite9.addChild(composite13);
        examples.Composite composite17 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        examples.Composite composite20 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        composite17.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet23 = composite17.children();
        java.util.Set<examples.Composite> compositeSet24 = composite17.children();
        // The following exception was thrown during execution in test generation
        try {
            composite13.addChild(composite17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        examples.Composite composite7 = new examples.Composite((int) (byte) 10);
        composite1.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        java.util.Set<examples.Composite> compositeSet10 = composite7.children();
        examples.Composite composite12 = new examples.Composite((int) '4');
        examples.Composite composite14 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        composite12.addChild(composite14);
        examples.Composite composite19 = new examples.Composite((int) (byte) 100);
        composite12.addChild(composite19);
        // The following exception was thrown during execution in test generation
        try {
            composite7.addChild(composite12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        examples.Composite composite1 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        examples.Composite composite7 = new examples.Composite(9);
        composite1.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        examples.Composite composite13 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        examples.Composite composite16 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        composite13.addChild(composite16);
        examples.Composite composite20 = new examples.Composite((-2));
        composite13.addChild(composite20);
        examples.Composite composite23 = new examples.Composite(7);
        composite13.addChild(composite23);
        java.util.Set<examples.Composite> compositeSet25 = composite13.children();
        java.util.Set<examples.Composite> compositeSet26 = composite13.children();
        examples.Composite composite28 = new examples.Composite(1);
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        java.util.Set<examples.Composite> compositeSet30 = composite28.children();
        java.util.Set<examples.Composite> compositeSet31 = composite28.children();
        composite13.addChild(composite28);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet31);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite11 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        composite1.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet16 = composite1.children();
        java.util.Set<examples.Composite> compositeSet17 = composite1.children();
        examples.Composite composite19 = new examples.Composite((int) (short) 10);
        composite1.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
        java.util.Set<examples.Composite> compositeSet23 = composite19.children();
        java.util.Set<examples.Composite> compositeSet24 = composite19.children();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        examples.Composite composite1 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(10);
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        examples.Composite composite9 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite9.addChild(composite12);
        examples.Composite composite16 = new examples.Composite((-2));
        composite9.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        java.util.Set<examples.Composite> compositeSet20 = composite16.children();
        java.util.Set<examples.Composite> compositeSet21 = composite16.children();
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        composite8.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet16 = composite12.children();
        java.util.Set<examples.Composite> compositeSet17 = composite12.children();
        java.util.Set<examples.Composite> compositeSet18 = composite12.children();
        java.lang.Class<?> wildcardClass19 = compositeSet18.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        examples.Composite composite1 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((int) (byte) 1);
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        examples.Composite composite11 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        examples.Composite composite14 = new examples.Composite(8);
        composite11.addChild(composite14);
        examples.Composite composite17 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        composite14.addChild(composite17);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(3);
        composite1.addChild(composite6);
        examples.Composite composite9 = new examples.Composite(5);
        composite6.addChild(composite9);
        examples.Composite composite12 = new examples.Composite((-1));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite9.addChild(composite12);
        examples.Composite composite16 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        java.util.Set<examples.Composite> compositeSet20 = composite16.children();
        composite9.addChild(composite16);
        examples.Composite composite23 = new examples.Composite((-100));
        examples.Composite composite25 = new examples.Composite((-3));
        composite23.addChild(composite25);
        examples.Composite composite28 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        java.util.Set<examples.Composite> compositeSet30 = composite28.children();
        java.util.Set<examples.Composite> compositeSet31 = composite28.children();
        composite23.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet33 = composite23.children();
        java.util.Set<examples.Composite> compositeSet34 = composite23.children();
        examples.Composite composite36 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet37 = composite36.children();
        composite23.addChild(composite36);
        // The following exception was thrown during execution in test generation
        try {
            composite16.addChild(composite36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet37);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        composite1.addChild(composite5);
        examples.Composite composite10 = new examples.Composite((-2));
        composite1.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((int) '#');
        composite4.addChild(composite11);
        examples.Composite composite14 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        composite4.addChild(composite14);
        examples.Composite composite18 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        java.util.Set<examples.Composite> compositeSet21 = composite18.children();
        composite4.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet23 = composite4.children();
        java.lang.Class<?> wildcardClass24 = composite4.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite7 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        composite1.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet11 = composite7.children();
        java.util.Set<examples.Composite> compositeSet12 = composite7.children();
        java.lang.Class<?> wildcardClass13 = composite7.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        examples.Composite composite1 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite(4);
        composite1.addChild(composite5);
        examples.Composite composite8 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        composite1.addChild(composite8);
        examples.Composite composite14 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        composite1.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet19 = composite1.children();
        java.util.Set<examples.Composite> compositeSet20 = composite1.children();
        examples.Composite composite22 = new examples.Composite((int) '4');
        examples.Composite composite24 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        composite22.addChild(composite24);
        examples.Composite composite29 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet30 = composite29.children();
        composite22.addChild(composite29);
        examples.Composite composite33 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet34 = composite33.children();
        composite29.addChild(composite33);
        examples.Composite composite37 = new examples.Composite((-4));
        composite29.addChild(composite37);
        examples.Composite composite40 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet41 = composite40.children();
        composite37.addChild(composite40);
        java.util.Set<examples.Composite> compositeSet43 = composite37.children();
        java.util.Set<examples.Composite> compositeSet44 = composite37.children();
        java.util.Set<examples.Composite> compositeSet45 = composite37.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet41);
        org.junit.Assert.assertNotNull(compositeSet43);
        org.junit.Assert.assertNotNull(compositeSet44);
        org.junit.Assert.assertNotNull(compositeSet45);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite(4);
        composite3.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((int) (short) 100);
        composite8.addChild(composite11);
        examples.Composite composite14 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        examples.Composite composite19 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        composite14.addChild(composite19);
        examples.Composite composite24 = new examples.Composite((-8));
        composite14.addChild(composite24);
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-2));
        composite1.addChild(composite8);
        examples.Composite composite11 = new examples.Composite(7);
        composite1.addChild(composite11);
        examples.Composite composite14 = new examples.Composite((-100));
        examples.Composite composite16 = new examples.Composite((-3));
        composite14.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        examples.Composite composite20 = new examples.Composite((-9));
        composite16.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        java.util.Set<examples.Composite> compositeSet23 = composite20.children();
        examples.Composite composite25 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        composite20.addChild(composite25);
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        java.util.Set<examples.Composite> compositeSet12 = composite1.children();
        examples.Composite composite14 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        composite1.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        java.util.Set<examples.Composite> compositeSet18 = composite14.children();
        examples.Composite composite20 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        composite14.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet24 = composite14.children();
        examples.Composite composite26 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        examples.Composite composite29 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet30 = composite29.children();
        composite26.addChild(composite29);
        java.util.Set<examples.Composite> compositeSet32 = composite26.children();
        examples.Composite composite34 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet35 = composite34.children();
        composite26.addChild(composite34);
        java.util.Set<examples.Composite> compositeSet37 = composite34.children();
        java.util.Set<examples.Composite> compositeSet38 = composite34.children();
        // The following exception was thrown during execution in test generation
        try {
            composite14.addChild(composite34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet35);
        org.junit.Assert.assertNotNull(compositeSet37);
        org.junit.Assert.assertNotNull(compositeSet38);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        composite8.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet16 = composite12.children();
        java.util.Set<examples.Composite> compositeSet17 = composite12.children();
        examples.Composite composite19 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
        composite12.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet24 = composite19.children();
        examples.Composite composite26 = new examples.Composite((-100));
        examples.Composite composite28 = new examples.Composite((-3));
        composite26.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet30 = composite28.children();
        java.util.Set<examples.Composite> compositeSet31 = composite28.children();
        examples.Composite composite33 = new examples.Composite((-9));
        composite28.addChild(composite33);
        java.util.Set<examples.Composite> compositeSet35 = composite33.children();
        examples.Composite composite37 = new examples.Composite((int) '4');
        composite33.addChild(composite37);
        java.util.Set<examples.Composite> compositeSet39 = composite33.children();
        java.util.Set<examples.Composite> compositeSet40 = composite33.children();
        examples.Composite composite42 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet43 = composite42.children();
        java.util.Set<examples.Composite> compositeSet44 = composite42.children();
        composite33.addChild(composite42);
        examples.Composite composite47 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet48 = composite47.children();
        java.util.Set<examples.Composite> compositeSet49 = composite47.children();
        composite42.addChild(composite47);
        java.util.Set<examples.Composite> compositeSet51 = composite47.children();
        java.util.Set<examples.Composite> compositeSet52 = composite47.children();
        // The following exception was thrown during execution in test generation
        try {
            composite19.addChild(composite47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet35);
        org.junit.Assert.assertNotNull(compositeSet39);
        org.junit.Assert.assertNotNull(compositeSet40);
        org.junit.Assert.assertNotNull(compositeSet43);
        org.junit.Assert.assertNotNull(compositeSet44);
        org.junit.Assert.assertNotNull(compositeSet48);
        org.junit.Assert.assertNotNull(compositeSet49);
        org.junit.Assert.assertNotNull(compositeSet51);
        org.junit.Assert.assertNotNull(compositeSet52);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite1.addChild(composite8);
        examples.Composite composite12 = new examples.Composite(8);
        composite8.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        java.util.Set<examples.Composite> compositeSet16 = composite12.children();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite(4);
        composite3.addChild(composite8);
        examples.Composite composite11 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        java.util.Set<examples.Composite> compositeSet15 = composite11.children();
        composite3.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet17 = composite11.children();
        java.util.Set<examples.Composite> compositeSet18 = composite11.children();
        java.lang.Class<?> wildcardClass19 = compositeSet18.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-7));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite3.children();
        java.util.Set<examples.Composite> compositeSet11 = composite3.children();
        java.util.Set<examples.Composite> compositeSet12 = composite3.children();
        java.util.Set<examples.Composite> compositeSet13 = composite3.children();
        examples.Composite composite15 = new examples.Composite((-9));
        examples.Composite composite17 = new examples.Composite((int) (byte) 1);
        composite15.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet19 = composite15.children();
        java.util.Set<examples.Composite> compositeSet20 = composite15.children();
        java.util.Set<examples.Composite> compositeSet21 = composite15.children();
        java.util.Set<examples.Composite> compositeSet22 = composite15.children();
        java.util.Set<examples.Composite> compositeSet23 = composite15.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite11 = new examples.Composite(1);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        composite6.addChild(composite11);
        examples.Composite composite16 = new examples.Composite((-100));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        java.util.Set<examples.Composite> compositeSet21 = composite18.children();
        examples.Composite composite23 = new examples.Composite((-9));
        composite18.addChild(composite23);
        java.util.Set<examples.Composite> compositeSet25 = composite23.children();
        examples.Composite composite27 = new examples.Composite((int) '4');
        composite23.addChild(composite27);
        java.util.Set<examples.Composite> compositeSet29 = composite23.children();
        java.util.Set<examples.Composite> compositeSet30 = composite23.children();
        java.util.Set<examples.Composite> compositeSet31 = composite23.children();
        java.util.Set<examples.Composite> compositeSet32 = composite23.children();
        examples.Composite composite34 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet35 = composite34.children();
        java.util.Set<examples.Composite> compositeSet36 = composite34.children();
        java.util.Set<examples.Composite> compositeSet37 = composite34.children();
        composite23.addChild(composite34);
        examples.Composite composite40 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet41 = composite40.children();
        composite34.addChild(composite40);
        java.util.Set<examples.Composite> compositeSet43 = composite34.children();
        java.util.Set<examples.Composite> compositeSet44 = composite34.children();
        java.util.Set<examples.Composite> compositeSet45 = composite34.children();
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet35);
        org.junit.Assert.assertNotNull(compositeSet36);
        org.junit.Assert.assertNotNull(compositeSet37);
        org.junit.Assert.assertNotNull(compositeSet41);
        org.junit.Assert.assertNotNull(compositeSet43);
        org.junit.Assert.assertNotNull(compositeSet44);
        org.junit.Assert.assertNotNull(compositeSet45);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        examples.Composite composite11 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        composite1.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet15 = composite1.children();
        examples.Composite composite16 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite11 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        composite1.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet16 = composite1.children();
        java.util.Set<examples.Composite> compositeSet17 = composite1.children();
        examples.Composite composite19 = new examples.Composite((int) (short) 10);
        composite1.addChild(composite19);
        examples.Composite composite22 = new examples.Composite(3);
        composite19.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite19.children();
        examples.Composite composite26 = new examples.Composite((-7));
        composite19.addChild(composite26);
        java.util.Set<examples.Composite> compositeSet28 = composite19.children();
        java.lang.Class<?> wildcardClass29 = compositeSet28.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        examples.Composite composite1 = new examples.Composite((-5));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        java.util.Set<examples.Composite> compositeSet8 = composite5.children();
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        java.lang.Class<?> wildcardClass11 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        examples.Composite composite1 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite(0);
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite10 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        examples.Composite composite13 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        composite10.addChild(composite13);
        examples.Composite composite17 = new examples.Composite((-3));
        composite13.addChild(composite17);
        examples.Composite composite20 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        composite13.addChild(composite20);
        examples.Composite composite25 = new examples.Composite((-9));
        composite20.addChild(composite25);
        examples.Composite composite28 = new examples.Composite(9);
        composite25.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet30 = composite25.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet30);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite((int) '4');
        composite8.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet14 = composite8.children();
        java.util.Set<examples.Composite> compositeSet15 = composite8.children();
        examples.Composite composite17 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        composite8.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet21 = composite8.children();
        java.util.Set<examples.Composite> compositeSet22 = composite8.children();
        examples.Composite composite24 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        examples.Composite composite27 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet28 = composite27.children();
        java.util.Set<examples.Composite> compositeSet29 = composite27.children();
        composite24.addChild(composite27);
        examples.Composite composite32 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet33 = composite32.children();
        java.util.Set<examples.Composite> compositeSet34 = composite32.children();
        composite27.addChild(composite32);
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet34);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-2));
        composite1.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite8.addChild(composite12);
        examples.Composite composite16 = new examples.Composite((-2));
        composite8.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        examples.Composite composite20 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        java.util.Set<examples.Composite> compositeSet23 = composite20.children();
        java.util.Set<examples.Composite> compositeSet24 = composite20.children();
        composite16.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet26 = composite20.children();
        examples.Composite composite28 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        examples.Composite composite31 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet32 = composite31.children();
        java.util.Set<examples.Composite> compositeSet33 = composite31.children();
        composite28.addChild(composite31);
        java.util.Set<examples.Composite> compositeSet35 = composite31.children();
        java.util.Set<examples.Composite> compositeSet36 = composite31.children();
        // The following exception was thrown during execution in test generation
        try {
            composite20.addChild(composite31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet35);
        org.junit.Assert.assertNotNull(compositeSet36);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-9));
        composite3.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite3.children();
        java.util.Set<examples.Composite> compositeSet10 = composite3.children();
        java.util.Set<examples.Composite> compositeSet11 = composite3.children();
        java.util.Set<examples.Composite> compositeSet12 = composite3.children();
        java.util.Set<examples.Composite> compositeSet13 = composite3.children();
        examples.Composite composite15 = new examples.Composite((int) (short) 10);
        examples.Composite composite17 = new examples.Composite((int) (short) 1);
        composite15.addChild(composite17);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        examples.Composite composite1 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        examples.Composite composite7 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        composite4.addChild(composite7);
        examples.Composite composite11 = new examples.Composite((-3));
        composite7.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        examples.Composite composite15 = new examples.Composite((int) '#');
        composite11.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        examples.Composite composite1 = new examples.Composite(5);
        examples.Composite composite3 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        java.util.Set<examples.Composite> compositeSet9 = composite3.children();
        examples.Composite composite11 = new examples.Composite(7);
        composite3.addChild(composite11);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((int) '#');
        composite4.addChild(composite11);
        examples.Composite composite14 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        composite4.addChild(composite14);
        examples.Composite composite18 = new examples.Composite((int) '#');
        composite14.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet20 = composite14.children();
        examples.Composite composite22 = new examples.Composite((-100));
        examples.Composite composite24 = new examples.Composite((-3));
        composite22.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        java.util.Set<examples.Composite> compositeSet27 = composite24.children();
        examples.Composite composite29 = new examples.Composite(4);
        composite24.addChild(composite29);
        examples.Composite composite32 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet33 = composite32.children();
        java.util.Set<examples.Composite> compositeSet34 = composite32.children();
        java.util.Set<examples.Composite> compositeSet35 = composite32.children();
        java.util.Set<examples.Composite> compositeSet36 = composite32.children();
        composite24.addChild(composite32);
        // The following exception was thrown during execution in test generation
        try {
            composite14.addChild(composite32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet35);
        org.junit.Assert.assertNotNull(compositeSet36);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite(4);
        composite3.addChild(composite8);
        examples.Composite composite11 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        java.util.Set<examples.Composite> compositeSet15 = composite11.children();
        composite3.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet17 = composite11.children();
        java.lang.Class<?> wildcardClass18 = compositeSet17.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-2));
        composite1.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        examples.Composite composite12 = new examples.Composite(6);
        composite1.addChild(composite12);
        examples.Composite composite15 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        composite1.addChild(composite15);
        examples.Composite composite19 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        examples.Composite composite23 = new examples.Composite(4);
        composite19.addChild(composite23);
        examples.Composite composite26 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        java.util.Set<examples.Composite> compositeSet28 = composite26.children();
        java.util.Set<examples.Composite> compositeSet29 = composite26.children();
        composite19.addChild(composite26);
        examples.Composite composite32 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet33 = composite32.children();
        java.util.Set<examples.Composite> compositeSet34 = composite32.children();
        java.util.Set<examples.Composite> compositeSet35 = composite32.children();
        composite19.addChild(composite32);
        java.util.Set<examples.Composite> compositeSet37 = composite19.children();
        examples.Composite composite39 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet40 = composite39.children();
        composite19.addChild(composite39);
        // The following exception was thrown during execution in test generation
        try {
            composite15.addChild(composite19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet35);
        org.junit.Assert.assertNotNull(compositeSet37);
        org.junit.Assert.assertNotNull(compositeSet40);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet10 = composite6.children();
        java.util.Set<examples.Composite> compositeSet11 = composite6.children();
        java.util.Set<examples.Composite> compositeSet12 = composite6.children();
        examples.Composite composite14 = new examples.Composite((int) '4');
        examples.Composite composite16 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        composite14.addChild(composite16);
        examples.Composite composite21 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        composite14.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet24 = composite14.children();
        java.util.Set<examples.Composite> compositeSet25 = composite14.children();
        java.util.Set<examples.Composite> compositeSet26 = composite14.children();
        // The following exception was thrown during execution in test generation
        try {
            composite6.addChild(composite14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite10 = new examples.Composite(1);
        composite1.addChild(composite10);
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite12 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        java.util.Set<examples.Composite> compositeSet16 = composite12.children();
        java.util.Set<examples.Composite> compositeSet17 = composite12.children();
        composite6.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet19 = composite12.children();
        examples.Composite composite20 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite12.addChild(composite20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-2));
        composite1.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        examples.Composite composite12 = new examples.Composite(6);
        composite1.addChild(composite12);
        examples.Composite composite15 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        composite1.addChild(composite15);
        examples.Composite composite19 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        examples.Composite composite23 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        java.util.Set<examples.Composite> compositeSet25 = composite23.children();
        composite19.addChild(composite23);
        java.util.Set<examples.Composite> compositeSet27 = composite23.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet27);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite3.children();
        examples.Composite composite12 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite3.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.lang.Class<?> wildcardClass5 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        examples.Composite composite1 = new examples.Composite((int) (short) 0);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        java.util.Set<examples.Composite> compositeSet8 = composite5.children();
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((int) (short) -1);
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet8 = composite5.children();
        java.util.Set<examples.Composite> compositeSet9 = composite5.children();
        java.lang.Class<?> wildcardClass10 = compositeSet9.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        composite1.addChild(composite5);
        examples.Composite composite10 = new examples.Composite((-2));
        composite1.addChild(composite10);
        java.lang.Class<?> wildcardClass12 = composite10.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        examples.Composite composite1 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        examples.Composite composite7 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        java.util.Set<examples.Composite> compositeSet10 = composite7.children();
        java.util.Set<examples.Composite> compositeSet11 = composite7.children();
        composite1.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet13 = composite7.children();
        examples.Composite composite15 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        composite7.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet19 = composite15.children();
        java.util.Set<examples.Composite> compositeSet20 = composite15.children();
        java.lang.Class<?> wildcardClass21 = composite15.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        examples.Composite composite1 = new examples.Composite((-2));
        examples.Composite composite3 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite9 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite3.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet12 = composite3.children();
        examples.Composite composite14 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        composite3.addChild(composite14);
        java.lang.Class<?> wildcardClass19 = composite3.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        composite4.addChild(composite11);
        examples.Composite composite16 = new examples.Composite((-9));
        composite11.addChild(composite16);
        examples.Composite composite19 = new examples.Composite(9);
        composite16.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite16.children();
        java.util.Set<examples.Composite> compositeSet22 = composite16.children();
        examples.Composite composite24 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        java.util.Set<examples.Composite> compositeSet27 = composite24.children();
        composite16.addChild(composite24);
        examples.Composite composite30 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet31 = composite30.children();
        examples.Composite composite33 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet34 = composite33.children();
        composite30.addChild(composite33);
        examples.Composite composite37 = new examples.Composite((-3));
        composite33.addChild(composite37);
        examples.Composite composite40 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet41 = composite40.children();
        java.util.Set<examples.Composite> compositeSet42 = composite40.children();
        composite33.addChild(composite40);
        examples.Composite composite45 = new examples.Composite((-9));
        composite40.addChild(composite45);
        java.util.Set<examples.Composite> compositeSet47 = composite40.children();
        java.util.Set<examples.Composite> compositeSet48 = composite40.children();
        examples.Composite composite50 = new examples.Composite((int) (byte) 100);
        composite40.addChild(composite50);
        java.util.Set<examples.Composite> compositeSet52 = composite40.children();
        // The following exception was thrown during execution in test generation
        try {
            composite24.addChild(composite40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet41);
        org.junit.Assert.assertNotNull(compositeSet42);
        org.junit.Assert.assertNotNull(compositeSet47);
        org.junit.Assert.assertNotNull(compositeSet48);
        org.junit.Assert.assertNotNull(compositeSet52);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite(1);
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        composite4.addChild(composite8);
        examples.Composite composite14 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        examples.Composite composite17 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        composite14.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet20 = composite17.children();
        examples.Composite composite22 = new examples.Composite(100);
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        composite17.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        java.util.Set<examples.Composite> compositeSet26 = composite22.children();
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-2));
        composite1.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite1.addChild(composite11);
        examples.Composite composite15 = new examples.Composite(6);
        composite1.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        java.util.Set<examples.Composite> compositeSet19 = composite15.children();
        examples.Composite composite20 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite15.addChild(composite20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        examples.Composite composite1 = new examples.Composite(100);
        examples.Composite composite3 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        examples.Composite composite1 = new examples.Composite((-5));
        examples.Composite composite3 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite((-100));
        examples.Composite composite11 = new examples.Composite((-3));
        composite9.addChild(composite11);
        examples.Composite composite14 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        composite9.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet19 = composite14.children();
        java.util.Set<examples.Composite> compositeSet20 = composite14.children();
        java.util.Set<examples.Composite> compositeSet21 = composite14.children();
        java.util.Set<examples.Composite> compositeSet22 = composite14.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(3);
        composite1.addChild(composite6);
        examples.Composite composite9 = new examples.Composite(5);
        composite6.addChild(composite9);
        examples.Composite composite12 = new examples.Composite((-1));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite9.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        java.util.Set<examples.Composite> compositeSet16 = composite12.children();
        examples.Composite composite18 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        composite12.addChild(composite18);
        java.lang.Class<?> wildcardClass22 = composite18.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-9));
        composite3.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite3.children();
        java.lang.Class<?> wildcardClass10 = compositeSet9.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-2));
        composite1.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        examples.Composite composite12 = new examples.Composite((-100));
        examples.Composite composite14 = new examples.Composite((-3));
        composite12.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        examples.Composite composite19 = new examples.Composite((-9));
        composite14.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        examples.Composite composite23 = new examples.Composite((int) '4');
        composite19.addChild(composite23);
        examples.Composite composite26 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        composite19.addChild(composite26);
        examples.Composite composite30 = new examples.Composite((-100));
        composite26.addChild(composite30);
        java.util.Set<examples.Composite> compositeSet32 = composite26.children();
        java.util.Set<examples.Composite> compositeSet33 = composite26.children();
        java.util.Set<examples.Composite> compositeSet34 = composite26.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet34);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        examples.Composite composite1 = new examples.Composite(9);
        examples.Composite composite3 = new examples.Composite((int) (short) 10);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        examples.Composite composite7 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        composite1.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite((int) '4');
        composite8.addChild(composite12);
        examples.Composite composite15 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        composite8.addChild(composite15);
        examples.Composite composite19 = new examples.Composite((-100));
        composite15.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        examples.Composite composite23 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        examples.Composite composite26 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        composite23.addChild(composite26);
        java.util.Set<examples.Composite> compositeSet29 = composite23.children();
        examples.Composite composite31 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet32 = composite31.children();
        composite23.addChild(composite31);
        // The following exception was thrown during execution in test generation
        try {
            composite19.addChild(composite31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet32);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        examples.Composite composite1 = new examples.Composite(5);
        examples.Composite composite3 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite10 = new examples.Composite((int) (byte) 1);
        examples.Composite composite12 = new examples.Composite(2);
        composite10.addChild(composite12);
        examples.Composite composite15 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        composite12.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet19 = composite15.children();
        java.util.Set<examples.Composite> compositeSet20 = composite15.children();
        java.util.Set<examples.Composite> compositeSet21 = composite15.children();
        java.util.Set<examples.Composite> compositeSet22 = composite15.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        examples.Composite composite1 = new examples.Composite((-3));
        examples.Composite composite3 = new examples.Composite((-100));
        examples.Composite composite5 = new examples.Composite((-3));
        composite3.addChild(composite5);
        examples.Composite composite8 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet13 = composite3.children();
        java.util.Set<examples.Composite> compositeSet14 = composite3.children();
        examples.Composite composite16 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        composite3.addChild(composite16);
        examples.Composite composite20 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        composite3.addChild(composite20);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        examples.Composite composite1 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        examples.Composite composite8 = new examples.Composite(9);
        examples.Composite composite10 = new examples.Composite((int) (short) 10);
        composite8.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        java.util.Set<examples.Composite> compositeSet14 = composite10.children();
        examples.Composite composite16 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        composite10.addChild(composite16);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite1.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        examples.Composite composite13 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        examples.Composite composite16 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        composite13.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet20 = composite16.children();
        java.util.Set<examples.Composite> compositeSet21 = composite16.children();
        java.util.Set<examples.Composite> compositeSet22 = composite16.children();
        java.util.Set<examples.Composite> compositeSet23 = composite16.children();
        java.util.Set<examples.Composite> compositeSet24 = composite16.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-2));
        composite1.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite8.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet15 = composite8.children();
        examples.Composite composite17 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        composite8.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet20 = composite17.children();
        java.util.Set<examples.Composite> compositeSet21 = composite17.children();
        java.util.Set<examples.Composite> compositeSet22 = composite17.children();
        java.util.Set<examples.Composite> compositeSet23 = composite17.children();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-2));
        composite1.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite1.addChild(composite11);
        examples.Composite composite15 = new examples.Composite(6);
        composite1.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        java.util.Set<examples.Composite> compositeSet19 = composite15.children();
        examples.Composite composite21 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        examples.Composite composite24 = new examples.Composite(8);
        composite21.addChild(composite24);
        examples.Composite composite27 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet28 = composite27.children();
        composite24.addChild(composite27);
        // The following exception was thrown during execution in test generation
        try {
            composite15.addChild(composite27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        examples.Composite composite1 = new examples.Composite(3);
        examples.Composite composite3 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        examples.Composite composite10 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        java.util.Set<examples.Composite> compositeSet14 = composite10.children();
        composite3.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet16 = composite3.children();
        java.util.Set<examples.Composite> compositeSet17 = composite3.children();
        java.lang.Class<?> wildcardClass18 = composite3.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        composite4.addChild(composite11);
        examples.Composite composite16 = new examples.Composite((-100));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        java.util.Set<examples.Composite> compositeSet21 = composite18.children();
        examples.Composite composite23 = new examples.Composite((-9));
        composite18.addChild(composite23);
        java.util.Set<examples.Composite> compositeSet25 = composite23.children();
        examples.Composite composite27 = new examples.Composite((int) '4');
        composite23.addChild(composite27);
        java.util.Set<examples.Composite> compositeSet29 = composite23.children();
        java.util.Set<examples.Composite> compositeSet30 = composite23.children();
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((int) '#');
        composite4.addChild(composite11);
        examples.Composite composite14 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        composite4.addChild(composite14);
        examples.Composite composite18 = new examples.Composite((int) '#');
        composite14.addChild(composite18);
        java.lang.Class<?> wildcardClass20 = composite18.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        examples.Composite composite1 = new examples.Composite((-5));
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite7 = new examples.Composite(2);
        composite1.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        examples.Composite composite11 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        java.util.Set<examples.Composite> compositeSet15 = composite11.children();
        examples.Composite composite17 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        java.util.Set<examples.Composite> compositeSet20 = composite17.children();
        java.util.Set<examples.Composite> compositeSet21 = composite17.children();
        composite11.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet23 = composite17.children();
        java.util.Set<examples.Composite> compositeSet24 = composite17.children();
        java.util.Set<examples.Composite> compositeSet25 = composite17.children();
        java.util.Set<examples.Composite> compositeSet26 = composite17.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        examples.Composite composite8 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        java.util.Set<examples.Composite> compositeSet12 = composite8.children();
        composite1.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet14 = composite1.children();
        java.util.Set<examples.Composite> compositeSet15 = composite1.children();
        java.util.Set<examples.Composite> compositeSet16 = composite1.children();
        java.lang.Class<?> wildcardClass17 = compositeSet16.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        examples.Composite composite7 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        composite4.addChild(composite7);
        examples.Composite composite11 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        java.util.Set<examples.Composite> compositeSet15 = composite11.children();
        java.util.Set<examples.Composite> compositeSet16 = composite11.children();
        composite7.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet18 = composite11.children();
        examples.Composite composite20 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        examples.Composite composite23 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        composite20.addChild(composite23);
        examples.Composite composite27 = new examples.Composite((-3));
        composite23.addChild(composite27);
        java.util.Set<examples.Composite> compositeSet29 = composite27.children();
        examples.Composite composite31 = new examples.Composite((int) '#');
        composite27.addChild(composite31);
        java.util.Set<examples.Composite> compositeSet33 = composite31.children();
        java.util.Set<examples.Composite> compositeSet34 = composite31.children();
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet34);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        examples.Composite composite1 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        examples.Composite composite8 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        examples.Composite composite11 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite8.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        examples.Composite composite16 = new examples.Composite(100);
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        composite11.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        java.util.Set<examples.Composite> compositeSet20 = composite16.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        examples.Composite composite1 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        examples.Composite composite7 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        composite1.addChild(composite7);
        examples.Composite composite11 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        composite7.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet16 = composite11.children();
        examples.Composite composite18 = new examples.Composite((-100));
        examples.Composite composite20 = new examples.Composite((-3));
        composite18.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        java.util.Set<examples.Composite> compositeSet23 = composite20.children();
        examples.Composite composite25 = new examples.Composite((-9));
        composite20.addChild(composite25);
        java.util.Set<examples.Composite> compositeSet27 = composite25.children();
        examples.Composite composite29 = new examples.Composite((int) '4');
        composite25.addChild(composite29);
        examples.Composite composite32 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet33 = composite32.children();
        composite25.addChild(composite32);
        examples.Composite composite36 = new examples.Composite((-100));
        composite32.addChild(composite36);
        java.util.Set<examples.Composite> compositeSet38 = composite36.children();
        examples.Composite composite40 = new examples.Composite((int) (byte) -1);
        composite36.addChild(composite40);
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet38);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite11 = new examples.Composite(1);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        examples.Composite composite14 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        java.util.Set<examples.Composite> compositeSet18 = composite14.children();
        java.util.Set<examples.Composite> compositeSet19 = composite14.children();
        composite11.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet21 = composite11.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        composite8.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet16 = composite12.children();
        examples.Composite composite18 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        composite12.addChild(composite18);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        examples.Composite composite1 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-10));
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        java.util.Set<examples.Composite> compositeSet8 = composite5.children();
        examples.Composite composite10 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        composite5.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet14 = composite5.children();
        examples.Composite composite15 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite5.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite3.children();
        java.util.Set<examples.Composite> compositeSet11 = composite3.children();
        java.util.Set<examples.Composite> compositeSet12 = composite3.children();
        examples.Composite composite14 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        examples.Composite composite17 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        composite14.addChild(composite17);
        examples.Composite composite22 = new examples.Composite((int) (short) 1);
        composite17.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        examples.Composite composite26 = new examples.Composite((-1));
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        composite22.addChild(composite26);
        java.util.Set<examples.Composite> compositeSet29 = composite22.children();
        java.util.Set<examples.Composite> compositeSet30 = composite22.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        examples.Composite composite1 = new examples.Composite(1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        java.util.Set<examples.Composite> compositeSet9 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet11 = composite4.children();
        examples.Composite composite13 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        examples.Composite composite16 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        composite13.addChild(composite16);
        examples.Composite composite20 = new examples.Composite((-3));
        composite16.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        java.util.Set<examples.Composite> compositeSet23 = composite20.children();
        examples.Composite composite25 = new examples.Composite((int) 'a');
        composite20.addChild(composite25);
        java.util.Set<examples.Composite> compositeSet27 = composite20.children();
        java.util.Set<examples.Composite> compositeSet28 = composite20.children();
        examples.Composite composite30 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet31 = composite30.children();
        composite20.addChild(composite30);
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet31);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        examples.Composite composite1 = new examples.Composite(0);
        examples.Composite composite3 = new examples.Composite(5);
        composite1.addChild(composite3);
        java.lang.Class<?> wildcardClass5 = composite1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        examples.Composite composite10 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        java.util.Set<examples.Composite> compositeSet14 = composite10.children();
        java.util.Set<examples.Composite> compositeSet15 = composite10.children();
        java.util.Set<examples.Composite> compositeSet16 = composite10.children();
        java.util.Set<examples.Composite> compositeSet17 = composite10.children();
        composite3.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet19 = composite10.children();
        java.util.Set<examples.Composite> compositeSet20 = composite10.children();
        examples.Composite composite22 = new examples.Composite((int) (byte) 10);
        composite10.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        java.lang.Class<?> wildcardClass26 = compositeSet25.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite9 = new examples.Composite((int) (short) 1);
        composite4.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        examples.Composite composite13 = new examples.Composite((-1));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        composite9.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet16 = composite9.children();
        java.util.Set<examples.Composite> compositeSet17 = composite9.children();
        java.util.Set<examples.Composite> compositeSet18 = composite9.children();
        java.util.Set<examples.Composite> compositeSet19 = composite9.children();
        java.util.Set<examples.Composite> compositeSet20 = composite9.children();
        examples.Composite composite22 = new examples.Composite((-9));
        examples.Composite composite24 = new examples.Composite((int) (byte) 1);
        composite22.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        examples.Composite composite28 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        java.util.Set<examples.Composite> compositeSet30 = composite28.children();
        java.util.Set<examples.Composite> compositeSet31 = composite28.children();
        java.util.Set<examples.Composite> compositeSet32 = composite28.children();
        composite24.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet34 = composite28.children();
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet34);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        examples.Composite composite7 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        composite4.addChild(composite7);
        examples.Composite composite11 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        java.util.Set<examples.Composite> compositeSet15 = composite11.children();
        java.util.Set<examples.Composite> compositeSet16 = composite11.children();
        composite7.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet18 = composite11.children();
        examples.Composite composite20 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        java.util.Set<examples.Composite> compositeSet23 = composite20.children();
        composite11.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet25 = composite11.children();
        examples.Composite composite27 = new examples.Composite((-100));
        examples.Composite composite29 = new examples.Composite((-3));
        composite27.addChild(composite29);
        java.util.Set<examples.Composite> compositeSet31 = composite29.children();
        java.util.Set<examples.Composite> compositeSet32 = composite29.children();
        examples.Composite composite34 = new examples.Composite((-9));
        composite29.addChild(composite34);
        java.util.Set<examples.Composite> compositeSet36 = composite34.children();
        java.util.Set<examples.Composite> compositeSet37 = composite34.children();
        examples.Composite composite39 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet40 = composite39.children();
        composite34.addChild(composite39);
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet36);
        org.junit.Assert.assertNotNull(compositeSet37);
        org.junit.Assert.assertNotNull(compositeSet40);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite1.addChild(composite8);
        examples.Composite composite12 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite8.addChild(composite12);
        examples.Composite composite16 = new examples.Composite((-4));
        composite8.addChild(composite16);
        examples.Composite composite19 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        composite16.addChild(composite19);
        examples.Composite composite23 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        java.util.Set<examples.Composite> compositeSet25 = composite23.children();
        composite16.addChild(composite23);
        examples.Composite composite27 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite23.addChild(composite27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        examples.Composite composite1 = new examples.Composite((int) (short) 100);
        examples.Composite composite3 = new examples.Composite((int) (short) 0);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite7 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        examples.Composite composite10 = new examples.Composite((int) ' ');
        composite7.addChild(composite10);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet8);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        examples.Composite composite1 = new examples.Composite((-5));
        examples.Composite composite3 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        examples.Composite composite11 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite8.addChild(composite11);
        examples.Composite composite15 = new examples.Composite((-2));
        composite8.addChild(composite15);
        examples.Composite composite18 = new examples.Composite(7);
        composite8.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet20 = composite8.children();
        java.util.Set<examples.Composite> compositeSet21 = composite8.children();
        examples.Composite composite23 = new examples.Composite(1);
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        java.util.Set<examples.Composite> compositeSet25 = composite23.children();
        java.util.Set<examples.Composite> compositeSet26 = composite23.children();
        composite8.addChild(composite23);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-2));
        composite1.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite8.addChild(composite12);
        examples.Composite composite16 = new examples.Composite((-2));
        composite8.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite8.children();
        examples.Composite composite20 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        java.util.Set<examples.Composite> compositeSet23 = composite20.children();
        java.util.Set<examples.Composite> compositeSet24 = composite20.children();
        composite8.addChild(composite20);
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        examples.Composite composite10 = new examples.Composite((int) (short) 0);
        composite3.addChild(composite10);
        examples.Composite composite13 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        composite10.addChild(composite13);
        examples.Composite composite17 = new examples.Composite((-5));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        java.util.Set<examples.Composite> compositeSet20 = composite17.children();
        java.util.Set<examples.Composite> compositeSet21 = composite17.children();
        composite10.addChild(composite17);
        examples.Composite composite24 = new examples.Composite((int) '#');
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        composite17.addChild(composite24);
        java.lang.Class<?> wildcardClass27 = composite17.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite12 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        java.util.Set<examples.Composite> compositeSet16 = composite12.children();
        java.util.Set<examples.Composite> compositeSet17 = composite12.children();
        java.util.Set<examples.Composite> compositeSet18 = composite12.children();
        examples.Composite composite20 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        java.util.Set<examples.Composite> compositeSet23 = composite20.children();
        composite12.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet25 = composite20.children();
        examples.Composite composite27 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet28 = composite27.children();
        composite20.addChild(composite27);
        java.util.Set<examples.Composite> compositeSet30 = composite20.children();
        // The following exception was thrown during execution in test generation
        try {
            composite6.addChild(composite20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet30);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((int) '#');
        composite4.addChild(composite11);
        examples.Composite composite14 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        composite4.addChild(composite14);
        examples.Composite composite18 = new examples.Composite((int) '#');
        composite14.addChild(composite18);
        examples.Composite composite21 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        examples.Composite composite25 = new examples.Composite(0);
        composite21.addChild(composite25);
        examples.Composite composite28 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        composite21.addChild(composite28);
        examples.Composite composite32 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet33 = composite32.children();
        composite28.addChild(composite32);
        // The following exception was thrown during execution in test generation
        try {
            composite18.addChild(composite28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet33);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite10 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        composite1.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        java.util.Set<examples.Composite> compositeSet14 = composite10.children();
        examples.Composite composite16 = new examples.Composite((-100));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        examples.Composite composite21 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        java.util.Set<examples.Composite> compositeSet24 = composite21.children();
        composite16.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet26 = composite21.children();
        java.util.Set<examples.Composite> compositeSet27 = composite21.children();
        examples.Composite composite29 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet30 = composite29.children();
        java.util.Set<examples.Composite> compositeSet31 = composite29.children();
        java.util.Set<examples.Composite> compositeSet32 = composite29.children();
        composite21.addChild(composite29);
        // The following exception was thrown during execution in test generation
        try {
            composite10.addChild(composite29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet32);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        examples.Composite composite1 = new examples.Composite((-2));
        examples.Composite composite3 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite9 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite3.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        java.lang.Class<?> wildcardClass13 = composite9.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        examples.Composite composite1 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        examples.Composite composite7 = new examples.Composite((int) (byte) 1);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        composite1.addChild(composite7);
        examples.Composite composite12 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        examples.Composite composite15 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        composite12.addChild(composite15);
        examples.Composite composite19 = new examples.Composite((-2));
        composite12.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        examples.Composite composite23 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        composite19.addChild(composite23);
        examples.Composite composite27 = new examples.Composite((-2));
        composite19.addChild(composite27);
        // The following exception was thrown during execution in test generation
        try {
            composite7.addChild(composite19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        examples.Composite composite1 = new examples.Composite(5);
        examples.Composite composite3 = new examples.Composite((-7));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite(6);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        composite3.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet10 = composite7.children();
        java.lang.Class<?> wildcardClass11 = composite7.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        java.util.Set<examples.Composite> compositeSet9 = composite4.children();
        examples.Composite composite11 = new examples.Composite((int) (short) 0);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite4.addChild(composite11);
        examples.Composite composite15 = new examples.Composite((-100));
        examples.Composite composite17 = new examples.Composite((-3));
        composite15.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        java.util.Set<examples.Composite> compositeSet20 = composite17.children();
        examples.Composite composite22 = new examples.Composite((-9));
        composite17.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        examples.Composite composite26 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        java.util.Set<examples.Composite> compositeSet28 = composite26.children();
        composite22.addChild(composite26);
        java.util.Set<examples.Composite> compositeSet30 = composite26.children();
        java.util.Set<examples.Composite> compositeSet31 = composite26.children();
        examples.Composite composite33 = new examples.Composite((int) (short) 10);
        composite26.addChild(composite33);
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet31);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        examples.Composite composite1 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) '4');
        examples.Composite composite6 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite4.addChild(composite6);
        examples.Composite composite11 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite4.addChild(composite11);
        examples.Composite composite15 = new examples.Composite(8);
        composite11.addChild(composite15);
        examples.Composite composite18 = new examples.Composite(10);
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        composite11.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet21 = composite18.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        java.util.Set<examples.Composite> compositeSet12 = composite1.children();
        java.util.Set<examples.Composite> compositeSet13 = composite1.children();
        java.util.Set<examples.Composite> compositeSet14 = composite1.children();
        examples.Composite composite16 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        composite1.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet19 = composite1.children();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        examples.Composite composite1 = new examples.Composite((int) (byte) 0);
        examples.Composite composite3 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        examples.Composite composite6 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite3.addChild(composite6);
        examples.Composite composite10 = new examples.Composite((-3));
        composite6.addChild(composite10);
        examples.Composite composite13 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        composite6.addChild(composite13);
        examples.Composite composite18 = new examples.Composite((-9));
        composite13.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet20 = composite13.children();
        examples.Composite composite22 = new examples.Composite(1);
        composite13.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite13.children();
        java.util.Set<examples.Composite> compositeSet25 = composite13.children();
        java.util.Set<examples.Composite> compositeSet26 = composite13.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        examples.Composite composite1 = new examples.Composite(3);
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        examples.Composite composite8 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        composite1.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet12 = composite8.children();
        examples.Composite composite14 = new examples.Composite((-8));
        composite8.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet16 = composite8.children();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet16);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite10 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        composite1.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet13 = composite1.children();
        examples.Composite composite15 = new examples.Composite((-7));
        composite1.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet17 = composite1.children();
        java.util.Set<examples.Composite> compositeSet18 = composite1.children();
        java.util.Set<examples.Composite> compositeSet19 = composite1.children();
        java.util.Set<examples.Composite> compositeSet20 = composite1.children();
        java.lang.Class<?> wildcardClass21 = compositeSet20.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        examples.Composite composite1 = new examples.Composite((-5));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        java.util.Set<examples.Composite> compositeSet8 = composite5.children();
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        java.util.Set<examples.Composite> compositeSet12 = composite1.children();
        java.util.Set<examples.Composite> compositeSet13 = composite1.children();
        java.util.Set<examples.Composite> compositeSet14 = composite1.children();
        examples.Composite composite16 = new examples.Composite((-100));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        java.util.Set<examples.Composite> compositeSet21 = composite18.children();
        examples.Composite composite23 = new examples.Composite(4);
        composite18.addChild(composite23);
        examples.Composite composite26 = new examples.Composite((int) (short) 100);
        composite23.addChild(composite26);
        java.util.Set<examples.Composite> compositeSet28 = composite23.children();
        java.util.Set<examples.Composite> compositeSet29 = composite23.children();
        java.util.Set<examples.Composite> compositeSet30 = composite23.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-9));
        composite3.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite3.children();
        examples.Composite composite11 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite3.addChild(composite11);
        examples.Composite composite15 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        java.util.Set<examples.Composite> compositeSet19 = composite15.children();
        composite11.addChild(composite15);
        examples.Composite composite22 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        examples.Composite composite25 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        java.util.Set<examples.Composite> compositeSet27 = composite25.children();
        composite22.addChild(composite25);
        java.util.Set<examples.Composite> compositeSet29 = composite22.children();
        java.util.Set<examples.Composite> compositeSet30 = composite22.children();
        java.util.Set<examples.Composite> compositeSet31 = composite22.children();
        java.util.Set<examples.Composite> compositeSet32 = composite22.children();
        java.util.Set<examples.Composite> compositeSet33 = composite22.children();
        java.util.Set<examples.Composite> compositeSet34 = composite22.children();
        java.util.Set<examples.Composite> compositeSet35 = composite22.children();
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet35);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        examples.Composite composite1 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) '#');
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        java.lang.Class<?> wildcardClass7 = composite4.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-9));
        composite3.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        java.util.Set<examples.Composite> compositeSet10 = composite7.children();
        examples.Composite composite12 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite7.addChild(composite12);
        examples.Composite composite16 = new examples.Composite((int) '#');
        composite7.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        examples.Composite composite20 = new examples.Composite(10);
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        examples.Composite composite23 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        composite20.addChild(composite23);
        java.util.Set<examples.Composite> compositeSet26 = composite20.children();
        // The following exception was thrown during execution in test generation
        try {
            composite16.addChild(composite20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite((int) '4');
        composite8.addChild(composite12);
        examples.Composite composite15 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        composite8.addChild(composite15);
        examples.Composite composite19 = new examples.Composite((-100));
        composite15.addChild(composite19);
        examples.Composite composite22 = new examples.Composite((int) (short) 10);
        examples.Composite composite24 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        java.util.Set<examples.Composite> compositeSet27 = composite24.children();
        java.util.Set<examples.Composite> compositeSet28 = composite24.children();
        composite22.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet30 = composite22.children();
        java.util.Set<examples.Composite> compositeSet31 = composite22.children();
        // The following exception was thrown during execution in test generation
        try {
            composite19.addChild(composite22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet31);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.lang.Class<?> wildcardClass8 = composite3.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite(4);
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite3.children();
        java.lang.Class<?> wildcardClass11 = compositeSet10.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite1.addChild(composite8);
        examples.Composite composite12 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        composite8.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet17 = composite12.children();
        examples.Composite composite19 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
        examples.Composite composite24 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        composite19.addChild(composite24);
        // The following exception was thrown during execution in test generation
        try {
            composite12.addChild(composite24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-2));
        composite1.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite8.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet15 = composite8.children();
        examples.Composite composite17 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        composite8.addChild(composite17);
        examples.Composite composite20 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite17.addChild(composite20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        examples.Composite composite13 = new examples.Composite((int) (byte) 1);
        composite8.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet15 = composite8.children();
        java.util.Set<examples.Composite> compositeSet16 = composite8.children();
        examples.Composite composite18 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        examples.Composite composite22 = new examples.Composite((-6));
        composite18.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        examples.Composite composite7 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        composite4.addChild(composite7);
        examples.Composite composite11 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite7.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet14 = composite7.children();
        java.util.Set<examples.Composite> compositeSet15 = composite7.children();
        java.util.Set<examples.Composite> compositeSet16 = composite7.children();
        examples.Composite composite18 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        composite7.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet21 = composite7.children();
        examples.Composite composite23 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        java.util.Set<examples.Composite> compositeSet25 = composite23.children();
        java.util.Set<examples.Composite> compositeSet26 = composite23.children();
        examples.Composite composite28 = new examples.Composite(3);
        composite23.addChild(composite28);
        examples.Composite composite31 = new examples.Composite(5);
        composite28.addChild(composite31);
        java.util.Set<examples.Composite> compositeSet33 = composite28.children();
        java.util.Set<examples.Composite> compositeSet34 = composite28.children();
        // The following exception was thrown during execution in test generation
        try {
            composite7.addChild(composite28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet34);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        examples.Composite composite1 = new examples.Composite(5);
        examples.Composite composite3 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        java.lang.Class<?> wildcardClass11 = compositeSet10.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        examples.Composite composite1 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((int) (short) 0);
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        examples.Composite composite12 = new examples.Composite((int) '4');
        examples.Composite composite14 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        composite12.addChild(composite14);
        examples.Composite composite19 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        composite12.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet22 = composite12.children();
        java.util.Set<examples.Composite> compositeSet23 = composite12.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite1.addChild(composite8);
        examples.Composite composite12 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite8.addChild(composite12);
        examples.Composite composite16 = new examples.Composite((-4));
        composite8.addChild(composite16);
        examples.Composite composite19 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        composite16.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet22 = composite16.children();
        java.util.Set<examples.Composite> compositeSet23 = composite16.children();
        java.util.Set<examples.Composite> compositeSet24 = composite16.children();
        java.util.Set<examples.Composite> compositeSet25 = composite16.children();
        java.util.Set<examples.Composite> compositeSet26 = composite16.children();
        examples.Composite composite28 = new examples.Composite((int) (short) 0);
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        java.util.Set<examples.Composite> compositeSet30 = composite28.children();
        composite16.addChild(composite28);
        java.lang.Class<?> wildcardClass32 = composite16.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        examples.Composite composite1 = new examples.Composite((-10));
        examples.Composite composite3 = new examples.Composite((-100));
        examples.Composite composite5 = new examples.Composite((-3));
        composite3.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        java.util.Set<examples.Composite> compositeSet8 = composite5.children();
        examples.Composite composite10 = new examples.Composite((-7));
        composite5.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(3);
        composite1.addChild(composite6);
        examples.Composite composite9 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        composite1.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet14 = composite1.children();
        examples.Composite composite16 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        composite1.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet20 = composite1.children();
        java.util.Set<examples.Composite> compositeSet21 = composite1.children();
        java.lang.Class<?> wildcardClass22 = compositeSet21.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        examples.Composite composite1 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.lang.Class<?> wildcardClass5 = compositeSet4.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        examples.Composite composite1 = new examples.Composite(3);
        examples.Composite composite3 = new examples.Composite((-100));
        examples.Composite composite5 = new examples.Composite((-3));
        composite3.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        examples.Composite composite9 = new examples.Composite((-9));
        composite5.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(3);
        composite1.addChild(composite6);
        examples.Composite composite9 = new examples.Composite(5);
        composite6.addChild(composite9);
        examples.Composite composite12 = new examples.Composite((-1));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite9.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet15 = composite9.children();
        java.util.Set<examples.Composite> compositeSet16 = composite9.children();
        java.lang.Class<?> wildcardClass17 = compositeSet16.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite((int) '4');
        composite8.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet14 = composite8.children();
        java.util.Set<examples.Composite> compositeSet15 = composite8.children();
        examples.Composite composite17 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        composite8.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet21 = composite17.children();
        java.lang.Class<?> wildcardClass22 = compositeSet21.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        examples.Composite composite1 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((int) (byte) 0);
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        composite1.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet14 = composite9.children();
        java.lang.Class<?> wildcardClass15 = compositeSet14.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        examples.Composite composite1 = new examples.Composite((-1));
        examples.Composite composite3 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite7 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        composite3.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet10 = composite3.children();
        java.util.Set<examples.Composite> compositeSet11 = composite3.children();
        java.util.Set<examples.Composite> compositeSet12 = composite3.children();
        java.util.Set<examples.Composite> compositeSet13 = composite3.children();
        examples.Composite composite15 = new examples.Composite((int) '4');
        examples.Composite composite17 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        composite15.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet21 = composite17.children();
        examples.Composite composite23 = new examples.Composite((-5));
        composite17.addChild(composite23);
        java.util.Set<examples.Composite> compositeSet25 = composite23.children();
        java.util.Set<examples.Composite> compositeSet26 = composite23.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-8));
        composite1.addChild(composite6);
        examples.Composite composite9 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        composite1.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet13 = composite9.children();
        examples.Composite composite15 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        java.util.Set<examples.Composite> compositeSet19 = composite15.children();
        java.util.Set<examples.Composite> compositeSet20 = composite15.children();
        java.util.Set<examples.Composite> compositeSet21 = composite15.children();
        composite9.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet23 = composite9.children();
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet23);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((int) (short) 1);
        composite8.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        java.util.Set<examples.Composite> compositeSet15 = composite11.children();
        java.util.Set<examples.Composite> compositeSet16 = composite11.children();
        java.lang.Class<?> wildcardClass17 = compositeSet16.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        composite4.addChild(composite11);
        examples.Composite composite16 = new examples.Composite((-9));
        composite11.addChild(composite16);
        examples.Composite composite19 = new examples.Composite(9);
        composite16.addChild(composite19);
        examples.Composite composite22 = new examples.Composite((int) '4');
        examples.Composite composite24 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        composite22.addChild(composite24);
        examples.Composite composite29 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet30 = composite29.children();
        composite22.addChild(composite29);
        examples.Composite composite33 = new examples.Composite(8);
        composite29.addChild(composite33);
        java.util.Set<examples.Composite> compositeSet35 = composite33.children();
        // The following exception was thrown during execution in test generation
        try {
            composite16.addChild(composite33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet35);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(3);
        composite1.addChild(composite6);
        examples.Composite composite9 = new examples.Composite(5);
        composite6.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        examples.Composite composite13 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        composite9.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet16 = composite13.children();
        examples.Composite composite18 = new examples.Composite((-6));
        composite13.addChild(composite18);
        java.lang.Class<?> wildcardClass20 = composite18.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        examples.Composite composite8 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite1.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        java.util.Set<examples.Composite> compositeSet12 = composite1.children();
        java.util.Set<examples.Composite> compositeSet13 = composite1.children();
        java.util.Set<examples.Composite> compositeSet14 = composite1.children();
        examples.Composite composite16 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        java.util.Set<examples.Composite> compositeSet20 = composite16.children();
        java.util.Set<examples.Composite> compositeSet21 = composite16.children();
        java.util.Set<examples.Composite> compositeSet22 = composite16.children();
        java.util.Set<examples.Composite> compositeSet23 = composite16.children();
        composite1.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet25 = composite16.children();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-2));
        composite1.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite1.addChild(composite11);
        examples.Composite composite15 = new examples.Composite(6);
        composite1.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        java.lang.Class<?> wildcardClass18 = composite15.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        examples.Composite composite1 = new examples.Composite(9);
        examples.Composite composite3 = new examples.Composite((int) (short) 10);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet11 = composite6.children();
        java.util.Set<examples.Composite> compositeSet12 = composite6.children();
        java.util.Set<examples.Composite> compositeSet13 = composite6.children();
        java.util.Set<examples.Composite> compositeSet14 = composite6.children();
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        examples.Composite composite7 = new examples.Composite((int) (short) 0);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        composite4.addChild(composite7);
        examples.Composite composite11 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite7.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet14 = composite7.children();
        java.util.Set<examples.Composite> compositeSet15 = composite7.children();
        java.util.Set<examples.Composite> compositeSet16 = composite7.children();
        java.util.Set<examples.Composite> compositeSet17 = composite7.children();
        examples.Composite composite19 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        examples.Composite composite22 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        composite19.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet25 = composite19.children();
        // The following exception was thrown during execution in test generation
        try {
            composite7.addChild(composite19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        java.util.Set<examples.Composite> compositeSet9 = composite3.children();
        java.util.Set<examples.Composite> compositeSet10 = composite3.children();
        java.util.Set<examples.Composite> compositeSet11 = composite3.children();
        java.util.Set<examples.Composite> compositeSet12 = composite3.children();
        java.util.Set<examples.Composite> compositeSet13 = composite3.children();
        examples.Composite composite15 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        composite3.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet19 = composite15.children();
        java.util.Set<examples.Composite> compositeSet20 = composite15.children();
        examples.Composite composite22 = new examples.Composite(2);
        examples.Composite composite24 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        composite22.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet28 = composite24.children();
        examples.Composite composite30 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet31 = composite30.children();
        composite24.addChild(composite30);
        // The following exception was thrown during execution in test generation
        try {
            composite15.addChild(composite24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet31);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite12 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        examples.Composite composite15 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        composite12.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        // The following exception was thrown during execution in test generation
        try {
            composite6.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        examples.Composite composite1 = new examples.Composite((-5));
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite7 = new examples.Composite(2);
        composite1.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        examples.Composite composite11 = new examples.Composite((-100));
        examples.Composite composite13 = new examples.Composite((-3));
        composite11.addChild(composite13);
        examples.Composite composite16 = new examples.Composite((-8));
        composite11.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite11.children();
        java.util.Set<examples.Composite> compositeSet19 = composite11.children();
        // The following exception was thrown during execution in test generation
        try {
            composite7.addChild(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-2));
        composite1.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite8.addChild(composite12);
        examples.Composite composite16 = new examples.Composite((-2));
        composite8.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        examples.Composite composite20 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        java.util.Set<examples.Composite> compositeSet23 = composite20.children();
        java.util.Set<examples.Composite> compositeSet24 = composite20.children();
        composite16.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet26 = composite16.children();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((int) (byte) 100);
        composite1.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite8.addChild(composite11);
        examples.Composite composite15 = new examples.Composite((-100));
        examples.Composite composite17 = new examples.Composite((-3));
        composite15.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        java.util.Set<examples.Composite> compositeSet20 = composite17.children();
        examples.Composite composite22 = new examples.Composite((-9));
        composite17.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        examples.Composite composite27 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet28 = composite27.children();
        composite22.addChild(composite27);
        examples.Composite composite31 = new examples.Composite(4);
        composite27.addChild(composite31);
        java.util.Set<examples.Composite> compositeSet33 = composite27.children();
        java.util.Set<examples.Composite> compositeSet34 = composite27.children();
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet34);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        examples.Composite composite1 = new examples.Composite((-2));
        examples.Composite composite3 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        java.util.Set<examples.Composite> compositeSet12 = composite1.children();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite((int) '4');
        composite8.addChild(composite12);
        examples.Composite composite15 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        composite8.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        java.util.Set<examples.Composite> compositeSet19 = composite15.children();
        examples.Composite composite21 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        composite15.addChild(composite21);
        examples.Composite composite25 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        examples.Composite composite28 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        composite25.addChild(composite28);
        examples.Composite composite32 = new examples.Composite((-3));
        composite28.addChild(composite32);
        examples.Composite composite35 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet36 = composite35.children();
        java.util.Set<examples.Composite> compositeSet37 = composite35.children();
        composite28.addChild(composite35);
        examples.Composite composite40 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet41 = composite40.children();
        composite35.addChild(composite40);
        java.util.Set<examples.Composite> compositeSet43 = composite35.children();
        // The following exception was thrown during execution in test generation
        try {
            composite15.addChild(composite35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet36);
        org.junit.Assert.assertNotNull(compositeSet37);
        org.junit.Assert.assertNotNull(compositeSet41);
        org.junit.Assert.assertNotNull(compositeSet43);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite1.addChild(composite8);
        examples.Composite composite12 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite8.addChild(composite12);
        examples.Composite composite16 = new examples.Composite((-4));
        composite8.addChild(composite16);
        examples.Composite composite19 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        composite16.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
        java.util.Set<examples.Composite> compositeSet23 = composite19.children();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-8));
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite10 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        examples.Composite composite15 = new examples.Composite(3);
        composite10.addChild(composite15);
        examples.Composite composite18 = new examples.Composite(5);
        composite15.addChild(composite18);
        examples.Composite composite21 = new examples.Composite((-1));
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        composite18.addChild(composite21);
        examples.Composite composite25 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        java.util.Set<examples.Composite> compositeSet27 = composite25.children();
        java.util.Set<examples.Composite> compositeSet28 = composite25.children();
        java.util.Set<examples.Composite> compositeSet29 = composite25.children();
        composite18.addChild(composite25);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite(2);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite3.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet10 = composite6.children();
        examples.Composite composite12 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite6.addChild(composite12);
        examples.Composite composite16 = new examples.Composite((-1));
        examples.Composite composite18 = new examples.Composite(100);
        composite16.addChild(composite18);
        // The following exception was thrown during execution in test generation
        try {
            composite12.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        examples.Composite composite1 = new examples.Composite((-1));
        examples.Composite composite3 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite7 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        composite3.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet10 = composite3.children();
        java.util.Set<examples.Composite> compositeSet11 = composite3.children();
        examples.Composite composite13 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        java.util.Set<examples.Composite> compositeSet16 = composite13.children();
        examples.Composite composite18 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        composite13.addChild(composite18);
        examples.Composite composite23 = new examples.Composite(1);
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        java.util.Set<examples.Composite> compositeSet25 = composite23.children();
        composite18.addChild(composite23);
        java.util.Set<examples.Composite> compositeSet27 = composite18.children();
        examples.Composite composite29 = new examples.Composite((-5));
        java.util.Set<examples.Composite> compositeSet30 = composite29.children();
        composite18.addChild(composite29);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet30);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        examples.Composite composite1 = new examples.Composite(2);
        examples.Composite composite3 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        examples.Composite composite9 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite3.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        examples.Composite composite14 = new examples.Composite((-100));
        examples.Composite composite16 = new examples.Composite((-3));
        composite14.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        java.util.Set<examples.Composite> compositeSet20 = composite16.children();
        java.util.Set<examples.Composite> compositeSet21 = composite16.children();
        java.util.Set<examples.Composite> compositeSet22 = composite16.children();
        java.util.Set<examples.Composite> compositeSet23 = composite16.children();
        java.util.Set<examples.Composite> compositeSet24 = composite16.children();
        java.util.Set<examples.Composite> compositeSet25 = composite16.children();
        java.util.Set<examples.Composite> compositeSet26 = composite16.children();
        examples.Composite composite28 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        java.util.Set<examples.Composite> compositeSet30 = composite28.children();
        composite16.addChild(composite28);
        examples.Composite composite33 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet34 = composite33.children();
        composite16.addChild(composite33);
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet34);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        examples.Composite composite10 = new examples.Composite((int) (short) 0);
        composite3.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite3.children();
        java.util.Set<examples.Composite> compositeSet13 = composite3.children();
        examples.Composite composite15 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        examples.Composite composite18 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        composite15.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet21 = composite18.children();
        java.util.Set<examples.Composite> compositeSet22 = composite18.children();
        java.util.Set<examples.Composite> compositeSet23 = composite18.children();
        java.util.Set<examples.Composite> compositeSet24 = composite18.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        composite4.addChild(composite11);
        examples.Composite composite16 = new examples.Composite((-9));
        composite11.addChild(composite16);
        examples.Composite composite19 = new examples.Composite(9);
        composite16.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite16.children();
        examples.Composite composite23 = new examples.Composite(1);
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        java.util.Set<examples.Composite> compositeSet25 = composite23.children();
        composite16.addChild(composite23);
        examples.Composite composite28 = new examples.Composite((-100));
        examples.Composite composite30 = new examples.Composite((-3));
        composite28.addChild(composite30);
        java.util.Set<examples.Composite> compositeSet32 = composite30.children();
        java.util.Set<examples.Composite> compositeSet33 = composite30.children();
        examples.Composite composite35 = new examples.Composite((-9));
        composite30.addChild(composite35);
        java.util.Set<examples.Composite> compositeSet37 = composite35.children();
        java.util.Set<examples.Composite> compositeSet38 = composite35.children();
        examples.Composite composite40 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet41 = composite40.children();
        composite35.addChild(composite40);
        examples.Composite composite44 = new examples.Composite(4);
        composite40.addChild(composite44);
        java.util.Set<examples.Composite> compositeSet46 = composite44.children();
        java.util.Set<examples.Composite> compositeSet47 = composite44.children();
        // The following exception was thrown during execution in test generation
        try {
            composite23.addChild(composite44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet37);
        org.junit.Assert.assertNotNull(compositeSet38);
        org.junit.Assert.assertNotNull(compositeSet41);
        org.junit.Assert.assertNotNull(compositeSet46);
        org.junit.Assert.assertNotNull(compositeSet47);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        examples.Composite composite13 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        composite8.addChild(composite13);
        examples.Composite composite17 = new examples.Composite(4);
        composite13.addChild(composite17);
        examples.Composite composite20 = new examples.Composite((-9));
        examples.Composite composite22 = new examples.Composite((int) (byte) 1);
        composite20.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        examples.Composite composite26 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        java.util.Set<examples.Composite> compositeSet28 = composite26.children();
        java.util.Set<examples.Composite> compositeSet29 = composite26.children();
        java.util.Set<examples.Composite> compositeSet30 = composite26.children();
        composite22.addChild(composite26);
        // The following exception was thrown during execution in test generation
        try {
            composite17.addChild(composite22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite(4);
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        java.util.Set<examples.Composite> compositeSet12 = composite8.children();
        java.util.Set<examples.Composite> compositeSet13 = composite8.children();
        java.util.Set<examples.Composite> compositeSet14 = composite8.children();
        examples.Composite composite16 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        java.util.Set<examples.Composite> compositeSet20 = composite16.children();
        composite8.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet22 = composite16.children();
        java.util.Set<examples.Composite> compositeSet23 = composite16.children();
        java.util.Set<examples.Composite> compositeSet24 = composite16.children();
        java.util.Set<examples.Composite> compositeSet25 = composite16.children();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-8));
        composite1.addChild(composite6);
        examples.Composite composite9 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        composite1.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet13 = composite9.children();
        java.util.Set<examples.Composite> compositeSet14 = composite9.children();
        examples.Composite composite16 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        composite9.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet19 = composite9.children();
        examples.Composite composite21 = new examples.Composite((-100));
        examples.Composite composite23 = new examples.Composite((-3));
        composite21.addChild(composite23);
        java.util.Set<examples.Composite> compositeSet25 = composite23.children();
        java.util.Set<examples.Composite> compositeSet26 = composite23.children();
        examples.Composite composite28 = new examples.Composite((-9));
        composite23.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet30 = composite28.children();
        examples.Composite composite32 = new examples.Composite((int) '4');
        composite28.addChild(composite32);
        examples.Composite composite35 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet36 = composite35.children();
        java.util.Set<examples.Composite> compositeSet37 = composite35.children();
        java.util.Set<examples.Composite> compositeSet38 = composite35.children();
        java.util.Set<examples.Composite> compositeSet39 = composite35.children();
        java.util.Set<examples.Composite> compositeSet40 = composite35.children();
        composite28.addChild(composite35);
        java.util.Set<examples.Composite> compositeSet42 = composite28.children();
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet36);
        org.junit.Assert.assertNotNull(compositeSet37);
        org.junit.Assert.assertNotNull(compositeSet38);
        org.junit.Assert.assertNotNull(compositeSet39);
        org.junit.Assert.assertNotNull(compositeSet40);
        org.junit.Assert.assertNotNull(compositeSet42);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite11 = new examples.Composite(1);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        composite6.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet15 = composite6.children();
        examples.Composite composite17 = new examples.Composite((-5));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        composite6.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet20 = composite6.children();
        examples.Composite composite22 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        examples.Composite composite25 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        composite22.addChild(composite25);
        java.util.Set<examples.Composite> compositeSet28 = composite22.children();
        java.util.Set<examples.Composite> compositeSet29 = composite22.children();
        examples.Composite composite31 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet32 = composite31.children();
        java.util.Set<examples.Composite> compositeSet33 = composite31.children();
        composite22.addChild(composite31);
        // The following exception was thrown during execution in test generation
        try {
            composite6.addChild(composite22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet33);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet9);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-2));
        composite1.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        examples.Composite composite12 = new examples.Composite(6);
        composite1.addChild(composite12);
        examples.Composite composite15 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        composite1.addChild(composite15);
        examples.Composite composite19 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
        java.util.Set<examples.Composite> compositeSet23 = composite19.children();
        java.util.Set<examples.Composite> compositeSet24 = composite19.children();
        composite15.addChild(composite19);
        examples.Composite composite27 = new examples.Composite((int) (short) -1);
        java.util.Set<examples.Composite> compositeSet28 = composite27.children();
        examples.Composite composite30 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet31 = composite30.children();
        java.util.Set<examples.Composite> compositeSet32 = composite30.children();
        composite27.addChild(composite30);
        java.util.Set<examples.Composite> compositeSet34 = composite27.children();
        // The following exception was thrown during execution in test generation
        try {
            composite15.addChild(composite27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet34);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-9));
        composite3.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        java.util.Set<examples.Composite> compositeSet10 = composite7.children();
        java.util.Set<examples.Composite> compositeSet11 = composite7.children();
        java.util.Set<examples.Composite> compositeSet12 = composite7.children();
        java.util.Set<examples.Composite> compositeSet13 = composite7.children();
        java.util.Set<examples.Composite> compositeSet14 = composite7.children();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        examples.Composite composite1 = new examples.Composite(3);
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-2));
        composite1.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite8.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet15 = composite8.children();
        java.util.Set<examples.Composite> compositeSet16 = composite8.children();
        java.util.Set<examples.Composite> compositeSet17 = composite8.children();
        java.util.Set<examples.Composite> compositeSet18 = composite8.children();
        java.util.Set<examples.Composite> compositeSet19 = composite8.children();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        examples.Composite composite10 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        java.util.Set<examples.Composite> compositeSet14 = composite10.children();
        java.util.Set<examples.Composite> compositeSet15 = composite10.children();
        java.util.Set<examples.Composite> compositeSet16 = composite10.children();
        java.util.Set<examples.Composite> compositeSet17 = composite10.children();
        composite3.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet19 = composite10.children();
        java.util.Set<examples.Composite> compositeSet20 = composite10.children();
        examples.Composite composite22 = new examples.Composite((int) (byte) 10);
        composite10.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite10.children();
        java.lang.Class<?> wildcardClass25 = composite10.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite11 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        composite1.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet16 = composite1.children();
        java.util.Set<examples.Composite> compositeSet17 = composite1.children();
        examples.Composite composite19 = new examples.Composite((int) (short) 10);
        composite1.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite1.children();
        java.util.Set<examples.Composite> compositeSet22 = composite1.children();
        java.util.Set<examples.Composite> compositeSet23 = composite1.children();
        examples.Composite composite25 = new examples.Composite((int) '4');
        examples.Composite composite27 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet28 = composite27.children();
        java.util.Set<examples.Composite> compositeSet29 = composite27.children();
        composite25.addChild(composite27);
        java.util.Set<examples.Composite> compositeSet31 = composite27.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet31);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        java.util.Set<examples.Composite> compositeSet12 = composite1.children();
        java.util.Set<examples.Composite> compositeSet13 = composite1.children();
        java.util.Set<examples.Composite> compositeSet14 = composite1.children();
        java.util.Set<examples.Composite> compositeSet15 = composite1.children();
        examples.Composite composite17 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        java.util.Set<examples.Composite> compositeSet20 = composite17.children();
        examples.Composite composite22 = new examples.Composite((int) (short) 0);
        composite17.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite17.children();
        java.util.Set<examples.Composite> compositeSet25 = composite17.children();
        java.util.Set<examples.Composite> compositeSet26 = composite17.children();
        java.util.Set<examples.Composite> compositeSet27 = composite17.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        examples.Composite composite1 = new examples.Composite(2);
        examples.Composite composite3 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        java.util.Set<examples.Composite> compositeSet9 = composite3.children();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        examples.Composite composite7 = new examples.Composite((int) (byte) 10);
        composite1.addChild(composite7);
        examples.Composite composite10 = new examples.Composite(2);
        examples.Composite composite12 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        composite10.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet16 = composite12.children();
        examples.Composite composite18 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        composite12.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet21 = composite12.children();
        java.util.Set<examples.Composite> compositeSet22 = composite12.children();
        java.util.Set<examples.Composite> compositeSet23 = composite12.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        examples.Composite composite13 = new examples.Composite((-100));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        examples.Composite composite19 = new examples.Composite((-9));
        composite15.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
        examples.Composite composite24 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        composite19.addChild(composite24);
        examples.Composite composite28 = new examples.Composite((int) '#');
        composite19.addChild(composite28);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        examples.Composite composite1 = new examples.Composite(8);
        examples.Composite composite3 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        examples.Composite composite13 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        composite8.addChild(composite13);
        examples.Composite composite18 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        java.util.Set<examples.Composite> compositeSet21 = composite18.children();
        composite8.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet23 = composite18.children();
        java.util.Set<examples.Composite> compositeSet24 = composite18.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite(2);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite3.addChild(composite6);
        examples.Composite composite10 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite6.addChild(composite10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet11 = composite6.children();
        java.util.Set<examples.Composite> compositeSet12 = composite6.children();
        examples.Composite composite14 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        composite6.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet19 = composite14.children();
        java.util.Set<examples.Composite> compositeSet20 = composite14.children();
        examples.Composite composite22 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        examples.Composite composite25 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        composite22.addChild(composite25);
        examples.Composite composite29 = new examples.Composite((-2));
        composite22.addChild(composite29);
        java.util.Set<examples.Composite> compositeSet31 = composite29.children();
        examples.Composite composite33 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet34 = composite33.children();
        composite29.addChild(composite33);
        examples.Composite composite37 = new examples.Composite((-2));
        composite29.addChild(composite37);
        java.util.Set<examples.Composite> compositeSet39 = composite29.children();
        java.util.Set<examples.Composite> compositeSet40 = composite29.children();
        // The following exception was thrown during execution in test generation
        try {
            composite14.addChild(composite29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet39);
        org.junit.Assert.assertNotNull(compositeSet40);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        examples.Composite composite7 = new examples.Composite((int) (short) 0);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        composite4.addChild(composite7);
        examples.Composite composite11 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite7.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet14 = composite7.children();
        java.util.Set<examples.Composite> compositeSet15 = composite7.children();
        java.util.Set<examples.Composite> compositeSet16 = composite7.children();
        examples.Composite composite18 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        examples.Composite composite22 = new examples.Composite((int) (byte) 0);
        composite18.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite18.children();
        examples.Composite composite26 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        java.util.Set<examples.Composite> compositeSet28 = composite26.children();
        java.util.Set<examples.Composite> compositeSet29 = composite26.children();
        composite18.addChild(composite26);
        java.util.Set<examples.Composite> compositeSet31 = composite18.children();
        java.util.Set<examples.Composite> compositeSet32 = composite18.children();
        // The following exception was thrown during execution in test generation
        try {
            composite7.addChild(composite18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet32);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        examples.Composite composite1 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        composite1.addChild(composite9);
        examples.Composite composite15 = new examples.Composite(3);
        examples.Composite composite17 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        composite15.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet21 = composite17.children();
        java.util.Set<examples.Composite> compositeSet22 = composite17.children();
        examples.Composite composite24 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        java.util.Set<examples.Composite> compositeSet27 = composite24.children();
        java.util.Set<examples.Composite> compositeSet28 = composite24.children();
        composite17.addChild(composite24);
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite10 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        composite1.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet13 = composite1.children();
        java.util.Set<examples.Composite> compositeSet14 = composite1.children();
        java.util.Set<examples.Composite> compositeSet15 = composite1.children();
        java.util.Set<examples.Composite> compositeSet16 = composite1.children();
        java.lang.Class<?> wildcardClass17 = compositeSet16.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-9));
        composite3.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        java.util.Set<examples.Composite> compositeSet10 = composite7.children();
        examples.Composite composite12 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite7.addChild(composite12);
        examples.Composite composite16 = new examples.Composite((int) (short) -1);
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        composite7.addChild(composite16);
        examples.Composite composite21 = new examples.Composite((-100));
        examples.Composite composite23 = new examples.Composite((-10));
        composite21.addChild(composite23);
        java.util.Set<examples.Composite> compositeSet25 = composite21.children();
        // The following exception was thrown during execution in test generation
        try {
            composite16.addChild(composite21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        examples.Composite composite1 = new examples.Composite((-5));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-100));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        java.util.Set<examples.Composite> compositeSet10 = composite7.children();
        examples.Composite composite12 = new examples.Composite((-9));
        composite7.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        examples.Composite composite16 = new examples.Composite((int) '4');
        composite12.addChild(composite16);
        examples.Composite composite19 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        composite16.addChild(composite19);
        examples.Composite composite24 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        composite16.addChild(composite24);
        examples.Composite composite28 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        java.util.Set<examples.Composite> compositeSet30 = composite28.children();
        composite16.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet32 = composite16.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet32);
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        examples.Composite composite9 = new examples.Composite((-5));
        composite3.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet11 = composite3.children();
        examples.Composite composite13 = new examples.Composite((int) (byte) 1);
        examples.Composite composite15 = new examples.Composite(2);
        composite13.addChild(composite15);
        examples.Composite composite18 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        composite15.addChild(composite18);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite10 = new examples.Composite(10);
        composite6.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite6.children();
        java.util.Set<examples.Composite> compositeSet13 = composite6.children();
        examples.Composite composite15 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        examples.Composite composite18 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        composite15.addChild(composite18);
        examples.Composite composite22 = new examples.Composite((-3));
        composite18.addChild(composite22);
        examples.Composite composite25 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        java.util.Set<examples.Composite> compositeSet27 = composite25.children();
        composite18.addChild(composite25);
        examples.Composite composite30 = new examples.Composite((-9));
        composite25.addChild(composite30);
        examples.Composite composite33 = new examples.Composite(9);
        composite30.addChild(composite33);
        java.util.Set<examples.Composite> compositeSet35 = composite30.children();
        java.util.Set<examples.Composite> compositeSet36 = composite30.children();
        // The following exception was thrown during execution in test generation
        try {
            composite6.addChild(composite30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet35);
        org.junit.Assert.assertNotNull(compositeSet36);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        examples.Composite composite13 = new examples.Composite((int) 'a');
        composite8.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        examples.Composite composite17 = new examples.Composite((int) (short) -1);
        composite13.addChild(composite17);
        examples.Composite composite20 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        examples.Composite composite23 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        composite20.addChild(composite23);
        examples.Composite composite27 = new examples.Composite((-3));
        composite23.addChild(composite27);
        java.util.Set<examples.Composite> compositeSet29 = composite27.children();
        java.util.Set<examples.Composite> compositeSet30 = composite27.children();
        // The following exception was thrown during execution in test generation
        try {
            composite13.addChild(composite27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((int) (byte) 100);
        composite1.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite8.addChild(composite11);
        examples.Composite composite15 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        examples.Composite composite18 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        composite15.addChild(composite18);
        examples.Composite composite22 = new examples.Composite((-3));
        composite18.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        examples.Composite composite27 = new examples.Composite((int) 'a');
        composite22.addChild(composite27);
        java.util.Set<examples.Composite> compositeSet29 = composite27.children();
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet29);
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        examples.Composite composite1 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((int) (byte) 1);
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        examples.Composite composite11 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        examples.Composite composite15 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        composite11.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet19 = composite15.children();
        java.util.Set<examples.Composite> compositeSet20 = composite15.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite((int) '4');
        composite8.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet14 = composite8.children();
        java.util.Set<examples.Composite> compositeSet15 = composite8.children();
        examples.Composite composite17 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        composite8.addChild(composite17);
        examples.Composite composite22 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        composite17.addChild(composite22);
        examples.Composite composite27 = new examples.Composite((-100));
        examples.Composite composite29 = new examples.Composite((-3));
        composite27.addChild(composite29);
        java.util.Set<examples.Composite> compositeSet31 = composite29.children();
        java.util.Set<examples.Composite> compositeSet32 = composite29.children();
        examples.Composite composite34 = new examples.Composite((-9));
        composite29.addChild(composite34);
        java.util.Set<examples.Composite> compositeSet36 = composite34.children();
        examples.Composite composite38 = new examples.Composite((int) '4');
        composite34.addChild(composite38);
        java.util.Set<examples.Composite> compositeSet40 = composite34.children();
        java.util.Set<examples.Composite> compositeSet41 = composite34.children();
        examples.Composite composite43 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet44 = composite43.children();
        java.util.Set<examples.Composite> compositeSet45 = composite43.children();
        composite34.addChild(composite43);
        examples.Composite composite48 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet49 = composite48.children();
        java.util.Set<examples.Composite> compositeSet50 = composite48.children();
        composite43.addChild(composite48);
        java.util.Set<examples.Composite> compositeSet52 = composite43.children();
        java.util.Set<examples.Composite> compositeSet53 = composite43.children();
        java.util.Set<examples.Composite> compositeSet54 = composite43.children();
        // The following exception was thrown during execution in test generation
        try {
            composite22.addChild(composite43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet36);
        org.junit.Assert.assertNotNull(compositeSet40);
        org.junit.Assert.assertNotNull(compositeSet41);
        org.junit.Assert.assertNotNull(compositeSet44);
        org.junit.Assert.assertNotNull(compositeSet45);
        org.junit.Assert.assertNotNull(compositeSet49);
        org.junit.Assert.assertNotNull(compositeSet50);
        org.junit.Assert.assertNotNull(compositeSet52);
        org.junit.Assert.assertNotNull(compositeSet53);
        org.junit.Assert.assertNotNull(compositeSet54);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        examples.Composite composite1 = new examples.Composite((int) '#');
        examples.Composite composite3 = new examples.Composite((-100));
        examples.Composite composite5 = new examples.Composite((-3));
        composite3.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        java.util.Set<examples.Composite> compositeSet8 = composite5.children();
        examples.Composite composite10 = new examples.Composite(4);
        composite5.addChild(composite10);
        examples.Composite composite13 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        java.util.Set<examples.Composite> compositeSet16 = composite13.children();
        java.util.Set<examples.Composite> compositeSet17 = composite13.children();
        composite5.addChild(composite13);
        examples.Composite composite20 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        composite13.addChild(composite20);
        examples.Composite composite24 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        java.util.Set<examples.Composite> compositeSet27 = composite24.children();
        java.util.Set<examples.Composite> compositeSet28 = composite24.children();
        composite13.addChild(composite24);
        examples.Composite composite31 = new examples.Composite(10);
        composite13.addChild(composite31);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite10 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        composite6.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        java.util.Set<examples.Composite> compositeSet14 = composite10.children();
        examples.Composite composite16 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        java.util.Set<examples.Composite> compositeSet20 = composite16.children();
        java.util.Set<examples.Composite> compositeSet21 = composite16.children();
        java.util.Set<examples.Composite> compositeSet22 = composite16.children();
        examples.Composite composite24 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        java.util.Set<examples.Composite> compositeSet27 = composite24.children();
        composite16.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet29 = composite24.children();
        // The following exception was thrown during execution in test generation
        try {
            composite10.addChild(composite24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet29);
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        examples.Composite composite1 = new examples.Composite((-1));
        examples.Composite composite3 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite7 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        composite3.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet10 = composite3.children();
        java.util.Set<examples.Composite> compositeSet11 = composite3.children();
        java.util.Set<examples.Composite> compositeSet12 = composite3.children();
        java.lang.Class<?> wildcardClass13 = compositeSet12.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        java.util.Set<examples.Composite> compositeSet12 = composite1.children();
        examples.Composite composite14 = new examples.Composite((-100));
        examples.Composite composite16 = new examples.Composite((-3));
        composite14.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        examples.Composite composite20 = new examples.Composite((-9));
        composite16.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet22 = composite16.children();
        examples.Composite composite24 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        composite16.addChild(composite24);
        examples.Composite composite28 = new examples.Composite((int) 'a');
        composite16.addChild(composite28);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite10 = new examples.Composite(10);
        composite6.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite6.children();
        java.util.Set<examples.Composite> compositeSet13 = composite6.children();
        examples.Composite composite15 = new examples.Composite(4);
        composite6.addChild(composite15);
        examples.Composite composite18 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        composite6.addChild(composite18);
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        examples.Composite composite1 = new examples.Composite(5);
        examples.Composite composite3 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        java.util.Set<examples.Composite> compositeSet9 = composite3.children();
        java.util.Set<examples.Composite> compositeSet10 = composite3.children();
        java.util.Set<examples.Composite> compositeSet11 = composite3.children();
        java.util.Set<examples.Composite> compositeSet12 = composite3.children();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        examples.Composite composite1 = new examples.Composite(3);
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        examples.Composite composite8 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        examples.Composite composite13 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        composite8.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet16 = composite13.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-9));
        composite3.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        java.util.Set<examples.Composite> compositeSet10 = composite7.children();
        examples.Composite composite12 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite7.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        java.util.Set<examples.Composite> compositeSet16 = composite12.children();
        examples.Composite composite18 = new examples.Composite((-100));
        examples.Composite composite20 = new examples.Composite((-3));
        composite18.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        java.util.Set<examples.Composite> compositeSet23 = composite20.children();
        examples.Composite composite25 = new examples.Composite((-9));
        composite20.addChild(composite25);
        java.util.Set<examples.Composite> compositeSet27 = composite25.children();
        examples.Composite composite29 = new examples.Composite((int) '4');
        composite25.addChild(composite29);
        examples.Composite composite32 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet33 = composite32.children();
        java.util.Set<examples.Composite> compositeSet34 = composite32.children();
        composite29.addChild(composite32);
        java.util.Set<examples.Composite> compositeSet36 = composite32.children();
        java.util.Set<examples.Composite> compositeSet37 = composite32.children();
        java.util.Set<examples.Composite> compositeSet38 = composite32.children();
        // The following exception was thrown during execution in test generation
        try {
            composite12.addChild(composite32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet36);
        org.junit.Assert.assertNotNull(compositeSet37);
        org.junit.Assert.assertNotNull(compositeSet38);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        composite8.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet16 = composite12.children();
        java.util.Set<examples.Composite> compositeSet17 = composite12.children();
        examples.Composite composite19 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
        composite12.addChild(composite19);
        examples.Composite composite25 = new examples.Composite((-100));
        examples.Composite composite27 = new examples.Composite((-3));
        composite25.addChild(composite27);
        java.util.Set<examples.Composite> compositeSet29 = composite27.children();
        java.util.Set<examples.Composite> compositeSet30 = composite27.children();
        examples.Composite composite32 = new examples.Composite(4);
        composite27.addChild(composite32);
        java.util.Set<examples.Composite> compositeSet34 = composite32.children();
        java.util.Set<examples.Composite> compositeSet35 = composite32.children();
        java.util.Set<examples.Composite> compositeSet36 = composite32.children();
        java.util.Set<examples.Composite> compositeSet37 = composite32.children();
        java.util.Set<examples.Composite> compositeSet38 = composite32.children();
        examples.Composite composite40 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet41 = composite40.children();
        java.util.Set<examples.Composite> compositeSet42 = composite40.children();
        java.util.Set<examples.Composite> compositeSet43 = composite40.children();
        java.util.Set<examples.Composite> compositeSet44 = composite40.children();
        composite32.addChild(composite40);
        examples.Composite composite47 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet48 = composite47.children();
        composite40.addChild(composite47);
        // The following exception was thrown during execution in test generation
        try {
            composite19.addChild(composite47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet35);
        org.junit.Assert.assertNotNull(compositeSet36);
        org.junit.Assert.assertNotNull(compositeSet37);
        org.junit.Assert.assertNotNull(compositeSet38);
        org.junit.Assert.assertNotNull(compositeSet41);
        org.junit.Assert.assertNotNull(compositeSet42);
        org.junit.Assert.assertNotNull(compositeSet43);
        org.junit.Assert.assertNotNull(compositeSet44);
        org.junit.Assert.assertNotNull(compositeSet48);
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((int) '#');
        composite4.addChild(composite11);
        examples.Composite composite14 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        composite4.addChild(composite14);
        examples.Composite composite18 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        java.util.Set<examples.Composite> compositeSet21 = composite18.children();
        composite4.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet23 = composite4.children();
        java.util.Set<examples.Composite> compositeSet24 = composite4.children();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite11 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        composite1.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet16 = composite1.children();
        java.util.Set<examples.Composite> compositeSet17 = composite1.children();
        examples.Composite composite19 = new examples.Composite((int) (short) 10);
        composite1.addChild(composite19);
        examples.Composite composite22 = new examples.Composite(3);
        composite19.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite19.children();
        examples.Composite composite26 = new examples.Composite((-7));
        composite19.addChild(composite26);
        examples.Composite composite29 = new examples.Composite((-100));
        examples.Composite composite31 = new examples.Composite((-3));
        composite29.addChild(composite31);
        examples.Composite composite34 = new examples.Composite((-6));
        composite29.addChild(composite34);
        java.util.Set<examples.Composite> compositeSet36 = composite29.children();
        // The following exception was thrown during execution in test generation
        try {
            composite19.addChild(composite29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet36);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite(2);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite3.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet10 = composite6.children();
        examples.Composite composite12 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite6.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet15 = composite6.children();
        java.util.Set<examples.Composite> compositeSet16 = composite6.children();
        java.util.Set<examples.Composite> compositeSet17 = composite6.children();
        java.lang.Class<?> wildcardClass18 = compositeSet17.getClass();
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        examples.Composite composite11 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        composite1.addChild(composite11);
        java.lang.Class<?> wildcardClass15 = composite11.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-9));
        composite3.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        examples.Composite composite11 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite7.addChild(composite11);
        examples.Composite composite15 = new examples.Composite((-9));
        examples.Composite composite17 = new examples.Composite((int) (byte) 1);
        composite15.addChild(composite17);
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet12);
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        examples.Composite composite1 = new examples.Composite((-5));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        java.util.Set<examples.Composite> compositeSet8 = composite5.children();
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        examples.Composite composite13 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        composite1.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet17 = composite13.children();
        examples.Composite composite19 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
        composite13.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet24 = composite19.children();
        examples.Composite composite26 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        composite19.addChild(composite26);
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet27);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        examples.Composite composite1 = new examples.Composite(9);
        examples.Composite composite3 = new examples.Composite((int) (short) 10);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        examples.Composite composite9 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        composite3.addChild(composite9);
        java.lang.Class<?> wildcardClass14 = composite3.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        examples.Composite composite1 = new examples.Composite(5);
        examples.Composite composite3 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        examples.Composite composite9 = new examples.Composite((int) (short) -1);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        examples.Composite composite12 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        composite9.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet16 = composite9.children();
        java.util.Set<examples.Composite> compositeSet17 = composite9.children();
        java.util.Set<examples.Composite> compositeSet18 = composite9.children();
        java.util.Set<examples.Composite> compositeSet19 = composite9.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        examples.Composite composite7 = new examples.Composite((int) (short) 0);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        composite4.addChild(composite7);
        examples.Composite composite11 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite7.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        java.util.Set<examples.Composite> compositeSet15 = composite11.children();
        examples.Composite composite17 = new examples.Composite((-100));
        examples.Composite composite19 = new examples.Composite((-3));
        composite17.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
        java.util.Set<examples.Composite> compositeSet23 = composite19.children();
        java.util.Set<examples.Composite> compositeSet24 = composite19.children();
        examples.Composite composite26 = new examples.Composite((int) (byte) -1);
        composite19.addChild(composite26);
        java.util.Set<examples.Composite> compositeSet28 = composite19.children();
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-6));
        composite1.addChild(composite6);
        examples.Composite composite9 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        composite1.addChild(composite9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        examples.Composite composite13 = new examples.Composite((int) (byte) 1);
        composite8.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        examples.Composite composite17 = new examples.Composite((-100));
        examples.Composite composite19 = new examples.Composite((-10));
        composite17.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        // The following exception was thrown during execution in test generation
        try {
            composite13.addChild(composite19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        java.util.Set<examples.Composite> compositeSet9 = composite3.children();
        examples.Composite composite11 = new examples.Composite((int) (byte) 0);
        composite3.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite3.children();
        java.util.Set<examples.Composite> compositeSet14 = composite3.children();
        java.util.Set<examples.Composite> compositeSet15 = composite3.children();
        java.util.Set<examples.Composite> compositeSet16 = composite3.children();
        examples.Composite composite18 = new examples.Composite((int) (short) -1);
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        examples.Composite composite21 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        composite18.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet25 = composite18.children();
        java.util.Set<examples.Composite> compositeSet26 = composite18.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite7 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        composite1.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet11 = composite7.children();
        java.lang.Class<?> wildcardClass12 = compositeSet11.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        examples.Composite composite1 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        examples.Composite composite9 = new examples.Composite(100);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite4.addChild(composite9);
        examples.Composite composite13 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        java.util.Set<examples.Composite> compositeSet16 = composite13.children();
        composite4.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet18 = composite4.children();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite11 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        composite1.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet16 = composite1.children();
        examples.Composite composite18 = new examples.Composite(2);
        examples.Composite composite20 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        composite18.addChild(composite20);
        examples.Composite composite25 = new examples.Composite((-5));
        composite20.addChild(composite25);
        examples.Composite composite28 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        composite25.addChild(composite28);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet29);
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite(2);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite3.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet10 = composite6.children();
        examples.Composite composite12 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite6.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet15 = composite6.children();
        java.util.Set<examples.Composite> compositeSet16 = composite6.children();
        java.util.Set<examples.Composite> compositeSet17 = composite6.children();
        examples.Composite composite19 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
        java.util.Set<examples.Composite> compositeSet23 = composite19.children();
        java.util.Set<examples.Composite> compositeSet24 = composite19.children();
        java.util.Set<examples.Composite> compositeSet25 = composite19.children();
        java.util.Set<examples.Composite> compositeSet26 = composite19.children();
        java.util.Set<examples.Composite> compositeSet27 = composite19.children();
        java.util.Set<examples.Composite> compositeSet28 = composite19.children();
        java.util.Set<examples.Composite> compositeSet29 = composite19.children();
        java.util.Set<examples.Composite> compositeSet30 = composite19.children();
        java.util.Set<examples.Composite> compositeSet31 = composite19.children();
        composite6.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet33 = composite19.children();
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet33);
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        examples.Composite composite1 = new examples.Composite(3);
        examples.Composite composite3 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite10 = new examples.Composite(100);
        composite1.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((int) (short) 1);
        composite8.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        examples.Composite composite15 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        java.util.Set<examples.Composite> compositeSet19 = composite15.children();
        composite11.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet21 = composite15.children();
        java.util.Set<examples.Composite> compositeSet22 = composite15.children();
        java.util.Set<examples.Composite> compositeSet23 = composite15.children();
        java.util.Set<examples.Composite> compositeSet24 = composite15.children();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        examples.Composite composite1 = new examples.Composite((-5));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        java.util.Set<examples.Composite> compositeSet8 = composite5.children();
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        examples.Composite composite13 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        composite1.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet17 = composite13.children();
        examples.Composite composite19 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
        composite13.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet24 = composite13.children();
        examples.Composite composite26 = new examples.Composite((-100));
        examples.Composite composite28 = new examples.Composite((-3));
        composite26.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet30 = composite28.children();
        java.util.Set<examples.Composite> compositeSet31 = composite28.children();
        examples.Composite composite33 = new examples.Composite(4);
        composite28.addChild(composite33);
        examples.Composite composite36 = new examples.Composite((int) (short) 100);
        composite33.addChild(composite36);
        java.util.Set<examples.Composite> compositeSet38 = composite33.children();
        java.util.Set<examples.Composite> compositeSet39 = composite33.children();
        // The following exception was thrown during execution in test generation
        try {
            composite13.addChild(composite33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet38);
        org.junit.Assert.assertNotNull(compositeSet39);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        examples.Composite composite1 = new examples.Composite(9);
        examples.Composite composite3 = new examples.Composite((int) (short) 10);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        java.util.Set<examples.Composite> compositeSet12 = composite1.children();
        java.util.Set<examples.Composite> compositeSet13 = composite1.children();
        examples.Composite composite15 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        examples.Composite composite18 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        composite15.addChild(composite18);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        java.util.Set<examples.Composite> compositeSet12 = composite1.children();
        examples.Composite composite14 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        composite1.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet18 = composite14.children();
        java.lang.Class<?> wildcardClass19 = compositeSet18.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-6));
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        java.util.Set<examples.Composite> compositeSet10 = composite6.children();
        examples.Composite composite12 = new examples.Composite((int) (byte) 1);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        composite6.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet17 = composite12.children();
        java.lang.Class<?> wildcardClass18 = compositeSet17.getClass();
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        composite4.addChild(composite11);
        examples.Composite composite16 = new examples.Composite((-9));
        composite11.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite11.children();
        examples.Composite composite20 = new examples.Composite(1);
        composite11.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet22 = composite11.children();
        examples.Composite composite24 = new examples.Composite((int) (byte) -1);
        composite11.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet26 = composite11.children();
        java.lang.Class<?> wildcardClass27 = compositeSet26.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((int) (byte) 100);
        composite1.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        java.util.Set<examples.Composite> compositeSet12 = composite1.children();
        java.util.Set<examples.Composite> compositeSet13 = composite1.children();
        java.util.Set<examples.Composite> compositeSet14 = composite1.children();
        java.util.Set<examples.Composite> compositeSet15 = composite1.children();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet10 = composite6.children();
        java.util.Set<examples.Composite> compositeSet11 = composite6.children();
        examples.Composite composite13 = new examples.Composite((-100));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        java.util.Set<examples.Composite> compositeSet19 = composite15.children();
        java.util.Set<examples.Composite> compositeSet20 = composite15.children();
        examples.Composite composite22 = new examples.Composite((int) (short) 0);
        composite15.addChild(composite22);
        examples.Composite composite25 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        composite22.addChild(composite25);
        examples.Composite composite29 = new examples.Composite((-5));
        java.util.Set<examples.Composite> compositeSet30 = composite29.children();
        java.util.Set<examples.Composite> compositeSet31 = composite29.children();
        java.util.Set<examples.Composite> compositeSet32 = composite29.children();
        java.util.Set<examples.Composite> compositeSet33 = composite29.children();
        composite22.addChild(composite29);
        // The following exception was thrown during execution in test generation
        try {
            composite6.addChild(composite22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet33);
    }
}

