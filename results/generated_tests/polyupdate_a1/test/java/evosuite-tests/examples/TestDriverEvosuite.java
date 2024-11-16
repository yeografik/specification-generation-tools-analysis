package examples;

public class TestDriverEvosuite {

    public static void main(String... args) throws ClassNotFoundException {
        boolean hadFailure = false;
        examples.Polyupdate_ESTest t0 = new examples.Polyupdate_ESTest();


        try {
            t0.test00();
        } catch (Throwable e) {
            hadFailure = true;
            e.printStackTrace();
        }

        try {
            t0.test01();
        } catch (Throwable e) {
            hadFailure = true;
            e.printStackTrace();
        }

        try {
            t0.test02();
        } catch (Throwable e) {
            hadFailure = true;
            e.printStackTrace();
        }

        try {
            t0.test03();
        } catch (Throwable e) {
            hadFailure = true;
            e.printStackTrace();
        }

        try {
            t0.test04();
        } catch (Throwable e) {
            hadFailure = true;
            e.printStackTrace();
        }

        try {
            t0.test05();
        } catch (Throwable e) {
            hadFailure = true;
            e.printStackTrace();
        }

        try {
            t0.test06();
        } catch (Throwable e) {
            hadFailure = true;
            e.printStackTrace();
        }

        try {
            t0.test07();
        } catch (Throwable e) {
            hadFailure = true;
            e.printStackTrace();
        }

        try {
            t0.test08();
        } catch (Throwable e) {
            hadFailure = true;
            e.printStackTrace();
        }

        try {
            t0.test09();
        } catch (Throwable e) {
            hadFailure = true;
            e.printStackTrace();
        }

        try {
            t0.test10();
        } catch (Throwable e) {
            hadFailure = true;
            e.printStackTrace();
        }

        if (hadFailure) {
            Runtime.getRuntime().exit(1);
        }
    }
}
