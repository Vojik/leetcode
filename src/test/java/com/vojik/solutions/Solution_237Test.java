package com.vojik.solutions;

import static com.vojik.solutions.TestHelper.fromListNodeToArray;

import com.vojik.helpers.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_237Test {

  @Test
  public void test1_whenSolution1() {
    // given
    Solution_237 solution = new Solution_237();
    ListNode nodes = TestHelper.populateNodes(new int[]{4, 5, 1, 9});
    ListNode expected = TestHelper.populateNodes(new int[]{5, 1, 9});

    // when
    solution.deleteNode(nodes);

    // then
    Assertions.assertArrayEquals(fromListNodeToArray(expected), fromListNodeToArray(nodes));
  }

  @Test
  public void test2_whenSolution1() {
    // given
    Solution_237 solution = new Solution_237();
    ListNode nodes = TestHelper.populateNodes(new int[]{1, 9});
    ListNode expected = TestHelper.populateNodes(new int[]{9});

    // when
    solution.deleteNode(nodes);

    // then
    Assertions.assertArrayEquals(fromListNodeToArray(expected), fromListNodeToArray(nodes));
  }

  @Test
  public void test3_whenSolution1() {
    // given
    Solution_237 solution = new Solution_237();
    ListNode nodes = TestHelper.populateNodes(new int[]{4, 5, 1, 9, 150, 10, 99});
    ListNode expected = TestHelper.populateNodes(new int[]{5, 1, 9, 150, 10, 99});

    // when
    solution.deleteNode(nodes);

    // then
    Assertions.assertArrayEquals(fromListNodeToArray(expected), fromListNodeToArray(nodes));
  }
}