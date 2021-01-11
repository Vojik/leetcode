package com.vojik.solutions;

import com.vojik.helpers.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution_24Test {

  @Test
  public void test1_whenSolution1() {
    ListNode input = TestHelper.populateNodes(new int[]{1, 2, 3, 4});
    int[] expectedResult = new int[]{2, 1, 4, 3};
    ListNode actualListNode = new Solution_24().swapPairs(input);
    Assertions.assertArrayEquals(expectedResult, TestHelper.fromListNodeToArray(actualListNode));
  }


  @Test
  public void test2_whenSolution1() {
    ListNode input = TestHelper.populateNodes(new int[]{1, 2, 3, 4, 5, 6});
    int[] expectedResult = new int[]{2, 1, 4, 3, 6, 5};
    ListNode actualListNode = new Solution_24().swapPairs(input);
    Assertions.assertArrayEquals(expectedResult, TestHelper.fromListNodeToArray(actualListNode));
  }

  @Test
  public void test3_whenSolution1() {
    ListNode input = TestHelper.populateNodes(new int[]{1, 2, 3, 4, 5, 6, 7});
    int[] expectedResult = new int[]{2, 1, 4, 3, 6, 5, 7};
    ListNode actualListNode = new Solution_24().swapPairs(input);
    Assertions.assertArrayEquals(expectedResult, TestHelper.fromListNodeToArray(actualListNode));
  }

  @Test
  public void test1_whenSolution2() {
    ListNode input = TestHelper.populateNodes(new int[]{1, 2, 3, 4});
    int[] expectedResult = new int[]{2, 1, 4, 3};
    ListNode actualListNode = new Solution_24().swapPairs2(input);
    Assertions.assertArrayEquals(expectedResult, TestHelper.fromListNodeToArray(actualListNode));
  }


  @Test
  public void test2_whenSolution2() {
    ListNode input = TestHelper.populateNodes(new int[]{1, 2, 3, 4, 5, 6});
    int[] expectedResult = new int[]{2, 1, 4, 3, 6, 5};
    ListNode actualListNode = new Solution_24().swapPairs2(input);
    Assertions.assertArrayEquals(expectedResult, TestHelper.fromListNodeToArray(actualListNode));
  }

  @Test
  public void test3_whenSolution2() {
    ListNode input = TestHelper.populateNodes(new int[]{1, 2, 3, 4, 5, 6, 7});
    int[] expectedResult = new int[]{2, 1, 4, 3, 6, 5, 7};
    ListNode actualListNode = new Solution_24().swapPairs2(input);
    Assertions.assertArrayEquals(expectedResult, TestHelper.fromListNodeToArray(actualListNode));
  }
}