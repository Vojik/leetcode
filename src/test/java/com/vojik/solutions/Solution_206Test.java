package com.vojik.solutions;

import static com.vojik.solutions.TestHelper.fromListNodeToArray;

import com.vojik.helpers.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_206Test {

  @Test
  public void test1_whenSolution1() {
    // given
    Solution_206 solution = new Solution_206();
    ListNode nodes = TestHelper.populateNodes(new int[]{1, 2, 3, 4, 5});
    ListNode expected = TestHelper.populateNodes(new int[]{5, 4, 3, 2, 1});

    // when
    nodes = solution.reverseList(nodes);

    // then
    Assertions.assertArrayEquals(fromListNodeToArray(expected), fromListNodeToArray(nodes));
  }

  @Test
  public void test1_whenSolution2() {
    // given
    Solution_206 solution = new Solution_206();
    ListNode nodes = TestHelper.populateNodes(new int[]{1, 2, 3, 4, 5});
    ListNode expected = TestHelper.populateNodes(new int[]{5, 4, 3, 2, 1});

    // when
    nodes = solution.reverseListRecursively(nodes);

    // then
    Assertions.assertArrayEquals(fromListNodeToArray(expected), fromListNodeToArray(nodes));
  }
}