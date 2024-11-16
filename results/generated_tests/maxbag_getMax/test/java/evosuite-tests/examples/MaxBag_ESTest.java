/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 30 14:43:37 GMT 2024
 */

package examples;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import examples.MaxBag;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MaxBag_ESTest extends MaxBag_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      MaxBag maxBag0 = new MaxBag(arrayList0);
      Integer integer0 = new Integer((-2251));
      maxBag0.add(integer0);
      Integer integer1 = new Integer((-2251));
      maxBag0.add(integer1);
      maxBag0.add(integer1);
      maxBag0.remove(integer0);
      assertEquals((-2251), (int)maxBag0.getMax());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MaxBag maxBag0 = new MaxBag();
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer((-1));
      maxBag0.add(integer1);
      assertEquals((-1), (int)maxBag0.getMax());
      
      maxBag0.add(integer0);
      maxBag0.add(integer0);
      maxBag0.remove(integer0);
      assertEquals(0, (int)maxBag0.getMax());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      MaxBag maxBag0 = new MaxBag(arrayList0);
      maxBag0.add((Integer) null);
      Integer integer0 = maxBag0.getMax();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(1);
      arrayList0.add(integer0);
      MaxBag maxBag0 = new MaxBag(arrayList0);
      Integer integer1 = maxBag0.getMax();
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = Integer.valueOf((-1356));
      arrayList0.add(integer0);
      MaxBag maxBag0 = new MaxBag(arrayList0);
      Integer integer1 = maxBag0.getMax();
      assertEquals((-1356), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer((-2661));
      arrayList0.add(integer0);
      MaxBag maxBag0 = new MaxBag(arrayList0);
      Integer integer1 = Integer.getInteger("w]EUq@|#w.'<MA{h");
      // Undeclared exception!
      try { 
        maxBag0.add(integer1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("examples.MaxBag", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      arrayList0.add((Integer) null);
      Integer integer0 = new Integer(2555);
      arrayList0.add(integer0);
      MaxBag maxBag0 = null;
      try {
        maxBag0 = new MaxBag(arrayList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("examples.MaxBag", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      MaxBag maxBag0 = new MaxBag(arrayList0);
      maxBag0.clear();
      assertEquals(0, (int)maxBag0.getMax());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(1);
      arrayList0.add(integer0);
      MaxBag maxBag0 = new MaxBag(arrayList0);
      maxBag0.add(integer0);
      maxBag0.add(integer0);
      maxBag0.add(integer0);
      maxBag0.remove(integer0);
      assertEquals(1, (int)maxBag0.getMax());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(1);
      arrayList0.add(integer0);
      MaxBag maxBag0 = new MaxBag(arrayList0);
      maxBag0.add(integer0);
      Integer integer1 = new Integer((-83));
      maxBag0.add(integer1);
      maxBag0.remove(integer0);
      assertEquals(1, (int)maxBag0.getMax());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MaxBag maxBag0 = new MaxBag();
      Integer integer0 = new Integer(0);
      maxBag0.add(integer0);
      maxBag0.add(integer0);
      maxBag0.remove(integer0);
      assertEquals(0, (int)maxBag0.getMax());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MaxBag maxBag0 = new MaxBag();
      Integer integer0 = new Integer(0);
      maxBag0.remove(integer0);
      assertEquals(0, (int)maxBag0.getMax());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer((-13));
      arrayList0.add(integer0);
      MaxBag maxBag0 = new MaxBag(arrayList0);
      assertEquals((-13), (int)maxBag0.getMax());
      
      maxBag0.remove(integer0);
      assertEquals(0, (int)maxBag0.getMax());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer((-13));
      MaxBag maxBag0 = new MaxBag(arrayList0);
      maxBag0.remove(integer0);
      assertEquals(0, (int)maxBag0.getMax());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer((-13));
      arrayList0.add(integer0);
      Integer integer1 = new Integer(0);
      arrayList0.add(integer1);
      MaxBag maxBag0 = new MaxBag(arrayList0);
      assertEquals(0, (int)maxBag0.getMax());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer((-13));
      arrayList0.add(integer0);
      arrayList0.add(integer0);
      MaxBag maxBag0 = new MaxBag(arrayList0);
      assertEquals((-13), (int)maxBag0.getMax());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MaxBag maxBag0 = new MaxBag();
      Integer integer0 = maxBag0.getMax();
      assertEquals(0, (int)integer0);
  }
}
