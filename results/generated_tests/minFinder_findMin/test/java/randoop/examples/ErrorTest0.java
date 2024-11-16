package examples;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        minFinder0.clear();
        minFinder0.clear();
        examples.MinFinder.T t5 = new examples.MinFinder.T((int) 'a');
        int int6 = t5.getVal();
        minFinder0.add(t5);
        examples.MinFinder.T t9 = new examples.MinFinder.T((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t9, 4);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        minFinder0.clear();
        minFinder0.clear();
        examples.MinFinder.T t5 = new examples.MinFinder.T((int) 'a');
        int int6 = t5.getVal();
        minFinder0.add(t5);
        examples.MinFinder minFinder8 = new examples.MinFinder();
        examples.MinFinder.T t9 = minFinder8.findMin();
        minFinder8.clear();
        minFinder8.clear();
        examples.MinFinder.T t13 = new examples.MinFinder.T((int) 'a');
        int int14 = t13.getVal();
        minFinder8.add(t13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t13, 10);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        int int13 = t12.getVal();
        int int14 = t12.getVal();
        int int15 = t12.getVal();
        int int16 = t12.getVal();
        int int17 = t12.getVal();
        int int18 = t12.getVal();
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        int int21 = t20.getVal();
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t1, t3, t10, t12, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        examples.MinFinder minFinder25 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder26 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder27 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder28 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder29 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder30 = new examples.MinFinder(tList23);
        examples.MinFinder.T t32 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t34 = new examples.MinFinder.T((-3));
        int int35 = t34.getVal();
        int int36 = t34.getVal();
        int int37 = t34.getVal();
        int int38 = t34.getVal();
        int int39 = t34.getVal();
        examples.MinFinder.T t41 = new examples.MinFinder.T((-3));
        int int42 = t41.getVal();
        int int43 = t41.getVal();
        int int44 = t41.getVal();
        examples.MinFinder.T t46 = new examples.MinFinder.T((-3));
        int int47 = t46.getVal();
        int int48 = t46.getVal();
        int int49 = t46.getVal();
        int int50 = t46.getVal();
        examples.MinFinder.T t52 = new examples.MinFinder.T((int) '#');
        examples.MinFinder.T t54 = new examples.MinFinder.T((-3));
        int int55 = t54.getVal();
        int int56 = t54.getVal();
        int int57 = t54.getVal();
        int int58 = t54.getVal();
        int int59 = t54.getVal();
        int int60 = t54.getVal();
        examples.MinFinder.T t62 = new examples.MinFinder.T((-3));
        int int63 = t62.getVal();
        int int64 = t62.getVal();
        int int65 = t62.getVal();
        int int66 = t62.getVal();
        int int67 = t62.getVal();
        int int68 = t62.getVal();
        examples.MinFinder.T[] tArray69 = new examples.MinFinder.T[] { t32, t34, t41, t46, t52, t54, t62 };
        java.util.ArrayList<examples.MinFinder.T> tList70 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList70, tArray69);
        examples.MinFinder minFinder72 = new examples.MinFinder(tList70);
        examples.MinFinder.T t74 = new examples.MinFinder.T((-3));
        minFinder72.add(t74);
        examples.MinFinder.T t76 = minFinder72.findMin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder30.chval(t76, (-7));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        int int13 = t12.getVal();
        int int14 = t12.getVal();
        int int15 = t12.getVal();
        int int16 = t12.getVal();
        int int17 = t12.getVal();
        int int18 = t12.getVal();
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        int int21 = t20.getVal();
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t1, t3, t10, t12, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        examples.MinFinder minFinder25 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder26 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder27 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder28 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder29 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder30 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder31 = new examples.MinFinder(tList23);
        examples.MinFinder.T t33 = new examples.MinFinder.T((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder31.chval(t33, 5);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        int int13 = t12.getVal();
        int int14 = t12.getVal();
        int int15 = t12.getVal();
        int int16 = t12.getVal();
        int int17 = t12.getVal();
        int int18 = t12.getVal();
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        int int21 = t20.getVal();
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t1, t3, t10, t12, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        examples.MinFinder minFinder25 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder26 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder27 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder28 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder29 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder30 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder31 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder32 = new examples.MinFinder();
        examples.MinFinder.T t33 = minFinder32.findMin();
        examples.MinFinder.T t35 = new examples.MinFinder.T(3);
        minFinder32.chval(t35, (int) (short) -1);
        examples.MinFinder minFinder38 = new examples.MinFinder();
        examples.MinFinder.T t39 = minFinder38.findMin();
        minFinder38.clear();
        minFinder38.clear();
        examples.MinFinder.T t43 = new examples.MinFinder.T((int) 'a');
        int int44 = t43.getVal();
        minFinder38.add(t43);
        minFinder32.chval(t43, 5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder31.chval(t43, 100);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        minFinder0.clear();
        minFinder0.clear();
        examples.MinFinder.T t5 = new examples.MinFinder.T((int) 'a');
        int int6 = t5.getVal();
        minFinder0.add(t5);
        examples.MinFinder.T t8 = minFinder0.findMin();
        examples.MinFinder minFinder9 = new examples.MinFinder();
        examples.MinFinder.T t10 = minFinder9.findMin();
        minFinder9.clear();
        examples.MinFinder.T t12 = minFinder9.findMin();
        minFinder9.clear();
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        int int16 = t15.getVal();
        int int17 = t15.getVal();
        int int18 = t15.getVal();
        int int19 = t15.getVal();
        minFinder9.chval(t15, 0);
        examples.MinFinder minFinder22 = new examples.MinFinder();
        examples.MinFinder.T t24 = new examples.MinFinder.T((-9));
        int int25 = t24.getVal();
        minFinder22.chval(t24, (-100));
        minFinder9.chval(t24, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t24, 0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        int int13 = t12.getVal();
        int int14 = t12.getVal();
        int int15 = t12.getVal();
        int int16 = t12.getVal();
        int int17 = t12.getVal();
        int int18 = t12.getVal();
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        int int21 = t20.getVal();
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t1, t3, t10, t12, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        examples.MinFinder minFinder25 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder26 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder27 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder28 = new examples.MinFinder();
        examples.MinFinder.T t29 = minFinder28.findMin();
        minFinder28.clear();
        examples.MinFinder.T t31 = minFinder28.findMin();
        minFinder28.clear();
        examples.MinFinder.T t34 = new examples.MinFinder.T((-3));
        int int35 = t34.getVal();
        int int36 = t34.getVal();
        int int37 = t34.getVal();
        int int38 = t34.getVal();
        minFinder28.chval(t34, 0);
        minFinder28.clear();
        examples.MinFinder.T t42 = minFinder28.findMin();
        examples.MinFinder.T t44 = new examples.MinFinder.T((-3));
        boolean boolean46 = t44.equals((java.lang.Object) ' ');
        minFinder28.add(t44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder27.chval(t44, (-4));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t3 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t6 = new examples.MinFinder.T((-3));
        int int7 = t6.getVal();
        int int8 = t6.getVal();
        int int9 = t6.getVal();
        int int10 = t6.getVal();
        minFinder0.chval(t6, 0);
        minFinder0.clear();
        examples.MinFinder.T t14 = minFinder0.findMin();
        examples.MinFinder.T t16 = new examples.MinFinder.T((-3));
        boolean boolean18 = t16.equals((java.lang.Object) ' ');
        minFinder0.add(t16);
        examples.MinFinder.T t20 = minFinder0.findMin();
        examples.MinFinder minFinder21 = new examples.MinFinder();
        examples.MinFinder.T t22 = minFinder21.findMin();
        examples.MinFinder.T t24 = new examples.MinFinder.T(3);
        minFinder21.chval(t24, (int) (short) -1);
        examples.MinFinder minFinder27 = new examples.MinFinder();
        examples.MinFinder.T t28 = minFinder27.findMin();
        examples.MinFinder.T t30 = new examples.MinFinder.T(3);
        minFinder27.chval(t30, (int) (short) -1);
        minFinder21.add(t30);
        examples.MinFinder.T t35 = new examples.MinFinder.T((-9));
        minFinder21.add(t35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t35, 1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        int int13 = t12.getVal();
        int int14 = t12.getVal();
        int int15 = t12.getVal();
        int int16 = t12.getVal();
        int int17 = t12.getVal();
        int int18 = t12.getVal();
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        int int21 = t20.getVal();
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t1, t3, t10, t12, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        examples.MinFinder minFinder25 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder26 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder27 = new examples.MinFinder(tList23);
        examples.MinFinder.T t28 = minFinder27.findMin();
        examples.MinFinder.T t30 = new examples.MinFinder.T((int) (short) 100);
        minFinder27.add(t30);
        examples.MinFinder.T t32 = minFinder27.findMin();
        examples.MinFinder.T t34 = new examples.MinFinder.T((-2));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder27.chval(t34, 4);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        int int13 = t12.getVal();
        int int14 = t12.getVal();
        int int15 = t12.getVal();
        int int16 = t12.getVal();
        int int17 = t12.getVal();
        int int18 = t12.getVal();
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        int int21 = t20.getVal();
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t1, t3, t10, t12, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        examples.MinFinder minFinder25 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder26 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder27 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder28 = new examples.MinFinder();
        examples.MinFinder.T t29 = minFinder28.findMin();
        minFinder28.clear();
        examples.MinFinder.T t31 = minFinder28.findMin();
        examples.MinFinder.T t33 = new examples.MinFinder.T((-1));
        minFinder28.chval(t33, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder27.chval(t33, 3);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t3 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t6 = new examples.MinFinder.T((-3));
        int int7 = t6.getVal();
        int int8 = t6.getVal();
        int int9 = t6.getVal();
        int int10 = t6.getVal();
        minFinder0.chval(t6, 0);
        minFinder0.clear();
        examples.MinFinder minFinder14 = new examples.MinFinder();
        examples.MinFinder.T t15 = minFinder14.findMin();
        examples.MinFinder.T t17 = new examples.MinFinder.T(3);
        minFinder14.chval(t17, (int) (short) -1);
        examples.MinFinder minFinder20 = new examples.MinFinder();
        examples.MinFinder.T t21 = minFinder20.findMin();
        examples.MinFinder.T t23 = new examples.MinFinder.T(3);
        minFinder20.chval(t23, (int) (short) -1);
        minFinder14.add(t23);
        minFinder0.add(t23);
        examples.MinFinder.T t29 = new examples.MinFinder.T((int) (short) 100);
        examples.MinFinder minFinder30 = new examples.MinFinder();
        examples.MinFinder.T t31 = minFinder30.findMin();
        examples.MinFinder.T t33 = new examples.MinFinder.T(3);
        minFinder30.chval(t33, (int) (short) -1);
        examples.MinFinder minFinder36 = new examples.MinFinder();
        examples.MinFinder.T t37 = minFinder36.findMin();
        examples.MinFinder.T t39 = new examples.MinFinder.T(3);
        minFinder36.chval(t39, (int) (short) -1);
        minFinder30.add(t39);
        boolean boolean43 = t29.equals((java.lang.Object) minFinder30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t29, 7);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        int int11 = t10.getVal();
        int int12 = t10.getVal();
        int int13 = t10.getVal();
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        int int16 = t15.getVal();
        int int17 = t15.getVal();
        int int18 = t15.getVal();
        int int19 = t15.getVal();
        examples.MinFinder.T t21 = new examples.MinFinder.T((int) '#');
        examples.MinFinder.T t23 = new examples.MinFinder.T((-3));
        int int24 = t23.getVal();
        int int25 = t23.getVal();
        int int26 = t23.getVal();
        int int27 = t23.getVal();
        int int28 = t23.getVal();
        int int29 = t23.getVal();
        examples.MinFinder.T t31 = new examples.MinFinder.T((-3));
        int int32 = t31.getVal();
        int int33 = t31.getVal();
        int int34 = t31.getVal();
        int int35 = t31.getVal();
        int int36 = t31.getVal();
        int int37 = t31.getVal();
        examples.MinFinder.T[] tArray38 = new examples.MinFinder.T[] { t1, t3, t10, t15, t21, t23, t31 };
        java.util.ArrayList<examples.MinFinder.T> tList39 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList39, tArray38);
        examples.MinFinder minFinder41 = new examples.MinFinder(tList39);
        examples.MinFinder.T t43 = new examples.MinFinder.T((-3));
        minFinder41.add(t43);
        examples.MinFinder.T t46 = new examples.MinFinder.T((int) (short) 100);
        examples.MinFinder minFinder47 = new examples.MinFinder();
        examples.MinFinder.T t48 = minFinder47.findMin();
        examples.MinFinder.T t50 = new examples.MinFinder.T(3);
        minFinder47.chval(t50, (int) (short) -1);
        examples.MinFinder minFinder53 = new examples.MinFinder();
        examples.MinFinder.T t54 = minFinder53.findMin();
        examples.MinFinder.T t56 = new examples.MinFinder.T(3);
        minFinder53.chval(t56, (int) (short) -1);
        minFinder47.add(t56);
        boolean boolean60 = t46.equals((java.lang.Object) minFinder47);
        minFinder47.clear();
        examples.MinFinder.T t63 = new examples.MinFinder.T(3);
        minFinder47.chval(t63, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder41.chval(t63, 3);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t3 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t6 = new examples.MinFinder.T((-3));
        int int7 = t6.getVal();
        int int8 = t6.getVal();
        int int9 = t6.getVal();
        int int10 = t6.getVal();
        minFinder0.chval(t6, 0);
        examples.MinFinder.T t14 = new examples.MinFinder.T((-3));
        boolean boolean16 = t14.equals((java.lang.Object) (-1));
        int int17 = t14.getVal();
        minFinder0.chval(t14, 0);
        examples.MinFinder minFinder20 = new examples.MinFinder();
        examples.MinFinder.T t21 = minFinder20.findMin();
        examples.MinFinder.T t23 = new examples.MinFinder.T(3);
        minFinder20.chval(t23, (int) (short) -1);
        examples.MinFinder minFinder26 = new examples.MinFinder();
        examples.MinFinder.T t27 = minFinder26.findMin();
        examples.MinFinder.T t29 = new examples.MinFinder.T(3);
        minFinder26.chval(t29, (int) (short) -1);
        minFinder20.add(t29);
        examples.MinFinder.T t34 = new examples.MinFinder.T((int) 'a');
        int int35 = t34.getVal();
        minFinder20.add(t34);
        minFinder0.add(t34);
        examples.MinFinder.T t39 = new examples.MinFinder.T(6);
        examples.MinFinder minFinder40 = new examples.MinFinder();
        examples.MinFinder.T t41 = minFinder40.findMin();
        examples.MinFinder.T t43 = new examples.MinFinder.T(3);
        minFinder40.chval(t43, (int) (short) -1);
        examples.MinFinder minFinder46 = new examples.MinFinder();
        examples.MinFinder.T t47 = minFinder46.findMin();
        minFinder46.clear();
        minFinder46.clear();
        examples.MinFinder.T t51 = new examples.MinFinder.T((int) 'a');
        int int52 = t51.getVal();
        minFinder46.add(t51);
        minFinder40.chval(t51, 5);
        examples.MinFinder minFinder56 = new examples.MinFinder();
        examples.MinFinder.T t57 = minFinder56.findMin();
        examples.MinFinder.T t59 = new examples.MinFinder.T(3);
        minFinder56.chval(t59, (int) (short) -1);
        examples.MinFinder minFinder62 = new examples.MinFinder();
        examples.MinFinder.T t63 = minFinder62.findMin();
        examples.MinFinder.T t65 = new examples.MinFinder.T(3);
        minFinder62.chval(t65, (int) (short) -1);
        minFinder56.add(t65);
        examples.MinFinder.T t70 = new examples.MinFinder.T((-9));
        minFinder56.add(t70);
        minFinder40.chval(t70, (-10));
        boolean boolean74 = t39.equals((java.lang.Object) t70);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t39, (int) (short) 1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        int int13 = t12.getVal();
        int int14 = t12.getVal();
        int int15 = t12.getVal();
        int int16 = t12.getVal();
        int int17 = t12.getVal();
        int int18 = t12.getVal();
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        int int21 = t20.getVal();
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t1, t3, t10, t12, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        examples.MinFinder minFinder25 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder26 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder27 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder28 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder29 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder30 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder31 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder32 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder34 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder35 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder36 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder37 = new examples.MinFinder();
        examples.MinFinder.T t38 = minFinder37.findMin();
        minFinder37.clear();
        minFinder37.clear();
        examples.MinFinder.T t42 = new examples.MinFinder.T((int) 'a');
        int int43 = t42.getVal();
        minFinder37.add(t42);
        examples.MinFinder.T t46 = new examples.MinFinder.T(3);
        minFinder37.add(t46);
        examples.MinFinder.T t48 = minFinder37.findMin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder36.chval(t48, 100);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        int int13 = t12.getVal();
        int int14 = t12.getVal();
        int int15 = t12.getVal();
        int int16 = t12.getVal();
        int int17 = t12.getVal();
        int int18 = t12.getVal();
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        int int21 = t20.getVal();
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t1, t3, t10, t12, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        examples.MinFinder minFinder25 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder26 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder27 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder28 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder29 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder30 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder31 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder32 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder34 = new examples.MinFinder(tList23);
        examples.MinFinder.T t36 = new examples.MinFinder.T((int) '#');
        int int37 = t36.getVal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder34.chval(t36, 5);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        int int13 = t12.getVal();
        int int14 = t12.getVal();
        int int15 = t12.getVal();
        int int16 = t12.getVal();
        int int17 = t12.getVal();
        int int18 = t12.getVal();
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        int int21 = t20.getVal();
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t1, t3, t10, t12, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        examples.MinFinder minFinder25 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder26 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder27 = new examples.MinFinder(tList23);
        examples.MinFinder.T t28 = minFinder27.findMin();
        examples.MinFinder.T t30 = new examples.MinFinder.T((int) (short) 100);
        minFinder27.add(t30);
        examples.MinFinder minFinder32 = new examples.MinFinder();
        examples.MinFinder.T t33 = minFinder32.findMin();
        minFinder32.clear();
        examples.MinFinder.T t35 = minFinder32.findMin();
        minFinder32.clear();
        examples.MinFinder.T t38 = new examples.MinFinder.T((-3));
        int int39 = t38.getVal();
        int int40 = t38.getVal();
        int int41 = t38.getVal();
        int int42 = t38.getVal();
        minFinder32.chval(t38, 0);
        minFinder32.clear();
        examples.MinFinder.T t46 = minFinder32.findMin();
        examples.MinFinder.T t48 = new examples.MinFinder.T((-3));
        boolean boolean50 = t48.equals((java.lang.Object) ' ');
        minFinder32.add(t48);
        examples.MinFinder.T t52 = minFinder32.findMin();
        int int53 = t52.getVal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder27.chval(t52, 5);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t2 = new examples.MinFinder.T(100);
        minFinder0.add(t2);
        examples.MinFinder.T t5 = new examples.MinFinder.T((int) (short) 100);
        examples.MinFinder minFinder6 = new examples.MinFinder();
        examples.MinFinder.T t7 = minFinder6.findMin();
        examples.MinFinder.T t9 = new examples.MinFinder.T(3);
        minFinder6.chval(t9, (int) (short) -1);
        examples.MinFinder minFinder12 = new examples.MinFinder();
        examples.MinFinder.T t13 = minFinder12.findMin();
        examples.MinFinder.T t15 = new examples.MinFinder.T(3);
        minFinder12.chval(t15, (int) (short) -1);
        minFinder6.add(t15);
        boolean boolean19 = t5.equals((java.lang.Object) minFinder6);
        examples.MinFinder.T t20 = minFinder6.findMin();
        examples.MinFinder.T t21 = minFinder6.findMin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t21, (-5));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        int int11 = t10.getVal();
        int int12 = t10.getVal();
        int int13 = t10.getVal();
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        int int16 = t15.getVal();
        int int17 = t15.getVal();
        int int18 = t15.getVal();
        int int19 = t15.getVal();
        examples.MinFinder.T t21 = new examples.MinFinder.T((int) '#');
        examples.MinFinder.T t23 = new examples.MinFinder.T((-3));
        int int24 = t23.getVal();
        int int25 = t23.getVal();
        int int26 = t23.getVal();
        int int27 = t23.getVal();
        int int28 = t23.getVal();
        int int29 = t23.getVal();
        examples.MinFinder.T t31 = new examples.MinFinder.T((-3));
        int int32 = t31.getVal();
        int int33 = t31.getVal();
        int int34 = t31.getVal();
        int int35 = t31.getVal();
        int int36 = t31.getVal();
        int int37 = t31.getVal();
        examples.MinFinder.T[] tArray38 = new examples.MinFinder.T[] { t1, t3, t10, t15, t21, t23, t31 };
        java.util.ArrayList<examples.MinFinder.T> tList39 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList39, tArray38);
        examples.MinFinder minFinder41 = new examples.MinFinder(tList39);
        examples.MinFinder.T t43 = new examples.MinFinder.T((-3));
        minFinder41.add(t43);
        examples.MinFinder.T t46 = new examples.MinFinder.T((-3));
        boolean boolean48 = t46.equals((java.lang.Object) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder41.chval(t46, 0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        examples.MinFinder.T t3 = new examples.MinFinder.T(3);
        minFinder0.chval(t3, (int) (short) -1);
        examples.MinFinder minFinder6 = new examples.MinFinder();
        examples.MinFinder.T t7 = minFinder6.findMin();
        examples.MinFinder.T t9 = new examples.MinFinder.T(3);
        minFinder6.chval(t9, (int) (short) -1);
        minFinder0.add(t9);
        examples.MinFinder.T t14 = new examples.MinFinder.T((int) 'a');
        int int15 = t14.getVal();
        minFinder0.add(t14);
        examples.MinFinder.T t17 = minFinder0.findMin();
        examples.MinFinder.T t18 = minFinder0.findMin();
        examples.MinFinder minFinder19 = new examples.MinFinder();
        examples.MinFinder.T t20 = minFinder19.findMin();
        minFinder19.clear();
        minFinder19.clear();
        examples.MinFinder.T t24 = new examples.MinFinder.T((int) 'a');
        int int25 = t24.getVal();
        minFinder19.add(t24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t24, (int) (short) 100);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        examples.MinFinder.T t3 = new examples.MinFinder.T(3);
        minFinder0.chval(t3, (int) (short) -1);
        examples.MinFinder minFinder6 = new examples.MinFinder();
        examples.MinFinder.T t7 = minFinder6.findMin();
        examples.MinFinder.T t9 = new examples.MinFinder.T(3);
        minFinder6.chval(t9, (int) (short) -1);
        minFinder0.add(t9);
        examples.MinFinder.T t14 = new examples.MinFinder.T((-9));
        minFinder0.add(t14);
        examples.MinFinder.T t16 = minFinder0.findMin();
        examples.MinFinder.T t18 = new examples.MinFinder.T(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t18, (-6));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        int int13 = t12.getVal();
        int int14 = t12.getVal();
        int int15 = t12.getVal();
        int int16 = t12.getVal();
        int int17 = t12.getVal();
        int int18 = t12.getVal();
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        int int21 = t20.getVal();
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t1, t3, t10, t12, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        examples.MinFinder minFinder25 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder26 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder27 = new examples.MinFinder(tList23);
        examples.MinFinder.T t28 = minFinder27.findMin();
        examples.MinFinder.T t30 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t32 = new examples.MinFinder.T((-3));
        int int33 = t32.getVal();
        int int34 = t32.getVal();
        int int35 = t32.getVal();
        int int36 = t32.getVal();
        int int37 = t32.getVal();
        examples.MinFinder.T t39 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t41 = new examples.MinFinder.T((-3));
        int int42 = t41.getVal();
        int int43 = t41.getVal();
        int int44 = t41.getVal();
        int int45 = t41.getVal();
        int int46 = t41.getVal();
        int int47 = t41.getVal();
        examples.MinFinder.T t49 = new examples.MinFinder.T((int) 'a');
        int int50 = t49.getVal();
        examples.MinFinder.T[] tArray51 = new examples.MinFinder.T[] { t30, t32, t39, t41, t49 };
        java.util.ArrayList<examples.MinFinder.T> tList52 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList52, tArray51);
        examples.MinFinder minFinder54 = new examples.MinFinder(tList52);
        examples.MinFinder minFinder55 = new examples.MinFinder(tList52);
        examples.MinFinder.T t56 = minFinder55.findMin();
        examples.MinFinder minFinder57 = new examples.MinFinder();
        examples.MinFinder.T t58 = minFinder57.findMin();
        minFinder57.clear();
        examples.MinFinder.T t60 = minFinder57.findMin();
        minFinder57.clear();
        examples.MinFinder.T t63 = new examples.MinFinder.T((-3));
        int int64 = t63.getVal();
        int int65 = t63.getVal();
        int int66 = t63.getVal();
        int int67 = t63.getVal();
        minFinder57.chval(t63, 0);
        minFinder57.clear();
        examples.MinFinder.T t71 = minFinder57.findMin();
        examples.MinFinder.T t73 = new examples.MinFinder.T((-3));
        boolean boolean75 = t73.equals((java.lang.Object) ' ');
        minFinder57.add(t73);
        examples.MinFinder.T t77 = minFinder57.findMin();
        java.lang.Object obj78 = new java.lang.Object();
        boolean boolean79 = t77.equals(obj78);
        minFinder55.add(t77);
        examples.MinFinder.T t81 = minFinder55.findMin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder27.chval(t81, (int) (short) 10);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        int int11 = t10.getVal();
        int int12 = t10.getVal();
        int int13 = t10.getVal();
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        int int16 = t15.getVal();
        int int17 = t15.getVal();
        int int18 = t15.getVal();
        int int19 = t15.getVal();
        examples.MinFinder.T t21 = new examples.MinFinder.T((int) '#');
        examples.MinFinder.T t23 = new examples.MinFinder.T((-3));
        int int24 = t23.getVal();
        int int25 = t23.getVal();
        int int26 = t23.getVal();
        int int27 = t23.getVal();
        int int28 = t23.getVal();
        int int29 = t23.getVal();
        examples.MinFinder.T t31 = new examples.MinFinder.T((-3));
        int int32 = t31.getVal();
        int int33 = t31.getVal();
        int int34 = t31.getVal();
        int int35 = t31.getVal();
        int int36 = t31.getVal();
        int int37 = t31.getVal();
        examples.MinFinder.T[] tArray38 = new examples.MinFinder.T[] { t1, t3, t10, t15, t21, t23, t31 };
        java.util.ArrayList<examples.MinFinder.T> tList39 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList39, tArray38);
        examples.MinFinder minFinder41 = new examples.MinFinder(tList39);
        examples.MinFinder.T t43 = new examples.MinFinder.T((-3));
        minFinder41.add(t43);
        examples.MinFinder.T t45 = minFinder41.findMin();
        examples.MinFinder.T t47 = new examples.MinFinder.T((int) (short) 0);
        int int48 = t47.getVal();
        minFinder41.add(t47);
        examples.MinFinder minFinder50 = new examples.MinFinder();
        examples.MinFinder.T t51 = minFinder50.findMin();
        minFinder50.clear();
        minFinder50.clear();
        examples.MinFinder.T t55 = new examples.MinFinder.T((int) 'a');
        int int56 = t55.getVal();
        minFinder50.add(t55);
        int int58 = t55.getVal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder41.chval(t55, (-7));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t3 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t6 = new examples.MinFinder.T((-3));
        int int7 = t6.getVal();
        int int8 = t6.getVal();
        int int9 = t6.getVal();
        int int10 = t6.getVal();
        minFinder0.chval(t6, 0);
        minFinder0.clear();
        examples.MinFinder.T t14 = minFinder0.findMin();
        examples.MinFinder.T t16 = new examples.MinFinder.T((-3));
        boolean boolean18 = t16.equals((java.lang.Object) ' ');
        minFinder0.add(t16);
        examples.MinFinder.T t21 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t23 = new examples.MinFinder.T((-3));
        int int24 = t23.getVal();
        int int25 = t23.getVal();
        int int26 = t23.getVal();
        int int27 = t23.getVal();
        int int28 = t23.getVal();
        examples.MinFinder.T t30 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t32 = new examples.MinFinder.T((-3));
        int int33 = t32.getVal();
        int int34 = t32.getVal();
        int int35 = t32.getVal();
        int int36 = t32.getVal();
        int int37 = t32.getVal();
        int int38 = t32.getVal();
        examples.MinFinder.T t40 = new examples.MinFinder.T((int) 'a');
        int int41 = t40.getVal();
        examples.MinFinder.T[] tArray42 = new examples.MinFinder.T[] { t21, t23, t30, t32, t40 };
        java.util.ArrayList<examples.MinFinder.T> tList43 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList43, tArray42);
        examples.MinFinder minFinder45 = new examples.MinFinder(tList43);
        examples.MinFinder minFinder46 = new examples.MinFinder(tList43);
        examples.MinFinder minFinder47 = new examples.MinFinder(tList43);
        examples.MinFinder minFinder48 = new examples.MinFinder(tList43);
        examples.MinFinder minFinder49 = new examples.MinFinder(tList43);
        examples.MinFinder minFinder50 = new examples.MinFinder(tList43);
        examples.MinFinder minFinder51 = new examples.MinFinder(tList43);
        examples.MinFinder minFinder52 = new examples.MinFinder(tList43);
        examples.MinFinder.T t54 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t56 = new examples.MinFinder.T((-3));
        int int57 = t56.getVal();
        int int58 = t56.getVal();
        int int59 = t56.getVal();
        int int60 = t56.getVal();
        int int61 = t56.getVal();
        examples.MinFinder.T t63 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t65 = new examples.MinFinder.T((-3));
        int int66 = t65.getVal();
        int int67 = t65.getVal();
        int int68 = t65.getVal();
        int int69 = t65.getVal();
        int int70 = t65.getVal();
        int int71 = t65.getVal();
        examples.MinFinder.T t73 = new examples.MinFinder.T((int) 'a');
        int int74 = t73.getVal();
        examples.MinFinder.T[] tArray75 = new examples.MinFinder.T[] { t54, t56, t63, t65, t73 };
        java.util.ArrayList<examples.MinFinder.T> tList76 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList76, tArray75);
        examples.MinFinder minFinder78 = new examples.MinFinder(tList76);
        examples.MinFinder minFinder79 = new examples.MinFinder(tList76);
        examples.MinFinder minFinder80 = new examples.MinFinder(tList76);
        examples.MinFinder.T t81 = minFinder80.findMin();
        int int82 = t81.getVal();
        minFinder52.add(t81);
        examples.MinFinder.T t84 = minFinder52.findMin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t84, 10);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        minFinder0.clear();
        minFinder0.clear();
        examples.MinFinder.T t5 = new examples.MinFinder.T((int) 'a');
        int int6 = t5.getVal();
        minFinder0.add(t5);
        examples.MinFinder minFinder8 = new examples.MinFinder();
        examples.MinFinder.T t9 = minFinder8.findMin();
        minFinder8.clear();
        examples.MinFinder.T t11 = minFinder8.findMin();
        minFinder8.clear();
        examples.MinFinder.T t14 = new examples.MinFinder.T((-3));
        int int15 = t14.getVal();
        int int16 = t14.getVal();
        int int17 = t14.getVal();
        int int18 = t14.getVal();
        minFinder8.chval(t14, 0);
        minFinder8.clear();
        examples.MinFinder.T t22 = minFinder8.findMin();
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        boolean boolean26 = t24.equals((java.lang.Object) ' ');
        minFinder8.add(t24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t24, 2);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t3 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t6 = new examples.MinFinder.T((-3));
        int int7 = t6.getVal();
        int int8 = t6.getVal();
        int int9 = t6.getVal();
        int int10 = t6.getVal();
        minFinder0.chval(t6, 0);
        examples.MinFinder.T t14 = new examples.MinFinder.T((-3));
        int int15 = t14.getVal();
        int int16 = t14.getVal();
        int int17 = t14.getVal();
        minFinder0.add(t14);
        examples.MinFinder minFinder19 = new examples.MinFinder();
        examples.MinFinder.T t20 = minFinder19.findMin();
        minFinder19.clear();
        minFinder19.clear();
        examples.MinFinder.T t24 = new examples.MinFinder.T((int) 'a');
        int int25 = t24.getVal();
        minFinder19.add(t24);
        minFinder19.clear();
        examples.MinFinder.T t29 = new examples.MinFinder.T((int) 'a');
        minFinder19.add(t29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t29, (int) (short) 100);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        int int13 = t12.getVal();
        int int14 = t12.getVal();
        int int15 = t12.getVal();
        int int16 = t12.getVal();
        int int17 = t12.getVal();
        int int18 = t12.getVal();
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        int int21 = t20.getVal();
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t1, t3, t10, t12, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        examples.MinFinder minFinder25 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder26 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder27 = new examples.MinFinder();
        examples.MinFinder.T t28 = minFinder27.findMin();
        examples.MinFinder.T t30 = new examples.MinFinder.T(3);
        minFinder27.chval(t30, (int) (short) -1);
        examples.MinFinder.T t34 = new examples.MinFinder.T((-3));
        int int35 = t34.getVal();
        int int36 = t34.getVal();
        int int37 = t34.getVal();
        int int38 = t34.getVal();
        int int39 = t34.getVal();
        int int40 = t34.getVal();
        boolean boolean42 = t34.equals((java.lang.Object) (-8.7d));
        minFinder27.chval(t34, (-100));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder26.chval(t34, 2);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t2 = new examples.MinFinder.T((-9));
        int int3 = t2.getVal();
        minFinder0.chval(t2, (-100));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t9 = new examples.MinFinder.T((-3));
        int int10 = t9.getVal();
        int int11 = t9.getVal();
        int int12 = t9.getVal();
        int int13 = t9.getVal();
        int int14 = t9.getVal();
        examples.MinFinder.T t16 = new examples.MinFinder.T((-3));
        int int17 = t16.getVal();
        int int18 = t16.getVal();
        int int19 = t16.getVal();
        examples.MinFinder.T t21 = new examples.MinFinder.T((-3));
        int int22 = t21.getVal();
        int int23 = t21.getVal();
        int int24 = t21.getVal();
        int int25 = t21.getVal();
        examples.MinFinder.T t27 = new examples.MinFinder.T((int) '#');
        examples.MinFinder.T t29 = new examples.MinFinder.T((-3));
        int int30 = t29.getVal();
        int int31 = t29.getVal();
        int int32 = t29.getVal();
        int int33 = t29.getVal();
        int int34 = t29.getVal();
        int int35 = t29.getVal();
        examples.MinFinder.T t37 = new examples.MinFinder.T((-3));
        int int38 = t37.getVal();
        int int39 = t37.getVal();
        int int40 = t37.getVal();
        int int41 = t37.getVal();
        int int42 = t37.getVal();
        int int43 = t37.getVal();
        examples.MinFinder.T[] tArray44 = new examples.MinFinder.T[] { t7, t9, t16, t21, t27, t29, t37 };
        java.util.ArrayList<examples.MinFinder.T> tList45 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList45, tArray44);
        examples.MinFinder minFinder47 = new examples.MinFinder(tList45);
        minFinder47.clear();
        examples.MinFinder minFinder49 = new examples.MinFinder();
        examples.MinFinder.T t50 = minFinder49.findMin();
        minFinder49.clear();
        examples.MinFinder.T t52 = minFinder49.findMin();
        minFinder49.clear();
        minFinder49.clear();
        examples.MinFinder.T t56 = new examples.MinFinder.T((-9));
        int int57 = t56.getVal();
        minFinder49.chval(t56, 10);
        examples.MinFinder minFinder60 = new examples.MinFinder();
        examples.MinFinder.T t61 = minFinder60.findMin();
        minFinder60.clear();
        examples.MinFinder.T t63 = minFinder60.findMin();
        minFinder60.clear();
        examples.MinFinder.T t66 = new examples.MinFinder.T((-3));
        int int67 = t66.getVal();
        int int68 = t66.getVal();
        int int69 = t66.getVal();
        int int70 = t66.getVal();
        minFinder60.chval(t66, 0);
        minFinder49.add(t66);
        minFinder47.add(t66);
        minFinder0.add(t66);
        examples.MinFinder.T t77 = new examples.MinFinder.T((-9));
        int int78 = t77.getVal();
        int int79 = t77.getVal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t77, (int) (short) 100);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        minFinder0.clear();
        minFinder0.clear();
        examples.MinFinder.T t5 = new examples.MinFinder.T((int) 'a');
        int int6 = t5.getVal();
        minFinder0.add(t5);
        minFinder0.clear();
        examples.MinFinder.T t10 = new examples.MinFinder.T((int) 'a');
        minFinder0.add(t10);
        examples.MinFinder.T t13 = new examples.MinFinder.T((-3));
        minFinder0.add(t13);
        examples.MinFinder minFinder15 = new examples.MinFinder();
        examples.MinFinder.T t16 = minFinder15.findMin();
        minFinder15.clear();
        examples.MinFinder.T t18 = minFinder15.findMin();
        minFinder15.clear();
        examples.MinFinder.T t21 = new examples.MinFinder.T((-3));
        int int22 = t21.getVal();
        int int23 = t21.getVal();
        int int24 = t21.getVal();
        int int25 = t21.getVal();
        minFinder15.chval(t21, 0);
        minFinder15.clear();
        examples.MinFinder minFinder29 = new examples.MinFinder();
        examples.MinFinder.T t30 = minFinder29.findMin();
        examples.MinFinder.T t32 = new examples.MinFinder.T(3);
        minFinder29.chval(t32, (int) (short) -1);
        examples.MinFinder minFinder35 = new examples.MinFinder();
        examples.MinFinder.T t36 = minFinder35.findMin();
        examples.MinFinder.T t38 = new examples.MinFinder.T(3);
        minFinder35.chval(t38, (int) (short) -1);
        minFinder29.add(t38);
        minFinder29.clear();
        examples.MinFinder.T t44 = new examples.MinFinder.T((int) (short) 0);
        minFinder29.chval(t44, (int) '4');
        minFinder15.add(t44);
        examples.MinFinder.T t49 = new examples.MinFinder.T((-3));
        int int50 = t49.getVal();
        int int51 = t49.getVal();
        int int52 = t49.getVal();
        int int53 = t49.getVal();
        boolean boolean54 = t44.equals((java.lang.Object) t49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t44, (int) (short) -1);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t3 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t5 = minFinder0.findMin();
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        boolean boolean9 = t7.equals((java.lang.Object) (-1));
        examples.MinFinder minFinder10 = new examples.MinFinder();
        examples.MinFinder.T t11 = minFinder10.findMin();
        examples.MinFinder.T t13 = new examples.MinFinder.T(3);
        minFinder10.chval(t13, (int) (short) -1);
        examples.MinFinder.T t17 = new examples.MinFinder.T((-3));
        int int18 = t17.getVal();
        int int19 = t17.getVal();
        int int20 = t17.getVal();
        int int21 = t17.getVal();
        int int22 = t17.getVal();
        int int23 = t17.getVal();
        boolean boolean25 = t17.equals((java.lang.Object) (-8.7d));
        minFinder10.chval(t17, (-100));
        boolean boolean28 = t7.equals((java.lang.Object) t17);
        minFinder0.add(t17);
        examples.MinFinder minFinder30 = new examples.MinFinder();
        examples.MinFinder.T t31 = minFinder30.findMin();
        minFinder30.clear();
        examples.MinFinder.T t33 = minFinder30.findMin();
        minFinder30.clear();
        examples.MinFinder.T t36 = new examples.MinFinder.T((-3));
        int int37 = t36.getVal();
        int int38 = t36.getVal();
        int int39 = t36.getVal();
        int int40 = t36.getVal();
        minFinder30.chval(t36, 0);
        minFinder30.clear();
        examples.MinFinder.T t44 = minFinder30.findMin();
        minFinder30.clear();
        minFinder30.clear();
        examples.MinFinder minFinder47 = new examples.MinFinder();
        examples.MinFinder.T t48 = minFinder47.findMin();
        minFinder47.clear();
        examples.MinFinder.T t50 = minFinder47.findMin();
        examples.MinFinder.T t52 = new examples.MinFinder.T((-1));
        minFinder47.chval(t52, 100);
        boolean boolean56 = t52.equals((java.lang.Object) 5L);
        minFinder30.add(t52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t52, 6);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        int int13 = t12.getVal();
        int int14 = t12.getVal();
        int int15 = t12.getVal();
        int int16 = t12.getVal();
        int int17 = t12.getVal();
        int int18 = t12.getVal();
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        int int21 = t20.getVal();
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t1, t3, t10, t12, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        examples.MinFinder minFinder25 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder26 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder27 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder28 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder29 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder30 = new examples.MinFinder();
        examples.MinFinder.T t31 = minFinder30.findMin();
        minFinder30.clear();
        examples.MinFinder.T t33 = minFinder30.findMin();
        minFinder30.clear();
        examples.MinFinder.T t36 = new examples.MinFinder.T((-3));
        int int37 = t36.getVal();
        int int38 = t36.getVal();
        int int39 = t36.getVal();
        int int40 = t36.getVal();
        minFinder30.chval(t36, 0);
        examples.MinFinder.T t44 = new examples.MinFinder.T((-3));
        boolean boolean46 = t44.equals((java.lang.Object) (-1));
        int int47 = t44.getVal();
        minFinder30.chval(t44, 0);
        minFinder29.add(t44);
        examples.MinFinder.T t51 = minFinder29.findMin();
        examples.MinFinder.T t52 = minFinder29.findMin();
        examples.MinFinder.T t54 = new examples.MinFinder.T((int) (short) 0);
        int int55 = t54.getVal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder29.chval(t54, 0);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        int int11 = t10.getVal();
        int int12 = t10.getVal();
        int int13 = t10.getVal();
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        int int16 = t15.getVal();
        int int17 = t15.getVal();
        int int18 = t15.getVal();
        int int19 = t15.getVal();
        examples.MinFinder.T t21 = new examples.MinFinder.T((int) '#');
        examples.MinFinder.T t23 = new examples.MinFinder.T((-3));
        int int24 = t23.getVal();
        int int25 = t23.getVal();
        int int26 = t23.getVal();
        int int27 = t23.getVal();
        int int28 = t23.getVal();
        int int29 = t23.getVal();
        examples.MinFinder.T t31 = new examples.MinFinder.T((-3));
        int int32 = t31.getVal();
        int int33 = t31.getVal();
        int int34 = t31.getVal();
        int int35 = t31.getVal();
        int int36 = t31.getVal();
        int int37 = t31.getVal();
        examples.MinFinder.T[] tArray38 = new examples.MinFinder.T[] { t1, t3, t10, t15, t21, t23, t31 };
        java.util.ArrayList<examples.MinFinder.T> tList39 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList39, tArray38);
        examples.MinFinder minFinder41 = new examples.MinFinder(tList39);
        examples.MinFinder minFinder42 = new examples.MinFinder(tList39);
        examples.MinFinder minFinder43 = new examples.MinFinder(tList39);
        examples.MinFinder.T t44 = minFinder43.findMin();
        examples.MinFinder.T t46 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t48 = new examples.MinFinder.T((-3));
        int int49 = t48.getVal();
        int int50 = t48.getVal();
        int int51 = t48.getVal();
        int int52 = t48.getVal();
        int int53 = t48.getVal();
        examples.MinFinder.T t55 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t57 = new examples.MinFinder.T((-3));
        int int58 = t57.getVal();
        int int59 = t57.getVal();
        int int60 = t57.getVal();
        int int61 = t57.getVal();
        int int62 = t57.getVal();
        int int63 = t57.getVal();
        examples.MinFinder.T t65 = new examples.MinFinder.T((int) 'a');
        int int66 = t65.getVal();
        examples.MinFinder.T[] tArray67 = new examples.MinFinder.T[] { t46, t48, t55, t57, t65 };
        java.util.ArrayList<examples.MinFinder.T> tList68 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList68, tArray67);
        examples.MinFinder minFinder70 = new examples.MinFinder(tList68);
        minFinder70.clear();
        examples.MinFinder.T t73 = new examples.MinFinder.T((int) (short) 100);
        examples.MinFinder minFinder74 = new examples.MinFinder();
        examples.MinFinder.T t75 = minFinder74.findMin();
        examples.MinFinder.T t77 = new examples.MinFinder.T(3);
        minFinder74.chval(t77, (int) (short) -1);
        examples.MinFinder minFinder80 = new examples.MinFinder();
        examples.MinFinder.T t81 = minFinder80.findMin();
        examples.MinFinder.T t83 = new examples.MinFinder.T(3);
        minFinder80.chval(t83, (int) (short) -1);
        minFinder74.add(t83);
        boolean boolean87 = t73.equals((java.lang.Object) minFinder74);
        examples.MinFinder.T t88 = minFinder74.findMin();
        minFinder70.add(t88);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder43.chval(t88, (-5));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t3 = minFinder0.findMin();
        minFinder0.clear();
        minFinder0.clear();
        minFinder0.clear();
        examples.MinFinder minFinder7 = new examples.MinFinder();
        examples.MinFinder.T t8 = minFinder7.findMin();
        minFinder7.clear();
        examples.MinFinder.T t10 = minFinder7.findMin();
        minFinder7.clear();
        examples.MinFinder.T t13 = new examples.MinFinder.T((-3));
        int int14 = t13.getVal();
        int int15 = t13.getVal();
        int int16 = t13.getVal();
        int int17 = t13.getVal();
        int int18 = t13.getVal();
        int int19 = t13.getVal();
        minFinder7.chval(t13, (int) ' ');
        minFinder0.add(t13);
        examples.MinFinder.T t23 = minFinder0.findMin();
        examples.MinFinder.T t25 = new examples.MinFinder.T((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t25, (-9));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        int int13 = t12.getVal();
        int int14 = t12.getVal();
        int int15 = t12.getVal();
        int int16 = t12.getVal();
        int int17 = t12.getVal();
        int int18 = t12.getVal();
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        int int21 = t20.getVal();
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t1, t3, t10, t12, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        examples.MinFinder minFinder25 = new examples.MinFinder(tList23);
        minFinder25.clear();
        examples.MinFinder.T t28 = new examples.MinFinder.T((int) (short) 100);
        examples.MinFinder minFinder29 = new examples.MinFinder();
        examples.MinFinder.T t30 = minFinder29.findMin();
        examples.MinFinder.T t32 = new examples.MinFinder.T(3);
        minFinder29.chval(t32, (int) (short) -1);
        examples.MinFinder minFinder35 = new examples.MinFinder();
        examples.MinFinder.T t36 = minFinder35.findMin();
        examples.MinFinder.T t38 = new examples.MinFinder.T(3);
        minFinder35.chval(t38, (int) (short) -1);
        minFinder29.add(t38);
        boolean boolean42 = t28.equals((java.lang.Object) minFinder29);
        examples.MinFinder.T t43 = minFinder29.findMin();
        minFinder25.add(t43);
        examples.MinFinder.T t46 = new examples.MinFinder.T((int) (short) 100);
        examples.MinFinder minFinder47 = new examples.MinFinder();
        examples.MinFinder.T t48 = minFinder47.findMin();
        examples.MinFinder.T t50 = new examples.MinFinder.T(3);
        minFinder47.chval(t50, (int) (short) -1);
        examples.MinFinder minFinder53 = new examples.MinFinder();
        examples.MinFinder.T t54 = minFinder53.findMin();
        examples.MinFinder.T t56 = new examples.MinFinder.T(3);
        minFinder53.chval(t56, (int) (short) -1);
        minFinder47.add(t56);
        boolean boolean60 = t46.equals((java.lang.Object) minFinder47);
        examples.MinFinder.T t62 = new examples.MinFinder.T((int) 'a');
        int int63 = t62.getVal();
        minFinder47.add(t62);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder25.chval(t62, 3);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        int int13 = t12.getVal();
        int int14 = t12.getVal();
        int int15 = t12.getVal();
        int int16 = t12.getVal();
        int int17 = t12.getVal();
        int int18 = t12.getVal();
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        int int21 = t20.getVal();
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t1, t3, t10, t12, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        examples.MinFinder minFinder25 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder26 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder27 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder28 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder29 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder30 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder31 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder32 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder34 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder35 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder36 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder37 = new examples.MinFinder(tList23);
        examples.MinFinder.T t38 = minFinder37.findMin();
        examples.MinFinder minFinder39 = new examples.MinFinder();
        examples.MinFinder.T t40 = minFinder39.findMin();
        minFinder39.clear();
        examples.MinFinder.T t42 = minFinder39.findMin();
        minFinder39.clear();
        examples.MinFinder.T t44 = minFinder39.findMin();
        examples.MinFinder.T t45 = minFinder39.findMin();
        examples.MinFinder minFinder46 = new examples.MinFinder();
        examples.MinFinder.T t47 = minFinder46.findMin();
        minFinder46.clear();
        minFinder46.clear();
        examples.MinFinder.T t51 = new examples.MinFinder.T((int) 'a');
        int int52 = t51.getVal();
        minFinder46.add(t51);
        examples.MinFinder.T t55 = new examples.MinFinder.T(3);
        minFinder46.add(t55);
        examples.MinFinder.T t57 = minFinder46.findMin();
        minFinder46.clear();
        examples.MinFinder.T t60 = new examples.MinFinder.T((-3));
        boolean boolean62 = t60.equals((java.lang.Object) ' ');
        minFinder46.add(t60);
        minFinder39.chval(t60, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder37.chval(t60, (-8));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t3 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t6 = new examples.MinFinder.T((-3));
        int int7 = t6.getVal();
        int int8 = t6.getVal();
        int int9 = t6.getVal();
        int int10 = t6.getVal();
        minFinder0.chval(t6, 0);
        minFinder0.clear();
        examples.MinFinder.T t14 = minFinder0.findMin();
        examples.MinFinder.T t15 = minFinder0.findMin();
        examples.MinFinder.T t17 = new examples.MinFinder.T((int) (short) 100);
        examples.MinFinder minFinder18 = new examples.MinFinder();
        examples.MinFinder.T t19 = minFinder18.findMin();
        examples.MinFinder.T t21 = new examples.MinFinder.T(3);
        minFinder18.chval(t21, (int) (short) -1);
        examples.MinFinder minFinder24 = new examples.MinFinder();
        examples.MinFinder.T t25 = minFinder24.findMin();
        examples.MinFinder.T t27 = new examples.MinFinder.T(3);
        minFinder24.chval(t27, (int) (short) -1);
        minFinder18.add(t27);
        boolean boolean31 = t17.equals((java.lang.Object) minFinder18);
        minFinder0.add(t17);
        examples.MinFinder.T t34 = new examples.MinFinder.T((-3));
        int int35 = t34.getVal();
        examples.MinFinder minFinder36 = new examples.MinFinder();
        examples.MinFinder.T t38 = new examples.MinFinder.T((-3));
        int int39 = t38.getVal();
        int int40 = t38.getVal();
        int int41 = t38.getVal();
        int int42 = t38.getVal();
        int int43 = t38.getVal();
        minFinder36.chval(t38, (int) ' ');
        examples.MinFinder.T t47 = new examples.MinFinder.T((-9));
        boolean boolean49 = t47.equals((java.lang.Object) 6);
        minFinder36.chval(t47, 97);
        boolean boolean52 = t34.equals((java.lang.Object) t47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t34, 35);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        int int13 = t12.getVal();
        int int14 = t12.getVal();
        int int15 = t12.getVal();
        int int16 = t12.getVal();
        int int17 = t12.getVal();
        int int18 = t12.getVal();
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        int int21 = t20.getVal();
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t1, t3, t10, t12, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        examples.MinFinder minFinder25 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder26 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder27 = new examples.MinFinder(tList23);
        examples.MinFinder.T t28 = minFinder27.findMin();
        examples.MinFinder.T t30 = new examples.MinFinder.T((int) (short) 100);
        minFinder27.add(t30);
        examples.MinFinder.T t32 = minFinder27.findMin();
        examples.MinFinder minFinder33 = new examples.MinFinder();
        examples.MinFinder.T t34 = minFinder33.findMin();
        minFinder33.clear();
        examples.MinFinder.T t36 = minFinder33.findMin();
        minFinder33.clear();
        examples.MinFinder.T t39 = new examples.MinFinder.T((-3));
        int int40 = t39.getVal();
        int int41 = t39.getVal();
        int int42 = t39.getVal();
        int int43 = t39.getVal();
        minFinder33.chval(t39, 0);
        minFinder33.clear();
        examples.MinFinder minFinder47 = new examples.MinFinder();
        examples.MinFinder.T t48 = minFinder47.findMin();
        examples.MinFinder.T t50 = new examples.MinFinder.T(3);
        minFinder47.chval(t50, (int) (short) -1);
        examples.MinFinder minFinder53 = new examples.MinFinder();
        examples.MinFinder.T t54 = minFinder53.findMin();
        examples.MinFinder.T t56 = new examples.MinFinder.T(3);
        minFinder53.chval(t56, (int) (short) -1);
        minFinder47.add(t56);
        minFinder47.clear();
        examples.MinFinder.T t62 = new examples.MinFinder.T((int) (short) 0);
        minFinder47.chval(t62, (int) '4');
        minFinder33.add(t62);
        examples.MinFinder.T t67 = new examples.MinFinder.T((-3));
        int int68 = t67.getVal();
        int int69 = t67.getVal();
        int int70 = t67.getVal();
        int int71 = t67.getVal();
        boolean boolean72 = t62.equals((java.lang.Object) t67);
        int int73 = t67.getVal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder27.chval(t67, 0);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        int int13 = t12.getVal();
        int int14 = t12.getVal();
        int int15 = t12.getVal();
        int int16 = t12.getVal();
        int int17 = t12.getVal();
        int int18 = t12.getVal();
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        int int21 = t20.getVal();
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t1, t3, t10, t12, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        examples.MinFinder minFinder25 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder26 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder27 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder28 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder29 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder30 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder31 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder32 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder34 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder35 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder36 = new examples.MinFinder();
        examples.MinFinder.T t37 = minFinder36.findMin();
        minFinder36.clear();
        examples.MinFinder.T t39 = minFinder36.findMin();
        minFinder36.clear();
        examples.MinFinder.T t42 = new examples.MinFinder.T((-3));
        int int43 = t42.getVal();
        int int44 = t42.getVal();
        int int45 = t42.getVal();
        int int46 = t42.getVal();
        minFinder36.chval(t42, 0);
        examples.MinFinder.T t50 = new examples.MinFinder.T((int) (short) 100);
        examples.MinFinder minFinder51 = new examples.MinFinder();
        examples.MinFinder.T t52 = minFinder51.findMin();
        examples.MinFinder.T t54 = new examples.MinFinder.T(3);
        minFinder51.chval(t54, (int) (short) -1);
        examples.MinFinder minFinder57 = new examples.MinFinder();
        examples.MinFinder.T t58 = minFinder57.findMin();
        examples.MinFinder.T t60 = new examples.MinFinder.T(3);
        minFinder57.chval(t60, (int) (short) -1);
        minFinder51.add(t60);
        boolean boolean64 = t50.equals((java.lang.Object) minFinder51);
        minFinder51.clear();
        examples.MinFinder.T t67 = new examples.MinFinder.T(3);
        minFinder51.chval(t67, 1);
        minFinder36.add(t67);
        minFinder35.add(t67);
        examples.MinFinder minFinder72 = new examples.MinFinder();
        examples.MinFinder.T t74 = new examples.MinFinder.T((-3));
        int int75 = t74.getVal();
        int int76 = t74.getVal();
        int int77 = t74.getVal();
        int int78 = t74.getVal();
        int int79 = t74.getVal();
        minFinder72.chval(t74, (int) ' ');
        examples.MinFinder.T t83 = new examples.MinFinder.T((-9));
        boolean boolean85 = t83.equals((java.lang.Object) 6);
        minFinder72.chval(t83, 97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder35.chval(t83, (int) (short) 10);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t3 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t6 = new examples.MinFinder.T((-3));
        int int7 = t6.getVal();
        int int8 = t6.getVal();
        int int9 = t6.getVal();
        int int10 = t6.getVal();
        minFinder0.chval(t6, 0);
        examples.MinFinder.T t14 = new examples.MinFinder.T((-3));
        int int15 = t14.getVal();
        int int16 = t14.getVal();
        int int17 = t14.getVal();
        minFinder0.add(t14);
        examples.MinFinder.T t19 = minFinder0.findMin();
        examples.MinFinder minFinder20 = new examples.MinFinder();
        examples.MinFinder.T t21 = minFinder20.findMin();
        minFinder20.clear();
        examples.MinFinder.T t23 = minFinder20.findMin();
        minFinder20.clear();
        minFinder20.clear();
        minFinder20.clear();
        examples.MinFinder minFinder27 = new examples.MinFinder();
        examples.MinFinder.T t28 = minFinder27.findMin();
        minFinder27.clear();
        examples.MinFinder.T t30 = minFinder27.findMin();
        minFinder27.clear();
        examples.MinFinder.T t33 = new examples.MinFinder.T((-3));
        int int34 = t33.getVal();
        int int35 = t33.getVal();
        int int36 = t33.getVal();
        int int37 = t33.getVal();
        int int38 = t33.getVal();
        int int39 = t33.getVal();
        minFinder27.chval(t33, (int) ' ');
        minFinder20.add(t33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t33, (int) (byte) 0);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t3 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t6 = new examples.MinFinder.T((-3));
        int int7 = t6.getVal();
        int int8 = t6.getVal();
        int int9 = t6.getVal();
        int int10 = t6.getVal();
        minFinder0.chval(t6, 0);
        examples.MinFinder.T t14 = new examples.MinFinder.T((-3));
        boolean boolean16 = t14.equals((java.lang.Object) (-1));
        int int17 = t14.getVal();
        minFinder0.chval(t14, 0);
        examples.MinFinder.T t21 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t23 = new examples.MinFinder.T((-3));
        int int24 = t23.getVal();
        int int25 = t23.getVal();
        int int26 = t23.getVal();
        int int27 = t23.getVal();
        int int28 = t23.getVal();
        examples.MinFinder.T t30 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t32 = new examples.MinFinder.T((-3));
        int int33 = t32.getVal();
        int int34 = t32.getVal();
        int int35 = t32.getVal();
        int int36 = t32.getVal();
        int int37 = t32.getVal();
        int int38 = t32.getVal();
        examples.MinFinder.T t40 = new examples.MinFinder.T((int) 'a');
        int int41 = t40.getVal();
        examples.MinFinder.T[] tArray42 = new examples.MinFinder.T[] { t21, t23, t30, t32, t40 };
        java.util.ArrayList<examples.MinFinder.T> tList43 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList43, tArray42);
        examples.MinFinder minFinder45 = new examples.MinFinder(tList43);
        examples.MinFinder minFinder46 = new examples.MinFinder(tList43);
        examples.MinFinder minFinder47 = new examples.MinFinder(tList43);
        examples.MinFinder minFinder48 = new examples.MinFinder(tList43);
        examples.MinFinder minFinder49 = new examples.MinFinder(tList43);
        examples.MinFinder minFinder50 = new examples.MinFinder();
        examples.MinFinder.T t51 = minFinder50.findMin();
        minFinder50.clear();
        examples.MinFinder.T t53 = minFinder50.findMin();
        minFinder50.clear();
        examples.MinFinder.T t56 = new examples.MinFinder.T((-3));
        int int57 = t56.getVal();
        int int58 = t56.getVal();
        int int59 = t56.getVal();
        int int60 = t56.getVal();
        minFinder50.chval(t56, 0);
        examples.MinFinder.T t64 = new examples.MinFinder.T((-3));
        boolean boolean66 = t64.equals((java.lang.Object) (-1));
        int int67 = t64.getVal();
        minFinder50.chval(t64, 0);
        minFinder49.add(t64);
        examples.MinFinder.T t71 = minFinder49.findMin();
        boolean boolean72 = t14.equals((java.lang.Object) minFinder49);
        examples.MinFinder.T t74 = new examples.MinFinder.T((int) (short) 0);
        int int75 = t74.getVal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder49.chval(t74, 0);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) (short) 100);
        examples.MinFinder minFinder2 = new examples.MinFinder();
        examples.MinFinder.T t3 = minFinder2.findMin();
        examples.MinFinder.T t5 = new examples.MinFinder.T(3);
        minFinder2.chval(t5, (int) (short) -1);
        examples.MinFinder minFinder8 = new examples.MinFinder();
        examples.MinFinder.T t9 = minFinder8.findMin();
        examples.MinFinder.T t11 = new examples.MinFinder.T(3);
        minFinder8.chval(t11, (int) (short) -1);
        minFinder2.add(t11);
        boolean boolean15 = t1.equals((java.lang.Object) minFinder2);
        examples.MinFinder.T t17 = new examples.MinFinder.T((int) 'a');
        int int18 = t17.getVal();
        minFinder2.add(t17);
        examples.MinFinder minFinder20 = new examples.MinFinder();
        examples.MinFinder.T t21 = minFinder20.findMin();
        examples.MinFinder.T t23 = new examples.MinFinder.T(3);
        minFinder20.chval(t23, (int) (short) -1);
        examples.MinFinder minFinder26 = new examples.MinFinder();
        examples.MinFinder.T t27 = minFinder26.findMin();
        examples.MinFinder.T t29 = new examples.MinFinder.T(3);
        minFinder26.chval(t29, (int) (short) -1);
        minFinder20.add(t29);
        examples.MinFinder.T t34 = new examples.MinFinder.T((int) 'a');
        int int35 = t34.getVal();
        minFinder20.add(t34);
        examples.MinFinder.T t37 = minFinder20.findMin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder2.chval(t37, (-9));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        minFinder0.clear();
        minFinder0.clear();
        examples.MinFinder.T t5 = new examples.MinFinder.T((int) 'a');
        int int6 = t5.getVal();
        minFinder0.add(t5);
        examples.MinFinder.T t9 = new examples.MinFinder.T(3);
        minFinder0.add(t9);
        examples.MinFinder.T t11 = minFinder0.findMin();
        examples.MinFinder minFinder12 = new examples.MinFinder();
        examples.MinFinder.T t13 = minFinder12.findMin();
        examples.MinFinder.T t15 = new examples.MinFinder.T(3);
        minFinder12.chval(t15, (int) (short) -1);
        examples.MinFinder minFinder18 = new examples.MinFinder();
        examples.MinFinder.T t19 = minFinder18.findMin();
        examples.MinFinder.T t21 = new examples.MinFinder.T(3);
        minFinder18.chval(t21, (int) (short) -1);
        minFinder12.add(t21);
        minFinder12.clear();
        examples.MinFinder.T t27 = new examples.MinFinder.T((int) (short) 0);
        minFinder12.chval(t27, (int) '4');
        examples.MinFinder.T t31 = new examples.MinFinder.T((int) (short) 0);
        int int32 = t31.getVal();
        minFinder12.chval(t31, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t31, (int) (short) 1);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        int int13 = t12.getVal();
        int int14 = t12.getVal();
        int int15 = t12.getVal();
        int int16 = t12.getVal();
        int int17 = t12.getVal();
        int int18 = t12.getVal();
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        int int21 = t20.getVal();
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t1, t3, t10, t12, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        examples.MinFinder minFinder25 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder26 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder27 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder28 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder29 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder30 = new examples.MinFinder();
        examples.MinFinder.T t31 = minFinder30.findMin();
        minFinder30.clear();
        examples.MinFinder.T t33 = minFinder30.findMin();
        minFinder30.clear();
        examples.MinFinder.T t36 = new examples.MinFinder.T((-3));
        int int37 = t36.getVal();
        int int38 = t36.getVal();
        int int39 = t36.getVal();
        int int40 = t36.getVal();
        minFinder30.chval(t36, 0);
        examples.MinFinder.T t44 = new examples.MinFinder.T((-3));
        boolean boolean46 = t44.equals((java.lang.Object) (-1));
        int int47 = t44.getVal();
        minFinder30.chval(t44, 0);
        minFinder29.add(t44);
        examples.MinFinder.T t51 = minFinder29.findMin();
        examples.MinFinder.T t52 = minFinder29.findMin();
        examples.MinFinder.T t54 = new examples.MinFinder.T((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder29.chval(t54, 9);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        minFinder0.clear();
        minFinder0.clear();
        minFinder0.clear();
        minFinder0.clear();
        examples.MinFinder.T t5 = minFinder0.findMin();
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t9 = new examples.MinFinder.T((-3));
        int int10 = t9.getVal();
        int int11 = t9.getVal();
        int int12 = t9.getVal();
        int int13 = t9.getVal();
        int int14 = t9.getVal();
        examples.MinFinder.T t16 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t18 = new examples.MinFinder.T((-3));
        int int19 = t18.getVal();
        int int20 = t18.getVal();
        int int21 = t18.getVal();
        int int22 = t18.getVal();
        int int23 = t18.getVal();
        int int24 = t18.getVal();
        examples.MinFinder.T t26 = new examples.MinFinder.T((int) 'a');
        int int27 = t26.getVal();
        examples.MinFinder.T[] tArray28 = new examples.MinFinder.T[] { t7, t9, t16, t18, t26 };
        java.util.ArrayList<examples.MinFinder.T> tList29 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList29, tArray28);
        examples.MinFinder minFinder31 = new examples.MinFinder(tList29);
        examples.MinFinder minFinder32 = new examples.MinFinder(tList29);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList29);
        examples.MinFinder minFinder34 = new examples.MinFinder(tList29);
        examples.MinFinder minFinder35 = new examples.MinFinder(tList29);
        examples.MinFinder minFinder36 = new examples.MinFinder(tList29);
        examples.MinFinder minFinder37 = new examples.MinFinder(tList29);
        examples.MinFinder minFinder38 = new examples.MinFinder(tList29);
        examples.MinFinder.T t40 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t42 = new examples.MinFinder.T((-3));
        int int43 = t42.getVal();
        int int44 = t42.getVal();
        int int45 = t42.getVal();
        int int46 = t42.getVal();
        int int47 = t42.getVal();
        examples.MinFinder.T t49 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t51 = new examples.MinFinder.T((-3));
        int int52 = t51.getVal();
        int int53 = t51.getVal();
        int int54 = t51.getVal();
        int int55 = t51.getVal();
        int int56 = t51.getVal();
        int int57 = t51.getVal();
        examples.MinFinder.T t59 = new examples.MinFinder.T((int) 'a');
        int int60 = t59.getVal();
        examples.MinFinder.T[] tArray61 = new examples.MinFinder.T[] { t40, t42, t49, t51, t59 };
        java.util.ArrayList<examples.MinFinder.T> tList62 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList62, tArray61);
        examples.MinFinder minFinder64 = new examples.MinFinder(tList62);
        examples.MinFinder minFinder65 = new examples.MinFinder(tList62);
        examples.MinFinder minFinder66 = new examples.MinFinder(tList62);
        examples.MinFinder.T t67 = minFinder66.findMin();
        int int68 = t67.getVal();
        minFinder38.add(t67);
        examples.MinFinder.T t70 = minFinder38.findMin();
        minFinder0.add(t70);
        examples.MinFinder.T t73 = new examples.MinFinder.T((-1));
        int int74 = t73.getVal();
        int int75 = t73.getVal();
        int int76 = t73.getVal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t73, (int) (byte) 1);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t3 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t5 = minFinder0.findMin();
        minFinder0.clear();
        minFinder0.clear();
        examples.MinFinder.T t8 = minFinder0.findMin();
        examples.MinFinder.T t9 = minFinder0.findMin();
        examples.MinFinder.T t10 = minFinder0.findMin();
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        int int13 = t12.getVal();
        int int14 = t12.getVal();
        int int15 = t12.getVal();
        int int16 = t12.getVal();
        int int17 = t12.getVal();
        boolean boolean19 = t12.equals((java.lang.Object) 100.0d);
        int int20 = t12.getVal();
        minFinder0.add(t12);
        examples.MinFinder minFinder22 = new examples.MinFinder();
        examples.MinFinder.T t23 = minFinder22.findMin();
        minFinder22.clear();
        examples.MinFinder.T t25 = minFinder22.findMin();
        minFinder22.clear();
        examples.MinFinder.T t28 = new examples.MinFinder.T((-3));
        int int29 = t28.getVal();
        int int30 = t28.getVal();
        int int31 = t28.getVal();
        int int32 = t28.getVal();
        minFinder22.chval(t28, 0);
        examples.MinFinder minFinder35 = new examples.MinFinder();
        examples.MinFinder.T t36 = minFinder35.findMin();
        examples.MinFinder.T t38 = new examples.MinFinder.T(3);
        minFinder35.chval(t38, (int) (short) -1);
        examples.MinFinder minFinder41 = new examples.MinFinder();
        examples.MinFinder.T t42 = minFinder41.findMin();
        examples.MinFinder.T t44 = new examples.MinFinder.T(3);
        minFinder41.chval(t44, (int) (short) -1);
        minFinder35.add(t44);
        examples.MinFinder.T t49 = new examples.MinFinder.T((int) 'a');
        int int50 = t49.getVal();
        minFinder35.add(t49);
        minFinder22.add(t49);
        boolean boolean53 = t12.equals((java.lang.Object) minFinder22);
        examples.MinFinder.T t55 = new examples.MinFinder.T((int) (byte) 100);
        int int56 = t55.getVal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder22.chval(t55, 1);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        int int13 = t12.getVal();
        int int14 = t12.getVal();
        int int15 = t12.getVal();
        int int16 = t12.getVal();
        int int17 = t12.getVal();
        int int18 = t12.getVal();
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        int int21 = t20.getVal();
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t1, t3, t10, t12, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        examples.MinFinder minFinder25 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder26 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder27 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder28 = new examples.MinFinder(tList23);
        examples.MinFinder.T t30 = new examples.MinFinder.T((int) 'a');
        minFinder28.add(t30);
        examples.MinFinder.T t33 = new examples.MinFinder.T((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder28.chval(t33, 0);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        int int13 = t12.getVal();
        int int14 = t12.getVal();
        int int15 = t12.getVal();
        int int16 = t12.getVal();
        int int17 = t12.getVal();
        int int18 = t12.getVal();
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        int int21 = t20.getVal();
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t1, t3, t10, t12, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        examples.MinFinder minFinder25 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder26 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder27 = new examples.MinFinder();
        examples.MinFinder.T t28 = minFinder27.findMin();
        examples.MinFinder.T t30 = new examples.MinFinder.T(3);
        minFinder27.chval(t30, (int) (short) -1);
        examples.MinFinder minFinder33 = new examples.MinFinder();
        examples.MinFinder.T t34 = minFinder33.findMin();
        examples.MinFinder.T t36 = new examples.MinFinder.T(3);
        minFinder33.chval(t36, (int) (short) -1);
        minFinder27.add(t36);
        examples.MinFinder.T t41 = new examples.MinFinder.T((-9));
        minFinder27.add(t41);
        examples.MinFinder minFinder43 = new examples.MinFinder();
        examples.MinFinder.T t44 = minFinder43.findMin();
        examples.MinFinder.T t46 = new examples.MinFinder.T(3);
        minFinder43.chval(t46, (int) (short) -1);
        examples.MinFinder minFinder49 = new examples.MinFinder();
        examples.MinFinder.T t50 = minFinder49.findMin();
        examples.MinFinder.T t52 = new examples.MinFinder.T(3);
        minFinder49.chval(t52, (int) (short) -1);
        minFinder43.add(t52);
        examples.MinFinder.T t57 = new examples.MinFinder.T((-9));
        minFinder43.add(t57);
        minFinder43.clear();
        examples.MinFinder minFinder60 = new examples.MinFinder();
        examples.MinFinder.T t62 = new examples.MinFinder.T(100);
        minFinder60.add(t62);
        minFinder43.chval(t62, (int) '#');
        java.lang.Class<?> wildcardClass66 = minFinder43.getClass();
        boolean boolean67 = t41.equals((java.lang.Object) minFinder43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder26.chval(t41, 9);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        examples.MinFinder.T t3 = new examples.MinFinder.T(3);
        minFinder0.chval(t3, (int) (short) -1);
        minFinder0.clear();
        minFinder0.clear();
        examples.MinFinder.T t9 = new examples.MinFinder.T((-3));
        boolean boolean11 = t9.equals((java.lang.Object) (-1));
        examples.MinFinder.T t13 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        int int16 = t15.getVal();
        int int17 = t15.getVal();
        int int18 = t15.getVal();
        int int19 = t15.getVal();
        int int20 = t15.getVal();
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t24 = new examples.MinFinder.T((-3));
        int int25 = t24.getVal();
        int int26 = t24.getVal();
        int int27 = t24.getVal();
        int int28 = t24.getVal();
        int int29 = t24.getVal();
        int int30 = t24.getVal();
        examples.MinFinder.T t32 = new examples.MinFinder.T((int) 'a');
        int int33 = t32.getVal();
        examples.MinFinder.T[] tArray34 = new examples.MinFinder.T[] { t13, t15, t22, t24, t32 };
        java.util.ArrayList<examples.MinFinder.T> tList35 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList35, tArray34);
        examples.MinFinder minFinder37 = new examples.MinFinder(tList35);
        examples.MinFinder minFinder38 = new examples.MinFinder(tList35);
        examples.MinFinder minFinder39 = new examples.MinFinder(tList35);
        examples.MinFinder minFinder40 = new examples.MinFinder(tList35);
        examples.MinFinder minFinder41 = new examples.MinFinder(tList35);
        examples.MinFinder minFinder42 = new examples.MinFinder(tList35);
        examples.MinFinder minFinder43 = new examples.MinFinder(tList35);
        examples.MinFinder minFinder44 = new examples.MinFinder(tList35);
        boolean boolean45 = t9.equals((java.lang.Object) minFinder44);
        examples.MinFinder minFinder46 = new examples.MinFinder();
        examples.MinFinder.T t47 = minFinder46.findMin();
        examples.MinFinder.T t49 = new examples.MinFinder.T(3);
        minFinder46.chval(t49, (int) (short) -1);
        boolean boolean52 = t9.equals((java.lang.Object) minFinder46);
        minFinder0.add(t9);
        examples.MinFinder.T t55 = new examples.MinFinder.T((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t55, 0);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t3 = minFinder0.findMin();
        examples.MinFinder.T t5 = new examples.MinFinder.T((-1));
        minFinder0.chval(t5, 100);
        examples.MinFinder.T t9 = new examples.MinFinder.T((-3));
        int int10 = t9.getVal();
        int int11 = t9.getVal();
        minFinder0.add(t9);
        examples.MinFinder minFinder13 = new examples.MinFinder();
        examples.MinFinder.T t14 = minFinder13.findMin();
        minFinder13.clear();
        examples.MinFinder.T t16 = minFinder13.findMin();
        minFinder13.clear();
        examples.MinFinder.T t18 = minFinder13.findMin();
        minFinder13.clear();
        minFinder13.clear();
        minFinder13.clear();
        boolean boolean22 = t9.equals((java.lang.Object) minFinder13);
        minFinder13.clear();
        examples.MinFinder.T t25 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t27 = new examples.MinFinder.T((-3));
        int int28 = t27.getVal();
        int int29 = t27.getVal();
        int int30 = t27.getVal();
        int int31 = t27.getVal();
        int int32 = t27.getVal();
        examples.MinFinder.T t34 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t36 = new examples.MinFinder.T((-3));
        int int37 = t36.getVal();
        int int38 = t36.getVal();
        int int39 = t36.getVal();
        int int40 = t36.getVal();
        int int41 = t36.getVal();
        int int42 = t36.getVal();
        examples.MinFinder.T t44 = new examples.MinFinder.T((int) 'a');
        int int45 = t44.getVal();
        examples.MinFinder.T[] tArray46 = new examples.MinFinder.T[] { t25, t27, t34, t36, t44 };
        java.util.ArrayList<examples.MinFinder.T> tList47 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList47, tArray46);
        examples.MinFinder minFinder49 = new examples.MinFinder(tList47);
        examples.MinFinder minFinder50 = new examples.MinFinder(tList47);
        examples.MinFinder minFinder51 = new examples.MinFinder(tList47);
        examples.MinFinder minFinder52 = new examples.MinFinder(tList47);
        examples.MinFinder.T t54 = new examples.MinFinder.T((-3));
        boolean boolean56 = t54.equals((java.lang.Object) (-1));
        minFinder52.add(t54);
        minFinder13.add(t54);
        examples.MinFinder.T t60 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t62 = new examples.MinFinder.T((-3));
        int int63 = t62.getVal();
        int int64 = t62.getVal();
        int int65 = t62.getVal();
        int int66 = t62.getVal();
        int int67 = t62.getVal();
        examples.MinFinder.T t69 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t71 = new examples.MinFinder.T((-3));
        int int72 = t71.getVal();
        int int73 = t71.getVal();
        int int74 = t71.getVal();
        int int75 = t71.getVal();
        int int76 = t71.getVal();
        int int77 = t71.getVal();
        examples.MinFinder.T t79 = new examples.MinFinder.T((int) 'a');
        int int80 = t79.getVal();
        examples.MinFinder.T[] tArray81 = new examples.MinFinder.T[] { t60, t62, t69, t71, t79 };
        java.util.ArrayList<examples.MinFinder.T> tList82 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList82, tArray81);
        examples.MinFinder minFinder84 = new examples.MinFinder(tList82);
        examples.MinFinder minFinder85 = new examples.MinFinder(tList82);
        examples.MinFinder minFinder86 = new examples.MinFinder(tList82);
        examples.MinFinder minFinder87 = new examples.MinFinder(tList82);
        examples.MinFinder.T t89 = new examples.MinFinder.T((-3));
        boolean boolean91 = t89.equals((java.lang.Object) (-1));
        minFinder87.add(t89);
        examples.MinFinder.T t93 = minFinder87.findMin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder13.chval(t93, (int) (byte) 100);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        int int13 = t12.getVal();
        int int14 = t12.getVal();
        int int15 = t12.getVal();
        int int16 = t12.getVal();
        int int17 = t12.getVal();
        int int18 = t12.getVal();
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        int int21 = t20.getVal();
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t1, t3, t10, t12, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        examples.MinFinder minFinder25 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder26 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder27 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder28 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder29 = new examples.MinFinder();
        examples.MinFinder.T t30 = minFinder29.findMin();
        minFinder29.clear();
        examples.MinFinder.T t32 = minFinder29.findMin();
        examples.MinFinder.T t34 = new examples.MinFinder.T((-1));
        minFinder29.chval(t34, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder28.chval(t34, (int) (byte) -1);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        int int11 = t10.getVal();
        int int12 = t10.getVal();
        int int13 = t10.getVal();
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        int int16 = t15.getVal();
        int int17 = t15.getVal();
        int int18 = t15.getVal();
        int int19 = t15.getVal();
        examples.MinFinder.T t21 = new examples.MinFinder.T((int) '#');
        examples.MinFinder.T t23 = new examples.MinFinder.T((-3));
        int int24 = t23.getVal();
        int int25 = t23.getVal();
        int int26 = t23.getVal();
        int int27 = t23.getVal();
        int int28 = t23.getVal();
        int int29 = t23.getVal();
        examples.MinFinder.T t31 = new examples.MinFinder.T((-3));
        int int32 = t31.getVal();
        int int33 = t31.getVal();
        int int34 = t31.getVal();
        int int35 = t31.getVal();
        int int36 = t31.getVal();
        int int37 = t31.getVal();
        examples.MinFinder.T[] tArray38 = new examples.MinFinder.T[] { t1, t3, t10, t15, t21, t23, t31 };
        java.util.ArrayList<examples.MinFinder.T> tList39 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList39, tArray38);
        examples.MinFinder minFinder41 = new examples.MinFinder(tList39);
        examples.MinFinder minFinder42 = new examples.MinFinder(tList39);
        examples.MinFinder minFinder43 = new examples.MinFinder(tList39);
        examples.MinFinder minFinder44 = new examples.MinFinder(tList39);
        examples.MinFinder minFinder45 = new examples.MinFinder(tList39);
        examples.MinFinder minFinder46 = new examples.MinFinder(tList39);
        examples.MinFinder minFinder47 = new examples.MinFinder();
        examples.MinFinder.T t48 = minFinder47.findMin();
        examples.MinFinder.T t50 = new examples.MinFinder.T(3);
        minFinder47.chval(t50, (int) (short) -1);
        examples.MinFinder minFinder53 = new examples.MinFinder();
        examples.MinFinder.T t54 = minFinder53.findMin();
        examples.MinFinder.T t56 = new examples.MinFinder.T(3);
        minFinder53.chval(t56, (int) (short) -1);
        minFinder47.add(t56);
        examples.MinFinder.T t61 = new examples.MinFinder.T((-9));
        minFinder47.add(t61);
        examples.MinFinder.T t63 = minFinder47.findMin();
        examples.MinFinder minFinder64 = new examples.MinFinder();
        examples.MinFinder.T t65 = minFinder64.findMin();
        minFinder64.clear();
        examples.MinFinder.T t67 = minFinder64.findMin();
        minFinder64.clear();
        minFinder64.clear();
        examples.MinFinder.T t71 = new examples.MinFinder.T((-9));
        int int72 = t71.getVal();
        minFinder64.chval(t71, 10);
        int int75 = t71.getVal();
        minFinder47.add(t71);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder46.chval(t71, 0);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        int int13 = t12.getVal();
        int int14 = t12.getVal();
        int int15 = t12.getVal();
        int int16 = t12.getVal();
        int int17 = t12.getVal();
        int int18 = t12.getVal();
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        int int21 = t20.getVal();
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t1, t3, t10, t12, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        examples.MinFinder minFinder25 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder26 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder27 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder28 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder29 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder30 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder31 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder32 = new examples.MinFinder(tList23);
        examples.MinFinder.T t34 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t36 = new examples.MinFinder.T((-3));
        int int37 = t36.getVal();
        int int38 = t36.getVal();
        int int39 = t36.getVal();
        int int40 = t36.getVal();
        int int41 = t36.getVal();
        examples.MinFinder.T t43 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t45 = new examples.MinFinder.T((-3));
        int int46 = t45.getVal();
        int int47 = t45.getVal();
        int int48 = t45.getVal();
        int int49 = t45.getVal();
        int int50 = t45.getVal();
        int int51 = t45.getVal();
        examples.MinFinder.T t53 = new examples.MinFinder.T((int) 'a');
        int int54 = t53.getVal();
        examples.MinFinder.T[] tArray55 = new examples.MinFinder.T[] { t34, t36, t43, t45, t53 };
        java.util.ArrayList<examples.MinFinder.T> tList56 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList56, tArray55);
        examples.MinFinder minFinder58 = new examples.MinFinder(tList56);
        examples.MinFinder minFinder59 = new examples.MinFinder(tList56);
        examples.MinFinder minFinder60 = new examples.MinFinder(tList56);
        examples.MinFinder.T t61 = minFinder60.findMin();
        int int62 = t61.getVal();
        minFinder32.add(t61);
        examples.MinFinder minFinder64 = new examples.MinFinder();
        examples.MinFinder.T t65 = minFinder64.findMin();
        examples.MinFinder.T t67 = new examples.MinFinder.T(3);
        minFinder64.chval(t67, (int) (short) -1);
        examples.MinFinder minFinder70 = new examples.MinFinder();
        examples.MinFinder.T t71 = minFinder70.findMin();
        examples.MinFinder.T t73 = new examples.MinFinder.T(3);
        minFinder70.chval(t73, (int) (short) -1);
        minFinder64.add(t73);
        minFinder64.clear();
        examples.MinFinder.T t79 = new examples.MinFinder.T((int) (short) 0);
        minFinder64.chval(t79, (int) '4');
        examples.MinFinder.T t83 = new examples.MinFinder.T((int) '#');
        int int84 = t83.getVal();
        minFinder64.chval(t83, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder32.chval(t83, (-2));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        examples.MinFinder.T t3 = new examples.MinFinder.T(3);
        minFinder0.chval(t3, (int) (short) -1);
        examples.MinFinder minFinder6 = new examples.MinFinder();
        examples.MinFinder.T t7 = minFinder6.findMin();
        examples.MinFinder.T t9 = new examples.MinFinder.T(3);
        minFinder6.chval(t9, (int) (short) -1);
        minFinder0.add(t9);
        examples.MinFinder.T t14 = new examples.MinFinder.T((int) 'a');
        int int15 = t14.getVal();
        minFinder0.add(t14);
        examples.MinFinder.T t17 = minFinder0.findMin();
        examples.MinFinder.T t18 = minFinder0.findMin();
        examples.MinFinder minFinder19 = new examples.MinFinder();
        examples.MinFinder.T t20 = minFinder19.findMin();
        minFinder19.clear();
        examples.MinFinder.T t22 = minFinder19.findMin();
        minFinder19.clear();
        examples.MinFinder.T t25 = new examples.MinFinder.T((-3));
        int int26 = t25.getVal();
        int int27 = t25.getVal();
        int int28 = t25.getVal();
        int int29 = t25.getVal();
        minFinder19.chval(t25, 0);
        examples.MinFinder.T t33 = new examples.MinFinder.T((-3));
        int int34 = t33.getVal();
        int int35 = t33.getVal();
        int int36 = t33.getVal();
        minFinder19.add(t33);
        int int38 = t33.getVal();
        minFinder0.add(t33);
        examples.MinFinder.T t40 = minFinder0.findMin();
        examples.MinFinder minFinder41 = new examples.MinFinder();
        examples.MinFinder.T t42 = minFinder41.findMin();
        minFinder41.clear();
        examples.MinFinder.T t44 = minFinder41.findMin();
        examples.MinFinder.T t46 = new examples.MinFinder.T((-1));
        minFinder41.chval(t46, 100);
        examples.MinFinder.T t50 = new examples.MinFinder.T(7);
        minFinder41.chval(t50, (int) (byte) -1);
        int int53 = t50.getVal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t50, (int) (byte) 100);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        int int13 = t12.getVal();
        int int14 = t12.getVal();
        int int15 = t12.getVal();
        int int16 = t12.getVal();
        int int17 = t12.getVal();
        int int18 = t12.getVal();
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        int int21 = t20.getVal();
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t1, t3, t10, t12, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        examples.MinFinder minFinder25 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder26 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder27 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder28 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder29 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder30 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder31 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder32 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder34 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder35 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder36 = new examples.MinFinder();
        examples.MinFinder.T t38 = new examples.MinFinder.T((-9));
        int int39 = t38.getVal();
        minFinder36.chval(t38, (-100));
        minFinder35.add(t38);
        examples.MinFinder.T t44 = new examples.MinFinder.T((-5));
        int int45 = t44.getVal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder35.chval(t44, (-2));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        examples.MinFinder.T t3 = new examples.MinFinder.T(3);
        minFinder0.chval(t3, (int) (short) -1);
        examples.MinFinder minFinder6 = new examples.MinFinder();
        examples.MinFinder.T t7 = minFinder6.findMin();
        examples.MinFinder.T t9 = new examples.MinFinder.T(3);
        minFinder6.chval(t9, (int) (short) -1);
        minFinder0.add(t9);
        examples.MinFinder.T t14 = new examples.MinFinder.T((-9));
        minFinder0.add(t14);
        examples.MinFinder.T t16 = minFinder0.findMin();
        examples.MinFinder.T t18 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t20 = new examples.MinFinder.T((-3));
        int int21 = t20.getVal();
        int int22 = t20.getVal();
        int int23 = t20.getVal();
        int int24 = t20.getVal();
        int int25 = t20.getVal();
        examples.MinFinder.T t27 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t29 = new examples.MinFinder.T((-3));
        int int30 = t29.getVal();
        int int31 = t29.getVal();
        int int32 = t29.getVal();
        int int33 = t29.getVal();
        int int34 = t29.getVal();
        int int35 = t29.getVal();
        examples.MinFinder.T t37 = new examples.MinFinder.T((int) 'a');
        int int38 = t37.getVal();
        examples.MinFinder.T[] tArray39 = new examples.MinFinder.T[] { t18, t20, t27, t29, t37 };
        java.util.ArrayList<examples.MinFinder.T> tList40 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList40, tArray39);
        examples.MinFinder minFinder42 = new examples.MinFinder(tList40);
        examples.MinFinder minFinder43 = new examples.MinFinder(tList40);
        examples.MinFinder minFinder44 = new examples.MinFinder(tList40);
        examples.MinFinder minFinder45 = new examples.MinFinder(tList40);
        examples.MinFinder.T t47 = new examples.MinFinder.T((int) 'a');
        minFinder45.add(t47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t47, 7);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t2 = new examples.MinFinder.T((-3));
        int int3 = t2.getVal();
        int int4 = t2.getVal();
        int int5 = t2.getVal();
        int int6 = t2.getVal();
        int int7 = t2.getVal();
        minFinder0.chval(t2, (int) ' ');
        examples.MinFinder.T t11 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t13 = new examples.MinFinder.T((-3));
        int int14 = t13.getVal();
        int int15 = t13.getVal();
        int int16 = t13.getVal();
        int int17 = t13.getVal();
        int int18 = t13.getVal();
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t22 = new examples.MinFinder.T((-3));
        int int23 = t22.getVal();
        int int24 = t22.getVal();
        int int25 = t22.getVal();
        int int26 = t22.getVal();
        int int27 = t22.getVal();
        int int28 = t22.getVal();
        examples.MinFinder.T t30 = new examples.MinFinder.T((int) 'a');
        int int31 = t30.getVal();
        examples.MinFinder.T[] tArray32 = new examples.MinFinder.T[] { t11, t13, t20, t22, t30 };
        java.util.ArrayList<examples.MinFinder.T> tList33 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList33, tArray32);
        examples.MinFinder minFinder35 = new examples.MinFinder(tList33);
        examples.MinFinder minFinder36 = new examples.MinFinder(tList33);
        examples.MinFinder minFinder37 = new examples.MinFinder(tList33);
        examples.MinFinder minFinder38 = new examples.MinFinder(tList33);
        examples.MinFinder minFinder39 = new examples.MinFinder(tList33);
        examples.MinFinder.T t41 = new examples.MinFinder.T((int) 'a');
        minFinder39.add(t41);
        boolean boolean44 = t41.equals((java.lang.Object) 8.4d);
        minFinder0.chval(t41, 1);
        examples.MinFinder minFinder47 = new examples.MinFinder();
        examples.MinFinder.T t48 = minFinder47.findMin();
        minFinder47.clear();
        examples.MinFinder.T t50 = minFinder47.findMin();
        minFinder47.clear();
        examples.MinFinder.T t53 = new examples.MinFinder.T((-3));
        int int54 = t53.getVal();
        int int55 = t53.getVal();
        int int56 = t53.getVal();
        int int57 = t53.getVal();
        minFinder47.chval(t53, 0);
        minFinder47.clear();
        examples.MinFinder minFinder61 = new examples.MinFinder();
        examples.MinFinder.T t62 = minFinder61.findMin();
        examples.MinFinder.T t64 = new examples.MinFinder.T(3);
        minFinder61.chval(t64, (int) (short) -1);
        examples.MinFinder minFinder67 = new examples.MinFinder();
        examples.MinFinder.T t68 = minFinder67.findMin();
        examples.MinFinder.T t70 = new examples.MinFinder.T(3);
        minFinder67.chval(t70, (int) (short) -1);
        minFinder61.add(t70);
        minFinder61.clear();
        examples.MinFinder.T t76 = new examples.MinFinder.T((int) (short) 0);
        minFinder61.chval(t76, (int) '4');
        minFinder47.add(t76);
        examples.MinFinder.T t81 = new examples.MinFinder.T((-3));
        int int82 = t81.getVal();
        int int83 = t81.getVal();
        int int84 = t81.getVal();
        int int85 = t81.getVal();
        boolean boolean86 = t76.equals((java.lang.Object) t81);
        minFinder0.chval(t81, 0);
        examples.MinFinder.T t90 = new examples.MinFinder.T((-9));
        boolean boolean92 = t90.equals((java.lang.Object) 6);
        minFinder0.add(t90);
        examples.MinFinder.T t95 = new examples.MinFinder.T((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t95, (int) (byte) -1);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) (byte) 10);
        examples.MinFinder minFinder2 = new examples.MinFinder();
        examples.MinFinder.T t3 = minFinder2.findMin();
        minFinder2.clear();
        examples.MinFinder.T t5 = minFinder2.findMin();
        minFinder2.clear();
        examples.MinFinder.T t8 = new examples.MinFinder.T((-3));
        int int9 = t8.getVal();
        int int10 = t8.getVal();
        int int11 = t8.getVal();
        int int12 = t8.getVal();
        minFinder2.chval(t8, 0);
        boolean boolean15 = t1.equals((java.lang.Object) minFinder2);
        examples.MinFinder.T t17 = new examples.MinFinder.T((int) (short) 0);
        int int18 = t17.getVal();
        minFinder2.chval(t17, (-5));
        examples.MinFinder minFinder21 = new examples.MinFinder();
        examples.MinFinder.T t22 = minFinder21.findMin();
        examples.MinFinder.T t24 = new examples.MinFinder.T(3);
        minFinder21.chval(t24, (int) (short) -1);
        examples.MinFinder minFinder27 = new examples.MinFinder();
        examples.MinFinder.T t28 = minFinder27.findMin();
        examples.MinFinder.T t30 = new examples.MinFinder.T(3);
        minFinder27.chval(t30, (int) (short) -1);
        minFinder21.add(t30);
        minFinder21.clear();
        examples.MinFinder.T t36 = new examples.MinFinder.T((int) (short) 0);
        minFinder21.chval(t36, (int) '4');
        examples.MinFinder.T t40 = new examples.MinFinder.T((int) (short) 0);
        int int41 = t40.getVal();
        minFinder21.chval(t40, 100);
        examples.MinFinder.T t45 = new examples.MinFinder.T((-3));
        boolean boolean47 = t45.equals((java.lang.Object) (-1));
        examples.MinFinder.T t49 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t51 = new examples.MinFinder.T((-3));
        int int52 = t51.getVal();
        int int53 = t51.getVal();
        int int54 = t51.getVal();
        int int55 = t51.getVal();
        int int56 = t51.getVal();
        examples.MinFinder.T t58 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t60 = new examples.MinFinder.T((-3));
        int int61 = t60.getVal();
        int int62 = t60.getVal();
        int int63 = t60.getVal();
        int int64 = t60.getVal();
        int int65 = t60.getVal();
        int int66 = t60.getVal();
        examples.MinFinder.T t68 = new examples.MinFinder.T((int) 'a');
        int int69 = t68.getVal();
        examples.MinFinder.T[] tArray70 = new examples.MinFinder.T[] { t49, t51, t58, t60, t68 };
        java.util.ArrayList<examples.MinFinder.T> tList71 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList71, tArray70);
        examples.MinFinder minFinder73 = new examples.MinFinder(tList71);
        examples.MinFinder minFinder74 = new examples.MinFinder(tList71);
        examples.MinFinder minFinder75 = new examples.MinFinder(tList71);
        examples.MinFinder minFinder76 = new examples.MinFinder(tList71);
        examples.MinFinder minFinder77 = new examples.MinFinder(tList71);
        examples.MinFinder minFinder78 = new examples.MinFinder(tList71);
        boolean boolean79 = t45.equals((java.lang.Object) minFinder78);
        boolean boolean80 = t40.equals((java.lang.Object) t45);
        minFinder2.add(t45);
        examples.MinFinder.T t82 = minFinder2.findMin();
        examples.MinFinder.T t84 = new examples.MinFinder.T((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder2.chval(t84, (int) ' ');
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t3 = minFinder0.findMin();
        examples.MinFinder.T t5 = new examples.MinFinder.T((-1));
        minFinder0.chval(t5, 100);
        examples.MinFinder.T t9 = new examples.MinFinder.T((-3));
        int int10 = t9.getVal();
        int int11 = t9.getVal();
        minFinder0.add(t9);
        examples.MinFinder.T t14 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t16 = new examples.MinFinder.T((-3));
        int int17 = t16.getVal();
        int int18 = t16.getVal();
        int int19 = t16.getVal();
        int int20 = t16.getVal();
        int int21 = t16.getVal();
        examples.MinFinder.T t23 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t25 = new examples.MinFinder.T((-3));
        int int26 = t25.getVal();
        int int27 = t25.getVal();
        int int28 = t25.getVal();
        int int29 = t25.getVal();
        int int30 = t25.getVal();
        int int31 = t25.getVal();
        examples.MinFinder.T t33 = new examples.MinFinder.T((int) 'a');
        int int34 = t33.getVal();
        examples.MinFinder.T[] tArray35 = new examples.MinFinder.T[] { t14, t16, t23, t25, t33 };
        java.util.ArrayList<examples.MinFinder.T> tList36 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList36, tArray35);
        examples.MinFinder minFinder38 = new examples.MinFinder(tList36);
        minFinder38.clear();
        examples.MinFinder.T t41 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t43 = new examples.MinFinder.T((-3));
        int int44 = t43.getVal();
        int int45 = t43.getVal();
        int int46 = t43.getVal();
        int int47 = t43.getVal();
        int int48 = t43.getVal();
        examples.MinFinder.T t50 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t52 = new examples.MinFinder.T((-3));
        int int53 = t52.getVal();
        int int54 = t52.getVal();
        int int55 = t52.getVal();
        int int56 = t52.getVal();
        int int57 = t52.getVal();
        int int58 = t52.getVal();
        examples.MinFinder.T t60 = new examples.MinFinder.T((int) 'a');
        int int61 = t60.getVal();
        examples.MinFinder.T[] tArray62 = new examples.MinFinder.T[] { t41, t43, t50, t52, t60 };
        java.util.ArrayList<examples.MinFinder.T> tList63 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList63, tArray62);
        examples.MinFinder minFinder65 = new examples.MinFinder(tList63);
        examples.MinFinder minFinder66 = new examples.MinFinder(tList63);
        examples.MinFinder minFinder67 = new examples.MinFinder(tList63);
        examples.MinFinder.T t68 = minFinder67.findMin();
        examples.MinFinder.T t70 = new examples.MinFinder.T((int) (short) 100);
        minFinder67.add(t70);
        examples.MinFinder.T t72 = minFinder67.findMin();
        minFinder38.chval(t72, (-6));
        examples.MinFinder.T t76 = new examples.MinFinder.T((int) (short) 0);
        int int77 = t76.getVal();
        boolean boolean78 = t72.equals((java.lang.Object) t76);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t76, (int) (byte) 10);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t3 = minFinder0.findMin();
        minFinder0.clear();
        minFinder0.clear();
        examples.MinFinder.T t6 = minFinder0.findMin();
        minFinder0.clear();
        minFinder0.clear();
        examples.MinFinder.T t10 = new examples.MinFinder.T(1);
        int int11 = t10.getVal();
        minFinder0.add(t10);
        examples.MinFinder minFinder13 = new examples.MinFinder();
        examples.MinFinder.T t14 = minFinder13.findMin();
        minFinder13.clear();
        examples.MinFinder.T t16 = minFinder13.findMin();
        minFinder13.clear();
        examples.MinFinder.T t19 = new examples.MinFinder.T((-3));
        int int20 = t19.getVal();
        int int21 = t19.getVal();
        int int22 = t19.getVal();
        int int23 = t19.getVal();
        minFinder13.chval(t19, 0);
        examples.MinFinder.T t27 = new examples.MinFinder.T((int) (short) 100);
        examples.MinFinder minFinder28 = new examples.MinFinder();
        examples.MinFinder.T t29 = minFinder28.findMin();
        examples.MinFinder.T t31 = new examples.MinFinder.T(3);
        minFinder28.chval(t31, (int) (short) -1);
        examples.MinFinder minFinder34 = new examples.MinFinder();
        examples.MinFinder.T t35 = minFinder34.findMin();
        examples.MinFinder.T t37 = new examples.MinFinder.T(3);
        minFinder34.chval(t37, (int) (short) -1);
        minFinder28.add(t37);
        boolean boolean41 = t27.equals((java.lang.Object) minFinder28);
        minFinder28.clear();
        examples.MinFinder.T t44 = new examples.MinFinder.T(3);
        minFinder28.chval(t44, 1);
        minFinder13.add(t44);
        int int48 = t44.getVal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t44, (int) (short) 100);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        int int11 = t10.getVal();
        int int12 = t10.getVal();
        int int13 = t10.getVal();
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        int int16 = t15.getVal();
        int int17 = t15.getVal();
        int int18 = t15.getVal();
        int int19 = t15.getVal();
        examples.MinFinder.T t21 = new examples.MinFinder.T((int) '#');
        examples.MinFinder.T t23 = new examples.MinFinder.T((-3));
        int int24 = t23.getVal();
        int int25 = t23.getVal();
        int int26 = t23.getVal();
        int int27 = t23.getVal();
        int int28 = t23.getVal();
        int int29 = t23.getVal();
        examples.MinFinder.T t31 = new examples.MinFinder.T((-3));
        int int32 = t31.getVal();
        int int33 = t31.getVal();
        int int34 = t31.getVal();
        int int35 = t31.getVal();
        int int36 = t31.getVal();
        int int37 = t31.getVal();
        examples.MinFinder.T[] tArray38 = new examples.MinFinder.T[] { t1, t3, t10, t15, t21, t23, t31 };
        java.util.ArrayList<examples.MinFinder.T> tList39 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList39, tArray38);
        examples.MinFinder minFinder41 = new examples.MinFinder(tList39);
        examples.MinFinder minFinder42 = new examples.MinFinder(tList39);
        examples.MinFinder minFinder43 = new examples.MinFinder(tList39);
        examples.MinFinder minFinder44 = new examples.MinFinder(tList39);
        examples.MinFinder minFinder45 = new examples.MinFinder(tList39);
        examples.MinFinder.T t46 = minFinder45.findMin();
        examples.MinFinder.T t47 = minFinder45.findMin();
        examples.MinFinder minFinder48 = new examples.MinFinder();
        examples.MinFinder.T t49 = minFinder48.findMin();
        examples.MinFinder.T t51 = new examples.MinFinder.T(3);
        minFinder48.chval(t51, (int) (short) -1);
        examples.MinFinder minFinder54 = new examples.MinFinder();
        examples.MinFinder.T t55 = minFinder54.findMin();
        examples.MinFinder.T t57 = new examples.MinFinder.T(3);
        minFinder54.chval(t57, (int) (short) -1);
        minFinder48.add(t57);
        examples.MinFinder.T t62 = new examples.MinFinder.T((int) 'a');
        int int63 = t62.getVal();
        minFinder48.add(t62);
        examples.MinFinder.T t65 = minFinder48.findMin();
        examples.MinFinder.T t66 = minFinder48.findMin();
        examples.MinFinder minFinder67 = new examples.MinFinder();
        examples.MinFinder.T t68 = minFinder67.findMin();
        minFinder67.clear();
        examples.MinFinder.T t70 = minFinder67.findMin();
        minFinder67.clear();
        examples.MinFinder.T t73 = new examples.MinFinder.T((-3));
        int int74 = t73.getVal();
        int int75 = t73.getVal();
        int int76 = t73.getVal();
        int int77 = t73.getVal();
        minFinder67.chval(t73, 0);
        examples.MinFinder.T t81 = new examples.MinFinder.T((-3));
        int int82 = t81.getVal();
        int int83 = t81.getVal();
        int int84 = t81.getVal();
        minFinder67.add(t81);
        int int86 = t81.getVal();
        minFinder48.add(t81);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder45.chval(t81, 2);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        minFinder0.clear();
        minFinder0.clear();
        examples.MinFinder.T t5 = new examples.MinFinder.T((int) 'a');
        int int6 = t5.getVal();
        minFinder0.add(t5);
        examples.MinFinder.T t8 = minFinder0.findMin();
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        int int11 = t10.getVal();
        int int12 = t10.getVal();
        int int13 = t10.getVal();
        int int14 = t10.getVal();
        int int15 = t10.getVal();
        boolean boolean17 = t10.equals((java.lang.Object) 100.0d);
        minFinder0.add(t10);
        examples.MinFinder minFinder19 = new examples.MinFinder();
        examples.MinFinder.T t20 = minFinder19.findMin();
        minFinder19.clear();
        examples.MinFinder.T t22 = minFinder19.findMin();
        minFinder19.clear();
        examples.MinFinder.T t25 = new examples.MinFinder.T((-3));
        int int26 = t25.getVal();
        int int27 = t25.getVal();
        int int28 = t25.getVal();
        int int29 = t25.getVal();
        minFinder19.chval(t25, 0);
        minFinder19.clear();
        examples.MinFinder.T t33 = minFinder19.findMin();
        examples.MinFinder.T t35 = new examples.MinFinder.T((-3));
        boolean boolean37 = t35.equals((java.lang.Object) ' ');
        minFinder19.add(t35);
        examples.MinFinder.T t39 = minFinder19.findMin();
        java.lang.Object obj40 = new java.lang.Object();
        boolean boolean41 = t39.equals(obj40);
        int int42 = t39.getVal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t39, 52);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t2 = new examples.MinFinder.T((-9));
        int int3 = t2.getVal();
        minFinder0.chval(t2, (-100));
        examples.MinFinder.T t7 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t9 = new examples.MinFinder.T((-3));
        int int10 = t9.getVal();
        int int11 = t9.getVal();
        int int12 = t9.getVal();
        int int13 = t9.getVal();
        int int14 = t9.getVal();
        examples.MinFinder.T t16 = new examples.MinFinder.T((-3));
        int int17 = t16.getVal();
        int int18 = t16.getVal();
        int int19 = t16.getVal();
        examples.MinFinder.T t21 = new examples.MinFinder.T((-3));
        int int22 = t21.getVal();
        int int23 = t21.getVal();
        int int24 = t21.getVal();
        int int25 = t21.getVal();
        examples.MinFinder.T t27 = new examples.MinFinder.T((int) '#');
        examples.MinFinder.T t29 = new examples.MinFinder.T((-3));
        int int30 = t29.getVal();
        int int31 = t29.getVal();
        int int32 = t29.getVal();
        int int33 = t29.getVal();
        int int34 = t29.getVal();
        int int35 = t29.getVal();
        examples.MinFinder.T t37 = new examples.MinFinder.T((-3));
        int int38 = t37.getVal();
        int int39 = t37.getVal();
        int int40 = t37.getVal();
        int int41 = t37.getVal();
        int int42 = t37.getVal();
        int int43 = t37.getVal();
        examples.MinFinder.T[] tArray44 = new examples.MinFinder.T[] { t7, t9, t16, t21, t27, t29, t37 };
        java.util.ArrayList<examples.MinFinder.T> tList45 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList45, tArray44);
        examples.MinFinder minFinder47 = new examples.MinFinder(tList45);
        minFinder47.clear();
        examples.MinFinder minFinder49 = new examples.MinFinder();
        examples.MinFinder.T t50 = minFinder49.findMin();
        minFinder49.clear();
        examples.MinFinder.T t52 = minFinder49.findMin();
        minFinder49.clear();
        minFinder49.clear();
        examples.MinFinder.T t56 = new examples.MinFinder.T((-9));
        int int57 = t56.getVal();
        minFinder49.chval(t56, 10);
        examples.MinFinder minFinder60 = new examples.MinFinder();
        examples.MinFinder.T t61 = minFinder60.findMin();
        minFinder60.clear();
        examples.MinFinder.T t63 = minFinder60.findMin();
        minFinder60.clear();
        examples.MinFinder.T t66 = new examples.MinFinder.T((-3));
        int int67 = t66.getVal();
        int int68 = t66.getVal();
        int int69 = t66.getVal();
        int int70 = t66.getVal();
        minFinder60.chval(t66, 0);
        minFinder49.add(t66);
        minFinder47.add(t66);
        minFinder0.add(t66);
        examples.MinFinder minFinder76 = new examples.MinFinder();
        examples.MinFinder.T t77 = minFinder76.findMin();
        minFinder76.clear();
        minFinder76.clear();
        examples.MinFinder.T t81 = new examples.MinFinder.T((int) 'a');
        int int82 = t81.getVal();
        minFinder76.add(t81);
        minFinder76.clear();
        examples.MinFinder.T t86 = new examples.MinFinder.T((int) 'a');
        minFinder76.add(t86);
        boolean boolean88 = t66.equals((java.lang.Object) minFinder76);
        examples.MinFinder.T t89 = minFinder76.findMin();
        examples.MinFinder.T t91 = new examples.MinFinder.T((int) (byte) 100);
        boolean boolean93 = t91.equals((java.lang.Object) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder76.chval(t91, (int) (byte) 10);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t3 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t6 = new examples.MinFinder.T((-3));
        int int7 = t6.getVal();
        int int8 = t6.getVal();
        int int9 = t6.getVal();
        int int10 = t6.getVal();
        minFinder0.chval(t6, 0);
        minFinder0.clear();
        examples.MinFinder.T t14 = minFinder0.findMin();
        examples.MinFinder.T t16 = new examples.MinFinder.T((-3));
        boolean boolean18 = t16.equals((java.lang.Object) ' ');
        minFinder0.add(t16);
        examples.MinFinder.T t21 = new examples.MinFinder.T(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t21, 52);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        minFinder0.clear();
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        minFinder0.add(t3);
        examples.MinFinder minFinder8 = new examples.MinFinder();
        examples.MinFinder.T t9 = minFinder8.findMin();
        examples.MinFinder.T t11 = new examples.MinFinder.T(3);
        minFinder8.chval(t11, (int) (short) -1);
        examples.MinFinder minFinder14 = new examples.MinFinder();
        examples.MinFinder.T t15 = minFinder14.findMin();
        examples.MinFinder.T t17 = new examples.MinFinder.T(3);
        minFinder14.chval(t17, (int) (short) -1);
        minFinder8.add(t17);
        examples.MinFinder.T t22 = new examples.MinFinder.T((-9));
        minFinder8.add(t22);
        examples.MinFinder.T t24 = minFinder8.findMin();
        examples.MinFinder minFinder25 = new examples.MinFinder();
        examples.MinFinder.T t26 = minFinder25.findMin();
        minFinder25.clear();
        examples.MinFinder.T t28 = minFinder25.findMin();
        minFinder25.clear();
        minFinder25.clear();
        examples.MinFinder.T t32 = new examples.MinFinder.T((-9));
        int int33 = t32.getVal();
        minFinder25.chval(t32, 10);
        int int36 = t32.getVal();
        minFinder8.add(t32);
        examples.MinFinder.T t38 = minFinder8.findMin();
        examples.MinFinder.T t39 = minFinder8.findMin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t39, 0);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        examples.MinFinder.T t1 = new examples.MinFinder.T((int) (short) 100);
        examples.MinFinder minFinder2 = new examples.MinFinder();
        examples.MinFinder.T t3 = minFinder2.findMin();
        examples.MinFinder.T t5 = new examples.MinFinder.T(3);
        minFinder2.chval(t5, (int) (short) -1);
        examples.MinFinder minFinder8 = new examples.MinFinder();
        examples.MinFinder.T t9 = minFinder8.findMin();
        examples.MinFinder.T t11 = new examples.MinFinder.T(3);
        minFinder8.chval(t11, (int) (short) -1);
        minFinder2.add(t11);
        boolean boolean15 = t1.equals((java.lang.Object) minFinder2);
        examples.MinFinder.T t16 = minFinder2.findMin();
        examples.MinFinder minFinder17 = new examples.MinFinder();
        examples.MinFinder.T t18 = minFinder17.findMin();
        minFinder17.clear();
        examples.MinFinder.T t20 = minFinder17.findMin();
        minFinder17.clear();
        examples.MinFinder.T t23 = new examples.MinFinder.T((-3));
        int int24 = t23.getVal();
        int int25 = t23.getVal();
        int int26 = t23.getVal();
        int int27 = t23.getVal();
        minFinder17.chval(t23, 0);
        minFinder17.clear();
        boolean boolean31 = t16.equals((java.lang.Object) minFinder17);
        examples.MinFinder.T t33 = new examples.MinFinder.T((int) (short) 0);
        int int34 = t33.getVal();
        minFinder17.add(t33);
        examples.MinFinder minFinder36 = new examples.MinFinder();
        examples.MinFinder.T t37 = minFinder36.findMin();
        minFinder36.clear();
        examples.MinFinder.T t39 = minFinder36.findMin();
        minFinder36.clear();
        examples.MinFinder.T t42 = new examples.MinFinder.T((-3));
        int int43 = t42.getVal();
        int int44 = t42.getVal();
        int int45 = t42.getVal();
        int int46 = t42.getVal();
        minFinder36.chval(t42, 0);
        minFinder36.clear();
        examples.MinFinder.T t50 = minFinder36.findMin();
        examples.MinFinder.T t52 = new examples.MinFinder.T((-3));
        boolean boolean54 = t52.equals((java.lang.Object) ' ');
        minFinder36.add(t52);
        examples.MinFinder.T t56 = minFinder36.findMin();
        java.lang.Object obj57 = new java.lang.Object();
        boolean boolean58 = t56.equals(obj57);
        int int59 = t56.getVal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder17.chval(t56, (-5));
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        minFinder0.clear();
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        minFinder0.add(t3);
        examples.MinFinder.T t9 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t11 = new examples.MinFinder.T((-3));
        int int12 = t11.getVal();
        int int13 = t11.getVal();
        int int14 = t11.getVal();
        int int15 = t11.getVal();
        int int16 = t11.getVal();
        examples.MinFinder.T t18 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t20 = new examples.MinFinder.T((-3));
        int int21 = t20.getVal();
        int int22 = t20.getVal();
        int int23 = t20.getVal();
        int int24 = t20.getVal();
        int int25 = t20.getVal();
        int int26 = t20.getVal();
        examples.MinFinder.T t28 = new examples.MinFinder.T((int) 'a');
        int int29 = t28.getVal();
        examples.MinFinder.T[] tArray30 = new examples.MinFinder.T[] { t9, t11, t18, t20, t28 };
        java.util.ArrayList<examples.MinFinder.T> tList31 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList31, tArray30);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList31);
        examples.MinFinder minFinder34 = new examples.MinFinder(tList31);
        examples.MinFinder minFinder35 = new examples.MinFinder(tList31);
        examples.MinFinder minFinder36 = new examples.MinFinder(tList31);
        examples.MinFinder minFinder37 = new examples.MinFinder(tList31);
        examples.MinFinder minFinder38 = new examples.MinFinder(tList31);
        examples.MinFinder minFinder39 = new examples.MinFinder(tList31);
        examples.MinFinder minFinder40 = new examples.MinFinder(tList31);
        examples.MinFinder minFinder41 = new examples.MinFinder(tList31);
        examples.MinFinder minFinder42 = new examples.MinFinder(tList31);
        examples.MinFinder minFinder43 = new examples.MinFinder(tList31);
        examples.MinFinder minFinder44 = new examples.MinFinder(tList31);
        examples.MinFinder.T t45 = minFinder44.findMin();
        examples.MinFinder minFinder46 = new examples.MinFinder();
        examples.MinFinder.T t48 = new examples.MinFinder.T((-3));
        int int49 = t48.getVal();
        int int50 = t48.getVal();
        int int51 = t48.getVal();
        int int52 = t48.getVal();
        int int53 = t48.getVal();
        minFinder46.chval(t48, (int) ' ');
        boolean boolean56 = t45.equals((java.lang.Object) t48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t45, 100);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        examples.MinFinder.T t3 = new examples.MinFinder.T(3);
        minFinder0.chval(t3, (int) (short) -1);
        examples.MinFinder minFinder6 = new examples.MinFinder();
        examples.MinFinder.T t7 = minFinder6.findMin();
        examples.MinFinder.T t9 = new examples.MinFinder.T(3);
        minFinder6.chval(t9, (int) (short) -1);
        minFinder0.add(t9);
        examples.MinFinder.T t14 = new examples.MinFinder.T((int) 'a');
        int int15 = t14.getVal();
        minFinder0.add(t14);
        examples.MinFinder.T t17 = minFinder0.findMin();
        examples.MinFinder.T t18 = minFinder0.findMin();
        examples.MinFinder minFinder19 = new examples.MinFinder();
        examples.MinFinder.T t20 = minFinder19.findMin();
        minFinder19.clear();
        examples.MinFinder.T t22 = minFinder19.findMin();
        minFinder19.clear();
        examples.MinFinder.T t25 = new examples.MinFinder.T((-3));
        int int26 = t25.getVal();
        int int27 = t25.getVal();
        int int28 = t25.getVal();
        int int29 = t25.getVal();
        minFinder19.chval(t25, 0);
        examples.MinFinder.T t33 = new examples.MinFinder.T((-3));
        int int34 = t33.getVal();
        int int35 = t33.getVal();
        int int36 = t33.getVal();
        minFinder19.add(t33);
        int int38 = t33.getVal();
        minFinder0.add(t33);
        examples.MinFinder.T t41 = new examples.MinFinder.T((-3));
        boolean boolean43 = t41.equals((java.lang.Object) (-1));
        examples.MinFinder minFinder44 = new examples.MinFinder();
        examples.MinFinder.T t45 = minFinder44.findMin();
        examples.MinFinder.T t47 = new examples.MinFinder.T(3);
        minFinder44.chval(t47, (int) (short) -1);
        examples.MinFinder.T t51 = new examples.MinFinder.T((-3));
        int int52 = t51.getVal();
        int int53 = t51.getVal();
        int int54 = t51.getVal();
        int int55 = t51.getVal();
        int int56 = t51.getVal();
        int int57 = t51.getVal();
        boolean boolean59 = t51.equals((java.lang.Object) (-8.7d));
        minFinder44.chval(t51, (-100));
        boolean boolean62 = t41.equals((java.lang.Object) t51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t51, (int) 'a');
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        int int13 = t12.getVal();
        int int14 = t12.getVal();
        int int15 = t12.getVal();
        int int16 = t12.getVal();
        int int17 = t12.getVal();
        int int18 = t12.getVal();
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        int int21 = t20.getVal();
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t1, t3, t10, t12, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        examples.MinFinder minFinder25 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder26 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder27 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder28 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder29 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder30 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder31 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder32 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder34 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder35 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder36 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder37 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder38 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder39 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder40 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder41 = new examples.MinFinder();
        examples.MinFinder.T t42 = minFinder41.findMin();
        examples.MinFinder.T t44 = new examples.MinFinder.T(3);
        minFinder41.chval(t44, (int) (short) -1);
        examples.MinFinder minFinder47 = new examples.MinFinder();
        examples.MinFinder.T t48 = minFinder47.findMin();
        examples.MinFinder.T t50 = new examples.MinFinder.T(3);
        minFinder47.chval(t50, (int) (short) -1);
        minFinder41.add(t50);
        minFinder41.clear();
        examples.MinFinder.T t56 = new examples.MinFinder.T((int) (short) 0);
        minFinder41.chval(t56, (int) '4');
        examples.MinFinder.T t60 = new examples.MinFinder.T((int) (short) 0);
        int int61 = t60.getVal();
        minFinder41.chval(t60, 100);
        examples.MinFinder.T t64 = minFinder41.findMin();
        examples.MinFinder.T t66 = new examples.MinFinder.T((int) '4');
        int int67 = t66.getVal();
        minFinder41.add(t66);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder40.chval(t66, 0);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t3 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t5 = minFinder0.findMin();
        minFinder0.clear();
        minFinder0.clear();
        examples.MinFinder.T t8 = minFinder0.findMin();
        examples.MinFinder.T t9 = minFinder0.findMin();
        examples.MinFinder.T t10 = minFinder0.findMin();
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        boolean boolean14 = t12.equals((java.lang.Object) (-1));
        minFinder0.chval(t12, (-2));
        examples.MinFinder.T t17 = minFinder0.findMin();
        examples.MinFinder.T t19 = new examples.MinFinder.T((-9));
        boolean boolean21 = t19.equals((java.lang.Object) 6);
        int int22 = t19.getVal();
        minFinder0.add(t19);
        examples.MinFinder minFinder24 = new examples.MinFinder();
        examples.MinFinder.T t25 = minFinder24.findMin();
        minFinder24.clear();
        examples.MinFinder.T t27 = minFinder24.findMin();
        examples.MinFinder.T t29 = new examples.MinFinder.T((-1));
        minFinder24.chval(t29, 100);
        examples.MinFinder.T t33 = new examples.MinFinder.T((-3));
        int int34 = t33.getVal();
        int int35 = t33.getVal();
        minFinder24.add(t33);
        examples.MinFinder minFinder37 = new examples.MinFinder();
        examples.MinFinder.T t38 = minFinder37.findMin();
        minFinder37.clear();
        examples.MinFinder.T t40 = minFinder37.findMin();
        minFinder37.clear();
        examples.MinFinder.T t42 = minFinder37.findMin();
        minFinder37.clear();
        minFinder37.clear();
        minFinder37.clear();
        boolean boolean46 = t33.equals((java.lang.Object) minFinder37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t33, (int) ' ');
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        int int13 = t12.getVal();
        int int14 = t12.getVal();
        int int15 = t12.getVal();
        int int16 = t12.getVal();
        int int17 = t12.getVal();
        int int18 = t12.getVal();
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        int int21 = t20.getVal();
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t1, t3, t10, t12, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        examples.MinFinder minFinder25 = new examples.MinFinder(tList23);
        minFinder25.clear();
        examples.MinFinder.T t28 = new examples.MinFinder.T((int) (short) 100);
        examples.MinFinder minFinder29 = new examples.MinFinder();
        examples.MinFinder.T t30 = minFinder29.findMin();
        examples.MinFinder.T t32 = new examples.MinFinder.T(3);
        minFinder29.chval(t32, (int) (short) -1);
        examples.MinFinder minFinder35 = new examples.MinFinder();
        examples.MinFinder.T t36 = minFinder35.findMin();
        examples.MinFinder.T t38 = new examples.MinFinder.T(3);
        minFinder35.chval(t38, (int) (short) -1);
        minFinder29.add(t38);
        boolean boolean42 = t28.equals((java.lang.Object) minFinder29);
        examples.MinFinder.T t43 = minFinder29.findMin();
        minFinder25.add(t43);
        examples.MinFinder minFinder45 = new examples.MinFinder();
        examples.MinFinder.T t47 = new examples.MinFinder.T(100);
        minFinder45.add(t47);
        examples.MinFinder.T t49 = minFinder45.findMin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder25.chval(t49, (-10));
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        int int13 = t12.getVal();
        int int14 = t12.getVal();
        int int15 = t12.getVal();
        int int16 = t12.getVal();
        int int17 = t12.getVal();
        int int18 = t12.getVal();
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        int int21 = t20.getVal();
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t1, t3, t10, t12, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        examples.MinFinder minFinder25 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder26 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder27 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder28 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder29 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder30 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder31 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder32 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder34 = new examples.MinFinder();
        examples.MinFinder.T t35 = minFinder34.findMin();
        examples.MinFinder.T t37 = new examples.MinFinder.T(3);
        minFinder34.chval(t37, (int) (short) -1);
        examples.MinFinder minFinder40 = new examples.MinFinder();
        examples.MinFinder.T t41 = minFinder40.findMin();
        examples.MinFinder.T t43 = new examples.MinFinder.T(3);
        minFinder40.chval(t43, (int) (short) -1);
        minFinder34.add(t43);
        examples.MinFinder.T t48 = new examples.MinFinder.T((int) 'a');
        int int49 = t48.getVal();
        minFinder34.add(t48);
        minFinder33.add(t48);
        examples.MinFinder.T t53 = new examples.MinFinder.T((int) (byte) 0);
        int int54 = t53.getVal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder33.chval(t53, (-9));
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        int int13 = t12.getVal();
        int int14 = t12.getVal();
        int int15 = t12.getVal();
        int int16 = t12.getVal();
        int int17 = t12.getVal();
        int int18 = t12.getVal();
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        int int21 = t20.getVal();
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t1, t3, t10, t12, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        examples.MinFinder minFinder25 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder26 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder27 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder28 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder29 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder30 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder31 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder32 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder34 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder35 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder36 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder37 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder38 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder39 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder40 = new examples.MinFinder(tList23);
        examples.MinFinder.T t42 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t44 = new examples.MinFinder.T((-3));
        int int45 = t44.getVal();
        int int46 = t44.getVal();
        int int47 = t44.getVal();
        int int48 = t44.getVal();
        int int49 = t44.getVal();
        examples.MinFinder.T t51 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t53 = new examples.MinFinder.T((-3));
        int int54 = t53.getVal();
        int int55 = t53.getVal();
        int int56 = t53.getVal();
        int int57 = t53.getVal();
        int int58 = t53.getVal();
        int int59 = t53.getVal();
        examples.MinFinder.T t61 = new examples.MinFinder.T((int) 'a');
        int int62 = t61.getVal();
        examples.MinFinder.T[] tArray63 = new examples.MinFinder.T[] { t42, t44, t51, t53, t61 };
        java.util.ArrayList<examples.MinFinder.T> tList64 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList64, tArray63);
        examples.MinFinder minFinder66 = new examples.MinFinder(tList64);
        examples.MinFinder minFinder67 = new examples.MinFinder(tList64);
        examples.MinFinder minFinder68 = new examples.MinFinder(tList64);
        examples.MinFinder.T t69 = minFinder68.findMin();
        examples.MinFinder.T t71 = new examples.MinFinder.T((int) (short) 100);
        minFinder68.add(t71);
        examples.MinFinder.T t73 = minFinder68.findMin();
        examples.MinFinder.T t74 = minFinder68.findMin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder40.chval(t74, 5);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t3 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t5 = minFinder0.findMin();
        examples.MinFinder.T t6 = minFinder0.findMin();
        minFinder0.clear();
        minFinder0.clear();
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        int int13 = t12.getVal();
        int int14 = t12.getVal();
        int int15 = t12.getVal();
        int int16 = t12.getVal();
        int int17 = t12.getVal();
        examples.MinFinder.T t19 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t21 = new examples.MinFinder.T((-3));
        int int22 = t21.getVal();
        int int23 = t21.getVal();
        int int24 = t21.getVal();
        int int25 = t21.getVal();
        int int26 = t21.getVal();
        int int27 = t21.getVal();
        examples.MinFinder.T t29 = new examples.MinFinder.T((int) 'a');
        int int30 = t29.getVal();
        examples.MinFinder.T[] tArray31 = new examples.MinFinder.T[] { t10, t12, t19, t21, t29 };
        java.util.ArrayList<examples.MinFinder.T> tList32 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList32, tArray31);
        examples.MinFinder minFinder34 = new examples.MinFinder(tList32);
        examples.MinFinder minFinder35 = new examples.MinFinder(tList32);
        examples.MinFinder minFinder36 = new examples.MinFinder(tList32);
        examples.MinFinder minFinder37 = new examples.MinFinder(tList32);
        examples.MinFinder minFinder38 = new examples.MinFinder(tList32);
        examples.MinFinder minFinder39 = new examples.MinFinder(tList32);
        examples.MinFinder minFinder40 = new examples.MinFinder(tList32);
        examples.MinFinder minFinder41 = new examples.MinFinder(tList32);
        examples.MinFinder.T t43 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t45 = new examples.MinFinder.T((-3));
        int int46 = t45.getVal();
        int int47 = t45.getVal();
        int int48 = t45.getVal();
        int int49 = t45.getVal();
        int int50 = t45.getVal();
        examples.MinFinder.T t52 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t54 = new examples.MinFinder.T((-3));
        int int55 = t54.getVal();
        int int56 = t54.getVal();
        int int57 = t54.getVal();
        int int58 = t54.getVal();
        int int59 = t54.getVal();
        int int60 = t54.getVal();
        examples.MinFinder.T t62 = new examples.MinFinder.T((int) 'a');
        int int63 = t62.getVal();
        examples.MinFinder.T[] tArray64 = new examples.MinFinder.T[] { t43, t45, t52, t54, t62 };
        java.util.ArrayList<examples.MinFinder.T> tList65 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList65, tArray64);
        examples.MinFinder minFinder67 = new examples.MinFinder(tList65);
        examples.MinFinder minFinder68 = new examples.MinFinder(tList65);
        examples.MinFinder minFinder69 = new examples.MinFinder(tList65);
        examples.MinFinder.T t70 = minFinder69.findMin();
        int int71 = t70.getVal();
        minFinder41.add(t70);
        examples.MinFinder.T t73 = minFinder41.findMin();
        int int74 = t73.getVal();
        minFinder0.add(t73);
        examples.MinFinder.T t77 = new examples.MinFinder.T((-9));
        int int78 = t77.getVal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t77, (int) 'a');
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t3 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t5 = minFinder0.findMin();
        examples.MinFinder.T t6 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t9 = new examples.MinFinder.T((-3));
        int int10 = t9.getVal();
        int int11 = t9.getVal();
        minFinder0.add(t9);
        examples.MinFinder.T t14 = new examples.MinFinder.T((int) '#');
        boolean boolean16 = t14.equals((java.lang.Object) 9L);
        examples.MinFinder minFinder17 = new examples.MinFinder();
        examples.MinFinder.T t18 = minFinder17.findMin();
        examples.MinFinder.T t20 = new examples.MinFinder.T(3);
        minFinder17.chval(t20, (int) (short) -1);
        examples.MinFinder minFinder23 = new examples.MinFinder();
        examples.MinFinder.T t24 = minFinder23.findMin();
        examples.MinFinder.T t26 = new examples.MinFinder.T(3);
        minFinder23.chval(t26, (int) (short) -1);
        minFinder17.add(t26);
        minFinder17.clear();
        examples.MinFinder.T t32 = new examples.MinFinder.T((int) (short) 0);
        minFinder17.chval(t32, (int) '4');
        examples.MinFinder.T t36 = new examples.MinFinder.T((int) '#');
        int int37 = t36.getVal();
        minFinder17.chval(t36, (int) (byte) 0);
        examples.MinFinder.T t40 = minFinder17.findMin();
        boolean boolean41 = t14.equals((java.lang.Object) minFinder17);
        int int42 = t14.getVal();
        examples.MinFinder.T t44 = new examples.MinFinder.T(35);
        boolean boolean45 = t14.equals((java.lang.Object) t44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t44, (-5));
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        minFinder0.clear();
        minFinder0.clear();
        examples.MinFinder.T t5 = new examples.MinFinder.T((int) 'a');
        int int6 = t5.getVal();
        minFinder0.add(t5);
        minFinder0.clear();
        examples.MinFinder.T t10 = new examples.MinFinder.T((int) 'a');
        minFinder0.add(t10);
        examples.MinFinder minFinder12 = new examples.MinFinder();
        examples.MinFinder.T t13 = minFinder12.findMin();
        minFinder12.clear();
        minFinder12.clear();
        examples.MinFinder.T t17 = new examples.MinFinder.T((int) 'a');
        int int18 = t17.getVal();
        minFinder12.add(t17);
        examples.MinFinder.T t21 = new examples.MinFinder.T(3);
        minFinder12.add(t21);
        examples.MinFinder.T t23 = minFinder12.findMin();
        minFinder12.clear();
        examples.MinFinder.T t26 = new examples.MinFinder.T((-3));
        boolean boolean28 = t26.equals((java.lang.Object) ' ');
        minFinder12.add(t26);
        examples.MinFinder.T t30 = minFinder12.findMin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t30, 2);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        int int11 = t10.getVal();
        int int12 = t10.getVal();
        int int13 = t10.getVal();
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        int int16 = t15.getVal();
        int int17 = t15.getVal();
        int int18 = t15.getVal();
        int int19 = t15.getVal();
        examples.MinFinder.T t21 = new examples.MinFinder.T((int) '#');
        examples.MinFinder.T t23 = new examples.MinFinder.T((-3));
        int int24 = t23.getVal();
        int int25 = t23.getVal();
        int int26 = t23.getVal();
        int int27 = t23.getVal();
        int int28 = t23.getVal();
        int int29 = t23.getVal();
        examples.MinFinder.T t31 = new examples.MinFinder.T((-3));
        int int32 = t31.getVal();
        int int33 = t31.getVal();
        int int34 = t31.getVal();
        int int35 = t31.getVal();
        int int36 = t31.getVal();
        int int37 = t31.getVal();
        examples.MinFinder.T[] tArray38 = new examples.MinFinder.T[] { t1, t3, t10, t15, t21, t23, t31 };
        java.util.ArrayList<examples.MinFinder.T> tList39 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList39, tArray38);
        examples.MinFinder minFinder41 = new examples.MinFinder(tList39);
        examples.MinFinder minFinder42 = new examples.MinFinder(tList39);
        examples.MinFinder minFinder43 = new examples.MinFinder(tList39);
        examples.MinFinder minFinder44 = new examples.MinFinder(tList39);
        examples.MinFinder minFinder45 = new examples.MinFinder(tList39);
        examples.MinFinder minFinder46 = new examples.MinFinder(tList39);
        examples.MinFinder minFinder47 = new examples.MinFinder(tList39);
        examples.MinFinder.T t48 = minFinder47.findMin();
        examples.MinFinder.T t50 = new examples.MinFinder.T((-3));
        int int51 = t50.getVal();
        int int52 = t50.getVal();
        int int53 = t50.getVal();
        int int54 = t50.getVal();
        int int55 = t50.getVal();
        int int56 = t50.getVal();
        boolean boolean58 = t50.equals((java.lang.Object) 0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder47.chval(t50, (int) (byte) 100);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        int int13 = t12.getVal();
        int int14 = t12.getVal();
        int int15 = t12.getVal();
        int int16 = t12.getVal();
        int int17 = t12.getVal();
        int int18 = t12.getVal();
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        int int21 = t20.getVal();
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t1, t3, t10, t12, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        examples.MinFinder minFinder25 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder26 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder27 = new examples.MinFinder(tList23);
        examples.MinFinder.T t28 = minFinder27.findMin();
        examples.MinFinder.T t30 = new examples.MinFinder.T((int) (short) 100);
        minFinder27.add(t30);
        examples.MinFinder.T t33 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t35 = new examples.MinFinder.T((-3));
        int int36 = t35.getVal();
        int int37 = t35.getVal();
        int int38 = t35.getVal();
        int int39 = t35.getVal();
        int int40 = t35.getVal();
        examples.MinFinder.T t42 = new examples.MinFinder.T((-3));
        int int43 = t42.getVal();
        int int44 = t42.getVal();
        int int45 = t42.getVal();
        examples.MinFinder.T t47 = new examples.MinFinder.T((-3));
        int int48 = t47.getVal();
        int int49 = t47.getVal();
        int int50 = t47.getVal();
        int int51 = t47.getVal();
        examples.MinFinder.T t53 = new examples.MinFinder.T((int) '#');
        examples.MinFinder.T t55 = new examples.MinFinder.T((-3));
        int int56 = t55.getVal();
        int int57 = t55.getVal();
        int int58 = t55.getVal();
        int int59 = t55.getVal();
        int int60 = t55.getVal();
        int int61 = t55.getVal();
        examples.MinFinder.T t63 = new examples.MinFinder.T((-3));
        int int64 = t63.getVal();
        int int65 = t63.getVal();
        int int66 = t63.getVal();
        int int67 = t63.getVal();
        int int68 = t63.getVal();
        int int69 = t63.getVal();
        examples.MinFinder.T[] tArray70 = new examples.MinFinder.T[] { t33, t35, t42, t47, t53, t55, t63 };
        java.util.ArrayList<examples.MinFinder.T> tList71 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList71, tArray70);
        examples.MinFinder minFinder73 = new examples.MinFinder(tList71);
        examples.MinFinder minFinder74 = new examples.MinFinder(tList71);
        examples.MinFinder minFinder75 = new examples.MinFinder(tList71);
        examples.MinFinder.T t76 = minFinder75.findMin();
        examples.MinFinder.T t77 = minFinder75.findMin();
        examples.MinFinder.T t78 = minFinder75.findMin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder27.chval(t78, 4);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        int int13 = t12.getVal();
        int int14 = t12.getVal();
        int int15 = t12.getVal();
        int int16 = t12.getVal();
        int int17 = t12.getVal();
        int int18 = t12.getVal();
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        int int21 = t20.getVal();
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t1, t3, t10, t12, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        examples.MinFinder minFinder25 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder26 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder27 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder28 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder29 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder30 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder31 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder32 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder33 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder34 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder35 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder36 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder37 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder38 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder39 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder40 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder41 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder42 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder43 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder44 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder45 = new examples.MinFinder(tList23);
        examples.MinFinder.T t47 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t49 = new examples.MinFinder.T((-3));
        int int50 = t49.getVal();
        int int51 = t49.getVal();
        int int52 = t49.getVal();
        int int53 = t49.getVal();
        int int54 = t49.getVal();
        examples.MinFinder.T t56 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t58 = new examples.MinFinder.T((-3));
        int int59 = t58.getVal();
        int int60 = t58.getVal();
        int int61 = t58.getVal();
        int int62 = t58.getVal();
        int int63 = t58.getVal();
        int int64 = t58.getVal();
        examples.MinFinder.T t66 = new examples.MinFinder.T((int) 'a');
        int int67 = t66.getVal();
        examples.MinFinder.T[] tArray68 = new examples.MinFinder.T[] { t47, t49, t56, t58, t66 };
        java.util.ArrayList<examples.MinFinder.T> tList69 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList69, tArray68);
        examples.MinFinder minFinder71 = new examples.MinFinder(tList69);
        examples.MinFinder minFinder72 = new examples.MinFinder(tList69);
        examples.MinFinder minFinder73 = new examples.MinFinder(tList69);
        examples.MinFinder.T t74 = minFinder73.findMin();
        examples.MinFinder.T t76 = new examples.MinFinder.T((int) (short) 100);
        minFinder73.add(t76);
        examples.MinFinder minFinder78 = new examples.MinFinder();
        examples.MinFinder.T t79 = minFinder78.findMin();
        examples.MinFinder.T t81 = new examples.MinFinder.T(3);
        minFinder78.chval(t81, (int) (short) -1);
        examples.MinFinder minFinder84 = new examples.MinFinder();
        examples.MinFinder.T t85 = minFinder84.findMin();
        examples.MinFinder.T t87 = new examples.MinFinder.T(3);
        minFinder84.chval(t87, (int) (short) -1);
        minFinder78.add(t87);
        minFinder73.add(t87);
        examples.MinFinder.T t93 = new examples.MinFinder.T(5);
        int int94 = t93.getVal();
        int int95 = t93.getVal();
        minFinder73.add(t93);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder45.chval(t93, 3);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test78");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        int int13 = t12.getVal();
        int int14 = t12.getVal();
        int int15 = t12.getVal();
        int int16 = t12.getVal();
        int int17 = t12.getVal();
        int int18 = t12.getVal();
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        int int21 = t20.getVal();
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t1, t3, t10, t12, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        examples.MinFinder minFinder25 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder26 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder27 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder28 = new examples.MinFinder(tList23);
        examples.MinFinder.T t30 = new examples.MinFinder.T((-3));
        boolean boolean32 = t30.equals((java.lang.Object) (-1));
        minFinder28.add(t30);
        examples.MinFinder.T t35 = new examples.MinFinder.T(5);
        minFinder28.add(t35);
        examples.MinFinder.T t38 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t40 = new examples.MinFinder.T((-3));
        int int41 = t40.getVal();
        int int42 = t40.getVal();
        int int43 = t40.getVal();
        int int44 = t40.getVal();
        int int45 = t40.getVal();
        examples.MinFinder.T t47 = new examples.MinFinder.T((-3));
        int int48 = t47.getVal();
        int int49 = t47.getVal();
        int int50 = t47.getVal();
        examples.MinFinder.T t52 = new examples.MinFinder.T((-3));
        int int53 = t52.getVal();
        int int54 = t52.getVal();
        int int55 = t52.getVal();
        int int56 = t52.getVal();
        examples.MinFinder.T t58 = new examples.MinFinder.T((int) '#');
        examples.MinFinder.T t60 = new examples.MinFinder.T((-3));
        int int61 = t60.getVal();
        int int62 = t60.getVal();
        int int63 = t60.getVal();
        int int64 = t60.getVal();
        int int65 = t60.getVal();
        int int66 = t60.getVal();
        examples.MinFinder.T t68 = new examples.MinFinder.T((-3));
        int int69 = t68.getVal();
        int int70 = t68.getVal();
        int int71 = t68.getVal();
        int int72 = t68.getVal();
        int int73 = t68.getVal();
        int int74 = t68.getVal();
        examples.MinFinder.T[] tArray75 = new examples.MinFinder.T[] { t38, t40, t47, t52, t58, t60, t68 };
        java.util.ArrayList<examples.MinFinder.T> tList76 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList76, tArray75);
        examples.MinFinder minFinder78 = new examples.MinFinder(tList76);
        examples.MinFinder minFinder79 = new examples.MinFinder(tList76);
        examples.MinFinder minFinder80 = new examples.MinFinder(tList76);
        examples.MinFinder.T t81 = minFinder80.findMin();
        examples.MinFinder.T t82 = minFinder80.findMin();
        examples.MinFinder.T t83 = minFinder80.findMin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder28.chval(t83, 10);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test79");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        minFinder0.clear();
        minFinder0.clear();
        examples.MinFinder.T t5 = new examples.MinFinder.T((int) 'a');
        int int6 = t5.getVal();
        minFinder0.add(t5);
        examples.MinFinder.T t9 = new examples.MinFinder.T(3);
        minFinder0.add(t9);
        examples.MinFinder.T t11 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t14 = new examples.MinFinder.T((-3));
        boolean boolean16 = t14.equals((java.lang.Object) ' ');
        minFinder0.add(t14);
        examples.MinFinder.T t19 = new examples.MinFinder.T((-3));
        boolean boolean21 = t19.equals((java.lang.Object) (-1));
        examples.MinFinder.T t23 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t25 = new examples.MinFinder.T((-3));
        int int26 = t25.getVal();
        int int27 = t25.getVal();
        int int28 = t25.getVal();
        int int29 = t25.getVal();
        int int30 = t25.getVal();
        examples.MinFinder.T t32 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t34 = new examples.MinFinder.T((-3));
        int int35 = t34.getVal();
        int int36 = t34.getVal();
        int int37 = t34.getVal();
        int int38 = t34.getVal();
        int int39 = t34.getVal();
        int int40 = t34.getVal();
        examples.MinFinder.T t42 = new examples.MinFinder.T((int) 'a');
        int int43 = t42.getVal();
        examples.MinFinder.T[] tArray44 = new examples.MinFinder.T[] { t23, t25, t32, t34, t42 };
        java.util.ArrayList<examples.MinFinder.T> tList45 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList45, tArray44);
        examples.MinFinder minFinder47 = new examples.MinFinder(tList45);
        examples.MinFinder minFinder48 = new examples.MinFinder(tList45);
        examples.MinFinder minFinder49 = new examples.MinFinder(tList45);
        examples.MinFinder minFinder50 = new examples.MinFinder(tList45);
        examples.MinFinder minFinder51 = new examples.MinFinder(tList45);
        examples.MinFinder minFinder52 = new examples.MinFinder(tList45);
        examples.MinFinder minFinder53 = new examples.MinFinder(tList45);
        examples.MinFinder minFinder54 = new examples.MinFinder(tList45);
        boolean boolean55 = t19.equals((java.lang.Object) minFinder54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t19, (int) (byte) 1);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test80");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t3 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t5 = minFinder0.findMin();
        minFinder0.clear();
        minFinder0.clear();
        examples.MinFinder.T t8 = minFinder0.findMin();
        examples.MinFinder.T t9 = minFinder0.findMin();
        examples.MinFinder.T t10 = minFinder0.findMin();
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        int int13 = t12.getVal();
        int int14 = t12.getVal();
        int int15 = t12.getVal();
        int int16 = t12.getVal();
        int int17 = t12.getVal();
        boolean boolean19 = t12.equals((java.lang.Object) 100.0d);
        int int20 = t12.getVal();
        minFinder0.add(t12);
        examples.MinFinder.T t22 = minFinder0.findMin();
        examples.MinFinder.T t24 = new examples.MinFinder.T((int) (byte) 10);
        examples.MinFinder minFinder25 = new examples.MinFinder();
        examples.MinFinder.T t26 = minFinder25.findMin();
        minFinder25.clear();
        examples.MinFinder.T t28 = minFinder25.findMin();
        minFinder25.clear();
        examples.MinFinder.T t31 = new examples.MinFinder.T((-3));
        int int32 = t31.getVal();
        int int33 = t31.getVal();
        int int34 = t31.getVal();
        int int35 = t31.getVal();
        minFinder25.chval(t31, 0);
        boolean boolean38 = t24.equals((java.lang.Object) minFinder25);
        examples.MinFinder.T t40 = new examples.MinFinder.T((int) (short) 0);
        int int41 = t40.getVal();
        minFinder25.chval(t40, (-5));
        examples.MinFinder.T t45 = new examples.MinFinder.T(1);
        examples.MinFinder minFinder46 = new examples.MinFinder();
        examples.MinFinder.T t47 = minFinder46.findMin();
        minFinder46.clear();
        minFinder46.clear();
        examples.MinFinder.T t51 = new examples.MinFinder.T((int) 'a');
        int int52 = t51.getVal();
        minFinder46.add(t51);
        examples.MinFinder.T t55 = new examples.MinFinder.T(3);
        minFinder46.add(t55);
        boolean boolean57 = t45.equals((java.lang.Object) t55);
        int int58 = t55.getVal();
        minFinder25.chval(t55, 0);
        examples.MinFinder.T t62 = new examples.MinFinder.T((-3));
        int int63 = t62.getVal();
        int int64 = t62.getVal();
        int int65 = t62.getVal();
        int int66 = t62.getVal();
        int int67 = t62.getVal();
        boolean boolean69 = t62.equals((java.lang.Object) 0.0d);
        examples.MinFinder minFinder70 = new examples.MinFinder();
        examples.MinFinder.T t71 = minFinder70.findMin();
        minFinder70.clear();
        examples.MinFinder.T t73 = minFinder70.findMin();
        minFinder70.clear();
        examples.MinFinder.T t76 = new examples.MinFinder.T((-3));
        int int77 = t76.getVal();
        int int78 = t76.getVal();
        int int79 = t76.getVal();
        int int80 = t76.getVal();
        minFinder70.chval(t76, 0);
        minFinder70.clear();
        examples.MinFinder.T t84 = minFinder70.findMin();
        examples.MinFinder.T t86 = new examples.MinFinder.T((-3));
        boolean boolean88 = t86.equals((java.lang.Object) ' ');
        minFinder70.add(t86);
        boolean boolean90 = t62.equals((java.lang.Object) t86);
        minFinder25.add(t62);
        int int92 = t62.getVal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t62, 0);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test81");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        int int13 = t12.getVal();
        int int14 = t12.getVal();
        int int15 = t12.getVal();
        int int16 = t12.getVal();
        int int17 = t12.getVal();
        int int18 = t12.getVal();
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        int int21 = t20.getVal();
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t1, t3, t10, t12, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        examples.MinFinder minFinder25 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder26 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder27 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder28 = new examples.MinFinder();
        examples.MinFinder.T t29 = minFinder28.findMin();
        minFinder28.clear();
        examples.MinFinder.T t31 = minFinder28.findMin();
        minFinder28.clear();
        examples.MinFinder.T t33 = minFinder28.findMin();
        examples.MinFinder.T t34 = minFinder28.findMin();
        examples.MinFinder minFinder35 = new examples.MinFinder();
        examples.MinFinder.T t36 = minFinder35.findMin();
        minFinder35.clear();
        minFinder35.clear();
        examples.MinFinder.T t40 = new examples.MinFinder.T((int) 'a');
        int int41 = t40.getVal();
        minFinder35.add(t40);
        examples.MinFinder.T t44 = new examples.MinFinder.T(3);
        minFinder35.add(t44);
        examples.MinFinder.T t46 = minFinder35.findMin();
        minFinder35.clear();
        examples.MinFinder.T t49 = new examples.MinFinder.T((-3));
        boolean boolean51 = t49.equals((java.lang.Object) ' ');
        minFinder35.add(t49);
        minFinder28.chval(t49, (int) (byte) 10);
        examples.MinFinder.T t56 = new examples.MinFinder.T((-3));
        int int57 = t56.getVal();
        int int58 = t56.getVal();
        int int59 = t56.getVal();
        int int60 = t56.getVal();
        int int61 = t56.getVal();
        boolean boolean63 = t56.equals((java.lang.Object) 100.0d);
        minFinder28.add(t56);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder27.chval(t56, 3);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test82");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t3 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t5 = minFinder0.findMin();
        examples.MinFinder minFinder6 = new examples.MinFinder();
        examples.MinFinder.T t7 = minFinder6.findMin();
        examples.MinFinder.T t9 = new examples.MinFinder.T(3);
        minFinder6.chval(t9, (int) (short) -1);
        examples.MinFinder minFinder12 = new examples.MinFinder();
        examples.MinFinder.T t13 = minFinder12.findMin();
        examples.MinFinder.T t15 = new examples.MinFinder.T(3);
        minFinder12.chval(t15, (int) (short) -1);
        minFinder6.add(t15);
        int int19 = t15.getVal();
        minFinder0.add(t15);
        examples.MinFinder.T t22 = new examples.MinFinder.T(10);
        examples.MinFinder minFinder23 = new examples.MinFinder();
        examples.MinFinder.T t24 = minFinder23.findMin();
        minFinder23.clear();
        examples.MinFinder.T t26 = minFinder23.findMin();
        minFinder23.clear();
        minFinder23.clear();
        boolean boolean29 = t22.equals((java.lang.Object) minFinder23);
        int int30 = t22.getVal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t22, (int) '4');
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test83");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t3 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t6 = new examples.MinFinder.T((-3));
        int int7 = t6.getVal();
        int int8 = t6.getVal();
        int int9 = t6.getVal();
        int int10 = t6.getVal();
        minFinder0.chval(t6, 0);
        examples.MinFinder.T t14 = new examples.MinFinder.T((-3));
        int int15 = t14.getVal();
        int int16 = t14.getVal();
        int int17 = t14.getVal();
        minFinder0.add(t14);
        examples.MinFinder.T t19 = minFinder0.findMin();
        minFinder0.clear();
        minFinder0.clear();
        examples.MinFinder.T t23 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t25 = new examples.MinFinder.T((-3));
        int int26 = t25.getVal();
        int int27 = t25.getVal();
        int int28 = t25.getVal();
        int int29 = t25.getVal();
        int int30 = t25.getVal();
        examples.MinFinder.T t32 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t34 = new examples.MinFinder.T((-3));
        int int35 = t34.getVal();
        int int36 = t34.getVal();
        int int37 = t34.getVal();
        int int38 = t34.getVal();
        int int39 = t34.getVal();
        int int40 = t34.getVal();
        examples.MinFinder.T t42 = new examples.MinFinder.T((int) 'a');
        int int43 = t42.getVal();
        examples.MinFinder.T[] tArray44 = new examples.MinFinder.T[] { t23, t25, t32, t34, t42 };
        java.util.ArrayList<examples.MinFinder.T> tList45 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList45, tArray44);
        examples.MinFinder minFinder47 = new examples.MinFinder(tList45);
        examples.MinFinder minFinder48 = new examples.MinFinder(tList45);
        examples.MinFinder.T t49 = minFinder48.findMin();
        int int50 = t49.getVal();
        minFinder0.add(t49);
        examples.MinFinder minFinder52 = new examples.MinFinder();
        examples.MinFinder.T t53 = minFinder52.findMin();
        examples.MinFinder.T t55 = new examples.MinFinder.T(3);
        minFinder52.chval(t55, (int) (short) -1);
        examples.MinFinder minFinder58 = new examples.MinFinder();
        examples.MinFinder.T t59 = minFinder58.findMin();
        examples.MinFinder.T t61 = new examples.MinFinder.T(3);
        minFinder58.chval(t61, (int) (short) -1);
        minFinder52.add(t61);
        examples.MinFinder.T t66 = new examples.MinFinder.T((int) 'a');
        int int67 = t66.getVal();
        minFinder52.add(t66);
        examples.MinFinder.T t69 = minFinder52.findMin();
        examples.MinFinder.T t70 = minFinder52.findMin();
        examples.MinFinder minFinder71 = new examples.MinFinder();
        examples.MinFinder.T t72 = minFinder71.findMin();
        minFinder71.clear();
        examples.MinFinder.T t74 = minFinder71.findMin();
        minFinder71.clear();
        examples.MinFinder.T t77 = new examples.MinFinder.T((-3));
        int int78 = t77.getVal();
        int int79 = t77.getVal();
        int int80 = t77.getVal();
        int int81 = t77.getVal();
        minFinder71.chval(t77, 0);
        examples.MinFinder.T t85 = new examples.MinFinder.T((-3));
        int int86 = t85.getVal();
        int int87 = t85.getVal();
        int int88 = t85.getVal();
        minFinder71.add(t85);
        int int90 = t85.getVal();
        minFinder52.add(t85);
        int int92 = t85.getVal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t85, (-2));
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test84");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t3 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t5 = minFinder0.findMin();
        examples.MinFinder.T t6 = minFinder0.findMin();
        examples.MinFinder minFinder7 = new examples.MinFinder();
        examples.MinFinder.T t8 = minFinder7.findMin();
        minFinder7.clear();
        minFinder7.clear();
        examples.MinFinder.T t12 = new examples.MinFinder.T((int) 'a');
        int int13 = t12.getVal();
        minFinder7.add(t12);
        examples.MinFinder.T t16 = new examples.MinFinder.T(3);
        minFinder7.add(t16);
        examples.MinFinder.T t18 = minFinder7.findMin();
        minFinder7.clear();
        examples.MinFinder.T t21 = new examples.MinFinder.T((-3));
        boolean boolean23 = t21.equals((java.lang.Object) ' ');
        minFinder7.add(t21);
        minFinder0.chval(t21, (int) (byte) 10);
        examples.MinFinder.T t28 = new examples.MinFinder.T((-3));
        int int29 = t28.getVal();
        int int30 = t28.getVal();
        int int31 = t28.getVal();
        int int32 = t28.getVal();
        int int33 = t28.getVal();
        boolean boolean35 = t28.equals((java.lang.Object) 100.0d);
        minFinder0.add(t28);
        examples.MinFinder.T t38 = new examples.MinFinder.T(3);
        examples.MinFinder.T t40 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t42 = new examples.MinFinder.T((-3));
        int int43 = t42.getVal();
        int int44 = t42.getVal();
        int int45 = t42.getVal();
        int int46 = t42.getVal();
        int int47 = t42.getVal();
        examples.MinFinder.T t49 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t51 = new examples.MinFinder.T((-3));
        int int52 = t51.getVal();
        int int53 = t51.getVal();
        int int54 = t51.getVal();
        int int55 = t51.getVal();
        int int56 = t51.getVal();
        int int57 = t51.getVal();
        examples.MinFinder.T t59 = new examples.MinFinder.T((int) 'a');
        int int60 = t59.getVal();
        examples.MinFinder.T[] tArray61 = new examples.MinFinder.T[] { t40, t42, t49, t51, t59 };
        java.util.ArrayList<examples.MinFinder.T> tList62 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList62, tArray61);
        examples.MinFinder minFinder64 = new examples.MinFinder(tList62);
        examples.MinFinder minFinder65 = new examples.MinFinder(tList62);
        java.lang.Class<?> wildcardClass66 = tList62.getClass();
        boolean boolean67 = t38.equals((java.lang.Object) tList62);
        int int68 = t38.getVal();
        examples.MinFinder minFinder69 = new examples.MinFinder();
        examples.MinFinder.T t70 = minFinder69.findMin();
        minFinder69.clear();
        minFinder69.clear();
        examples.MinFinder.T t74 = new examples.MinFinder.T((int) 'a');
        int int75 = t74.getVal();
        minFinder69.add(t74);
        int int77 = t74.getVal();
        boolean boolean78 = t38.equals((java.lang.Object) t74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t38, (-7));
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test85");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        int int11 = t10.getVal();
        int int12 = t10.getVal();
        int int13 = t10.getVal();
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        int int16 = t15.getVal();
        int int17 = t15.getVal();
        int int18 = t15.getVal();
        int int19 = t15.getVal();
        examples.MinFinder.T t21 = new examples.MinFinder.T((int) '#');
        examples.MinFinder.T t23 = new examples.MinFinder.T((-3));
        int int24 = t23.getVal();
        int int25 = t23.getVal();
        int int26 = t23.getVal();
        int int27 = t23.getVal();
        int int28 = t23.getVal();
        int int29 = t23.getVal();
        examples.MinFinder.T t31 = new examples.MinFinder.T((-3));
        int int32 = t31.getVal();
        int int33 = t31.getVal();
        int int34 = t31.getVal();
        int int35 = t31.getVal();
        int int36 = t31.getVal();
        int int37 = t31.getVal();
        examples.MinFinder.T[] tArray38 = new examples.MinFinder.T[] { t1, t3, t10, t15, t21, t23, t31 };
        java.util.ArrayList<examples.MinFinder.T> tList39 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList39, tArray38);
        examples.MinFinder minFinder41 = new examples.MinFinder(tList39);
        minFinder41.clear();
        examples.MinFinder.T t44 = new examples.MinFinder.T((-3));
        boolean boolean46 = t44.equals((java.lang.Object) ' ');
        minFinder41.chval(t44, (int) 'a');
        examples.MinFinder.T t50 = new examples.MinFinder.T((-3));
        minFinder41.add(t50);
        minFinder41.clear();
        examples.MinFinder minFinder53 = new examples.MinFinder();
        examples.MinFinder.T t54 = minFinder53.findMin();
        examples.MinFinder.T t56 = new examples.MinFinder.T(3);
        minFinder53.chval(t56, (int) (short) -1);
        examples.MinFinder minFinder59 = new examples.MinFinder();
        examples.MinFinder.T t60 = minFinder59.findMin();
        examples.MinFinder.T t62 = new examples.MinFinder.T(3);
        minFinder59.chval(t62, (int) (short) -1);
        minFinder53.add(t62);
        minFinder53.clear();
        examples.MinFinder.T t68 = new examples.MinFinder.T((int) (short) 0);
        minFinder53.chval(t68, (int) '4');
        minFinder41.add(t68);
        examples.MinFinder minFinder72 = new examples.MinFinder();
        examples.MinFinder.T t73 = minFinder72.findMin();
        minFinder72.clear();
        minFinder72.clear();
        examples.MinFinder.T t77 = new examples.MinFinder.T((int) 'a');
        int int78 = t77.getVal();
        minFinder72.add(t77);
        minFinder72.clear();
        examples.MinFinder.T t82 = new examples.MinFinder.T((int) 'a');
        minFinder72.add(t82);
        examples.MinFinder.T t84 = minFinder72.findMin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder41.chval(t84, 5);
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test86");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        int int13 = t12.getVal();
        int int14 = t12.getVal();
        int int15 = t12.getVal();
        int int16 = t12.getVal();
        int int17 = t12.getVal();
        int int18 = t12.getVal();
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        int int21 = t20.getVal();
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t1, t3, t10, t12, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        examples.MinFinder minFinder25 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder26 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder27 = new examples.MinFinder(tList23);
        examples.MinFinder.T t28 = minFinder27.findMin();
        examples.MinFinder.T t30 = new examples.MinFinder.T((int) (short) 100);
        minFinder27.add(t30);
        examples.MinFinder minFinder32 = new examples.MinFinder();
        examples.MinFinder.T t33 = minFinder32.findMin();
        examples.MinFinder.T t35 = new examples.MinFinder.T(3);
        minFinder32.chval(t35, (int) (short) -1);
        examples.MinFinder minFinder38 = new examples.MinFinder();
        examples.MinFinder.T t39 = minFinder38.findMin();
        examples.MinFinder.T t41 = new examples.MinFinder.T(3);
        minFinder38.chval(t41, (int) (short) -1);
        minFinder32.add(t41);
        minFinder27.add(t41);
        examples.MinFinder minFinder46 = new examples.MinFinder();
        examples.MinFinder.T t47 = minFinder46.findMin();
        minFinder46.clear();
        examples.MinFinder.T t49 = minFinder46.findMin();
        minFinder46.clear();
        examples.MinFinder.T t52 = new examples.MinFinder.T((-3));
        int int53 = t52.getVal();
        int int54 = t52.getVal();
        int int55 = t52.getVal();
        int int56 = t52.getVal();
        minFinder46.chval(t52, 0);
        examples.MinFinder.T t60 = new examples.MinFinder.T((int) (short) 100);
        examples.MinFinder minFinder61 = new examples.MinFinder();
        examples.MinFinder.T t62 = minFinder61.findMin();
        examples.MinFinder.T t64 = new examples.MinFinder.T(3);
        minFinder61.chval(t64, (int) (short) -1);
        examples.MinFinder minFinder67 = new examples.MinFinder();
        examples.MinFinder.T t68 = minFinder67.findMin();
        examples.MinFinder.T t70 = new examples.MinFinder.T(3);
        minFinder67.chval(t70, (int) (short) -1);
        minFinder61.add(t70);
        boolean boolean74 = t60.equals((java.lang.Object) minFinder61);
        minFinder61.clear();
        examples.MinFinder.T t77 = new examples.MinFinder.T(3);
        minFinder61.chval(t77, 1);
        minFinder46.add(t77);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder27.chval(t77, (-10));
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test87");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        minFinder0.clear();
        minFinder0.clear();
        minFinder0.clear();
        minFinder0.clear();
        examples.MinFinder.T t5 = minFinder0.findMin();
        examples.MinFinder.T t6 = minFinder0.findMin();
        minFinder0.clear();
        minFinder0.clear();
        examples.MinFinder minFinder9 = new examples.MinFinder();
        examples.MinFinder.T t10 = minFinder9.findMin();
        examples.MinFinder.T t12 = new examples.MinFinder.T(3);
        minFinder9.chval(t12, (int) (short) -1);
        examples.MinFinder minFinder15 = new examples.MinFinder();
        examples.MinFinder.T t16 = minFinder15.findMin();
        examples.MinFinder.T t18 = new examples.MinFinder.T(3);
        minFinder15.chval(t18, (int) (short) -1);
        minFinder9.add(t18);
        examples.MinFinder.T t23 = new examples.MinFinder.T((-9));
        minFinder9.add(t23);
        examples.MinFinder.T t25 = minFinder9.findMin();
        examples.MinFinder minFinder26 = new examples.MinFinder();
        examples.MinFinder.T t27 = minFinder26.findMin();
        minFinder26.clear();
        minFinder26.clear();
        examples.MinFinder.T t31 = new examples.MinFinder.T((int) 'a');
        int int32 = t31.getVal();
        minFinder26.add(t31);
        minFinder26.clear();
        examples.MinFinder.T t36 = new examples.MinFinder.T((int) 'a');
        minFinder26.add(t36);
        boolean boolean38 = t25.equals((java.lang.Object) t36);
        minFinder0.add(t36);
        examples.MinFinder.T t41 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t43 = new examples.MinFinder.T((-3));
        int int44 = t43.getVal();
        int int45 = t43.getVal();
        int int46 = t43.getVal();
        int int47 = t43.getVal();
        int int48 = t43.getVal();
        examples.MinFinder.T t50 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t52 = new examples.MinFinder.T((-3));
        int int53 = t52.getVal();
        int int54 = t52.getVal();
        int int55 = t52.getVal();
        int int56 = t52.getVal();
        int int57 = t52.getVal();
        int int58 = t52.getVal();
        examples.MinFinder.T t60 = new examples.MinFinder.T((int) 'a');
        int int61 = t60.getVal();
        examples.MinFinder.T[] tArray62 = new examples.MinFinder.T[] { t41, t43, t50, t52, t60 };
        java.util.ArrayList<examples.MinFinder.T> tList63 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList63, tArray62);
        examples.MinFinder minFinder65 = new examples.MinFinder(tList63);
        examples.MinFinder minFinder66 = new examples.MinFinder(tList63);
        examples.MinFinder minFinder67 = new examples.MinFinder(tList63);
        examples.MinFinder minFinder68 = new examples.MinFinder(tList63);
        examples.MinFinder minFinder69 = new examples.MinFinder(tList63);
        examples.MinFinder.T t71 = new examples.MinFinder.T((int) 'a');
        minFinder69.add(t71);
        examples.MinFinder.T t73 = minFinder69.findMin();
        int int74 = t73.getVal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t73, (-5));
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test88");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t3 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t5 = minFinder0.findMin();
        examples.MinFinder.T t6 = minFinder0.findMin();
        examples.MinFinder minFinder7 = new examples.MinFinder();
        examples.MinFinder.T t8 = minFinder7.findMin();
        minFinder7.clear();
        minFinder7.clear();
        examples.MinFinder.T t12 = new examples.MinFinder.T((int) 'a');
        int int13 = t12.getVal();
        minFinder7.add(t12);
        examples.MinFinder.T t16 = new examples.MinFinder.T(3);
        minFinder7.add(t16);
        examples.MinFinder.T t18 = minFinder7.findMin();
        minFinder7.clear();
        examples.MinFinder.T t21 = new examples.MinFinder.T((-3));
        boolean boolean23 = t21.equals((java.lang.Object) ' ');
        minFinder7.add(t21);
        minFinder0.chval(t21, (int) (byte) 10);
        examples.MinFinder.T t28 = new examples.MinFinder.T((-3));
        int int29 = t28.getVal();
        int int30 = t28.getVal();
        int int31 = t28.getVal();
        int int32 = t28.getVal();
        int int33 = t28.getVal();
        boolean boolean35 = t28.equals((java.lang.Object) 100.0d);
        minFinder0.add(t28);
        examples.MinFinder minFinder37 = new examples.MinFinder();
        examples.MinFinder.T t38 = minFinder37.findMin();
        minFinder37.clear();
        examples.MinFinder.T t40 = minFinder37.findMin();
        minFinder37.clear();
        minFinder37.clear();
        examples.MinFinder.T t44 = new examples.MinFinder.T((-9));
        int int45 = t44.getVal();
        minFinder37.chval(t44, 10);
        examples.MinFinder minFinder48 = new examples.MinFinder();
        examples.MinFinder.T t49 = minFinder48.findMin();
        minFinder48.clear();
        examples.MinFinder.T t51 = minFinder48.findMin();
        minFinder48.clear();
        examples.MinFinder.T t54 = new examples.MinFinder.T((-3));
        int int55 = t54.getVal();
        int int56 = t54.getVal();
        int int57 = t54.getVal();
        int int58 = t54.getVal();
        minFinder48.chval(t54, 0);
        minFinder37.add(t54);
        examples.MinFinder.T t62 = minFinder37.findMin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t62, 10);
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test89");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t3 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t5 = minFinder0.findMin();
        minFinder0.clear();
        minFinder0.clear();
        examples.MinFinder.T t8 = minFinder0.findMin();
        examples.MinFinder.T t9 = minFinder0.findMin();
        examples.MinFinder.T t10 = minFinder0.findMin();
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        boolean boolean14 = t12.equals((java.lang.Object) (-1));
        minFinder0.chval(t12, (-2));
        examples.MinFinder.T t18 = new examples.MinFinder.T(3);
        examples.MinFinder.T t20 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t22 = new examples.MinFinder.T((-3));
        int int23 = t22.getVal();
        int int24 = t22.getVal();
        int int25 = t22.getVal();
        int int26 = t22.getVal();
        int int27 = t22.getVal();
        examples.MinFinder.T t29 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t31 = new examples.MinFinder.T((-3));
        int int32 = t31.getVal();
        int int33 = t31.getVal();
        int int34 = t31.getVal();
        int int35 = t31.getVal();
        int int36 = t31.getVal();
        int int37 = t31.getVal();
        examples.MinFinder.T t39 = new examples.MinFinder.T((int) 'a');
        int int40 = t39.getVal();
        examples.MinFinder.T[] tArray41 = new examples.MinFinder.T[] { t20, t22, t29, t31, t39 };
        java.util.ArrayList<examples.MinFinder.T> tList42 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList42, tArray41);
        examples.MinFinder minFinder44 = new examples.MinFinder(tList42);
        examples.MinFinder minFinder45 = new examples.MinFinder(tList42);
        java.lang.Class<?> wildcardClass46 = tList42.getClass();
        boolean boolean47 = t18.equals((java.lang.Object) tList42);
        minFinder0.add(t18);
        examples.MinFinder.T t49 = minFinder0.findMin();
        examples.MinFinder.T t51 = new examples.MinFinder.T((-3));
        int int52 = t51.getVal();
        int int53 = t51.getVal();
        int int54 = t51.getVal();
        int int55 = t51.getVal();
        int int56 = t51.getVal();
        boolean boolean58 = t51.equals((java.lang.Object) 0.0d);
        minFinder0.add(t51);
        examples.MinFinder minFinder60 = new examples.MinFinder();
        examples.MinFinder.T t61 = minFinder60.findMin();
        minFinder60.clear();
        examples.MinFinder.T t63 = minFinder60.findMin();
        minFinder60.clear();
        examples.MinFinder.T t66 = new examples.MinFinder.T((-3));
        int int67 = t66.getVal();
        int int68 = t66.getVal();
        int int69 = t66.getVal();
        int int70 = t66.getVal();
        minFinder60.chval(t66, 0);
        examples.MinFinder minFinder73 = new examples.MinFinder();
        examples.MinFinder.T t74 = minFinder73.findMin();
        minFinder73.clear();
        examples.MinFinder.T t76 = minFinder73.findMin();
        minFinder73.clear();
        examples.MinFinder.T t79 = new examples.MinFinder.T((-3));
        int int80 = t79.getVal();
        int int81 = t79.getVal();
        int int82 = t79.getVal();
        int int83 = t79.getVal();
        minFinder73.chval(t79, 0);
        examples.MinFinder.T t87 = new examples.MinFinder.T((-3));
        int int88 = t87.getVal();
        int int89 = t87.getVal();
        int int90 = t87.getVal();
        minFinder73.add(t87);
        int int92 = t87.getVal();
        minFinder60.add(t87);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t87, (int) (byte) 10);
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test90");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t3 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder.T t5 = minFinder0.findMin();
        minFinder0.clear();
        minFinder0.clear();
        minFinder0.clear();
        examples.MinFinder.T t9 = minFinder0.findMin();
        minFinder0.clear();
        examples.MinFinder minFinder11 = new examples.MinFinder();
        examples.MinFinder.T t12 = minFinder11.findMin();
        minFinder11.clear();
        minFinder11.clear();
        examples.MinFinder.T t16 = new examples.MinFinder.T((int) 'a');
        int int17 = t16.getVal();
        minFinder11.add(t16);
        examples.MinFinder.T t20 = new examples.MinFinder.T(1);
        boolean boolean21 = t16.equals((java.lang.Object) t20);
        int int22 = t20.getVal();
        boolean boolean24 = t20.equals((java.lang.Object) 3L);
        minFinder0.add(t20);
        examples.MinFinder.T t27 = new examples.MinFinder.T((-3));
        int int28 = t27.getVal();
        int int29 = t27.getVal();
        int int30 = t27.getVal();
        int int31 = t27.getVal();
        examples.MinFinder.T t33 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t35 = new examples.MinFinder.T((-3));
        int int36 = t35.getVal();
        int int37 = t35.getVal();
        int int38 = t35.getVal();
        int int39 = t35.getVal();
        int int40 = t35.getVal();
        examples.MinFinder.T t42 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t44 = new examples.MinFinder.T((-3));
        int int45 = t44.getVal();
        int int46 = t44.getVal();
        int int47 = t44.getVal();
        int int48 = t44.getVal();
        int int49 = t44.getVal();
        int int50 = t44.getVal();
        examples.MinFinder.T t52 = new examples.MinFinder.T((int) 'a');
        int int53 = t52.getVal();
        examples.MinFinder.T[] tArray54 = new examples.MinFinder.T[] { t33, t35, t42, t44, t52 };
        java.util.ArrayList<examples.MinFinder.T> tList55 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList55, tArray54);
        examples.MinFinder minFinder57 = new examples.MinFinder(tList55);
        examples.MinFinder minFinder58 = new examples.MinFinder(tList55);
        examples.MinFinder minFinder59 = new examples.MinFinder(tList55);
        examples.MinFinder minFinder60 = new examples.MinFinder(tList55);
        examples.MinFinder minFinder61 = new examples.MinFinder(tList55);
        examples.MinFinder minFinder62 = new examples.MinFinder();
        examples.MinFinder.T t63 = minFinder62.findMin();
        minFinder62.clear();
        examples.MinFinder.T t65 = minFinder62.findMin();
        minFinder62.clear();
        examples.MinFinder.T t68 = new examples.MinFinder.T((-3));
        int int69 = t68.getVal();
        int int70 = t68.getVal();
        int int71 = t68.getVal();
        int int72 = t68.getVal();
        minFinder62.chval(t68, 0);
        examples.MinFinder.T t76 = new examples.MinFinder.T((-3));
        boolean boolean78 = t76.equals((java.lang.Object) (-1));
        int int79 = t76.getVal();
        minFinder62.chval(t76, 0);
        minFinder61.add(t76);
        java.lang.Class<?> wildcardClass83 = t76.getClass();
        boolean boolean84 = t27.equals((java.lang.Object) t76);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t76, 8);
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test91");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((-3));
        int int11 = t10.getVal();
        int int12 = t10.getVal();
        int int13 = t10.getVal();
        examples.MinFinder.T t15 = new examples.MinFinder.T((-3));
        int int16 = t15.getVal();
        int int17 = t15.getVal();
        int int18 = t15.getVal();
        int int19 = t15.getVal();
        examples.MinFinder.T t21 = new examples.MinFinder.T((int) '#');
        examples.MinFinder.T t23 = new examples.MinFinder.T((-3));
        int int24 = t23.getVal();
        int int25 = t23.getVal();
        int int26 = t23.getVal();
        int int27 = t23.getVal();
        int int28 = t23.getVal();
        int int29 = t23.getVal();
        examples.MinFinder.T t31 = new examples.MinFinder.T((-3));
        int int32 = t31.getVal();
        int int33 = t31.getVal();
        int int34 = t31.getVal();
        int int35 = t31.getVal();
        int int36 = t31.getVal();
        int int37 = t31.getVal();
        examples.MinFinder.T[] tArray38 = new examples.MinFinder.T[] { t1, t3, t10, t15, t21, t23, t31 };
        java.util.ArrayList<examples.MinFinder.T> tList39 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList39, tArray38);
        examples.MinFinder minFinder41 = new examples.MinFinder(tList39);
        examples.MinFinder minFinder42 = new examples.MinFinder(tList39);
        examples.MinFinder minFinder43 = new examples.MinFinder(tList39);
        examples.MinFinder minFinder44 = new examples.MinFinder(tList39);
        examples.MinFinder minFinder45 = new examples.MinFinder(tList39);
        examples.MinFinder minFinder46 = new examples.MinFinder(tList39);
        examples.MinFinder.T t48 = new examples.MinFinder.T((-10));
        int int49 = t48.getVal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder46.chval(t48, (-5));
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test92");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        examples.MinFinder.T t3 = new examples.MinFinder.T(3);
        minFinder0.chval(t3, (int) (short) -1);
        examples.MinFinder minFinder6 = new examples.MinFinder();
        examples.MinFinder.T t7 = minFinder6.findMin();
        examples.MinFinder.T t9 = new examples.MinFinder.T(3);
        minFinder6.chval(t9, (int) (short) -1);
        minFinder0.add(t9);
        examples.MinFinder.T t14 = new examples.MinFinder.T((int) 'a');
        int int15 = t14.getVal();
        minFinder0.add(t14);
        examples.MinFinder minFinder17 = new examples.MinFinder();
        examples.MinFinder.T t18 = minFinder17.findMin();
        minFinder17.clear();
        minFinder17.clear();
        examples.MinFinder.T t22 = new examples.MinFinder.T((int) 'a');
        int int23 = t22.getVal();
        minFinder17.add(t22);
        minFinder17.clear();
        examples.MinFinder.T t27 = new examples.MinFinder.T((int) 'a');
        minFinder17.add(t27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t27, (-6));
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test93");
        examples.MinFinder.T t1 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t3 = new examples.MinFinder.T((-3));
        int int4 = t3.getVal();
        int int5 = t3.getVal();
        int int6 = t3.getVal();
        int int7 = t3.getVal();
        int int8 = t3.getVal();
        examples.MinFinder.T t10 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t12 = new examples.MinFinder.T((-3));
        int int13 = t12.getVal();
        int int14 = t12.getVal();
        int int15 = t12.getVal();
        int int16 = t12.getVal();
        int int17 = t12.getVal();
        int int18 = t12.getVal();
        examples.MinFinder.T t20 = new examples.MinFinder.T((int) 'a');
        int int21 = t20.getVal();
        examples.MinFinder.T[] tArray22 = new examples.MinFinder.T[] { t1, t3, t10, t12, t20 };
        java.util.ArrayList<examples.MinFinder.T> tList23 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList23, tArray22);
        examples.MinFinder minFinder25 = new examples.MinFinder(tList23);
        examples.MinFinder minFinder26 = new examples.MinFinder(tList23);
        examples.MinFinder.T t27 = minFinder26.findMin();
        minFinder26.clear();
        minFinder26.clear();
        examples.MinFinder minFinder30 = new examples.MinFinder();
        examples.MinFinder.T t31 = minFinder30.findMin();
        minFinder30.clear();
        examples.MinFinder.T t33 = minFinder30.findMin();
        minFinder30.clear();
        examples.MinFinder.T t36 = new examples.MinFinder.T((-3));
        int int37 = t36.getVal();
        int int38 = t36.getVal();
        int int39 = t36.getVal();
        int int40 = t36.getVal();
        minFinder30.chval(t36, 0);
        minFinder30.clear();
        examples.MinFinder minFinder44 = new examples.MinFinder();
        examples.MinFinder.T t45 = minFinder44.findMin();
        examples.MinFinder.T t47 = new examples.MinFinder.T(3);
        minFinder44.chval(t47, (int) (short) -1);
        examples.MinFinder minFinder50 = new examples.MinFinder();
        examples.MinFinder.T t51 = minFinder50.findMin();
        examples.MinFinder.T t53 = new examples.MinFinder.T(3);
        minFinder50.chval(t53, (int) (short) -1);
        minFinder44.add(t53);
        minFinder44.clear();
        examples.MinFinder.T t59 = new examples.MinFinder.T((int) (short) 0);
        minFinder44.chval(t59, (int) '4');
        minFinder30.add(t59);
        int int63 = t59.getVal();
        examples.MinFinder minFinder64 = new examples.MinFinder();
        examples.MinFinder.T t65 = minFinder64.findMin();
        minFinder64.clear();
        examples.MinFinder.T t67 = minFinder64.findMin();
        minFinder64.clear();
        examples.MinFinder.T t70 = new examples.MinFinder.T((-3));
        int int71 = t70.getVal();
        int int72 = t70.getVal();
        int int73 = t70.getVal();
        int int74 = t70.getVal();
        minFinder64.chval(t70, 0);
        boolean boolean77 = t59.equals((java.lang.Object) 0);
        int int78 = t59.getVal();
        int int79 = t59.getVal();
        minFinder26.add(t59);
        examples.MinFinder minFinder81 = new examples.MinFinder();
        examples.MinFinder.T t83 = new examples.MinFinder.T((-3));
        int int84 = t83.getVal();
        int int85 = t83.getVal();
        int int86 = t83.getVal();
        int int87 = t83.getVal();
        int int88 = t83.getVal();
        minFinder81.chval(t83, (int) ' ');
        examples.MinFinder.T t92 = new examples.MinFinder.T((-9));
        boolean boolean94 = t92.equals((java.lang.Object) 6);
        minFinder81.chval(t92, 97);
        int int97 = t92.getVal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder26.chval(t92, 2);
    }

    @Test
    public void test94() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test94");
        examples.MinFinder minFinder0 = new examples.MinFinder();
        examples.MinFinder.T t1 = minFinder0.findMin();
        examples.MinFinder.T t3 = new examples.MinFinder.T(3);
        minFinder0.chval(t3, (int) (short) -1);
        examples.MinFinder minFinder6 = new examples.MinFinder();
        examples.MinFinder.T t7 = minFinder6.findMin();
        examples.MinFinder.T t9 = new examples.MinFinder.T(3);
        minFinder6.chval(t9, (int) (short) -1);
        minFinder0.add(t9);
        minFinder0.clear();
        examples.MinFinder.T t15 = new examples.MinFinder.T((int) (short) 0);
        minFinder0.chval(t15, (int) '4');
        examples.MinFinder.T t19 = new examples.MinFinder.T((int) (short) 0);
        int int20 = t19.getVal();
        minFinder0.chval(t19, 100);
        examples.MinFinder.T t23 = minFinder0.findMin();
        examples.MinFinder.T t25 = new examples.MinFinder.T((int) '4');
        int int26 = t25.getVal();
        minFinder0.add(t25);
        examples.MinFinder.T t29 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t31 = new examples.MinFinder.T((-3));
        int int32 = t31.getVal();
        int int33 = t31.getVal();
        int int34 = t31.getVal();
        int int35 = t31.getVal();
        int int36 = t31.getVal();
        examples.MinFinder.T t38 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t40 = new examples.MinFinder.T((-3));
        int int41 = t40.getVal();
        int int42 = t40.getVal();
        int int43 = t40.getVal();
        int int44 = t40.getVal();
        int int45 = t40.getVal();
        int int46 = t40.getVal();
        examples.MinFinder.T t48 = new examples.MinFinder.T((int) 'a');
        int int49 = t48.getVal();
        examples.MinFinder.T[] tArray50 = new examples.MinFinder.T[] { t29, t31, t38, t40, t48 };
        java.util.ArrayList<examples.MinFinder.T> tList51 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList51, tArray50);
        examples.MinFinder minFinder53 = new examples.MinFinder(tList51);
        minFinder53.clear();
        examples.MinFinder.T t56 = new examples.MinFinder.T((-3));
        examples.MinFinder.T t58 = new examples.MinFinder.T((-3));
        int int59 = t58.getVal();
        int int60 = t58.getVal();
        int int61 = t58.getVal();
        int int62 = t58.getVal();
        int int63 = t58.getVal();
        examples.MinFinder.T t65 = new examples.MinFinder.T((int) 'a');
        examples.MinFinder.T t67 = new examples.MinFinder.T((-3));
        int int68 = t67.getVal();
        int int69 = t67.getVal();
        int int70 = t67.getVal();
        int int71 = t67.getVal();
        int int72 = t67.getVal();
        int int73 = t67.getVal();
        examples.MinFinder.T t75 = new examples.MinFinder.T((int) 'a');
        int int76 = t75.getVal();
        examples.MinFinder.T[] tArray77 = new examples.MinFinder.T[] { t56, t58, t65, t67, t75 };
        java.util.ArrayList<examples.MinFinder.T> tList78 = new java.util.ArrayList<examples.MinFinder.T>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<examples.MinFinder.T>) tList78, tArray77);
        examples.MinFinder minFinder80 = new examples.MinFinder(tList78);
        examples.MinFinder minFinder81 = new examples.MinFinder(tList78);
        examples.MinFinder minFinder82 = new examples.MinFinder(tList78);
        examples.MinFinder.T t83 = minFinder82.findMin();
        examples.MinFinder.T t85 = new examples.MinFinder.T((int) (short) 100);
        minFinder82.add(t85);
        examples.MinFinder.T t87 = minFinder82.findMin();
        minFinder53.chval(t87, (-6));
        int int90 = t87.getVal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        minFinder0.chval(t87, (-2));
    }
}

