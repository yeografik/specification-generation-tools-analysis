/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 18:50:15 GMT 2024
 */

package examples;

import org.junit.Test;
import static org.junit.Assert.*;
import examples.SimpleMethods;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleMethods_incrementNumberAtIndex_Test extends SimpleMethods_incrementNumberAtIndex_Test_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. examples.SimpleMethods.incrementNumberAtIndex([II)V: I89 Branch 6 IFNE L25 - false
   * Goal 2. examples.SimpleMethods.incrementNumberAtIndex([II)V: I92 Branch 7 IF_ICMPGT L25 - true
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimpleMethods simpleMethods0 = new SimpleMethods();
      int[] intArray0 = new int[4];
      simpleMethods0.incrementNumberAtIndex(intArray0, 0);
  }
}
