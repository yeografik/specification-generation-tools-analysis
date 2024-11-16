package examples;

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
        examples.Composite composite1 = new examples.Composite(9);
        examples.Composite composite3 = new examples.Composite((int) (short) 10);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((int) (short) 100);
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
        examples.Composite composite20 = new examples.Composite(5);
        composite17.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
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
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
        examples.Composite composite20 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite7.addChild(composite20);
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
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
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
        java.util.Set<examples.Composite> compositeSet14 = composite3.children();
        java.lang.Class<?> wildcardClass15 = compositeSet14.getClass();
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
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        examples.Composite composite1 = new examples.Composite((-9));
        examples.Composite composite3 = new examples.Composite(3);
        examples.Composite composite5 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        composite3.addChild(composite5);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        examples.Composite composite1 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        examples.Composite composite8 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        examples.Composite composite13 = new examples.Composite(3);
        composite8.addChild(composite13);
        examples.Composite composite16 = new examples.Composite((-7));
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
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
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
        java.lang.Class<?> wildcardClass13 = composite10.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
        examples.Composite composite25 = new examples.Composite((-100));
        examples.Composite composite27 = new examples.Composite((-3));
        composite25.addChild(composite27);
        java.util.Set<examples.Composite> compositeSet29 = composite27.children();
        java.util.Set<examples.Composite> compositeSet30 = composite27.children();
        examples.Composite composite32 = new examples.Composite((-9));
        composite27.addChild(composite32);
        java.util.Set<examples.Composite> compositeSet34 = composite32.children();
        examples.Composite composite36 = new examples.Composite((int) '4');
        composite32.addChild(composite36);
        examples.Composite composite39 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet40 = composite39.children();
        composite32.addChild(composite39);
        examples.Composite composite43 = new examples.Composite((-100));
        composite39.addChild(composite43);
        java.util.Set<examples.Composite> compositeSet45 = composite39.children();
        java.util.Set<examples.Composite> compositeSet46 = composite39.children();
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
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet40);
        org.junit.Assert.assertNotNull(compositeSet45);
        org.junit.Assert.assertNotNull(compositeSet46);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        examples.Composite composite1 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((int) (byte) 1);
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.lang.Class<?> wildcardClass9 = compositeSet8.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
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
        java.lang.Class<?> wildcardClass16 = compositeSet15.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
        java.lang.Class<?> wildcardClass17 = composite15.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
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
        examples.Composite composite15 = new examples.Composite(3);
        examples.Composite composite17 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        composite15.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet20 = composite15.children();
        examples.Composite composite22 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        composite15.addChild(composite22);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite22);
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
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
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
        examples.Composite composite21 = new examples.Composite((int) (byte) 1);
        examples.Composite composite23 = new examples.Composite(2);
        composite21.addChild(composite23);
        examples.Composite composite26 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        java.util.Set<examples.Composite> compositeSet28 = composite26.children();
        composite23.addChild(composite26);
        examples.Composite composite31 = new examples.Composite((int) (byte) -1);
        composite23.addChild(composite31);
        java.util.Set<examples.Composite> compositeSet33 = composite31.children();
        java.util.Set<examples.Composite> compositeSet34 = composite31.children();
        java.util.Set<examples.Composite> compositeSet35 = composite31.children();
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite31);
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
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet35);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
        java.util.Set<examples.Composite> compositeSet29 = composite18.children();
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
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet29);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        examples.Composite composite8 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite1.addChild(composite8);
        examples.Composite composite12 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        examples.Composite composite15 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        composite12.addChild(composite15);
        examples.Composite composite19 = new examples.Composite((-2));
        composite12.addChild(composite19);
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        examples.Composite composite1 = new examples.Composite((int) (byte) 10);
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
        examples.Composite composite18 = new examples.Composite((int) (byte) 0);
        composite10.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet20 = composite10.children();
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
        org.junit.Assert.assertNotNull(compositeSet20);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite10 = new examples.Composite((-100));
        examples.Composite composite12 = new examples.Composite((-3));
        composite10.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        java.util.Set<examples.Composite> compositeSet16 = composite12.children();
        java.util.Set<examples.Composite> compositeSet17 = composite12.children();
        java.util.Set<examples.Composite> compositeSet18 = composite12.children();
        examples.Composite composite20 = new examples.Composite((int) (byte) 0);
        composite12.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet22 = composite12.children();
        java.util.Set<examples.Composite> compositeSet23 = composite12.children();
        java.util.Set<examples.Composite> compositeSet24 = composite12.children();
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
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
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
        java.lang.Class<?> wildcardClass19 = composite15.getClass();
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
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite(2);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        examples.Composite composite8 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        composite1.addChild(composite8);
        examples.Composite composite13 = new examples.Composite((-1));
        examples.Composite composite15 = new examples.Composite(100);
        composite13.addChild(composite15);
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
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
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
        java.util.Set<examples.Composite> compositeSet13 = composite7.children();
        examples.Composite composite15 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        examples.Composite composite18 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        composite15.addChild(composite18);
        examples.Composite composite22 = new examples.Composite((-2));
        composite15.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        examples.Composite composite26 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        composite22.addChild(composite26);
        // The following exception was thrown during execution in test generation
        try {
            composite7.addChild(composite22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet27);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
        java.util.Set<examples.Composite> compositeSet13 = composite9.children();
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
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
        examples.Composite composite16 = new examples.Composite((-8));
        composite11.addChild(composite16);
        examples.Composite composite19 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        composite11.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet23 = composite19.children();
        java.util.Set<examples.Composite> compositeSet24 = composite19.children();
        examples.Composite composite26 = new examples.Composite((int) 'a');
        composite19.addChild(composite26);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
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
        examples.Composite composite23 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite20.addChild(composite23);
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
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-7));
        composite3.addChild(composite8);
        java.lang.Class<?> wildcardClass10 = composite3.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
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
        java.lang.Class<?> wildcardClass26 = composite20.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        examples.Composite composite8 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite1.addChild(composite8);
        examples.Composite composite12 = new examples.Composite((-100));
        examples.Composite composite14 = new examples.Composite((-3));
        composite12.addChild(composite14);
        examples.Composite composite17 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        java.util.Set<examples.Composite> compositeSet20 = composite17.children();
        composite12.addChild(composite17);
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
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
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
        examples.Composite composite19 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
        examples.Composite composite24 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        composite19.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet27 = composite19.children();
        java.util.Set<examples.Composite> compositeSet28 = composite19.children();
        // The following exception was thrown during execution in test generation
        try {
            composite14.addChild(composite19);
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
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet10 = composite6.children();
        java.lang.Class<?> wildcardClass11 = composite6.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite(2);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite3.addChild(composite6);
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
            composite6.addChild(composite17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet23);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
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
        java.lang.Class<?> wildcardClass24 = composite1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
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
        java.util.Set<examples.Composite> compositeSet13 = composite5.children();
        java.lang.Class<?> wildcardClass14 = compositeSet13.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        examples.Composite composite1 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) ' ');
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.lang.Class<?> wildcardClass7 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        examples.Composite composite20 = new examples.Composite((-100));
        examples.Composite composite22 = new examples.Composite((-3));
        composite20.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        examples.Composite composite26 = new examples.Composite((-9));
        composite22.addChild(composite26);
        java.util.Set<examples.Composite> compositeSet28 = composite22.children();
        java.util.Set<examples.Composite> compositeSet29 = composite22.children();
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
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        examples.Composite composite9 = new examples.Composite((-5));
        composite3.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet11 = composite3.children();
        examples.Composite composite13 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        examples.Composite composite16 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        composite13.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet19 = composite13.children();
        java.util.Set<examples.Composite> compositeSet20 = composite13.children();
        java.util.Set<examples.Composite> compositeSet21 = composite13.children();
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
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
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
        examples.Composite composite17 = new examples.Composite((-100));
        examples.Composite composite19 = new examples.Composite((-3));
        composite17.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
        examples.Composite composite24 = new examples.Composite((-9));
        composite19.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        java.util.Set<examples.Composite> compositeSet27 = composite24.children();
        examples.Composite composite29 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet30 = composite29.children();
        composite24.addChild(composite29);
        java.util.Set<examples.Composite> compositeSet32 = composite24.children();
        examples.Composite composite34 = new examples.Composite((int) '#');
        composite24.addChild(composite34);
        java.util.Set<examples.Composite> compositeSet36 = composite34.children();
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet36);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        examples.Composite composite1 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-3));
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
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        examples.Composite composite1 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        examples.Composite composite8 = new examples.Composite((int) ' ');
        composite5.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite5.children();
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
        org.junit.Assert.assertNotNull(compositeSet10);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
        java.lang.Class<?> wildcardClass13 = compositeSet12.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        examples.Composite composite1 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        examples.Composite composite9 = new examples.Composite(8);
        composite6.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        java.util.Set<examples.Composite> compositeSet13 = composite9.children();
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
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        examples.Composite composite1 = new examples.Composite(5);
        examples.Composite composite3 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        java.util.Set<examples.Composite> compositeSet9 = composite3.children();
        java.lang.Class<?> wildcardClass10 = compositeSet9.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
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
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
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
        examples.Composite composite18 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        examples.Composite composite21 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        composite18.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet24 = composite21.children();
        java.util.Set<examples.Composite> compositeSet25 = composite21.children();
        java.util.Set<examples.Composite> compositeSet26 = composite21.children();
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite21);
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
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
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
        java.lang.Class<?> wildcardClass19 = compositeSet18.getClass();
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
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
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
        java.lang.Class<?> wildcardClass13 = compositeSet12.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
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
        java.util.Set<examples.Composite> compositeSet16 = composite8.children();
        java.util.Set<examples.Composite> compositeSet17 = composite8.children();
        java.util.Set<examples.Composite> compositeSet18 = composite8.children();
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite8);
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
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        examples.Composite composite1 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        java.util.Set<examples.Composite> compositeSet9 = composite4.children();
        examples.Composite composite10 = null;
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
        org.junit.Assert.assertNotNull(compositeSet9);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
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
            composite7.addChild(composite26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
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
        java.lang.Class<?> wildcardClass15 = composite13.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        examples.Composite composite1 = new examples.Composite(8);
        examples.Composite composite3 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        examples.Composite composite6 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite3.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet9 = composite3.children();
        examples.Composite composite11 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite3.addChild(composite11);
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
        org.junit.Assert.assertNotNull(compositeSet12);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
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
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
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
        examples.Composite composite18 = new examples.Composite((-100));
        examples.Composite composite20 = new examples.Composite((-3));
        composite18.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        java.util.Set<examples.Composite> compositeSet23 = composite20.children();
        examples.Composite composite25 = new examples.Composite((-9));
        composite20.addChild(composite25);
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
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet27);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
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
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        java.lang.Class<?> wildcardClass15 = composite12.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        examples.Composite composite1 = new examples.Composite(2);
        examples.Composite composite3 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite7 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        examples.Composite composite1 = new examples.Composite(3);
        examples.Composite composite3 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite10 = new examples.Composite(100);
        composite1.addChild(composite10);
        java.lang.Class<?> wildcardClass12 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
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
        java.util.Set<examples.Composite> compositeSet14 = composite8.children();
        java.lang.Class<?> wildcardClass15 = compositeSet14.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-6));
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        java.util.Set<examples.Composite> compositeSet13 = composite9.children();
        examples.Composite composite15 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        java.util.Set<examples.Composite> compositeSet19 = composite15.children();
        composite9.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet21 = composite9.children();
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
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
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
        java.lang.Class<?> wildcardClass16 = compositeSet15.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
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
        examples.Composite composite15 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        composite1.addChild(composite15);
        examples.Composite composite19 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        examples.Composite composite23 = new examples.Composite(0);
        composite19.addChild(composite23);
        // The following exception was thrown during execution in test generation
        try {
            composite15.addChild(composite19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        java.lang.Class<?> wildcardClass9 = composite4.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
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
        java.lang.Class<?> wildcardClass17 = composite11.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
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
        examples.Composite composite16 = null;
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
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite(4);
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        java.lang.Class<?> wildcardClass12 = compositeSet11.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
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
        examples.Composite composite15 = new examples.Composite((int) '4');
        examples.Composite composite17 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        composite15.addChild(composite17);
        examples.Composite composite22 = new examples.Composite((int) (byte) 100);
        composite15.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite15.children();
        java.util.Set<examples.Composite> compositeSet25 = composite15.children();
        // The following exception was thrown during execution in test generation
        try {
            composite6.addChild(composite15);
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
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite((-1));
        examples.Composite composite11 = new examples.Composite(100);
        composite9.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite9.children();
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
        org.junit.Assert.assertNotNull(compositeSet13);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
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
        java.util.Set<examples.Composite> compositeSet13 = composite1.children();
        examples.Composite composite15 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        examples.Composite composite19 = new examples.Composite((-6));
        composite15.addChild(composite19);
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
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
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
        java.util.Set<examples.Composite> compositeSet12 = composite1.children();
        examples.Composite composite13 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite13);
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
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
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
        java.lang.Class<?> wildcardClass13 = composite10.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
        examples.Composite composite17 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        java.util.Set<examples.Composite> compositeSet20 = composite17.children();
        examples.Composite composite22 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        composite17.addChild(composite22);
        examples.Composite composite26 = new examples.Composite(10);
        composite22.addChild(composite26);
        java.util.Set<examples.Composite> compositeSet28 = composite22.children();
        java.util.Set<examples.Composite> compositeSet29 = composite22.children();
        java.util.Set<examples.Composite> compositeSet30 = composite22.children();
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite22);
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
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        examples.Composite composite1 = new examples.Composite(3);
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.lang.Class<?> wildcardClass7 = compositeSet6.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        examples.Composite composite1 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.lang.Class<?> wildcardClass4 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
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
        examples.Composite composite22 = new examples.Composite((-100));
        examples.Composite composite24 = new examples.Composite((-3));
        composite22.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        java.util.Set<examples.Composite> compositeSet27 = composite24.children();
        examples.Composite composite29 = new examples.Composite((-9));
        composite24.addChild(composite29);
        java.util.Set<examples.Composite> compositeSet31 = composite24.children();
        examples.Composite composite33 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet34 = composite33.children();
        composite24.addChild(composite33);
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite33);
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
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet34);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
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
        java.lang.Class<?> wildcardClass25 = composite12.getClass();
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
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
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
        java.lang.Class<?> wildcardClass13 = compositeSet12.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
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
        java.util.Set<examples.Composite> compositeSet26 = composite12.children();
        examples.Composite composite28 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        java.util.Set<examples.Composite> compositeSet30 = composite28.children();
        examples.Composite composite32 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet33 = composite32.children();
        java.util.Set<examples.Composite> compositeSet34 = composite32.children();
        java.util.Set<examples.Composite> compositeSet35 = composite32.children();
        java.util.Set<examples.Composite> compositeSet36 = composite32.children();
        java.util.Set<examples.Composite> compositeSet37 = composite32.children();
        java.util.Set<examples.Composite> compositeSet38 = composite32.children();
        composite28.addChild(composite32);
        java.util.Set<examples.Composite> compositeSet40 = composite32.children();
        // The following exception was thrown during execution in test generation
        try {
            composite12.addChild(composite32);
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
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet35);
        org.junit.Assert.assertNotNull(compositeSet36);
        org.junit.Assert.assertNotNull(compositeSet37);
        org.junit.Assert.assertNotNull(compositeSet38);
        org.junit.Assert.assertNotNull(compositeSet40);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        examples.Composite composite1 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = compositeSet2.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        java.lang.Class<?> wildcardClass10 = composite8.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        examples.Composite composite1 = new examples.Composite(9);
        examples.Composite composite3 = new examples.Composite((int) (short) 10);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((int) '4');
        examples.Composite composite8 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        composite6.addChild(composite8);
        examples.Composite composite13 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        composite6.addChild(composite13);
        examples.Composite composite17 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        composite13.addChild(composite17);
        examples.Composite composite21 = new examples.Composite((-4));
        composite13.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        java.util.Set<examples.Composite> compositeSet24 = composite21.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-8));
        composite1.addChild(composite6);
        examples.Composite composite9 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        composite1.addChild(composite9);
        examples.Composite composite14 = new examples.Composite((-100));
        examples.Composite composite16 = new examples.Composite((-10));
        composite14.addChild(composite16);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        examples.Composite composite1 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
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
        examples.Composite composite20 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        composite7.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet23 = composite20.children();
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
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet23);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
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
        java.util.Set<examples.Composite> compositeSet16 = composite11.children();
        java.util.Set<examples.Composite> compositeSet17 = composite11.children();
        java.lang.Class<?> wildcardClass18 = composite11.getClass();
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
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
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
        examples.Composite composite20 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        java.util.Set<examples.Composite> compositeSet23 = composite20.children();
        java.util.Set<examples.Composite> compositeSet24 = composite20.children();
        examples.Composite composite26 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        java.util.Set<examples.Composite> compositeSet28 = composite26.children();
        java.util.Set<examples.Composite> compositeSet29 = composite26.children();
        java.util.Set<examples.Composite> compositeSet30 = composite26.children();
        composite20.addChild(composite26);
        java.util.Set<examples.Composite> compositeSet32 = composite26.children();
        examples.Composite composite34 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet35 = composite34.children();
        java.util.Set<examples.Composite> compositeSet36 = composite34.children();
        composite26.addChild(composite34);
        java.util.Set<examples.Composite> compositeSet38 = composite34.children();
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet35);
        org.junit.Assert.assertNotNull(compositeSet36);
        org.junit.Assert.assertNotNull(compositeSet38);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
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
        java.util.Set<examples.Composite> compositeSet14 = composite1.children();
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
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        examples.Composite composite1 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.lang.Class<?> wildcardClass4 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((int) (byte) 10);
        composite1.addChild(composite5);
        examples.Composite composite8 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite1.addChild(composite8);
        examples.Composite composite12 = new examples.Composite((-2));
        examples.Composite composite14 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        composite12.addChild(composite14);
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
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
        examples.Composite composite14 = new examples.Composite((-10));
        composite12.addChild(composite14);
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
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
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
        examples.Composite composite19 = new examples.Composite((-100));
        examples.Composite composite21 = new examples.Composite((-3));
        composite19.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        java.util.Set<examples.Composite> compositeSet24 = composite21.children();
        examples.Composite composite26 = new examples.Composite(4);
        composite21.addChild(composite26);
        // The following exception was thrown during execution in test generation
        try {
            composite15.addChild(composite26);
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
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
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
        java.util.Set<examples.Composite> compositeSet24 = composite19.children();
        examples.Composite composite26 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        composite19.addChild(composite26);
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
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet27);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
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
        java.util.Set<examples.Composite> compositeSet33 = composite29.children();
        java.util.Set<examples.Composite> compositeSet34 = composite29.children();
        examples.Composite composite36 = new examples.Composite((int) (short) 0);
        composite29.addChild(composite36);
        java.util.Set<examples.Composite> compositeSet38 = composite36.children();
        java.util.Set<examples.Composite> compositeSet39 = composite36.children();
        java.util.Set<examples.Composite> compositeSet40 = composite36.children();
        // The following exception was thrown during execution in test generation
        try {
            composite17.addChild(composite36);
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
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet38);
        org.junit.Assert.assertNotNull(compositeSet39);
        org.junit.Assert.assertNotNull(compositeSet40);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
        examples.Composite composite14 = new examples.Composite((-5));
        examples.Composite composite16 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        composite14.addChild(composite16);
        examples.Composite composite20 = new examples.Composite(2);
        composite14.addChild(composite20);
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
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
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
        examples.Composite composite14 = new examples.Composite((-100));
        examples.Composite composite16 = new examples.Composite((-3));
        composite14.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        examples.Composite composite21 = new examples.Composite((-9));
        composite16.addChild(composite21);
        examples.Composite composite24 = new examples.Composite((int) (short) 1);
        composite21.addChild(composite24);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        examples.Composite composite1 = new examples.Composite((-9));
        examples.Composite composite3 = new examples.Composite((int) (byte) 1);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite((-100));
        examples.Composite composite11 = new examples.Composite((-3));
        composite9.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        examples.Composite composite16 = new examples.Composite((-9));
        composite11.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        examples.Composite composite21 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        composite16.addChild(composite21);
        examples.Composite composite25 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        composite21.addChild(composite25);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
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
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
        java.lang.Class<?> wildcardClass23 = composite19.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
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
        examples.Composite composite26 = new examples.Composite((int) '4');
        composite22.addChild(composite26);
        examples.Composite composite29 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet30 = composite29.children();
        java.util.Set<examples.Composite> compositeSet31 = composite29.children();
        composite26.addChild(composite29);
        examples.Composite composite34 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet35 = composite34.children();
        composite26.addChild(composite34);
        java.util.Set<examples.Composite> compositeSet37 = composite26.children();
        java.util.Set<examples.Composite> compositeSet38 = composite26.children();
        java.util.Set<examples.Composite> compositeSet39 = composite26.children();
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite26);
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
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet35);
        org.junit.Assert.assertNotNull(compositeSet37);
        org.junit.Assert.assertNotNull(compositeSet38);
        org.junit.Assert.assertNotNull(compositeSet39);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        examples.Composite composite1 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) '#');
        composite1.addChild(composite4);
        examples.Composite composite7 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        examples.Composite composite10 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        composite7.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet14 = composite10.children();
        java.util.Set<examples.Composite> compositeSet15 = composite10.children();
        java.util.Set<examples.Composite> compositeSet16 = composite10.children();
        java.util.Set<examples.Composite> compositeSet17 = composite10.children();
        java.util.Set<examples.Composite> compositeSet18 = composite10.children();
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
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        examples.Composite composite1 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        examples.Composite composite9 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        composite4.addChild(composite9);
        examples.Composite composite14 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        composite4.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet19 = composite4.children();
        java.util.Set<examples.Composite> compositeSet20 = composite4.children();
        examples.Composite composite22 = new examples.Composite((int) (short) 10);
        composite4.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite4.children();
        java.util.Set<examples.Composite> compositeSet25 = composite4.children();
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
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
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
        examples.Composite composite15 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        composite1.addChild(composite15);
        java.lang.Class<?> wildcardClass18 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        examples.Composite composite1 = new examples.Composite(0);
        examples.Composite composite3 = new examples.Composite((int) (short) 1);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        examples.Composite composite10 = new examples.Composite((-10));
        composite6.addChild(composite10);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
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
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
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
        java.util.Set<examples.Composite> compositeSet15 = composite8.children();
        java.util.Set<examples.Composite> compositeSet16 = composite8.children();
        examples.Composite composite18 = new examples.Composite((-2));
        examples.Composite composite20 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        java.util.Set<examples.Composite> compositeSet23 = composite20.children();
        composite18.addChild(composite20);
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        examples.Composite composite1 = new examples.Composite(9);
        examples.Composite composite3 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        composite3.addChild(composite8);
        examples.Composite composite13 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        java.util.Set<examples.Composite> compositeSet16 = composite13.children();
        composite3.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet18 = composite13.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        examples.Composite composite1 = new examples.Composite((int) (byte) 100);
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
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
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
        examples.Composite composite17 = new examples.Composite((int) '4');
        examples.Composite composite19 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        composite17.addChild(composite19);
        examples.Composite composite24 = new examples.Composite((int) (byte) 100);
        composite17.addChild(composite24);
        examples.Composite composite27 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet28 = composite27.children();
        composite24.addChild(composite27);
        java.util.Set<examples.Composite> compositeSet30 = composite24.children();
        // The following exception was thrown during execution in test generation
        try {
            composite10.addChild(composite24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet30);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
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
        examples.Composite composite15 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        composite11.addChild(composite15);
        examples.Composite composite19 = new examples.Composite((-4));
        composite11.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite11.children();
        java.util.Set<examples.Composite> compositeSet22 = composite11.children();
        java.util.Set<examples.Composite> compositeSet23 = composite11.children();
        examples.Composite composite25 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        java.util.Set<examples.Composite> compositeSet27 = composite25.children();
        java.util.Set<examples.Composite> compositeSet28 = composite25.children();
        java.util.Set<examples.Composite> compositeSet29 = composite25.children();
        composite11.addChild(composite25);
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
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
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
        examples.Composite composite18 = new examples.Composite((-100));
        examples.Composite composite20 = new examples.Composite((-3));
        composite18.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        java.util.Set<examples.Composite> compositeSet23 = composite20.children();
        java.util.Set<examples.Composite> compositeSet24 = composite20.children();
        java.util.Set<examples.Composite> compositeSet25 = composite20.children();
        examples.Composite composite27 = new examples.Composite((int) (short) 0);
        composite20.addChild(composite27);
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite20);
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
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
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
        examples.Composite composite21 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        examples.Composite composite24 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        composite21.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet27 = composite21.children();
        // The following exception was thrown during execution in test generation
        try {
            composite13.addChild(composite21);
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
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet27);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
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
        examples.Composite composite23 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        examples.Composite composite26 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        java.util.Set<examples.Composite> compositeSet28 = composite26.children();
        composite23.addChild(composite26);
        java.util.Set<examples.Composite> compositeSet30 = composite23.children();
        java.util.Set<examples.Composite> compositeSet31 = composite23.children();
        java.util.Set<examples.Composite> compositeSet32 = composite23.children();
        java.util.Set<examples.Composite> compositeSet33 = composite23.children();
        java.util.Set<examples.Composite> compositeSet34 = composite23.children();
        java.util.Set<examples.Composite> compositeSet35 = composite23.children();
        // The following exception was thrown during execution in test generation
        try {
            composite20.addChild(composite23);
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
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet35);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
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
        examples.Composite composite21 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        composite14.addChild(composite21);
        examples.Composite composite25 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        examples.Composite composite28 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        composite25.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet31 = composite25.children();
        java.util.Set<examples.Composite> compositeSet32 = composite25.children();
        // The following exception was thrown during execution in test generation
        try {
            composite21.addChild(composite25);
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
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet32);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
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
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        examples.Composite composite17 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        examples.Composite composite20 = new examples.Composite(8);
        composite17.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        java.util.Set<examples.Composite> compositeSet23 = composite20.children();
        java.util.Set<examples.Composite> compositeSet24 = composite20.children();
        java.util.Set<examples.Composite> compositeSet25 = composite20.children();
        // The following exception was thrown during execution in test generation
        try {
            composite12.addChild(composite20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        examples.Composite composite1 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        examples.Composite composite9 = new examples.Composite(100);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite4.addChild(composite9);
        examples.Composite composite13 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        examples.Composite composite16 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        composite13.addChild(composite16);
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
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
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
        java.lang.Class<?> wildcardClass15 = composite3.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((int) (short) -1);
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet8 = composite5.children();
        java.lang.Class<?> wildcardClass9 = composite5.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        java.util.Set<examples.Composite> compositeSet16 = composite12.children();
        java.util.Set<examples.Composite> compositeSet17 = composite12.children();
        composite1.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet19 = composite12.children();
        java.lang.Class<?> wildcardClass20 = compositeSet19.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        examples.Composite composite1 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
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
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
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
        java.lang.Class<?> wildcardClass20 = compositeSet19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
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
        java.util.Set<examples.Composite> compositeSet14 = composite6.children();
        java.lang.Class<?> wildcardClass15 = composite6.getClass();
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
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
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        examples.Composite composite1 = new examples.Composite((-10));
        examples.Composite composite3 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        java.lang.Class<?> wildcardClass9 = compositeSet8.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
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
        examples.Composite composite14 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        examples.Composite composite17 = new examples.Composite(8);
        composite14.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        java.util.Set<examples.Composite> compositeSet20 = composite17.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite17);
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
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
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
        java.util.Set<examples.Composite> compositeSet15 = composite11.children();
        java.util.Set<examples.Composite> compositeSet16 = composite11.children();
        examples.Composite composite18 = new examples.Composite((int) (short) 0);
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
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
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
        java.util.Set<examples.Composite> compositeSet12 = composite4.children();
        java.lang.Class<?> wildcardClass13 = composite4.getClass();
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
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        java.lang.Class<?> wildcardClass9 = composite3.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
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
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        java.util.Set<examples.Composite> compositeSet20 = composite17.children();
        examples.Composite composite22 = new examples.Composite((-9));
        composite17.addChild(composite22);
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
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
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
        java.lang.Class<?> wildcardClass22 = composite19.getClass();
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
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        examples.Composite composite1 = new examples.Composite(9);
        examples.Composite composite3 = new examples.Composite((int) (short) 10);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.lang.Class<?> wildcardClass6 = compositeSet5.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        examples.Composite composite1 = new examples.Composite((-5));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-100));
        examples.Composite composite6 = new examples.Composite((-3));
        composite4.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet8);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        examples.Composite composite8 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite1.addChild(composite8);
        java.lang.Class<?> wildcardClass11 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
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
        examples.Composite composite24 = new examples.Composite((int) (byte) -1);
        composite17.addChild(composite24);
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
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-7));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite3.children();
        java.lang.Class<?> wildcardClass11 = composite3.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
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
        // The following exception was thrown during execution in test generation
        try {
            composite12.addChild(composite22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        examples.Composite composite1 = new examples.Composite(3);
        examples.Composite composite3 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite9 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite9);
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
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        java.util.Set<examples.Composite> compositeSet9 = composite4.children();
        examples.Composite composite11 = new examples.Composite((-100));
        examples.Composite composite13 = new examples.Composite((-3));
        composite11.addChild(composite13);
        examples.Composite composite16 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        composite11.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet21 = composite16.children();
        java.util.Set<examples.Composite> compositeSet22 = composite16.children();
        examples.Composite composite24 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        java.util.Set<examples.Composite> compositeSet27 = composite24.children();
        composite16.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet29 = composite24.children();
        examples.Composite composite31 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet32 = composite31.children();
        composite24.addChild(composite31);
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet32);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
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
        java.util.Set<examples.Composite> compositeSet19 = composite8.children();
        java.lang.Class<?> wildcardClass20 = composite8.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
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
        examples.Composite composite38 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet39 = composite38.children();
        composite30.addChild(composite38);
        examples.Composite composite42 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet43 = composite42.children();
        java.util.Set<examples.Composite> compositeSet44 = composite42.children();
        composite30.addChild(composite42);
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite30);
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
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet35);
        org.junit.Assert.assertNotNull(compositeSet39);
        org.junit.Assert.assertNotNull(compositeSet43);
        org.junit.Assert.assertNotNull(compositeSet44);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-6));
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        java.util.Set<examples.Composite> compositeSet8 = composite5.children();
        java.util.Set<examples.Composite> compositeSet9 = composite5.children();
        java.lang.Class<?> wildcardClass10 = compositeSet9.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
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
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
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
        java.lang.Class<?> wildcardClass16 = compositeSet15.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
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
        java.util.Set<examples.Composite> compositeSet16 = composite1.children();
        examples.Composite composite18 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        examples.Composite composite21 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        composite18.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet24 = composite18.children();
        java.util.Set<examples.Composite> compositeSet25 = composite18.children();
        examples.Composite composite27 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet28 = composite27.children();
        java.util.Set<examples.Composite> compositeSet29 = composite27.children();
        composite18.addChild(composite27);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite27);
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
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
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
        examples.Composite composite29 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet30 = composite29.children();
        java.util.Set<examples.Composite> compositeSet31 = composite29.children();
        composite26.addChild(composite29);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite29);
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
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet31);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((int) (short) -1);
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet8 = composite5.children();
        examples.Composite composite10 = new examples.Composite((int) '4');
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        composite10.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet16 = composite12.children();
        examples.Composite composite18 = new examples.Composite((-5));
        composite12.addChild(composite18);
        examples.Composite composite21 = new examples.Composite(6);
        composite18.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet23 = composite18.children();
        java.util.Set<examples.Composite> compositeSet24 = composite18.children();
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
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
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
            composite8.addChild(composite23);
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
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite(2);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.lang.Class<?> wildcardClass7 = composite3.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
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
        examples.Composite composite15 = new examples.Composite(100);
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        composite8.addChild(composite15);
        java.lang.Class<?> wildcardClass18 = composite8.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(3);
        composite1.addChild(composite6);
        examples.Composite composite9 = new examples.Composite((-7));
        composite1.addChild(composite9);
        java.lang.Class<?> wildcardClass11 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
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
        java.util.Set<examples.Composite> compositeSet15 = composite8.children();
        java.util.Set<examples.Composite> compositeSet16 = composite8.children();
        java.util.Set<examples.Composite> compositeSet17 = composite8.children();
        examples.Composite composite19 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        examples.Composite composite23 = new examples.Composite((int) (byte) 10);
        composite19.addChild(composite23);
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        examples.Composite composite10 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        examples.Composite composite13 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        composite10.addChild(composite13);
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
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
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
        java.lang.Class<?> wildcardClass17 = composite14.getClass();
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        examples.Composite composite1 = new examples.Composite(0);
        examples.Composite composite3 = new examples.Composite((int) (short) 1);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite(7);
        composite3.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite3.children();
        examples.Composite composite11 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        examples.Composite composite15 = new examples.Composite((int) (short) -1);
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        composite11.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
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
        examples.Composite composite27 = new examples.Composite((-9));
        examples.Composite composite29 = new examples.Composite((int) (byte) 1);
        composite27.addChild(composite29);
        java.util.Set<examples.Composite> compositeSet31 = composite29.children();
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet31);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        examples.Composite composite1 = new examples.Composite((-10));
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
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
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
        examples.Composite composite16 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        examples.Composite composite19 = new examples.Composite(8);
        composite16.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
        java.util.Set<examples.Composite> compositeSet23 = composite19.children();
        java.util.Set<examples.Composite> compositeSet24 = composite19.children();
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
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
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
        examples.Composite composite15 = new examples.Composite((-100));
        examples.Composite composite17 = new examples.Composite((-3));
        composite15.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        java.util.Set<examples.Composite> compositeSet20 = composite17.children();
        examples.Composite composite22 = new examples.Composite((-9));
        composite17.addChild(composite22);
        examples.Composite composite25 = new examples.Composite((int) (short) 1);
        composite22.addChild(composite25);
        java.util.Set<examples.Composite> compositeSet27 = composite22.children();
        examples.Composite composite29 = new examples.Composite(100);
        java.util.Set<examples.Composite> compositeSet30 = composite29.children();
        composite22.addChild(composite29);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet30);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        examples.Composite composite1 = new examples.Composite((int) (short) 10);
        examples.Composite composite3 = new examples.Composite((int) (short) 1);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        examples.Composite composite11 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite6.addChild(composite11);
        examples.Composite composite15 = new examples.Composite(10);
        composite11.addChild(composite15);
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
        org.junit.Assert.assertNotNull(compositeSet12);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
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
        examples.Composite composite16 = new examples.Composite((int) (byte) 1);
        examples.Composite composite18 = new examples.Composite(2);
        composite16.addChild(composite18);
        examples.Composite composite21 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        composite18.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet25 = composite21.children();
        examples.Composite composite27 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet28 = composite27.children();
        composite21.addChild(composite27);
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
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
        java.util.Set<examples.Composite> compositeSet18 = composite8.children();
        examples.Composite composite20 = new examples.Composite((-100));
        examples.Composite composite22 = new examples.Composite((-3));
        composite20.addChild(composite22);
        examples.Composite composite25 = new examples.Composite((-6));
        composite20.addChild(composite25);
        java.util.Set<examples.Composite> compositeSet27 = composite25.children();
        java.util.Set<examples.Composite> compositeSet28 = composite25.children();
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite25);
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
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.lang.Class<?> wildcardClass9 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        examples.Composite composite7 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        java.util.Set<examples.Composite> compositeSet10 = composite7.children();
        java.util.Set<examples.Composite> compositeSet11 = composite7.children();
        examples.Composite composite13 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        java.util.Set<examples.Composite> compositeSet16 = composite13.children();
        java.util.Set<examples.Composite> compositeSet17 = composite13.children();
        composite7.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet19 = composite7.children();
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
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        java.util.Set<examples.Composite> compositeSet16 = composite12.children();
        java.util.Set<examples.Composite> compositeSet17 = composite12.children();
        composite1.addChild(composite12);
        java.lang.Class<?> wildcardClass19 = composite12.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
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
        java.util.Set<examples.Composite> compositeSet12 = composite4.children();
        java.lang.Class<?> wildcardClass13 = compositeSet12.getClass();
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
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
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
        examples.Composite composite23 = new examples.Composite((int) '4');
        examples.Composite composite25 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        java.util.Set<examples.Composite> compositeSet27 = composite25.children();
        composite23.addChild(composite25);
        examples.Composite composite30 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet31 = composite30.children();
        composite23.addChild(composite30);
        examples.Composite composite34 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet35 = composite34.children();
        composite30.addChild(composite34);
        examples.Composite composite38 = new examples.Composite((-4));
        composite30.addChild(composite38);
        examples.Composite composite41 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet42 = composite41.children();
        composite38.addChild(composite41);
        // The following exception was thrown during execution in test generation
        try {
            composite16.addChild(composite38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet35);
        org.junit.Assert.assertNotNull(compositeSet42);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        examples.Composite composite1 = new examples.Composite((-2));
        examples.Composite composite3 = new examples.Composite((-100));
        examples.Composite composite5 = new examples.Composite((-3));
        composite3.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        java.util.Set<examples.Composite> compositeSet8 = composite5.children();
        java.util.Set<examples.Composite> compositeSet9 = composite5.children();
        java.util.Set<examples.Composite> compositeSet10 = composite5.children();
        java.util.Set<examples.Composite> compositeSet11 = composite5.children();
        examples.Composite composite13 = new examples.Composite((int) (byte) 0);
        composite5.addChild(composite13);
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
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
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
        java.util.Set<examples.Composite> compositeSet35 = composite29.children();
        java.util.Set<examples.Composite> compositeSet36 = composite29.children();
        examples.Composite composite38 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet39 = composite38.children();
        java.util.Set<examples.Composite> compositeSet40 = composite38.children();
        composite29.addChild(composite38);
        examples.Composite composite43 = new examples.Composite(6);
        composite29.addChild(composite43);
        // The following exception was thrown during execution in test generation
        try {
            composite15.addChild(composite29);
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
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet35);
        org.junit.Assert.assertNotNull(compositeSet36);
        org.junit.Assert.assertNotNull(compositeSet39);
        org.junit.Assert.assertNotNull(compositeSet40);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
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
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
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
        examples.Composite composite32 = new examples.Composite(9);
        composite29.addChild(composite32);
        java.util.Set<examples.Composite> compositeSet34 = composite29.children();
        // The following exception was thrown during execution in test generation
        try {
            composite7.addChild(composite29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet34);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
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
        java.lang.Class<?> wildcardClass17 = composite1.getClass();
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
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        examples.Composite composite9 = new examples.Composite((int) '4');
        examples.Composite composite11 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        composite9.addChild(composite11);
        examples.Composite composite16 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        composite9.addChild(composite16);
        examples.Composite composite20 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        composite16.addChild(composite20);
        examples.Composite composite24 = new examples.Composite((-4));
        composite16.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet26 = composite16.children();
        java.util.Set<examples.Composite> compositeSet27 = composite16.children();
        java.util.Set<examples.Composite> compositeSet28 = composite16.children();
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
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        examples.Composite composite1 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        examples.Composite composite8 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite5.addChild(composite8);
        examples.Composite composite12 = new examples.Composite((-2));
        composite5.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet14 = composite5.children();
        java.util.Set<examples.Composite> compositeSet15 = composite5.children();
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
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
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
        java.util.Set<examples.Composite> compositeSet17 = composite1.children();
        java.lang.Class<?> wildcardClass18 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        examples.Composite composite1 = new examples.Composite((-10));
        examples.Composite composite3 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite9 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        examples.Composite composite12 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite9.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
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
        examples.Composite composite15 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        examples.Composite composite19 = new examples.Composite((-10));
        composite15.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
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
        examples.Composite composite27 = new examples.Composite((-8));
        composite22.addChild(composite27);
        examples.Composite composite30 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet31 = composite30.children();
        java.util.Set<examples.Composite> compositeSet32 = composite30.children();
        composite22.addChild(composite30);
        java.util.Set<examples.Composite> compositeSet34 = composite30.children();
        java.util.Set<examples.Composite> compositeSet35 = composite30.children();
        examples.Composite composite37 = new examples.Composite((int) 'a');
        composite30.addChild(composite37);
        java.util.Set<examples.Composite> compositeSet39 = composite30.children();
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite30);
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
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet35);
        org.junit.Assert.assertNotNull(compositeSet39);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        examples.Composite composite1 = new examples.Composite(0);
        examples.Composite composite3 = new examples.Composite((int) (short) 1);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite(7);
        composite3.addChild(composite7);
        examples.Composite composite10 = new examples.Composite((int) '4');
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        composite10.addChild(composite12);
        examples.Composite composite17 = new examples.Composite((int) (byte) 100);
        composite10.addChild(composite17);
        examples.Composite composite20 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        composite17.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet23 = composite17.children();
        java.util.Set<examples.Composite> compositeSet24 = composite17.children();
        java.util.Set<examples.Composite> compositeSet25 = composite17.children();
        java.util.Set<examples.Composite> compositeSet26 = composite17.children();
        java.util.Set<examples.Composite> compositeSet27 = composite17.children();
        // The following exception was thrown during execution in test generation
        try {
            composite7.addChild(composite17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        examples.Composite composite1 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
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
        examples.Composite composite22 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        composite8.addChild(composite22);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet23);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        examples.Composite composite1 = new examples.Composite(4);
        examples.Composite composite3 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        examples.Composite composite6 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite3.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet9 = composite3.children();
        examples.Composite composite11 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite3.addChild(composite11);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet12);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
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
        java.util.Set<examples.Composite> compositeSet16 = composite4.children();
        java.lang.Class<?> wildcardClass17 = composite4.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
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
        examples.Composite composite19 = new examples.Composite((-10));
        examples.Composite composite21 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        java.util.Set<examples.Composite> compositeSet24 = composite21.children();
        composite19.addChild(composite21);
        // The following exception was thrown during execution in test generation
        try {
            composite16.addChild(composite21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
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
        java.lang.Class<?> wildcardClass20 = composite8.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
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
        examples.Composite composite31 = new examples.Composite((int) (byte) 100);
        composite21.addChild(composite31);
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
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
        java.util.Set<examples.Composite> compositeSet31 = composite28.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet31);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        examples.Composite composite1 = new examples.Composite(5);
        examples.Composite composite3 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite1.addChild(composite8);
        java.lang.Class<?> wildcardClass11 = composite8.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-10));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        examples.Composite composite7 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        examples.Composite composite11 = new examples.Composite((int) (byte) 10);
        composite7.addChild(composite11);
        examples.Composite composite14 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        composite7.addChild(composite14);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet15);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
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
        examples.Composite composite26 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        examples.Composite composite29 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet30 = composite29.children();
        composite26.addChild(composite29);
        examples.Composite composite33 = new examples.Composite((-3));
        composite29.addChild(composite33);
        // The following exception was thrown during execution in test generation
        try {
            composite12.addChild(composite29);
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
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet30);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
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
        java.util.Set<examples.Composite> compositeSet19 = composite6.children();
        java.lang.Class<?> wildcardClass20 = compositeSet19.getClass();
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        examples.Composite composite7 = new examples.Composite((int) (byte) 10);
        composite1.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        examples.Composite composite11 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        examples.Composite composite16 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        composite11.addChild(composite16);
        examples.Composite composite20 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        composite16.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet23 = composite16.children();
        java.util.Set<examples.Composite> compositeSet24 = composite16.children();
        // The following exception was thrown during execution in test generation
        try {
            composite7.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
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
        java.lang.Class<?> wildcardClass22 = composite15.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
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
            composite1.addChild(composite24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
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
        java.lang.Class<?> wildcardClass17 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
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
        java.util.Set<examples.Composite> compositeSet12 = composite1.children();
        java.lang.Class<?> wildcardClass13 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
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
        java.util.Set<examples.Composite> compositeSet21 = composite17.children();
        java.util.Set<examples.Composite> compositeSet22 = composite17.children();
        examples.Composite composite24 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        java.util.Set<examples.Composite> compositeSet27 = composite24.children();
        java.util.Set<examples.Composite> compositeSet28 = composite24.children();
        java.util.Set<examples.Composite> compositeSet29 = composite24.children();
        java.util.Set<examples.Composite> compositeSet30 = composite24.children();
        java.util.Set<examples.Composite> compositeSet31 = composite24.children();
        composite17.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet33 = composite24.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite24);
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
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        examples.Composite composite1 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite((-100));
        examples.Composite composite11 = new examples.Composite((-3));
        composite9.addChild(composite11);
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
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
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
        examples.Composite composite23 = new examples.Composite((-5));
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        java.util.Set<examples.Composite> compositeSet25 = composite23.children();
        examples.Composite composite27 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet28 = composite27.children();
        java.util.Set<examples.Composite> compositeSet29 = composite27.children();
        java.util.Set<examples.Composite> compositeSet30 = composite27.children();
        composite23.addChild(composite27);
        // The following exception was thrown during execution in test generation
        try {
            composite20.addChild(composite23);
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
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
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
        examples.Composite composite18 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        java.util.Set<examples.Composite> compositeSet21 = composite18.children();
        examples.Composite composite23 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        composite18.addChild(composite23);
        examples.Composite composite27 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet28 = composite27.children();
        composite23.addChild(composite27);
        java.util.Set<examples.Composite> compositeSet30 = composite27.children();
        java.util.Set<examples.Composite> compositeSet31 = composite27.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite27);
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
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet31);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
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
        java.util.Set<examples.Composite> compositeSet20 = composite16.children();
        examples.Composite composite21 = null;
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
        org.junit.Assert.assertNotNull(compositeSet20);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
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
        java.lang.Class<?> wildcardClass18 = compositeSet17.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        examples.Composite composite1 = new examples.Composite(8);
        examples.Composite composite3 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.lang.Class<?> wildcardClass7 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
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
        java.lang.Class<?> wildcardClass17 = composite9.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-9));
        composite3.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite3.children();
        java.util.Set<examples.Composite> compositeSet10 = composite3.children();
        java.util.Set<examples.Composite> compositeSet11 = composite3.children();
        java.lang.Class<?> wildcardClass12 = compositeSet11.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
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
        java.lang.Class<?> wildcardClass17 = composite13.getClass();
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
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        java.util.Set<examples.Composite> compositeSet9 = composite4.children();
        java.util.Set<examples.Composite> compositeSet10 = composite4.children();
        examples.Composite composite12 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        examples.Composite composite15 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        composite12.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet19 = composite15.children();
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        examples.Composite composite1 = new examples.Composite((-2));
        examples.Composite composite3 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        examples.Composite composite10 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(3);
        composite1.addChild(composite6);
        examples.Composite composite9 = new examples.Composite((-7));
        composite1.addChild(composite9);
        examples.Composite composite12 = new examples.Composite((-100));
        examples.Composite composite14 = new examples.Composite((-3));
        composite12.addChild(composite14);
        examples.Composite composite17 = new examples.Composite((-6));
        composite12.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        java.util.Set<examples.Composite> compositeSet20 = composite17.children();
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
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
        java.util.Set<examples.Composite> compositeSet24 = composite11.children();
        java.lang.Class<?> wildcardClass25 = composite11.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        examples.Composite composite1 = new examples.Composite(9);
        examples.Composite composite3 = new examples.Composite((int) (short) 10);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite11 = new examples.Composite((int) '4');
        examples.Composite composite13 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        composite11.addChild(composite13);
        examples.Composite composite18 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        composite11.addChild(composite18);
        examples.Composite composite22 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        composite18.addChild(composite22);
        examples.Composite composite26 = new examples.Composite((-4));
        composite18.addChild(composite26);
        java.util.Set<examples.Composite> compositeSet28 = composite18.children();
        java.util.Set<examples.Composite> compositeSet29 = composite18.children();
        java.util.Set<examples.Composite> compositeSet30 = composite18.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
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
        java.util.Set<examples.Composite> compositeSet13 = composite8.children();
        java.lang.Class<?> wildcardClass14 = compositeSet13.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
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
        java.util.Set<examples.Composite> compositeSet13 = composite1.children();
        java.lang.Class<?> wildcardClass14 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite7 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        composite1.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
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
            composite1.addChild(composite22);
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
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet23);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.lang.Class<?> wildcardClass7 = compositeSet6.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        java.util.Set<examples.Composite> compositeSet9 = composite4.children();
        java.util.Set<examples.Composite> compositeSet10 = composite4.children();
        examples.Composite composite12 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        examples.Composite composite15 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        java.util.Set<examples.Composite> compositeSet19 = composite15.children();
        composite12.addChild(composite15);
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
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
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
        examples.Composite composite17 = new examples.Composite(3);
        examples.Composite composite19 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        composite17.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet22 = composite17.children();
        examples.Composite composite24 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        composite17.addChild(composite24);
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
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
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
        examples.Composite composite38 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet39 = composite38.children();
        composite25.addChild(composite38);
        // The following exception was thrown during execution in test generation
        try {
            composite12.addChild(composite25);
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
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet36);
        org.junit.Assert.assertNotNull(compositeSet39);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
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
        java.util.Set<examples.Composite> compositeSet19 = composite8.children();
        java.util.Set<examples.Composite> compositeSet20 = composite8.children();
        java.lang.Class<?> wildcardClass21 = compositeSet20.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
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
        examples.Composite composite17 = new examples.Composite((int) (byte) 1);
        examples.Composite composite19 = new examples.Composite(2);
        composite17.addChild(composite19);
        examples.Composite composite22 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        composite19.addChild(composite22);
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
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite(2);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        examples.Composite composite8 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        composite1.addChild(composite8);
        examples.Composite composite13 = new examples.Composite(3);
        examples.Composite composite15 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        composite13.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet18 = composite13.children();
        java.util.Set<examples.Composite> compositeSet19 = composite13.children();
        examples.Composite composite21 = new examples.Composite((int) (byte) 1);
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        composite13.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet24 = composite13.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
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
        java.util.Set<examples.Composite> compositeSet14 = composite10.children();
        java.util.Set<examples.Composite> compositeSet15 = composite10.children();
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
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        examples.Composite composite7 = new examples.Composite((int) (short) 0);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        composite4.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet10 = composite4.children();
        examples.Composite composite12 = new examples.Composite((int) '4');
        examples.Composite composite14 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        composite12.addChild(composite14);
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
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
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        java.lang.Class<?> wildcardClass19 = composite15.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
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
        java.lang.Class<?> wildcardClass18 = compositeSet17.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
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
        examples.Composite composite16 = new examples.Composite((-2));
        examples.Composite composite18 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        java.util.Set<examples.Composite> compositeSet21 = composite18.children();
        composite16.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet23 = composite18.children();
        java.util.Set<examples.Composite> compositeSet24 = composite18.children();
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
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
        java.util.Set<examples.Composite> compositeSet12 = composite4.children();
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
            composite4.addChild(composite22);
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
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-8));
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        java.lang.Class<?> wildcardClass10 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-2));
        composite1.addChild(composite8);
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
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite10 = null;
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
        org.junit.Assert.assertNotNull(compositeSet8);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
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
        examples.Composite composite16 = new examples.Composite(1);
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        composite1.addChild(composite16);
        java.lang.Class<?> wildcardClass21 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        examples.Composite composite10 = new examples.Composite((int) (byte) -1);
        composite3.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        examples.Composite composite14 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        java.util.Set<examples.Composite> compositeSet18 = composite14.children();
        examples.Composite composite20 = new examples.Composite(9);
        composite14.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
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
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
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
        examples.Composite composite13 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        examples.Composite composite16 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        composite13.addChild(composite16);
        examples.Composite composite21 = new examples.Composite((int) (short) 1);
        composite16.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        examples.Composite composite25 = new examples.Composite((-1));
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        composite21.addChild(composite25);
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        examples.Composite composite1 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite(0);
        composite1.addChild(composite5);
        examples.Composite composite8 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        examples.Composite composite11 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite8.addChild(composite11);
        examples.Composite composite15 = new examples.Composite((-3));
        composite11.addChild(composite15);
        examples.Composite composite18 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        composite11.addChild(composite18);
        // The following exception was thrown during execution in test generation
        try {
            composite5.addChild(composite18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
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
        java.util.Set<examples.Composite> compositeSet13 = composite1.children();
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
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
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
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        examples.Composite composite21 = new examples.Composite((-9));
        composite16.addChild(composite21);
        examples.Composite composite24 = new examples.Composite((int) (short) 1);
        composite21.addChild(composite24);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite24);
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
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        examples.Composite composite1 = new examples.Composite(9);
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
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
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
        java.lang.Class<?> wildcardClass24 = composite8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
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
        java.lang.Class<?> wildcardClass15 = compositeSet14.getClass();
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
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
        java.util.Set<examples.Composite> compositeSet18 = composite12.children();
        java.lang.Class<?> wildcardClass19 = compositeSet18.getClass();
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
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
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
        java.util.Set<examples.Composite> compositeSet13 = composite1.children();
        examples.Composite composite15 = new examples.Composite((-100));
        examples.Composite composite17 = new examples.Composite((-3));
        composite15.addChild(composite17);
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
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
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
        java.lang.Class<?> wildcardClass13 = compositeSet12.getClass();
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
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
        examples.Composite composite16 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        examples.Composite composite19 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        composite16.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet22 = composite16.children();
        examples.Composite composite24 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        composite16.addChild(composite24);
        // The following exception was thrown during execution in test generation
        try {
            composite6.addChild(composite24);
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
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        examples.Composite composite1 = new examples.Composite((-1));
        examples.Composite composite3 = new examples.Composite(100);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-6));
        composite3.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        examples.Composite composite11 = new examples.Composite((-5));
        examples.Composite composite13 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        composite11.addChild(composite13);
        examples.Composite composite17 = new examples.Composite(2);
        composite11.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet19 = composite11.children();
        // The following exception was thrown during execution in test generation
        try {
            composite7.addChild(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        examples.Composite composite1 = new examples.Composite((int) 'a');
        java.lang.Class<?> wildcardClass2 = composite1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        examples.Composite composite1 = new examples.Composite((-1));
        examples.Composite composite3 = new examples.Composite(100);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.lang.Class<?> wildcardClass7 = composite3.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        examples.Composite composite1 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite7 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
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
        java.util.Set<examples.Composite> compositeSet20 = composite7.children();
        java.lang.Class<?> wildcardClass21 = composite7.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        examples.Composite composite1 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        examples.Composite composite8 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite5.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
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
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
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
        java.lang.Class<?> wildcardClass23 = compositeSet22.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
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
        examples.Composite composite14 = new examples.Composite((-100));
        examples.Composite composite16 = new examples.Composite((-3));
        composite14.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        examples.Composite composite21 = new examples.Composite((-7));
        composite16.addChild(composite21);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
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
        examples.Composite composite15 = new examples.Composite((int) '4');
        examples.Composite composite17 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        composite15.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet21 = composite17.children();
        examples.Composite composite23 = new examples.Composite((-5));
        composite17.addChild(composite23);
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite23);
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
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        examples.Composite composite1 = new examples.Composite(5);
        examples.Composite composite3 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite(6);
        composite1.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((-1));
        examples.Composite composite13 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        composite11.addChild(composite13);
        examples.Composite composite17 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        composite13.addChild(composite17);
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
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
        examples.Composite composite16 = new examples.Composite((-100));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet20 = composite16.children();
        examples.Composite composite22 = new examples.Composite((int) (byte) 10);
        composite16.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite9 = new examples.Composite((int) (short) 1);
        composite4.addChild(composite9);
        examples.Composite composite12 = new examples.Composite(9);
        examples.Composite composite14 = new examples.Composite((int) (short) 10);
        composite12.addChild(composite14);
        examples.Composite composite17 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        composite12.addChild(composite17);
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.lang.Class<?> wildcardClass8 = compositeSet7.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
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
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        examples.Composite composite17 = new examples.Composite((-100));
        examples.Composite composite19 = new examples.Composite((-3));
        composite17.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
        examples.Composite composite24 = new examples.Composite((-9));
        composite19.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        examples.Composite composite28 = new examples.Composite((int) '4');
        composite24.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet30 = composite24.children();
        // The following exception was thrown during execution in test generation
        try {
            composite12.addChild(composite24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet30);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        examples.Composite composite1 = new examples.Composite((-4));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
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
        examples.Composite composite15 = new examples.Composite(3);
        examples.Composite composite17 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        composite15.addChild(composite17);
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
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        examples.Composite composite1 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite(0);
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite((-100));
        examples.Composite composite11 = new examples.Composite((-3));
        composite9.addChild(composite11);
        examples.Composite composite14 = new examples.Composite((-8));
        composite9.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet16 = composite9.children();
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
        org.junit.Assert.assertNotNull(compositeSet16);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
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
        examples.Composite composite17 = new examples.Composite((int) (short) -1);
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        examples.Composite composite20 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        composite17.addChild(composite20);
        examples.Composite composite25 = new examples.Composite((-3));
        composite17.addChild(composite25);
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        examples.Composite composite1 = new examples.Composite((int) (byte) 100);
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
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
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
        java.util.Set<examples.Composite> compositeSet13 = composite5.children();
        java.lang.Class<?> wildcardClass14 = composite5.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-10));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        examples.Composite composite7 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        examples.Composite composite1 = new examples.Composite(8);
        examples.Composite composite3 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite((int) (byte) 1);
        examples.Composite composite11 = new examples.Composite(2);
        composite9.addChild(composite11);
        examples.Composite composite14 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        composite11.addChild(composite14);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
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
        examples.Composite composite18 = new examples.Composite((int) (short) -1);
        examples.Composite composite20 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        composite18.addChild(composite20);
        examples.Composite composite24 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        composite18.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet28 = composite24.children();
        java.util.Set<examples.Composite> compositeSet29 = composite24.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite24);
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
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
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
        examples.Composite composite16 = new examples.Composite((-100));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        java.util.Set<examples.Composite> compositeSet21 = composite18.children();
        examples.Composite composite23 = new examples.Composite((-9));
        composite18.addChild(composite23);
        examples.Composite composite26 = new examples.Composite((int) (short) 1);
        composite23.addChild(composite26);
        // The following exception was thrown during execution in test generation
        try {
            composite12.addChild(composite23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        examples.Composite composite1 = new examples.Composite((-5));
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite7 = new examples.Composite(2);
        composite1.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        java.lang.Class<?> wildcardClass11 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        java.lang.Class<?> wildcardClass9 = composite4.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
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
        java.lang.Class<?> wildcardClass16 = composite1.getClass();
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
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
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
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        examples.Composite composite9 = new examples.Composite((-5));
        composite3.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet11 = composite3.children();
        java.lang.Class<?> wildcardClass12 = composite3.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
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
        java.util.Set<examples.Composite> compositeSet15 = composite3.children();
        examples.Composite composite17 = new examples.Composite((-100));
        examples.Composite composite19 = new examples.Composite((-3));
        composite17.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
        examples.Composite composite24 = new examples.Composite((-9));
        composite19.addChild(composite24);
        examples.Composite composite27 = new examples.Composite((int) (short) 1);
        composite24.addChild(composite27);
        java.util.Set<examples.Composite> compositeSet29 = composite24.children();
        java.util.Set<examples.Composite> compositeSet30 = composite24.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite9 = new examples.Composite((-100));
        examples.Composite composite11 = new examples.Composite((-3));
        composite9.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        examples.Composite composite15 = new examples.Composite((-9));
        composite11.addChild(composite15);
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
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
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
        java.lang.Class<?> wildcardClass21 = composite15.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
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
        examples.Composite composite14 = new examples.Composite((-3));
        composite10.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        examples.Composite composite19 = new examples.Composite((int) 'a');
        composite14.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        examples.Composite composite23 = new examples.Composite((int) (short) -1);
        composite19.addChild(composite23);
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
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        examples.Composite composite1 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        java.lang.Class<?> wildcardClass9 = compositeSet8.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite10 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        composite1.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet14 = composite1.children();
        examples.Composite composite16 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        examples.Composite composite20 = new examples.Composite(4);
        composite16.addChild(composite20);
        examples.Composite composite23 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        java.util.Set<examples.Composite> compositeSet25 = composite23.children();
        java.util.Set<examples.Composite> compositeSet26 = composite23.children();
        composite16.addChild(composite23);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite23);
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
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
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
        java.util.Set<examples.Composite> compositeSet16 = composite13.children();
        java.lang.Class<?> wildcardClass17 = compositeSet16.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
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
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        examples.Composite composite17 = new examples.Composite((-1));
        examples.Composite composite19 = new examples.Composite(100);
        composite17.addChild(composite19);
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
        org.junit.Assert.assertNotNull(compositeSet15);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        examples.Composite composite1 = new examples.Composite(2);
        examples.Composite composite3 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite(3);
        examples.Composite composite10 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        composite8.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet13 = composite8.children();
        examples.Composite composite15 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        composite8.addChild(composite15);
        examples.Composite composite20 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        java.util.Set<examples.Composite> compositeSet23 = composite20.children();
        composite8.addChild(composite20);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
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
        java.util.Set<examples.Composite> compositeSet32 = composite25.children();
        examples.Composite composite34 = new examples.Composite(1);
        composite25.addChild(composite34);
        java.util.Set<examples.Composite> compositeSet36 = composite25.children();
        // The following exception was thrown during execution in test generation
        try {
            composite10.addChild(composite25);
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
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet36);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        examples.Composite composite1 = new examples.Composite((int) (byte) 10);
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
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((int) (byte) 10);
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        java.util.Set<examples.Composite> compositeSet8 = composite5.children();
        examples.Composite composite10 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        examples.Composite composite14 = new examples.Composite((int) (byte) 10);
        composite10.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        // The following exception was thrown during execution in test generation
        try {
            composite5.addChild(composite14);
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
        org.junit.Assert.assertNotNull(compositeSet16);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
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
        examples.Composite composite25 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        examples.Composite composite28 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        composite25.addChild(composite28);
        examples.Composite composite32 = new examples.Composite((-2));
        composite25.addChild(composite32);
        examples.Composite composite35 = new examples.Composite(7);
        composite25.addChild(composite35);
        java.util.Set<examples.Composite> compositeSet37 = composite25.children();
        java.util.Set<examples.Composite> compositeSet38 = composite25.children();
        examples.Composite composite40 = new examples.Composite(1);
        java.util.Set<examples.Composite> compositeSet41 = composite40.children();
        java.util.Set<examples.Composite> compositeSet42 = composite40.children();
        java.util.Set<examples.Composite> compositeSet43 = composite40.children();
        composite25.addChild(composite40);
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite40);
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
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet37);
        org.junit.Assert.assertNotNull(compositeSet38);
        org.junit.Assert.assertNotNull(compositeSet41);
        org.junit.Assert.assertNotNull(compositeSet42);
        org.junit.Assert.assertNotNull(compositeSet43);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
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
        examples.Composite composite16 = new examples.Composite((-100));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        java.util.Set<examples.Composite> compositeSet21 = composite18.children();
        examples.Composite composite23 = new examples.Composite((-9));
        composite18.addChild(composite23);
        java.util.Set<examples.Composite> compositeSet25 = composite23.children();
        java.util.Set<examples.Composite> compositeSet26 = composite23.children();
        examples.Composite composite28 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        composite23.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet31 = composite23.children();
        java.util.Set<examples.Composite> compositeSet32 = composite23.children();
        // The following exception was thrown during execution in test generation
        try {
            composite12.addChild(composite23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet32);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
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
        examples.Composite composite16 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        examples.Composite composite19 = new examples.Composite(8);
        composite16.addChild(composite19);
        examples.Composite composite22 = new examples.Composite((int) (short) 0);
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        composite19.addChild(composite22);
        examples.Composite composite26 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        composite22.addChild(composite26);
        java.util.Set<examples.Composite> compositeSet29 = composite26.children();
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
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet29);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite9 = new examples.Composite((int) (short) 1);
        composite4.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        java.lang.Class<?> wildcardClass12 = compositeSet11.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
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
        java.util.Set<examples.Composite> compositeSet15 = composite11.children();
        examples.Composite composite17 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        examples.Composite composite20 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        composite17.addChild(composite20);
        examples.Composite composite25 = new examples.Composite((int) (short) 1);
        composite20.addChild(composite25);
        java.util.Set<examples.Composite> compositeSet27 = composite25.children();
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet27);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
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
        examples.Composite composite24 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        examples.Composite composite27 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet28 = composite27.children();
        java.util.Set<examples.Composite> compositeSet29 = composite27.children();
        composite24.addChild(composite27);
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite27);
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
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
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
        examples.Composite composite14 = new examples.Composite((-9));
        composite9.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        examples.Composite composite18 = new examples.Composite((int) '4');
        composite14.addChild(composite18);
        examples.Composite composite21 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        composite18.addChild(composite21);
        examples.Composite composite26 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        composite18.addChild(composite26);
        examples.Composite composite30 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet31 = composite30.children();
        java.util.Set<examples.Composite> compositeSet32 = composite30.children();
        composite18.addChild(composite30);
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
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet32);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
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
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        examples.Composite composite1 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        composite1.addChild(composite5);
        examples.Composite composite10 = new examples.Composite((int) (byte) 1);
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        composite1.addChild(composite10);
        java.lang.Class<?> wildcardClass14 = composite10.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        examples.Composite composite1 = new examples.Composite(5);
        examples.Composite composite3 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite1.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        java.util.Set<examples.Composite> compositeSet12 = composite1.children();
        java.lang.Class<?> wildcardClass13 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
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
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite(4);
        composite3.addChild(composite8);
        examples.Composite composite10 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.lang.Class<?> wildcardClass4 = compositeSet3.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
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
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
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
        java.lang.Class<?> wildcardClass16 = compositeSet15.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
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
        examples.Composite composite24 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        examples.Composite composite27 = new examples.Composite(8);
        composite24.addChild(composite27);
        java.util.Set<examples.Composite> compositeSet29 = composite24.children();
        examples.Composite composite31 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet32 = composite31.children();
        composite24.addChild(composite31);
        // The following exception was thrown during execution in test generation
        try {
            composite15.addChild(composite31);
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
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet32);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        examples.Composite composite1 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.lang.Class<?> wildcardClass4 = compositeSet3.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
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
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        examples.Composite composite8 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite1.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        java.lang.Class<?> wildcardClass12 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        examples.Composite composite1 = new examples.Composite((-10));
        examples.Composite composite3 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite9 = new examples.Composite((-100));
        examples.Composite composite11 = new examples.Composite((-3));
        composite9.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite9.children();
        examples.Composite composite15 = new examples.Composite((int) (byte) 10);
        composite9.addChild(composite15);
        examples.Composite composite18 = new examples.Composite((-6));
        composite9.addChild(composite18);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet13);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
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
        java.lang.Class<?> wildcardClass15 = compositeSet14.getClass();
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
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
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
        examples.Composite composite20 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        examples.Composite composite23 = new examples.Composite(8);
        composite20.addChild(composite23);
        java.util.Set<examples.Composite> compositeSet25 = composite23.children();
        java.util.Set<examples.Composite> compositeSet26 = composite23.children();
        java.util.Set<examples.Composite> compositeSet27 = composite23.children();
        // The following exception was thrown during execution in test generation
        try {
            composite14.addChild(composite23);
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
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        examples.Composite composite1 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        examples.Composite composite11 = new examples.Composite(8);
        composite8.addChild(composite11);
        examples.Composite composite14 = new examples.Composite((int) (short) 0);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        composite11.addChild(composite14);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet15);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
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
        examples.Composite composite16 = new examples.Composite((int) '4');
        examples.Composite composite18 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        composite16.addChild(composite18);
        examples.Composite composite23 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        composite16.addChild(composite23);
        examples.Composite composite27 = new examples.Composite(8);
        composite23.addChild(composite27);
        // The following exception was thrown during execution in test generation
        try {
            composite6.addChild(composite23);
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
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
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
        examples.Composite composite18 = new examples.Composite((-100));
        examples.Composite composite20 = new examples.Composite((-10));
        composite18.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet22 = composite18.children();
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
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        examples.Composite composite1 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-100));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite composite10 = new examples.Composite((-6));
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
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        examples.Composite composite1 = new examples.Composite(100);
        examples.Composite composite3 = new examples.Composite((int) (short) -1);
        examples.Composite composite5 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        composite3.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        java.util.Set<examples.Composite> compositeSet9 = composite3.children();
        java.util.Set<examples.Composite> compositeSet10 = composite3.children();
        java.util.Set<examples.Composite> compositeSet11 = composite3.children();
        java.util.Set<examples.Composite> compositeSet12 = composite3.children();
        java.util.Set<examples.Composite> compositeSet13 = composite3.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite((-3));
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
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        examples.Composite composite1 = new examples.Composite((int) (short) 0);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        examples.Composite composite6 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite4.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet10 = composite6.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
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
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        examples.Composite composite16 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        composite13.addChild(composite16);
        examples.Composite composite20 = new examples.Composite((-2));
        composite13.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet22 = composite13.children();
        examples.Composite composite24 = new examples.Composite(6);
        composite13.addChild(composite24);
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
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
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
        java.util.Set<examples.Composite> compositeSet13 = composite1.children();
        java.lang.Class<?> wildcardClass14 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        java.util.Set<examples.Composite> compositeSet9 = composite3.children();
        java.util.Set<examples.Composite> compositeSet10 = composite3.children();
        java.lang.Class<?> wildcardClass11 = compositeSet10.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
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
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet23);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        examples.Composite composite1 = new examples.Composite((-8));
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
        java.util.Set<examples.Composite> compositeSet15 = composite3.children();
        java.util.Set<examples.Composite> compositeSet16 = composite3.children();
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
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
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
        java.lang.Class<?> wildcardClass16 = composite9.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        examples.Composite composite1 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.lang.Class<?> wildcardClass7 = compositeSet6.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
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
        java.util.Set<examples.Composite> compositeSet26 = composite23.children();
        examples.Composite composite28 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        composite23.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet31 = composite23.children();
        java.util.Set<examples.Composite> compositeSet32 = composite23.children();
        java.util.Set<examples.Composite> compositeSet33 = composite23.children();
        // The following exception was thrown during execution in test generation
        try {
            composite6.addChild(composite23);
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
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet33);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        examples.Composite composite1 = new examples.Composite((-5));
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        examples.Composite composite8 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite1.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        java.util.Set<examples.Composite> compositeSet12 = composite8.children();
        examples.Composite composite14 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        examples.Composite composite17 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        composite14.addChild(composite17);
        examples.Composite composite22 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        composite14.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
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
        examples.Composite composite14 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        examples.Composite composite19 = new examples.Composite(3);
        composite14.addChild(composite19);
        examples.Composite composite22 = new examples.Composite(5);
        composite19.addChild(composite22);
        examples.Composite composite25 = new examples.Composite((-1));
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        composite22.addChild(composite25);
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
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        java.util.Set<examples.Composite> compositeSet16 = composite12.children();
        java.util.Set<examples.Composite> compositeSet17 = composite12.children();
        composite1.addChild(composite12);
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
        examples.Composite composite38 = new examples.Composite((-100));
        composite34.addChild(composite38);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite34);
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
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet35);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
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
        examples.Composite composite16 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        examples.Composite composite19 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        composite16.addChild(composite19);
        examples.Composite composite23 = new examples.Composite((-3));
        composite19.addChild(composite23);
        examples.Composite composite26 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        java.util.Set<examples.Composite> compositeSet28 = composite26.children();
        composite19.addChild(composite26);
        java.util.Set<examples.Composite> compositeSet30 = composite19.children();
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
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet30);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(9);
        examples.Composite composite6 = new examples.Composite((int) (short) 10);
        composite4.addChild(composite6);
        examples.Composite composite9 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        composite4.addChild(composite9);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        examples.Composite composite1 = new examples.Composite((int) (byte) 100);
        examples.Composite composite3 = new examples.Composite((-100));
        examples.Composite composite5 = new examples.Composite((-3));
        composite3.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        java.util.Set<examples.Composite> compositeSet8 = composite5.children();
        examples.Composite composite10 = new examples.Composite((-9));
        composite5.addChild(composite10);
        examples.Composite composite13 = new examples.Composite((int) (short) 1);
        composite10.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        examples.Composite composite17 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        java.util.Set<examples.Composite> compositeSet20 = composite17.children();
        java.util.Set<examples.Composite> compositeSet21 = composite17.children();
        composite13.addChild(composite17);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        examples.Composite composite1 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        examples.Composite composite7 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        examples.Composite composite10 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        composite7.addChild(composite10);
        examples.Composite composite14 = new examples.Composite((-3));
        composite10.addChild(composite14);
        examples.Composite composite17 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        composite10.addChild(composite17);
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
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        examples.Composite composite1 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(10);
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        examples.Composite composite8 = new examples.Composite((-100));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
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
        org.junit.Assert.assertNotNull(compositeSet13);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        examples.Composite composite1 = new examples.Composite(3);
        examples.Composite composite3 = new examples.Composite((-2));
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
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
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
        java.util.Set<examples.Composite> compositeSet14 = composite3.children();
        java.lang.Class<?> wildcardClass15 = composite3.getClass();
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
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        examples.Composite composite9 = new examples.Composite(3);
        composite4.addChild(composite9);
        examples.Composite composite12 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        composite4.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet17 = composite4.children();
        java.util.Set<examples.Composite> compositeSet18 = composite4.children();
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
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-2));
        composite1.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        java.util.Set<examples.Composite> compositeSet12 = composite8.children();
        java.lang.Class<?> wildcardClass13 = compositeSet12.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
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
        java.util.Set<examples.Composite> compositeSet12 = composite4.children();
        java.util.Set<examples.Composite> compositeSet13 = composite4.children();
        java.lang.Class<?> wildcardClass14 = compositeSet13.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
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
        java.lang.Class<?> wildcardClass24 = composite20.getClass();
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
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
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
        examples.Composite composite19 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        examples.Composite composite22 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        composite19.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet25 = composite19.children();
        java.util.Set<examples.Composite> compositeSet26 = composite19.children();
        java.util.Set<examples.Composite> compositeSet27 = composite19.children();
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite19);
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
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        examples.Composite composite1 = new examples.Composite(3);
        examples.Composite composite3 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite10 = new examples.Composite(100);
        composite1.addChild(composite10);
        examples.Composite composite13 = new examples.Composite((int) '4');
        examples.Composite composite15 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        composite13.addChild(composite15);
        examples.Composite composite20 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        composite13.addChild(composite20);
        examples.Composite composite24 = new examples.Composite(8);
        composite20.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite24);
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
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        examples.Composite composite1 = new examples.Composite(8);
        examples.Composite composite3 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        examples.Composite composite9 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        examples.Composite composite12 = new examples.Composite(10);
        composite9.addChild(composite12);
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
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        examples.Composite composite1 = new examples.Composite(9);
        examples.Composite composite3 = new examples.Composite((int) (short) 10);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet10 = composite6.children();
        java.lang.Class<?> wildcardClass11 = composite6.getClass();
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(1);
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
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
        org.junit.Assert.assertNotNull(compositeSet8);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
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
        java.lang.Class<?> wildcardClass19 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
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
        java.util.Set<examples.Composite> compositeSet15 = composite1.children();
        examples.Composite composite17 = new examples.Composite((-100));
        examples.Composite composite19 = new examples.Composite((-3));
        composite17.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite17.children();
        examples.Composite composite23 = new examples.Composite((int) (byte) 10);
        composite17.addChild(composite23);
        java.util.Set<examples.Composite> compositeSet25 = composite23.children();
        java.util.Set<examples.Composite> compositeSet26 = composite23.children();
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
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite10 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        composite1.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet14 = composite10.children();
        java.lang.Class<?> wildcardClass15 = composite10.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        examples.Composite composite1 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((-5));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        examples.Composite composite10 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        composite6.addChild(composite10);
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
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
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
        java.lang.Class<?> wildcardClass13 = compositeSet12.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        examples.Composite composite1 = new examples.Composite((int) (byte) -1);
        examples.Composite composite3 = new examples.Composite((-100));
        examples.Composite composite5 = new examples.Composite((-3));
        composite3.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        java.util.Set<examples.Composite> compositeSet8 = composite5.children();
        examples.Composite composite10 = new examples.Composite((-9));
        composite5.addChild(composite10);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        examples.Composite composite1 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((int) '4');
        examples.Composite composite10 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        composite8.addChild(composite10);
        examples.Composite composite15 = new examples.Composite((int) (byte) 100);
        composite8.addChild(composite15);
        examples.Composite composite18 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        composite15.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet21 = composite15.children();
        java.util.Set<examples.Composite> compositeSet22 = composite15.children();
        java.util.Set<examples.Composite> compositeSet23 = composite15.children();
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
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
        java.util.Set<examples.Composite> compositeSet14 = composite6.children();
        examples.Composite composite16 = new examples.Composite((int) '4');
        examples.Composite composite18 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        composite16.addChild(composite18);
        examples.Composite composite23 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        composite16.addChild(composite23);
        examples.Composite composite27 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet28 = composite27.children();
        composite23.addChild(composite27);
        examples.Composite composite31 = new examples.Composite((-4));
        composite23.addChild(composite31);
        java.util.Set<examples.Composite> compositeSet33 = composite23.children();
        // The following exception was thrown during execution in test generation
        try {
            composite6.addChild(composite23);
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
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet33);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
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
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        java.util.Set<examples.Composite> compositeSet20 = composite16.children();
        java.lang.Class<?> wildcardClass21 = composite16.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
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
        examples.Composite composite28 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        composite25.addChild(composite28);
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
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet29);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
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
        examples.Composite composite19 = new examples.Composite(9);
        examples.Composite composite21 = new examples.Composite((int) (short) 10);
        composite19.addChild(composite21);
        examples.Composite composite24 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        java.util.Set<examples.Composite> compositeSet27 = composite24.children();
        composite19.addChild(composite24);
        // The following exception was thrown during execution in test generation
        try {
            composite16.addChild(composite24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
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
        java.util.Set<examples.Composite> compositeSet13 = composite1.children();
        examples.Composite composite15 = new examples.Composite((-100));
        examples.Composite composite17 = new examples.Composite((-3));
        composite15.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet19 = composite15.children();
        examples.Composite composite21 = new examples.Composite((int) (byte) 10);
        composite15.addChild(composite21);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite21);
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
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
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
        examples.Composite composite15 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        composite1.addChild(composite15);
        java.lang.Class<?> wildcardClass18 = composite15.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        examples.Composite composite10 = new examples.Composite((-100));
        examples.Composite composite12 = new examples.Composite((-3));
        composite10.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        examples.Composite composite16 = new examples.Composite((-9));
        composite12.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        java.util.Set<examples.Composite> compositeSet20 = composite16.children();
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
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
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
        java.lang.Class<?> wildcardClass18 = composite14.getClass();
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        examples.Composite composite7 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        composite4.addChild(composite7);
        examples.Composite composite11 = null;
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
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
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
        java.lang.Class<?> wildcardClass13 = composite6.getClass();
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        examples.Composite composite1 = new examples.Composite((-5));
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite7 = new examples.Composite(2);
        composite1.addChild(composite7);
        examples.Composite composite10 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        examples.Composite composite13 = new examples.Composite(8);
        composite10.addChild(composite13);
        examples.Composite composite16 = new examples.Composite((int) (short) 0);
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        composite13.addChild(composite16);
        examples.Composite composite20 = new examples.Composite(7);
        composite16.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet22 = composite16.children();
        java.util.Set<examples.Composite> compositeSet23 = composite16.children();
        // The following exception was thrown during execution in test generation
        try {
            composite7.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
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
        java.util.Set<examples.Composite> compositeSet16 = composite11.children();
        java.util.Set<examples.Composite> compositeSet17 = composite11.children();
        examples.Composite composite19 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        examples.Composite composite22 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        composite19.addChild(composite22);
        examples.Composite composite26 = new examples.Composite((-2));
        composite19.addChild(composite26);
        java.util.Set<examples.Composite> compositeSet28 = composite26.children();
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
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        examples.Composite composite1 = new examples.Composite(9);
        examples.Composite composite3 = new examples.Composite((int) (short) 10);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite11 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        examples.Composite composite15 = new examples.Composite(4);
        composite11.addChild(composite15);
        examples.Composite composite18 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        java.util.Set<examples.Composite> compositeSet21 = composite18.children();
        composite11.addChild(composite18);
        // The following exception was thrown during execution in test generation
        try {
            composite6.addChild(composite18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        examples.Composite composite1 = new examples.Composite((-2));
        examples.Composite composite3 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite9 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite9.addChild(composite12);
        examples.Composite composite16 = new examples.Composite((-3));
        composite12.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        examples.Composite composite20 = new examples.Composite((int) '#');
        composite16.addChild(composite20);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
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
        java.util.Set<examples.Composite> compositeSet19 = composite13.children();
        java.lang.Class<?> wildcardClass20 = compositeSet19.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite9 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        examples.Composite composite1 = new examples.Composite((int) (short) 1);
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
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        examples.Composite composite1 = new examples.Composite((-1));
        examples.Composite composite3 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite7 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        composite3.addChild(composite7);
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
            composite7.addChild(composite17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
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
        java.lang.Class<?> wildcardClass16 = composite9.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
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
        examples.Composite composite23 = new examples.Composite((-9));
        composite18.addChild(composite23);
        java.util.Set<examples.Composite> compositeSet25 = composite23.children();
        examples.Composite composite27 = new examples.Composite((int) '4');
        composite23.addChild(composite27);
        examples.Composite composite30 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet31 = composite30.children();
        java.util.Set<examples.Composite> compositeSet32 = composite30.children();
        composite27.addChild(composite30);
        examples.Composite composite35 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet36 = composite35.children();
        composite27.addChild(composite35);
        java.util.Set<examples.Composite> compositeSet38 = composite27.children();
        java.util.Set<examples.Composite> compositeSet39 = composite27.children();
        java.util.Set<examples.Composite> compositeSet40 = composite27.children();
        java.util.Set<examples.Composite> compositeSet41 = composite27.children();
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite27);
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
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet36);
        org.junit.Assert.assertNotNull(compositeSet38);
        org.junit.Assert.assertNotNull(compositeSet39);
        org.junit.Assert.assertNotNull(compositeSet40);
        org.junit.Assert.assertNotNull(compositeSet41);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
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
        java.util.Set<examples.Composite> compositeSet29 = composite26.children();
        examples.Composite composite31 = new examples.Composite((-9));
        composite26.addChild(composite31);
        java.util.Set<examples.Composite> compositeSet33 = composite31.children();
        examples.Composite composite35 = new examples.Composite((int) '4');
        composite31.addChild(composite35);
        java.util.Set<examples.Composite> compositeSet37 = composite31.children();
        java.util.Set<examples.Composite> compositeSet38 = composite31.children();
        examples.Composite composite40 = new examples.Composite((-10));
        java.util.Set<examples.Composite> compositeSet41 = composite40.children();
        java.util.Set<examples.Composite> compositeSet42 = composite40.children();
        composite31.addChild(composite40);
        // The following exception was thrown during execution in test generation
        try {
            composite20.addChild(composite31);
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
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet37);
        org.junit.Assert.assertNotNull(compositeSet38);
        org.junit.Assert.assertNotNull(compositeSet41);
        org.junit.Assert.assertNotNull(compositeSet42);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        examples.Composite composite1 = new examples.Composite(9);
        examples.Composite composite3 = new examples.Composite((int) (short) 10);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        examples.Composite composite17 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        composite12.addChild(composite17);
        examples.Composite composite22 = new examples.Composite((-8));
        composite12.addChild(composite22);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite12);
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
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
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
        examples.Composite composite21 = new examples.Composite((-9));
        composite17.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        java.util.Set<examples.Composite> compositeSet24 = composite21.children();
        examples.Composite composite26 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        composite21.addChild(composite26);
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
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet27);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        examples.Composite composite1 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.lang.Class<?> wildcardClass4 = compositeSet3.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
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
        examples.Composite composite22 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        examples.Composite composite25 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        java.util.Set<examples.Composite> compositeSet27 = composite25.children();
        composite22.addChild(composite25);
        java.util.Set<examples.Composite> compositeSet29 = composite25.children();
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
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet29);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite(2);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite3.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet10 = composite3.children();
        examples.Composite composite12 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        examples.Composite composite15 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        composite12.addChild(composite15);
        examples.Composite composite19 = new examples.Composite((-3));
        composite15.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        java.util.Set<examples.Composite> compositeSet22 = composite19.children();
        examples.Composite composite24 = new examples.Composite((int) 'a');
        composite19.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        examples.Composite composite28 = new examples.Composite((int) (short) -1);
        composite24.addChild(composite28);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
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
        java.lang.Class<?> wildcardClass14 = compositeSet13.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        examples.Composite composite1 = new examples.Composite(8);
        examples.Composite composite3 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.lang.Class<?> wildcardClass7 = composite3.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
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
        examples.Composite composite18 = new examples.Composite(5);
        examples.Composite composite20 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        composite18.addChild(composite20);
        examples.Composite composite25 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        composite18.addChild(composite25);
        java.util.Set<examples.Composite> compositeSet28 = composite25.children();
        java.util.Set<examples.Composite> compositeSet29 = composite25.children();
        // The following exception was thrown during execution in test generation
        try {
            composite7.addChild(composite25);
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
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
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
        examples.Composite composite26 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        java.util.Set<examples.Composite> compositeSet28 = composite26.children();
        composite24.addChild(composite26);
        examples.Composite composite31 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet32 = composite31.children();
        composite24.addChild(composite31);
        examples.Composite composite35 = new examples.Composite((int) '4');
        composite31.addChild(composite35);
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
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet32);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
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
        examples.Composite composite15 = new examples.Composite((int) '4');
        examples.Composite composite17 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        composite15.addChild(composite17);
        examples.Composite composite22 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        composite15.addChild(composite22);
        examples.Composite composite26 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        composite22.addChild(composite26);
        examples.Composite composite30 = new examples.Composite((-4));
        composite22.addChild(composite30);
        examples.Composite composite33 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet34 = composite33.children();
        composite30.addChild(composite33);
        java.util.Set<examples.Composite> compositeSet36 = composite30.children();
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet36);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
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
        examples.Composite composite14 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        examples.Composite composite17 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        composite14.addChild(composite17);
        examples.Composite composite21 = new examples.Composite((-3));
        composite17.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        java.util.Set<examples.Composite> compositeSet24 = composite21.children();
        examples.Composite composite26 = new examples.Composite((int) (byte) 1);
        composite21.addChild(composite26);
        java.util.Set<examples.Composite> compositeSet28 = composite26.children();
        java.util.Set<examples.Composite> compositeSet29 = composite26.children();
        // The following exception was thrown during execution in test generation
        try {
            composite7.addChild(composite26);
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
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite(2);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite3.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet10 = composite3.children();
        examples.Composite composite12 = new examples.Composite((int) '4');
        examples.Composite composite14 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        composite12.addChild(composite14);
        examples.Composite composite19 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        composite12.addChild(composite19);
        examples.Composite composite23 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        composite19.addChild(composite23);
        examples.Composite composite27 = new examples.Composite((-4));
        composite19.addChild(composite27);
        java.util.Set<examples.Composite> compositeSet29 = composite27.children();
        java.util.Set<examples.Composite> compositeSet30 = composite27.children();
        java.util.Set<examples.Composite> compositeSet31 = composite27.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet31);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
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
        java.lang.Class<?> wildcardClass18 = composite11.getClass();
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
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        examples.Composite composite1 = new examples.Composite((-1));
        examples.Composite composite3 = new examples.Composite((int) (short) 100);
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
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
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
        java.lang.Class<?> wildcardClass20 = composite15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
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
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        examples.Composite composite21 = new examples.Composite((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        examples.Composite composite7 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        composite4.addChild(composite7);
        examples.Composite composite11 = new examples.Composite((-2));
        composite4.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        examples.Composite composite15 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        composite11.addChild(composite15);
        examples.Composite composite19 = new examples.Composite((-2));
        composite11.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet21 = composite11.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
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
        java.lang.Class<?> wildcardClass13 = composite1.getClass();
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
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        examples.Composite composite1 = new examples.Composite((-1));
        examples.Composite composite3 = new examples.Composite(100);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-6));
        composite3.addChild(composite7);
        examples.Composite composite10 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        examples.Composite composite13 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        composite10.addChild(composite13);
        examples.Composite composite18 = new examples.Composite((int) (short) 1);
        composite13.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        examples.Composite composite22 = new examples.Composite((-1));
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        composite18.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet25 = composite18.children();
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
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
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
        java.lang.Class<?> wildcardClass20 = compositeSet19.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
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
        examples.Composite composite20 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        examples.Composite composite23 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        java.util.Set<examples.Composite> compositeSet25 = composite23.children();
        composite20.addChild(composite23);
        java.util.Set<examples.Composite> compositeSet27 = composite20.children();
        examples.Composite composite29 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet30 = composite29.children();
        composite20.addChild(composite29);
        java.util.Set<examples.Composite> compositeSet32 = composite20.children();
        java.util.Set<examples.Composite> compositeSet33 = composite20.children();
        // The following exception was thrown during execution in test generation
        try {
            composite13.addChild(composite20);
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
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet33);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
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
        examples.Composite composite21 = new examples.Composite((-3));
        composite19.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        java.util.Set<examples.Composite> compositeSet24 = composite21.children();
        examples.Composite composite26 = new examples.Composite(4);
        composite21.addChild(composite26);
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-5));
        examples.Composite composite7 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        composite5.addChild(composite7);
        examples.Composite composite11 = new examples.Composite(2);
        composite5.addChild(composite11);
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
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        examples.Composite composite1 = new examples.Composite(5);
        examples.Composite composite3 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite1.addChild(composite8);
        examples.Composite composite12 = new examples.Composite(0);
        examples.Composite composite14 = new examples.Composite((int) (short) 1);
        composite12.addChild(composite14);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
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
        java.util.Set<examples.Composite> compositeSet18 = composite8.children();
        java.lang.Class<?> wildcardClass19 = compositeSet18.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
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
        java.util.Set<examples.Composite> compositeSet16 = composite13.children();
        examples.Composite composite18 = new examples.Composite((-100));
        examples.Composite composite20 = new examples.Composite((-3));
        composite18.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        java.util.Set<examples.Composite> compositeSet23 = composite20.children();
        examples.Composite composite25 = new examples.Composite((-9));
        composite20.addChild(composite25);
        java.util.Set<examples.Composite> compositeSet27 = composite25.children();
        examples.Composite composite29 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet30 = composite29.children();
        java.util.Set<examples.Composite> compositeSet31 = composite29.children();
        composite25.addChild(composite29);
        java.util.Set<examples.Composite> compositeSet33 = composite29.children();
        // The following exception was thrown during execution in test generation
        try {
            composite13.addChild(composite29);
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
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet33);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        examples.Composite composite1 = new examples.Composite(3);
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
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
        java.util.Set<examples.Composite> compositeSet29 = composite19.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
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
        java.lang.Class<?> wildcardClass16 = compositeSet15.getClass();
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
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
        java.lang.Class<?> wildcardClass13 = composite8.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        examples.Composite composite1 = new examples.Composite(0);
        examples.Composite composite3 = new examples.Composite((int) (short) 1);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite(7);
        composite3.addChild(composite7);
        examples.Composite composite10 = new examples.Composite((-5));
        examples.Composite composite12 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite10.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet15 = composite10.children();
        examples.Composite composite17 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        composite10.addChild(composite17);
        // The following exception was thrown during execution in test generation
        try {
            composite7.addChild(composite17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        examples.Composite composite1 = new examples.Composite((int) (short) 100);
        examples.Composite composite3 = new examples.Composite((int) (short) 0);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        examples.Composite composite8 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        examples.Composite composite11 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite8.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet14 = composite8.children();
        examples.Composite composite16 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        composite8.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet19 = composite8.children();
        java.util.Set<examples.Composite> compositeSet20 = composite8.children();
        examples.Composite composite22 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        composite8.addChild(composite22);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet23);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        examples.Composite composite1 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite(4);
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.lang.Class<?> wildcardClass8 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
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
        java.util.Set<examples.Composite> compositeSet19 = composite8.children();
        java.util.Set<examples.Composite> compositeSet20 = composite8.children();
        examples.Composite composite22 = new examples.Composite((-1));
        examples.Composite composite24 = new examples.Composite(100);
        composite22.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        examples.Composite composite28 = new examples.Composite((-6));
        composite24.addChild(composite28);
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite24);
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
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
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
        examples.Composite composite17 = new examples.Composite((int) (byte) 1);
        examples.Composite composite19 = new examples.Composite(2);
        composite17.addChild(composite19);
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
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        examples.Composite composite1 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite(0);
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.lang.Class<?> wildcardClass9 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
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
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        java.util.Set<examples.Composite> compositeSet21 = composite18.children();
        java.util.Set<examples.Composite> compositeSet22 = composite18.children();
        java.util.Set<examples.Composite> compositeSet23 = composite18.children();
        java.util.Set<examples.Composite> compositeSet24 = composite18.children();
        java.util.Set<examples.Composite> compositeSet25 = composite18.children();
        java.util.Set<examples.Composite> compositeSet26 = composite18.children();
        examples.Composite composite28 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        composite18.addChild(composite28);
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet29);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
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
        java.lang.Class<?> wildcardClass14 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
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
        examples.Composite composite26 = new examples.Composite((-100));
        examples.Composite composite28 = new examples.Composite((-3));
        composite26.addChild(composite28);
        java.util.Set<examples.Composite> compositeSet30 = composite28.children();
        java.util.Set<examples.Composite> compositeSet31 = composite28.children();
        examples.Composite composite33 = new examples.Composite((-9));
        composite28.addChild(composite33);
        java.util.Set<examples.Composite> compositeSet35 = composite33.children();
        java.util.Set<examples.Composite> compositeSet36 = composite33.children();
        examples.Composite composite38 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet39 = composite38.children();
        composite33.addChild(composite38);
        examples.Composite composite42 = new examples.Composite(4);
        composite38.addChild(composite42);
        java.util.Set<examples.Composite> compositeSet44 = composite38.children();
        // The following exception was thrown during execution in test generation
        try {
            composite19.addChild(composite38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet35);
        org.junit.Assert.assertNotNull(compositeSet36);
        org.junit.Assert.assertNotNull(compositeSet39);
        org.junit.Assert.assertNotNull(compositeSet44);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
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
        java.util.Set<examples.Composite> compositeSet23 = composite15.children();
        java.lang.Class<?> wildcardClass24 = compositeSet23.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
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
        examples.Composite composite19 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite15.addChild(composite19);
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
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        examples.Composite composite1 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-100));
        examples.Composite composite6 = new examples.Composite((-3));
        composite4.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        examples.Composite composite10 = new examples.Composite((-9));
        composite6.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite6.children();
        java.util.Set<examples.Composite> compositeSet13 = composite6.children();
        java.util.Set<examples.Composite> compositeSet14 = composite6.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite10 = null;
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
        org.junit.Assert.assertNotNull(compositeSet8);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
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
        java.util.Set<examples.Composite> compositeSet26 = composite17.children();
        java.lang.Class<?> wildcardClass27 = compositeSet26.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
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
        java.lang.Class<?> wildcardClass12 = composite9.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        examples.Composite composite6 = new examples.Composite(8);
        composite3.addChild(composite6);
        examples.Composite composite9 = new examples.Composite((int) (short) 0);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite6.addChild(composite9);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet10);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        examples.Composite composite7 = new examples.Composite((int) (short) 100);
        examples.Composite composite9 = new examples.Composite((int) (short) 0);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite7.addChild(composite9);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
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
        examples.Composite composite25 = new examples.Composite((-100));
        examples.Composite composite27 = new examples.Composite((-3));
        composite25.addChild(composite27);
        examples.Composite composite30 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet31 = composite30.children();
        java.util.Set<examples.Composite> compositeSet32 = composite30.children();
        java.util.Set<examples.Composite> compositeSet33 = composite30.children();
        composite25.addChild(composite30);
        java.util.Set<examples.Composite> compositeSet35 = composite25.children();
        java.util.Set<examples.Composite> compositeSet36 = composite25.children();
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
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet35);
        org.junit.Assert.assertNotNull(compositeSet36);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        java.lang.Class<?> wildcardClass10 = compositeSet9.getClass();
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
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        examples.Composite composite1 = new examples.Composite(8);
        examples.Composite composite3 = new examples.Composite((-100));
        examples.Composite composite5 = new examples.Composite((-3));
        composite3.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        examples.Composite composite9 = new examples.Composite((int) (byte) 10);
        composite3.addChild(composite9);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        examples.Composite composite1 = new examples.Composite(2);
        examples.Composite composite3 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        examples.Composite composite9 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite3.addChild(composite9);
        examples.Composite composite13 = new examples.Composite((int) (short) 10);
        examples.Composite composite15 = new examples.Composite((int) (short) 1);
        composite13.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
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
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet17);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite((-7));
        composite1.addChild(composite9);
        examples.Composite composite12 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        examples.Composite composite15 = new examples.Composite(8);
        composite12.addChild(composite15);
        examples.Composite composite18 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        composite15.addChild(composite18);
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
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
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
        java.lang.Class<?> wildcardClass14 = composite9.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        examples.Composite composite1 = new examples.Composite((-1));
        examples.Composite composite3 = new examples.Composite(9);
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
        examples.Composite composite21 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        composite18.addChild(composite21);
        examples.Composite composite26 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        composite18.addChild(composite26);
        examples.Composite composite30 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet31 = composite30.children();
        java.util.Set<examples.Composite> compositeSet32 = composite30.children();
        composite18.addChild(composite30);
        java.util.Set<examples.Composite> compositeSet34 = composite30.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet34);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        examples.Composite composite1 = new examples.Composite((-2));
        examples.Composite composite3 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        java.lang.Class<?> wildcardClass9 = composite3.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
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
        examples.Composite composite26 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        java.util.Set<examples.Composite> compositeSet28 = composite26.children();
        java.util.Set<examples.Composite> compositeSet29 = composite26.children();
        examples.Composite composite31 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet32 = composite31.children();
        composite26.addChild(composite31);
        examples.Composite composite35 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet36 = composite35.children();
        composite31.addChild(composite35);
        java.util.Set<examples.Composite> compositeSet38 = composite35.children();
        java.util.Set<examples.Composite> compositeSet39 = composite35.children();
        // The following exception was thrown during execution in test generation
        try {
            composite19.addChild(composite35);
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
        org.junit.Assert.assertNotNull(compositeSet36);
        org.junit.Assert.assertNotNull(compositeSet38);
        org.junit.Assert.assertNotNull(compositeSet39);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
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
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        examples.Composite composite22 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        examples.Composite composite25 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        java.util.Set<examples.Composite> compositeSet27 = composite25.children();
        composite22.addChild(composite25);
        java.util.Set<examples.Composite> compositeSet29 = composite25.children();
        examples.Composite composite31 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet32 = composite31.children();
        composite25.addChild(composite31);
        java.util.Set<examples.Composite> compositeSet34 = composite31.children();
        java.util.Set<examples.Composite> compositeSet35 = composite31.children();
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
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet35);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        examples.Composite composite1 = new examples.Composite((int) '#');
        examples.Composite composite3 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-10));
        composite3.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
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
        examples.Composite composite29 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet30 = composite29.children();
        examples.Composite composite32 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet33 = composite32.children();
        composite29.addChild(composite32);
        examples.Composite composite36 = new examples.Composite((-3));
        composite32.addChild(composite36);
        java.util.Set<examples.Composite> compositeSet38 = composite36.children();
        java.util.Set<examples.Composite> compositeSet39 = composite36.children();
        examples.Composite composite41 = new examples.Composite((int) (byte) 1);
        composite36.addChild(composite41);
        java.util.Set<examples.Composite> compositeSet43 = composite41.children();
        java.util.Set<examples.Composite> compositeSet44 = composite41.children();
        // The following exception was thrown during execution in test generation
        try {
            composite12.addChild(composite41);
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
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet38);
        org.junit.Assert.assertNotNull(compositeSet39);
        org.junit.Assert.assertNotNull(compositeSet43);
        org.junit.Assert.assertNotNull(compositeSet44);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
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
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        examples.Composite composite19 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        composite14.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet22 = composite14.children();
        java.util.Set<examples.Composite> compositeSet23 = composite14.children();
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
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
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
        examples.Composite composite19 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        examples.Composite composite22 = new examples.Composite(8);
        composite19.addChild(composite22);
        examples.Composite composite25 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        java.util.Set<examples.Composite> compositeSet27 = composite25.children();
        composite22.addChild(composite25);
        java.util.Set<examples.Composite> compositeSet29 = composite22.children();
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
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet29);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        examples.Composite composite1 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((int) (short) 0);
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
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
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
        java.lang.Class<?> wildcardClass18 = compositeSet17.getClass();
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        examples.Composite composite7 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        composite4.addChild(composite7);
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
        examples.Composite composite26 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        java.util.Set<examples.Composite> compositeSet28 = composite26.children();
        composite12.addChild(composite26);
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
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
        java.util.Set<examples.Composite> compositeSet13 = composite8.children();
        java.lang.Class<?> wildcardClass14 = compositeSet13.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
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
        examples.Composite composite33 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet34 = composite33.children();
        java.util.Set<examples.Composite> compositeSet35 = composite33.children();
        java.util.Set<examples.Composite> compositeSet36 = composite33.children();
        java.util.Set<examples.Composite> compositeSet37 = composite33.children();
        composite24.addChild(composite33);
        // The following exception was thrown during execution in test generation
        try {
            composite10.addChild(composite33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet35);
        org.junit.Assert.assertNotNull(compositeSet36);
        org.junit.Assert.assertNotNull(compositeSet37);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        examples.Composite composite7 = new examples.Composite((int) (short) 0);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        composite4.addChild(composite7);
        examples.Composite composite11 = new examples.Composite(7);
        composite7.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite7.children();
        java.util.Set<examples.Composite> compositeSet14 = composite7.children();
        examples.Composite composite16 = new examples.Composite((-9));
        examples.Composite composite18 = new examples.Composite((int) (byte) 1);
        composite16.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        java.util.Set<examples.Composite> compositeSet21 = composite18.children();
        // The following exception was thrown during execution in test generation
        try {
            composite7.addChild(composite18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        examples.Composite composite1 = new examples.Composite((int) (byte) 0);
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
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite9 = new examples.Composite((int) (short) 1);
        composite4.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        java.util.Set<examples.Composite> compositeSet13 = composite9.children();
        java.lang.Class<?> wildcardClass14 = composite9.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
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
        java.lang.Class<?> wildcardClass13 = compositeSet12.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        examples.Composite composite1 = new examples.Composite(5);
        examples.Composite composite3 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite(6);
        composite1.addChild(composite8);
        examples.Composite composite11 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        examples.Composite composite14 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        composite11.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet18 = composite11.children();
        examples.Composite composite20 = new examples.Composite(4);
        composite11.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet22 = composite11.children();
        examples.Composite composite24 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        composite11.addChild(composite24);
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        java.util.Set<examples.Composite> compositeSet9 = composite4.children();
        java.util.Set<examples.Composite> compositeSet10 = composite4.children();
        java.lang.Class<?> wildcardClass11 = composite4.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
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
        java.util.Set<examples.Composite> compositeSet30 = composite23.children();
        examples.Composite composite32 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet33 = composite32.children();
        java.util.Set<examples.Composite> compositeSet34 = composite32.children();
        composite23.addChild(composite32);
        java.util.Set<examples.Composite> compositeSet36 = composite32.children();
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
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet36);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
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
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
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
        examples.Composite composite16 = new examples.Composite((-100));
        examples.Composite composite18 = new examples.Composite((-3));
        composite16.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        java.util.Set<examples.Composite> compositeSet21 = composite18.children();
        java.util.Set<examples.Composite> compositeSet22 = composite18.children();
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
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        examples.Composite composite1 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
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
        java.util.Set<examples.Composite> compositeSet19 = composite6.children();
        examples.Composite composite21 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        composite6.addChild(composite21);
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
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
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
        java.util.Set<examples.Composite> compositeSet15 = composite11.children();
        java.util.Set<examples.Composite> compositeSet16 = composite11.children();
        examples.Composite composite18 = new examples.Composite((-5));
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        examples.Composite composite22 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        composite18.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet27 = composite18.children();
        java.util.Set<examples.Composite> compositeSet28 = composite18.children();
        java.util.Set<examples.Composite> compositeSet29 = composite18.children();
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
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
        examples.Composite composite17 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        examples.Composite composite21 = new examples.Composite((-6));
        composite17.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        java.util.Set<examples.Composite> compositeSet24 = composite21.children();
        java.util.Set<examples.Composite> compositeSet25 = composite21.children();
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
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((int) (byte) 100);
        composite1.addChild(composite8);
        java.lang.Class<?> wildcardClass10 = composite8.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        examples.Composite composite1 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        examples.Composite composite14 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        composite9.addChild(composite14);
        examples.Composite composite18 = new examples.Composite(10);
        composite14.addChild(composite18);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite14);
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
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        examples.Composite composite1 = new examples.Composite((int) (short) 100);
        examples.Composite composite3 = new examples.Composite((int) (short) 0);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
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
            composite3.addChild(composite17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
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
        examples.Composite composite26 = new examples.Composite((int) '4');
        examples.Composite composite28 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        java.util.Set<examples.Composite> compositeSet30 = composite28.children();
        composite26.addChild(composite28);
        examples.Composite composite33 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet34 = composite33.children();
        composite26.addChild(composite33);
        examples.Composite composite37 = new examples.Composite((int) '4');
        composite33.addChild(composite37);
        examples.Composite composite40 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet41 = composite40.children();
        java.util.Set<examples.Composite> compositeSet42 = composite40.children();
        java.util.Set<examples.Composite> compositeSet43 = composite40.children();
        java.util.Set<examples.Composite> compositeSet44 = composite40.children();
        composite37.addChild(composite40);
        // The following exception was thrown during execution in test generation
        try {
            composite20.addChild(composite37);
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
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet41);
        org.junit.Assert.assertNotNull(compositeSet42);
        org.junit.Assert.assertNotNull(compositeSet43);
        org.junit.Assert.assertNotNull(compositeSet44);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
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
        java.lang.Class<?> wildcardClass15 = compositeSet14.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        examples.Composite composite1 = new examples.Composite(9);
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        examples.Composite composite6 = new examples.Composite(8);
        composite3.addChild(composite6);
        examples.Composite composite9 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite6.addChild(composite9);
        examples.Composite composite13 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        java.util.Set<examples.Composite> compositeSet16 = composite13.children();
        java.util.Set<examples.Composite> compositeSet17 = composite13.children();
        java.util.Set<examples.Composite> compositeSet18 = composite13.children();
        composite9.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet20 = composite13.children();
        examples.Composite composite22 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        composite13.addChild(composite22);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        examples.Composite composite1 = new examples.Composite(3);
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite((int) (byte) 1);
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
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet33);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        examples.Composite composite1 = new examples.Composite(0);
        examples.Composite composite3 = new examples.Composite((int) (short) 1);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        composite3.addChild(composite7);
        examples.Composite composite11 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        examples.Composite composite16 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        composite11.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet19 = composite11.children();
        java.util.Set<examples.Composite> compositeSet20 = composite11.children();
        java.util.Set<examples.Composite> compositeSet21 = composite11.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-10));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        examples.Composite composite8 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        examples.Composite composite11 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        composite8.addChild(composite11);
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
        org.junit.Assert.assertNotNull(compositeSet13);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        examples.Composite composite1 = new examples.Composite((int) (short) 100);
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
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        java.util.Set<examples.Composite> compositeSet16 = composite12.children();
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
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
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
        examples.Composite composite14 = new examples.Composite((int) (byte) 1);
        examples.Composite composite16 = new examples.Composite(2);
        composite14.addChild(composite16);
        examples.Composite composite19 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        composite16.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet23 = composite19.children();
        java.util.Set<examples.Composite> compositeSet24 = composite19.children();
        java.util.Set<examples.Composite> compositeSet25 = composite19.children();
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        examples.Composite composite1 = new examples.Composite((-5));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        java.util.Set<examples.Composite> compositeSet8 = composite5.children();
        composite1.addChild(composite5);
        examples.Composite composite11 = new examples.Composite((-100));
        examples.Composite composite13 = new examples.Composite((-3));
        composite11.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        java.util.Set<examples.Composite> compositeSet16 = composite13.children();
        examples.Composite composite18 = new examples.Composite((-9));
        composite13.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        examples.Composite composite22 = new examples.Composite((int) '4');
        composite18.addChild(composite22);
        examples.Composite composite25 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        composite18.addChild(composite25);
        examples.Composite composite29 = new examples.Composite((-100));
        composite25.addChild(composite29);
        java.util.Set<examples.Composite> compositeSet31 = composite29.children();
        examples.Composite composite33 = new examples.Composite((int) (byte) -1);
        composite29.addChild(composite33);
        // The following exception was thrown during execution in test generation
        try {
            composite5.addChild(composite29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet31);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
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
        java.util.Set<examples.Composite> compositeSet13 = composite1.children();
        examples.Composite composite15 = new examples.Composite((-5));
        examples.Composite composite17 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        composite15.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet20 = composite15.children();
        examples.Composite composite22 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        composite15.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        java.util.Set<examples.Composite> compositeSet26 = composite22.children();
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
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        examples.Composite composite1 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((int) ' ');
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
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
            composite5.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
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
        java.util.Set<examples.Composite> compositeSet20 = composite16.children();
        java.lang.Class<?> wildcardClass21 = compositeSet20.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        examples.Composite composite7 = new examples.Composite((int) (short) 0);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        composite4.addChild(composite7);
        examples.Composite composite11 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        java.util.Set<examples.Composite> compositeSet15 = composite11.children();
        java.util.Set<examples.Composite> compositeSet16 = composite11.children();
        composite4.addChild(composite11);
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
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
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
        java.lang.Class<?> wildcardClass20 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite9 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        examples.Composite composite13 = new examples.Composite(0);
        composite9.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet15 = composite9.children();
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet15);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
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
        java.lang.Class<?> wildcardClass15 = compositeSet14.getClass();
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
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
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
        examples.Composite composite14 = new examples.Composite((-2));
        examples.Composite composite16 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        composite14.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet21 = composite14.children();
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
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet21);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
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
        examples.Composite composite17 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        examples.Composite composite20 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        composite17.addChild(composite20);
        examples.Composite composite24 = new examples.Composite((-3));
        composite20.addChild(composite24);
        examples.Composite composite27 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet28 = composite27.children();
        java.util.Set<examples.Composite> compositeSet29 = composite27.children();
        composite20.addChild(composite27);
        examples.Composite composite32 = new examples.Composite((-9));
        composite27.addChild(composite32);
        java.util.Set<examples.Composite> compositeSet34 = composite27.children();
        examples.Composite composite36 = new examples.Composite(1);
        composite27.addChild(composite36);
        // The following exception was thrown during execution in test generation
        try {
            composite12.addChild(composite36);
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
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet34);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
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
        java.util.Set<examples.Composite> compositeSet17 = composite8.children();
        java.lang.Class<?> wildcardClass18 = compositeSet17.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        examples.Composite composite7 = new examples.Composite((int) (short) 0);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        composite4.addChild(composite7);
        examples.Composite composite11 = new examples.Composite(7);
        composite7.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite7.children();
        java.lang.Class<?> wildcardClass14 = compositeSet13.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
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
        java.util.Set<examples.Composite> compositeSet28 = composite24.children();
        java.util.Set<examples.Composite> compositeSet29 = composite24.children();
        java.lang.Class<?> wildcardClass30 = compositeSet29.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
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
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        examples.Composite composite22 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        composite19.addChild(composite22);
        examples.Composite composite26 = new examples.Composite((-3));
        composite22.addChild(composite26);
        examples.Composite composite29 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet30 = composite29.children();
        java.util.Set<examples.Composite> compositeSet31 = composite29.children();
        composite22.addChild(composite29);
        examples.Composite composite34 = new examples.Composite((-9));
        composite29.addChild(composite34);
        java.util.Set<examples.Composite> compositeSet36 = composite34.children();
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite34);
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
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet36);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
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
        java.lang.Class<?> wildcardClass21 = composite8.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
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
        java.lang.Class<?> wildcardClass15 = composite1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
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
        java.util.Set<examples.Composite> compositeSet26 = composite12.children();
        examples.Composite composite28 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        examples.Composite composite31 = new examples.Composite((int) ' ');
        composite28.addChild(composite31);
        java.util.Set<examples.Composite> compositeSet33 = composite31.children();
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
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet33);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
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
        java.lang.Class<?> wildcardClass21 = composite10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
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
        java.util.Set<examples.Composite> compositeSet17 = composite1.children();
        examples.Composite composite19 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        examples.Composite composite22 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        java.util.Set<examples.Composite> compositeSet26 = composite22.children();
        java.util.Set<examples.Composite> compositeSet27 = composite22.children();
        composite19.addChild(composite22);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
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
        examples.Composite composite19 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        examples.Composite composite23 = new examples.Composite((int) (byte) 0);
        composite19.addChild(composite23);
        java.util.Set<examples.Composite> compositeSet25 = composite19.children();
        examples.Composite composite27 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet28 = composite27.children();
        java.util.Set<examples.Composite> compositeSet29 = composite27.children();
        java.util.Set<examples.Composite> compositeSet30 = composite27.children();
        composite19.addChild(composite27);
        examples.Composite composite33 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet34 = composite33.children();
        java.util.Set<examples.Composite> compositeSet35 = composite33.children();
        java.util.Set<examples.Composite> compositeSet36 = composite33.children();
        java.util.Set<examples.Composite> compositeSet37 = composite33.children();
        composite27.addChild(composite33);
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet35);
        org.junit.Assert.assertNotNull(compositeSet36);
        org.junit.Assert.assertNotNull(compositeSet37);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
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
        examples.Composite composite29 = new examples.Composite(3);
        java.util.Set<examples.Composite> compositeSet30 = composite29.children();
        examples.Composite composite32 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet33 = composite32.children();
        java.util.Set<examples.Composite> compositeSet34 = composite32.children();
        java.util.Set<examples.Composite> compositeSet35 = composite32.children();
        java.util.Set<examples.Composite> compositeSet36 = composite32.children();
        java.util.Set<examples.Composite> compositeSet37 = composite32.children();
        composite29.addChild(composite32);
        // The following exception was thrown during execution in test generation
        try {
            composite24.addChild(composite29);
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
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet35);
        org.junit.Assert.assertNotNull(compositeSet36);
        org.junit.Assert.assertNotNull(compositeSet37);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
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
        examples.Composite composite17 = null;
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
        org.junit.Assert.assertNotNull(compositeSet16);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
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
        java.util.Set<examples.Composite> compositeSet19 = composite15.children();
        examples.Composite composite21 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        java.util.Set<examples.Composite> compositeSet24 = composite21.children();
        java.util.Set<examples.Composite> compositeSet25 = composite21.children();
        examples.Composite composite27 = new examples.Composite(9);
        composite21.addChild(composite27);
        java.util.Set<examples.Composite> compositeSet29 = composite27.children();
        // The following exception was thrown during execution in test generation
        try {
            composite15.addChild(composite27);
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
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet29);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
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
        examples.Composite composite17 = new examples.Composite((int) (short) -1);
        examples.Composite composite19 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        composite17.addChild(composite19);
        examples.Composite composite23 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        java.util.Set<examples.Composite> compositeSet25 = composite23.children();
        composite17.addChild(composite23);
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet24);
        org.junit.Assert.assertNotNull(compositeSet25);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        examples.Composite composite1 = new examples.Composite((int) ' ');
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        examples.Composite composite6 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite3.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet10 = composite3.children();
        examples.Composite composite12 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite3.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet15);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
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
        java.util.Set<examples.Composite> compositeSet17 = composite8.children();
        java.lang.Class<?> wildcardClass18 = composite8.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        examples.Composite composite1 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(10);
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        java.lang.Class<?> wildcardClass7 = composite4.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        examples.Composite composite1 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-100));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite composite10 = new examples.Composite((-8));
        composite5.addChild(composite10);
        examples.Composite composite13 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        composite5.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet17 = composite13.children();
        java.util.Set<examples.Composite> compositeSet18 = composite13.children();
        examples.Composite composite20 = new examples.Composite((int) 'a');
        composite13.addChild(composite20);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
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
        examples.Composite composite25 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        java.util.Set<examples.Composite> compositeSet27 = composite25.children();
        java.util.Set<examples.Composite> compositeSet28 = composite25.children();
        examples.Composite composite30 = new examples.Composite(3);
        composite25.addChild(composite30);
        examples.Composite composite33 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet34 = composite33.children();
        java.util.Set<examples.Composite> compositeSet35 = composite33.children();
        java.util.Set<examples.Composite> compositeSet36 = composite33.children();
        composite25.addChild(composite33);
        examples.Composite composite39 = new examples.Composite((-10));
        composite25.addChild(composite39);
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite25);
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
        org.junit.Assert.assertNotNull(compositeSet28);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet35);
        org.junit.Assert.assertNotNull(compositeSet36);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
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
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        java.lang.Class<?> wildcardClass20 = compositeSet19.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
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
        java.lang.Class<?> wildcardClass14 = composite9.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
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
        java.util.Set<examples.Composite> compositeSet13 = composite1.children();
        examples.Composite composite15 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        examples.Composite composite18 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        composite15.addChild(composite18);
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
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        java.util.Set<examples.Composite> compositeSet9 = composite4.children();
        java.util.Set<examples.Composite> compositeSet10 = composite4.children();
        java.lang.Class<?> wildcardClass11 = compositeSet10.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
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
        java.util.Set<examples.Composite> compositeSet26 = composite17.children();
        examples.Composite composite28 = new examples.Composite((-100));
        examples.Composite composite30 = new examples.Composite((-3));
        composite28.addChild(composite30);
        java.util.Set<examples.Composite> compositeSet32 = composite30.children();
        examples.Composite composite34 = new examples.Composite((-9));
        composite30.addChild(composite34);
        java.util.Set<examples.Composite> compositeSet36 = composite34.children();
        java.util.Set<examples.Composite> compositeSet37 = composite34.children();
        examples.Composite composite39 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet40 = composite39.children();
        composite34.addChild(composite39);
        // The following exception was thrown during execution in test generation
        try {
            composite17.addChild(composite39);
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
        org.junit.Assert.assertNotNull(compositeSet32);
        org.junit.Assert.assertNotNull(compositeSet36);
        org.junit.Assert.assertNotNull(compositeSet37);
        org.junit.Assert.assertNotNull(compositeSet40);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        examples.Composite composite11 = new examples.Composite((-5));
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
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
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
        java.util.Set<examples.Composite> compositeSet21 = composite15.children();
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite15);
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
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        examples.Composite composite8 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite1.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        java.lang.Class<?> wildcardClass12 = compositeSet11.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
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
        examples.Composite composite13 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        examples.Composite composite16 = new examples.Composite((int) '#');
        composite13.addChild(composite16);
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
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        examples.Composite composite7 = new examples.Composite((int) (short) -1);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        examples.Composite composite10 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        composite7.addChild(composite10);
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
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        java.util.Set<examples.Composite> compositeSet16 = composite12.children();
        java.util.Set<examples.Composite> compositeSet17 = composite12.children();
        composite1.addChild(composite12);
        examples.Composite composite20 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        java.util.Set<examples.Composite> compositeSet23 = composite20.children();
        examples.Composite composite25 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        java.util.Set<examples.Composite> compositeSet27 = composite25.children();
        composite20.addChild(composite25);
        // The following exception was thrown during execution in test generation
        try {
            composite12.addChild(composite20);
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
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
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
        java.util.Set<examples.Composite> compositeSet15 = composite8.children();
        java.util.Set<examples.Composite> compositeSet16 = composite8.children();
        java.util.Set<examples.Composite> compositeSet17 = composite8.children();
        java.util.Set<examples.Composite> compositeSet18 = composite8.children();
        java.lang.Class<?> wildcardClass19 = compositeSet18.getClass();
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
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
        examples.Composite composite25 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        examples.Composite composite28 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        composite25.addChild(composite28);
        examples.Composite composite32 = new examples.Composite((-3));
        composite28.addChild(composite32);
        examples.Composite composite35 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet36 = composite35.children();
        java.util.Set<examples.Composite> compositeSet37 = composite35.children();
        composite28.addChild(composite35);
        // The following exception was thrown during execution in test generation
        try {
            composite19.addChild(composite35);
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
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet36);
        org.junit.Assert.assertNotNull(compositeSet37);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        examples.Composite composite7 = new examples.Composite((-100));
        examples.Composite composite9 = new examples.Composite((-3));
        composite7.addChild(composite9);
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        composite7.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet17 = composite12.children();
        java.util.Set<examples.Composite> compositeSet18 = composite12.children();
        examples.Composite composite20 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        java.util.Set<examples.Composite> compositeSet23 = composite20.children();
        composite12.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet25 = composite20.children();
        examples.Composite composite27 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet28 = composite27.children();
        composite20.addChild(composite27);
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
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet18);
        org.junit.Assert.assertNotNull(compositeSet21);
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet28);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        examples.Composite composite1 = new examples.Composite(0);
        examples.Composite composite3 = new examples.Composite((int) (short) 1);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite(7);
        composite3.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite3.children();
        java.util.Set<examples.Composite> compositeSet10 = composite3.children();
        java.lang.Class<?> wildcardClass11 = compositeSet10.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        examples.Composite composite1 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        composite1.addChild(composite5);
        examples.Composite composite10 = new examples.Composite((int) (byte) 1);
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        composite1.addChild(composite10);
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
        java.util.Set<examples.Composite> compositeSet32 = composite25.children();
        examples.Composite composite34 = new examples.Composite(1);
        composite25.addChild(composite34);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite34);
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
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet19);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet32);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
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
        java.util.Set<examples.Composite> compositeSet12 = composite1.children();
        java.util.Set<examples.Composite> compositeSet13 = composite1.children();
        examples.Composite composite15 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        examples.Composite composite18 = new examples.Composite(8);
        composite15.addChild(composite18);
        examples.Composite composite21 = new examples.Composite((int) (short) 0);
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        composite18.addChild(composite21);
        examples.Composite composite25 = new examples.Composite(7);
        composite21.addChild(composite25);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite21);
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
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet22);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
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
        examples.Composite composite24 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        java.util.Set<examples.Composite> compositeSet27 = composite24.children();
        composite19.addChild(composite24);
        java.util.Set<examples.Composite> compositeSet29 = composite24.children();
        java.util.Set<examples.Composite> compositeSet30 = composite24.children();
        examples.Composite composite32 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet33 = composite32.children();
        java.util.Set<examples.Composite> compositeSet34 = composite32.children();
        java.util.Set<examples.Composite> compositeSet35 = composite32.children();
        composite24.addChild(composite32);
        java.util.Set<examples.Composite> compositeSet37 = composite32.children();
        examples.Composite composite39 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet40 = composite39.children();
        composite32.addChild(composite39);
        // The following exception was thrown during execution in test generation
        try {
            composite12.addChild(composite39);
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
        org.junit.Assert.assertNotNull(compositeSet25);
        org.junit.Assert.assertNotNull(compositeSet26);
        org.junit.Assert.assertNotNull(compositeSet27);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet33);
        org.junit.Assert.assertNotNull(compositeSet34);
        org.junit.Assert.assertNotNull(compositeSet35);
        org.junit.Assert.assertNotNull(compositeSet37);
        org.junit.Assert.assertNotNull(compositeSet40);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
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
        java.util.Set<examples.Composite> compositeSet19 = composite6.children();
        examples.Composite composite21 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        examples.Composite composite25 = new examples.Composite(4);
        composite21.addChild(composite25);
        examples.Composite composite28 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet29 = composite28.children();
        java.util.Set<examples.Composite> compositeSet30 = composite28.children();
        java.util.Set<examples.Composite> compositeSet31 = composite28.children();
        composite21.addChild(composite28);
        examples.Composite composite34 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet35 = composite34.children();
        java.util.Set<examples.Composite> compositeSet36 = composite34.children();
        java.util.Set<examples.Composite> compositeSet37 = composite34.children();
        composite21.addChild(composite34);
        // The following exception was thrown during execution in test generation
        try {
            composite6.addChild(composite34);
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
        org.junit.Assert.assertNotNull(compositeSet22);
        org.junit.Assert.assertNotNull(compositeSet23);
        org.junit.Assert.assertNotNull(compositeSet29);
        org.junit.Assert.assertNotNull(compositeSet30);
        org.junit.Assert.assertNotNull(compositeSet31);
        org.junit.Assert.assertNotNull(compositeSet35);
        org.junit.Assert.assertNotNull(compositeSet36);
        org.junit.Assert.assertNotNull(compositeSet37);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
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
        examples.Composite composite35 = new examples.Composite((-3));
        composite31.addChild(composite35);
        examples.Composite composite38 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet39 = composite38.children();
        java.util.Set<examples.Composite> compositeSet40 = composite38.children();
        composite31.addChild(composite38);
        // The following exception was thrown during execution in test generation
        try {
            composite22.addChild(composite31);
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
        org.junit.Assert.assertNotNull(compositeSet39);
        org.junit.Assert.assertNotNull(compositeSet40);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
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
        java.util.Set<examples.Composite> compositeSet16 = composite13.children();
        java.lang.Class<?> wildcardClass17 = composite13.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        examples.Composite composite1 = new examples.Composite(100);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        examples.Composite composite7 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        composite4.addChild(composite7);
        examples.Composite composite11 = new examples.Composite((-3));
        composite7.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        examples.Composite composite16 = new examples.Composite((int) 'a');
        composite11.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        examples.Composite composite20 = new examples.Composite((int) (short) -1);
        composite16.addChild(composite20);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet18);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        examples.Composite composite1 = new examples.Composite((-1));
        examples.Composite composite3 = new examples.Composite(100);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-6));
        composite3.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        java.util.Set<examples.Composite> compositeSet10 = composite7.children();
        java.util.Set<examples.Composite> compositeSet11 = composite7.children();
        java.lang.Class<?> wildcardClass12 = compositeSet11.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        examples.Composite composite1 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) ' ');
        composite1.addChild(composite4);
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
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
    }
}

