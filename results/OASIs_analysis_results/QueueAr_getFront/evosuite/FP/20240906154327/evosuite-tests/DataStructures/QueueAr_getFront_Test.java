/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 18:44:01 GMT 2024
 */

package DataStructures;

import org.junit.Test;
import static org.junit.Assert.*;
import DataStructures.QueueAr;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class QueueAr_getFront_Test extends QueueAr_getFront_Test_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. DataStructures.QueueAr.getFront()Ljava/lang/Object;: I327 Branch 46 IFNE L75 - false
   * Goal 2. DataStructures.QueueAr.getFront()Ljava/lang/Object;: I330 Branch 47 IF_ICMPGT L75 - true
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QueueAr queueAr0 = new QueueAr(18);
      Object object0 = queueAr0.getFront();
  }
}
