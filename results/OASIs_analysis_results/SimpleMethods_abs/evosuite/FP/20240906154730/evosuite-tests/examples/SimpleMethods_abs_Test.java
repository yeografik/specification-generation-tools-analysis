/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 18:48:03 GMT 2024
 */

package examples;

import org.junit.Test;
import static org.junit.Assert.*;
import examples.SimpleMethods;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleMethods_abs_Test extends SimpleMethods_abs_Test_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. examples.SimpleMethods.abs(I)I: I36 Branch 3 IFNE L19 - false
   * Goal 2. examples.SimpleMethods.abs(I)I: I39 Branch 4 IF_ICMPGT L19 - true
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimpleMethods simpleMethods0 = new SimpleMethods();
      int int0 = simpleMethods0.abs((-1));
  }
}
