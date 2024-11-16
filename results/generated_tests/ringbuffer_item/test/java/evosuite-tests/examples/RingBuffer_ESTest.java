/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 22:43:08 GMT 2023
 */

package examples;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import examples.RingBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RingBuffer_ESTest extends RingBuffer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RingBuffer<Object> ringBuffer0 = new RingBuffer<Object>(2);
      ringBuffer0.extend((Object) null);
      ringBuffer0.remove();
      ringBuffer0.extend((Object) null);
      ringBuffer0.remove();
      RingBuffer<String> ringBuffer1 = new RingBuffer<String>(2);
      ringBuffer0.extend(ringBuffer1);
      ringBuffer0.extend((Object) null);
      assertEquals(3, ringBuffer0.count());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RingBuffer<String> ringBuffer0 = new RingBuffer<String>(1);
      ringBuffer0.extend("Y|cB+7*[a*`#HE(w");
      ringBuffer0.wipeOut();
      ringBuffer0.extend("parameter must be positive");
      int int0 = ringBuffer0.count();
      assertFalse(ringBuffer0.isEmpty());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RingBuffer<Object> ringBuffer0 = new RingBuffer<Object>(225);
      ringBuffer0.extend((Object) null);
      ringBuffer0.item();
      assertEquals(1, ringBuffer0.count());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RingBuffer<Object> ringBuffer0 = new RingBuffer<Object>(2290);
      int int0 = ringBuffer0.count();
      assertEquals(0, int0);
      assertEquals(2291, ringBuffer0.dataCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RingBuffer<Object> ringBuffer0 = new RingBuffer<Object>(1671);
      ringBuffer0.extend(")L<Ij~");
      ringBuffer0.wipeOut();
      ringBuffer0.isFull();
      assertEquals(1, ringBuffer0.count());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RingBuffer<String> ringBuffer0 = new RingBuffer<String>(1);
      ringBuffer0.extend("Y|cB+7*[a*`#HE(w");
      ringBuffer0.wipeOut();
      ringBuffer0.extend("parameter must be positive");
      ringBuffer0.wipeOut();
      ringBuffer0.extend("parameter must be positive");
      boolean boolean0 = ringBuffer0.isFull();
      assertFalse(ringBuffer0.isEmpty());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RingBuffer<String> ringBuffer0 = new RingBuffer<String>(293);
      ringBuffer0.extend("B+A:UV'7D%L53w");
      ringBuffer0.isEmpty();
      assertEquals(1, ringBuffer0.count());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RingBuffer<Object> ringBuffer0 = new RingBuffer<Object>(1);
      boolean boolean0 = ringBuffer0.isEmpty();
      assertTrue(boolean0);
      assertEquals(2, ringBuffer0.dataCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RingBuffer<String> ringBuffer0 = new RingBuffer<String>(293);
      int int0 = ringBuffer0.dataCount();
      assertEquals(294, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RingBuffer<Object> ringBuffer0 = new RingBuffer<Object>(278);
      // Undeclared exception!
      try { 
        ringBuffer0.remove();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // buffer is empty
         //
         verifyException("examples.RingBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RingBuffer<String> ringBuffer0 = new RingBuffer<String>(1);
      ringBuffer0.extend("Y|cB+7*[a*`#HE(w");
      ringBuffer0.wipeOut();
      ringBuffer0.extend("parameter must be positive");
      boolean boolean0 = ringBuffer0.isFull();
      assertFalse(ringBuffer0.isEmpty());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RingBuffer<String> ringBuffer0 = new RingBuffer<String>(1);
      ringBuffer0.extend("Y|cB+7*[a*`#HE(w");
      // Undeclared exception!
      try { 
        ringBuffer0.extend("parameter must be positive");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // buffer is full
         //
         verifyException("examples.RingBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RingBuffer<Integer> ringBuffer0 = new RingBuffer<Integer>(3020);
      Integer integer0 = new Integer(7);
      ringBuffer0.extend(integer0);
      int int0 = ringBuffer0.count();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RingBuffer<Integer> ringBuffer0 = new RingBuffer<Integer>(1481);
      // Undeclared exception!
      try { 
        ringBuffer0.item();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // empty buffer
         //
         verifyException("examples.RingBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RingBuffer<Object> ringBuffer0 = new RingBuffer<Object>(278);
      Integer integer0 = new Integer(278);
      ringBuffer0.extend(integer0);
      ringBuffer0.item();
      assertEquals(1, ringBuffer0.count());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RingBuffer<Integer> ringBuffer0 = null;
      try {
        ringBuffer0 = new RingBuffer<Integer>((-1630));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // parameter must be positive
         //
         verifyException("examples.RingBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RingBuffer<Object> ringBuffer0 = new RingBuffer<Object>(1836);
      int int0 = ringBuffer0.capacity();
      assertEquals(1836, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RingBuffer<Object> ringBuffer0 = new RingBuffer<Object>(1);
      ringBuffer0.extend((Object) null);
      ringBuffer0.remove();
      ringBuffer0.extend((Object) null);
      ringBuffer0.remove();
      ringBuffer0.isFull();
      assertEquals(2, ringBuffer0.count());
  }
}
