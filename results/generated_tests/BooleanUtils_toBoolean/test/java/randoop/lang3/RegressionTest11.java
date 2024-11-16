package lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test05501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05501");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 8, (java.lang.Integer) (-3), (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05502");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-2), (java.lang.Integer) 2, (java.lang.Integer) (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05503");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-2), (java.lang.Integer) 1, (java.lang.Integer) (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05504");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 6, (java.lang.Integer) 1, (java.lang.Integer) (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05505");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 8, (java.lang.Integer) 4, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05506");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05507");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 6, (java.lang.Integer) (-8), (java.lang.Integer) (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05508");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 9, (java.lang.Integer) (-8), (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05509");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-10), (java.lang.Integer) (-3), (java.lang.Integer) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05510");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-100), (java.lang.Integer) (-6), (java.lang.Integer) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05511");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 5, (java.lang.Integer) (-10), (java.lang.Integer) (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05512");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-100), (java.lang.Integer) (-1), (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05513");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 2, (java.lang.Integer) 9, (java.lang.Integer) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05514");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) (-4), (java.lang.Integer) (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05515");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-4), (java.lang.Integer) 6, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05516");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 4, (java.lang.Integer) 1, (java.lang.Integer) (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05517");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 4, (java.lang.Integer) (-5), (java.lang.Integer) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05518");
        boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 3, (java.lang.Integer) 2, (java.lang.Integer) 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test05519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05519");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 9, (java.lang.Integer) 5, (java.lang.Integer) (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05520");
        boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-7), (java.lang.Integer) 9, (java.lang.Integer) (-7));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test05521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05521");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) (-2), (java.lang.Integer) (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05522");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-2), (java.lang.Integer) (-8), (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05523");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 7, (java.lang.Integer) (-2), (java.lang.Integer) (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05524");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) (-1), (java.lang.Integer) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05525");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) (-100), (java.lang.Integer) (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05526");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 8, (java.lang.Integer) 9, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05527");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 2, (java.lang.Integer) 5, (java.lang.Integer) (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05528");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 6, (java.lang.Integer) 100, (java.lang.Integer) (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05529");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-8), (java.lang.Integer) 10, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05530");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) (-7), (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05531");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-3), (java.lang.Integer) 100, (java.lang.Integer) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05532");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) (-9), (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05533");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 2, (java.lang.Integer) (-8), (java.lang.Integer) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05534");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-3), (java.lang.Integer) 10, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05535");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-3), (java.lang.Integer) 100, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05536");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-2), (java.lang.Integer) 5, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05537");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-100), (java.lang.Integer) 1, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05538");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 7, (java.lang.Integer) 8, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05539");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) (-5), (java.lang.Integer) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05540");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 2, (java.lang.Integer) 8, (java.lang.Integer) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05541");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-6), (java.lang.Integer) (-2), (java.lang.Integer) (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05542");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 4, (java.lang.Integer) 2, (java.lang.Integer) (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05543");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) (-2), (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05544");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 9, (java.lang.Integer) (-8), (java.lang.Integer) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05545");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) (-9), (java.lang.Integer) (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05546");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-10), (java.lang.Integer) 100, (java.lang.Integer) (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05547");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-9), (java.lang.Integer) (-1), (java.lang.Integer) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05548");
        boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) 7);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test05549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05549");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) 4, (java.lang.Integer) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05550");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 2, (java.lang.Integer) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05551");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 5, (java.lang.Integer) 1, (java.lang.Integer) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05552");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) 2, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05553");
        boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 6, (java.lang.Integer) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test05554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05554");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) (-5), (java.lang.Integer) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05555");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) (-4), (java.lang.Integer) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05556");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) 4, (java.lang.Integer) (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05557");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 7, (java.lang.Integer) (-2), (java.lang.Integer) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05558");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05559");
        boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-10), (java.lang.Integer) (-10), (java.lang.Integer) (-7));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test05560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05560");
        boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-100), (java.lang.Integer) (-100), (java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test05561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05561");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-5), (java.lang.Integer) 100, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05562");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) 2, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05563");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-2), (java.lang.Integer) 2, (java.lang.Integer) (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05564");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) (-2), (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05565");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-6), (java.lang.Integer) 8, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05566");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 5, (java.lang.Integer) (-7), (java.lang.Integer) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05567");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-6), (java.lang.Integer) (-5), (java.lang.Integer) (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05568");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 6, (java.lang.Integer) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05569");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-8), (java.lang.Integer) 0, (java.lang.Integer) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05570");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-7), (java.lang.Integer) 5, (java.lang.Integer) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05571");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-7), (java.lang.Integer) 9, (java.lang.Integer) (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05572");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 6, (java.lang.Integer) (-4), (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05573");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 8, (java.lang.Integer) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05574");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 4, (java.lang.Integer) 8, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05575");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-5), (java.lang.Integer) 2, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05576");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-4), (java.lang.Integer) 100, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05577");
        boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-10), (java.lang.Integer) (-10), (java.lang.Integer) (-4));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test05578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05578");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-9), (java.lang.Integer) (-3), (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05579");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-10), (java.lang.Integer) (-9), (java.lang.Integer) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05580");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) 9, (java.lang.Integer) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05581");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-7), (java.lang.Integer) 10, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05582");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-4), (java.lang.Integer) 6, (java.lang.Integer) (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05583");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 9, (java.lang.Integer) (-9), (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05584");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-100), (java.lang.Integer) 1, (java.lang.Integer) (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05585");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-5), (java.lang.Integer) 7, (java.lang.Integer) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05586");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-2), (java.lang.Integer) (-6), (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05587");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) 4, (java.lang.Integer) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05588");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 3, (java.lang.Integer) 100, (java.lang.Integer) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05589");
        boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-9), (java.lang.Integer) (-9), (java.lang.Integer) (-3));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test05590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05590");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-3), (java.lang.Integer) 9, (java.lang.Integer) (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05591");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 3, (java.lang.Integer) (-1), (java.lang.Integer) (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05592");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 8, (java.lang.Integer) 9, (java.lang.Integer) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05593");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-6), (java.lang.Integer) 0, (java.lang.Integer) (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05594");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-3), (java.lang.Integer) 100, (java.lang.Integer) (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05595");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-8), (java.lang.Integer) 9, (java.lang.Integer) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05596");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) (-6), (java.lang.Integer) (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05597");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 2, (java.lang.Integer) (-3), (java.lang.Integer) (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05598");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 9, (java.lang.Integer) (-6), (java.lang.Integer) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05599");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 4, (java.lang.Integer) 100, (java.lang.Integer) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05600");
        boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-5), (java.lang.Integer) (-5), (java.lang.Integer) 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test05601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05601");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-8), (java.lang.Integer) 9, (java.lang.Integer) (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05602");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-7), (java.lang.Integer) 10, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05603");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) (-100), (java.lang.Integer) (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05604");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-100), (java.lang.Integer) (-1), (java.lang.Integer) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05605");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-2), (java.lang.Integer) (-6), (java.lang.Integer) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05606");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-4), (java.lang.Integer) (-10), (java.lang.Integer) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05607");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) (-2), (java.lang.Integer) (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05608");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 5, (java.lang.Integer) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05609");
        boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-4), (java.lang.Integer) 8, (java.lang.Integer) (-4));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test05610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05610");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 6, (java.lang.Integer) (-10), (java.lang.Integer) (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05611");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) (-3), (java.lang.Integer) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05612");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-5), (java.lang.Integer) (-4), (java.lang.Integer) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05613");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-9), (java.lang.Integer) (-7), (java.lang.Integer) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05614");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-8), (java.lang.Integer) 7, (java.lang.Integer) (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05615");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-7), (java.lang.Integer) (-4), (java.lang.Integer) (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05616");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) 100, (java.lang.Integer) (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05617");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-6), (java.lang.Integer) (-8), (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05618");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) (-100), (java.lang.Integer) (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05619");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 9, (java.lang.Integer) 3, (java.lang.Integer) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05620");
        boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 9, (java.lang.Integer) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test05621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05621");
        boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) 100, (java.lang.Integer) 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test05622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05622");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-10), (java.lang.Integer) 4, (java.lang.Integer) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05623");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 7, (java.lang.Integer) 0, (java.lang.Integer) (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05624");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 9, (java.lang.Integer) 3, (java.lang.Integer) (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05625");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 9, (java.lang.Integer) (-2), (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05626");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 3, (java.lang.Integer) 5, (java.lang.Integer) (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05627");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-8), (java.lang.Integer) (-100), (java.lang.Integer) (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05628");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 7, (java.lang.Integer) (-10), (java.lang.Integer) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05629");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 6, (java.lang.Integer) 8, (java.lang.Integer) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05630");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 3, (java.lang.Integer) 0, (java.lang.Integer) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05631");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-7), (java.lang.Integer) (-4), (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05632");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) (-9), (java.lang.Integer) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05633");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-6), (java.lang.Integer) (-10), (java.lang.Integer) (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05634");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-100), (java.lang.Integer) 100, (java.lang.Integer) (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05635");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-9), (java.lang.Integer) (-5), (java.lang.Integer) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05636");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-3), (java.lang.Integer) 3, (java.lang.Integer) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05637");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 4, (java.lang.Integer) 1, (java.lang.Integer) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05638");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-8), (java.lang.Integer) 100, (java.lang.Integer) (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05639");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 8, (java.lang.Integer) 1, (java.lang.Integer) (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05640");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-8), (java.lang.Integer) 1, (java.lang.Integer) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05641");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) (-6), (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05642");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 8, (java.lang.Integer) (-100), (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05643");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 9, (java.lang.Integer) (-8), (java.lang.Integer) (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05644");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) (-10), (java.lang.Integer) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05645");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-100), (java.lang.Integer) 3, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05646");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) (-7), (java.lang.Integer) (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05647");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 5, (java.lang.Integer) 100, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05648");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 7, (java.lang.Integer) (-3), (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05649");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05650");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-9), (java.lang.Integer) 10, (java.lang.Integer) (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05651");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 6, (java.lang.Integer) (-3), (java.lang.Integer) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05652");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-7), (java.lang.Integer) 6, (java.lang.Integer) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05653");
        boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-8), (java.lang.Integer) 8, (java.lang.Integer) (-8));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test05654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05654");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) (-100), (java.lang.Integer) (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05655");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 7, (java.lang.Integer) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05656");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 4, (java.lang.Integer) 8, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05657");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-4), (java.lang.Integer) (-2), (java.lang.Integer) (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05658");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 6, (java.lang.Integer) (-3), (java.lang.Integer) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05659");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-10), (java.lang.Integer) 6, (java.lang.Integer) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05660");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 4, (java.lang.Integer) (-1), (java.lang.Integer) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05661");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) (-10), (java.lang.Integer) (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05662");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 3, (java.lang.Integer) 0, (java.lang.Integer) (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05663");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-5), (java.lang.Integer) 9, (java.lang.Integer) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05664");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-9), (java.lang.Integer) (-6), (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05665");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-9), (java.lang.Integer) 8, (java.lang.Integer) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05666");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 4, (java.lang.Integer) (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05667");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-8), (java.lang.Integer) 4, (java.lang.Integer) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05668");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-2), (java.lang.Integer) 7, (java.lang.Integer) (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05669");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 4, (java.lang.Integer) 100, (java.lang.Integer) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05670");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 2, (java.lang.Integer) (-10), (java.lang.Integer) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05671");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-2), (java.lang.Integer) (-5), (java.lang.Integer) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05672");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-8), (java.lang.Integer) 2, (java.lang.Integer) (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05673");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-2), (java.lang.Integer) 10, (java.lang.Integer) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05674");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-5), (java.lang.Integer) 1, (java.lang.Integer) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05675");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-100), (java.lang.Integer) (-4), (java.lang.Integer) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05676");
        boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 4, (java.lang.Integer) 2, (java.lang.Integer) 4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test05677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05677");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-7), (java.lang.Integer) 7, (java.lang.Integer) (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05678");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 3, (java.lang.Integer) 5, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05679");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) 6, (java.lang.Integer) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05680");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) (-10), (java.lang.Integer) (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05681");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-8), (java.lang.Integer) (-3), (java.lang.Integer) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05682");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-4), (java.lang.Integer) (-8), (java.lang.Integer) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05683");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 7, (java.lang.Integer) (-4), (java.lang.Integer) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05684");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-5), (java.lang.Integer) 8, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05685");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 9, (java.lang.Integer) 5, (java.lang.Integer) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05686");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-3), (java.lang.Integer) 0, (java.lang.Integer) (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05687");
        boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) (-6));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test05688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05688");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) (-100), (java.lang.Integer) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05689");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 5, (java.lang.Integer) 7, (java.lang.Integer) (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05690");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-5), (java.lang.Integer) 100, (java.lang.Integer) (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05691");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-4), (java.lang.Integer) 10, (java.lang.Integer) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05692");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-6), (java.lang.Integer) 0, (java.lang.Integer) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05693");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-5), (java.lang.Integer) (-9), (java.lang.Integer) (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05694");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-9), (java.lang.Integer) (-3), (java.lang.Integer) (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05695");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-2), (java.lang.Integer) (-6), (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05696");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 9, (java.lang.Integer) (-10), (java.lang.Integer) (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05697");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 5, (java.lang.Integer) 8, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05698");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-5), (java.lang.Integer) 1, (java.lang.Integer) (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05699");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 5, (java.lang.Integer) 3, (java.lang.Integer) (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05700");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 7, (java.lang.Integer) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05701");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-9), (java.lang.Integer) 7, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05702");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 7, (java.lang.Integer) 3, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05703");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-10), (java.lang.Integer) 0, (java.lang.Integer) (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05704");
        boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 6, (java.lang.Integer) 5, (java.lang.Integer) 6);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test05705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05705");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05706");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 4, (java.lang.Integer) 5, (java.lang.Integer) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05707");
        boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) (-4));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test05708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05708");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-9), (java.lang.Integer) (-10), (java.lang.Integer) (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05709");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-10), (java.lang.Integer) 2, (java.lang.Integer) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05710");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-7), (java.lang.Integer) 0, (java.lang.Integer) (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05711");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) (-6), (java.lang.Integer) (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05712");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) (-2), (java.lang.Integer) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05713");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) 100, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05714");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) 2, (java.lang.Integer) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05715");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 7, (java.lang.Integer) (-100), (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05716");
        boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-7), (java.lang.Integer) (-9), (java.lang.Integer) (-7));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test05717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05717");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-2), (java.lang.Integer) (-9), (java.lang.Integer) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05718");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-100), (java.lang.Integer) 3, (java.lang.Integer) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05719");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-9), (java.lang.Integer) 0, (java.lang.Integer) (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05720");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 4, (java.lang.Integer) 0, (java.lang.Integer) (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05721");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-7), (java.lang.Integer) (-4), (java.lang.Integer) (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05722");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-8), (java.lang.Integer) (-10), (java.lang.Integer) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05723");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-6), (java.lang.Integer) (-3), (java.lang.Integer) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05724");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-8), (java.lang.Integer) 0, (java.lang.Integer) (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05725");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05726");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 4, (java.lang.Integer) 9, (java.lang.Integer) (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05727");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-10), (java.lang.Integer) 2, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05728");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 9, (java.lang.Integer) (-5), (java.lang.Integer) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05729");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) (-7), (java.lang.Integer) (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05730");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-5), (java.lang.Integer) (-1), (java.lang.Integer) (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05731");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-8), (java.lang.Integer) 2, (java.lang.Integer) (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05732");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-5), (java.lang.Integer) (-1), (java.lang.Integer) (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05733");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 5, (java.lang.Integer) (-10), (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05734");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-3), (java.lang.Integer) (-4), (java.lang.Integer) (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05735");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-3), (java.lang.Integer) 0, (java.lang.Integer) (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05736");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-5), (java.lang.Integer) 10, (java.lang.Integer) (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05737");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-5), (java.lang.Integer) 1, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05738");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-10), (java.lang.Integer) 100, (java.lang.Integer) (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05739");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 3, (java.lang.Integer) 6, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05740");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-6), (java.lang.Integer) (-3), (java.lang.Integer) (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05741");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 4, (java.lang.Integer) 0, (java.lang.Integer) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05742");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-4), (java.lang.Integer) (-9), (java.lang.Integer) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05743");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-7), (java.lang.Integer) 2, (java.lang.Integer) (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05744");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 100, (java.lang.Integer) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05745");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-4), (java.lang.Integer) 6, (java.lang.Integer) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05746");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) (-10), (java.lang.Integer) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05747");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 7, (java.lang.Integer) 8, (java.lang.Integer) (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05748");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-5), (java.lang.Integer) (-9), (java.lang.Integer) (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05749");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) (-4), (java.lang.Integer) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05750");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-7), (java.lang.Integer) 100, (java.lang.Integer) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05751");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-10), (java.lang.Integer) (-9), (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05752");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) (-100), (java.lang.Integer) (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05753");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-9), (java.lang.Integer) 2, (java.lang.Integer) (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05754");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-3), (java.lang.Integer) (-1), (java.lang.Integer) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05755");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-7), (java.lang.Integer) 2, (java.lang.Integer) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05756");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 9, (java.lang.Integer) (-7), (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05757");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 5, (java.lang.Integer) 100, (java.lang.Integer) (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05758");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) (-100), (java.lang.Integer) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05759");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-3), (java.lang.Integer) 100, (java.lang.Integer) (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05760");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 7, (java.lang.Integer) (-2), (java.lang.Integer) (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05761");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-4), (java.lang.Integer) (-6), (java.lang.Integer) (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05762");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 4, (java.lang.Integer) 10, (java.lang.Integer) (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05763");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 9, (java.lang.Integer) 3, (java.lang.Integer) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05764");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) 4, (java.lang.Integer) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05765");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) (-4), (java.lang.Integer) (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05766");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 9, (java.lang.Integer) 7, (java.lang.Integer) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05767");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 2, (java.lang.Integer) (-9), (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05768");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 6, (java.lang.Integer) 8, (java.lang.Integer) (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05769");
        boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 9, (java.lang.Integer) 9, (java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test05770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05770");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) (-8), (java.lang.Integer) (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05771");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 3, (java.lang.Integer) (-8), (java.lang.Integer) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05772");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-5), (java.lang.Integer) 7, (java.lang.Integer) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05773");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 7, (java.lang.Integer) 4, (java.lang.Integer) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05774");
        boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-8), (java.lang.Integer) (-8), (java.lang.Integer) (-9));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test05775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05775");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-10), (java.lang.Integer) 1, (java.lang.Integer) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05776");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-10), (java.lang.Integer) (-7), (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05777");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-3), (java.lang.Integer) (-4), (java.lang.Integer) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05778");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 8, (java.lang.Integer) (-10), (java.lang.Integer) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05779");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 4, (java.lang.Integer) 1, (java.lang.Integer) (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05780");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 6, (java.lang.Integer) (-4), (java.lang.Integer) (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05781");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 9, (java.lang.Integer) 100, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05782");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 2, (java.lang.Integer) 1, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05783");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 9, (java.lang.Integer) 4, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05784");
        boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) 6, (java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test05785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05785");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) (-5), (java.lang.Integer) (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05786");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-10), (java.lang.Integer) 5, (java.lang.Integer) (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05787");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-3), (java.lang.Integer) (-9), (java.lang.Integer) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05788");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-100), (java.lang.Integer) 0, (java.lang.Integer) (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05789");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-8), (java.lang.Integer) (-7), (java.lang.Integer) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05790");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 2, (java.lang.Integer) 5, (java.lang.Integer) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05791");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 5, (java.lang.Integer) (-6), (java.lang.Integer) (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05792");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 5, (java.lang.Integer) 6, (java.lang.Integer) (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05793");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 5, (java.lang.Integer) (-4), (java.lang.Integer) (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05794");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-10), (java.lang.Integer) 7, (java.lang.Integer) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05795");
        boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 9, (java.lang.Integer) 6, (java.lang.Integer) 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test05796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05796");
        boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 3, (java.lang.Integer) 10, (java.lang.Integer) 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test05797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05797");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) (-7), (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05798");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) (-10), (java.lang.Integer) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05799");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-2), (java.lang.Integer) (-5), (java.lang.Integer) (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05800");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 7, (java.lang.Integer) 4, (java.lang.Integer) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05801");
        boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) 3, (java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test05802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05802");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) (-8), (java.lang.Integer) (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05803");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-6), (java.lang.Integer) 9, (java.lang.Integer) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05804");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 9, (java.lang.Integer) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05805");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 8, (java.lang.Integer) (-1), (java.lang.Integer) (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05806");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 4, (java.lang.Integer) (-6), (java.lang.Integer) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05807");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-7), (java.lang.Integer) 4, (java.lang.Integer) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05808");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-6), (java.lang.Integer) 4, (java.lang.Integer) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05809");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-3), (java.lang.Integer) 7, (java.lang.Integer) (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05810");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-7), (java.lang.Integer) 0, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05811");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-6), (java.lang.Integer) (-100), (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05812");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-4), (java.lang.Integer) 10, (java.lang.Integer) (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05813");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 4, (java.lang.Integer) 1, (java.lang.Integer) (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05814");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-4), (java.lang.Integer) (-7), (java.lang.Integer) (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05815");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) 10, (java.lang.Integer) (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05816");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 6, (java.lang.Integer) 8, (java.lang.Integer) (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05817");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) (-3), (java.lang.Integer) (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05818");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 4, (java.lang.Integer) (-4), (java.lang.Integer) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05819");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-6), (java.lang.Integer) (-7), (java.lang.Integer) (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05820");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) (-100), (java.lang.Integer) (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05821");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) 100, (java.lang.Integer) (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05822");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 2, (java.lang.Integer) (-2), (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05823");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-9), (java.lang.Integer) 10, (java.lang.Integer) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05824");
        boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-5), (java.lang.Integer) (-5), (java.lang.Integer) (-10));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test05825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05825");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-7), (java.lang.Integer) (-2), (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05826");
        boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) (-3), (java.lang.Integer) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test05827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05827");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 7, (java.lang.Integer) (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05828");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-4), (java.lang.Integer) 9, (java.lang.Integer) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05829");
        boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) (-10));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test05830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05830");
        boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 2, (java.lang.Integer) 2, (java.lang.Integer) (-10));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test05831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05831");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-3), (java.lang.Integer) 2, (java.lang.Integer) (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05832");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-8), (java.lang.Integer) 5, (java.lang.Integer) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05833");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-4), (java.lang.Integer) (-8), (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05834");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 6, (java.lang.Integer) 3, (java.lang.Integer) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05835");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 8, (java.lang.Integer) 1, (java.lang.Integer) (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05836");
        boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-4), (java.lang.Integer) (-4), (java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test05837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05837");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-5), (java.lang.Integer) (-4), (java.lang.Integer) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05838");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 9, (java.lang.Integer) 2, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05839");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 9, (java.lang.Integer) (-100), (java.lang.Integer) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05840");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-8), (java.lang.Integer) (-6), (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05841");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) (-1), (java.lang.Integer) (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05842");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-7), (java.lang.Integer) (-1), (java.lang.Integer) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05843");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-8), (java.lang.Integer) 4, (java.lang.Integer) (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05844");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 2, (java.lang.Integer) 0, (java.lang.Integer) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05845");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-5), (java.lang.Integer) (-3), (java.lang.Integer) (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05846");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-2), (java.lang.Integer) 9, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05847");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 9, (java.lang.Integer) (-100), (java.lang.Integer) (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05848");
        boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) (-3), (java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test05849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05849");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 4, (java.lang.Integer) (-8), (java.lang.Integer) (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05850");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 9, (java.lang.Integer) 10, (java.lang.Integer) (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05851");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-2), (java.lang.Integer) 10, (java.lang.Integer) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05852");
        boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 9, (java.lang.Integer) 9, (java.lang.Integer) 5);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test05853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05853");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 4, (java.lang.Integer) (-4), (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05854");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-9), (java.lang.Integer) (-5), (java.lang.Integer) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05855");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 3, (java.lang.Integer) 4, (java.lang.Integer) (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05856");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-10), (java.lang.Integer) 0, (java.lang.Integer) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05857");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 5, (java.lang.Integer) (-2), (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05858");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-100), (java.lang.Integer) (-9), (java.lang.Integer) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05859");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-8), (java.lang.Integer) 7, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05860");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 4, (java.lang.Integer) (-3), (java.lang.Integer) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05861");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-2), (java.lang.Integer) (-10), (java.lang.Integer) (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05862");
        boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-5), (java.lang.Integer) 0, (java.lang.Integer) (-5));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test05863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05863");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 9, (java.lang.Integer) 4, (java.lang.Integer) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05864");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-100), (java.lang.Integer) 8, (java.lang.Integer) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05865");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05866");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-8), (java.lang.Integer) (-4), (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05867");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 7, (java.lang.Integer) (-4), (java.lang.Integer) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05868");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-2), (java.lang.Integer) 5, (java.lang.Integer) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05869");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 9, (java.lang.Integer) 6, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05870");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-6), (java.lang.Integer) 5, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05871");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-9), (java.lang.Integer) 8, (java.lang.Integer) (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05872");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 4, (java.lang.Integer) 1, (java.lang.Integer) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05873");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-100), (java.lang.Integer) 1, (java.lang.Integer) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05874");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 7, (java.lang.Integer) 3, (java.lang.Integer) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05875");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 6, (java.lang.Integer) 5, (java.lang.Integer) (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05876");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 2, (java.lang.Integer) (-2), (java.lang.Integer) (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05877");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-9), (java.lang.Integer) (-100), (java.lang.Integer) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05878");
        boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-100), (java.lang.Integer) 7, (java.lang.Integer) (-100));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test05879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05879");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 7, (java.lang.Integer) (-8), (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05880");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) 5, (java.lang.Integer) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05881");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 8, (java.lang.Integer) (-5), (java.lang.Integer) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05882");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-3), (java.lang.Integer) 10, (java.lang.Integer) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05883");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-9), (java.lang.Integer) 3, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05884");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 7, (java.lang.Integer) 6, (java.lang.Integer) (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05885");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 2, (java.lang.Integer) (-2), (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05886");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) (-4), (java.lang.Integer) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05887");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 3, (java.lang.Integer) (-6), (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05888");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-4), (java.lang.Integer) 9, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05889");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) (-3), (java.lang.Integer) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05890");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-10), (java.lang.Integer) (-4), (java.lang.Integer) (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05891");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-100), (java.lang.Integer) (-3), (java.lang.Integer) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05892");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-4), (java.lang.Integer) (-6), (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05893");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-10), (java.lang.Integer) (-1), (java.lang.Integer) (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05894");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-3), (java.lang.Integer) 5, (java.lang.Integer) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05895");
        boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-5), (java.lang.Integer) (-2), (java.lang.Integer) (-5));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test05896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05896");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-7), (java.lang.Integer) (-8), (java.lang.Integer) (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05897");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-10), (java.lang.Integer) 0, (java.lang.Integer) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05898");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 3, (java.lang.Integer) 2, (java.lang.Integer) (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05899");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 7, (java.lang.Integer) (-4), (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05900");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 3, (java.lang.Integer) (-5), (java.lang.Integer) (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05901");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-10), (java.lang.Integer) (-4), (java.lang.Integer) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05902");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) 4, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05903");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-2), (java.lang.Integer) (-6), (java.lang.Integer) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05904");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-3), (java.lang.Integer) (-6), (java.lang.Integer) (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05905");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) (-10), (java.lang.Integer) (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05906");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-8), (java.lang.Integer) 100, (java.lang.Integer) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05907");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) 4, (java.lang.Integer) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05908");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 8, (java.lang.Integer) (-10), (java.lang.Integer) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05909");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 3, (java.lang.Integer) (-100), (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05910");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-5), (java.lang.Integer) (-8), (java.lang.Integer) (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05911");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-6), (java.lang.Integer) 7, (java.lang.Integer) (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05912");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-5), (java.lang.Integer) 7, (java.lang.Integer) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05913");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-7), (java.lang.Integer) 10, (java.lang.Integer) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05914");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 5, (java.lang.Integer) (-1), (java.lang.Integer) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05915");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 2, (java.lang.Integer) (-9), (java.lang.Integer) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05916");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 8, (java.lang.Integer) (-8), (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05917");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) (-7), (java.lang.Integer) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05918");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) 7, (java.lang.Integer) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05919");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) (-100), (java.lang.Integer) (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05920");
        boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 5, (java.lang.Integer) (-10), (java.lang.Integer) 5);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test05921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05921");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 6, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05922");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-100), (java.lang.Integer) 6, (java.lang.Integer) (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05923");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) (-1), (java.lang.Integer) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05924");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 3, (java.lang.Integer) 5, (java.lang.Integer) (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05925");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-2), (java.lang.Integer) (-3), (java.lang.Integer) (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05926");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-8), (java.lang.Integer) 2, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05927");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-100), (java.lang.Integer) 4, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05928");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 7, (java.lang.Integer) 1, (java.lang.Integer) (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05929");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) 6, (java.lang.Integer) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05930");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 3, (java.lang.Integer) (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05931");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 9, (java.lang.Integer) 4, (java.lang.Integer) (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05932");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-7), (java.lang.Integer) 8, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05933");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 2, (java.lang.Integer) (-9), (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05934");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 4, (java.lang.Integer) 9, (java.lang.Integer) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05935");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 7, (java.lang.Integer) (-3), (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05936");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 2, (java.lang.Integer) (-9), (java.lang.Integer) (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05937");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 4, (java.lang.Integer) (-5), (java.lang.Integer) (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05938");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) (-4), (java.lang.Integer) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05939");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 7, (java.lang.Integer) 5, (java.lang.Integer) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05940");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-9), (java.lang.Integer) (-4), (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05941");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-6), (java.lang.Integer) 1, (java.lang.Integer) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05942");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-10), (java.lang.Integer) 100, (java.lang.Integer) (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05943");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-6), (java.lang.Integer) 4, (java.lang.Integer) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05944");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-6), (java.lang.Integer) 1, (java.lang.Integer) (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05945");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-8), (java.lang.Integer) 4, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05946");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-100), (java.lang.Integer) (-2), (java.lang.Integer) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05947");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-5), (java.lang.Integer) (-4), (java.lang.Integer) (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05948");
        boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) 100, (java.lang.Integer) 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test05949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05949");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 6, (java.lang.Integer) (-1), (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05950");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 3, (java.lang.Integer) (-9), (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05951");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-6), (java.lang.Integer) 6, (java.lang.Integer) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05952");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 2, (java.lang.Integer) (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05953");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-7), (java.lang.Integer) (-9), (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05954");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-9), (java.lang.Integer) 2, (java.lang.Integer) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05955");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-10), (java.lang.Integer) 6, (java.lang.Integer) (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05956");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 8, (java.lang.Integer) (-8), (java.lang.Integer) (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05957");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-5), (java.lang.Integer) (-2), (java.lang.Integer) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05958");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-3), (java.lang.Integer) (-1), (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05959");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-100), (java.lang.Integer) (-3), (java.lang.Integer) (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05960");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 9, (java.lang.Integer) (-1), (java.lang.Integer) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05961");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-100), (java.lang.Integer) 3, (java.lang.Integer) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05962");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05963");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-2), (java.lang.Integer) (-10), (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05964");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 6, (java.lang.Integer) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05965");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-8), (java.lang.Integer) (-2), (java.lang.Integer) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05966");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 9, (java.lang.Integer) 1, (java.lang.Integer) (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05967");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-3), (java.lang.Integer) (-10), (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05968");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-100), (java.lang.Integer) 4, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05969");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) (-7), (java.lang.Integer) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05970");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 6, (java.lang.Integer) 10, (java.lang.Integer) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05971");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 9, (java.lang.Integer) (-4), (java.lang.Integer) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05972");
        boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 5, (java.lang.Integer) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test05973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05973");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-9), (java.lang.Integer) 1, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05974");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) (-3), (java.lang.Integer) (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05975");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 6, (java.lang.Integer) 0, (java.lang.Integer) (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05976");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 8, (java.lang.Integer) 10, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05977");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) (-1), (java.lang.Integer) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05978");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 2, (java.lang.Integer) (-8), (java.lang.Integer) (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05979");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-7), (java.lang.Integer) (-6), (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05980");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-8), (java.lang.Integer) 1, (java.lang.Integer) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05981");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 3, (java.lang.Integer) 100, (java.lang.Integer) (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05982");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-9), (java.lang.Integer) (-6), (java.lang.Integer) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05983");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) (-100), (java.lang.Integer) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05984");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) (-4), (java.lang.Integer) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05985");
        boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-2), (java.lang.Integer) (-2), (java.lang.Integer) 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test05986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05986");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 8, (java.lang.Integer) (-5), (java.lang.Integer) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05987");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-7), (java.lang.Integer) 6, (java.lang.Integer) (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05988");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 2, (java.lang.Integer) 5, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05989");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 2, (java.lang.Integer) 100, (java.lang.Integer) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05990");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-2), (java.lang.Integer) (-8), (java.lang.Integer) (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05991");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) (-10), (java.lang.Integer) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05992");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 2, (java.lang.Integer) (-3), (java.lang.Integer) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05993");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-5), (java.lang.Integer) 10, (java.lang.Integer) (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05994");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) (-8), (java.lang.Integer) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05995");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-100), (java.lang.Integer) (-1), (java.lang.Integer) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05996");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-8), (java.lang.Integer) (-4), (java.lang.Integer) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05997");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-5), (java.lang.Integer) 0, (java.lang.Integer) (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05998");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-6), (java.lang.Integer) 7, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05999");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) 2, (java.lang.Integer) (-2), (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test06000");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = lang3.BooleanUtils.toBoolean((java.lang.Integer) (-2), (java.lang.Integer) (-7), (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

