/*
 * This file was automatically generated by EvoSuite
 * Sat Sep 07 02:20:28 GMT 2024
 */

package org.apache.commons.math3.util;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.util.MathUtilsNew;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MathUtilsNew_copySignInt_Test extends MathUtilsNew_copySignInt_Test_scaffolding {

  //Test case number: 0
  /*
   * 10 covered goals:
   * Goal 1. Strong Mutation 1: org.apache.commons.math3.util.MathUtilsNew.copySignInt(II)I:34 - InsertUnaryOp IINC 1 (result:-2271,-2270; magnitude:2271,2270;)
   * Goal 2. Strong Mutation 2: org.apache.commons.math3.util.MathUtilsNew.copySignInt(II)I:34 - InsertUnaryOp IINC -1 (result:-2269,-2270; magnitude:2269,2270;)
   * Goal 3. Strong Mutation 6: org.apache.commons.math3.util.MathUtilsNew.copySignInt(II)I:34 - InsertUnaryOp Negation (result:2270,-2270;)
   * Goal 4. Strong Mutation 9: org.apache.commons.math3.util.MathUtilsNew.copySignInt(II)I:34 - ReplaceComparisonOperator >= -> -1 (result:2270,-2270;)
   * Goal 5. Strong Mutation 12: org.apache.commons.math3.util.MathUtilsNew.copySignInt(II)I:34 - InsertUnaryOp Negation (result:2270,-2270;)
   * Goal 6. Strong Mutation 14: org.apache.commons.math3.util.MathUtilsNew.copySignInt(II)I:34 - InsertUnaryOp IINC -1 (result:-2269,-2270; magnitude:2269,2270;)
   * Goal 7. Strong Mutation 16: org.apache.commons.math3.util.MathUtilsNew.copySignInt(II)I:34 - ReplaceComparisonOperator >= -> == (result:2270,-2270;)
   * Goal 8. Strong Mutation 45: org.apache.commons.math3.util.MathUtilsNew.copySignInt(II)I:42 - InsertUnaryOp Negation (result:2270,-2270;)
   * Goal 9. Strong Mutation 46: org.apache.commons.math3.util.MathUtilsNew.copySignInt(II)I:42 - InsertUnaryOp IINC 1 (result:-2271,-2270; magnitude:2271,2270;)
   * Goal 10. Strong Mutation 47: org.apache.commons.math3.util.MathUtilsNew.copySignInt(II)I:42 - InsertUnaryOp IINC -1 (result:-2269,-2270; magnitude:2269,2270;)
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MathUtilsNew mathUtilsNew0 = new MathUtilsNew();
      int int0 = MathUtilsNew.copySignInt(2270, (-555));
  }

  //Test case number: 1
  /*
   * 4 covered goals:
   * Goal 1. Strong Mutation 0: org.apache.commons.math3.util.MathUtilsNew.copySignInt(II)I:34 - InsertUnaryOp Negation (result:-2270,2270;)
   * Goal 2. Strong Mutation 4: org.apache.commons.math3.util.MathUtilsNew.copySignInt(II)I:34 - ReplaceComparisonOperator < -> != (result:-2270,2270;)
   * Goal 3. Strong Mutation 10: org.apache.commons.math3.util.MathUtilsNew.copySignInt(II)I:34 - ReplaceComparisonOperator >= -> == (result:-2270,2270;)
   * Goal 4. Strong Mutation 24: org.apache.commons.math3.util.MathUtilsNew.copySignInt(II)I:36 - InsertUnaryOp Negation (result:-2270,2270;)
   */

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MathUtilsNew mathUtilsNew0 = new MathUtilsNew();
      int int0 = MathUtilsNew.copySignInt(2270, 1);
  }

  //Test case number: 2
  /*
   * 3 covered goals:
   * Goal 1. Strong Mutation 15: org.apache.commons.math3.util.MathUtilsNew.copySignInt(II)I:34 - ReplaceComparisonOperator >= -> -1 (result:3673,-3673;)
   * Goal 2. Strong Mutation 18: org.apache.commons.math3.util.MathUtilsNew.copySignInt(II)I:34 - InsertUnaryOp Negation (result:3673,-3673;)
   * Goal 3. Strong Mutation 21: org.apache.commons.math3.util.MathUtilsNew.copySignInt(II)I:34 - ReplaceComparisonOperator >= -> -1 (result:3673,-3673;)
   */

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MathUtilsNew mathUtilsNew0 = new MathUtilsNew();
      int int0 = MathUtilsNew.copySignInt((-3673), (-3673));
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. Strong Mutation 22: org.apache.commons.math3.util.MathUtilsNew.copySignInt(II)I:34 - ReplaceComparisonOperator >= -> == (result:-319,319;)
   * Goal 2. Strong Mutation 35: org.apache.commons.math3.util.MathUtilsNew.copySignInt(II)I:37 - InsertUnaryOp IINC -1 (result:320,319; magnitude:-320,-319;)
   */

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MathUtilsNew mathUtilsNew0 = new MathUtilsNew();
      int int0 = MathUtilsNew.copySignInt((-319), 1160);
  }
}
