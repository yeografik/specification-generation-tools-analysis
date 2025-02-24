/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 22:23:39 GMT 2023
 */

package examples;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import examples.Composite;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Composite_ESTest extends Composite_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Composite composite0 = new Composite((-855));
      Composite composite1 = new Composite((-3543));
      composite0.addChild(composite1);
      assertFalse(composite1.equals((Object)composite0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Composite composite0 = new Composite((-2210));
      Composite composite1 = new Composite((-2210));
      composite0.addChild(composite1);
      Set<Composite> set0 = composite0.children();
      assertTrue(set0.contains(composite1));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Composite composite0 = new Composite((-2210));
      Composite composite1 = new Composite((-2210));
      composite0.addChild(composite1);
      // Undeclared exception!
      try { 
        composite1.addChild(composite0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("examples.Composite", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Composite composite0 = new Composite((-19));
      Composite composite1 = new Composite((-19));
      composite0.addChild(composite1);
      // Undeclared exception!
      try { 
        composite0.addChild(composite1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("examples.Composite", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Composite composite0 = new Composite((-2210));
      Composite composite1 = new Composite(0);
      composite0.addChild(composite1);
      Composite composite2 = new Composite(1);
      composite1.addChild(composite2);
      assertFalse(composite2.equals((Object)composite0));
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Composite composite0 = new Composite((-2210));
      // Undeclared exception!
      try { 
        composite0.addChild(composite0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("examples.Composite", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Composite composite0 = new Composite((-2210));
      Set<Composite> set0 = composite0.children();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Composite composite0 = new Composite((-1));
      // Undeclared exception!
      try { 
        composite0.addChild((Composite) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("examples.Composite", e);
      }
  }
}
