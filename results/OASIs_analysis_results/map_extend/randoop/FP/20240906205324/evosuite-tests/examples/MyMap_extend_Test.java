/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 23:53:58 GMT 2024
 */

package examples;

import org.junit.Test;
import static org.junit.Assert.*;
import examples.MyMap;
import java.awt.Dialog;
import java.net.Authenticator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MyMap_extend_Test extends MyMap_extend_Test_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. examples.MyMap.extend(Ljava/lang/Object;Ljava/lang/Object;)I: I235 Branch 30 IFNE L103 - false
   * Goal 2. examples.MyMap.extend(Ljava/lang/Object;Ljava/lang/Object;)I: I238 Branch 31 IF_ICMPGT L103 - true
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Authenticator.RequestorType authenticator_RequestorType0 = Authenticator.RequestorType.PROXY;
      MyMap<Authenticator.RequestorType, Dialog.ModalityType> myMap0 = new MyMap<Authenticator.RequestorType, Dialog.ModalityType>();
      Dialog.ModalityType dialog_ModalityType0 = Dialog.ModalityType.MODELESS;
      int int0 = myMap0.extend(authenticator_RequestorType0, dialog_ModalityType0);
  }
}
