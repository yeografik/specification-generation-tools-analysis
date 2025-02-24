/*
 * This file was automatically generated by EvoSuite
 * Sat Sep 07 00:30:53 GMT 2024
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
   * Goal 1. examples.SimpleMethods.incrementNumberAtIndex([II)V: I91 Branch 8 IFNE L27 - false
   * Goal 2. examples.SimpleMethods.incrementNumberAtIndex([II)V: I94 Branch 9 IF_ICMPGT L27 - true
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimpleMethods simpleMethods0 = new SimpleMethods();
      int[] intArray0 = new int[10];
      intArray0[5] = Integer.MAX_VALUE;
      simpleMethods0.incrementNumberAtIndex(intArray0, 5);
  }
}
