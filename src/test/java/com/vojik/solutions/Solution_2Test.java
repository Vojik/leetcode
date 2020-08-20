package com.vojik.solutions;

import com.vojik.helpers.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_2Test {

  @Test
  public void test1_whenSolution1() {
    ListNode firstNode = TestHelper.populateNodes(new int[]{2, 4, 3});
    ListNode secondNode = TestHelper.populateNodes(new int[]{5, 6, 4});
    int[] expectedResult = new int[]{7, 0, 8};

    ListNode actualListNode = Solution_2.solution1(firstNode, secondNode);

    Assertions.assertArrayEquals(expectedResult, TestHelper.fromListNodeToArray(actualListNode));
  }

  @Test
  public void test2_whenSolution1() {
    ListNode firstNode = TestHelper.populateNodes(new int[]{1, 8});
    ListNode secondNode = TestHelper.populateNodes(new int[]{0});
    int[] expectedResult = new int[]{1, 8};

    ListNode actualListNode = Solution_2.solution1(firstNode, secondNode);

    Assertions.assertArrayEquals(expectedResult, TestHelper.fromListNodeToArray(actualListNode));
  }

  @Test
  public void test3_whenSolution1() {
    ListNode firstNode = TestHelper.populateNodes(new int[]{2, 4, 8});
    ListNode secondNode = TestHelper.populateNodes(new int[]{5, 6, 4});
    int[] expectedResult = new int[]{7, 0, 3, 1};

    ListNode actualListNode = Solution_2.solution1(firstNode, secondNode);

    Assertions.assertArrayEquals(expectedResult, TestHelper.fromListNodeToArray(actualListNode));
  }
}