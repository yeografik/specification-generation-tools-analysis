/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 18:17:33 GMT 2024
 */

package examples;

import org.junit.Test;
import static org.junit.Assert.*;
import examples.ListComp02;
import examples.R;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ListComp02_insert_r_Test extends ListComp02_insert_r_Test_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. examples.ListComp02.insert_r(Lexamples/R;)V: I202 Branch 23 IFNE L54 - false
   * Goal 2. examples.ListComp02.insert_r(Lexamples/R;)V: I205 Branch 24 IF_ICMPGT L54 - true
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ListComp02 listComp02_0 = new ListComp02();
      Integer integer0 = listComp02_0.q();
      R r0 = new R(integer0, "examples.ListComp02");
      listComp02_0.insert_r(r0);
  }
}
