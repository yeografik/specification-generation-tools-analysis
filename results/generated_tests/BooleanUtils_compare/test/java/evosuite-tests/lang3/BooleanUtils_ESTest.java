/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 22:22:37 GMT 2023
 */

package lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import lang3.BooleanUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BooleanUtils_ESTest extends BooleanUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
      int int0 = booleanUtils0.compare(false, true);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
      int int0 = booleanUtils0.compare(false, false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
      int int0 = booleanUtils0.compare(true, false);
      assertEquals(1, int0);
  }
}
