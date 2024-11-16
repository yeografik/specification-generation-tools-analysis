/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 22:28:05 GMT 2023
 */

package examples;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import examples.ListComp02;
import examples.R;
import examples.S;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ListComp02_ESTest extends ListComp02_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ListComp02 listComp02_0 = new ListComp02();
      Integer integer0 = new Integer(2978);
      S s0 = new S("oSU|O_z$_}a", integer0);
      listComp02_0.insert_s(s0);
      Integer integer1 = new Integer((-2277));
      R r0 = new R(integer1, "oSU|O_z$_}a");
      listComp02_0.insert_r(r0);
      Integer integer2 = listComp02_0.q();
      assertEquals((-6780906), (int)integer2);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ListComp02 listComp02_0 = new ListComp02();
      Integer integer0 = new Integer(2978);
      S s0 = new S("oSU|O_z$_}a", integer0);
      Integer integer1 = new Integer(558);
      listComp02_0.insert_s(s0);
      R r0 = new R(integer1, "oSU|O_z$_}a");
      listComp02_0.insert_r(r0);
      Integer integer2 = listComp02_0.q();
      assertEquals(1661724, (int)integer2);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ListComp02 listComp02_0 = new ListComp02();
      Integer integer0 = new Integer((-163));
      S s0 = new S(";aeodkf[6j'", integer0);
      listComp02_0.insert_s(s0);
      listComp02_0.insert_r((R) null);
      // Undeclared exception!
      try { 
        listComp02_0.q();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("examples.ListComp02", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ArrayList<S> arrayList0 = new ArrayList<S>();
      ListComp02 listComp02_0 = new ListComp02((ArrayList<R>) null, arrayList0);
      Integer integer0 = new Integer(0);
      R r0 = new R(integer0, "");
      // Undeclared exception!
      try { 
        listComp02_0.insert_r(r0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("examples.ListComp02", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ListComp02 listComp02_0 = new ListComp02();
      listComp02_0.clear();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ArrayList<R> arrayList0 = new ArrayList<R>();
      ArrayList<S> arrayList1 = new ArrayList<S>();
      ListComp02 listComp02_0 = new ListComp02(arrayList0, arrayList1);
      Integer integer0 = new Integer((-598));
      R r0 = new R(integer0, "JZJ#a%+7cdh");
      S s0 = new S("JZJ#a%+7cdh", integer0);
      listComp02_0.insert_r(r0);
      listComp02_0.insert_s(s0);
      Integer integer1 = listComp02_0.q();
      assertEquals(357604, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ArrayList<R> arrayList0 = new ArrayList<R>();
      ArrayList<S> arrayList1 = new ArrayList<S>();
      ListComp02 listComp02_0 = new ListComp02(arrayList0, arrayList1);
      Integer integer0 = new Integer((-598));
      R r0 = new R(integer0, "JZJ#a%+7cdh");
      listComp02_0.insert_r(r0);
      assertEquals(1, arrayList0.size());
      
      Integer integer1 = listComp02_0.q();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ArrayList<R> arrayList0 = new ArrayList<R>();
      ListComp02 listComp02_0 = new ListComp02(arrayList0, (ArrayList<S>) null);
      S s0 = new S("HB}X@O-liIIaijR", (Integer) null);
      // Undeclared exception!
      try { 
        listComp02_0.insert_s(s0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("examples.ListComp02", e);
      }
  }
}
