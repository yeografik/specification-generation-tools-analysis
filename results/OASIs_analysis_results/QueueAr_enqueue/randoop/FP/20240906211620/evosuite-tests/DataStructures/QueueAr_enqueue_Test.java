/*
 * This file was automatically generated by EvoSuite
 * Sat Sep 07 00:16:53 GMT 2024
 */

package DataStructures;

import org.junit.Test;
import static org.junit.Assert.*;
import DataStructures.QueueAr;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class QueueAr_enqueue_Test extends QueueAr_enqueue_Test_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. DataStructures.QueueAr.enqueue(Ljava/lang/Object;)V: I420 Branch 57 IFNE L113 - false
   * Goal 2. DataStructures.QueueAr.enqueue(Ljava/lang/Object;)V: I423 Branch 58 IF_ICMPGT L113 - true
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object object0 = new Object();
      QueueAr queueAr0 = new QueueAr(1);
      queueAr0.enqueue(object0);
  }
}
