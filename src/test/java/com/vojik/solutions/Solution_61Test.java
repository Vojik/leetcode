package com.vojik.solutions;

import static com.vojik.solutions.TestHelper.fromListNodeToArray;

import com.vojik.helpers.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_61Test {

  @Test
  public void test1_whenSolution1() {
    // given
    Solution_61 solution = new Solution_61();
    ListNode nodes = TestHelper.populateNodes(new int[]{1, 2, 3, 4, 5});
    ListNode expected = TestHelper.populateNodes(new int[]{4, 5, 1, 2, 3});

    // when
    nodes = solution.rotateRight(nodes, 2);

    // then
    Assertions.assertArrayEquals(fromListNodeToArray(expected), fromListNodeToArray(nodes));
  }

  @Test
  public void test2_whenSolution1() {
    Solution_61 solution = new Solution_61();
    ListNode nodes = TestHelper.populateNodes(new int[]{1, 2, 3, 4, 5, 6});
    ListNode expected = TestHelper.populateNodes(new int[]{5, 6, 1, 2, 3, 4});
    nodes = solution.rotateRight(nodes, 2);
    Assertions.assertArrayEquals(fromListNodeToArray(expected), fromListNodeToArray(nodes));
  }

  @Test
  public void test3_whenSolution1() {
    Solution_61 solution = new Solution_61();
    ListNode nodes = TestHelper.populateNodes(new int[]{});
    nodes = solution.rotateRight(nodes, 2);
    Assertions.assertNull(nodes);
  }

  @Test
  public void test4_whenSolution1() {
    Solution_61 solution = new Solution_61();
    ListNode nodes = TestHelper.populateNodes(new int[]{1, 2, 3});
    ListNode expected = TestHelper.populateNodes(new int[]{2, 3, 1});
    nodes = solution.rotateRight(nodes, 2);
    Assertions.assertArrayEquals(fromListNodeToArray(expected), fromListNodeToArray(nodes));
  }
}