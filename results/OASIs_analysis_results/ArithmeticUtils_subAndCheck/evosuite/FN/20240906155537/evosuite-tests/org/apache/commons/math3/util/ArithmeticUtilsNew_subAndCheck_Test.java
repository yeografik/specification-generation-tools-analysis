/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 18:56:12 GMT 2024
 */

package org.apache.commons.math3.util;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.util.ArithmeticUtilsNew;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArithmeticUtilsNew_subAndCheck_Test extends ArithmeticUtilsNew_subAndCheck_Test_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. Strong Mutation 22: org.apache.commons.math3.util.ArithmeticUtilsNew.subAndCheck(JJ)J:59 - InsertUnaryOp Negation (result:948,-946;)
   * Goal 2. Strong Mutation 23: org.apache.commons.math3.util.ArithmeticUtilsNew.subAndCheck(JJ)J:59 - InsertUnaryOp Negation (result:-948,-946;)
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ArithmeticUtilsNew arithmeticUtilsNew0 = new ArithmeticUtilsNew();
      long long0 = arithmeticUtilsNew0.subAndCheck((-947L), (-1L));
  }

  //Test case number: 1
  /*
   * 6 covered goals:
   * Goal 1. Strong Mutation 15: org.apache.commons.math3.util.ArithmeticUtilsNew.subAndCheck(JJ)J:52 - InsertUnaryOp Negation (result:-9223372036854774236,9223372036854774124;)
   * Goal 2. Strong Mutation 16: org.apache.commons.math3.util.ArithmeticUtilsNew.subAndCheck(JJ)J:52 - InsertUnaryOp Negation (result:9223372036854774236,9223372036854774124;)
   * Goal 3. Strong Mutation 17: org.apache.commons.math3.util.ArithmeticUtilsNew.subAndCheck(JJ)J:52 - ReplaceArithmeticOperator - -> + (result:9223372036854774236,9223372036854774124;)
   * Goal 4. Strong Mutation 18: org.apache.commons.math3.util.ArithmeticUtilsNew.subAndCheck(JJ)J:52 - ReplaceArithmeticOperator - -> % (result:-1628,9223372036854774124;)
   * Goal 5. Strong Mutation 19: org.apache.commons.math3.util.ArithmeticUtilsNew.subAndCheck(JJ)J:52 - ReplaceArithmeticOperator - -> * (result:-91168,9223372036854774124;)
   * Goal 6. Strong Mutation 20: org.apache.commons.math3.util.ArithmeticUtilsNew.subAndCheck(JJ)J:52 - ReplaceArithmeticOperator - -> / (result:0,9223372036854774124;)
   */

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArithmeticUtilsNew arithmeticUtilsNew0 = new ArithmeticUtilsNew();
      long long0 = arithmeticUtilsNew0.subAndCheck((-1628L), (-9223372036854775752L));
  }
}
