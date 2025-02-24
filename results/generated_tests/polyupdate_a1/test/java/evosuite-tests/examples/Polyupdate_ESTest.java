/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 30 14:45:10 GMT 2024
 */

package examples;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import examples.Polyupdate;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Polyupdate_ESTest extends Polyupdate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Polyupdate polyupdate0 = new Polyupdate();
      polyupdate0.a1(0);
      assertEquals(0, polyupdate0.sm());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Polyupdate polyupdate0 = new Polyupdate();
      polyupdate0.add3(1, 1, (-2), (-1055));
      assertEquals((-1055), polyupdate0.sm());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Polyupdate polyupdate0 = new Polyupdate();
      polyupdate0.add3(2, (-1), 2, 0);
      assertEquals(3, polyupdate0.sm());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Polyupdate polyupdate0 = new Polyupdate();
      int int0 = polyupdate0.sm();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Polyupdate polyupdate0 = new Polyupdate();
      polyupdate0.a1(1);
      int int0 = polyupdate0.sm();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Polyupdate polyupdate0 = null;
      try {
        polyupdate0 = new Polyupdate((ArrayList<Integer>) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("examples.Polyupdate", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Polyupdate polyupdate0 = new Polyupdate(arrayList0, (-736));
      polyupdate0.a1(2962);
      assertEquals(5188, polyupdate0.sm());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Polyupdate polyupdate0 = new Polyupdate(arrayList0, (-736));
      polyupdate0.a1((-2944));
      assertEquals((-3680), polyupdate0.sm());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer((-736));
      arrayList0.add(integer0);
      Polyupdate polyupdate0 = new Polyupdate(arrayList0, (-736));
      polyupdate0.a1((-2944));
      assertEquals((-4416), polyupdate0.sm());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Polyupdate polyupdate0 = new Polyupdate(arrayList0, (-736));
      int int0 = polyupdate0.sm();
      assertEquals((-736), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Polyupdate polyupdate0 = new Polyupdate();
      polyupdate0.clear();
      assertEquals(0, polyupdate0.sm());
  }
}
