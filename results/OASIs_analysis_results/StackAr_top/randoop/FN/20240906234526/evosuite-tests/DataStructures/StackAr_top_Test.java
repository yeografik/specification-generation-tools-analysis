/*
 * This file was automatically generated by EvoSuite
 * Sat Sep 07 02:46:33 GMT 2024
 */

package DataStructures;

import org.junit.Test;
import static org.junit.Assert.*;
import DataStructures.StackAr;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StackAr_top_Test extends StackAr_top_Test_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. Strong Mutation 34: DataStructures.StackAr.topAndPop()Ljava/lang/Object;:115 - InsertUnaryOp -1 (old_this_theArray;)
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StackAr stackAr0 = new StackAr(11);
      Object object0 = new Object();
      stackAr0.push((Object) null);
      stackAr0.push(object0);
      Object object1 = stackAr0.topAndPop();
  }
}
