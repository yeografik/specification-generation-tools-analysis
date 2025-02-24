/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 23:34:41 GMT 2024
 */

package lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import lang3.BooleanUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BooleanUtils_toBoolean_Test extends BooleanUtils_toBoolean_Test_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. lang3.BooleanUtils.toBoolean(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Z: I101 Branch 10 IFNE L70 - false
   * Goal 2. lang3.BooleanUtils.toBoolean(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Z: I104 Branch 11 IF_ICMPGT L70 - true
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer(2878);
      Integer integer1 = new Integer(2878);
      boolean boolean0 = BooleanUtils.toBoolean(integer1, integer0, integer0);
  }
}
