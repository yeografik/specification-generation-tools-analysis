/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 18:13:41 GMT 2024
 */

package examples;

import org.junit.Test;
import static org.junit.Assert.*;
import examples.DoublyLinkedListNode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DoublyLinkedListNode_insertRight_Test extends DoublyLinkedListNode_insertRight_Test_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. examples.DoublyLinkedListNode.insertRight(Lexamples/DoublyLinkedListNode;)V: I576 Branch 76 IFNE L74 - false
   * Goal 2. examples.DoublyLinkedListNode.insertRight(Lexamples/DoublyLinkedListNode;)V: I579 Branch 77 IF_ICMPGT L74 - true
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DoublyLinkedListNode doublyLinkedListNode0 = new DoublyLinkedListNode();
      DoublyLinkedListNode doublyLinkedListNode1 = new DoublyLinkedListNode();
      DoublyLinkedListNode doublyLinkedListNode2 = new DoublyLinkedListNode();
      DoublyLinkedListNode doublyLinkedListNode3 = new DoublyLinkedListNode();
      doublyLinkedListNode3.insertRight(doublyLinkedListNode0);
      doublyLinkedListNode3.insertRight(doublyLinkedListNode1);
      doublyLinkedListNode1.insertRight(doublyLinkedListNode2);
  }
}
