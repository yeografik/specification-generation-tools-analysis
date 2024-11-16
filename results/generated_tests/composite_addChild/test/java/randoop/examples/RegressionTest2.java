package examples;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
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
        java.lang.Class<?> wildcardClass20 = composite7.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite4 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
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
        java.lang.Class<?> wildcardClass14 = composite12.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite7 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        composite1.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        java.lang.Class<?> wildcardClass12 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        examples.Composite composite1 = new examples.Composite(3);
        examples.Composite composite3 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        java.lang.Class<?> wildcardClass10 = compositeSet9.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet9 = composite5.children();
        java.lang.Class<?> wildcardClass10 = compositeSet9.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite(2);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite3.addChild(composite6);
        examples.Composite composite11 = new examples.Composite((int) (byte) -1);
        composite3.addChild(composite11);
        java.lang.Class<?> wildcardClass13 = composite3.getClass();
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite(2);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite3.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet10 = composite6.children();
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        examples.Composite composite17 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        composite12.addChild(composite17);
        examples.Composite composite22 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        composite12.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        // The following exception was thrown during execution in test generation
        try {
            composite6.addChild(composite22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        examples.Composite composite20 = new examples.Composite((-100));
        examples.Composite composite22 = new examples.Composite((-3));
        composite20.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        examples.Composite composite27 = new examples.Composite((-9));
        composite22.addChild(composite27);
        java.util.Set<examples.Composite> compositeSet29 = composite27.children();
        examples.Composite composite31 = new examples.Composite((int) '4');
        composite27.addChild(composite31);
        java.util.Set<examples.Composite> compositeSet33 = composite27.children();
        java.util.Set<examples.Composite> compositeSet34 = composite27.children();
        examples.Composite composite36 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet37 = composite36.children();
        java.util.Set<examples.Composite> compositeSet38 = composite36.children();
        composite27.addChild(composite36);
        examples.Composite composite41 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet42 = composite41.children();
        java.util.Set<examples.Composite> compositeSet43 = composite41.children();
        composite36.addChild(composite41);
        // The following exception was thrown during execution in test generation
        try {
            composite16.addChild(composite36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet37);
        org.junit.Assert.assertNotNull(compositeSet38);
        org.junit.Assert.assertNotNull(compositeSet42);
        org.junit.Assert.assertNotNull(compositeSet43);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite(4);
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite((int) (short) -1);
        examples.Composite composite14 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        composite12.addChild(composite14);
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet15);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        examples.Composite composite1 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((int) (byte) 1);
        examples.Composite composite10 = new examples.Composite(2);
        composite8.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite9 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite1.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet12 = composite1.children();
        java.util.Set<examples.Composite> compositeSet13 = composite1.children();
        examples.Composite composite15 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        java.util.Set<examples.Composite> compositeSet19 = composite15.children();
        java.util.Set<examples.Composite> compositeSet20 = composite15.children();
        java.util.Set<examples.Composite> compositeSet21 = composite15.children();
        examples.Composite composite23 = new examples.Composite((-7));
        composite15.addChild(composite23);
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
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        examples.Composite composite1 = new examples.Composite(3);
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        examples.Composite composite8 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        composite1.addChild(composite8);
        java.lang.Class<?> wildcardClass12 = composite8.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
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
        java.util.Set<examples.Composite> compositeSet16 = composite8.children();
        java.util.Set<examples.Composite> compositeSet17 = composite8.children();
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
        examples.Composite composite33 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet34 = composite33.children();
        java.util.Set<examples.Composite> compositeSet35 = composite33.children();
        composite30.addChild(composite33);
        java.util.Set<examples.Composite> compositeSet37 = composite30.children();
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet35);
        org.junit.Assert.assertNotNull(compositeSet37);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
        examples.Composite composite26 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        java.util.Set<examples.Composite> compositeSet28 = composite26.children();
        java.util.Set<examples.Composite> compositeSet29 = composite26.children();
        examples.Composite composite31 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet32 = composite31.children();
        java.util.Set<examples.Composite> compositeSet33 = composite31.children();
        composite26.addChild(composite31);
        examples.Composite composite36 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet37 = composite36.children();
        java.util.Set<examples.Composite> compositeSet38 = composite36.children();
        java.util.Set<examples.Composite> compositeSet39 = composite36.children();
        composite26.addChild(composite36);
        java.util.Set<examples.Composite> compositeSet41 = composite26.children();
        java.util.Set<examples.Composite> compositeSet42 = composite26.children();
        examples.Composite composite44 = new examples.Composite((int) (short) 10);
        composite26.addChild(composite44);
        // The following exception was thrown during execution in test generation
        try {
            composite19.addChild(composite44);
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
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet37);
        org.junit.Assert.assertNotNull(compositeSet38);
        org.junit.Assert.assertNotNull(compositeSet39);
        org.junit.Assert.assertNotNull(compositeSet41);
        org.junit.Assert.assertNotNull(compositeSet42);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
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
        examples.Composite composite19 = new examples.Composite(9);
        examples.Composite composite21 = new examples.Composite((int) (short) 10);
        composite19.addChild(composite21);
        // The following exception was thrown during execution in test generation
        try {
            composite12.addChild(composite21);
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
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        examples.Composite composite1 = new examples.Composite(3);
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite((int) (byte) 1);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite1.addChild(composite9);
        examples.Composite composite13 = new examples.Composite((int) '4');
        examples.Composite composite15 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        composite13.addChild(composite15);
        examples.Composite composite20 = new examples.Composite((int) (byte) 100);
        composite13.addChild(composite20);
        examples.Composite composite23 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        composite20.addChild(composite23);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite(2);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite3.addChild(composite6);
        examples.Composite composite11 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        examples.Composite composite16 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        composite11.addChild(composite16);
        examples.Composite composite21 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        composite11.addChild(composite21);
        examples.Composite composite25 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        java.util.Set<examples.Composite> compositeSet27 = composite25.children();
        composite11.addChild(composite25);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
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
        java.lang.Class<?> wildcardClass17 = composite15.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
        examples.Composite composite19 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        examples.Composite composite22 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        composite19.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet26 = composite19.children();
        examples.Composite composite28 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        composite19.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet31 = composite19.children();
        examples.Composite composite33 = new examples.Composite((-7));
        composite19.addChild(composite33);
        java.util.Set<examples.Composite> compositeSet35 = composite19.children();
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet35);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        examples.Composite composite1 = new examples.Composite(8);
        examples.Composite composite3 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        examples.Composite composite11 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite8.addChild(composite11);
        examples.Composite composite15 = new examples.Composite((-3));
        composite11.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        examples.Composite composite20 = new examples.Composite((int) (byte) 1);
        composite15.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet22 = composite15.children();
        java.util.Set<examples.Composite> compositeSet23 = composite15.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
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
        java.util.Set<examples.Composite> compositeSet16 = composite11.children();
        java.lang.Class<?> wildcardClass17 = compositeSet16.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        examples.Composite composite1 = new examples.Composite(5);
        examples.Composite composite3 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.lang.Class<?> wildcardClass7 = composite3.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        examples.Composite composite13 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        examples.Composite composite16 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        composite13.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet20 = composite16.children();
        java.util.Set<examples.Composite> compositeSet21 = composite16.children();
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
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-2));
        composite1.addChild(composite8);
        examples.Composite composite11 = new examples.Composite(7);
        composite1.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite1.children();
        java.util.Set<examples.Composite> compositeSet14 = composite1.children();
        java.lang.Class<?> wildcardClass15 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
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
        examples.Composite composite18 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        examples.Composite composite21 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        composite18.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet25 = composite18.children();
        examples.Composite composite27 = new examples.Composite(4);
        composite18.addChild(composite27);
        java.util.Set<examples.Composite> compositeSet29 = composite18.children();
        java.util.Set<examples.Composite> compositeSet30 = composite18.children();
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite18);
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
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        examples.Composite composite9 = new examples.Composite((-5));
        composite3.addChild(composite9);
        examples.Composite composite12 = new examples.Composite(6);
        composite9.addChild(composite12);
        examples.Composite composite15 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        examples.Composite composite20 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        composite15.addChild(composite20);
        examples.Composite composite25 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        java.util.Set<examples.Composite> compositeSet27 = composite25.children();
        java.util.Set<examples.Composite> compositeSet28 = composite25.children();
        composite15.addChild(composite25);
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        examples.Composite composite12 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite9.addChild(composite12);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        examples.Composite composite1 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(5);
        examples.Composite composite8 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        composite6.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet12 = composite8.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        examples.Composite composite9 = new examples.Composite((-5));
        composite3.addChild(composite9);
        examples.Composite composite12 = new examples.Composite(6);
        composite9.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        java.lang.Class<?> wildcardClass15 = compositeSet14.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
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
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        java.lang.Class<?> wildcardClass18 = composite15.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        examples.Composite composite1 = new examples.Composite(5);
        examples.Composite composite3 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.lang.Class<?> wildcardClass8 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        examples.Composite composite1 = new examples.Composite(9);
        examples.Composite composite3 = new examples.Composite((int) (short) 10);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-5));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        examples.Composite composite10 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        composite6.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet15 = composite6.children();
        java.util.Set<examples.Composite> compositeSet16 = composite6.children();
        java.util.Set<examples.Composite> compositeSet17 = composite6.children();
        java.util.Set<examples.Composite> compositeSet18 = composite6.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite10 = new examples.Composite(4);
        composite1.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        examples.Composite composite14 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        examples.Composite composite17 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        composite14.addChild(composite17);
        examples.Composite composite21 = new examples.Composite((-2));
        composite14.addChild(composite21);
        examples.Composite composite24 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        composite14.addChild(composite24);
        // The following exception was thrown during execution in test generation
        try {
            composite10.addChild(composite14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        examples.Composite composite14 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite14);
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
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
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
        examples.Composite composite21 = new examples.Composite((int) (byte) 100);
        composite11.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet23 = composite11.children();
        examples.Composite composite25 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        java.util.Set<examples.Composite> compositeSet27 = composite25.children();
        java.util.Set<examples.Composite> compositeSet28 = composite25.children();
        examples.Composite composite30 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet31 = composite30.children();
        java.util.Set<examples.Composite> compositeSet32 = composite30.children();
        composite25.addChild(composite30);
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite30);
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
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet32);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        examples.Composite composite1 = new examples.Composite((int) (byte) -1);
        examples.Composite composite2 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite(3);
        examples.Composite composite7 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        composite5.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet11 = composite5.children();
        java.util.Set<examples.Composite> compositeSet12 = composite5.children();
        java.util.Set<examples.Composite> compositeSet13 = composite5.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        examples.Composite composite1 = new examples.Composite((int) 'a');
        examples.Composite composite3 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        examples.Composite composite6 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite3.addChild(composite6);
        examples.Composite composite10 = new examples.Composite((-3));
        composite6.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        examples.Composite composite15 = new examples.Composite((int) (byte) 1);
        composite10.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet17 = composite10.children();
        java.util.Set<examples.Composite> compositeSet18 = composite10.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
        examples.Composite composite16 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        examples.Composite composite19 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        composite16.addChild(composite19);
        examples.Composite composite23 = new examples.Composite((-3));
        composite19.addChild(composite23);
        examples.Composite composite26 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        java.util.Set<examples.Composite> compositeSet28 = composite26.children();
        composite19.addChild(composite26);
        examples.Composite composite31 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet32 = composite31.children();
        composite26.addChild(composite31);
        // The following exception was thrown during execution in test generation
        try {
            composite12.addChild(composite26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet32);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        examples.Composite composite9 = new examples.Composite((-5));
        composite3.addChild(composite9);
        examples.Composite composite12 = new examples.Composite(6);
        composite9.addChild(composite12);
        examples.Composite composite15 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        examples.Composite composite18 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        composite15.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet21 = composite15.children();
        // The following exception was thrown during execution in test generation
        try {
            composite12.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
        java.util.Set<examples.Composite> compositeSet16 = composite8.children();
        java.lang.Class<?> wildcardClass17 = compositeSet16.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
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
        examples.Composite composite14 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        examples.Composite composite17 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        composite14.addChild(composite17);
        examples.Composite composite21 = new examples.Composite((-3));
        composite17.addChild(composite21);
        examples.Composite composite24 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        composite17.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet28 = composite24.children();
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        examples.Composite composite8 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite1.addChild(composite8);
        java.lang.Class<?> wildcardClass11 = composite8.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
        examples.Composite composite17 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        composite13.addChild(composite17);
        java.lang.Class<?> wildcardClass20 = composite17.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-6));
        composite1.addChild(composite6);
        examples.Composite composite9 = new examples.Composite((-100));
        examples.Composite composite11 = new examples.Composite((-3));
        composite9.addChild(composite11);
        examples.Composite composite14 = new examples.Composite((-8));
        composite9.addChild(composite14);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
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
        java.lang.Class<?> wildcardClass24 = composite22.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((int) (byte) 10);
        composite1.addChild(composite5);
        java.lang.Class<?> wildcardClass7 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
        examples.Composite composite19 = new examples.Composite((-100));
        examples.Composite composite21 = new examples.Composite((-3));
        composite19.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        java.util.Set<examples.Composite> compositeSet24 = composite21.children();
        java.util.Set<examples.Composite> compositeSet25 = composite21.children();
        java.util.Set<examples.Composite> compositeSet26 = composite21.children();
        examples.Composite composite28 = new examples.Composite((int) (short) 0);
        composite21.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet30 = composite21.children();
        // The following exception was thrown during execution in test generation
        try {
            composite16.addChild(composite21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet30);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        examples.Composite composite1 = new examples.Composite((-2));
        examples.Composite composite3 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite9 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite3.addChild(composite9);
        java.lang.Class<?> wildcardClass12 = composite3.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
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
        examples.Composite composite23 = new examples.Composite(9);
        examples.Composite composite25 = new examples.Composite((int) (short) 10);
        composite23.addChild(composite25);
        examples.Composite composite28 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        java.util.Set<examples.Composite> compositeSet30 = composite28.children();
        composite23.addChild(composite28);
        // The following exception was thrown during execution in test generation
        try {
            composite19.addChild(composite28);
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
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
        examples.Composite composite19 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        examples.Composite composite22 = new examples.Composite(8);
        composite19.addChild(composite22);
        examples.Composite composite25 = new examples.Composite((int) (short) 0);
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        composite22.addChild(composite25);
        examples.Composite composite29 = new examples.Composite(3);
        composite25.addChild(composite29);
        // The following exception was thrown during execution in test generation
        try {
            composite16.addChild(composite25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        examples.Composite composite1 = new examples.Composite((-5));
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        examples.Composite composite10 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        examples.Composite composite13 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        composite10.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet17 = composite13.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet17);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        examples.Composite composite1 = new examples.Composite(9);
        examples.Composite composite3 = new examples.Composite((int) (short) 10);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite12 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        examples.Composite composite15 = new examples.Composite(8);
        composite12.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        java.util.Set<examples.Composite> compositeSet19 = composite15.children();
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
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        examples.Composite composite7 = new examples.Composite((int) (byte) 10);
        composite1.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        java.lang.Class<?> wildcardClass11 = compositeSet10.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
        examples.Composite composite15 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        composite12.addChild(composite15);
        examples.Composite composite20 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        composite12.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet23 = composite20.children();
        java.util.Set<examples.Composite> compositeSet24 = composite20.children();
        java.util.Set<examples.Composite> compositeSet25 = composite20.children();
        java.lang.Class<?> wildcardClass26 = composite20.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        examples.Composite composite1 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        examples.Composite composite9 = new examples.Composite(100);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite4.addChild(composite9);
        examples.Composite composite13 = new examples.Composite((-9));
        examples.Composite composite15 = new examples.Composite((int) (byte) 1);
        composite13.addChild(composite15);
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(3);
        composite1.addChild(composite6);
        examples.Composite composite9 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        examples.Composite composite13 = new examples.Composite(4);
        composite9.addChild(composite13);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite3.children();
        java.util.Set<examples.Composite> compositeSet11 = composite3.children();
        examples.Composite composite13 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        examples.Composite composite16 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        composite13.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet20 = composite13.children();
        examples.Composite composite22 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        composite13.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet25 = composite13.children();
        examples.Composite composite27 = new examples.Composite((-7));
        composite13.addChild(composite27);
        java.util.Set<examples.Composite> compositeSet29 = composite27.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet29);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-100));
        examples.Composite composite6 = new examples.Composite((-3));
        composite4.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        examples.Composite composite11 = new examples.Composite((-9));
        composite6.addChild(composite11);
        examples.Composite composite14 = new examples.Composite((int) (short) 1);
        composite11.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet16 = composite11.children();
        java.util.Set<examples.Composite> compositeSet17 = composite11.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        examples.Composite composite1 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) '#');
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        examples.Composite composite8 = new examples.Composite((-100));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        examples.Composite composite14 = new examples.Composite((-9));
        composite10.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        java.util.Set<examples.Composite> compositeSet18 = composite14.children();
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        examples.Composite composite1 = new examples.Composite((int) (short) 0);
        java.lang.Class<?> wildcardClass2 = composite1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.lang.Class<?> wildcardClass7 = compositeSet6.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        examples.Composite composite1 = new examples.Composite(5);
        examples.Composite composite3 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        examples.Composite composite9 = new examples.Composite(5);
        examples.Composite composite11 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        composite9.addChild(composite11);
        examples.Composite composite16 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        composite9.addChild(composite16);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet17);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
        java.lang.Class<?> wildcardClass15 = composite12.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        examples.Composite composite1 = new examples.Composite(5);
        examples.Composite composite3 = new examples.Composite((-7));
        composite1.addChild(composite3);
        java.lang.Class<?> wildcardClass5 = composite1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        examples.Composite composite1 = new examples.Composite((-9));
        examples.Composite composite3 = new examples.Composite((int) (byte) 1);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-100));
        examples.Composite composite8 = new examples.Composite((-3));
        composite6.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        examples.Composite composite13 = new examples.Composite((-9));
        composite8.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        examples.Composite composite17 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        composite13.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet21 = composite17.children();
        java.util.Set<examples.Composite> compositeSet22 = composite17.children();
        examples.Composite composite24 = new examples.Composite((int) (short) 10);
        composite17.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet26 = composite17.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        java.lang.Class<?> wildcardClass10 = compositeSet9.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        examples.Composite composite7 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        composite4.addChild(composite7);
        examples.Composite composite12 = new examples.Composite((-100));
        examples.Composite composite14 = new examples.Composite((-3));
        composite12.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        examples.Composite composite19 = new examples.Composite((-9));
        composite14.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        examples.Composite composite23 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        java.util.Set<examples.Composite> compositeSet25 = composite23.children();
        composite19.addChild(composite23);
        java.util.Set<examples.Composite> compositeSet27 = composite23.children();
        java.util.Set<examples.Composite> compositeSet28 = composite23.children();
        examples.Composite composite30 = new examples.Composite((int) (short) 10);
        composite23.addChild(composite30);
        // The following exception was thrown during execution in test generation
        try {
            composite7.addChild(composite23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        examples.Composite composite1 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        examples.Composite composite9 = new examples.Composite(100);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite4.addChild(composite9);
        java.lang.Class<?> wildcardClass12 = composite4.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-2));
        composite1.addChild(composite8);
        examples.Composite composite11 = new examples.Composite(7);
        composite1.addChild(composite11);
        java.lang.Class<?> wildcardClass13 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        examples.Composite composite7 = new examples.Composite((int) (byte) 10);
        composite1.addChild(composite7);
        examples.Composite composite10 = new examples.Composite((-6));
        composite1.addChild(composite10);
        examples.Composite composite13 = new examples.Composite(3);
        examples.Composite composite15 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        composite13.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet18 = composite13.children();
        java.util.Set<examples.Composite> compositeSet19 = composite13.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite((-100));
        examples.Composite composite14 = new examples.Composite((-3));
        composite12.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        java.util.Set<examples.Composite> compositeSet18 = composite14.children();
        java.util.Set<examples.Composite> compositeSet19 = composite14.children();
        java.util.Set<examples.Composite> compositeSet20 = composite14.children();
        java.util.Set<examples.Composite> compositeSet21 = composite14.children();
        examples.Composite composite23 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        java.util.Set<examples.Composite> compositeSet25 = composite23.children();
        java.util.Set<examples.Composite> compositeSet26 = composite23.children();
        java.util.Set<examples.Composite> compositeSet27 = composite23.children();
        composite14.addChild(composite23);
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        examples.Composite composite1 = new examples.Composite(5);
        examples.Composite composite3 = new examples.Composite((-7));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        java.util.Set<examples.Composite> compositeSet10 = composite6.children();
        java.util.Set<examples.Composite> compositeSet11 = composite6.children();
        java.util.Set<examples.Composite> compositeSet12 = composite6.children();
        examples.Composite composite14 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        composite6.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet17 = composite6.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet17);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
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
        examples.Composite composite15 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        composite12.addChild(composite15);
        examples.Composite composite20 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        composite12.addChild(composite20);
        examples.Composite composite24 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        composite12.addChild(composite24);
        java.lang.Class<?> wildcardClass28 = composite12.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
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
        java.lang.Class<?> wildcardClass22 = compositeSet21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.lang.Class<?> wildcardClass6 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        examples.Composite composite1 = new examples.Composite((-9));
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
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        examples.Composite composite7 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        examples.Composite composite10 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        composite7.addChild(composite10);
        examples.Composite composite14 = new examples.Composite((-2));
        composite7.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        examples.Composite composite18 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        composite14.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet21 = composite14.children();
        java.util.Set<examples.Composite> compositeSet22 = composite14.children();
        java.util.Set<examples.Composite> compositeSet23 = composite14.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        examples.Composite composite23 = new examples.Composite((-3));
        composite21.addChild(composite23);
        java.util.Set<examples.Composite> compositeSet25 = composite23.children();
        java.util.Set<examples.Composite> compositeSet26 = composite23.children();
        examples.Composite composite28 = new examples.Composite((-9));
        composite23.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet30 = composite28.children();
        examples.Composite composite32 = new examples.Composite((int) '4');
        composite28.addChild(composite32);
        examples.Composite composite35 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet36 = composite35.children();
        java.util.Set<examples.Composite> compositeSet37 = composite35.children();
        composite32.addChild(composite35);
        java.util.Set<examples.Composite> compositeSet39 = composite32.children();
        // The following exception was thrown during execution in test generation
        try {
            composite16.addChild(composite32);
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
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet36);
        org.junit.Assert.assertNotNull(compositeSet37);
        org.junit.Assert.assertNotNull(compositeSet39);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        examples.Composite composite1 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((int) (byte) 0);
        composite1.addChild(composite5);
        examples.Composite composite8 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        examples.Composite composite13 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        composite8.addChild(composite13);
        examples.Composite composite17 = new examples.Composite(10);
        composite13.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet19 = composite13.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.lang.Class<?> wildcardClass8 = compositeSet7.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        examples.Composite composite7 = new examples.Composite((int) (short) 0);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        composite4.addChild(composite7);
        examples.Composite composite11 = new examples.Composite(0);
        examples.Composite composite13 = new examples.Composite((int) (short) 1);
        composite11.addChild(composite13);
        // The following exception was thrown during execution in test generation
        try {
            composite7.addChild(composite13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet8);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
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
        examples.Composite composite20 = new examples.Composite((-100));
        examples.Composite composite22 = new examples.Composite((-3));
        composite20.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        java.util.Set<examples.Composite> compositeSet26 = composite22.children();
        java.util.Set<examples.Composite> compositeSet27 = composite22.children();
        java.util.Set<examples.Composite> compositeSet28 = composite22.children();
        examples.Composite composite30 = new examples.Composite((int) (byte) 0);
        composite22.addChild(composite30);
        // The following exception was thrown during execution in test generation
        try {
            composite14.addChild(composite22);
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
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-2));
        composite1.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        examples.Composite composite13 = new examples.Composite((int) '4');
        examples.Composite composite15 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        composite13.addChild(composite15);
        examples.Composite composite20 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        composite13.addChild(composite20);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
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
        java.util.Set<examples.Composite> compositeSet16 = composite8.children();
        java.util.Set<examples.Composite> compositeSet17 = composite8.children();
        examples.Composite composite19 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        examples.Composite composite22 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        composite19.addChild(composite22);
        examples.Composite composite26 = new examples.Composite((-3));
        composite22.addChild(composite26);
        java.util.Set<examples.Composite> compositeSet28 = composite26.children();
        java.util.Set<examples.Composite> compositeSet29 = composite26.children();
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        examples.Composite composite1 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        examples.Composite composite9 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        examples.Composite composite14 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        composite9.addChild(composite14);
        examples.Composite composite18 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        composite14.addChild(composite18);
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        examples.Composite composite1 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        examples.Composite composite1 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((int) (byte) 1);
        examples.Composite composite7 = new examples.Composite(2);
        composite5.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet9);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        examples.Composite composite1 = new examples.Composite(3);
        examples.Composite composite3 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        examples.Composite composite13 = new examples.Composite(3);
        composite8.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        java.util.Set<examples.Composite> compositeSet16 = composite13.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        examples.Composite composite10 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        composite4.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet13 = composite4.children();
        java.util.Set<examples.Composite> compositeSet14 = composite4.children();
        java.lang.Class<?> wildcardClass15 = compositeSet14.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.lang.Class<?> wildcardClass7 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
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
        examples.Composite composite15 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        examples.Composite composite20 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        composite15.addChild(composite20);
        examples.Composite composite25 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        composite15.addChild(composite25);
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        examples.Composite composite7 = new examples.Composite(8);
        composite4.addChild(composite7);
        examples.Composite composite10 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        composite7.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet14 = composite7.children();
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
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite(2);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        examples.Composite composite8 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        composite1.addChild(composite8);
        examples.Composite composite13 = new examples.Composite((-10));
        examples.Composite composite15 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        composite13.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet20 = composite15.children();
        java.util.Set<examples.Composite> compositeSet21 = composite15.children();
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        examples.Composite composite10 = new examples.Composite((int) (short) 0);
        composite3.addChild(composite10);
        examples.Composite composite13 = new examples.Composite((-100));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        examples.Composite composite20 = new examples.Composite((-9));
        composite15.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        examples.Composite composite24 = new examples.Composite((int) '4');
        composite20.addChild(composite24);
        examples.Composite composite27 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet28 = composite27.children();
        composite20.addChild(composite27);
        examples.Composite composite31 = new examples.Composite((-100));
        composite27.addChild(composite31);
        // The following exception was thrown during execution in test generation
        try {
            composite10.addChild(composite27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        composite1.addChild(composite5);
        examples.Composite composite10 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        examples.Composite composite15 = new examples.Composite(3);
        composite10.addChild(composite15);
        // The following exception was thrown during execution in test generation
        try {
            composite5.addChild(composite10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        examples.Composite composite1 = new examples.Composite((-1));
        examples.Composite composite3 = new examples.Composite(100);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.lang.Class<?> wildcardClass6 = compositeSet5.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        examples.Composite composite1 = new examples.Composite(5);
        examples.Composite composite3 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        examples.Composite composite11 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        composite8.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet15 = composite11.children();
        java.util.Set<examples.Composite> compositeSet16 = composite11.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
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
        java.util.Set<examples.Composite> compositeSet16 = composite8.children();
        java.util.Set<examples.Composite> compositeSet17 = composite8.children();
        examples.Composite composite19 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
        composite8.addChild(composite19);
        examples.Composite composite25 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        composite19.addChild(composite25);
        java.lang.Class<?> wildcardClass28 = composite25.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        examples.Composite composite1 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        examples.Composite composite8 = new examples.Composite((int) ' ');
        composite5.addChild(composite8);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet6);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        examples.Composite composite1 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        examples.Composite composite14 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        composite9.addChild(composite14);
        examples.Composite composite19 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        composite9.addChild(composite19);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet20);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        examples.Composite composite1 = new examples.Composite((-5));
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite7 = new examples.Composite(2);
        composite1.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        examples.Composite composite12 = new examples.Composite((-5));
        examples.Composite composite14 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        composite12.addChild(composite14);
        examples.Composite composite18 = new examples.Composite(2);
        composite12.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        java.util.Set<examples.Composite> compositeSet21 = composite18.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        examples.Composite composite1 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        examples.Composite composite9 = new examples.Composite(100);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite4.addChild(composite9);
        examples.Composite composite13 = new examples.Composite(3);
        examples.Composite composite15 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        composite13.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet19 = composite15.children();
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        examples.Composite composite1 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.lang.Class<?> wildcardClass9 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.lang.Class<?> wildcardClass9 = compositeSet8.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite9 = new examples.Composite((-100));
        examples.Composite composite11 = new examples.Composite((-3));
        composite9.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        examples.Composite composite16 = new examples.Composite(4);
        composite11.addChild(composite16);
        examples.Composite composite19 = new examples.Composite((int) (short) 100);
        composite16.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
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
        java.lang.Class<?> wildcardClass19 = composite16.getClass();
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((int) (short) 1);
        composite8.addChild(composite11);
        examples.Composite composite14 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        examples.Composite composite19 = new examples.Composite(3);
        composite14.addChild(composite19);
        examples.Composite composite22 = new examples.Composite(5);
        composite19.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite19.children();
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
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
        java.util.Set<examples.Composite> compositeSet16 = composite8.children();
        java.util.Set<examples.Composite> compositeSet17 = composite8.children();
        java.lang.Class<?> wildcardClass18 = compositeSet17.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((int) (short) 1);
        composite8.addChild(composite11);
        examples.Composite composite14 = new examples.Composite((-100));
        examples.Composite composite16 = new examples.Composite((-3));
        composite14.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite14.children();
        java.util.Set<examples.Composite> compositeSet19 = composite14.children();
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        examples.Composite composite1 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) '#');
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        examples.Composite composite8 = new examples.Composite(5);
        examples.Composite composite10 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        composite8.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet14 = composite10.children();
        java.util.Set<examples.Composite> compositeSet15 = composite10.children();
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
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
        examples.Composite composite15 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        examples.Composite composite18 = new examples.Composite(8);
        composite15.addChild(composite18);
        examples.Composite composite21 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        composite18.addChild(composite21);
        examples.Composite composite25 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        java.util.Set<examples.Composite> compositeSet27 = composite25.children();
        java.util.Set<examples.Composite> compositeSet28 = composite25.children();
        java.util.Set<examples.Composite> compositeSet29 = composite25.children();
        java.util.Set<examples.Composite> compositeSet30 = composite25.children();
        composite21.addChild(composite25);
        // The following exception was thrown during execution in test generation
        try {
            composite12.addChild(composite25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
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
        examples.Composite composite13 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        composite3.addChild(composite13);
        examples.Composite composite17 = new examples.Composite((int) '4');
        examples.Composite composite19 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        composite17.addChild(composite19);
        examples.Composite composite24 = new examples.Composite((int) (byte) 100);
        composite17.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet26 = composite17.children();
        java.util.Set<examples.Composite> compositeSet27 = composite17.children();
        java.util.Set<examples.Composite> compositeSet28 = composite17.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite17);
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
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
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
        examples.Composite composite21 = new examples.Composite((int) (byte) 100);
        composite11.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        examples.Composite composite25 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        examples.Composite composite28 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        composite25.addChild(composite28);
        examples.Composite composite32 = new examples.Composite((-2));
        composite25.addChild(composite32);
        java.util.Set<examples.Composite> compositeSet34 = composite32.children();
        examples.Composite composite36 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet37 = composite36.children();
        composite32.addChild(composite36);
        java.util.Set<examples.Composite> compositeSet39 = composite32.children();
        java.util.Set<examples.Composite> compositeSet40 = composite32.children();
        // The following exception was thrown during execution in test generation
        try {
            composite21.addChild(composite32);
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
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet37);
        org.junit.Assert.assertNotNull(compositeSet39);
        org.junit.Assert.assertNotNull(compositeSet40);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        examples.Composite composite1 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        examples.Composite composite11 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite8.addChild(composite11);
        examples.Composite composite15 = new examples.Composite((-2));
        composite8.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet17);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(1);
        composite1.addChild(composite6);
        java.lang.Class<?> wildcardClass8 = composite6.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-1));
        examples.Composite composite7 = new examples.Composite(100);
        composite5.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet9);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
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
        java.lang.Class<?> wildcardClass19 = composite14.getClass();
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((int) '4');
        examples.Composite composite10 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        composite8.addChild(composite10);
        examples.Composite composite15 = new examples.Composite((int) (byte) 100);
        composite8.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet17 = composite8.children();
        java.util.Set<examples.Composite> compositeSet18 = composite8.children();
        java.util.Set<examples.Composite> compositeSet19 = composite8.children();
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        java.util.Set<examples.Composite> compositeSet10 = composite7.children();
        composite3.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet12 = composite3.children();
        java.lang.Class<?> wildcardClass13 = compositeSet12.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
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
        java.lang.Class<?> wildcardClass26 = composite17.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite(2);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite3.addChild(composite6);
        examples.Composite composite11 = new examples.Composite((int) (byte) -1);
        composite3.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.lang.Class<?> wildcardClass14 = composite11.getClass();
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite10 = new examples.Composite(4);
        composite1.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite1.children();
        examples.Composite composite14 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        composite1.addChild(composite14);
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
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet36);
        org.junit.Assert.assertNotNull(compositeSet37);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        java.lang.Class<?> wildcardClass10 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        examples.Composite composite1 = new examples.Composite(9);
        examples.Composite composite3 = new examples.Composite((int) (short) 10);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite11 = new examples.Composite((-100));
        examples.Composite composite13 = new examples.Composite((-3));
        composite11.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        java.util.Set<examples.Composite> compositeSet16 = composite13.children();
        java.util.Set<examples.Composite> compositeSet17 = composite13.children();
        java.util.Set<examples.Composite> compositeSet18 = composite13.children();
        java.util.Set<examples.Composite> compositeSet19 = composite13.children();
        java.util.Set<examples.Composite> compositeSet20 = composite13.children();
        examples.Composite composite22 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        java.util.Set<examples.Composite> compositeSet26 = composite22.children();
        composite13.addChild(composite22);
        // The following exception was thrown during execution in test generation
        try {
            composite6.addChild(composite22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        examples.Composite composite1 = new examples.Composite(3);
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
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite1.addChild(composite9);
        examples.Composite composite13 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        examples.Composite composite16 = new examples.Composite(8);
        composite13.addChild(composite16);
        examples.Composite composite19 = new examples.Composite((int) (short) 0);
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        composite16.addChild(composite19);
        examples.Composite composite23 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        java.util.Set<examples.Composite> compositeSet25 = composite23.children();
        java.util.Set<examples.Composite> compositeSet26 = composite23.children();
        java.util.Set<examples.Composite> compositeSet27 = composite23.children();
        java.util.Set<examples.Composite> compositeSet28 = composite23.children();
        composite16.addChild(composite23);
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(3);
        composite1.addChild(composite6);
        examples.Composite composite9 = new examples.Composite((-7));
        composite1.addChild(composite9);
        examples.Composite composite12 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        examples.Composite composite17 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        composite12.addChild(composite17);
        examples.Composite composite21 = new examples.Composite(10);
        composite17.addChild(composite21);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        examples.Composite composite1 = new examples.Composite((-1));
        examples.Composite composite3 = new examples.Composite(100);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-1));
        examples.Composite composite9 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite7.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
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
        java.lang.Class<?> wildcardClass23 = composite1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
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
        java.lang.Class<?> wildcardClass15 = composite11.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite(4);
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.lang.Class<?> wildcardClass11 = compositeSet10.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((int) (byte) 10);
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.lang.Class<?> wildcardClass8 = compositeSet7.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        examples.Composite composite1 = new examples.Composite(3);
        examples.Composite composite3 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.lang.Class<?> wildcardClass7 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet10 = composite6.children();
        examples.Composite composite12 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        examples.Composite composite15 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        composite12.addChild(composite15);
        examples.Composite composite20 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        composite12.addChild(composite20);
        // The following exception was thrown during execution in test generation
        try {
            composite6.addChild(composite20);
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
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        examples.Composite composite10 = new examples.Composite((int) (short) 0);
        composite3.addChild(composite10);
        examples.Composite composite13 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        examples.Composite composite17 = new examples.Composite(4);
        composite13.addChild(composite17);
        examples.Composite composite20 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        java.util.Set<examples.Composite> compositeSet23 = composite20.children();
        composite13.addChild(composite20);
        // The following exception was thrown during execution in test generation
        try {
            composite10.addChild(composite13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
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
        examples.Composite composite15 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        composite12.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet19 = composite15.children();
        java.util.Set<examples.Composite> compositeSet20 = composite15.children();
        examples.Composite composite22 = new examples.Composite(5);
        examples.Composite composite24 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        composite22.addChild(composite24);
        examples.Composite composite29 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet30 = composite29.children();
        composite22.addChild(composite29);
        // The following exception was thrown during execution in test generation
        try {
            composite15.addChild(composite22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet30);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
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
        java.util.Set<examples.Composite> compositeSet14 = composite9.children();
        java.util.Set<examples.Composite> compositeSet15 = composite9.children();
        java.util.Set<examples.Composite> compositeSet16 = composite9.children();
        examples.Composite composite18 = new examples.Composite((-100));
        examples.Composite composite20 = new examples.Composite((-3));
        composite18.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        java.util.Set<examples.Composite> compositeSet23 = composite20.children();
        java.util.Set<examples.Composite> compositeSet24 = composite20.children();
        java.util.Set<examples.Composite> compositeSet25 = composite20.children();
        java.util.Set<examples.Composite> compositeSet26 = composite20.children();
        examples.Composite composite28 = new examples.Composite((int) (byte) 0);
        composite20.addChild(composite28);
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        examples.Composite composite7 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        composite4.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet11 = composite4.children();
        examples.Composite composite13 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        composite4.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet16 = composite4.children();
        examples.Composite composite18 = new examples.Composite((-7));
        composite4.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet20 = composite4.children();
        java.util.Set<examples.Composite> compositeSet21 = composite4.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-2));
        composite1.addChild(composite8);
        examples.Composite composite11 = new examples.Composite(7);
        composite1.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite1.children();
        examples.Composite composite15 = new examples.Composite((-100));
        examples.Composite composite17 = new examples.Composite((-3));
        composite15.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        examples.Composite composite21 = new examples.Composite((-9));
        composite17.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        java.util.Set<examples.Composite> compositeSet24 = composite21.children();
        examples.Composite composite26 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        composite21.addChild(composite26);
        java.util.Set<examples.Composite> compositeSet29 = composite26.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet29);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        java.util.Set<examples.Composite> compositeSet10 = composite7.children();
        composite3.addChild(composite7);
        examples.Composite composite13 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        examples.Composite composite16 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        composite13.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet20 = composite13.children();
        examples.Composite composite22 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        composite13.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet25 = composite13.children();
        examples.Composite composite27 = new examples.Composite((-7));
        composite13.addChild(composite27);
        java.util.Set<examples.Composite> compositeSet29 = composite13.children();
        java.util.Set<examples.Composite> compositeSet30 = composite13.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        java.lang.Class<?> wildcardClass7 = composite4.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite1.addChild(composite9);
        examples.Composite composite13 = new examples.Composite((-100));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        examples.Composite composite20 = new examples.Composite((-9));
        composite15.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        examples.Composite composite24 = new examples.Composite((int) '4');
        composite20.addChild(composite24);
        examples.Composite composite27 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet28 = composite27.children();
        java.util.Set<examples.Composite> compositeSet29 = composite27.children();
        composite24.addChild(composite27);
        examples.Composite composite32 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet33 = composite32.children();
        composite24.addChild(composite32);
        examples.Composite composite36 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet37 = composite36.children();
        java.util.Set<examples.Composite> compositeSet38 = composite36.children();
        composite24.addChild(composite36);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet37);
        org.junit.Assert.assertNotNull(compositeSet38);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        examples.Composite composite1 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) ' ');
        composite1.addChild(composite4);
        examples.Composite composite7 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        examples.Composite composite10 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        composite7.addChild(composite10);
        examples.Composite composite15 = new examples.Composite((int) (short) 1);
        composite10.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        examples.Composite composite19 = new examples.Composite((-1));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        composite15.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
        examples.Composite composite24 = new examples.Composite(2);
        composite19.addChild(composite24);
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite11 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite1.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        examples.Composite composite16 = new examples.Composite((-1));
        examples.Composite composite18 = new examples.Composite(100);
        composite16.addChild(composite18);
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite16);
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
        org.junit.Assert.assertNotNull(compositeSet14);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        java.util.Set<examples.Composite> compositeSet15 = composite7.children();
        java.lang.Class<?> wildcardClass16 = composite7.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
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
        examples.Composite composite17 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        composite13.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet20 = composite17.children();
        examples.Composite composite22 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        examples.Composite composite26 = new examples.Composite((int) (byte) 0);
        composite22.addChild(composite26);
        java.util.Set<examples.Composite> compositeSet28 = composite22.children();
        java.util.Set<examples.Composite> compositeSet29 = composite22.children();
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
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
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
        java.util.Set<examples.Composite> compositeSet18 = composite8.children();
        examples.Composite composite20 = new examples.Composite(2);
        composite8.addChild(composite20);
        examples.Composite composite23 = new examples.Composite(0);
        examples.Composite composite25 = new examples.Composite((int) (short) 1);
        composite23.addChild(composite25);
        java.util.Set<examples.Composite> compositeSet27 = composite25.children();
        // The following exception was thrown during execution in test generation
        try {
            composite20.addChild(composite25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet27);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        examples.Composite composite1 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((int) (byte) 0);
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite10 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        examples.Composite composite15 = new examples.Composite(1);
        composite10.addChild(composite15);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite10);
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
        org.junit.Assert.assertNotNull(compositeSet13);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
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
        java.lang.Class<?> wildcardClass16 = composite13.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
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
        java.lang.Class<?> wildcardClass18 = composite16.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.lang.Class<?> wildcardClass9 = compositeSet8.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
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
        examples.Composite composite20 = new examples.Composite(2);
        examples.Composite composite22 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        composite20.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet26 = composite22.children();
        examples.Composite composite28 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        composite22.addChild(composite28);
        // The following exception was thrown during execution in test generation
        try {
            composite15.addChild(composite22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet29);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
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
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        examples.Composite composite15 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        examples.Composite composite18 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        composite15.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet21 = composite15.children();
        examples.Composite composite23 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        composite15.addChild(composite23);
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite23);
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
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
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
        examples.Composite composite16 = new examples.Composite((-100));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        examples.Composite composite22 = new examples.Composite((-9));
        composite18.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        examples.Composite composite27 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet28 = composite27.children();
        composite22.addChild(composite27);
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        examples.Composite composite1 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.lang.Class<?> wildcardClass4 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite(2);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.lang.Class<?> wildcardClass7 = compositeSet6.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
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
        examples.Composite composite32 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet33 = composite32.children();
        java.util.Set<examples.Composite> compositeSet34 = composite32.children();
        composite23.addChild(composite32);
        examples.Composite composite37 = new examples.Composite(6);
        composite23.addChild(composite37);
        // The following exception was thrown during execution in test generation
        try {
            composite12.addChild(composite37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet34);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        examples.Composite composite1 = new examples.Composite(5);
        examples.Composite composite3 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        examples.Composite composite13 = new examples.Composite(4);
        composite9.addChild(composite13);
        examples.Composite composite16 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        composite9.addChild(composite16);
        examples.Composite composite22 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        composite9.addChild(composite22);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite1.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        java.lang.Class<?> wildcardClass13 = composite9.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
        examples.Composite composite13 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        composite3.addChild(composite13);
        java.lang.Class<?> wildcardClass16 = composite3.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        java.util.Set<examples.Composite> compositeSet10 = composite7.children();
        composite3.addChild(composite7);
        examples.Composite composite13 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        examples.Composite composite17 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        composite13.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet21 = composite17.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        java.lang.Class<?> wildcardClass9 = composite4.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        examples.Composite composite1 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite(4);
        composite1.addChild(composite5);
        examples.Composite composite8 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        examples.Composite composite11 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        composite8.addChild(composite11);
        examples.Composite composite16 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        composite8.addChild(composite16);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet17);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        examples.Composite composite10 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        composite4.addChild(composite10);
        examples.Composite composite14 = new examples.Composite((int) (short) -1);
        examples.Composite composite16 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        composite14.addChild(composite16);
        examples.Composite composite20 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        composite14.addChild(composite20);
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        examples.Composite composite10 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        composite4.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet13 = composite4.children();
        java.util.Set<examples.Composite> compositeSet14 = composite4.children();
        java.util.Set<examples.Composite> compositeSet15 = composite4.children();
        java.lang.Class<?> wildcardClass16 = compositeSet15.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
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
        java.util.Set<examples.Composite> compositeSet14 = composite9.children();
        java.util.Set<examples.Composite> compositeSet15 = composite9.children();
        java.lang.Class<?> wildcardClass16 = compositeSet15.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((int) (short) 1);
        composite8.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite8.children();
        examples.Composite composite15 = new examples.Composite((int) '4');
        examples.Composite composite17 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        composite15.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet21 = composite17.children();
        examples.Composite composite23 = new examples.Composite((-5));
        composite17.addChild(composite23);
        java.util.Set<examples.Composite> compositeSet25 = composite23.children();
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
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
        java.util.Set<examples.Composite> compositeSet16 = composite8.children();
        examples.Composite composite18 = new examples.Composite((int) '#');
        composite8.addChild(composite18);
        examples.Composite composite21 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        java.util.Set<examples.Composite> compositeSet24 = composite21.children();
        examples.Composite composite26 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        java.util.Set<examples.Composite> compositeSet28 = composite26.children();
        composite21.addChild(composite26);
        examples.Composite composite31 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet32 = composite31.children();
        java.util.Set<examples.Composite> compositeSet33 = composite31.children();
        java.util.Set<examples.Composite> compositeSet34 = composite31.children();
        composite21.addChild(composite31);
        java.util.Set<examples.Composite> compositeSet36 = composite31.children();
        java.util.Set<examples.Composite> compositeSet37 = composite31.children();
        // The following exception was thrown during execution in test generation
        try {
            composite18.addChild(composite31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet36);
        org.junit.Assert.assertNotNull(compositeSet37);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite1.addChild(composite8);
        examples.Composite composite12 = new examples.Composite((int) '4');
        composite8.addChild(composite12);
        java.lang.Class<?> wildcardClass14 = composite12.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        java.lang.Class<?> wildcardClass14 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
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
        examples.Composite composite14 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        examples.Composite composite18 = new examples.Composite((int) (byte) 0);
        composite14.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet20 = composite14.children();
        examples.Composite composite22 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        composite14.addChild(composite22);
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        examples.Composite composite7 = new examples.Composite((int) (byte) 10);
        composite1.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        examples.Composite composite11 = new examples.Composite(3);
        examples.Composite composite13 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        composite11.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet16 = composite11.children();
        java.util.Set<examples.Composite> compositeSet17 = composite11.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
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
        examples.Composite composite17 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        java.util.Set<examples.Composite> compositeSet20 = composite17.children();
        examples.Composite composite22 = new examples.Composite((int) (short) 0);
        composite17.addChild(composite22);
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite17);
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
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
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
        java.util.Set<examples.Composite> compositeSet18 = composite8.children();
        java.util.Set<examples.Composite> compositeSet19 = composite8.children();
        java.util.Set<examples.Composite> compositeSet20 = composite8.children();
        examples.Composite composite22 = new examples.Composite((int) '4');
        examples.Composite composite24 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        composite22.addChild(composite24);
        examples.Composite composite29 = new examples.Composite((int) (byte) 100);
        composite22.addChild(composite29);
        java.util.Set<examples.Composite> compositeSet31 = composite22.children();
        java.util.Set<examples.Composite> compositeSet32 = composite22.children();
        java.util.Set<examples.Composite> compositeSet33 = composite22.children();
        java.util.Set<examples.Composite> compositeSet34 = composite22.children();
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet34);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        examples.Composite composite1 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
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
        examples.Composite composite21 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        examples.Composite composite24 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        composite21.addChild(composite24);
        examples.Composite composite28 = new examples.Composite((-2));
        composite21.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet30 = composite28.children();
        java.util.Set<examples.Composite> compositeSet31 = composite28.children();
        java.util.Set<examples.Composite> compositeSet32 = composite28.children();
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite28);
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
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet32);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite10 = new examples.Composite(4);
        composite1.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        java.lang.Class<?> wildcardClass14 = composite10.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
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
        examples.Composite composite22 = new examples.Composite((-9));
        composite18.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite18.children();
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.lang.Class<?> wildcardClass8 = compositeSet7.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        examples.Composite composite1 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.lang.Class<?> wildcardClass8 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        examples.Composite composite1 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite(4);
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        examples.Composite composite8 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite5.addChild(composite8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet7);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        examples.Composite composite1 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-100));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        examples.Composite composite15 = new examples.Composite(4);
        composite10.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        java.util.Set<examples.Composite> compositeSet19 = composite15.children();
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
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
        java.lang.Class<?> wildcardClass18 = composite1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.lang.Class<?> wildcardClass6 = compositeSet5.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
        examples.Composite composite15 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        examples.Composite composite19 = new examples.Composite(4);
        composite15.addChild(composite19);
        examples.Composite composite22 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        composite15.addChild(composite22);
        examples.Composite composite28 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        java.util.Set<examples.Composite> compositeSet30 = composite28.children();
        java.util.Set<examples.Composite> compositeSet31 = composite28.children();
        composite15.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet33 = composite28.children();
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
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet33);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite(2);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite3.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet10 = composite6.children();
        examples.Composite composite12 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        examples.Composite composite16 = new examples.Composite((-6));
        composite12.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        // The following exception was thrown during execution in test generation
        try {
            composite6.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        examples.Composite composite7 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        examples.Composite composite11 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        java.util.Set<examples.Composite> compositeSet15 = composite11.children();
        java.util.Set<examples.Composite> compositeSet16 = composite11.children();
        java.util.Set<examples.Composite> compositeSet17 = composite11.children();
        composite7.addChild(composite11);
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        examples.Composite composite1 = new examples.Composite((-5));
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite7 = new examples.Composite((-100));
        examples.Composite composite9 = new examples.Composite((-3));
        composite7.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        examples.Composite composite14 = new examples.Composite((-9));
        composite9.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        examples.Composite composite18 = new examples.Composite((int) '4');
        composite14.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet20 = composite14.children();
        java.util.Set<examples.Composite> compositeSet21 = composite14.children();
        examples.Composite composite23 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        java.util.Set<examples.Composite> compositeSet25 = composite23.children();
        composite14.addChild(composite23);
        examples.Composite composite28 = new examples.Composite(6);
        composite14.addChild(composite28);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
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
        examples.Composite composite18 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        examples.Composite composite21 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        composite18.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet25 = composite21.children();
        java.util.Set<examples.Composite> compositeSet26 = composite21.children();
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        examples.Composite composite1 = new examples.Composite(5);
        examples.Composite composite3 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite1.addChild(composite8);
        examples.Composite composite12 = new examples.Composite((int) '4');
        examples.Composite composite14 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        composite12.addChild(composite14);
        examples.Composite composite19 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        composite12.addChild(composite19);
        examples.Composite composite23 = new examples.Composite(8);
        composite19.addChild(composite23);
        java.util.Set<examples.Composite> compositeSet25 = composite23.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite9 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite9.addChild(composite12);
        examples.Composite composite16 = new examples.Composite((-3));
        composite12.addChild(composite16);
        examples.Composite composite19 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        composite12.addChild(composite19);
        examples.Composite composite24 = new examples.Composite((-9));
        composite19.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet26 = composite19.children();
        java.util.Set<examples.Composite> compositeSet27 = composite19.children();
        java.util.Set<examples.Composite> compositeSet28 = composite19.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        java.util.Set<examples.Composite> compositeSet9 = composite4.children();
        examples.Composite composite11 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        examples.Composite composite14 = new examples.Composite(8);
        composite11.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet16 = composite11.children();
        examples.Composite composite18 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        composite11.addChild(composite18);
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        examples.Composite composite1 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((int) (short) 0);
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.lang.Class<?> wildcardClass9 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        examples.Composite composite9 = new examples.Composite((-5));
        composite3.addChild(composite9);
        examples.Composite composite12 = new examples.Composite(6);
        composite9.addChild(composite12);
        java.lang.Class<?> wildcardClass14 = composite9.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        examples.Composite composite1 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite9.addChild(composite12);
        examples.Composite composite16 = new examples.Composite((-3));
        composite12.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        examples.Composite composite21 = new examples.Composite((int) 'a');
        composite16.addChild(composite21);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        java.util.Set<examples.Composite> compositeSet9 = composite4.children();
        java.util.Set<examples.Composite> compositeSet10 = composite4.children();
        examples.Composite composite12 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        java.util.Set<examples.Composite> compositeSet16 = composite12.children();
        java.util.Set<examples.Composite> compositeSet17 = composite12.children();
        java.util.Set<examples.Composite> compositeSet18 = composite12.children();
        examples.Composite composite20 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        composite12.addChild(composite20);
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
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((int) (byte) 100);
        composite1.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        examples.Composite composite12 = new examples.Composite((int) (short) -1);
        examples.Composite composite14 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        composite12.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet17 = composite12.children();
        java.util.Set<examples.Composite> compositeSet18 = composite12.children();
        java.util.Set<examples.Composite> compositeSet19 = composite12.children();
        java.util.Set<examples.Composite> compositeSet20 = composite12.children();
        java.util.Set<examples.Composite> compositeSet21 = composite12.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        examples.Composite composite1 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        examples.Composite composite9 = new examples.Composite(4);
        composite5.addChild(composite9);
        examples.Composite composite12 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        composite5.addChild(composite12);
        examples.Composite composite18 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        java.util.Set<examples.Composite> compositeSet21 = composite18.children();
        composite5.addChild(composite18);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        examples.Composite composite1 = new examples.Composite(2);
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
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        examples.Composite composite1 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite(4);
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        java.util.Set<examples.Composite> compositeSet8 = composite5.children();
        examples.Composite composite10 = new examples.Composite(5);
        examples.Composite composite12 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        composite10.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet16 = composite12.children();
        java.util.Set<examples.Composite> compositeSet17 = composite12.children();
        java.util.Set<examples.Composite> compositeSet18 = composite12.children();
        // The following exception was thrown during execution in test generation
        try {
            composite5.addChild(composite12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite10 = new examples.Composite(10);
        composite6.addChild(composite10);
        examples.Composite composite13 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        examples.Composite composite16 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        composite13.addChild(composite16);
        examples.Composite composite20 = new examples.Composite((-2));
        composite13.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        examples.Composite composite24 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        composite20.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet27 = composite20.children();
        java.util.Set<examples.Composite> compositeSet28 = composite20.children();
        // The following exception was thrown during execution in test generation
        try {
            composite10.addChild(composite20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.lang.Class<?> wildcardClass4 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
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
        examples.Composite composite22 = new examples.Composite((-100));
        examples.Composite composite24 = new examples.Composite((-3));
        composite22.addChild(composite24);
        examples.Composite composite27 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet28 = composite27.children();
        java.util.Set<examples.Composite> compositeSet29 = composite27.children();
        java.util.Set<examples.Composite> compositeSet30 = composite27.children();
        composite22.addChild(composite27);
        java.util.Set<examples.Composite> compositeSet32 = composite27.children();
        java.util.Set<examples.Composite> compositeSet33 = composite27.children();
        examples.Composite composite35 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet36 = composite35.children();
        java.util.Set<examples.Composite> compositeSet37 = composite35.children();
        java.util.Set<examples.Composite> compositeSet38 = composite35.children();
        composite27.addChild(composite35);
        // The following exception was thrown during execution in test generation
        try {
            composite15.addChild(composite35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet36);
        org.junit.Assert.assertNotNull(compositeSet37);
        org.junit.Assert.assertNotNull(compositeSet38);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        examples.Composite composite1 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = compositeSet2.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite(2);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.lang.Class<?> wildcardClass7 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
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
        java.lang.Class<?> wildcardClass13 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        examples.Composite composite1 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((int) (byte) 0);
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.lang.Class<?> wildcardClass8 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.lang.Class<?> wildcardClass7 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
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
        java.lang.Class<?> wildcardClass14 = compositeSet13.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        examples.Composite composite1 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.lang.Class<?> wildcardClass4 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet9 = composite5.children();
        examples.Composite composite11 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        examples.Composite composite14 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        composite11.addChild(composite14);
        examples.Composite composite18 = new examples.Composite((-2));
        composite11.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        examples.Composite composite22 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        composite18.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        // The following exception was thrown during execution in test generation
        try {
            composite5.addChild(composite22);
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
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(3);
        composite1.addChild(composite6);
        examples.Composite composite9 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        examples.Composite composite12 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite9.addChild(composite12);
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
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
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
        examples.Composite composite17 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        composite13.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet20 = composite13.children();
        java.util.Set<examples.Composite> compositeSet21 = composite13.children();
        examples.Composite composite23 = new examples.Composite((int) '4');
        examples.Composite composite25 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        java.util.Set<examples.Composite> compositeSet27 = composite25.children();
        composite23.addChild(composite25);
        java.util.Set<examples.Composite> compositeSet29 = composite25.children();
        examples.Composite composite31 = new examples.Composite((-5));
        composite25.addChild(composite31);
        // The following exception was thrown during execution in test generation
        try {
            composite13.addChild(composite31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet29);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        examples.Composite composite8 = new examples.Composite(9);
        examples.Composite composite10 = new examples.Composite((int) (short) 10);
        composite8.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet12);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        examples.Composite composite1 = new examples.Composite(9);
        examples.Composite composite3 = new examples.Composite((int) (short) 10);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite11 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        examples.Composite composite16 = new examples.Composite(3);
        composite11.addChild(composite16);
        examples.Composite composite19 = new examples.Composite(5);
        composite16.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite16.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(3);
        composite1.addChild(composite6);
        examples.Composite composite9 = new examples.Composite((-7));
        composite1.addChild(composite9);
        examples.Composite composite12 = new examples.Composite((int) (byte) 1);
        examples.Composite composite14 = new examples.Composite(2);
        composite12.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet16);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        examples.Composite composite1 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(10);
        composite1.addChild(composite4);
        examples.Composite composite7 = new examples.Composite((-5));
        examples.Composite composite9 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite7.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        java.util.Set<examples.Composite> compositeSet13 = composite9.children();
        java.util.Set<examples.Composite> compositeSet14 = composite9.children();
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite11 = new examples.Composite((-8));
        composite1.addChild(composite11);
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
        java.util.Set<examples.Composite> compositeSet29 = composite26.children();
        examples.Composite composite31 = new examples.Composite(2);
        composite26.addChild(composite31);
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet29);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        examples.Composite composite10 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        examples.Composite composite14 = new examples.Composite((-6));
        composite10.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite14);
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
        org.junit.Assert.assertNotNull(compositeSet16);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        examples.Composite composite1 = new examples.Composite((-1));
        examples.Composite composite3 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.lang.Class<?> wildcardClass7 = compositeSet6.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
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
        examples.Composite composite22 = new examples.Composite((-3));
        composite20.addChild(composite22);
        examples.Composite composite25 = new examples.Composite((-8));
        composite20.addChild(composite25);
        examples.Composite composite28 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        java.util.Set<examples.Composite> compositeSet30 = composite28.children();
        composite20.addChild(composite28);
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-6));
        composite1.addChild(composite6);
        examples.Composite composite8 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite6.addChild(composite8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        examples.Composite composite1 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.lang.Class<?> wildcardClass6 = compositeSet5.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
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
        examples.Composite composite15 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        examples.Composite composite19 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
        java.util.Set<examples.Composite> compositeSet23 = composite19.children();
        java.util.Set<examples.Composite> compositeSet24 = composite19.children();
        java.util.Set<examples.Composite> compositeSet25 = composite19.children();
        composite15.addChild(composite19);
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
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        examples.Composite composite1 = new examples.Composite(9);
        examples.Composite composite3 = new examples.Composite((int) (short) 10);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        java.lang.Class<?> wildcardClass11 = compositeSet10.getClass();
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
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
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        java.lang.Class<?> wildcardClass25 = composite22.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        examples.Composite composite1 = new examples.Composite(5);
        examples.Composite composite3 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        examples.Composite composite10 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        examples.Composite composite13 = new examples.Composite(8);
        composite10.addChild(composite13);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        examples.Composite composite1 = new examples.Composite((-5));
        examples.Composite composite3 = new examples.Composite((int) '4');
        examples.Composite composite5 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        composite3.addChild(composite5);
        examples.Composite composite10 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        composite3.addChild(composite10);
        examples.Composite composite14 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        composite10.addChild(composite14);
        examples.Composite composite18 = new examples.Composite((-4));
        composite10.addChild(composite18);
        examples.Composite composite21 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        composite18.addChild(composite21);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        examples.Composite composite1 = new examples.Composite(9);
        examples.Composite composite3 = new examples.Composite((int) (short) 10);
        composite1.addChild(composite3);
        java.lang.Class<?> wildcardClass5 = composite3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        examples.Composite composite16 = new examples.Composite(4);
        composite12.addChild(composite16);
        examples.Composite composite19 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
        composite12.addChild(composite19);
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        examples.Composite composite1 = new examples.Composite((-5));
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite7 = new examples.Composite(2);
        composite1.addChild(composite7);
        java.lang.Class<?> wildcardClass9 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
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
        java.util.Set<examples.Composite> compositeSet15 = composite8.children();
        java.lang.Class<?> wildcardClass16 = composite8.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        java.lang.Class<?> wildcardClass8 = compositeSet7.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
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
        examples.Composite composite20 = new examples.Composite((-100));
        examples.Composite composite22 = new examples.Composite((-3));
        composite20.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        examples.Composite composite27 = new examples.Composite((-9));
        composite22.addChild(composite27);
        java.util.Set<examples.Composite> compositeSet29 = composite27.children();
        examples.Composite composite31 = new examples.Composite((int) '4');
        composite27.addChild(composite31);
        examples.Composite composite34 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet35 = composite34.children();
        composite27.addChild(composite34);
        // The following exception was thrown during execution in test generation
        try {
            composite15.addChild(composite34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet35);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite9 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite1.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet12 = composite1.children();
        examples.Composite composite14 = new examples.Composite((-100));
        examples.Composite composite16 = new examples.Composite((-3));
        composite14.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        examples.Composite composite21 = new examples.Composite((-9));
        composite16.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        examples.Composite composite25 = new examples.Composite((int) '4');
        composite21.addChild(composite25);
        java.util.Set<examples.Composite> compositeSet27 = composite21.children();
        java.util.Set<examples.Composite> compositeSet28 = composite21.children();
        examples.Composite composite30 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet31 = composite30.children();
        java.util.Set<examples.Composite> compositeSet32 = composite30.children();
        composite21.addChild(composite30);
        examples.Composite composite35 = new examples.Composite(6);
        composite21.addChild(composite35);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet32);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
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
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        examples.Composite composite17 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        examples.Composite composite21 = new examples.Composite(4);
        composite17.addChild(composite21);
        examples.Composite composite24 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        java.util.Set<examples.Composite> compositeSet27 = composite24.children();
        composite17.addChild(composite24);
        // The following exception was thrown during execution in test generation
        try {
            composite12.addChild(composite17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        examples.Composite composite1 = new examples.Composite(8);
        examples.Composite composite3 = new examples.Composite((int) '4');
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
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite((-7));
        composite1.addChild(composite9);
        examples.Composite composite12 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        examples.Composite composite15 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        composite12.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet18 = composite12.children();
        examples.Composite composite20 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        composite12.addChild(composite20);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite20);
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
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
        java.lang.Class<?> wildcardClass16 = compositeSet15.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
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
        java.util.Set<examples.Composite> compositeSet13 = composite8.children();
        java.lang.Class<?> wildcardClass14 = compositeSet13.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        examples.Composite composite1 = new examples.Composite((-9));
        examples.Composite composite3 = new examples.Composite((int) (byte) 1);
        composite1.addChild(composite3);
        java.lang.Class<?> wildcardClass5 = composite1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-10));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        examples.Composite composite8 = new examples.Composite((-100));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite8.children();
        examples.Composite composite14 = new examples.Composite((int) (byte) 10);
        composite8.addChild(composite14);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet12);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
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
        java.lang.Class<?> wildcardClass17 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        examples.Composite composite1 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(10);
        composite1.addChild(composite4);
        examples.Composite composite7 = new examples.Composite((-100));
        examples.Composite composite9 = new examples.Composite((-3));
        composite7.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        examples.Composite composite14 = new examples.Composite((-9));
        composite9.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        examples.Composite composite18 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        composite14.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet22 = composite18.children();
        java.util.Set<examples.Composite> compositeSet23 = composite18.children();
        examples.Composite composite25 = new examples.Composite((int) (short) 10);
        composite18.addChild(composite25);
        java.util.Set<examples.Composite> compositeSet27 = composite25.children();
        java.util.Set<examples.Composite> compositeSet28 = composite25.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        examples.Composite composite12 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        examples.Composite composite15 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        composite12.addChild(composite15);
        examples.Composite composite19 = new examples.Composite((-3));
        composite15.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
        examples.Composite composite24 = new examples.Composite((int) (byte) 1);
        composite19.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet26 = composite19.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite19);
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
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-6));
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.lang.Class<?> wildcardClass9 = compositeSet8.getClass();
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        java.util.Set<examples.Composite> compositeSet9 = composite4.children();
        java.util.Set<examples.Composite> compositeSet10 = composite4.children();
        java.util.Set<examples.Composite> compositeSet11 = composite4.children();
        examples.Composite composite13 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        examples.Composite composite16 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        composite13.addChild(composite16);
        examples.Composite composite20 = new examples.Composite((-2));
        composite13.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        examples.Composite composite24 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        composite20.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet27 = composite20.children();
        java.util.Set<examples.Composite> compositeSet28 = composite20.children();
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
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        examples.Composite composite1 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        examples.Composite composite9 = new examples.Composite(100);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite4.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        java.lang.Class<?> wildcardClass13 = compositeSet12.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(3);
        composite1.addChild(composite6);
        examples.Composite composite9 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite9.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet15 = composite9.children();
        // The following exception was thrown during execution in test generation
        try {
            composite6.addChild(composite9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
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
        examples.Composite composite17 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        composite13.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet20 = composite17.children();
        examples.Composite composite22 = new examples.Composite((int) '4');
        examples.Composite composite24 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        composite22.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet28 = composite24.children();
        java.util.Set<examples.Composite> compositeSet29 = composite24.children();
        // The following exception was thrown during execution in test generation
        try {
            composite17.addChild(composite24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-6));
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
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
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
        examples.Composite composite15 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        composite12.addChild(composite15);
        examples.Composite composite20 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        composite12.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet23 = composite20.children();
        java.util.Set<examples.Composite> compositeSet24 = composite20.children();
        java.lang.Class<?> wildcardClass25 = composite20.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
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
        examples.Composite composite22 = new examples.Composite((-2));
        examples.Composite composite24 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        java.util.Set<examples.Composite> compositeSet27 = composite24.children();
        composite22.addChild(composite24);
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
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite(2);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        examples.Composite composite7 = new examples.Composite((-100));
        examples.Composite composite9 = new examples.Composite((-3));
        composite7.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        java.util.Set<examples.Composite> compositeSet13 = composite9.children();
        java.util.Set<examples.Composite> compositeSet14 = composite9.children();
        java.util.Set<examples.Composite> compositeSet15 = composite9.children();
        examples.Composite composite17 = new examples.Composite((int) (byte) 0);
        composite9.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet19 = composite9.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
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
        examples.Composite composite17 = new examples.Composite(3);
        examples.Composite composite19 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        composite17.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet23 = composite17.children();
        java.util.Set<examples.Composite> compositeSet24 = composite17.children();
        examples.Composite composite26 = new examples.Composite(100);
        composite17.addChild(composite26);
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite26);
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
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite11 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        composite1.addChild(composite11);
        java.lang.Class<?> wildcardClass16 = composite11.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
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
        examples.Composite composite15 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        composite12.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet19 = composite12.children();
        examples.Composite composite21 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        examples.Composite composite24 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        composite21.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet28 = composite21.children();
        examples.Composite composite30 = new examples.Composite(4);
        composite21.addChild(composite30);
        java.util.Set<examples.Composite> compositeSet32 = composite21.children();
        java.util.Set<examples.Composite> compositeSet33 = composite21.children();
        java.util.Set<examples.Composite> compositeSet34 = composite21.children();
        java.util.Set<examples.Composite> compositeSet35 = composite21.children();
        // The following exception was thrown during execution in test generation
        try {
            composite12.addChild(composite21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet35);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        examples.Composite composite1 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        examples.Composite composite9 = new examples.Composite(100);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite4.addChild(composite9);
        examples.Composite composite13 = new examples.Composite((int) '4');
        examples.Composite composite15 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        composite13.addChild(composite15);
        examples.Composite composite20 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        composite13.addChild(composite20);
        examples.Composite composite24 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        composite20.addChild(composite24);
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        examples.Composite composite1 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.lang.Class<?> wildcardClass6 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
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
        java.util.Set<examples.Composite> compositeSet18 = composite1.children();
        examples.Composite composite20 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        java.util.Set<examples.Composite> compositeSet23 = composite20.children();
        examples.Composite composite25 = new examples.Composite(1);
        composite20.addChild(composite25);
        java.util.Set<examples.Composite> compositeSet27 = composite20.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite20);
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
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet27);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        examples.Composite composite1 = new examples.Composite(1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) '4');
        examples.Composite composite6 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite4.addChild(composite6);
        examples.Composite composite11 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite4.addChild(composite11);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
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
        examples.Composite composite18 = new examples.Composite((-100));
        examples.Composite composite20 = new examples.Composite((-3));
        composite18.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet22 = composite18.children();
        examples.Composite composite24 = new examples.Composite((int) (byte) 10);
        composite18.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        // The following exception was thrown during execution in test generation
        try {
            composite15.addChild(composite24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
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
        java.util.Set<examples.Composite> compositeSet13 = composite1.children();
        examples.Composite composite15 = new examples.Composite((-100));
        examples.Composite composite17 = new examples.Composite((-3));
        composite15.addChild(composite17);
        examples.Composite composite20 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        java.util.Set<examples.Composite> compositeSet23 = composite20.children();
        composite15.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet25 = composite20.children();
        java.util.Set<examples.Composite> compositeSet26 = composite20.children();
        examples.Composite composite28 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        java.util.Set<examples.Composite> compositeSet30 = composite28.children();
        java.util.Set<examples.Composite> compositeSet31 = composite28.children();
        composite20.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet33 = composite28.children();
        examples.Composite composite35 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet36 = composite35.children();
        composite28.addChild(composite35);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet36);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite10 = new examples.Composite(10);
        composite6.addChild(composite10);
        examples.Composite composite13 = new examples.Composite((-100));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        examples.Composite composite20 = new examples.Composite(4);
        composite15.addChild(composite20);
        examples.Composite composite23 = new examples.Composite((int) (short) 100);
        composite20.addChild(composite23);
        // The following exception was thrown during execution in test generation
        try {
            composite10.addChild(composite20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
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
        java.lang.Class<?> wildcardClass13 = compositeSet12.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
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
        examples.Composite composite15 = new examples.Composite((-5));
        examples.Composite composite17 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        composite15.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet20 = composite17.children();
        java.util.Set<examples.Composite> compositeSet21 = composite17.children();
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        examples.Composite composite1 = new examples.Composite((-2));
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        examples.Composite composite6 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite3.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet10 = composite3.children();
        examples.Composite composite12 = new examples.Composite(4);
        composite3.addChild(composite12);
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
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        examples.Composite composite8 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite1.addChild(composite8);
        examples.Composite composite12 = new examples.Composite(0);
        examples.Composite composite14 = new examples.Composite((int) (short) 1);
        composite12.addChild(composite14);
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet9);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
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
        examples.Composite composite19 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        examples.Composite composite22 = new examples.Composite((int) ' ');
        composite19.addChild(composite22);
        // The following exception was thrown during execution in test generation
        try {
            composite15.addChild(composite22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-10));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        examples.Composite composite8 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        examples.Composite composite11 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite8.addChild(composite11);
        examples.Composite composite15 = new examples.Composite((-3));
        composite11.addChild(composite15);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet12);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        examples.Composite composite1 = new examples.Composite(9);
        examples.Composite composite3 = new examples.Composite((int) (short) 10);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet11 = composite6.children();
        examples.Composite composite13 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        examples.Composite composite16 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        composite13.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet20 = composite13.children();
        java.util.Set<examples.Composite> compositeSet21 = composite13.children();
        // The following exception was thrown during execution in test generation
        try {
            composite6.addChild(composite13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        examples.Composite composite1 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        examples.Composite composite11 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        examples.Composite composite15 = new examples.Composite(4);
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
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
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
        examples.Composite composite20 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        java.util.Set<examples.Composite> compositeSet23 = composite20.children();
        java.util.Set<examples.Composite> compositeSet24 = composite20.children();
        examples.Composite composite26 = new examples.Composite(9);
        composite20.addChild(composite26);
        java.util.Set<examples.Composite> compositeSet28 = composite26.children();
        // The following exception was thrown during execution in test generation
        try {
            composite15.addChild(composite26);
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
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        examples.Composite composite8 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite1.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        examples.Composite composite13 = new examples.Composite((int) '4');
        examples.Composite composite15 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        composite13.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet19 = composite15.children();
        examples.Composite composite21 = new examples.Composite((-5));
        composite15.addChild(composite21);
        examples.Composite composite24 = new examples.Composite(6);
        composite21.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet26 = composite21.children();
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((int) '#');
        composite4.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        java.lang.Class<?> wildcardClass15 = composite11.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
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
        examples.Composite composite15 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        examples.Composite composite20 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        composite15.addChild(composite20);
        examples.Composite composite25 = new examples.Composite((-8));
        composite15.addChild(composite25);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite25);
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
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        examples.Composite composite1 = new examples.Composite(100);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-100));
        examples.Composite composite6 = new examples.Composite((-3));
        composite4.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        examples.Composite composite10 = new examples.Composite((-9));
        composite6.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite11 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        composite1.addChild(composite11);
        examples.Composite composite17 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        examples.Composite composite20 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        composite17.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet23 = composite17.children();
        java.util.Set<examples.Composite> compositeSet24 = composite17.children();
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite17);
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
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
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
        examples.Composite composite14 = new examples.Composite((-100));
        examples.Composite composite16 = new examples.Composite((-3));
        composite14.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        examples.Composite composite21 = new examples.Composite((-7));
        composite16.addChild(composite21);
        // The following exception was thrown during execution in test generation
        try {
            composite7.addChild(composite21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
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
        java.util.Set<examples.Composite> compositeSet21 = composite15.children();
        java.util.Set<examples.Composite> compositeSet22 = composite15.children();
        java.lang.Class<?> wildcardClass23 = compositeSet22.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        examples.Composite composite1 = new examples.Composite((-5));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        examples.Composite composite8 = new examples.Composite((int) (byte) 10);
        composite4.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite4.addChild(composite11);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet12);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
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
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        java.lang.Class<?> wildcardClass19 = compositeSet18.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        examples.Composite composite1 = new examples.Composite(9);
        examples.Composite composite3 = new examples.Composite((int) (short) 10);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        java.lang.Class<?> wildcardClass10 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
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
        java.util.Set<examples.Composite> compositeSet15 = composite4.children();
        java.lang.Class<?> wildcardClass16 = composite4.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((int) (short) 1);
        composite8.addChild(composite11);
        examples.Composite composite14 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        examples.Composite composite17 = new examples.Composite(8);
        composite14.addChild(composite17);
        examples.Composite composite20 = new examples.Composite((int) (short) 0);
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        composite17.addChild(composite20);
        examples.Composite composite24 = new examples.Composite(3);
        composite20.addChild(composite24);
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
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
        java.lang.Class<?> wildcardClass14 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((int) (short) 1);
        composite8.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite8.children();
        java.util.Set<examples.Composite> compositeSet14 = composite8.children();
        examples.Composite composite16 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        examples.Composite composite19 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        composite16.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet22 = composite16.children();
        examples.Composite composite24 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        composite16.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet27 = composite24.children();
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet27);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
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
        java.util.Set<examples.Composite> compositeSet18 = composite1.children();
        java.lang.Class<?> wildcardClass19 = composite1.getClass();
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
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
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
        examples.Composite composite17 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        composite13.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet20 = composite17.children();
        java.lang.Class<?> wildcardClass21 = compositeSet20.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite1.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        java.util.Set<examples.Composite> compositeSet13 = composite9.children();
        examples.Composite composite14 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite14);
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
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-7));
        composite3.addChild(composite8);
        java.lang.Class<?> wildcardClass10 = composite8.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
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
        java.lang.Class<?> wildcardClass22 = composite19.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        examples.Composite composite8 = new examples.Composite((-100));
        examples.Composite composite10 = new examples.Composite((-10));
        composite8.addChild(composite10);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
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
        examples.Composite composite16 = new examples.Composite((-5));
        examples.Composite composite18 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        composite16.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet21 = composite16.children();
        examples.Composite composite23 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        composite16.addChild(composite23);
        // The following exception was thrown during execution in test generation
        try {
            composite12.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
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
        examples.Composite composite17 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        composite13.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet20 = composite13.children();
        java.util.Set<examples.Composite> compositeSet21 = composite13.children();
        examples.Composite composite23 = new examples.Composite((-100));
        examples.Composite composite25 = new examples.Composite((-3));
        composite23.addChild(composite25);
        java.util.Set<examples.Composite> compositeSet27 = composite25.children();
        java.util.Set<examples.Composite> compositeSet28 = composite25.children();
        examples.Composite composite30 = new examples.Composite((-9));
        composite25.addChild(composite30);
        examples.Composite composite33 = new examples.Composite((int) (short) 1);
        composite30.addChild(composite33);
        // The following exception was thrown during execution in test generation
        try {
            composite13.addChild(composite30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
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
        examples.Composite composite17 = new examples.Composite((int) (short) -1);
        examples.Composite composite19 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        composite17.addChild(composite19);
        examples.Composite composite23 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        java.util.Set<examples.Composite> compositeSet25 = composite23.children();
        composite17.addChild(composite23);
        java.util.Set<examples.Composite> compositeSet27 = composite23.children();
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet27);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        examples.Composite composite1 = new examples.Composite((-9));
        examples.Composite composite3 = new examples.Composite((int) (byte) 1);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.lang.Class<?> wildcardClass7 = compositeSet6.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite10 = new examples.Composite(4);
        composite1.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        java.lang.Class<?> wildcardClass14 = compositeSet13.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        examples.Composite composite1 = new examples.Composite(5);
        examples.Composite composite3 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        java.lang.Class<?> wildcardClass9 = composite3.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
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
        examples.Composite composite20 = new examples.Composite((int) '4');
        examples.Composite composite22 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        composite20.addChild(composite22);
        examples.Composite composite27 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet28 = composite27.children();
        composite20.addChild(composite27);
        examples.Composite composite31 = new examples.Composite(8);
        composite27.addChild(composite31);
        // The following exception was thrown during execution in test generation
        try {
            composite7.addChild(composite27);
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
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite10 = new examples.Composite((-100));
        examples.Composite composite12 = new examples.Composite((-3));
        composite10.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        examples.Composite composite17 = new examples.Composite((-9));
        composite12.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        examples.Composite composite21 = new examples.Composite((int) '4');
        composite17.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet23 = composite17.children();
        java.util.Set<examples.Composite> compositeSet24 = composite17.children();
        examples.Composite composite26 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        java.util.Set<examples.Composite> compositeSet28 = composite26.children();
        composite17.addChild(composite26);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        examples.Composite composite7 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        composite4.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet11 = composite4.children();
        examples.Composite composite13 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        java.util.Set<examples.Composite> compositeSet16 = composite13.children();
        examples.Composite composite18 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        composite13.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet22 = composite18.children();
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite((int) '#');
        composite8.addChild(composite12);
        java.lang.Class<?> wildcardClass14 = composite12.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        examples.Composite composite1 = new examples.Composite((int) (short) 100);
        examples.Composite composite3 = new examples.Composite((int) (short) 0);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite7 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        java.util.Set<examples.Composite> compositeSet10 = composite7.children();
        examples.Composite composite12 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite7.addChild(composite12);
        examples.Composite composite16 = new examples.Composite(10);
        composite12.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite12.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
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
        java.util.Set<examples.Composite> compositeSet20 = composite11.children();
        java.lang.Class<?> wildcardClass21 = composite11.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        examples.Composite composite1 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        examples.Composite composite9 = new examples.Composite(100);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite4.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet12 = composite4.children();
        java.lang.Class<?> wildcardClass13 = composite4.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        examples.Composite composite1 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        java.lang.Class<?> wildcardClass11 = compositeSet10.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        examples.Composite composite1 = new examples.Composite((-5));
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite7 = new examples.Composite(2);
        composite1.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        java.util.Set<examples.Composite> compositeSet10 = composite7.children();
        java.lang.Class<?> wildcardClass11 = compositeSet10.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        examples.Composite composite1 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        examples.Composite composite7 = new examples.Composite((int) '4');
        examples.Composite composite9 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        composite7.addChild(composite9);
        examples.Composite composite14 = new examples.Composite((int) (byte) 100);
        composite7.addChild(composite14);
        examples.Composite composite17 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
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
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        examples.Composite composite1 = new examples.Composite(9);
        examples.Composite composite3 = new examples.Composite((int) (short) 10);
        composite1.addChild(composite3);
        java.lang.Class<?> wildcardClass5 = composite1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        examples.Composite composite7 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        composite4.addChild(composite7);
        examples.Composite composite11 = new examples.Composite((-5));
        examples.Composite composite13 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        composite11.addChild(composite13);
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet14);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
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
        examples.Composite composite25 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        examples.Composite composite28 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        java.util.Set<examples.Composite> compositeSet30 = composite28.children();
        composite25.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet32 = composite25.children();
        examples.Composite composite34 = new examples.Composite(4);
        composite25.addChild(composite34);
        java.util.Set<examples.Composite> compositeSet36 = composite25.children();
        java.util.Set<examples.Composite> compositeSet37 = composite25.children();
        java.util.Set<examples.Composite> compositeSet38 = composite25.children();
        java.util.Set<examples.Composite> compositeSet39 = composite25.children();
        // The following exception was thrown during execution in test generation
        try {
            composite19.addChild(composite25);
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
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet36);
        org.junit.Assert.assertNotNull(compositeSet37);
        org.junit.Assert.assertNotNull(compositeSet38);
        org.junit.Assert.assertNotNull(compositeSet39);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
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
        examples.Composite composite18 = new examples.Composite((-100));
        examples.Composite composite20 = new examples.Composite((-3));
        composite18.addChild(composite20);
        examples.Composite composite23 = new examples.Composite((-8));
        composite18.addChild(composite23);
        examples.Composite composite26 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        java.util.Set<examples.Composite> compositeSet28 = composite26.children();
        composite18.addChild(composite26);
        java.util.Set<examples.Composite> compositeSet30 = composite26.children();
        java.util.Set<examples.Composite> compositeSet31 = composite26.children();
        examples.Composite composite33 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet34 = composite33.children();
        composite26.addChild(composite33);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet34);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        composite1.addChild(composite5);
        java.lang.Class<?> wildcardClass9 = composite5.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
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
        examples.Composite composite15 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        examples.Composite composite18 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        java.util.Set<examples.Composite> compositeSet21 = composite18.children();
        java.util.Set<examples.Composite> compositeSet22 = composite18.children();
        composite15.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet24 = composite15.children();
        // The following exception was thrown during execution in test generation
        try {
            composite7.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        examples.Composite composite1 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((int) (byte) 0);
        composite1.addChild(composite5);
        examples.Composite composite8 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        examples.Composite composite11 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite8.addChild(composite11);
        examples.Composite composite15 = new examples.Composite((-2));
        composite8.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        examples.Composite composite19 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        composite15.addChild(composite19);
        // The following exception was thrown during execution in test generation
        try {
            composite5.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite(4);
        composite3.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((int) (short) 100);
        composite8.addChild(composite11);
        java.lang.Class<?> wildcardClass13 = composite8.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        examples.Composite composite10 = new examples.Composite((int) (short) 0);
        composite3.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        java.util.Set<examples.Composite> compositeSet14 = composite10.children();
        java.util.Set<examples.Composite> compositeSet15 = composite10.children();
        java.lang.Class<?> wildcardClass16 = compositeSet15.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        examples.Composite composite11 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        examples.Composite composite1 = new examples.Composite((int) '#');
        examples.Composite composite3 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        examples.Composite composite6 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite3.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet9 = composite3.children();
        java.util.Set<examples.Composite> compositeSet10 = composite3.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        examples.Composite composite1 = new examples.Composite((-9));
        examples.Composite composite3 = new examples.Composite((int) (byte) 1);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        examples.Composite composite6 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
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
        examples.Composite composite16 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        examples.Composite composite21 = new examples.Composite(3);
        composite16.addChild(composite21);
        examples.Composite composite24 = new examples.Composite((-7));
        composite16.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet26 = composite16.children();
        java.util.Set<examples.Composite> compositeSet27 = composite16.children();
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite16);
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
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
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
        examples.Composite composite19 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
        examples.Composite composite24 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        composite19.addChild(composite24);
        examples.Composite composite28 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        composite24.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet31 = composite28.children();
        java.util.Set<examples.Composite> compositeSet32 = composite28.children();
        // The following exception was thrown during execution in test generation
        try {
            composite14.addChild(composite28);
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
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet32);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        java.util.Set<examples.Composite> compositeSet10 = composite7.children();
        composite3.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet12 = composite3.children();
        java.lang.Class<?> wildcardClass13 = composite3.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        examples.Composite composite1 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((int) (short) 0);
        composite1.addChild(composite6);
        examples.Composite composite9 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        examples.Composite composite14 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        composite9.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
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
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet17);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        examples.Composite composite1 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        examples.Composite composite7 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        java.util.Set<examples.Composite> compositeSet10 = composite7.children();
        java.util.Set<examples.Composite> compositeSet11 = composite7.children();
        java.util.Set<examples.Composite> compositeSet12 = composite7.children();
        java.util.Set<examples.Composite> compositeSet13 = composite7.children();
        examples.Composite composite15 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        composite7.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite15);
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
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite1.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        java.util.Set<examples.Composite> compositeSet13 = composite9.children();
        examples.Composite composite15 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        examples.Composite composite20 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        composite15.addChild(composite20);
        examples.Composite composite25 = new examples.Composite((-8));
        composite15.addChild(composite25);
        java.util.Set<examples.Composite> compositeSet27 = composite15.children();
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite15);
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
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet27);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        examples.Composite composite1 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        composite1.addChild(composite5);
        examples.Composite composite10 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        examples.Composite composite14 = new examples.Composite((int) (byte) 0);
        composite10.addChild(composite14);
        // The following exception was thrown during execution in test generation
        try {
            composite5.addChild(composite14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(3);
        composite1.addChild(composite6);
        examples.Composite composite9 = new examples.Composite((-7));
        composite1.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        java.lang.Class<?> wildcardClass12 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        examples.Composite composite1 = new examples.Composite((-2));
        examples.Composite composite3 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        java.lang.Class<?> wildcardClass10 = compositeSet9.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        examples.Composite composite1 = new examples.Composite(0);
        examples.Composite composite3 = new examples.Composite((int) (short) 1);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite(7);
        composite3.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite3.children();
        java.lang.Class<?> wildcardClass10 = composite3.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        examples.Composite composite1 = new examples.Composite((-5));
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite7 = new examples.Composite(2);
        composite1.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        examples.Composite composite11 = new examples.Composite((-5));
        examples.Composite composite13 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        composite11.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet16 = composite11.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
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
        java.lang.Class<?> wildcardClass19 = compositeSet18.getClass();
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        examples.Composite composite1 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(10);
        composite1.addChild(composite4);
        examples.Composite composite7 = new examples.Composite((-100));
        examples.Composite composite9 = new examples.Composite((-3));
        composite7.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        examples.Composite composite14 = new examples.Composite((-9));
        composite9.addChild(composite14);
        examples.Composite composite17 = new examples.Composite((int) (short) 1);
        composite14.addChild(composite17);
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        examples.Composite composite1 = new examples.Composite(4);
        examples.Composite composite3 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((int) (short) 0);
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite3.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        examples.Composite composite1 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        examples.Composite composite9 = new examples.Composite(8);
        composite6.addChild(composite9);
        examples.Composite composite12 = new examples.Composite((int) (short) 0);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite9.addChild(composite12);
        examples.Composite composite16 = new examples.Composite(3);
        composite12.addChild(composite16);
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
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet13);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
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
        examples.Composite composite15 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        examples.Composite composite19 = new examples.Composite(4);
        composite15.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite15.children();
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite15);
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
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = compositeSet2.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
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
        java.util.Set<examples.Composite> compositeSet18 = composite8.children();
        examples.Composite composite20 = new examples.Composite(2);
        composite8.addChild(composite20);
        java.lang.Class<?> wildcardClass22 = composite20.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        java.lang.Class<?> wildcardClass11 = compositeSet10.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        examples.Composite composite10 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        composite4.addChild(composite10);
        examples.Composite composite14 = new examples.Composite(9);
        examples.Composite composite16 = new examples.Composite((int) (short) 10);
        composite14.addChild(composite16);
        // The following exception was thrown during execution in test generation
        try {
            composite10.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
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
        java.lang.Class<?> wildcardClass18 = composite11.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        examples.Composite composite1 = new examples.Composite(3);
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite(4);
        composite8.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
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
        java.util.Set<examples.Composite> compositeSet16 = composite8.children();
        examples.Composite composite18 = new examples.Composite((int) '#');
        composite8.addChild(composite18);
        examples.Composite composite21 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        examples.Composite composite24 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        composite21.addChild(composite24);
        examples.Composite composite28 = new examples.Composite((-2));
        composite21.addChild(composite28);
        examples.Composite composite31 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet32 = composite31.children();
        composite21.addChild(composite31);
        java.util.Set<examples.Composite> compositeSet34 = composite31.children();
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet34);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(3);
        composite1.addChild(composite6);
        examples.Composite composite9 = new examples.Composite((-7));
        composite1.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        java.util.Set<examples.Composite> compositeSet12 = composite1.children();
        java.lang.Class<?> wildcardClass13 = compositeSet12.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
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
        examples.Composite composite20 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        examples.Composite composite23 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        composite20.addChild(composite23);
        examples.Composite composite27 = new examples.Composite((-2));
        composite20.addChild(composite27);
        examples.Composite composite30 = new examples.Composite(7);
        composite20.addChild(composite30);
        java.util.Set<examples.Composite> compositeSet32 = composite20.children();
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
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet32);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
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
        java.lang.Class<?> wildcardClass12 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite1.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        java.util.Set<examples.Composite> compositeSet13 = composite9.children();
        examples.Composite composite15 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        examples.Composite composite20 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        composite15.addChild(composite20);
        examples.Composite composite25 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        composite15.addChild(composite25);
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite25);
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
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite10 = new examples.Composite(4);
        composite1.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite1.children();
        java.util.Set<examples.Composite> compositeSet13 = composite1.children();
        java.util.Set<examples.Composite> compositeSet14 = composite1.children();
        examples.Composite composite16 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        examples.Composite composite19 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        composite16.addChild(composite19);
        examples.Composite composite23 = new examples.Composite((-3));
        composite19.addChild(composite23);
        java.util.Set<examples.Composite> compositeSet25 = composite23.children();
        java.util.Set<examples.Composite> compositeSet26 = composite23.children();
        examples.Composite composite28 = new examples.Composite((int) (byte) 1);
        composite23.addChild(composite28);
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
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite10 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        examples.Composite composite15 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        composite10.addChild(composite15);
        examples.Composite composite20 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        java.util.Set<examples.Composite> compositeSet23 = composite20.children();
        composite10.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet25 = composite10.children();
        java.util.Set<examples.Composite> compositeSet26 = composite10.children();
        examples.Composite composite28 = new examples.Composite((int) (short) 10);
        composite10.addChild(composite28);
        examples.Composite composite31 = new examples.Composite(3);
        composite28.addChild(composite31);
        java.util.Set<examples.Composite> compositeSet33 = composite31.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet33);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        examples.Composite composite9 = new examples.Composite((-5));
        composite3.addChild(composite9);
        examples.Composite composite12 = new examples.Composite((-10));
        examples.Composite composite14 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        composite12.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet19 = composite14.children();
        java.util.Set<examples.Composite> compositeSet20 = composite14.children();
        java.util.Set<examples.Composite> compositeSet21 = composite14.children();
        java.util.Set<examples.Composite> compositeSet22 = composite14.children();
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite14);
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
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
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
        examples.Composite composite15 = new examples.Composite(3);
        examples.Composite composite17 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        composite15.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet21 = composite15.children();
        java.util.Set<examples.Composite> compositeSet22 = composite15.children();
        examples.Composite composite24 = new examples.Composite(100);
        composite15.addChild(composite24);
        // The following exception was thrown during execution in test generation
        try {
            composite12.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        examples.Composite composite1 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(10);
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        examples.Composite composite8 = new examples.Composite((-100));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite composite13 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        java.util.Set<examples.Composite> compositeSet16 = composite13.children();
        composite8.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet18 = composite13.children();
        java.util.Set<examples.Composite> compositeSet19 = composite13.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
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
        java.util.Set<examples.Composite> compositeSet16 = composite8.children();
        java.util.Set<examples.Composite> compositeSet17 = composite8.children();
        examples.Composite composite19 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
        composite8.addChild(composite19);
        examples.Composite composite25 = new examples.Composite((-5));
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        java.util.Set<examples.Composite> compositeSet27 = composite25.children();
        examples.Composite composite29 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet30 = composite29.children();
        java.util.Set<examples.Composite> compositeSet31 = composite29.children();
        java.util.Set<examples.Composite> compositeSet32 = composite29.children();
        composite25.addChild(composite29);
        java.util.Set<examples.Composite> compositeSet34 = composite25.children();
        java.util.Set<examples.Composite> compositeSet35 = composite25.children();
        examples.Composite composite37 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet38 = composite37.children();
        java.util.Set<examples.Composite> compositeSet39 = composite37.children();
        composite25.addChild(composite37);
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet35);
        org.junit.Assert.assertNotNull(compositeSet38);
        org.junit.Assert.assertNotNull(compositeSet39);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
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
        java.util.Set<examples.Composite> compositeSet16 = composite13.children();
        examples.Composite composite18 = new examples.Composite(2);
        composite13.addChild(composite18);
        java.lang.Class<?> wildcardClass20 = composite13.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
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
        java.lang.Class<?> wildcardClass14 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        java.lang.Class<?> wildcardClass10 = compositeSet9.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite(4);
        composite3.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((int) (short) 100);
        composite8.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        examples.Composite composite15 = new examples.Composite((-100));
        examples.Composite composite17 = new examples.Composite((-3));
        composite15.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        java.util.Set<examples.Composite> compositeSet20 = composite17.children();
        java.util.Set<examples.Composite> compositeSet21 = composite17.children();
        java.util.Set<examples.Composite> compositeSet22 = composite17.children();
        examples.Composite composite24 = new examples.Composite((int) (short) 0);
        composite17.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet26 = composite17.children();
        java.util.Set<examples.Composite> compositeSet27 = composite17.children();
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        examples.Composite composite1 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        examples.Composite composite7 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        examples.Composite composite10 = new examples.Composite(8);
        composite7.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite7.children();
        examples.Composite composite14 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        composite7.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet17 = composite7.children();
        java.util.Set<examples.Composite> compositeSet18 = composite7.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite7);
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
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        examples.Composite composite1 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        java.util.Set<examples.Composite> compositeSet9 = composite4.children();
        java.util.Set<examples.Composite> compositeSet10 = composite4.children();
        java.lang.Class<?> wildcardClass11 = composite4.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
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
        examples.Composite composite15 = new examples.Composite((-5));
        examples.Composite composite17 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        composite15.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet20 = composite15.children();
        examples.Composite composite22 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        composite15.addChild(composite22);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet23);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        examples.Composite composite1 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        examples.Composite composite7 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        composite4.addChild(composite7);
        examples.Composite composite11 = new examples.Composite((-3));
        composite7.addChild(composite11);
        examples.Composite composite14 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        composite7.addChild(composite14);
        examples.Composite composite19 = new examples.Composite((-9));
        composite14.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite14.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        examples.Composite composite1 = new examples.Composite((int) (byte) 100);
        examples.Composite composite3 = new examples.Composite((-9));
        examples.Composite composite5 = new examples.Composite((int) (byte) 1);
        composite3.addChild(composite5);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        examples.Composite composite7 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        examples.Composite composite11 = new examples.Composite((int) (byte) 0);
        composite7.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite7.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
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
        examples.Composite composite22 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        examples.Composite composite25 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        composite22.addChild(composite25);
        java.util.Set<examples.Composite> compositeSet28 = composite22.children();
        java.util.Set<examples.Composite> compositeSet29 = composite22.children();
        // The following exception was thrown during execution in test generation
        try {
            composite19.addChild(composite22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
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
        java.util.Set<examples.Composite> compositeSet18 = composite8.children();
        examples.Composite composite20 = new examples.Composite(2);
        composite8.addChild(composite20);
        java.lang.Class<?> wildcardClass22 = composite8.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        examples.Composite composite1 = new examples.Composite(0);
        examples.Composite composite3 = new examples.Composite((int) (short) 1);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        examples.Composite composite7 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        java.util.Set<examples.Composite> compositeSet10 = composite7.children();
        examples.Composite composite12 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        composite7.addChild(composite12);
        examples.Composite composite17 = new examples.Composite(1);
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        composite12.addChild(composite17);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        java.util.Set<examples.Composite> compositeSet10 = composite7.children();
        composite3.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet12 = composite3.children();
        java.util.Set<examples.Composite> compositeSet13 = composite3.children();
        java.lang.Class<?> wildcardClass14 = compositeSet13.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
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
        java.util.Set<examples.Composite> compositeSet19 = composite14.children();
        examples.Composite composite21 = new examples.Composite((int) (byte) 1);
        examples.Composite composite23 = new examples.Composite(2);
        composite21.addChild(composite23);
        examples.Composite composite26 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        java.util.Set<examples.Composite> compositeSet28 = composite26.children();
        composite23.addChild(composite26);
        java.util.Set<examples.Composite> compositeSet30 = composite23.children();
        // The following exception was thrown during execution in test generation
        try {
            composite14.addChild(composite23);
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
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet30);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite1.addChild(composite9);
        examples.Composite composite13 = new examples.Composite((int) '4');
        examples.Composite composite15 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        composite13.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet19 = composite15.children();
        examples.Composite composite21 = new examples.Composite((-5));
        composite15.addChild(composite21);
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
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
        java.util.Set<examples.Composite> compositeSet16 = composite11.children();
        java.util.Set<examples.Composite> compositeSet17 = composite11.children();
        java.lang.Class<?> wildcardClass18 = compositeSet17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite1.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        java.lang.Class<?> wildcardClass12 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
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
        java.util.Set<examples.Composite> compositeSet32 = composite26.children();
        // The following exception was thrown during execution in test generation
        try {
            composite7.addChild(composite26);
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
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet32);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite11 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite1.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        java.util.Set<examples.Composite> compositeSet15 = composite11.children();
        examples.Composite composite17 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        examples.Composite composite20 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        composite17.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet24 = composite17.children();
        examples.Composite composite26 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        composite17.addChild(composite26);
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
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
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
        examples.Composite composite22 = new examples.Composite((-100));
        examples.Composite composite24 = new examples.Composite((-3));
        composite22.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        examples.Composite composite28 = new examples.Composite((-9));
        composite24.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet30 = composite24.children();
        examples.Composite composite32 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet33 = composite32.children();
        composite24.addChild(composite32);
        java.util.Set<examples.Composite> compositeSet35 = composite24.children();
        java.util.Set<examples.Composite> compositeSet36 = composite24.children();
        // The following exception was thrown during execution in test generation
        try {
            composite19.addChild(composite24);
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
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet35);
        org.junit.Assert.assertNotNull(compositeSet36);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
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
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        java.util.Set<examples.Composite> compositeSet20 = composite16.children();
        java.util.Set<examples.Composite> compositeSet21 = composite16.children();
        java.util.Set<examples.Composite> compositeSet22 = composite16.children();
        examples.Composite composite24 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        composite16.addChild(composite24);
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
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
        examples.Composite composite15 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        examples.Composite composite18 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        composite15.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet22 = composite15.children();
        examples.Composite composite24 = new examples.Composite(4);
        composite15.addChild(composite24);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        examples.Composite composite1 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        composite1.addChild(composite5);
        java.lang.Class<?> wildcardClass9 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        examples.Composite composite1 = new examples.Composite(8);
        examples.Composite composite3 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        examples.Composite composite9 = new examples.Composite((-100));
        examples.Composite composite11 = new examples.Composite((-3));
        composite9.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        java.util.Set<examples.Composite> compositeSet15 = composite11.children();
        java.util.Set<examples.Composite> compositeSet16 = composite11.children();
        java.util.Set<examples.Composite> compositeSet17 = composite11.children();
        java.util.Set<examples.Composite> compositeSet18 = composite11.children();
        java.util.Set<examples.Composite> compositeSet19 = composite11.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        examples.Composite composite1 = new examples.Composite(8);
        examples.Composite composite3 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.lang.Class<?> wildcardClass8 = compositeSet7.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
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
        java.lang.Class<?> wildcardClass15 = composite4.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
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
        java.lang.Class<?> wildcardClass15 = composite3.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-10));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        examples.Composite composite10 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        composite7.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet14 = composite7.children();
        java.util.Set<examples.Composite> compositeSet15 = composite7.children();
        java.util.Set<examples.Composite> compositeSet16 = composite7.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        examples.Composite composite1 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((int) (byte) 1);
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        composite1.addChild(composite5);
        examples.Composite composite9 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite9.addChild(composite12);
        examples.Composite composite16 = new examples.Composite((-3));
        composite12.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        java.util.Set<examples.Composite> compositeSet20 = composite16.children();
        java.util.Set<examples.Composite> compositeSet21 = composite16.children();
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
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        examples.Composite composite1 = new examples.Composite(1);
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
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        examples.Composite composite1 = new examples.Composite(8);
        examples.Composite composite3 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        examples.Composite composite9 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        examples.Composite composite12 = new examples.Composite(8);
        composite9.addChild(composite12);
        examples.Composite composite15 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        composite12.addChild(composite15);
        examples.Composite composite19 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        composite15.addChild(composite19);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet20);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
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
        examples.Composite composite21 = new examples.Composite((int) (byte) 100);
        composite11.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        java.lang.Class<?> wildcardClass24 = composite21.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
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
        java.util.Set<examples.Composite> compositeSet18 = composite8.children();
        examples.Composite composite20 = new examples.Composite(2);
        composite8.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        examples.Composite composite24 = new examples.Composite((-100));
        examples.Composite composite26 = new examples.Composite((-3));
        composite24.addChild(composite26);
        java.util.Set<examples.Composite> compositeSet28 = composite26.children();
        examples.Composite composite30 = new examples.Composite((-9));
        composite26.addChild(composite30);
        java.util.Set<examples.Composite> compositeSet32 = composite30.children();
        java.util.Set<examples.Composite> compositeSet33 = composite30.children();
        examples.Composite composite35 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet36 = composite35.children();
        composite30.addChild(composite35);
        examples.Composite composite39 = new examples.Composite((int) (short) -1);
        java.util.Set<examples.Composite> compositeSet40 = composite39.children();
        java.util.Set<examples.Composite> compositeSet41 = composite39.children();
        composite30.addChild(composite39);
        java.util.Set<examples.Composite> compositeSet43 = composite39.children();
        // The following exception was thrown during execution in test generation
        try {
            composite20.addChild(composite39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet36);
        org.junit.Assert.assertNotNull(compositeSet40);
        org.junit.Assert.assertNotNull(compositeSet41);
        org.junit.Assert.assertNotNull(compositeSet43);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        examples.Composite composite9 = new examples.Composite((-5));
        composite3.addChild(composite9);
        java.lang.Class<?> wildcardClass11 = composite3.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
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
        java.lang.Class<?> wildcardClass20 = compositeSet19.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        examples.Composite composite1 = new examples.Composite(3);
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite7 = new examples.Composite((-100));
        examples.Composite composite9 = new examples.Composite((-3));
        composite7.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        examples.Composite composite14 = new examples.Composite((-9));
        composite9.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        examples.Composite composite19 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        composite14.addChild(composite19);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        java.util.Set<examples.Composite> compositeSet12 = composite8.children();
        examples.Composite composite14 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        examples.Composite composite17 = new examples.Composite(8);
        composite14.addChild(composite17);
        examples.Composite composite20 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        composite17.addChild(composite20);
        examples.Composite composite24 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        composite20.addChild(composite24);
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        examples.Composite composite1 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (short) -1);
        examples.Composite composite6 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite4.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet9 = composite4.children();
        java.util.Set<examples.Composite> compositeSet10 = composite4.children();
        java.util.Set<examples.Composite> compositeSet11 = composite4.children();
        java.util.Set<examples.Composite> compositeSet12 = composite4.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        examples.Composite composite1 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) '#');
        composite1.addChild(composite4);
        examples.Composite composite7 = new examples.Composite(9);
        examples.Composite composite9 = new examples.Composite((int) (short) 10);
        composite7.addChild(composite9);
        examples.Composite composite12 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        composite7.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet17 = composite12.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet17);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
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
        java.lang.Class<?> wildcardClass15 = composite11.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
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
        examples.Composite composite16 = new examples.Composite((int) 'a');
        composite9.addChild(composite16);
        examples.Composite composite19 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        examples.Composite composite22 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        composite19.addChild(composite22);
        examples.Composite composite26 = new examples.Composite((-3));
        composite22.addChild(composite26);
        examples.Composite composite29 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet30 = composite29.children();
        java.util.Set<examples.Composite> compositeSet31 = composite29.children();
        composite22.addChild(composite29);
        // The following exception was thrown during execution in test generation
        try {
            composite16.addChild(composite29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet31);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        examples.Composite composite1 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite(0);
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.lang.Class<?> wildcardClass9 = compositeSet8.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-8));
        composite1.addChild(composite6);
        java.lang.Class<?> wildcardClass8 = composite1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((int) (short) -1);
        examples.Composite composite7 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        composite5.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet10 = composite7.children();
        java.util.Set<examples.Composite> compositeSet11 = composite7.children();
        java.util.Set<examples.Composite> compositeSet12 = composite7.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite1.addChild(composite8);
        examples.Composite composite12 = new examples.Composite((int) '4');
        composite8.addChild(composite12);
        examples.Composite composite15 = new examples.Composite((int) (short) -1);
        examples.Composite composite17 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        composite15.addChild(composite17);
        examples.Composite composite21 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        composite15.addChild(composite21);
        // The following exception was thrown during execution in test generation
        try {
            composite12.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
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
        java.util.Set<examples.Composite> compositeSet27 = composite20.children();
        java.util.Set<examples.Composite> compositeSet28 = composite20.children();
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
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        examples.Composite composite10 = new examples.Composite((int) (byte) -1);
        composite3.addChild(composite10);
        examples.Composite composite13 = new examples.Composite((-5));
        examples.Composite composite15 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        composite13.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        java.util.Set<examples.Composite> compositeSet19 = composite15.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        examples.Composite composite1 = new examples.Composite((-1));
        examples.Composite composite3 = new examples.Composite(100);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        examples.Composite composite10 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        composite7.addChild(composite10);
        examples.Composite composite15 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        composite7.addChild(composite15);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet16);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.lang.Class<?> wildcardClass7 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
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
        examples.Composite composite16 = new examples.Composite((int) (short) -1);
        examples.Composite composite18 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        composite16.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet21 = composite16.children();
        java.util.Set<examples.Composite> compositeSet22 = composite16.children();
        java.util.Set<examples.Composite> compositeSet23 = composite16.children();
        java.util.Set<examples.Composite> compositeSet24 = composite16.children();
        java.util.Set<examples.Composite> compositeSet25 = composite16.children();
        java.util.Set<examples.Composite> compositeSet26 = composite16.children();
        java.util.Set<examples.Composite> compositeSet27 = composite16.children();
        // The following exception was thrown during execution in test generation
        try {
            composite13.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite9 = new examples.Composite((-2));
        examples.Composite composite11 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        composite9.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet16 = composite11.children();
        java.util.Set<examples.Composite> compositeSet17 = composite11.children();
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite(4);
        composite3.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((int) (short) 100);
        composite8.addChild(composite11);
        examples.Composite composite14 = new examples.Composite((-100));
        examples.Composite composite16 = new examples.Composite((-3));
        composite14.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        java.util.Set<examples.Composite> compositeSet20 = composite16.children();
        java.util.Set<examples.Composite> compositeSet21 = composite16.children();
        java.util.Set<examples.Composite> compositeSet22 = composite16.children();
        examples.Composite composite24 = new examples.Composite((int) (byte) 0);
        composite16.addChild(composite24);
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
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
        examples.Composite composite16 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        examples.Composite composite19 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        composite16.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet23 = composite16.children();
        examples.Composite composite25 = new examples.Composite(4);
        composite16.addChild(composite25);
        java.util.Set<examples.Composite> compositeSet27 = composite16.children();
        java.util.Set<examples.Composite> compositeSet28 = composite16.children();
        java.util.Set<examples.Composite> compositeSet29 = composite16.children();
        java.util.Set<examples.Composite> compositeSet30 = composite16.children();
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
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
        examples.Composite composite16 = new examples.Composite((-100));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        java.util.Set<examples.Composite> compositeSet21 = composite18.children();
        java.util.Set<examples.Composite> compositeSet22 = composite18.children();
        java.util.Set<examples.Composite> compositeSet23 = composite18.children();
        java.util.Set<examples.Composite> compositeSet24 = composite18.children();
        java.util.Set<examples.Composite> compositeSet25 = composite18.children();
        // The following exception was thrown during execution in test generation
        try {
            composite12.addChild(composite18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
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
        java.util.Set<examples.Composite> compositeSet16 = composite8.children();
        examples.Composite composite18 = new examples.Composite((int) '#');
        composite8.addChild(composite18);
        examples.Composite composite21 = new examples.Composite((-100));
        examples.Composite composite23 = new examples.Composite((-3));
        composite21.addChild(composite23);
        java.util.Set<examples.Composite> compositeSet25 = composite23.children();
        java.util.Set<examples.Composite> compositeSet26 = composite23.children();
        examples.Composite composite28 = new examples.Composite((-9));
        composite23.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet30 = composite28.children();
        examples.Composite composite32 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet33 = composite32.children();
        java.util.Set<examples.Composite> compositeSet34 = composite32.children();
        composite28.addChild(composite32);
        java.util.Set<examples.Composite> compositeSet36 = composite32.children();
        java.util.Set<examples.Composite> compositeSet37 = composite32.children();
        examples.Composite composite39 = new examples.Composite((int) (short) 10);
        composite32.addChild(composite39);
        java.util.Set<examples.Composite> compositeSet41 = composite39.children();
        java.util.Set<examples.Composite> compositeSet42 = composite39.children();
        // The following exception was thrown during execution in test generation
        try {
            composite18.addChild(composite39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet36);
        org.junit.Assert.assertNotNull(compositeSet37);
        org.junit.Assert.assertNotNull(compositeSet41);
        org.junit.Assert.assertNotNull(compositeSet42);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        examples.Composite composite1 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.lang.Class<?> wildcardClass6 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        examples.Composite composite1 = new examples.Composite((-1));
        examples.Composite composite3 = new examples.Composite(100);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        examples.Composite composite9 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite6.addChild(composite9);
        examples.Composite composite13 = new examples.Composite((-2));
        composite6.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet15 = composite6.children();
        examples.Composite composite17 = new examples.Composite(6);
        composite6.addChild(composite17);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet15);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        examples.Composite composite1 = new examples.Composite((-5));
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.lang.Class<?> wildcardClass8 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        examples.Composite composite1 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite(9);
        examples.Composite composite7 = new examples.Composite((int) (short) 10);
        composite5.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite5.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet9);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite10 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        examples.Composite composite14 = new examples.Composite((int) (byte) 1);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        composite10.addChild(composite14);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite14);
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
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
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
        java.lang.Class<?> wildcardClass16 = compositeSet15.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite10 = new examples.Composite(10);
        composite6.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        examples.Composite composite14 = new examples.Composite((-100));
        examples.Composite composite16 = new examples.Composite((-3));
        composite14.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        examples.Composite composite21 = new examples.Composite((-9));
        composite16.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        examples.Composite composite25 = new examples.Composite((int) '4');
        composite21.addChild(composite25);
        examples.Composite composite28 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        composite21.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet31 = composite21.children();
        java.util.Set<examples.Composite> compositeSet32 = composite21.children();
        // The following exception was thrown during execution in test generation
        try {
            composite10.addChild(composite21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet32);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        examples.Composite composite1 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite10 = new examples.Composite((-100));
        examples.Composite composite12 = new examples.Composite((-3));
        composite10.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        examples.Composite composite17 = new examples.Composite((-9));
        composite12.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        examples.Composite composite21 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        composite17.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet25 = composite21.children();
        java.util.Set<examples.Composite> compositeSet26 = composite21.children();
        examples.Composite composite28 = new examples.Composite((int) (short) 10);
        composite21.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet30 = composite21.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet30);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        examples.Composite composite1 = new examples.Composite(3);
        examples.Composite composite3 = new examples.Composite((-2));
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
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((int) (short) 1);
        composite8.addChild(composite11);
        examples.Composite composite14 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        examples.Composite composite19 = new examples.Composite(3);
        composite14.addChild(composite19);
        examples.Composite composite22 = new examples.Composite((-7));
        composite14.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite14.children();
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite10 = new examples.Composite(4);
        composite1.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite1.children();
        java.util.Set<examples.Composite> compositeSet13 = composite1.children();
        examples.Composite composite15 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        examples.Composite composite18 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        composite15.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet21 = composite15.children();
        examples.Composite composite23 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        composite15.addChild(composite23);
        java.util.Set<examples.Composite> compositeSet26 = composite15.children();
        java.util.Set<examples.Composite> compositeSet27 = composite15.children();
        examples.Composite composite29 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet30 = composite29.children();
        composite15.addChild(composite29);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet30);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
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
        examples.Composite composite18 = new examples.Composite((int) '4');
        examples.Composite composite20 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        composite18.addChild(composite20);
        examples.Composite composite25 = new examples.Composite((int) (byte) 100);
        composite18.addChild(composite25);
        examples.Composite composite28 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        composite25.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet31 = composite25.children();
        java.util.Set<examples.Composite> compositeSet32 = composite25.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet32);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(3);
        composite1.addChild(composite6);
        examples.Composite composite9 = new examples.Composite((-7));
        composite1.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        java.lang.Class<?> wildcardClass12 = compositeSet11.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
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
        examples.Composite composite15 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        composite12.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet19 = composite12.children();
        java.util.Set<examples.Composite> compositeSet20 = composite12.children();
        java.lang.Class<?> wildcardClass21 = composite12.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        examples.Composite composite1 = new examples.Composite((-10));
        examples.Composite composite3 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        java.util.Set<examples.Composite> compositeSet9 = composite3.children();
        java.util.Set<examples.Composite> compositeSet10 = composite3.children();
        java.lang.Class<?> wildcardClass11 = composite3.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        java.util.Set<examples.Composite> compositeSet10 = composite7.children();
        composite3.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet12 = composite3.children();
        java.util.Set<examples.Composite> compositeSet13 = composite3.children();
        examples.Composite composite15 = new examples.Composite(9);
        examples.Composite composite17 = new examples.Composite((int) (short) 10);
        composite15.addChild(composite17);
        examples.Composite composite20 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        composite15.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet24 = composite20.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
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
        java.util.Set<examples.Composite> compositeSet15 = composite7.children();
        java.lang.Class<?> wildcardClass16 = compositeSet15.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
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
        java.util.Set<examples.Composite> compositeSet26 = composite22.children();
        java.util.Set<examples.Composite> compositeSet27 = composite22.children();
        examples.Composite composite29 = new examples.Composite((-100));
        examples.Composite composite31 = new examples.Composite((-3));
        composite29.addChild(composite31);
        java.util.Set<examples.Composite> compositeSet33 = composite31.children();
        java.util.Set<examples.Composite> compositeSet34 = composite31.children();
        java.util.Set<examples.Composite> compositeSet35 = composite31.children();
        java.util.Set<examples.Composite> compositeSet36 = composite31.children();
        examples.Composite composite38 = new examples.Composite((int) (short) 0);
        composite31.addChild(composite38);
        java.util.Set<examples.Composite> compositeSet40 = composite38.children();
        java.util.Set<examples.Composite> compositeSet41 = composite38.children();
        java.util.Set<examples.Composite> compositeSet42 = composite38.children();
        java.util.Set<examples.Composite> compositeSet43 = composite38.children();
        // The following exception was thrown during execution in test generation
        try {
            composite22.addChild(composite38);
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
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet35);
        org.junit.Assert.assertNotNull(compositeSet36);
        org.junit.Assert.assertNotNull(compositeSet40);
        org.junit.Assert.assertNotNull(compositeSet41);
        org.junit.Assert.assertNotNull(compositeSet42);
        org.junit.Assert.assertNotNull(compositeSet43);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        examples.Composite composite1 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        java.lang.Class<?> wildcardClass9 = composite4.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        examples.Composite composite1 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-100));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        examples.Composite composite11 = new examples.Composite((-9));
        composite7.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        examples.Composite composite16 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        composite11.addChild(composite16);
        examples.Composite composite20 = new examples.Composite((int) (short) -1);
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        composite11.addChild(composite20);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(3);
        composite1.addChild(composite6);
        examples.Composite composite9 = new examples.Composite((-100));
        examples.Composite composite11 = new examples.Composite((-3));
        composite9.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        examples.Composite composite16 = new examples.Composite(4);
        composite11.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        // The following exception was thrown during execution in test generation
        try {
            composite6.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        examples.Composite composite1 = new examples.Composite(3);
        examples.Composite composite3 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite10 = new examples.Composite(100);
        composite1.addChild(composite10);
        java.lang.Class<?> wildcardClass12 = composite10.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
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
        examples.Composite composite21 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        examples.Composite composite25 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        java.util.Set<examples.Composite> compositeSet27 = composite25.children();
        composite21.addChild(composite25);
        // The following exception was thrown during execution in test generation
        try {
            composite7.addChild(composite21);
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
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
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
        examples.Composite composite17 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        composite13.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet20 = composite13.children();
        java.util.Set<examples.Composite> compositeSet21 = composite13.children();
        java.lang.Class<?> wildcardClass22 = compositeSet21.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite1.addChild(composite8);
        examples.Composite composite12 = new examples.Composite((-100));
        examples.Composite composite14 = new examples.Composite((-3));
        composite12.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        examples.Composite composite19 = new examples.Composite(4);
        composite14.addChild(composite19);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
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
        examples.Composite composite20 = new examples.Composite((int) (short) -1);
        examples.Composite composite22 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        composite20.addChild(composite22);
        examples.Composite composite26 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        java.util.Set<examples.Composite> compositeSet28 = composite26.children();
        composite20.addChild(composite26);
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite(2);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        examples.Composite composite11 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite8.addChild(composite11);
        examples.Composite composite15 = new examples.Composite((-3));
        composite11.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite(2);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite3.addChild(composite6);
        examples.Composite composite11 = new examples.Composite((int) (byte) -1);
        composite3.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite3.children();
        examples.Composite composite15 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        examples.Composite composite20 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        composite15.addChild(composite20);
        examples.Composite composite24 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        composite20.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet27 = composite20.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet27);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
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
        examples.Composite composite14 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        examples.Composite composite17 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        composite14.addChild(composite17);
        examples.Composite composite22 = new examples.Composite((int) (short) 1);
        composite17.addChild(composite22);
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite22);
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
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        examples.Composite composite8 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        examples.Composite composite11 = new examples.Composite(8);
        composite8.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite8.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        examples.Composite composite1 = new examples.Composite(10);
        examples.Composite composite3 = new examples.Composite((-100));
        examples.Composite composite5 = new examples.Composite((-3));
        composite3.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        java.util.Set<examples.Composite> compositeSet8 = composite5.children();
        examples.Composite composite10 = new examples.Composite((-9));
        composite5.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        examples.Composite composite14 = new examples.Composite((int) '4');
        composite10.addChild(composite14);
        examples.Composite composite17 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        composite14.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet21 = composite17.children();
        java.util.Set<examples.Composite> compositeSet22 = composite17.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
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
        java.util.Set<examples.Composite> compositeSet16 = composite8.children();
        java.util.Set<examples.Composite> compositeSet17 = composite8.children();
        java.util.Set<examples.Composite> compositeSet18 = composite8.children();
        java.lang.Class<?> wildcardClass19 = composite8.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
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
        examples.Composite composite20 = new examples.Composite((-100));
        examples.Composite composite22 = new examples.Composite((-3));
        composite20.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        examples.Composite composite27 = new examples.Composite((-9));
        composite22.addChild(composite27);
        java.util.Set<examples.Composite> compositeSet29 = composite27.children();
        examples.Composite composite31 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet32 = composite31.children();
        java.util.Set<examples.Composite> compositeSet33 = composite31.children();
        composite27.addChild(composite31);
        java.util.Set<examples.Composite> compositeSet35 = composite31.children();
        java.util.Set<examples.Composite> compositeSet36 = composite31.children();
        examples.Composite composite38 = new examples.Composite((int) (short) 10);
        composite31.addChild(composite38);
        java.util.Set<examples.Composite> compositeSet40 = composite31.children();
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite31);
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
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet35);
        org.junit.Assert.assertNotNull(compositeSet36);
        org.junit.Assert.assertNotNull(compositeSet40);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.lang.Class<?> wildcardClass11 = compositeSet10.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite(2);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-100));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        java.util.Set<examples.Composite> compositeSet14 = composite10.children();
        java.util.Set<examples.Composite> compositeSet15 = composite10.children();
        java.util.Set<examples.Composite> compositeSet16 = composite10.children();
        java.util.Set<examples.Composite> compositeSet17 = composite10.children();
        examples.Composite composite19 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
        java.util.Set<examples.Composite> compositeSet23 = composite19.children();
        composite10.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet25 = composite19.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        examples.Composite composite1 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-9));
        examples.Composite composite6 = new examples.Composite((int) (byte) 1);
        composite4.addChild(composite6);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((int) (byte) 10);
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite10 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        examples.Composite composite13 = new examples.Composite(8);
        composite10.addChild(composite13);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        examples.Composite composite1 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.lang.Class<?> wildcardClass7 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
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
        examples.Composite composite14 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        examples.Composite composite19 = new examples.Composite((int) (short) 0);
        composite14.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite14.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        java.util.Set<examples.Composite> compositeSet9 = composite3.children();
        java.util.Set<examples.Composite> compositeSet10 = composite3.children();
        examples.Composite composite12 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        java.util.Set<examples.Composite> compositeSet16 = composite12.children();
        composite3.addChild(composite12);
        java.lang.Class<?> wildcardClass18 = composite3.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite11 = new examples.Composite((-100));
        examples.Composite composite13 = new examples.Composite((-3));
        composite11.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        java.util.Set<examples.Composite> compositeSet16 = composite13.children();
        java.util.Set<examples.Composite> compositeSet17 = composite13.children();
        java.util.Set<examples.Composite> compositeSet18 = composite13.children();
        java.util.Set<examples.Composite> compositeSet19 = composite13.children();
        // The following exception was thrown during execution in test generation
        try {
            composite6.addChild(composite13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
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
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        examples.Composite composite20 = new examples.Composite((-100));
        examples.Composite composite22 = new examples.Composite((-3));
        composite20.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        examples.Composite composite27 = new examples.Composite(4);
        composite22.addChild(composite27);
        examples.Composite composite30 = new examples.Composite((int) (short) 100);
        composite27.addChild(composite30);
        java.util.Set<examples.Composite> compositeSet32 = composite30.children();
        // The following exception was thrown during execution in test generation
        try {
            composite16.addChild(composite30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet32);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        examples.Composite composite1 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        examples.Composite composite1 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite(0);
        composite1.addChild(composite5);
        examples.Composite composite8 = new examples.Composite((-100));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite composite13 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        java.util.Set<examples.Composite> compositeSet16 = composite13.children();
        composite8.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet18 = composite13.children();
        java.util.Set<examples.Composite> compositeSet19 = composite13.children();
        examples.Composite composite21 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        java.util.Set<examples.Composite> compositeSet24 = composite21.children();
        composite13.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet26 = composite13.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
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
        examples.Composite composite25 = new examples.Composite((-3));
        composite23.addChild(composite25);
        java.util.Set<examples.Composite> compositeSet27 = composite25.children();
        java.util.Set<examples.Composite> compositeSet28 = composite25.children();
        examples.Composite composite30 = new examples.Composite((-9));
        composite25.addChild(composite30);
        java.util.Set<examples.Composite> compositeSet32 = composite30.children();
        examples.Composite composite34 = new examples.Composite((int) '4');
        composite30.addChild(composite34);
        // The following exception was thrown during execution in test generation
        try {
            composite19.addChild(composite34);
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
        org.junit.Assert.assertNotNull(compositeSet32);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
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
        java.util.Set<examples.Composite> compositeSet26 = composite22.children();
        examples.Composite composite28 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        examples.Composite composite31 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet32 = composite31.children();
        composite28.addChild(composite31);
        java.util.Set<examples.Composite> compositeSet34 = composite28.children();
        java.util.Set<examples.Composite> compositeSet35 = composite28.children();
        examples.Composite composite37 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet38 = composite37.children();
        java.util.Set<examples.Composite> compositeSet39 = composite37.children();
        composite28.addChild(composite37);
        // The following exception was thrown during execution in test generation
        try {
            composite22.addChild(composite28);
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
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet35);
        org.junit.Assert.assertNotNull(compositeSet38);
        org.junit.Assert.assertNotNull(compositeSet39);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
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
        java.lang.Class<?> wildcardClass17 = compositeSet16.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-100));
        examples.Composite composite6 = new examples.Composite((-3));
        composite4.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        java.util.Set<examples.Composite> compositeSet10 = composite6.children();
        java.util.Set<examples.Composite> compositeSet11 = composite6.children();
        java.util.Set<examples.Composite> compositeSet12 = composite6.children();
        java.util.Set<examples.Composite> compositeSet13 = composite6.children();
        java.util.Set<examples.Composite> compositeSet14 = composite6.children();
        examples.Composite composite16 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        composite6.addChild(composite16);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        examples.Composite composite1 = new examples.Composite((int) (short) 100);
        examples.Composite composite3 = new examples.Composite((int) (short) 0);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.lang.Class<?> wildcardClass6 = composite3.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(3);
        composite1.addChild(composite6);
        examples.Composite composite9 = new examples.Composite(5);
        composite6.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet11 = composite6.children();
        java.lang.Class<?> wildcardClass12 = compositeSet11.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
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
        examples.Composite composite22 = new examples.Composite((-3));
        composite20.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        examples.Composite composite27 = new examples.Composite(4);
        composite22.addChild(composite27);
        examples.Composite composite30 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet31 = composite30.children();
        java.util.Set<examples.Composite> compositeSet32 = composite30.children();
        java.util.Set<examples.Composite> compositeSet33 = composite30.children();
        java.util.Set<examples.Composite> compositeSet34 = composite30.children();
        composite22.addChild(composite30);
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite30);
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
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet34);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
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
        java.util.Set<examples.Composite> compositeSet18 = composite1.children();
        java.lang.Class<?> wildcardClass19 = compositeSet18.getClass();
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
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
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
        java.lang.Class<?> wildcardClass14 = compositeSet13.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        examples.Composite composite1 = new examples.Composite((-9));
        examples.Composite composite3 = new examples.Composite((int) (byte) 1);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        examples.Composite composite7 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        examples.Composite composite10 = new examples.Composite(8);
        composite7.addChild(composite10);
        examples.Composite composite13 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        composite10.addChild(composite13);
        examples.Composite composite17 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        java.util.Set<examples.Composite> compositeSet20 = composite17.children();
        java.util.Set<examples.Composite> compositeSet21 = composite17.children();
        java.util.Set<examples.Composite> compositeSet22 = composite17.children();
        composite13.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet24 = composite13.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite11 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite1.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet14 = composite1.children();
        java.lang.Class<?> wildcardClass15 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        examples.Composite composite1 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        examples.Composite composite10 = new examples.Composite(4);
        composite6.addChild(composite10);
        examples.Composite composite13 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        java.util.Set<examples.Composite> compositeSet16 = composite13.children();
        composite6.addChild(composite13);
        examples.Composite composite19 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        composite13.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        examples.Composite composite7 = new examples.Composite((int) (short) 0);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        composite4.addChild(composite7);
        examples.Composite composite11 = new examples.Composite(7);
        composite7.addChild(composite11);
        java.lang.Class<?> wildcardClass13 = composite11.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite11 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        composite1.addChild(composite11);
        examples.Composite composite17 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        examples.Composite composite20 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        composite17.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet23 = composite17.children();
        examples.Composite composite25 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        composite17.addChild(composite25);
        java.util.Set<examples.Composite> compositeSet28 = composite17.children();
        java.util.Set<examples.Composite> compositeSet29 = composite17.children();
        examples.Composite composite31 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet32 = composite31.children();
        composite17.addChild(composite31);
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
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet32);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
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
        java.lang.Class<?> wildcardClass13 = composite3.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        examples.Composite composite7 = new examples.Composite((int) (byte) 10);
        composite1.addChild(composite7);
        java.lang.Class<?> wildcardClass9 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
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
        java.util.Set<examples.Composite> compositeSet16 = composite13.children();
        examples.Composite composite18 = new examples.Composite(9);
        examples.Composite composite20 = new examples.Composite((int) (short) 10);
        composite18.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        // The following exception was thrown during execution in test generation
        try {
            composite13.addChild(composite20);
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
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        examples.Composite composite1 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.lang.Class<?> wildcardClass4 = compositeSet3.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
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
        examples.Composite composite15 = new examples.Composite((int) (short) -1);
        examples.Composite composite17 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        composite15.addChild(composite17);
        examples.Composite composite21 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        composite15.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet25 = composite21.children();
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        examples.Composite composite1 = new examples.Composite(8);
        examples.Composite composite3 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.lang.Class<?> wildcardClass9 = compositeSet8.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        examples.Composite composite1 = new examples.Composite(2);
        examples.Composite composite3 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        examples.Composite composite9 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite3.addChild(composite9);
        examples.Composite composite13 = new examples.Composite((-100));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        examples.Composite composite20 = new examples.Composite((-7));
        composite15.addChild(composite20);
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        examples.Composite composite1 = new examples.Composite(4);
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
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        examples.Composite composite13 = new examples.Composite((int) (short) -1);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        composite9.addChild(composite13);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
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
        examples.Composite composite24 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        java.util.Set<examples.Composite> compositeSet27 = composite24.children();
        java.util.Set<examples.Composite> compositeSet28 = composite24.children();
        java.util.Set<examples.Composite> compositeSet29 = composite24.children();
        java.util.Set<examples.Composite> compositeSet30 = composite24.children();
        examples.Composite composite32 = new examples.Composite((-7));
        composite24.addChild(composite32);
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
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
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        examples.Composite composite1 = new examples.Composite(9);
        examples.Composite composite3 = new examples.Composite((int) (short) 10);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet10 = composite6.children();
        java.lang.Class<?> wildcardClass11 = compositeSet10.getClass();
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-6));
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        java.util.Set<examples.Composite> compositeSet10 = composite6.children();
        java.util.Set<examples.Composite> compositeSet11 = composite6.children();
        java.lang.Class<?> wildcardClass12 = composite6.getClass();
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        examples.Composite composite1 = new examples.Composite((-2));
        examples.Composite composite3 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        examples.Composite composite10 = new examples.Composite((-100));
        examples.Composite composite12 = new examples.Composite((-3));
        composite10.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        examples.Composite composite17 = new examples.Composite((-9));
        composite12.addChild(composite17);
        examples.Composite composite20 = new examples.Composite((int) (short) 1);
        composite17.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet22 = composite17.children();
        examples.Composite composite24 = new examples.Composite(100);
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        composite17.addChild(composite24);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
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
        examples.Composite composite18 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        java.util.Set<examples.Composite> compositeSet21 = composite18.children();
        examples.Composite composite23 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        java.util.Set<examples.Composite> compositeSet25 = composite23.children();
        composite18.addChild(composite23);
        examples.Composite composite28 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        java.util.Set<examples.Composite> compositeSet30 = composite28.children();
        java.util.Set<examples.Composite> compositeSet31 = composite28.children();
        composite18.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet33 = composite18.children();
        java.util.Set<examples.Composite> compositeSet34 = composite18.children();
        examples.Composite composite36 = new examples.Composite((int) (short) 10);
        composite18.addChild(composite36);
        examples.Composite composite39 = new examples.Composite(3);
        composite36.addChild(composite39);
        java.util.Set<examples.Composite> compositeSet41 = composite36.children();
        examples.Composite composite43 = new examples.Composite((-7));
        composite36.addChild(composite43);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite43);
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
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet41);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        examples.Composite composite1 = new examples.Composite((-1));
        examples.Composite composite3 = new examples.Composite(100);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-5));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        composite8.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet17 = composite8.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet17);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        examples.Composite composite1 = new examples.Composite((-2));
        examples.Composite composite3 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite9 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        examples.Composite composite14 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        composite9.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet18 = composite9.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
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
        examples.Composite composite16 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        examples.Composite composite19 = new examples.Composite((int) ' ');
        composite16.addChild(composite19);
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet17);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
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
        java.util.Set<examples.Composite> compositeSet17 = composite8.children();
        examples.Composite composite19 = new examples.Composite((int) '4');
        examples.Composite composite21 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        composite19.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet25 = composite21.children();
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite21);
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
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        examples.Composite composite1 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite(0);
        composite1.addChild(composite5);
        java.lang.Class<?> wildcardClass7 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
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
        examples.Composite composite15 = new examples.Composite(5);
        examples.Composite composite17 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
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
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
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
        examples.Composite composite15 = new examples.Composite((-100));
        examples.Composite composite17 = new examples.Composite((-3));
        composite15.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        java.util.Set<examples.Composite> compositeSet20 = composite17.children();
        java.util.Set<examples.Composite> compositeSet21 = composite17.children();
        java.util.Set<examples.Composite> compositeSet22 = composite17.children();
        // The following exception was thrown during execution in test generation
        try {
            composite10.addChild(composite17);
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
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        examples.Composite composite1 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((-100));
        examples.Composite composite8 = new examples.Composite((-3));
        composite6.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        examples.Composite composite13 = new examples.Composite((-9));
        composite8.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet15 = composite8.children();
        examples.Composite composite17 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        composite8.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet20 = composite8.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet20);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        examples.Composite composite1 = new examples.Composite((-5));
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite7 = new examples.Composite(2);
        composite1.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        java.util.Set<examples.Composite> compositeSet10 = composite7.children();
        java.lang.Class<?> wildcardClass11 = composite7.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite(2);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite3.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet10 = composite3.children();
        java.lang.Class<?> wildcardClass11 = composite3.getClass();
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        examples.Composite composite1 = new examples.Composite(5);
        examples.Composite composite3 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite1.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        java.util.Set<examples.Composite> compositeSet12 = composite8.children();
        java.lang.Class<?> wildcardClass13 = compositeSet12.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
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
        examples.Composite composite20 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite15.addChild(composite20);
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
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite10 = new examples.Composite(4);
        composite1.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite1.children();
        java.util.Set<examples.Composite> compositeSet13 = composite1.children();
        java.util.Set<examples.Composite> compositeSet14 = composite1.children();
        java.lang.Class<?> wildcardClass15 = compositeSet14.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite(2);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite3.addChild(composite6);
        examples.Composite composite11 = new examples.Composite((int) (byte) -1);
        composite3.addChild(composite11);
        examples.Composite composite14 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        examples.Composite composite17 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        composite14.addChild(composite17);
        examples.Composite composite21 = new examples.Composite((-3));
        composite17.addChild(composite21);
        examples.Composite composite24 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        composite17.addChild(composite24);
        examples.Composite composite29 = new examples.Composite((-9));
        composite24.addChild(composite29);
        java.util.Set<examples.Composite> compositeSet31 = composite24.children();
        java.util.Set<examples.Composite> compositeSet32 = composite24.children();
        examples.Composite composite34 = new examples.Composite((int) (byte) 100);
        composite24.addChild(composite34);
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet32);
    }
}

