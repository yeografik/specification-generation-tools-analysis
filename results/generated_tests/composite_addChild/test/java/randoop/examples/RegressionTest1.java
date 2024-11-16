package examples;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        examples.Composite composite1 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) ' ');
        composite1.addChild(composite4);
        examples.Composite composite7 = new examples.Composite((-100));
        examples.Composite composite9 = new examples.Composite((-3));
        composite7.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        java.util.Set<examples.Composite> compositeSet13 = composite9.children();
        java.util.Set<examples.Composite> compositeSet14 = composite9.children();
        examples.Composite composite16 = new examples.Composite((int) (short) 0);
        composite9.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite9.children();
        java.util.Set<examples.Composite> compositeSet19 = composite9.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
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
        examples.Composite composite23 = new examples.Composite((int) (byte) 1);
        examples.Composite composite25 = new examples.Composite(2);
        composite23.addChild(composite25);
        java.util.Set<examples.Composite> compositeSet27 = composite23.children();
        java.util.Set<examples.Composite> compositeSet28 = composite23.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite23);
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
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
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
        java.lang.Class<?> wildcardClass13 = composite11.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        java.lang.Class<?> wildcardClass10 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite(4);
        composite3.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        examples.Composite composite14 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        composite11.addChild(composite14);
        examples.Composite composite18 = new examples.Composite((-3));
        composite14.addChild(composite18);
        examples.Composite composite21 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        composite14.addChild(composite21);
        examples.Composite composite26 = new examples.Composite((-9));
        composite21.addChild(composite26);
        java.util.Set<examples.Composite> compositeSet28 = composite21.children();
        java.util.Set<examples.Composite> compositeSet29 = composite21.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(3);
        composite1.addChild(composite6);
        examples.Composite composite9 = new examples.Composite(5);
        composite6.addChild(composite9);
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
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
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
        examples.Composite composite15 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        examples.Composite composite18 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        composite15.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet22 = composite15.children();
        java.util.Set<examples.Composite> compositeSet23 = composite15.children();
        java.util.Set<examples.Composite> compositeSet24 = composite15.children();
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        examples.Composite composite7 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        composite4.addChild(composite7);
        java.lang.Class<?> wildcardClass11 = composite7.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
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
        java.lang.Class<?> wildcardClass21 = composite19.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((int) (byte) 100);
        composite1.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        java.lang.Class<?> wildcardClass12 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
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
        java.lang.Class<?> wildcardClass22 = composite15.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite7 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        composite1.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet11 = composite7.children();
        examples.Composite composite13 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        examples.Composite composite17 = new examples.Composite((-6));
        composite13.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        java.util.Set<examples.Composite> compositeSet20 = composite17.children();
        // The following exception was thrown during execution in test generation
        try {
            composite7.addChild(composite17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        examples.Composite composite1 = new examples.Composite((-5));
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((int) (byte) 1);
        examples.Composite composite10 = new examples.Composite(2);
        composite8.addChild(composite10);
        examples.Composite composite13 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        composite10.addChild(composite13);
        examples.Composite composite18 = new examples.Composite((int) (byte) -1);
        composite10.addChild(composite18);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-8));
        composite1.addChild(composite6);
        examples.Composite composite9 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite9.addChild(composite12);
        examples.Composite composite16 = new examples.Composite((-2));
        composite9.addChild(composite16);
        examples.Composite composite19 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        composite9.addChild(composite19);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet20);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        examples.Composite composite1 = new examples.Composite((-2));
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
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-8));
        composite1.addChild(composite6);
        examples.Composite composite9 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        composite1.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet13 = composite1.children();
        java.lang.Class<?> wildcardClass14 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        examples.Composite composite7 = new examples.Composite((int) (byte) 10);
        composite1.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        examples.Composite composite12 = new examples.Composite((-100));
        examples.Composite composite14 = new examples.Composite((-3));
        composite12.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        examples.Composite composite19 = new examples.Composite((-9));
        composite14.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite14.children();
        java.util.Set<examples.Composite> compositeSet22 = composite14.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        examples.Composite composite1 = new examples.Composite(9);
        examples.Composite composite3 = new examples.Composite((int) (short) 10);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        examples.Composite composite9 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        composite6.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet13 = composite9.children();
        examples.Composite composite15 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        composite9.addChild(composite15);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        java.util.Set<examples.Composite> compositeSet9 = composite4.children();
        java.lang.Class<?> wildcardClass10 = composite4.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        examples.Composite composite1 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        examples.Composite composite7 = new examples.Composite(8);
        composite4.addChild(composite7);
        examples.Composite composite10 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        composite7.addChild(composite10);
        examples.Composite composite14 = new examples.Composite((int) '4');
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
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet15);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        java.lang.Class<?> wildcardClass12 = compositeSet11.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
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
        java.lang.Class<?> wildcardClass15 = composite8.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        examples.Composite composite1 = new examples.Composite((-5));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(0);
        examples.Composite composite6 = new examples.Composite((int) (short) 1);
        composite4.addChild(composite6);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite(2);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        examples.Composite composite9 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite6.addChild(composite9);
        examples.Composite composite13 = new examples.Composite((-2));
        composite6.addChild(composite13);
        examples.Composite composite16 = new examples.Composite(7);
        composite6.addChild(composite16);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite(4);
        composite3.addChild(composite7);
        examples.Composite composite10 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        composite3.addChild(composite10);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        examples.Composite composite17 = new examples.Composite(3);
        composite12.addChild(composite17);
        examples.Composite composite20 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        java.util.Set<examples.Composite> compositeSet23 = composite20.children();
        composite12.addChild(composite20);
        examples.Composite composite26 = new examples.Composite((-10));
        composite12.addChild(composite26);
        java.util.Set<examples.Composite> compositeSet28 = composite26.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite26);
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
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        examples.Composite composite1 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite((-100));
        examples.Composite composite11 = new examples.Composite((-3));
        composite9.addChild(composite11);
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
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
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
            composite13.addChild(composite26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet32);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
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
        examples.Composite composite19 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        examples.Composite composite1 = new examples.Composite((int) (short) 0);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-5));
        examples.Composite composite6 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite4.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet9);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        examples.Composite composite1 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.lang.Class<?> wildcardClass7 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        examples.Composite composite1 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.lang.Class<?> wildcardClass4 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
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
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        java.lang.Class<?> wildcardClass15 = compositeSet14.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        examples.Composite composite1 = new examples.Composite(6);
        java.lang.Class<?> wildcardClass2 = composite1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        examples.Composite composite1 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        examples.Composite composite7 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        composite4.addChild(composite7);
        examples.Composite composite11 = new examples.Composite((-3));
        composite7.addChild(composite11);
        examples.Composite composite14 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        composite7.addChild(composite14);
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
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
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
        examples.Composite composite18 = new examples.Composite((int) (short) -1);
        examples.Composite composite20 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        composite18.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet23 = composite20.children();
        java.util.Set<examples.Composite> compositeSet24 = composite20.children();
        // The following exception was thrown during execution in test generation
        try {
            composite14.addChild(composite20);
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
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite(2);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite3.addChild(composite6);
        java.lang.Class<?> wildcardClass10 = composite6.getClass();
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
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
        java.lang.Class<?> wildcardClass13 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
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
        examples.Composite composite20 = new examples.Composite(2);
        examples.Composite composite22 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        composite20.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet26 = composite20.children();
        // The following exception was thrown during execution in test generation
        try {
            composite12.addChild(composite20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
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
        examples.Composite composite15 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        examples.Composite composite18 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        composite15.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet21 = composite18.children();
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
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
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
        java.lang.Class<?> wildcardClass18 = compositeSet17.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        examples.Composite composite1 = new examples.Composite(2);
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
            composite1.addChild(composite4);
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
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
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
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
        examples.Composite composite24 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        composite19.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet27 = composite19.children();
        java.util.Set<examples.Composite> compositeSet28 = composite19.children();
        java.util.Set<examples.Composite> compositeSet29 = composite19.children();
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite19);
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
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        examples.Composite composite10 = new examples.Composite((int) '4');
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        composite10.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet16 = composite12.children();
        examples.Composite composite18 = new examples.Composite((-5));
        composite12.addChild(composite18);
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        examples.Composite composite1 = new examples.Composite((int) ' ');
        examples.Composite composite3 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        examples.Composite composite6 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite3.addChild(composite6);
        examples.Composite composite10 = new examples.Composite((-2));
        composite3.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite3.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet12);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
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
        examples.Composite composite14 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        examples.Composite composite19 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        composite14.addChild(composite19);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite19);
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
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        examples.Composite composite13 = new examples.Composite((-100));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        examples.Composite composite19 = new examples.Composite((-9));
        composite15.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
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
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite(2);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        examples.Composite composite9 = new examples.Composite(8);
        composite6.addChild(composite9);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        examples.Composite composite10 = new examples.Composite(8);
        examples.Composite composite12 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        composite10.addChild(composite12);
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
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
        examples.Composite composite22 = new examples.Composite((-100));
        examples.Composite composite24 = new examples.Composite((-3));
        composite22.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet26 = composite22.children();
        java.util.Set<examples.Composite> compositeSet27 = composite22.children();
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
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        examples.Composite composite1 = new examples.Composite((-1));
        examples.Composite composite3 = new examples.Composite(100);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-100));
        examples.Composite composite8 = new examples.Composite((-3));
        composite6.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        examples.Composite composite13 = new examples.Composite((-9));
        composite8.addChild(composite13);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
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
        examples.Composite composite16 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
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
        java.lang.Class<?> wildcardClass20 = composite17.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(3);
        composite1.addChild(composite6);
        examples.Composite composite9 = new examples.Composite(5);
        composite6.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet11 = composite6.children();
        examples.Composite composite13 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        examples.Composite composite16 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        composite13.addChild(composite16);
        examples.Composite composite20 = new examples.Composite((-2));
        composite13.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet22 = composite13.children();
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
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
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
        examples.Composite composite23 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        java.util.Set<examples.Composite> compositeSet25 = composite23.children();
        examples.Composite composite27 = new examples.Composite((-6));
        composite23.addChild(composite27);
        java.util.Set<examples.Composite> compositeSet29 = composite27.children();
        // The following exception was thrown during execution in test generation
        try {
            composite15.addChild(composite27);
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
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet29);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
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
        java.lang.Class<?> wildcardClass15 = compositeSet14.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
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
        examples.Composite composite19 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
        examples.Composite composite24 = new examples.Composite(3);
        composite19.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet26 = composite19.children();
        java.util.Set<examples.Composite> compositeSet27 = composite19.children();
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
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
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
        examples.Composite composite15 = new examples.Composite((-100));
        examples.Composite composite17 = new examples.Composite((-3));
        composite15.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        java.util.Set<examples.Composite> compositeSet20 = composite17.children();
        examples.Composite composite22 = new examples.Composite(4);
        composite17.addChild(composite22);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite22);
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
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.lang.Class<?> wildcardClass8 = compositeSet7.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        java.lang.Class<?> wildcardClass9 = compositeSet8.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        examples.Composite composite8 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite5.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
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
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        examples.Composite composite1 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        examples.Composite composite11 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        composite8.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet15 = composite8.children();
        examples.Composite composite17 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        composite8.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet20 = composite8.children();
        examples.Composite composite22 = new examples.Composite((-7));
        composite8.addChild(composite22);
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet20);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        examples.Composite composite7 = new examples.Composite((int) (byte) 10);
        composite1.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        java.lang.Class<?> wildcardClass10 = composite7.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
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
        java.lang.Class<?> wildcardClass12 = compositeSet11.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        examples.Composite composite1 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-10));
        composite1.addChild(composite5);
        java.lang.Class<?> wildcardClass7 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
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
        examples.Composite composite16 = new examples.Composite((-9));
        examples.Composite composite18 = new examples.Composite((int) (byte) 1);
        composite16.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet20 = composite16.children();
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
        org.junit.Assert.assertNotNull(compositeSet20);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
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
        java.lang.Class<?> wildcardClass14 = composite10.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite9 = new examples.Composite((int) '4');
        examples.Composite composite11 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        composite9.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet15 = composite11.children();
        examples.Composite composite17 = new examples.Composite((-5));
        composite11.addChild(composite17);
        examples.Composite composite20 = new examples.Composite(6);
        composite17.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
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
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        examples.Composite composite1 = new examples.Composite((-100));
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
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet20);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
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
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
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
        java.lang.Class<?> wildcardClass19 = composite12.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite3.children();
        java.lang.Class<?> wildcardClass11 = compositeSet10.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (byte) -1);
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
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
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
        examples.Composite composite15 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite13.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
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
        examples.Composite composite22 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        examples.Composite composite25 = new examples.Composite((int) ' ');
        composite22.addChild(composite25);
        // The following exception was thrown during execution in test generation
        try {
            composite17.addChild(composite25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet23);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
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
        java.lang.Class<?> wildcardClass23 = composite21.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(3);
        composite1.addChild(composite6);
        examples.Composite composite9 = new examples.Composite(5);
        composite6.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet11 = composite6.children();
        examples.Composite composite12 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite6.addChild(composite12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet11);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        examples.Composite composite1 = new examples.Composite((int) (byte) 0);
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        examples.Composite composite6 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite3.addChild(composite6);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-9));
        composite3.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite3.children();
        examples.Composite composite11 = new examples.Composite((int) (short) -1);
        examples.Composite composite13 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        composite11.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet16 = composite11.children();
        java.util.Set<examples.Composite> compositeSet17 = composite11.children();
        java.util.Set<examples.Composite> compositeSet18 = composite11.children();
        java.util.Set<examples.Composite> compositeSet19 = composite11.children();
        java.util.Set<examples.Composite> compositeSet20 = composite11.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        examples.Composite composite1 = new examples.Composite((-1));
        examples.Composite composite3 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.lang.Class<?> wildcardClass6 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        examples.Composite composite12 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        composite9.addChild(composite12);
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
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        examples.Composite composite1 = new examples.Composite(9);
        examples.Composite composite3 = new examples.Composite((int) (short) 10);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-5));
        examples.Composite composite8 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite6.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        java.util.Set<examples.Composite> compositeSet12 = composite8.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
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
        java.lang.Class<?> wildcardClass21 = composite1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(3);
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.lang.Class<?> wildcardClass9 = composite6.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
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
        java.lang.Class<?> wildcardClass15 = composite4.getClass();
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
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.lang.Class<?> wildcardClass7 = compositeSet6.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        examples.Composite composite1 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        examples.Composite composite7 = new examples.Composite(9);
        composite1.addChild(composite7);
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
        org.junit.Assert.assertNotNull(compositeSet5);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
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
        java.lang.Class<?> wildcardClass25 = compositeSet24.getClass();
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
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
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
        examples.Composite composite19 = new examples.Composite((int) (short) 10);
        composite12.addChild(composite19);
        examples.Composite composite22 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        examples.Composite composite25 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        java.util.Set<examples.Composite> compositeSet27 = composite25.children();
        composite22.addChild(composite25);
        java.util.Set<examples.Composite> compositeSet29 = composite22.children();
        examples.Composite composite31 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet32 = composite31.children();
        composite22.addChild(composite31);
        // The following exception was thrown during execution in test generation
        try {
            composite12.addChild(composite22);
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
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet32);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
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
        examples.Composite composite24 = new examples.Composite(7);
        composite14.addChild(composite24);
        // The following exception was thrown during execution in test generation
        try {
            composite10.addChild(composite24);
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
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
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
        java.lang.Class<?> wildcardClass25 = compositeSet24.getClass();
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
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-9));
        composite3.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        java.util.Set<examples.Composite> compositeSet10 = composite7.children();
        java.lang.Class<?> wildcardClass11 = composite7.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        examples.Composite composite12 = null;
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
        org.junit.Assert.assertNotNull(compositeSet11);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        examples.Composite composite1 = new examples.Composite(5);
        examples.Composite composite3 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        java.lang.Class<?> wildcardClass9 = compositeSet8.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((-5));
        examples.Composite composite8 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite6.addChild(composite8);
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
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
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
        java.lang.Class<?> wildcardClass21 = compositeSet20.getClass();
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
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite11 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        examples.Composite composite14 = new examples.Composite(8);
        composite11.addChild(composite14);
        examples.Composite composite17 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        composite14.addChild(composite17);
        examples.Composite composite21 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        java.util.Set<examples.Composite> compositeSet24 = composite21.children();
        java.util.Set<examples.Composite> compositeSet25 = composite21.children();
        java.util.Set<examples.Composite> compositeSet26 = composite21.children();
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
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite1.addChild(composite8);
        java.lang.Class<?> wildcardClass11 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        examples.Composite composite1 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-2));
        examples.Composite composite10 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        composite8.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet15 = composite8.children();
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
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        examples.Composite composite1 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
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
        java.lang.Class<?> wildcardClass15 = compositeSet14.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        examples.Composite composite1 = new examples.Composite((-5));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        java.util.Set<examples.Composite> compositeSet8 = composite5.children();
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        examples.Composite composite12 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        examples.Composite composite16 = new examples.Composite((-6));
        composite12.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
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
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        examples.Composite composite7 = new examples.Composite((int) (byte) 10);
        composite1.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        java.lang.Class<?> wildcardClass10 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-10));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.lang.Class<?> wildcardClass6 = compositeSet5.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite(2);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((int) '4');
        examples.Composite composite9 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        composite7.addChild(composite9);
        examples.Composite composite14 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        composite7.addChild(composite14);
        examples.Composite composite18 = new examples.Composite(8);
        composite14.addChild(composite18);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet15);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
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
        examples.Composite composite24 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        composite21.addChild(composite24);
        examples.Composite composite29 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet30 = composite29.children();
        composite21.addChild(composite29);
        java.util.Set<examples.Composite> compositeSet32 = composite29.children();
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet32);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.lang.Class<?> wildcardClass4 = compositeSet3.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
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
        java.lang.Class<?> wildcardClass16 = compositeSet15.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
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
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
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
        examples.Composite composite20 = new examples.Composite((-100));
        examples.Composite composite22 = new examples.Composite((-3));
        composite20.addChild(composite22);
        // The following exception was thrown during execution in test generation
        try {
            composite10.addChild(composite22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        examples.Composite composite1 = new examples.Composite(100);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        examples.Composite composite7 = new examples.Composite(8);
        composite4.addChild(composite7);
        examples.Composite composite10 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        composite7.addChild(composite10);
        examples.Composite composite14 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        composite10.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet17 = composite10.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet17);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        examples.Composite composite10 = new examples.Composite((-100));
        examples.Composite composite12 = new examples.Composite((-3));
        composite10.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet14 = composite10.children();
        examples.Composite composite16 = new examples.Composite((int) (byte) 10);
        composite10.addChild(composite16);
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
        org.junit.Assert.assertNotNull(compositeSet14);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
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
        examples.Composite composite15 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        composite1.addChild(composite15);
        examples.Composite composite20 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        examples.Composite composite23 = new examples.Composite(8);
        composite20.addChild(composite23);
        examples.Composite composite26 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        composite23.addChild(composite26);
        examples.Composite composite30 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet31 = composite30.children();
        java.util.Set<examples.Composite> compositeSet32 = composite30.children();
        java.util.Set<examples.Composite> compositeSet33 = composite30.children();
        java.util.Set<examples.Composite> compositeSet34 = composite30.children();
        java.util.Set<examples.Composite> compositeSet35 = composite30.children();
        composite26.addChild(composite30);
        java.util.Set<examples.Composite> compositeSet37 = composite26.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite26);
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
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet35);
        org.junit.Assert.assertNotNull(compositeSet37);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((int) (short) -1);
        examples.Composite composite13 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        composite11.addChild(composite13);
        examples.Composite composite17 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        composite11.addChild(composite17);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
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
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        examples.Composite composite16 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        examples.Composite composite19 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        composite16.addChild(composite19);
        examples.Composite composite24 = new examples.Composite((int) (short) 1);
        composite19.addChild(composite24);
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
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        examples.Composite composite1 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((int) '4');
        examples.Composite composite7 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        composite5.addChild(composite7);
        examples.Composite composite12 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite5.addChild(composite12);
        examples.Composite composite16 = new examples.Composite(8);
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
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
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
        java.lang.Class<?> wildcardClass19 = composite17.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        examples.Composite composite1 = new examples.Composite(8);
        examples.Composite composite3 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((int) '4');
        examples.Composite composite10 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        composite8.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet14 = composite10.children();
        examples.Composite composite16 = new examples.Composite((-5));
        composite10.addChild(composite16);
        examples.Composite composite19 = new examples.Composite(6);
        composite16.addChild(composite19);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
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
        examples.Composite composite31 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet32 = composite31.children();
        composite27.addChild(composite31);
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet32);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
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
        java.lang.Class<?> wildcardClass15 = composite9.getClass();
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        examples.Composite composite1 = new examples.Composite((int) (byte) 10);
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
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
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
        java.lang.Class<?> wildcardClass14 = composite3.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-6));
        composite1.addChild(composite5);
        examples.Composite composite8 = new examples.Composite((-100));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        examples.Composite composite14 = new examples.Composite((-9));
        composite10.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        examples.Composite composite19 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        composite14.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet22 = composite14.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(3);
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        java.lang.Class<?> wildcardClass10 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        examples.Composite composite9 = new examples.Composite((-5));
        composite3.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet11 = composite3.children();
        examples.Composite composite13 = new examples.Composite((int) '4');
        examples.Composite composite15 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        composite13.addChild(composite15);
        examples.Composite composite20 = new examples.Composite((int) (byte) 100);
        composite13.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet22 = composite13.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite(2);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite3.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet10 = composite6.children();
        java.util.Set<examples.Composite> compositeSet11 = composite6.children();
        examples.Composite composite13 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        java.util.Set<examples.Composite> compositeSet16 = composite13.children();
        examples.Composite composite18 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        composite13.addChild(composite18);
        examples.Composite composite22 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        composite18.addChild(composite22);
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
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet23);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(3);
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite10 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        examples.Composite composite13 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        composite10.addChild(composite13);
        examples.Composite composite17 = new examples.Composite((-2));
        composite10.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
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
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
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
        java.lang.Class<?> wildcardClass15 = compositeSet14.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
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
        java.lang.Class<?> wildcardClass13 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
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
        java.util.Set<examples.Composite> compositeSet18 = composite7.children();
        java.lang.Class<?> wildcardClass19 = composite7.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        examples.Composite composite7 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        java.util.Set<examples.Composite> compositeSet10 = composite7.children();
        examples.Composite composite12 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        composite7.addChild(composite12);
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
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        examples.Composite composite1 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) '#');
        composite1.addChild(composite4);
        examples.Composite composite7 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        examples.Composite composite10 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        composite7.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite1.addChild(composite8);
        java.lang.Class<?> wildcardClass11 = composite8.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
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
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        examples.Composite composite1 = new examples.Composite(5);
        examples.Composite composite3 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        examples.Composite composite10 = new examples.Composite((int) (short) -1);
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite10.addChild(composite12);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet13);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        examples.Composite composite1 = new examples.Composite((-9));
        examples.Composite composite3 = new examples.Composite((int) (byte) 1);
        composite1.addChild(composite3);
        java.lang.Class<?> wildcardClass5 = composite3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        examples.Composite composite1 = new examples.Composite((-9));
        examples.Composite composite3 = new examples.Composite((int) (byte) 1);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-100));
        examples.Composite composite8 = new examples.Composite((-3));
        composite6.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        java.util.Set<examples.Composite> compositeSet12 = composite8.children();
        java.util.Set<examples.Composite> compositeSet13 = composite8.children();
        examples.Composite composite15 = new examples.Composite((int) (short) 0);
        composite8.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet17 = composite8.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet17);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        examples.Composite composite10 = new examples.Composite((int) (byte) -1);
        composite3.addChild(composite10);
        java.lang.Class<?> wildcardClass12 = composite10.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-100));
        examples.Composite composite6 = new examples.Composite((-3));
        composite4.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        examples.Composite composite11 = new examples.Composite(4);
        composite6.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
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
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
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
        examples.Composite composite16 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        examples.Composite composite19 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        composite16.addChild(composite19);
        // The following exception was thrown during execution in test generation
        try {
            composite12.addChild(composite19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
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
        examples.Composite composite22 = null;
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
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        examples.Composite composite1 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = compositeSet2.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        examples.Composite composite9 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite6.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet12 = composite6.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        examples.Composite composite1 = new examples.Composite((-10));
        examples.Composite composite3 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite9 = new examples.Composite((-9));
        examples.Composite composite11 = new examples.Composite((int) (byte) 1);
        composite9.addChild(composite11);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite9 = new examples.Composite((int) (short) 1);
        composite4.addChild(composite9);
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        examples.Composite composite17 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        composite12.addChild(composite17);
        examples.Composite composite22 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        composite12.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet27 = composite12.children();
        java.util.Set<examples.Composite> compositeSet28 = composite12.children();
        examples.Composite composite30 = new examples.Composite((int) (short) 10);
        composite12.addChild(composite30);
        java.util.Set<examples.Composite> compositeSet32 = composite12.children();
        java.util.Set<examples.Composite> compositeSet33 = composite12.children();
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet33);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
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
        examples.Composite composite23 = new examples.Composite((int) (byte) 1);
        examples.Composite composite25 = new examples.Composite(2);
        composite23.addChild(composite25);
        examples.Composite composite28 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        java.util.Set<examples.Composite> compositeSet30 = composite28.children();
        composite25.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet32 = composite28.children();
        // The following exception was thrown during execution in test generation
        try {
            composite13.addChild(composite28);
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
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet32);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        examples.Composite composite9 = new examples.Composite((-100));
        examples.Composite composite11 = new examples.Composite((-3));
        composite9.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        examples.Composite composite15 = new examples.Composite((-9));
        composite11.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet17);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        examples.Composite composite16 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        composite11.addChild(composite16);
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
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-9));
        composite3.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        examples.Composite composite11 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        examples.Composite composite14 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        composite11.addChild(composite14);
        examples.Composite composite18 = new examples.Composite((-3));
        composite14.addChild(composite18);
        examples.Composite composite21 = new examples.Composite((int) '#');
        composite14.addChild(composite21);
        // The following exception was thrown during execution in test generation
        try {
            composite7.addChild(composite21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        examples.Composite composite1 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        examples.Composite composite7 = new examples.Composite(9);
        composite1.addChild(composite7);
        examples.Composite composite10 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        examples.Composite composite13 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        composite10.addChild(composite13);
        examples.Composite composite17 = new examples.Composite((-3));
        composite13.addChild(composite17);
        // The following exception was thrown during execution in test generation
        try {
            composite7.addChild(composite17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        examples.Composite composite1 = new examples.Composite((-1));
        examples.Composite composite3 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite7 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        examples.Composite composite10 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        composite7.addChild(composite10);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
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
        java.lang.Class<?> wildcardClass13 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
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
        examples.Composite composite18 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        examples.Composite composite21 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        composite18.addChild(composite21);
        examples.Composite composite25 = new examples.Composite((-3));
        composite21.addChild(composite25);
        examples.Composite composite28 = new examples.Composite((int) '#');
        composite21.addChild(composite28);
        // The following exception was thrown during execution in test generation
        try {
            composite12.addChild(composite21);
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
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
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
        examples.Composite composite17 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite12.addChild(composite17);
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
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
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
        java.lang.Class<?> wildcardClass15 = composite12.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
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
        examples.Composite composite15 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        examples.Composite composite19 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        composite15.addChild(composite19);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite19);
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
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        examples.Composite composite1 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        examples.Composite composite7 = new examples.Composite((-100));
        examples.Composite composite9 = new examples.Composite((-3));
        composite7.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        java.util.Set<examples.Composite> compositeSet13 = composite9.children();
        java.util.Set<examples.Composite> compositeSet14 = composite9.children();
        examples.Composite composite16 = new examples.Composite((int) (short) 0);
        composite9.addChild(composite16);
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
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
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
        examples.Composite composite16 = new examples.Composite((int) (short) -1);
        examples.Composite composite18 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        composite16.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet21 = composite16.children();
        java.util.Set<examples.Composite> compositeSet22 = composite16.children();
        java.util.Set<examples.Composite> compositeSet23 = composite16.children();
        java.util.Set<examples.Composite> compositeSet24 = composite16.children();
        java.util.Set<examples.Composite> compositeSet25 = composite16.children();
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        examples.Composite composite1 = new examples.Composite((-10));
        examples.Composite composite3 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        composite1.addChild(composite3);
        java.lang.Class<?> wildcardClass8 = composite3.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        examples.Composite composite1 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite10 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        examples.Composite composite13 = new examples.Composite(8);
        composite10.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
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
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet15);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
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
        examples.Composite composite19 = new examples.Composite((int) (short) 10);
        composite12.addChild(composite19);
        java.lang.Class<?> wildcardClass21 = composite12.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
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
        examples.Composite composite19 = new examples.Composite((-100));
        examples.Composite composite21 = new examples.Composite((-3));
        composite19.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        java.util.Set<examples.Composite> compositeSet24 = composite21.children();
        examples.Composite composite26 = new examples.Composite((-9));
        composite21.addChild(composite26);
        java.util.Set<examples.Composite> compositeSet28 = composite26.children();
        java.util.Set<examples.Composite> compositeSet29 = composite26.children();
        examples.Composite composite31 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet32 = composite31.children();
        composite26.addChild(composite31);
        examples.Composite composite35 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet36 = composite35.children();
        composite31.addChild(composite35);
        java.util.Set<examples.Composite> compositeSet38 = composite31.children();
        // The following exception was thrown during execution in test generation
        try {
            composite12.addChild(composite31);
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
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet36);
        org.junit.Assert.assertNotNull(compositeSet38);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
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
        java.lang.Class<?> wildcardClass23 = compositeSet22.getClass();
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
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
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
        examples.Composite composite19 = new examples.Composite((int) (short) 10);
        composite12.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        examples.Composite composite23 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        java.util.Set<examples.Composite> compositeSet25 = composite23.children();
        java.util.Set<examples.Composite> compositeSet26 = composite23.children();
        examples.Composite composite28 = new examples.Composite(3);
        composite23.addChild(composite28);
        examples.Composite composite31 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet32 = composite31.children();
        java.util.Set<examples.Composite> compositeSet33 = composite31.children();
        java.util.Set<examples.Composite> compositeSet34 = composite31.children();
        composite23.addChild(composite31);
        java.util.Set<examples.Composite> compositeSet36 = composite23.children();
        // The following exception was thrown during execution in test generation
        try {
            composite19.addChild(composite23);
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
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet36);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        examples.Composite composite1 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite(0);
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite((int) '4');
        examples.Composite composite11 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        composite9.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet15 = composite11.children();
        examples.Composite composite17 = new examples.Composite((-5));
        composite11.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite(2);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite3.addChild(composite6);
        examples.Composite composite11 = new examples.Composite((int) (byte) -1);
        composite3.addChild(composite11);
        examples.Composite composite14 = new examples.Composite(8);
        examples.Composite composite16 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        composite14.addChild(composite16);
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        examples.Composite composite1 = new examples.Composite((-5));
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        java.lang.Class<?> wildcardClass9 = compositeSet8.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
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
        java.lang.Class<?> wildcardClass18 = compositeSet17.getClass();
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
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        examples.Composite composite1 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        examples.Composite composite7 = new examples.Composite(9);
        composite1.addChild(composite7);
        examples.Composite composite10 = new examples.Composite((-5));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        examples.Composite composite14 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        composite10.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet19 = composite10.children();
        java.util.Set<examples.Composite> compositeSet20 = composite10.children();
        java.util.Set<examples.Composite> compositeSet21 = composite10.children();
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
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
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
        java.lang.Class<?> wildcardClass16 = composite12.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite9 = new examples.Composite((int) (short) 1);
        composite4.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
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
            composite9.addChild(composite13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        examples.Composite composite1 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((int) '4');
        examples.Composite composite7 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        composite5.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet11 = composite5.children();
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
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        examples.Composite composite1 = new examples.Composite(5);
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
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite11 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        examples.Composite composite16 = new examples.Composite(3);
        composite11.addChild(composite16);
        examples.Composite composite19 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
        composite11.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet24 = composite11.children();
        // The following exception was thrown during execution in test generation
        try {
            composite6.addChild(composite11);
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
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        examples.Composite composite1 = new examples.Composite(2);
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
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        java.util.Set<examples.Composite> compositeSet9 = composite4.children();
        java.util.Set<examples.Composite> compositeSet10 = composite4.children();
        java.lang.Class<?> wildcardClass11 = compositeSet10.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        examples.Composite composite1 = new examples.Composite(2);
        examples.Composite composite3 = new examples.Composite((-7));
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
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        examples.Composite composite1 = new examples.Composite((-1));
        examples.Composite composite3 = new examples.Composite(100);
        composite1.addChild(composite3);
        java.lang.Class<?> wildcardClass5 = composite1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
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
        java.lang.Class<?> wildcardClass14 = composite11.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
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
        examples.Composite composite19 = new examples.Composite((int) (short) 10);
        composite12.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        java.lang.Class<?> wildcardClass22 = compositeSet21.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
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
        examples.Composite composite22 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        examples.Composite composite27 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet28 = composite27.children();
        java.util.Set<examples.Composite> compositeSet29 = composite27.children();
        composite22.addChild(composite27);
        examples.Composite composite32 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet33 = composite32.children();
        java.util.Set<examples.Composite> compositeSet34 = composite32.children();
        java.util.Set<examples.Composite> compositeSet35 = composite32.children();
        composite22.addChild(composite32);
        // The following exception was thrown during execution in test generation
        try {
            composite19.addChild(composite22);
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
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet35);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
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
        java.lang.Class<?> wildcardClass13 = compositeSet12.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
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
        java.util.Set<examples.Composite> compositeSet18 = composite8.children();
        java.lang.Class<?> wildcardClass19 = compositeSet18.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
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
        examples.Composite composite20 = new examples.Composite((-100));
        examples.Composite composite22 = new examples.Composite((-3));
        composite20.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        examples.Composite composite27 = new examples.Composite(4);
        composite22.addChild(composite27);
        examples.Composite composite30 = new examples.Composite((int) (short) 100);
        composite27.addChild(composite30);
        // The following exception was thrown during execution in test generation
        try {
            composite16.addChild(composite30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet10 = composite6.children();
        examples.Composite composite12 = new examples.Composite(9);
        examples.Composite composite14 = new examples.Composite((int) (short) 10);
        composite12.addChild(composite14);
        examples.Composite composite17 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        java.util.Set<examples.Composite> compositeSet20 = composite17.children();
        composite12.addChild(composite17);
        // The following exception was thrown during execution in test generation
        try {
            composite6.addChild(composite17);
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
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
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
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        examples.Composite composite22 = new examples.Composite((-9));
        composite18.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite18.children();
        examples.Composite composite26 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        composite18.addChild(composite26);
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite26);
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
        org.junit.Assert.assertNotNull(compositeSet27);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite10 = new examples.Composite(4);
        composite1.addChild(composite10);
        java.lang.Class<?> wildcardClass12 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
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
        java.util.Set<examples.Composite> compositeSet23 = composite12.children();
        java.lang.Class<?> wildcardClass24 = compositeSet23.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        examples.Composite composite1 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((int) (byte) 0);
        composite1.addChild(composite5);
        java.lang.Class<?> wildcardClass7 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.lang.Class<?> wildcardClass4 = compositeSet3.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        examples.Composite composite1 = new examples.Composite(2);
        examples.Composite composite3 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        examples.Composite composite11 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite8.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
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
        org.junit.Assert.assertNotNull(compositeSet14);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
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
        java.lang.Class<?> wildcardClass16 = compositeSet15.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-9));
        composite3.addChild(composite7);
        examples.Composite composite10 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        examples.Composite composite13 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        composite10.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet16 = composite10.children();
        examples.Composite composite18 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        composite10.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet21 = composite18.children();
        // The following exception was thrown during execution in test generation
        try {
            composite7.addChild(composite18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
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
        java.lang.Class<?> wildcardClass14 = compositeSet13.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
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
        java.util.Set<examples.Composite> compositeSet18 = composite8.children();
        examples.Composite composite20 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        java.util.Set<examples.Composite> compositeSet23 = composite20.children();
        examples.Composite composite25 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        java.util.Set<examples.Composite> compositeSet27 = composite25.children();
        composite20.addChild(composite25);
        examples.Composite composite30 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet31 = composite30.children();
        java.util.Set<examples.Composite> compositeSet32 = composite30.children();
        java.util.Set<examples.Composite> compositeSet33 = composite30.children();
        composite20.addChild(composite30);
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
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet33);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        examples.Composite composite1 = new examples.Composite(3);
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        examples.Composite composite13 = new examples.Composite((int) (byte) 10);
        composite9.addChild(composite13);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        java.lang.Class<?> wildcardClass10 = composite4.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        examples.Composite composite1 = new examples.Composite((-5));
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite7 = new examples.Composite((-5));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        examples.Composite composite11 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        composite7.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet16 = composite7.children();
        java.util.Set<examples.Composite> compositeSet17 = composite7.children();
        java.util.Set<examples.Composite> compositeSet18 = composite7.children();
        java.util.Set<examples.Composite> compositeSet19 = composite7.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
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
        java.lang.Class<?> wildcardClass23 = composite20.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        examples.Composite composite8 = new examples.Composite((-100));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        java.util.Set<examples.Composite> compositeSet14 = composite10.children();
        java.util.Set<examples.Composite> compositeSet15 = composite10.children();
        java.util.Set<examples.Composite> compositeSet16 = composite10.children();
        java.util.Set<examples.Composite> compositeSet17 = composite10.children();
        java.util.Set<examples.Composite> compositeSet18 = composite10.children();
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
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        examples.Composite composite1 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite10 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        examples.Composite composite15 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        composite10.addChild(composite15);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        examples.Composite composite9 = new examples.Composite((-5));
        composite3.addChild(composite9);
        examples.Composite composite12 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        examples.Composite composite15 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        composite12.addChild(composite15);
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
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
        java.util.Set<examples.Composite> compositeSet28 = composite21.children();
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
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        examples.Composite composite1 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.lang.Class<?> wildcardClass4 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
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
        java.util.Set<examples.Composite> compositeSet23 = composite12.children();
        java.util.Set<examples.Composite> compositeSet24 = composite12.children();
        java.util.Set<examples.Composite> compositeSet25 = composite12.children();
        java.lang.Class<?> wildcardClass26 = compositeSet25.getClass();
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
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        examples.Composite composite1 = new examples.Composite((int) (byte) -1);
        examples.Composite composite3 = new examples.Composite((-5));
        examples.Composite composite5 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        composite3.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet8 = composite5.children();
        java.util.Set<examples.Composite> compositeSet9 = composite5.children();
        java.util.Set<examples.Composite> compositeSet10 = composite5.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
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
        examples.Composite composite15 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        examples.Composite composite20 = new examples.Composite(3);
        composite15.addChild(composite20);
        examples.Composite composite23 = new examples.Composite(5);
        composite20.addChild(composite23);
        examples.Composite composite26 = new examples.Composite((-1));
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        composite23.addChild(composite26);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite26);
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
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet27);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
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
        examples.Composite composite16 = new examples.Composite((-3));
        composite14.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        java.util.Set<examples.Composite> compositeSet20 = composite16.children();
        java.util.Set<examples.Composite> compositeSet21 = composite16.children();
        examples.Composite composite23 = new examples.Composite((int) (short) 0);
        composite16.addChild(composite23);
        java.util.Set<examples.Composite> compositeSet25 = composite23.children();
        java.util.Set<examples.Composite> compositeSet26 = composite23.children();
        java.util.Set<examples.Composite> compositeSet27 = composite23.children();
        java.util.Set<examples.Composite> compositeSet28 = composite23.children();
        // The following exception was thrown during execution in test generation
        try {
            composite10.addChild(composite23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
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
        examples.Composite composite17 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        examples.Composite composite20 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        composite17.addChild(composite20);
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
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
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
        examples.Composite composite12 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite12);
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
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        java.lang.Class<?> wildcardClass10 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-6));
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        java.util.Set<examples.Composite> compositeSet8 = composite5.children();
        java.lang.Class<?> wildcardClass9 = composite5.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        examples.Composite composite1 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.lang.Class<?> wildcardClass7 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite(4);
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.lang.Class<?> wildcardClass11 = composite8.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        examples.Composite composite11 = new examples.Composite(3);
        composite6.addChild(composite11);
        examples.Composite composite14 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        composite6.addChild(composite14);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
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
        examples.Composite composite20 = new examples.Composite((int) (byte) 1);
        examples.Composite composite22 = new examples.Composite(2);
        composite20.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite20.children();
        // The following exception was thrown during execution in test generation
        try {
            composite15.addChild(composite20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        examples.Composite composite1 = new examples.Composite(3);
        examples.Composite composite3 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.lang.Class<?> wildcardClass9 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
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
        examples.Composite composite17 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        examples.Composite composite21 = new examples.Composite((int) (byte) 10);
        composite17.addChild(composite21);
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
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
        examples.Composite composite28 = new examples.Composite((-3));
        composite24.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet30 = composite28.children();
        java.util.Set<examples.Composite> compositeSet31 = composite28.children();
        examples.Composite composite33 = new examples.Composite((int) 'a');
        composite28.addChild(composite33);
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite33);
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
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (byte) -1);
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
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        examples.Composite composite1 = new examples.Composite(9);
        examples.Composite composite3 = new examples.Composite((int) (short) 10);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        composite1.addChild(composite6);
        java.lang.Class<?> wildcardClass11 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        examples.Composite composite1 = new examples.Composite((-5));
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
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
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-8));
        composite1.addChild(composite6);
        examples.Composite composite9 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        composite1.addChild(composite9);
        examples.Composite composite14 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        java.util.Set<examples.Composite> compositeSet18 = composite14.children();
        examples.Composite composite20 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        java.util.Set<examples.Composite> compositeSet23 = composite20.children();
        java.util.Set<examples.Composite> compositeSet24 = composite20.children();
        composite14.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet26 = composite20.children();
        examples.Composite composite28 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        java.util.Set<examples.Composite> compositeSet30 = composite28.children();
        composite20.addChild(composite28);
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(3);
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.lang.Class<?> wildcardClass9 = compositeSet8.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        examples.Composite composite1 = new examples.Composite((int) (byte) 100);
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
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite18);
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
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite7 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        composite1.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet11 = composite7.children();
        java.lang.Class<?> wildcardClass12 = composite7.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(3);
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite10 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        examples.Composite composite13 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        composite10.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet17 = composite13.children();
        examples.Composite composite19 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        composite13.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet22 = composite13.children();
        java.util.Set<examples.Composite> compositeSet23 = composite13.children();
        java.util.Set<examples.Composite> compositeSet24 = composite13.children();
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
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
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
        java.lang.Class<?> wildcardClass20 = composite18.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
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
        java.lang.Class<?> wildcardClass19 = compositeSet18.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        examples.Composite composite1 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.lang.Class<?> wildcardClass4 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
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
        examples.Composite composite17 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        composite15.addChild(composite17);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite17);
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
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        examples.Composite composite1 = new examples.Composite((-1));
        examples.Composite composite3 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.lang.Class<?> wildcardClass6 = composite3.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        java.lang.Class<?> wildcardClass10 = compositeSet9.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((int) '#');
        composite4.addChild(composite11);
        examples.Composite composite14 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        examples.Composite composite18 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        java.util.Set<examples.Composite> compositeSet21 = composite18.children();
        java.util.Set<examples.Composite> compositeSet22 = composite18.children();
        java.util.Set<examples.Composite> compositeSet23 = composite18.children();
        java.util.Set<examples.Composite> compositeSet24 = composite18.children();
        composite14.addChild(composite18);
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
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
        java.util.Set<examples.Composite> compositeSet18 = composite8.children();
        java.lang.Class<?> wildcardClass19 = composite8.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
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
        examples.Composite composite18 = new examples.Composite((int) '4');
        examples.Composite composite20 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        composite18.addChild(composite20);
        // The following exception was thrown during execution in test generation
        try {
            composite12.addChild(composite18);
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
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-2));
        composite1.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.lang.Class<?> wildcardClass11 = composite8.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
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
        java.util.Set<examples.Composite> compositeSet13 = composite6.children();
        examples.Composite composite15 = new examples.Composite((-100));
        examples.Composite composite17 = new examples.Composite((-3));
        composite15.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        examples.Composite composite21 = new examples.Composite((-9));
        composite17.addChild(composite21);
        // The following exception was thrown during execution in test generation
        try {
            composite6.addChild(composite21);
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
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        examples.Composite composite1 = new examples.Composite((-5));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-9));
        examples.Composite composite6 = new examples.Composite((int) (byte) 1);
        composite4.addChild(composite6);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        examples.Composite composite1 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (short) 100);
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
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        examples.Composite composite1 = new examples.Composite((int) (byte) 10);
        examples.Composite composite3 = new examples.Composite((-5));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        java.util.Set<examples.Composite> compositeSet10 = composite7.children();
        composite3.addChild(composite7);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        examples.Composite composite1 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        examples.Composite composite13 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        composite8.addChild(composite13);
        examples.Composite composite18 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        java.util.Set<examples.Composite> compositeSet21 = composite18.children();
        composite8.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet23 = composite8.children();
        java.util.Set<examples.Composite> compositeSet24 = composite8.children();
        examples.Composite composite26 = new examples.Composite((int) (short) 10);
        composite8.addChild(composite26);
        examples.Composite composite29 = new examples.Composite(3);
        composite26.addChild(composite29);
        java.util.Set<examples.Composite> compositeSet31 = composite29.children();
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
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
        org.junit.Assert.assertNotNull(compositeSet31);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
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
        examples.Composite composite25 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite19.addChild(composite25);
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
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        examples.Composite composite1 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = compositeSet2.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        examples.Composite composite1 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.lang.Class<?> wildcardClass4 = compositeSet3.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
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
        examples.Composite composite16 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        examples.Composite composite19 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        composite16.addChild(composite19);
        examples.Composite composite23 = new examples.Composite((-2));
        composite16.addChild(composite23);
        examples.Composite composite26 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        composite16.addChild(composite26);
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet27);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
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
        examples.Composite composite20 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        examples.Composite composite24 = new examples.Composite((int) (byte) 0);
        composite20.addChild(composite24);
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        java.lang.Class<?> wildcardClass10 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-8));
        composite1.addChild(composite6);
        examples.Composite composite9 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        composite1.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet13 = composite1.children();
        java.lang.Class<?> wildcardClass14 = compositeSet13.getClass();
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        examples.Composite composite1 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.lang.Class<?> wildcardClass4 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
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
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        examples.Composite composite16 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        composite13.addChild(composite16);
        examples.Composite composite20 = new examples.Composite((-2));
        composite13.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet22 = composite13.children();
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
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
        examples.Composite composite21 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        examples.Composite composite24 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        composite21.addChild(composite24);
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite21);
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
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
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
        examples.Composite composite23 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        examples.Composite composite26 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        java.util.Set<examples.Composite> compositeSet28 = composite26.children();
        composite23.addChild(composite26);
        examples.Composite composite31 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet32 = composite31.children();
        composite23.addChild(composite31);
        java.util.Set<examples.Composite> compositeSet34 = composite23.children();
        // The following exception was thrown during execution in test generation
        try {
            composite19.addChild(composite23);
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
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet34);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-100));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        java.util.Set<examples.Composite> compositeSet10 = composite7.children();
        java.util.Set<examples.Composite> compositeSet11 = composite7.children();
        java.util.Set<examples.Composite> compositeSet12 = composite7.children();
        java.util.Set<examples.Composite> compositeSet13 = composite7.children();
        java.util.Set<examples.Composite> compositeSet14 = composite7.children();
        java.util.Set<examples.Composite> compositeSet15 = composite7.children();
        java.util.Set<examples.Composite> compositeSet16 = composite7.children();
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
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
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
        examples.Composite composite17 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        java.util.Set<examples.Composite> compositeSet20 = composite17.children();
        examples.Composite composite22 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        composite17.addChild(composite22);
        examples.Composite composite26 = new examples.Composite(10);
        composite22.addChild(composite26);
        java.util.Set<examples.Composite> compositeSet28 = composite26.children();
        // The following exception was thrown during execution in test generation
        try {
            composite13.addChild(composite26);
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
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        examples.Composite composite1 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = compositeSet2.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        examples.Composite composite1 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((-100));
        examples.Composite composite8 = new examples.Composite((-3));
        composite6.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        java.util.Set<examples.Composite> compositeSet12 = composite8.children();
        java.util.Set<examples.Composite> compositeSet13 = composite8.children();
        examples.Composite composite15 = new examples.Composite((int) (short) 0);
        composite8.addChild(composite15);
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
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        examples.Composite composite1 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        examples.Composite composite7 = new examples.Composite(9);
        composite1.addChild(composite7);
        examples.Composite composite9 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite7.addChild(composite9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
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
        java.lang.Class<?> wildcardClass17 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
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
        examples.Composite composite14 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        examples.Composite composite17 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        composite14.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet21 = composite17.children();
        examples.Composite composite23 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        composite17.addChild(composite23);
        java.util.Set<examples.Composite> compositeSet26 = composite17.children();
        java.util.Set<examples.Composite> compositeSet27 = composite17.children();
        java.util.Set<examples.Composite> compositeSet28 = composite17.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite17);
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
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        examples.Composite composite9 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        examples.Composite composite14 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        composite9.addChild(composite14);
        examples.Composite composite19 = new examples.Composite((-8));
        composite9.addChild(composite19);
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite19);
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
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        java.util.Set<examples.Composite> compositeSet12 = composite8.children();
        java.lang.Class<?> wildcardClass13 = composite8.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-6));
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        examples.Composite composite10 = new examples.Composite((int) '4');
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        composite10.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet16 = composite12.children();
        examples.Composite composite18 = new examples.Composite((-5));
        composite12.addChild(composite18);
        // The following exception was thrown during execution in test generation
        try {
            composite6.addChild(composite12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
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
        java.lang.Class<?> wildcardClass20 = composite11.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
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
        examples.Composite composite21 = new examples.Composite((-3));
        composite19.addChild(composite21);
        examples.Composite composite24 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        java.util.Set<examples.Composite> compositeSet27 = composite24.children();
        composite19.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet29 = composite24.children();
        java.util.Set<examples.Composite> compositeSet30 = composite24.children();
        // The following exception was thrown during execution in test generation
        try {
            composite15.addChild(composite24);
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
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        examples.Composite composite9 = new examples.Composite((-5));
        composite3.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        java.lang.Class<?> wildcardClass12 = compositeSet11.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        examples.Composite composite8 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite1.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        java.lang.Class<?> wildcardClass12 = composite8.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
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
        java.lang.Class<?> wildcardClass16 = composite11.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-9));
        composite3.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        java.util.Set<examples.Composite> compositeSet10 = composite7.children();
        java.util.Set<examples.Composite> compositeSet11 = composite7.children();
        examples.Composite composite13 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        java.util.Set<examples.Composite> compositeSet16 = composite13.children();
        examples.Composite composite18 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        composite13.addChild(composite18);
        examples.Composite composite23 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        java.util.Set<examples.Composite> compositeSet25 = composite23.children();
        java.util.Set<examples.Composite> compositeSet26 = composite23.children();
        composite13.addChild(composite23);
        java.util.Set<examples.Composite> compositeSet28 = composite13.children();
        java.util.Set<examples.Composite> compositeSet29 = composite13.children();
        examples.Composite composite31 = new examples.Composite((int) (short) 10);
        composite13.addChild(composite31);
        examples.Composite composite34 = new examples.Composite(3);
        composite31.addChild(composite34);
        java.util.Set<examples.Composite> compositeSet36 = composite31.children();
        // The following exception was thrown during execution in test generation
        try {
            composite7.addChild(composite31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet36);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite7 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        composite1.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        java.lang.Class<?> wildcardClass12 = compositeSet11.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
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
        java.lang.Class<?> wildcardClass18 = composite12.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
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
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        examples.Composite composite25 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        composite22.addChild(composite25);
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
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite9 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite1.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        java.util.Set<examples.Composite> compositeSet13 = composite9.children();
        java.lang.Class<?> wildcardClass14 = composite9.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
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
        java.lang.Class<?> wildcardClass13 = composite6.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        examples.Composite composite1 = new examples.Composite((-5));
        examples.Composite composite3 = new examples.Composite(9);
        examples.Composite composite5 = new examples.Composite((int) (short) 10);
        composite3.addChild(composite5);
        examples.Composite composite8 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        composite3.addChild(composite8);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-6));
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        examples.Composite composite9 = new examples.Composite((int) (short) -1);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        examples.Composite composite12 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        composite9.addChild(composite12);
        // The following exception was thrown during execution in test generation
        try {
            composite5.addChild(composite9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        examples.Composite composite1 = new examples.Composite((-5));
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite7 = new examples.Composite(2);
        composite1.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        java.lang.Class<?> wildcardClass10 = compositeSet9.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        examples.Composite composite1 = new examples.Composite((int) (byte) 100);
        examples.Composite composite3 = new examples.Composite((-100));
        examples.Composite composite5 = new examples.Composite((-3));
        composite3.addChild(composite5);
        examples.Composite composite8 = new examples.Composite((-6));
        composite3.addChild(composite8);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        examples.Composite composite1 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (short) 100);
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
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite10 = new examples.Composite(10);
        composite6.addChild(composite10);
        java.lang.Class<?> wildcardClass12 = composite10.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite10 = new examples.Composite(10);
        composite6.addChild(composite10);
        java.lang.Class<?> wildcardClass12 = composite6.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
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
        java.util.Set<examples.Composite> compositeSet15 = composite8.children();
        java.lang.Class<?> wildcardClass16 = compositeSet15.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite((-7));
        composite1.addChild(composite9);
        java.lang.Class<?> wildcardClass11 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        examples.Composite composite11 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite8.addChild(composite11);
        examples.Composite composite15 = new examples.Composite((-3));
        composite11.addChild(composite15);
        examples.Composite composite18 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        composite11.addChild(composite18);
        examples.Composite composite23 = new examples.Composite((-9));
        composite18.addChild(composite23);
        java.util.Set<examples.Composite> compositeSet25 = composite18.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        examples.Composite composite1 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite(4);
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        java.util.Set<examples.Composite> compositeSet8 = composite5.children();
        examples.Composite composite10 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        examples.Composite composite13 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        composite10.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet17 = composite10.children();
        java.util.Set<examples.Composite> compositeSet18 = composite10.children();
        java.util.Set<examples.Composite> compositeSet19 = composite10.children();
        java.util.Set<examples.Composite> compositeSet20 = composite10.children();
        java.util.Set<examples.Composite> compositeSet21 = composite10.children();
        // The following exception was thrown during execution in test generation
        try {
            composite5.addChild(composite10);
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
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
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
        java.lang.Class<?> wildcardClass14 = composite8.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
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
        java.lang.Class<?> wildcardClass16 = composite7.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite(2);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite3.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet10 = composite6.children();
        java.util.Set<examples.Composite> compositeSet11 = composite6.children();
        examples.Composite composite13 = new examples.Composite((-100));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        examples.Composite composite19 = new examples.Composite((-9));
        composite15.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite15.children();
        examples.Composite composite23 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        composite15.addChild(composite23);
        // The following exception was thrown during execution in test generation
        try {
            composite6.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        java.util.Set<examples.Composite> compositeSet9 = composite4.children();
        java.lang.Class<?> wildcardClass10 = compositeSet9.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
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
        java.lang.Class<?> wildcardClass18 = composite1.getClass();
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
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        examples.Composite composite9 = new examples.Composite((-100));
        examples.Composite composite11 = new examples.Composite((-3));
        composite9.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        java.util.Set<examples.Composite> compositeSet15 = composite11.children();
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
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
        examples.Composite composite15 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        examples.Composite composite18 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        composite15.addChild(composite18);
        examples.Composite composite22 = new examples.Composite((-3));
        composite18.addChild(composite22);
        examples.Composite composite25 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        java.util.Set<examples.Composite> compositeSet27 = composite25.children();
        composite18.addChild(composite25);
        examples.Composite composite30 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet31 = composite30.children();
        composite25.addChild(composite30);
        // The following exception was thrown during execution in test generation
        try {
            composite10.addChild(composite25);
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
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet31);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        examples.Composite composite1 = new examples.Composite(0);
        examples.Composite composite3 = new examples.Composite((int) (short) 1);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.lang.Class<?> wildcardClass6 = composite3.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        java.lang.Class<?> wildcardClass12 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((-100));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        examples.Composite composite15 = new examples.Composite((-9));
        composite10.addChild(composite15);
        examples.Composite composite18 = new examples.Composite((int) (short) 1);
        composite15.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet20);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.lang.Class<?> wildcardClass4 = compositeSet3.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
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
        examples.Composite composite19 = new examples.Composite((int) (short) 10);
        composite12.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        examples.Composite composite23 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        java.util.Set<examples.Composite> compositeSet25 = composite23.children();
        java.util.Set<examples.Composite> compositeSet26 = composite23.children();
        examples.Composite composite28 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        composite23.addChild(composite28);
        examples.Composite composite32 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet33 = composite32.children();
        composite28.addChild(composite32);
        java.util.Set<examples.Composite> compositeSet35 = composite32.children();
        // The following exception was thrown during execution in test generation
        try {
            composite19.addChild(composite32);
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
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet35);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        examples.Composite composite1 = new examples.Composite(100);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = compositeSet2.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        examples.Composite composite1 = new examples.Composite(2);
        java.lang.Class<?> wildcardClass2 = composite1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
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
        examples.Composite composite19 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        examples.Composite composite22 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        composite19.addChild(composite22);
        // The following exception was thrown during execution in test generation
        try {
            composite15.addChild(composite22);
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
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
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
        examples.Composite composite14 = new examples.Composite((-100));
        examples.Composite composite16 = new examples.Composite((-3));
        composite14.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        examples.Composite composite21 = new examples.Composite((-9));
        composite16.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        java.util.Set<examples.Composite> compositeSet24 = composite21.children();
        java.util.Set<examples.Composite> compositeSet25 = composite21.children();
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
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        examples.Composite composite1 = new examples.Composite(8);
        examples.Composite composite3 = new examples.Composite((int) '4');
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
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
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
        java.lang.Class<?> wildcardClass16 = composite13.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        examples.Composite composite1 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        examples.Composite composite13 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        composite8.addChild(composite13);
        examples.Composite composite18 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        java.util.Set<examples.Composite> compositeSet21 = composite18.children();
        composite8.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet23 = composite8.children();
        java.util.Set<examples.Composite> compositeSet24 = composite8.children();
        examples.Composite composite26 = new examples.Composite((int) (short) 10);
        composite8.addChild(composite26);
        java.util.Set<examples.Composite> compositeSet28 = composite8.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
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
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        examples.Composite composite1 = new examples.Composite(3);
        examples.Composite composite3 = new examples.Composite((-2));
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
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        examples.Composite composite12 = new examples.Composite((-100));
        examples.Composite composite14 = new examples.Composite((-3));
        composite12.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        examples.Composite composite19 = new examples.Composite((-9));
        composite14.addChild(composite19);
        examples.Composite composite22 = new examples.Composite((int) (short) 1);
        composite19.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        examples.Composite composite26 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        java.util.Set<examples.Composite> compositeSet28 = composite26.children();
        java.util.Set<examples.Composite> compositeSet29 = composite26.children();
        java.util.Set<examples.Composite> compositeSet30 = composite26.children();
        composite22.addChild(composite26);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        examples.Composite composite7 = new examples.Composite((int) (short) 0);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        composite4.addChild(composite7);
        examples.Composite composite11 = new examples.Composite(3);
        composite7.addChild(composite11);
        examples.Composite composite14 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        examples.Composite composite17 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        composite14.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet21 = composite14.children();
        examples.Composite composite23 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        composite14.addChild(composite23);
        java.util.Set<examples.Composite> compositeSet26 = composite23.children();
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
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
        java.lang.Class<?> wildcardClass18 = composite7.getClass();
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
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        java.util.Set<examples.Composite> compositeSet9 = composite4.children();
        java.util.Set<examples.Composite> compositeSet10 = composite4.children();
        examples.Composite composite11 = null;
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
        org.junit.Assert.assertNotNull(compositeSet10);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
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
        examples.Composite composite24 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        java.util.Set<examples.Composite> compositeSet27 = composite24.children();
        examples.Composite composite29 = new examples.Composite(3);
        composite24.addChild(composite29);
        examples.Composite composite32 = new examples.Composite(5);
        composite29.addChild(composite32);
        examples.Composite composite35 = new examples.Composite((-1));
        java.util.Set<examples.Composite> compositeSet36 = composite35.children();
        composite32.addChild(composite35);
        // The following exception was thrown during execution in test generation
        try {
            composite20.addChild(composite35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet36);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
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
        java.util.Set<examples.Composite> compositeSet23 = composite12.children();
        java.util.Set<examples.Composite> compositeSet24 = composite12.children();
        java.util.Set<examples.Composite> compositeSet25 = composite12.children();
        examples.Composite composite26 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite12.addChild(composite26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.lang.Class<?> wildcardClass4 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
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
        java.util.Set<examples.Composite> compositeSet12 = composite1.children();
        examples.Composite composite14 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        examples.Composite composite17 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        composite14.addChild(composite17);
        examples.Composite composite21 = new examples.Composite((-2));
        composite14.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        examples.Composite composite25 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        composite21.addChild(composite25);
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
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((int) '#');
        composite4.addChild(composite11);
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
        java.util.Set<examples.Composite> compositeSet26 = composite16.children();
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-10));
        composite1.addChild(composite3);
        java.lang.Class<?> wildcardClass5 = composite1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
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
        java.util.Set<examples.Composite> compositeSet14 = composite8.children();
        java.lang.Class<?> wildcardClass15 = composite8.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        examples.Composite composite1 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.lang.Class<?> wildcardClass4 = compositeSet3.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        examples.Composite composite1 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        examples.Composite composite9 = new examples.Composite((-100));
        examples.Composite composite11 = new examples.Composite((-3));
        composite9.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        examples.Composite composite16 = new examples.Composite(4);
        composite11.addChild(composite16);
        examples.Composite composite19 = new examples.Composite((int) (short) 100);
        composite16.addChild(composite19);
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        examples.Composite composite1 = new examples.Composite(0);
        examples.Composite composite3 = new examples.Composite((int) (short) 1);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite(7);
        composite3.addChild(composite7);
        examples.Composite composite10 = new examples.Composite((-9));
        examples.Composite composite12 = new examples.Composite((int) (byte) 1);
        composite10.addChild(composite12);
        // The following exception was thrown during execution in test generation
        try {
            composite7.addChild(composite12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        composite1.addChild(composite6);
        java.lang.Class<?> wildcardClass11 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
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
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        examples.Composite composite1 = new examples.Composite(5);
        examples.Composite composite3 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        examples.Composite composite8 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
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
        examples.Composite composite22 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        composite19.addChild(composite22);
        examples.Composite composite27 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet28 = composite27.children();
        composite19.addChild(composite27);
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
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        java.util.Set<examples.Composite> compositeSet9 = composite3.children();
        examples.Composite composite10 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite(2);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        examples.Composite composite8 = new examples.Composite(0);
        examples.Composite composite10 = new examples.Composite((int) (short) 1);
        composite8.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        examples.Composite composite14 = new examples.Composite(7);
        composite10.addChild(composite14);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet12);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
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
        java.lang.Class<?> wildcardClass21 = composite15.getClass();
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
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        examples.Composite composite1 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        java.util.Set<examples.Composite> compositeSet9 = composite4.children();
        java.lang.Class<?> wildcardClass10 = composite4.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
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
        java.lang.Class<?> wildcardClass23 = composite12.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        examples.Composite composite1 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        java.util.Set<examples.Composite> compositeSet8 = composite5.children();
        java.util.Set<examples.Composite> compositeSet9 = composite5.children();
        java.util.Set<examples.Composite> compositeSet10 = composite5.children();
        java.util.Set<examples.Composite> compositeSet11 = composite5.children();
        composite1.addChild(composite5);
        examples.Composite composite14 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        examples.Composite composite18 = new examples.Composite(4);
        composite14.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        // The following exception was thrown during execution in test generation
        try {
            composite5.addChild(composite18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet20);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        examples.Composite composite1 = new examples.Composite(0);
        examples.Composite composite3 = new examples.Composite((int) (short) 1);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.lang.Class<?> wildcardClass6 = compositeSet5.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
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
        java.lang.Class<?> wildcardClass13 = composite9.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-2));
        composite1.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((-100));
        examples.Composite composite13 = new examples.Composite((-3));
        composite11.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        java.util.Set<examples.Composite> compositeSet16 = composite13.children();
        examples.Composite composite18 = new examples.Composite((-9));
        composite13.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet20 = composite13.children();
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet20);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        examples.Composite composite1 = new examples.Composite((-8));
        examples.Composite composite3 = new examples.Composite(9);
        examples.Composite composite5 = new examples.Composite((int) (short) 10);
        composite3.addChild(composite5);
        examples.Composite composite8 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        composite3.addChild(composite8);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
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
        java.lang.Class<?> wildcardClass22 = composite13.getClass();
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
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite10 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        examples.Composite composite13 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        composite10.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet17 = composite10.children();
        examples.Composite composite19 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        composite10.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
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
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
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
        java.lang.Class<?> wildcardClass24 = composite19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
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
            composite11.addChild(composite21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
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
        examples.Composite composite16 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        composite11.addChild(composite16);
        examples.Composite composite20 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        java.util.Set<examples.Composite> compositeSet23 = composite20.children();
        java.util.Set<examples.Composite> compositeSet24 = composite20.children();
        java.util.Set<examples.Composite> compositeSet25 = composite20.children();
        java.util.Set<examples.Composite> compositeSet26 = composite20.children();
        examples.Composite composite28 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        composite20.addChild(composite28);
        // The following exception was thrown during execution in test generation
        try {
            composite16.addChild(composite28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet29);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-2));
        composite1.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        java.lang.Class<?> wildcardClass11 = compositeSet10.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
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
        java.lang.Class<?> wildcardClass14 = compositeSet13.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        examples.Composite composite1 = new examples.Composite(0);
        examples.Composite composite3 = new examples.Composite((int) (short) 1);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite(7);
        composite3.addChild(composite7);
        examples.Composite composite10 = new examples.Composite((-100));
        examples.Composite composite12 = new examples.Composite((-3));
        composite10.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        examples.Composite composite17 = new examples.Composite((-9));
        composite12.addChild(composite17);
        examples.Composite composite20 = new examples.Composite((int) (short) 1);
        composite17.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        examples.Composite composite24 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        java.util.Set<examples.Composite> compositeSet27 = composite24.children();
        java.util.Set<examples.Composite> compositeSet28 = composite24.children();
        composite20.addChild(composite24);
        // The following exception was thrown during execution in test generation
        try {
            composite7.addChild(composite20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
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
        java.lang.Class<?> wildcardClass15 = composite12.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-9));
        composite3.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite3.children();
        java.util.Set<examples.Composite> compositeSet10 = composite3.children();
        examples.Composite composite12 = new examples.Composite((int) '4');
        examples.Composite composite14 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        composite12.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet18 = composite14.children();
        java.util.Set<examples.Composite> compositeSet19 = composite14.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
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
        java.lang.Class<?> wildcardClass14 = composite11.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
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
        java.lang.Class<?> wildcardClass14 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
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
        examples.Composite composite19 = new examples.Composite((int) (short) 10);
        composite12.addChild(composite19);
        examples.Composite composite22 = new examples.Composite((-100));
        examples.Composite composite24 = new examples.Composite((-3));
        composite22.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        java.util.Set<examples.Composite> compositeSet27 = composite24.children();
        java.util.Set<examples.Composite> compositeSet28 = composite24.children();
        java.util.Set<examples.Composite> compositeSet29 = composite24.children();
        java.util.Set<examples.Composite> compositeSet30 = composite24.children();
        java.util.Set<examples.Composite> compositeSet31 = composite24.children();
        java.util.Set<examples.Composite> compositeSet32 = composite24.children();
        examples.Composite composite34 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet35 = composite34.children();
        composite24.addChild(composite34);
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
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet35);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
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
        java.lang.Class<?> wildcardClass19 = composite14.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        examples.Composite composite1 = new examples.Composite((-5));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.lang.Class<?> wildcardClass4 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
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
        examples.Composite composite15 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        java.util.Set<examples.Composite> compositeSet19 = composite15.children();
        examples.Composite composite21 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        java.util.Set<examples.Composite> compositeSet24 = composite21.children();
        java.util.Set<examples.Composite> compositeSet25 = composite21.children();
        composite15.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet27 = composite21.children();
        examples.Composite composite29 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet30 = composite29.children();
        java.util.Set<examples.Composite> compositeSet31 = composite29.children();
        composite21.addChild(composite29);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite29);
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
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet31);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
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
        java.lang.Class<?> wildcardClass20 = compositeSet19.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
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
        examples.Composite composite20 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        examples.Composite composite23 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        java.util.Set<examples.Composite> compositeSet25 = composite23.children();
        composite20.addChild(composite23);
        java.util.Set<examples.Composite> compositeSet27 = composite20.children();
        examples.Composite composite29 = new examples.Composite(4);
        composite20.addChild(composite29);
        java.util.Set<examples.Composite> compositeSet31 = composite20.children();
        java.util.Set<examples.Composite> compositeSet32 = composite20.children();
        java.util.Set<examples.Composite> compositeSet33 = composite20.children();
        java.util.Set<examples.Composite> compositeSet34 = composite20.children();
        // The following exception was thrown during execution in test generation
        try {
            composite10.addChild(composite20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet34);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        java.util.Set<examples.Composite> compositeSet12 = composite8.children();
        java.util.Set<examples.Composite> compositeSet13 = composite8.children();
        examples.Composite composite15 = new examples.Composite((-100));
        examples.Composite composite17 = new examples.Composite((-3));
        composite15.addChild(composite17);
        examples.Composite composite20 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        java.util.Set<examples.Composite> compositeSet23 = composite20.children();
        composite15.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet25 = composite15.children();
        java.util.Set<examples.Composite> compositeSet26 = composite15.children();
        examples.Composite composite28 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        composite15.addChild(composite28);
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite28);
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
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet29);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite1.addChild(composite9);
        java.lang.Class<?> wildcardClass12 = composite9.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-6));
        composite1.addChild(composite6);
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
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
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
            composite6.addChild(composite11);
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
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        examples.Composite composite1 = new examples.Composite((int) ' ');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite(3);
        composite3.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        composite3.addChild(composite11);
        examples.Composite composite17 = new examples.Composite((-10));
        composite3.addChild(composite17);
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
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        java.lang.Class<?> wildcardClass11 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
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
        java.lang.Class<?> wildcardClass14 = composite11.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
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
        examples.Composite composite17 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        examples.Composite composite20 = new examples.Composite(8);
        composite17.addChild(composite20);
        examples.Composite composite23 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        java.util.Set<examples.Composite> compositeSet25 = composite23.children();
        composite20.addChild(composite23);
        java.util.Set<examples.Composite> compositeSet27 = composite20.children();
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet27);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        examples.Composite composite1 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        examples.Composite composite10 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        examples.Composite composite13 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        composite10.addChild(composite13);
        examples.Composite composite17 = new examples.Composite((-2));
        composite10.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet19 = composite10.children();
        java.util.Set<examples.Composite> compositeSet20 = composite10.children();
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        examples.Composite composite8 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        examples.Composite composite1 = new examples.Composite(5);
        examples.Composite composite3 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite1.addChild(composite8);
        examples.Composite composite12 = new examples.Composite((-100));
        examples.Composite composite14 = new examples.Composite((-3));
        composite12.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        examples.Composite composite18 = new examples.Composite((-9));
        composite14.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet20 = composite14.children();
        examples.Composite composite22 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        composite14.addChild(composite22);
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
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet23);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        examples.Composite composite1 = new examples.Composite((-5));
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite(3);
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
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
        java.util.Set<examples.Composite> compositeSet13 = composite6.children();
        java.lang.Class<?> wildcardClass14 = composite6.getClass();
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        examples.Composite composite1 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-10));
        composite1.addChild(composite5);
        java.lang.Class<?> wildcardClass7 = composite5.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        examples.Composite composite1 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-10));
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        java.lang.Class<?> wildcardClass8 = composite5.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
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
        examples.Composite composite17 = new examples.Composite(0);
        examples.Composite composite19 = new examples.Composite((int) (short) 1);
        composite17.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite17.children();
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
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
        java.util.Set<examples.Composite> compositeSet13 = composite6.children();
        examples.Composite composite15 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        examples.Composite composite20 = new examples.Composite(3);
        composite15.addChild(composite20);
        examples.Composite composite23 = new examples.Composite(5);
        composite20.addChild(composite23);
        java.util.Set<examples.Composite> compositeSet25 = composite20.children();
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
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
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
        examples.Composite composite15 = new examples.Composite((int) '4');
        examples.Composite composite17 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        composite15.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet21 = composite17.children();
        examples.Composite composite23 = new examples.Composite((-5));
        composite17.addChild(composite23);
        java.util.Set<examples.Composite> compositeSet25 = composite17.children();
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
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
        java.lang.Class<?> wildcardClass14 = composite8.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
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
        java.util.Set<examples.Composite> compositeSet15 = composite1.children();
        examples.Composite composite17 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        examples.Composite composite20 = new examples.Composite(8);
        composite17.addChild(composite20);
        examples.Composite composite23 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        composite20.addChild(composite23);
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
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
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
        java.lang.Class<?> wildcardClass14 = composite11.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        java.lang.Class<?> wildcardClass10 = composite6.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
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
        java.lang.Class<?> wildcardClass22 = compositeSet21.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
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
        java.lang.Class<?> wildcardClass15 = composite12.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        examples.Composite composite1 = new examples.Composite((-9));
        examples.Composite composite3 = new examples.Composite((int) (byte) 1);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.lang.Class<?> wildcardClass6 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
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
        examples.Composite composite15 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        examples.Composite composite18 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        composite15.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet22 = composite15.children();
        examples.Composite composite24 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        composite15.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet27 = composite15.children();
        examples.Composite composite29 = new examples.Composite((-7));
        composite15.addChild(composite29);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite29);
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
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet27);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
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
        examples.Composite composite15 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        examples.Composite composite18 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        composite15.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet21 = composite18.children();
        examples.Composite composite23 = new examples.Composite(100);
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        composite18.addChild(composite23);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite18);
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
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        examples.Composite composite1 = new examples.Composite((-7));
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
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
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
        examples.Composite composite15 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        examples.Composite composite20 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        composite15.addChild(composite20);
        examples.Composite composite25 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        java.util.Set<examples.Composite> compositeSet27 = composite25.children();
        java.util.Set<examples.Composite> compositeSet28 = composite25.children();
        composite15.addChild(composite25);
        java.util.Set<examples.Composite> compositeSet30 = composite15.children();
        java.util.Set<examples.Composite> compositeSet31 = composite15.children();
        examples.Composite composite33 = new examples.Composite((int) (short) 10);
        composite15.addChild(composite33);
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
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet31);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite9 = new examples.Composite((-100));
        examples.Composite composite11 = new examples.Composite((-3));
        composite9.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        examples.Composite composite16 = new examples.Composite((-9));
        composite11.addChild(composite16);
        examples.Composite composite19 = new examples.Composite((int) (short) 1);
        composite16.addChild(composite19);
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.lang.Class<?> wildcardClass7 = composite3.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite11 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        examples.Composite composite14 = new examples.Composite(10);
        composite11.addChild(composite14);
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
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-9));
        composite3.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        java.util.Set<examples.Composite> compositeSet10 = composite7.children();
        java.util.Set<examples.Composite> compositeSet11 = composite7.children();
        java.lang.Class<?> wildcardClass12 = composite7.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((-100));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        examples.Composite composite13 = new examples.Composite((-8));
        composite8.addChild(composite13);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
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
        examples.Composite composite19 = new examples.Composite((int) (short) 10);
        composite12.addChild(composite19);
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
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet32);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-10));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        examples.Composite composite7 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        examples.Composite composite10 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        composite7.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet14 = composite10.children();
        examples.Composite composite16 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        composite10.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        java.util.Set<examples.Composite> compositeSet20 = composite16.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        examples.Composite composite1 = new examples.Composite((-5));
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite7 = new examples.Composite(2);
        composite1.addChild(composite7);
        java.lang.Class<?> wildcardClass9 = composite7.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
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
        java.util.Set<examples.Composite> compositeSet14 = composite3.children();
        java.util.Set<examples.Composite> compositeSet15 = composite3.children();
        examples.Composite composite17 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        java.util.Set<examples.Composite> compositeSet20 = composite17.children();
        examples.Composite composite22 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        composite17.addChild(composite22);
        examples.Composite composite27 = new examples.Composite((-8));
        composite17.addChild(composite27);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        examples.Composite composite1 = new examples.Composite((-9));
        examples.Composite composite3 = new examples.Composite((int) (byte) 1);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-100));
        examples.Composite composite8 = new examples.Composite((-3));
        composite6.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        composite6.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet16 = composite11.children();
        java.util.Set<examples.Composite> compositeSet17 = composite11.children();
        examples.Composite composite19 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
        composite11.addChild(composite19);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet11 = composite6.children();
        examples.Composite composite13 = new examples.Composite((-100));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        examples.Composite composite20 = new examples.Composite((-9));
        composite15.addChild(composite20);
        examples.Composite composite23 = new examples.Composite((int) (short) 1);
        composite20.addChild(composite23);
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
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
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
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        examples.Composite composite19 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        composite14.addChild(composite19);
        examples.Composite composite23 = new examples.Composite(10);
        composite19.addChild(composite23);
        // The following exception was thrown during execution in test generation
        try {
            composite10.addChild(composite23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite7 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        composite1.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet11 = composite7.children();
        examples.Composite composite13 = new examples.Composite((int) '4');
        examples.Composite composite15 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        composite13.addChild(composite15);
        examples.Composite composite20 = new examples.Composite((int) (byte) 100);
        composite13.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet22 = composite13.children();
        // The following exception was thrown during execution in test generation
        try {
            composite7.addChild(composite13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        examples.Composite composite1 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        examples.Composite composite11 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite8.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        java.util.Set<examples.Composite> compositeSet15 = composite11.children();
        java.util.Set<examples.Composite> compositeSet16 = composite11.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        examples.Composite composite1 = new examples.Composite(5);
        examples.Composite composite3 = new examples.Composite((-7));
        composite1.addChild(composite3);
        java.lang.Class<?> wildcardClass5 = composite3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
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
        java.lang.Class<?> wildcardClass17 = composite11.getClass();
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
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        examples.Composite composite1 = new examples.Composite((-2));
        examples.Composite composite3 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.lang.Class<?> wildcardClass9 = compositeSet8.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
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
        examples.Composite composite24 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        examples.Composite composite27 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet28 = composite27.children();
        java.util.Set<examples.Composite> compositeSet29 = composite27.children();
        composite24.addChild(composite27);
        java.util.Set<examples.Composite> compositeSet31 = composite27.children();
        java.util.Set<examples.Composite> compositeSet32 = composite27.children();
        java.util.Set<examples.Composite> compositeSet33 = composite27.children();
        java.util.Set<examples.Composite> compositeSet34 = composite27.children();
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
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet34);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
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
        java.lang.Class<?> wildcardClass25 = composite19.getClass();
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
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        examples.Composite composite9 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite6.addChild(composite9);
        examples.Composite composite13 = new examples.Composite((-3));
        composite9.addChild(composite13);
        examples.Composite composite16 = new examples.Composite((int) '#');
        composite9.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        examples.Composite composite1 = new examples.Composite(3);
        examples.Composite composite3 = new examples.Composite((-2));
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
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
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
        java.util.Set<examples.Composite> compositeSet27 = composite20.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite20);
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
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet27);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        examples.Composite composite1 = new examples.Composite(0);
        examples.Composite composite3 = new examples.Composite((int) (short) 1);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-100));
        examples.Composite composite9 = new examples.Composite((-3));
        composite7.addChild(composite9);
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        composite7.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet17 = composite7.children();
        java.util.Set<examples.Composite> compositeSet18 = composite7.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        examples.Composite composite9 = new examples.Composite((-100));
        examples.Composite composite11 = new examples.Composite((-3));
        composite9.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        examples.Composite composite15 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        composite11.addChild(composite15);
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        examples.Composite composite9 = new examples.Composite((-5));
        composite3.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        examples.Composite composite13 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        examples.Composite composite16 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        composite13.addChild(composite16);
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
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite9 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        examples.Composite composite13 = new examples.Composite((int) (byte) 10);
        composite9.addChild(composite13);
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(3);
        composite1.addChild(composite6);
        examples.Composite composite9 = new examples.Composite(5);
        composite6.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet11 = composite6.children();
        java.lang.Class<?> wildcardClass12 = composite6.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
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
        examples.Composite composite14 = new examples.Composite((-100));
        examples.Composite composite16 = new examples.Composite((-3));
        composite14.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        examples.Composite composite21 = new examples.Composite((-9));
        composite16.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        examples.Composite composite25 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        java.util.Set<examples.Composite> compositeSet27 = composite25.children();
        composite21.addChild(composite25);
        java.util.Set<examples.Composite> compositeSet29 = composite25.children();
        java.util.Set<examples.Composite> compositeSet30 = composite25.children();
        examples.Composite composite32 = new examples.Composite((int) (short) 10);
        composite25.addChild(composite32);
        java.util.Set<examples.Composite> compositeSet34 = composite32.children();
        java.util.Set<examples.Composite> compositeSet35 = composite32.children();
        // The following exception was thrown during execution in test generation
        try {
            composite10.addChild(composite32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet35);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        examples.Composite composite1 = new examples.Composite(8);
        java.lang.Class<?> wildcardClass2 = composite1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.lang.Class<?> wildcardClass10 = composite8.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
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
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        java.lang.Class<?> wildcardClass14 = compositeSet13.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
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
        java.util.Set<examples.Composite> compositeSet15 = composite8.children();
        java.lang.Class<?> wildcardClass16 = composite8.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
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
        examples.Composite composite15 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        examples.Composite composite19 = new examples.Composite((-10));
        composite15.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite19);
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
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
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
        java.lang.Class<?> wildcardClass16 = composite8.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        examples.Composite composite1 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((int) (byte) 0);
        composite1.addChild(composite5);
        examples.Composite composite8 = new examples.Composite((-100));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        examples.Composite composite15 = new examples.Composite((-9));
        composite10.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        examples.Composite composite20 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        composite15.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet23 = composite15.children();
        examples.Composite composite25 = new examples.Composite((int) '#');
        composite15.addChild(composite25);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet23);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        examples.Composite composite1 = new examples.Composite(0);
        examples.Composite composite3 = new examples.Composite((int) (short) 1);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        examples.Composite composite10 = new examples.Composite(8);
        composite7.addChild(composite10);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet8);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
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
        examples.Composite composite15 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        examples.Composite composite18 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        composite15.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet22 = composite15.children();
        examples.Composite composite24 = new examples.Composite(4);
        composite15.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet26 = composite15.children();
        examples.Composite composite28 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        composite15.addChild(composite28);
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
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet29);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        examples.Composite composite10 = new examples.Composite((-100));
        examples.Composite composite12 = new examples.Composite((-3));
        composite10.addChild(composite12);
        examples.Composite composite15 = new examples.Composite((-6));
        composite10.addChild(composite15);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        examples.Composite composite1 = new examples.Composite((-5));
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite((-5));
        examples.Composite composite11 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite9.addChild(composite11);
        examples.Composite composite15 = new examples.Composite(2);
        composite9.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet17);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
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
        java.lang.Class<?> wildcardClass16 = compositeSet15.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
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
        java.lang.Class<?> wildcardClass18 = composite15.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
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
        java.lang.Class<?> wildcardClass21 = composite19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-10));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-100));
        examples.Composite composite8 = new examples.Composite((-3));
        composite6.addChild(composite8);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
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
        java.lang.Class<?> wildcardClass17 = composite8.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite10 = new examples.Composite((-5));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        examples.Composite composite14 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        composite10.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet19 = composite10.children();
        java.util.Set<examples.Composite> compositeSet20 = composite10.children();
        // The following exception was thrown during execution in test generation
        try {
            composite6.addChild(composite10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        examples.Composite composite1 = new examples.Composite((-1));
        examples.Composite composite3 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.lang.Class<?> wildcardClass7 = composite3.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.lang.Class<?> wildcardClass7 = compositeSet6.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
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
        examples.Composite composite16 = null;
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
        org.junit.Assert.assertNotNull(compositeSet15);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        examples.Composite composite1 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.lang.Class<?> wildcardClass4 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
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
        examples.Composite composite15 = new examples.Composite((-100));
        examples.Composite composite17 = new examples.Composite((-3));
        composite15.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        examples.Composite composite21 = new examples.Composite((-9));
        composite17.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        java.util.Set<examples.Composite> compositeSet24 = composite21.children();
        examples.Composite composite26 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        composite21.addChild(composite26);
        examples.Composite composite30 = new examples.Composite((int) (short) -1);
        java.util.Set<examples.Composite> compositeSet31 = composite30.children();
        java.util.Set<examples.Composite> compositeSet32 = composite30.children();
        composite21.addChild(composite30);
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite21);
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
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet32);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
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
        examples.Composite composite15 = new examples.Composite((int) '4');
        examples.Composite composite17 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        composite15.addChild(composite17);
        examples.Composite composite22 = new examples.Composite((int) (byte) 100);
        composite15.addChild(composite22);
        examples.Composite composite25 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        composite22.addChild(composite25);
        java.util.Set<examples.Composite> compositeSet28 = composite22.children();
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        examples.Composite composite1 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-9));
        examples.Composite composite7 = new examples.Composite((int) (byte) 1);
        composite5.addChild(composite7);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        examples.Composite composite1 = new examples.Composite((-9));
        examples.Composite composite3 = new examples.Composite(9);
        examples.Composite composite5 = new examples.Composite((int) (short) 10);
        composite3.addChild(composite5);
        examples.Composite composite8 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        composite3.addChild(composite8);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite10 = new examples.Composite((-9));
        examples.Composite composite12 = new examples.Composite((int) (byte) 1);
        composite10.addChild(composite12);
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
        org.junit.Assert.assertNotNull(compositeSet7);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
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
        examples.Composite composite22 = new examples.Composite((-100));
        examples.Composite composite24 = new examples.Composite((-3));
        composite22.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        java.util.Set<examples.Composite> compositeSet27 = composite24.children();
        examples.Composite composite29 = new examples.Composite((-9));
        composite24.addChild(composite29);
        java.util.Set<examples.Composite> compositeSet31 = composite29.children();
        examples.Composite composite33 = new examples.Composite((int) '4');
        composite29.addChild(composite33);
        examples.Composite composite36 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet37 = composite36.children();
        composite29.addChild(composite36);
        java.util.Set<examples.Composite> compositeSet39 = composite29.children();
        // The following exception was thrown during execution in test generation
        try {
            composite17.addChild(composite29);
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
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet37);
        org.junit.Assert.assertNotNull(compositeSet39);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
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
        examples.Composite composite16 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        examples.Composite composite19 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        composite16.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
        // The following exception was thrown during execution in test generation
        try {
            composite12.addChild(composite19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        examples.Composite composite1 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        examples.Composite composite9 = new examples.Composite(1);
        composite4.addChild(composite9);
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
        org.junit.Assert.assertNotNull(compositeSet7);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
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
        examples.Composite composite15 = new examples.Composite((-100));
        examples.Composite composite17 = new examples.Composite((-3));
        composite15.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        java.util.Set<examples.Composite> compositeSet20 = composite17.children();
        examples.Composite composite22 = new examples.Composite((-9));
        composite17.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        examples.Composite composite26 = new examples.Composite((int) '4');
        composite22.addChild(composite26);
        java.util.Set<examples.Composite> compositeSet28 = composite22.children();
        java.util.Set<examples.Composite> compositeSet29 = composite22.children();
        examples.Composite composite31 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet32 = composite31.children();
        java.util.Set<examples.Composite> compositeSet33 = composite31.children();
        composite22.addChild(composite31);
        examples.Composite composite36 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet37 = composite36.children();
        java.util.Set<examples.Composite> compositeSet38 = composite36.children();
        composite31.addChild(composite36);
        // The following exception was thrown during execution in test generation
        try {
            composite10.addChild(composite31);
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
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet37);
        org.junit.Assert.assertNotNull(compositeSet38);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((int) (byte) 10);
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite9.addChild(composite12);
        examples.Composite composite16 = new examples.Composite((-2));
        composite9.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
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
        java.util.Set<examples.Composite> compositeSet13 = composite1.children();
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
        java.util.Set<examples.Composite> compositeSet33 = composite31.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet33);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        java.util.Set<examples.Composite> compositeSet12 = composite8.children();
        java.lang.Class<?> wildcardClass13 = compositeSet12.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-9));
        composite3.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite3.children();
        java.util.Set<examples.Composite> compositeSet10 = composite3.children();
        examples.Composite composite12 = new examples.Composite((-100));
        examples.Composite composite14 = new examples.Composite((-3));
        composite12.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        examples.Composite composite19 = new examples.Composite((-9));
        composite14.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
        examples.Composite composite24 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        composite19.addChild(composite24);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        examples.Composite composite1 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        java.util.Set<examples.Composite> compositeSet8 = composite5.children();
        java.util.Set<examples.Composite> compositeSet9 = composite5.children();
        java.util.Set<examples.Composite> compositeSet10 = composite5.children();
        java.util.Set<examples.Composite> compositeSet11 = composite5.children();
        composite1.addChild(composite5);
        java.lang.Class<?> wildcardClass13 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        examples.Composite composite1 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        examples.Composite composite8 = new examples.Composite(8);
        composite5.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite5.children();
        examples.Composite composite12 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite5.addChild(composite12);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
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
        examples.Composite composite17 = new examples.Composite((-3));
        composite15.addChild(composite17);
        examples.Composite composite20 = new examples.Composite((-8));
        composite15.addChild(composite20);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite20);
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
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet10 = composite6.children();
        java.lang.Class<?> wildcardClass11 = compositeSet10.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        examples.Composite composite7 = new examples.Composite((int) (short) 0);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        composite4.addChild(composite7);
        examples.Composite composite11 = new examples.Composite((int) '4');
        examples.Composite composite13 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        composite11.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet17 = composite13.children();
        examples.Composite composite19 = new examples.Composite((-5));
        composite13.addChild(composite19);
        examples.Composite composite22 = new examples.Composite(6);
        composite19.addChild(composite22);
        // The following exception was thrown during execution in test generation
        try {
            composite7.addChild(composite19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet17);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
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
        examples.Composite composite16 = new examples.Composite((-100));
        examples.Composite composite18 = new examples.Composite((-10));
        composite16.addChild(composite18);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite18);
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
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        examples.Composite composite1 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = compositeSet2.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        examples.Composite composite1 = new examples.Composite((int) ' ');
        examples.Composite composite3 = new examples.Composite((-100));
        examples.Composite composite5 = new examples.Composite((-3));
        composite3.addChild(composite5);
        examples.Composite composite8 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet13 = composite8.children();
        java.util.Set<examples.Composite> compositeSet14 = composite8.children();
        examples.Composite composite16 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        composite8.addChild(composite16);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite16);
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
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((int) (byte) 100);
        composite1.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((-100));
        examples.Composite composite13 = new examples.Composite((-3));
        composite11.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        examples.Composite composite17 = new examples.Composite((-9));
        composite13.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        java.util.Set<examples.Composite> compositeSet20 = composite17.children();
        examples.Composite composite22 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        composite17.addChild(composite22);
        examples.Composite composite26 = new examples.Composite((int) (short) -1);
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
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        examples.Composite composite1 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        examples.Composite composite8 = new examples.Composite(8);
        composite5.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite8.addChild(composite11);
        examples.Composite composite15 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        java.util.Set<examples.Composite> compositeSet19 = composite15.children();
        java.util.Set<examples.Composite> compositeSet20 = composite15.children();
        composite11.addChild(composite15);
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
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
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
        examples.Composite composite23 = new examples.Composite((-100));
        examples.Composite composite25 = new examples.Composite((-3));
        composite23.addChild(composite25);
        java.util.Set<examples.Composite> compositeSet27 = composite25.children();
        java.util.Set<examples.Composite> compositeSet28 = composite25.children();
        examples.Composite composite30 = new examples.Composite((-9));
        composite25.addChild(composite30);
        java.util.Set<examples.Composite> compositeSet32 = composite30.children();
        java.util.Set<examples.Composite> compositeSet33 = composite30.children();
        java.util.Set<examples.Composite> compositeSet34 = composite30.children();
        java.util.Set<examples.Composite> compositeSet35 = composite30.children();
        java.util.Set<examples.Composite> compositeSet36 = composite30.children();
        // The following exception was thrown during execution in test generation
        try {
            composite15.addChild(composite30);
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
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet35);
        org.junit.Assert.assertNotNull(compositeSet36);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        examples.Composite composite11 = new examples.Composite((-100));
        examples.Composite composite13 = new examples.Composite((-3));
        composite11.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        examples.Composite composite17 = new examples.Composite((-9));
        composite13.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        java.util.Set<examples.Composite> compositeSet20 = composite17.children();
        examples.Composite composite22 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        composite17.addChild(composite22);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet23);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
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
        java.lang.Class<?> wildcardClass14 = composite7.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
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
        java.lang.Class<?> wildcardClass15 = composite7.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
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
        examples.Composite composite21 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        examples.Composite composite24 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        composite21.addChild(composite24);
        examples.Composite composite29 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet30 = composite29.children();
        composite21.addChild(composite29);
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
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet30);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (byte) -1);
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
            composite1.addChild(composite16);
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
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        examples.Composite composite1 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-10));
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        examples.Composite composite9 = new examples.Composite((int) '4');
        examples.Composite composite11 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        composite9.addChild(composite11);
        examples.Composite composite16 = new examples.Composite((int) (byte) 100);
        composite9.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite9.children();
        java.util.Set<examples.Composite> compositeSet19 = composite9.children();
        // The following exception was thrown during execution in test generation
        try {
            composite5.addChild(composite9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        examples.Composite composite1 = new examples.Composite((-2));
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
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        examples.Composite composite1 = new examples.Composite(3);
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.lang.Class<?> wildcardClass7 = compositeSet6.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite(2);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        examples.Composite composite13 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        composite8.addChild(composite13);
        examples.Composite composite18 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        java.util.Set<examples.Composite> compositeSet21 = composite18.children();
        composite8.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet23 = composite8.children();
        java.util.Set<examples.Composite> compositeSet24 = composite8.children();
        examples.Composite composite26 = new examples.Composite((int) (short) 10);
        composite8.addChild(composite26);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
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
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
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
        examples.Composite composite16 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        composite11.addChild(composite16);
        examples.Composite composite20 = new examples.Composite((int) '4');
        examples.Composite composite22 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        composite20.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet26 = composite22.children();
        examples.Composite composite28 = new examples.Composite((-5));
        composite22.addChild(composite28);
        examples.Composite composite31 = new examples.Composite(6);
        composite28.addChild(composite31);
        java.util.Set<examples.Composite> compositeSet33 = composite28.children();
        // The following exception was thrown during execution in test generation
        try {
            composite16.addChild(composite28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet33);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        examples.Composite composite1 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        examples.Composite composite7 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        composite4.addChild(composite7);
        examples.Composite composite11 = new examples.Composite((-3));
        composite7.addChild(composite11);
        examples.Composite composite14 = new examples.Composite((int) '#');
        composite7.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
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
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
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
        java.lang.Class<?> wildcardClass24 = compositeSet23.getClass();
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
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        examples.Composite composite1 = new examples.Composite(9);
        examples.Composite composite3 = new examples.Composite((int) (short) 10);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet11 = composite6.children();
        java.lang.Class<?> wildcardClass12 = compositeSet11.getClass();
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(3);
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        java.lang.Class<?> wildcardClass10 = compositeSet9.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        examples.Composite composite1 = new examples.Composite(3);
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.lang.Class<?> wildcardClass6 = composite3.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
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
        java.lang.Class<?> wildcardClass13 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
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
        java.lang.Class<?> wildcardClass19 = composite15.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
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
        java.util.Set<examples.Composite> compositeSet14 = composite9.children();
        java.lang.Class<?> wildcardClass15 = composite9.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        examples.Composite composite1 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite(4);
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite((int) '4');
        examples.Composite composite11 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        composite9.addChild(composite11);
        examples.Composite composite16 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        composite9.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet19 = composite9.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        examples.Composite composite1 = new examples.Composite(3);
        examples.Composite composite3 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite10 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        examples.Composite composite13 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        composite10.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet17 = composite13.children();
        examples.Composite composite19 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        composite13.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
        java.util.Set<examples.Composite> compositeSet23 = composite19.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
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
        java.lang.Class<?> wildcardClass13 = compositeSet12.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        examples.Composite composite8 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite5.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet11 = composite5.children();
        examples.Composite composite13 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        composite5.addChild(composite13);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-7));
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
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
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
        java.lang.Class<?> wildcardClass15 = composite12.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite(4);
        composite3.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((int) (short) 100);
        composite8.addChild(composite11);
        java.lang.Class<?> wildcardClass13 = composite11.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        examples.Composite composite1 = new examples.Composite((-9));
        examples.Composite composite3 = new examples.Composite((int) (byte) 1);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        examples.Composite composite8 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        examples.Composite composite11 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        composite8.addChild(composite11);
        examples.Composite composite16 = new examples.Composite((int) (short) 1);
        composite11.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        examples.Composite composite20 = new examples.Composite((-1));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        composite16.addChild(composite20);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        examples.Composite composite1 = new examples.Composite((-1));
        examples.Composite composite3 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite7 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        composite3.addChild(composite7);
        examples.Composite composite11 = new examples.Composite((-100));
        examples.Composite composite13 = new examples.Composite((-3));
        composite11.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        java.util.Set<examples.Composite> compositeSet16 = composite13.children();
        examples.Composite composite18 = new examples.Composite((-9));
        composite13.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        java.util.Set<examples.Composite> compositeSet21 = composite18.children();
        examples.Composite composite23 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        composite18.addChild(composite23);
        examples.Composite composite27 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet28 = composite27.children();
        composite23.addChild(composite27);
        java.util.Set<examples.Composite> compositeSet30 = composite27.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet30);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
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
        examples.Composite composite14 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        examples.Composite composite17 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        composite14.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet21 = composite14.children();
        examples.Composite composite23 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        composite14.addChild(composite23);
        java.util.Set<examples.Composite> compositeSet26 = composite14.children();
        examples.Composite composite28 = new examples.Composite((-7));
        composite14.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet30 = composite14.children();
        java.util.Set<examples.Composite> compositeSet31 = composite14.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet31);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        examples.Composite composite13 = new examples.Composite((-5));
        examples.Composite composite15 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        composite13.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet18 = composite13.children();
        examples.Composite composite20 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        composite13.addChild(composite20);
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        examples.Composite composite1 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        examples.Composite composite9 = new examples.Composite((-100));
        examples.Composite composite11 = new examples.Composite((-3));
        composite9.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        examples.Composite composite15 = new examples.Composite((-9));
        composite11.addChild(composite15);
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet13);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        examples.Composite composite9 = new examples.Composite((-5));
        composite3.addChild(composite9);
        examples.Composite composite12 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        examples.Composite composite15 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        composite12.addChild(composite15);
        examples.Composite composite19 = new examples.Composite((-3));
        composite15.addChild(composite19);
        examples.Composite composite22 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        composite15.addChild(composite22);
        examples.Composite composite27 = new examples.Composite((-9));
        composite22.addChild(composite27);
        java.util.Set<examples.Composite> compositeSet29 = composite22.children();
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
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet29);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        examples.Composite composite1 = new examples.Composite(5);
        examples.Composite composite3 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
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
        java.util.Set<examples.Composite> compositeSet25 = composite17.children();
        java.util.Set<examples.Composite> compositeSet26 = composite17.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
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
        java.lang.Class<?> wildcardClass13 = compositeSet12.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite9 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite1.addChild(composite9);
        examples.Composite composite13 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        examples.Composite composite17 = new examples.Composite(4);
        composite13.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
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
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite10 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        examples.Composite composite14 = new examples.Composite((-10));
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
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
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
        examples.Composite composite19 = new examples.Composite((int) (short) 10);
        composite12.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite12.children();
        java.lang.Class<?> wildcardClass22 = compositeSet21.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
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
        java.lang.Class<?> wildcardClass19 = composite8.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
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
        examples.Composite composite19 = new examples.Composite((int) (short) 10);
        composite12.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        java.lang.Class<?> wildcardClass22 = composite19.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
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
        java.lang.Class<?> wildcardClass15 = composite1.getClass();
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
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        java.lang.Class<?> wildcardClass10 = compositeSet9.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
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
        java.lang.Class<?> wildcardClass16 = composite8.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        examples.Composite composite1 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.lang.Class<?> wildcardClass4 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
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
        java.util.Set<examples.Composite> compositeSet14 = composite8.children();
        java.lang.Class<?> wildcardClass15 = compositeSet14.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        examples.Composite composite1 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        examples.Composite composite8 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite5.addChild(composite8);
        examples.Composite composite12 = new examples.Composite((-3));
        composite8.addChild(composite12);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet9);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
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
        examples.Composite composite15 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        examples.Composite composite18 = new examples.Composite(8);
        composite15.addChild(composite18);
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite18);
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
    }
}

