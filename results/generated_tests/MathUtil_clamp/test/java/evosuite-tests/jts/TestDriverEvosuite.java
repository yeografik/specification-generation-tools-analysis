package jts;

public class TestDriverEvosuite {

    public static void main(String... args) throws ClassNotFoundException {
        boolean hadFailure = false;
        jts.MathUtil_ESTest t0 = new jts.MathUtil_ESTest();


        try {
            t0.test0();
        } catch (Throwable e) {
            hadFailure = true;
            e.printStackTrace();
        }

        try {
            t0.test1();
        } catch (Throwable e) {
            hadFailure = true;
            e.printStackTrace();
        }

        try {
            t0.test2();
        } catch (Throwable e) {
            hadFailure = true;
            e.printStackTrace();
        }

        try {
            t0.test3();
        } catch (Throwable e) {
            hadFailure = true;
            e.printStackTrace();
        }

        try {
            t0.test4();
        } catch (Throwable e) {
            hadFailure = true;
            e.printStackTrace();
        }

        if (hadFailure) {
            Runtime.getRuntime().exit(1);
        }
    }
}
