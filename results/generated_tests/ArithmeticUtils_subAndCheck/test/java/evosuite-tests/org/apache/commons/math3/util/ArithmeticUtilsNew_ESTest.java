/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 22:22:22 GMT 2023
 */

package org.apache.commons.math3.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.util.ArithmeticUtilsNew;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArithmeticUtilsNew_ESTest extends ArithmeticUtilsNew_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ArithmeticUtilsNew arithmeticUtilsNew0 = new ArithmeticUtilsNew();
      long long0 = arithmeticUtilsNew0.subAndCheck(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArithmeticUtilsNew arithmeticUtilsNew0 = new ArithmeticUtilsNew();
      long long0 = arithmeticUtilsNew0.subAndCheck((-9223372036854773942L), (-9223372036854775808L));
      assertEquals(1866L, long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArithmeticUtilsNew arithmeticUtilsNew0 = new ArithmeticUtilsNew();
      try { 
        arithmeticUtilsNew0.subAndCheck(0L, (-9223372036854775808L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // didn't work
         //
         verifyException("org.apache.commons.math3.util.ArithmeticUtilsNew", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ArithmeticUtilsNew arithmeticUtilsNew0 = new ArithmeticUtilsNew();
      long long0 = arithmeticUtilsNew0.subAndCheck(318L, (-477L));
      assertEquals(795L, long0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ArithmeticUtilsNew arithmeticUtilsNew0 = new ArithmeticUtilsNew();
      try { 
        arithmeticUtilsNew0.subAndCheck((-9223372036854775775L), 2349L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // didn't work addAndCheck
         //
         verifyException("org.apache.commons.math3.util.ArithmeticUtilsNew", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ArithmeticUtilsNew arithmeticUtilsNew0 = new ArithmeticUtilsNew();
      try { 
        arithmeticUtilsNew0.subAndCheck(188L, (-9223372036854775697L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // didn't work
         //
         verifyException("org.apache.commons.math3.util.ArithmeticUtilsNew", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ArithmeticUtilsNew arithmeticUtilsNew0 = new ArithmeticUtilsNew();
      long long0 = arithmeticUtilsNew0.subAndCheck((-9223372036854775775L), (-9223372036854775775L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ArithmeticUtilsNew arithmeticUtilsNew0 = new ArithmeticUtilsNew();
      long long0 = arithmeticUtilsNew0.subAndCheck((-9223372036854775775L), 0L);
      assertEquals((-9223372036854775775L), long0);
  }
}
